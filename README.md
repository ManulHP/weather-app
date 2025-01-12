# Weather App
This project is an weather application built using Kotlin and Jetpack Compose. It follows the Clean Architecture principles and integrates the OpenWeatherMap API to fetch real-time weather data. Dependency Injection is 
managed using Hilt, and Retrofit is used for network calls.

## Features
- Displays current weather details
- Search for a location to get weather details
- Follows Clean Architecture for maintainable and scalable code
- Uses state management to handle loading, success, and error states
- Modularized project structure for separation of concerns

## Project Structure
- Data
   - model: Contains the data classes mapping the response from the API
   - repository: Fetches weather data and converts it to the model
   - datasource: Contains the Retrofit interface with the endpoint

- Domain
  - repository: Abstracts the data access
  - usecase: Retrieves and processes weather data from the repository

- Presentation
  - Contains the UI component of the application
  - viewmodel: Handles the state and data retrieval

- Di
  - Dpendencies using Hilt

- Core
  - Containers the error component, themes, shimmer and the constant variable of the application
