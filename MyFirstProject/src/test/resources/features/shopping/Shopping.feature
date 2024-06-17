// Feature: Shopping on the bigshop.md

As a customer
I want to use the website bigshop.md
So that I can navigate,search and make purchases.

// Scenario :Product search
//  Given the homepage is open
//  When  the user enters "piscina" in the search bar
//  Then  the user should see a list of products related to "piscina"

// Scenario :Add product to favorites
// Given the website is on product page
// When  the user clicks on the heart
// Then  the "Favorite" is updated by 1

// Scenario Outline: Add product to cart
// Given the website is on product page
// When the user add <product> to cart
// Then  the cart counter is updated by 1

// Examples:
//  | product |

// Scenario: Product details display
//   Given the user search for "piscina"
//   When  the user click on the product
//  Then  a page with product details will open

// Scenario: Placing an order
//  Given the user has products in the shopping cart
// When  the user click the button "Finalizeaza comanda"
// Then  the user should be taken to the checkout page

// Scenario Outline: Login to website
// Given the app login page is open
// When the user enters correct <Adresa de E-mail> and <parola>
//Then the user is logged in

// Examples:
//   | Adresa de E-mail                 | parola     |
//  | anyalukyanova1@gmail.com         | Anna1234 |