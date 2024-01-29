# E-commerce Application

This is a simple e-commerce application that provides functionality for managing a shopping cart and processing orders.

## Cart API

### CartController

The CartController is responsible for handling operations related to the shopping cart in the e-commerce application.

#### Endpoints

##### Add Item to Cart

- Endpoint: `/cart/add`
- Method: POST
- Functionality: Adds an item to the shopping cart.
- Request Body:
  {
    "name": "ExampleItem",
    "price": 19.99
  }

##### Get Cart

- Endpoint: `/cart/get`
- Method: GET
- Functionality: Retrieves the current items in the shopping cart.

#### Usage

Make requests to the provided endpoints to manage the shopping cart.

#### CartService

The CartService provides business logic for managing the shopping cart in the e-commerce application.

##### Methods

###### addItemToCart(String itemName, double price)

- Functionality: Adds an item to the shopping cart.
- Parameters:
  - itemName: Name of the item to be added.
  - price: Price of the item to be added.

###### getCart()

- Functionality: Retrieves the current items in the shopping cart.
- Returns: A Map representing the items in the cart.

###### clearCart()

- Functionality: Clears all items from the shopping cart.

##### Usage

Call the provided methods to manage the shopping cart.

---

## Order API

### OrderController

The OrderController is responsible for handling operations related to orders in the e-commerce application.

#### Endpoints

##### Checkout

- Endpoint: `/order/checkout`
- Method: POST
- Functionality: Initiates the checkout process, creating an order based on the provided cart information.
- Request Body:
  {
    "ExampleItem1": 19.99,
    "ExampleItem2": 29.99
  }

##### Get Orders

- Endpoint: `/order/list`
- Method: GET
- Functionality: Retrieves a list of all orders.

##### Get Discount Codes

- Endpoint: `/order/discount-codes`
- Method: GET
- Functionality: Retrieves a list of available discount codes.

#### Usage

Make requests to the provided endpoints to manage orders.

#### OrderService

The OrderService provides business logic for handling order-related operations in the e-commerce application.

##### Methods

###### checkout(Map<String, Double> cart)

- Functionality: Processes the checkout, creating an order based on the provided cart information.
- Parameters:
  - cart: A Map representing the items in the cart.

###### getOrders()

- Functionality: Retrieves a list of all orders.
- Returns: A List<Order> containing information about all orders.

###### getDiscountCodes()

- Functionality: Retrieves a list of available discount codes.
- Returns: A List<String> containing available discount codes.

##### Usage

Call the provided methods to manage orders.

---

## CORS Configuration

The CORS configuration allows cross-origin requests from a specific frontend URL (http://localhost:4200).

### CORSConfig

The CORSConfig class in the com.assessment.ecommerce package provides CORS configuration for the application.

#### Configuration

- Allowed Origins: http://localhost:4200
- Allowed Methods: GET, POST, PUT, DELETE
- Allowed Headers: *

#### Usage

1. Run the application.
2. Frontend applications running at http://localhost:4200 are allowed to make cross-origin requests.

---

## Swagger Documentation

The Swagger documentation provides an interactive API documentation for the application. To access Swagger UI, navigate to:

- Swagger UI: http://localhost:8080/swagger-ui.html
- Swagger JSON: http://localhost:8080/v2/api-docs

---

## Test Cases

Test cases have been added to ensure the correctness of the application's functionality. The tests cover scenarios for cart management, order processing, and CORS configuration.

### Running Tests

To run the tests, use the following command:

./mvnw test

## Contributors

- Abhishek Yadav

Feel free to contribute by raising issues or submitting pull requests!
