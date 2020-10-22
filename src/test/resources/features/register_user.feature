#autor: juanesolayalopez@gmail.com

  Feature: register user in uTest
    As a web user
    I want to register a user in the uTest
    to enter the plataform with your credentials

  Scenario: register succefully
    Given Juan is in the uTest page
    When he fill in the data
    |name         |lastname |email                       |city            |codePostal      |password    |confirmPassword|
    |juan esteban | Olaya   | juanesolaya1@gmail.com     |Pueblo Viejo    |050001          |Juan1999.*  |Juan1999.*     |
    Then you can see 4


