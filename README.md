# Simplified Intelligent Home System

## Overview

This project implements a simplified intelligent home system that allows users to manage various home services like lights, TV, and air conditioning through a unified interface. The design employs the facade pattern to abstract the complexities of each service, providing a seamless user experience.

## Features

- Control lights, TV, and air conditioning from a single interface.
- Easily turn on or off all services at once.
- Simple and intuitive class structure.

## Class Definitions

### 1. HomeService (Interface)
Defines the common interface for all home services.

### 2. Light
Implements the `HomeService` interface for managing lights.

### 3. TV
Implements the `HomeService` interface for managing the TV.

### 4. AirConditioning
Implements the `HomeService` interface for managing air conditioning.

### 5. HomeInterface
The facade class that coordinates interactions between the `HomeApp` and individual home services.

### 6. HomeApp
The client class that uses the `HomeInterface` to access and utilize home services seamlessly.

## Usage

To run the application, simply execute the `HomeApp` class. It will demonstrate turning on and off all services.

```java
public class HomeApp {
    public static void main(String[] args) {
        TV tv = new TV();
        AirConditioning airConditioning = new AirConditioning();
        Light light = new Light(); // Create Light service instance
        HomeInterface homeInterface = new HomeInterface(tv, airConditioning, light);

        homeInterface.turnOnAll();
        System.out.println("-----------------------------");
        homeInterface.turnOffAll();
    }
}
