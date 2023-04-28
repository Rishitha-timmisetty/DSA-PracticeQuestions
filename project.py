# Import necessary libraries
import pandas as pd
import numpy as np
from sklearn.feature_extraction.text import CountVectorizer
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression

# Read in the training data
train_df = pd.read_csv('train_data.csv')

# Preprocess the text features
vectorizer = CountVectorizer(stop_words='english')
X_train_title = vectorizer.fit_transform(train_df['TITLE'].fillna('').values.astype('U'))
X_train_description = vectorizer.fit_transform(train_df['DESCRIPTION'].fillna('').values.astype('U'))
X_train_bullet_points = vectorizer.fit_transform(train_df['BULLET_POINTS'].fillna('').values.astype('U'))

# Concatenate the text and product_type_id features
X_train_final = np.hstack((X_train_title.toarray(), X_train_description.toarray(), X_train_bullet_points.toarray(), np.array(train_df['PRODUCT_TYPE_ID']).reshape(-1, 1)))

# Define the target variable
y_train = train_df['PRODUCT_LENGTH']

# Train the machine learning model
model = LinearRegression()
model.fit(X_train_final, y_train)

# Read in the test data
test_df = pd.read_csv('test_data.csv')

# Preprocess the text features
X_test_title = vectorizer.transform(test_df['TITLE'].fillna('').values.astype('U'))
X_test_description = vectorizer.transform(test_df['DESCRIPTION'].fillna('').values.astype('U'))
X_test_bullet_points = vectorizer.transform(test_df['BULLET_POINTS'].fillna('').values.astype('U'))

# Concatenate the text and product_type_id features
X_test_final = np.hstack((X_test_title.toarray(), X_test_description.toarray(), X_test_bullet_points.toarray(), np.array(test_df['PRODUCT_TYPE_ID']).reshape(-1, 1)))

# Make predictions on the test set
y_pred = model.predict(X_test_final)

# Write the predictions to a CSV file
output_df = pd.DataFrame({'PRODUCT_ID': test_df['PRODUCT_ID'], 'PRODUCT_LENGTH': y_pred})
output_df.to_csv('output.csv', index=False)