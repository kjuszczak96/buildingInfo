# Building Info

Application for building administrators who want to optimize the costs of building management. It allows obtaining information about the building's parameters of rooms, levels or even the entire buildings.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

* Maven 3.2+
* [JDK 1.8+](https://www.oracle.com/technetwork/java/javase/downloads/index.html "www.oracle.com")

### Installing

Clone the repitory from GitHub
```
https://github.com/kjuszczak96/buildingInfo.git
```

To build, issue the following at the command line:
```
mvn compile
```

Run the API:
```
mvn spring-boot:run
```
The application can be now accessed on port 8080. You can get information about the building's parameters by making a POST requests like below:
```
Content-Type: application/json
POST http://localhost:8080/building/get_area
{
  "name": "building1",
  "id": "1",
  "levels": [
    {
      "name": "level1",
      "id": "1",
      "rooms": [
        {
          "name": "room1",
          "id": "1",
          "area": "123",
          "volume": "12.3",
          "heatingPowerConsumption": "123.4",
          "illuminationPower": "12"
        },
        {
          "name": "room2",
          "id": "2",
          "area": "123",
          "volume": "12.3",
          "heatingPowerConsumption": "123.4",
          "illuminationPower": "12"
        }
      ]
    }
  ]
}
```
### Some other endpoints you can call:
Get area
* http://localhost:8080/room/get_area
* http://localhost:8080/level/get_area
* http://localhost:8080/building/get_area

Get volume
* http://localhost:8080/room/get_volume
* http://localhost:8080/level/get_volume
* http://localhost:8080/building/get_volume

Get lighting power
* http://localhost:8080/room/get_illumination_power
* http://localhost:8080/level/get_illumination_power
* http://localhost:8080/building/get_illumination_power


### Generate javadoc
```
mvn javadoc:javadoc
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management 
* [Spring Boot](http://spring.io/projects/spring-boot)

## Authors

* **Jakub Jasiński**
* **Kamil Juszczak**
* **Kamila Kolenda**
* **Filip Neunert**
