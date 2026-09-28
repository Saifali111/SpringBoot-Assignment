# Inventory Management System

A basic Spring Boot REST API to manage inventory items to perform CRUD operations like create, read and delete.

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL

## Setup Instructions
1. Clone the repo
2. Create a MySQL database: "CREATE DATABASE inventory;"
3. Set the username and password of your MySQL Database
4. Run the app

## API Endpoints
1. POST("/items") : Takes a request body to create item. 
2. GET("/items") : Return the list of items saved in the database.
3. GET("/items/{id}") : Return the specific item from the database.
4. DELETE("/items/delete/{id}") : Delete the specific item from the database.

## Example
1. Request: `POST /items`
   {
   "name": "Apple watch series 12",
   "quantity": 10,
   "price": 400
   }
Response:  `201 Created`
{ "id": 1, "name": "Apple watch series 12", "quantity": 10, "price": 400 }
