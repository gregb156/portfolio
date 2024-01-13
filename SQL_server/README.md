# Client-Server Application with MySQL and APIs

This repository contains the implementation and documentation of a client-server application developed as part of our coursework. The project focuses on creating a robust application architecture using MySQL for database management and APIs for data interaction. Key features include:

- Implementation of SQL stored commands for efficient database operations.
- Design and development of APIs adhering to best practices for usability and security.
- Detailed error handling and access restriction mechanisms to ensure data integrity and security.
- Automated testing using Postman to validate functionality and performance.

The project demonstrates a comprehensive approach to application development, emphasizing secure, efficient, and user-friendly data management.




# Installation
To install this project, follow these steps:

1. Clone this repository to your local machine by running

```
git clone https://github.com/kzaiets/college_database_group.git
```

2. Navigate to the root directory of the project in your terminal.
3. Install all the required dependencies by running

```
npm install
```
# Using the Server
## Set up .env document
Create a .env file in the same place as the server.js file and use the below template to replace with login details for your database server. The port and host provided will be the port you want to run the server on.

```
DATABASE_HOST = "localhost"
DATABASE_USER = "root"
DATABASE_PASSWORD = "password"
DATABASE = "mydb"
PORT = 3000
```

## Running the server
If you want to start the server, navigate to the folder containing the files and run

```
npm start
```

# Testing the application via Postman
## API endpoints
API for student enrolling to course
```
/enrol/:userid/:courseid
```
API for students to view available courses
```
/courses/:userid
```
API for admins to make courses available/unavailable

course_available should be "enable" or "disable"
```
/courseavail/:userid/:courseid/:course_available
```
API for admins assigning teachers to courses
```
/assignteacher/:userid/:courseid/:teacherid
```
API for teachers to fail or pass a student

markgiven should be "pass" or "fail"
```
/mark/:userid/:courseid/:studentid/:markgiven
```
