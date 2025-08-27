# INDIVIDUAL ASSIGNMENT

## Topic: Abstraction - Payment Gateway (JAVA)

## Roll no : 112201016

## Name : Loganath M

## File Structure
```tree
112201016_Assignment
├── PaymentGateway
│ └── pom.xml
├── Transaction
│ └── pom.xml
└── pom.xml
```
## Modules present
1. Transaction - a Higher level module whihc exists only to call the lower level modules and their functionalities to give a breif idea on what abstraction is
2. PaymentGateway - The main lower level module which consists of all the required interface and their derived classes. It also has tests written for each of these class.

## Commands to run the java project
```bash

# Commands to compile and run the tests

mvn clean compile
mvn checkstyle:check
mvn test

```

```bash

#Command to clean the project

mvn clean
```
