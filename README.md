# Market-place
# EXTREME IT PRODUCTS

## Object-Oriented Programming Application

**Module:** COM 1321 – Object-Oriented Programming
**Assessment:** Assignment 1
**Student Name:** Ratshikombo Luvhani Sharon
**Student Number:** 23020613
**University:** University of Venda
**Year:** 2026
**Due Date:** 31 August 2026

---

## 1. Introduction

This project is a Java-based product management application developed for **Extreme IT Products**, a local supplier of Information Technology hardware devices.

The purpose of the application is to provide the business with a simple system for managing its products. The application allows users to capture, search, update and delete products, as well as generate a product report.

The application was developed using **Java and Object-Oriented Programming principles**.

---

## 2. Objectives

The main objectives of the application are to:

* Capture and store product information.
* Allow users to search for products using a product code.
* Allow users to delete existing products.
* Allow users to update product warranty, price and stock level.
* Display a report containing stored product information.
* Provide a simple menu-driven interface.
* Allow the user to exit the application safely.

These requirements are based on the assignment specification provided for COM 1321.

---

## 3. System Requirements

The application provides the following menu options:

1. Capture a new product
2. Search for a product
3. Delete a product
4. Update a product
5. View product report
6. Exit application

The application stores product information in memory using an `ArrayList`.

---

## 4. Product Information

Each product contains the following information:

* Product Code
* Product Name
* Product Category
* Product Price
* Stock Level
* Warranty

The available product categories are:

* Desktop Computer
* Laptop
* Tablet
* Printer
* Gaming Console

If an invalid category is selected, the application asks the user to enter a valid category.

The warranty options are:

* `1` – Six-month warranty
* Any other key – Two-year warranty

These category and warranty requirements are specified in the assignment.

---

## 5. Classes Used

The application consists of three main Java classes:

### 5.1 Main Class

The `Main` class is responsible for starting the application.

It creates an instance of the `Products` class and calls the `DisplayMenu()` method.

### 5.2 Products Class

The `Products` class contains the main functionality of the application.

The class contains methods for:

* `DisplayMenu()`
* `CaptureProduct()`
* `SearchProduct()`
* `DeleteProduct()`
* `UpdateProduct()`
* `DisplayReport()`
* `ExitApplication()`

The assignment specifically requires the `Products` class to contain the main working methods.

### 5.3 ReportData Class

The `ReportData` class represents the information stored for each product.

It contains private variables and corresponding getter and setter methods.

The class promotes encapsulation by controlling access to the product information through methods.

---

## 6. Capturing a Product

When the user selects **Capture a new product**, the application requests the product information.

The user enters:

1. Product code
2. Product name
3. Product category
4. Product price
5. Stock level
6. Warranty option

After all information has been entered, the product is stored in the `ArrayList`.

The application then informs the user that the product details have been successfully saved.

---

## 7. Searching for a Product

The search functionality allows the user to enter a product code.

The application searches through the stored products and compares the entered code with the product codes in the `ArrayList`.

If a matching product is found, its details are displayed.

If no matching product is found, the application displays an error message informing the user that the product cannot be located.

---

## 8. Deleting a Product

The delete function first asks the user to enter the product code.

The application searches for the product.

If the product exists, its details are displayed and the user is asked to confirm the deletion.

If the user confirms, the product is removed from the `ArrayList`.

This provides an additional confirmation step before permanently removing the product from the application's current memory.

---

## 9. Updating a Product

The update function allows the user to modify selected product information.

The user first enters the product code.

The application then allows the following information to be updated:

* Product warranty
* Product price
* Product stock level

These are the specific update options required by the assignment.

---

## 10. Product Report

The report functionality displays the products currently stored in the application's `ArrayList`.

The report includes information such as:

* Product code
* Product name
* Category
* Price
* Stock level
* Warranty

The assignment requires a `ReportData` class containing getter and setter methods for the information required in the report.

---

## 11. Object-Oriented Programming Concepts

### Encapsulation

Encapsulation is demonstrated through the `ReportData` class.

The product variables are declared as private and are accessed using getter and setter methods.

### Classes and Objects

The application uses different classes to separate responsibilities.

Objects are created from these classes to allow the application to perform its required operations.

### Methods

Methods are used to organise the application's functionality.

For example:

* `CaptureProduct()` handles product registration.
* `SearchProduct()` handles product searches.
* `DeleteProduct()` handles deletion.
* `UpdateProduct()` handles modifications.
* `DisplayMenu()` handles the main menu.

### ArrayList

An `ArrayList` is used to store multiple product objects in memory.

This makes it possible for the application to store and manage multiple products while it is running.

---

## 12. Input Validation

The application performs validation for product categories.

The user must select one of the five valid categories.

If an invalid option is entered, the application displays an error message and requests another selection.

This satisfies the requirement that an incorrect product category selection must result in the user being prompted to enter a valid category.

---

## 13. Error Handling

The application handles situations where a product cannot be found.

For example, when searching, deleting or updating a product, the application checks whether the product code exists.

If the product does not exist, the user is informed that the product cannot be located.

---

## 14. Program Flow

The general application flow is:

**Start Application**

↓

**Display Menu**

↓

**User Selects an Option**

↓

**Capture / Search / Delete / Update / Report**

↓

**Return to Menu**

↓

**User Selects Exit**

↓

**End Application**

---

## 15. GitHub Repository

The project must be stored in a GitHub repository created specifically for this assignment.

The repository should contain:

* Java source code
* `Main.java`
* `Products.java`
* `ReportData.java`
* Project documentation
* Any other required project files

The assignment requires the GitHub repository link to be submitted through Moodle and states that the lecturer must have permission to access the repository.

**GitHub Repository Link:**

---

---

## 16. Testing

The application should be tested before submission.

### Test 1: Capture Product

**Input:** Valid product information
**Expected Result:** Product is successfully stored.

### Test 2: Invalid Category

**Input:** Invalid category number
**Expected Result:** User is prompted to select a valid category.

### Test 3: Search Existing Product

**Input:** Existing product code
**Expected Result:** Product details are displayed.

### Test 4: Search Invalid Product

**Input:** Product code that does not exist
**Expected Result:** Product cannot be located message is displayed.

### Test 5: Delete Product

**Input:** Existing product code and confirmation
**Expected Result:** Product is removed.

### Test 6: Update Product

**Input:** Existing product code and new information
**Expected Result:** Selected product information is updated.

### Test 7: Generate Report

**Input:** Select report option
**Expected Result:** Stored products are displayed.

### Test 8: Exit

**Input:** Select exit option
**Expected Result:** Application closes.

---

## 17. Conclusion

The Extreme IT Products application provides a basic Java-based solution for managing IT hardware products.

The application demonstrates important Object-Oriented Programming concepts, including classes, objects, encapsulation, methods and collection management.

The system provides the functionality required by the assignment, including capturing, searching, deleting, updating and reporting on products, as well as providing an option to exit the application.

Before submission, the application should be compiled and tested to ensure that all functionality works correctly. The assignment also requires the student to be able to explain the logic, design decisions and implementation of the solution.
