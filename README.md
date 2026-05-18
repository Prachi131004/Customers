# Customer Management REST API

A simple Spring Boot REST API for managing customer orders. This project allows users to create, retrieve, update, and delete customer records using REST endpoints.

## Features

- Create a customer order
- Get all customers
- Get customer by ID
- Update customer details
- Delete customer order
- RESTful API using Spring Boot
- JPA/Hibernate for database operations

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL 
- Maven

## Project Structure

```text
src/main/java/com/work/Customers
│── controller
│   └── CustomerController.java
│
│── model
│   └── Customer.java
│
|── repository
|   └── CustomerRepository
|
│── service
│   └── CustomerService.java
```

## Customer Model

The `Customer` entity contains the following fields:

| Field       | Type   | Description |
|------------|--------|-------------|
| id         | Long   | Unique customer ID |
| name       | String | Customer name |
| email      | String | Customer email |
| orderDish  | String | Ordered dish name |

## API Endpoints

### 1. Create Customer

**POST** `/customer`

Request Body:

```json
{
  "name": "Rahul",
  "email": "rahul@gmail.com",
  "orderDish": "Pizza"
}
```

Response:

```json
{
  "id": 1,
  "name": "Rahul",
  "email": "rahul@gmail.com",
  "orderDish": "Pizza"
}
```

---

### 2. Get All Customers

**GET** `/customer`

Response:

```json
[
  {
    "id": 1,
    "name": "Rahul",
    "email": "rahul@gmail.com",
    "orderDish": "Pizza"
  }
]
```

---

### 3. Get Customer By ID

**GET** `/customer/{id}`

Example:

```http
GET /customer/1
```

---

### 4. Update Customer

**PUT** `/customer/{id}`

Request Body:

```json
{
  "name": "Rahul Sharma",
  "email": "rahul123@gmail.com",
  "orderDish": "Burger"
}
```

---

### 5. Delete Customer

**DELETE** `/customer/{id}`

Response:

```text
Order Deleted Successfully
```

## Testing API

You can test APIs using:

- Postman
- Browser (for GET requests)

## Future Improvements

- Add validation
- Exception handling
- Swagger API documentation
- Authentication & authorization

## Author

Prachi Prajapati
