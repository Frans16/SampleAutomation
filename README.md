# Overview

This project aims to automate software testing using Selenium, Cucumber, and the Java programming language for the Souce Demo website. Selenium is used to automate interactions with the web application, while Cucumber is used to write test scenarios in a human-readable language.

## Project Components

1. **Selenium WebDriver**: For automating web application testing.
2. **Cucumber**: For writing test scenarios in the Gherkin language.
3. **Java**: The primary programming language for developing test scripts.
4. **Maven**: For dependency management and project building.
5. **JUnit**: Unit testing framework for Java software development.

# Installation Guide

## Prerequisites

Before installing the components of this project, ensure that you have the following prerequisites installed on your system:

1. **Java Development Kit (JDK)**: Make sure you have JDK installed on your system. You can download and install JDK from the official Oracle website: [Download JDK](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)

2. **Maven**: Maven is required for dependency management and building the project. You can download and install Maven from the official Apache Maven website: [Download Maven](https://maven.apache.org/download.cgi)

## Installing Selenium WebDriver

Selenium WebDriver is used for automating web application testing.

```bash
# Use Maven to install Selenium WebDriver
mvn dependency:resolve -DgroupId=org.seleniumhq.selenium -DartifactId=selenium-java -Dversion=<desired_version> -Dpackaging=jar
```

## Running Project

This project is run using Maven

```bash
mvn clean #This command cleans the project, removing all files generated by the previous build.
mvn test #This command runs the tests in the project.
```

# Project Structure

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.
```bash
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           ├── actions
│   │           │   ├── CheckoutAction.java
│   │           │   └── LoginAction.java
│   │           ├── locators
│   │           │   ├── Checkout.java
│   │           │   └── Login.java
│   │           └── utils
│   │               ├── CustomKeywords.java
│   │               └── HelperClass.java
│   └── test
│       ├── java
│       │   └── com
│       │       ├── runner
│       │       │   └── Runner.java
│       │       └── stepDefinitions
│       │           ├── Glue.java
│       │           └── Hook.java
│       └── resources
│           └── soucedemo.feature
└── target
    ├── classes
    │   ├── META-INF
    │   │   ├── MANIFEST.MF
    │   │   └── maven
    │   │       └── Automation
    │   │           └── SouceDemo
    │   │               ├── pom.properties
    │   │               └── pom.xml
    │   └── com
    │       ├── actions
    │       │   ├── CheckoutAction.class
    │       │   └── LoginAction.class
    │       ├── locators
    │       │   ├── Checkout.class
    │       │   └── Login.class
    │       └── utils
    │           ├── CustomKeywords.class
    │           └── HelperClass.class
    ├── cucumber-reports
    │   ├── cucumber.html
    │   └── cucumber.json
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    ├── maven-status
    │   └── maven-compiler-plugin
    │       ├── compile
    │       │   └── default-compile
    │       │       ├── createdFiles.lst
    │       │       └── inputFiles.lst
    │       └── testCompile
    │           └── default-testCompile
    │               ├── createdFiles.lst
    │               └── inputFiles.lst
    ├── surefire-reports
    │   ├── TEST-com.runner.Runner.xml
    │   └── com.runner.Runner.txt
    └── test-classes
        ├── com
        │   ├── runner
        │   │   └── Runner.class
        │   └── stepDefinitions
        │       ├── Glue.class
        │       └── Hook.class
        └── soucedemo.feature

```

Please make sure to update tests as appropriate.

# Usage
1. **Prerequisites**: Ensure JDK and Maven are installed on your system.
2. **Clone Repository**: Clone this project repository to your development machine.
3. **Configuration**: Adjust configurations and specify the location of required test files.
4. **Running Tests**: Use Maven to execute Cucumber test scenarios. Example: mvn test.
5. **Analyzing Results**: Check the test output to view results and reports.
6. **Developing New Tests**: Add or modify test scenarios in the features folder as needed.
7. **Developing Implementations**: Implement new test steps in the steps folder.