# Android Room Database Example

This project demonstrates how to implement a Room database in an Android application. Room is a powerful SQLite object mapping library that allows you to work with databases more easily by providing a layer of abstraction over SQLite. The application showcases a simple user interface where users can enter their first name and last name, and save this data to a local SQLite database. The database operations are performed in the background using 'AsyncTask' to ensure the main UI thread remains responsive.

# Features

<ul>
  <li><b>EditText for User Input:</b> Two EditText fields are provided for the user to input their first name and last name. </li>
  <li><b>Insert Button:</b> A Button triggers the insertion of user data into the Room database.</li>
  <li><b>Room Database:</b> The app uses Room to manage database creation and interactions. </li>
  <li><b>Background Operations:</b> Database operations are performed in the background using AsyncTask to avoid blocking the main UI thread.</li>
</ul>
