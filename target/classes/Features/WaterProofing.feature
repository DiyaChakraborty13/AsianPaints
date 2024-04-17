Feature: To test Waterproofing functionality

  Background: 
    Given User is on homepage of Asian Paints

  @Scenario1
  Scenario Outline: To test Free Site Visit booking functionality for valid credentials
    When Click on Waterproofing
    And user scroll downward
    And user enters "<Name>","<MobileNumber>","<PINcode>" and <Email>
    And Click on Book Free Site Visit
    Then it should schedule a visit by an expert

    Examples: 
      | Name | MobileNumber | PINcode | Email                |
      | Diya |    8900030278 |   400708 | diya13june@gmail.com |
      
   @Scenario2
   Scenario Outline: To test Free Site Visit booking functionality for invalid credentials
    When Click on Waterproofing1
    And user scroll downward1
    And user enters details of form "<Name>", "<MobileNumber>", "<PINcode>" and "<Email>"
    And Click on Book Free Site Visit1
    Then it give an error message

    Examples: 
      | Name | MobileNumber | PINcode | Email        |
      | Diya |    8900030278 |   400708 | diya13june |
      
      
      
      @Scenario3
      Scenario: To test if user is able find products as per the filters they choose
      When User hover on Waterproofing and Click on Bathroom option 
      And  User scroll downward2
      And  User click on Filters option
      Then it should show products as per the preferable filters
      
      
      
      @Scenario4
       Scenario: To test Waterproofing Calculator for valid credentials
       When User hover on Waterproofing and Click on Terrace & Tanks option
       And  User scroll downward3
       And  Click on Calculate Now for Home Waterproofing Expenses option
       And  User select your surface, your type of project
       And  User enter SQFT Area
       |112|
       And  Click on Calculate Now for WaterProofing Calculator
       And  User enters Name, Email, MobileNumber, PINCode
       |Diya| diya13june@gmail.com| 8900030278| 400708|
       And  Click on Get an estimate option
       Then it should show expert recommendation
      
      @Scenario5
      Scenario: To test if user is able to download Product Information Sheet for products
      When User hover on Waterproofing and Click on Terrace & Tanks
      And  User click on SmartCare Terrace Tile Primer product
      And  User click on Product Information Sheet to download
      Then It should download the sheet 
