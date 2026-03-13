# Banking System API (Spring Boot)

A simple banking backend application built using Spring Boot and MySQL.

## Features

- Create Account
- Get All Accounts
- Deposit Money
- Withdraw Money
- Transfer Money between accounts

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST APIs
- Postman for API testing

## API Endpoints

Create Account  
POST /accounts

Get All Accounts  
GET /accounts

Deposit Money  
POST /accounts/{id}/deposit

Withdraw Money  
POST /accounts/{id}/withdraw

Transfer Money  
POST /accounts/transfer

## Example Transfer Request

```json
{
 "fromAccountId":1,
 "toAccountId":2,
 "amount":2000
}
```

## Project Structure

controller → REST APIs  
service → Business logic  
repository → Database access  
entity → Database models  
dto → Request objects
