# Spring Boot Banking API
Spring Boot REST API for banking operations including account creation, deposit, withdrawal, and fund transfer.
A simple **Banking Backend REST API** built using **Spring Boot, Spring Data JPA, and MySQL**.
This application allows users to create bank accounts, deposit money, withdraw money, and transfer funds between accounts.

---

# Features

* Create Bank Account
* Get All Accounts
* Deposit Money
* Withdraw Money
* Transfer Money Between Accounts

---

# Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* REST APIs
* Postman (API Testing)

---

# API Endpoints

| Method | Endpoint                  | Description                     |
| ------ | ------------------------- | ------------------------------- |
| POST   | `/accounts`               | Create a new account            |
| GET    | `/accounts`               | Get all accounts                |
| POST   | `/accounts/{id}/deposit`  | Deposit money into an account   |
| POST   | `/accounts/{id}/withdraw` | Withdraw money from an account  |
| POST   | `/accounts/transfer`      | Transfer money between accounts |

---

# API Request Examples

## Create Account

POST `/accounts`

Request Body

```json
{
  "accountHolderName": "Shilpa",
  "balance": 5000
}
```

---

## Deposit Money

POST `/accounts/{id}/deposit`

Example

```
POST /accounts/1/deposit
```

Request Body

```json
{
  "amount": 2000
}
```

---

## Withdraw Money

POST `/accounts/{id}/withdraw`

Example

```
POST /accounts/1/withdraw
```

Request Body

```json
{
  "amount": 1000
}
```

---

## Transfer Money

POST `/accounts/transfer`

Request Body

```json
{
  "fromAccountId": 1,
  "toAccountId": 2,
  "amount": 2000
}
```

---

# Project Structure

```
controller  → REST API endpoints
service     → Business logic
repository  → Database operations
entity      → Database models
dto         → Request objects
```

---

# How to Run the Project

1. Clone the repository

```
git clone https://github.com/ShilpaAM2231/spring-boot-banking-api.git
```

2. Configure MySQL in `application.properties`

3. Run the application

```
mvn spring-boot:run
```

4. Test APIs using **Postman**

---

# Author

Shilpa Malladi
