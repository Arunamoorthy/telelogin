# Locate360 Telecaller Panel - Login Automation

## Office-style framework
- Java 17
- Maven
- Selenium WebDriver
- Cucumber BDD
- Page Object Model (POM)
- JUnit 4 Runner
- HTML + JSON Cucumber reports

## Project structure
src/test/java/com/locate360/base/BaseClass.java
src/test/java/com/locate360/pages/LoginPage.java
src/test/java/com/locate360/stepdefinitions/LoginSteps.java
src/test/java/com/locate360/runners/TestRunner.java
src/test/resources/features/Login.feature

## Eclipse import
File > Import > Maven > Existing Maven Projects > select this project folder > Finish.

## Before running
1. Install Java 17+, Maven, Google Chrome, and Eclipse.
2. In Login.feature replace YOUR_VALID_EMAIL and YOUR_VALID_PASSWORD with authorized test credentials.
3. Do not commit real credentials to source control.

## Run
Right-click TestRunner.java > Run As > JUnit Test
or run: mvn test

## Report
After execution open target/cucumber-report.html.

## Locator note
Locators were prepared from the supplied screenshot. If the deployed page DOM uses different attributes, update LoginPage.java after inspecting the live elements.
