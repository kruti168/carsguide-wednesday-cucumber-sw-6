@regression
Feature: Search functionality

  @sanity
 Scenario Outline: : Search the buy cat with model
    Given I am on homepage
    When  I mouse hover on "buy+sell"tab
    And   I click 'Search Cars' link
    Then  I navigate to 'new and used car search'page
    And   I select make "<make>"
    And   I select model "<model>"
    And   I select location "<location>"
    And   I select price "<price>"
    And   I click on Find My Next Car tab
    Then  I should see the make "<VerifyMessage>" in results



   Examples:
     | make       | model       | location            | price   |   VerifyMessage                                   |
     | Ford       | Mustang     | NT - All            | $60,000 | 3 Ford Mustangs for Sale under $60,000 in NT      |
     | Jeep       | Compass     | NSW - All           | $45,000 |22 Jeep Compass for Sale under $45,000 in NSW      |
     | Kia        | Niro        | NT - All            | $45,000 | 2 Kia Niros for Sale under $45,000 in NT                              |
     | Honda      | HR-V        | NSW - Hunter        | $25,000 | 2 Honda HR-Vs for Sale under $25,000 in Hunter, NSW                   |
     | Hyundai    |I20          | NSW - All           | $20,000 |14 Hyundai I20s for Sale under $20,000 in NSW |
     | Audi       | Q5          | NSW - Newcastle     | $60,000 | 6 Audi Q5s for Sale under $60,000 in Newcastle, NSW                   |
     | Hyundai    | I30         | NSW - Far West      | $45,000 | 14 Hyundai I30s for Sale under $45,000 in Far West, NSW               |

 @smoke
   Scenario Outline: Search the used car with model
     Given I am on homepage
     When  I mouse hover on "buy+sell"tab
     And   I click 'Used'link
     Then  I navigate to 'Used Cars For Sale'page
     And   I select make "<make>"
     And   I select model "<model>"
     And   I select location "<location>"
     And   I select price "<price>"
     And   I click on Find My Next Car tab
     Then  I should see the make "<VerifyMessage>" in results


     Examples:
       | make          | model    |    location    | price   |    VerifyMessage                                                 |
       |Ford           |  Falcon  |     NSW - All  | $20,000 |78 Used Ford Falcons for Sale under $20,000 in NSW                |
       |Kia            |  Rio     |    NSW - All   | $20,000 |41 Used Kia Rios for Sale under $20,000 in NSW                    |
       | Mazda         | Bravo    | NSW - Sydney   | $20,000 | 2 Used Mazda Bravos for Sale under $20,000 in Sydney, NSW        |
       | Mercedes-Benz | ML250    | NSW - Hunter   | $70,000 | 2 Used Mercedes-Benz A250s for Sale under $70,000 in Hunter, NSW |
       | Suzuki        | Jimny    | NSW - Far West | $50,000 | 1 Used Suzuki Jimny for Sale under $50,000 in Far West, NSW      |
       | Toyota        | Hilux    | NSW - All      | $60,000 | 402 Used Toyota Hiluxs for Sale under $60,000 in NSW             |