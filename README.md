# 🪙 Coin Count🪙 - Learning With ME

## Overview

This is a simple Spring Boot REST API project that demonstrates core Java/Spring concepts. As a graduate learning Java development, this showcases my understanding of:

- Spring Boot project setup
- REST controller implementation
- Basic Spring annotations
- Standard project structure

## Project Structure

com.coincount/
├── controller/
│ └── RecordController.java
├── model/
│ └── Record.java
└── CoinCountApplication.java

## Key Components

### 1. RecordController (`com.coincount.controller`)

Handles HTTP requests and responses.

```
@RestController
@RequestMapping("/api/records")
public class RecordController {

    @GetMapping
    public String getAllRecords() {
        return "Here are all the records";
    }
}
```

### What I Learned:

@RestController combines @Controller and @ResponseBody

@RequestMapping sets the base URL path

@GetMapping handles HTTP GET requests

Method return values are automatically converted to JSON/HTTP response

### Example Usage:

```
curl http://localhost:8080/api/records
```

### Response:

```
Here are all the records
```

## 2. CoinCountApplication (com.coincount)

The Spring Boot entry point.

```
@SpringBootApplication
public class CoinCountApplication {
public static void main(String[] args) {
SpringApplication.run(CoinCountApplication.class, args);
}
}
```

### What I Learned:

@SpringBootApplication enables auto-configuration

Main class starts the embedded Tomcat server

Spring handles dependency injection automatically

## 3. Record Model (com.coincount.model)

Currently a placeholder for future development.

```
public class Record {
    // Model attributes will be added later
}

```
