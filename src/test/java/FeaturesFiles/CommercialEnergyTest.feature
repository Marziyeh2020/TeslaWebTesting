Feature: Commercial Energy Functionalitiy
  Scenario:Clicking Functions and Verify
    Given Open website go to home page
    And Clicking function control on the Tesla
    |menuButton|
    |commercialEnergyButton|
    And Verification function checking in the Tesla
    |commercialEnergyVerify|Commercial Energy|
    |valuesVerify|50+|
    |valuesVerify|10 GWh+|
    |valuesVerify|1,000+|
    |produceVerify|Produce Energy|
    And Clicking function control on the Tesla
      |orderNowButton|
      |purchaseButton|
      |estLink|
      |closeButton|
      |estLink2|
      |closeButton|
      |kwSelect|
      |kwSelect|
      |kwSelect|
      |kwSelect|
      |systemGuideButton|
      |closeButton|
    And Verification function checking in the Tesla
    |priceSummaryVerify|Price Summary|
    |yourContactVerify|Your Contact Information|
    And Sending function checking in the Tesla
    |firstNameInput|True Test|
    |lastNameInput|Turkey|
    |emailInput|truetest@gmail.com|
    |confirmEmailInput|truetest@gmail.com|
    |phoneNumberInput|2015550123|
    And Clicking function control on the Tesla
      |contactSelect|
    And Sending function checking in the Tesla
    |companyNameInput|True Test LLC|
    |installationAddressInput|Turkey Lake Rd, Orlando, FL 32819, USA|
    And Clicking function control on the Tesla
      |placeReservationButton|

