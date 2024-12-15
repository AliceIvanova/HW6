package tests;


import org.junit.jupiter.api.Test;
import pages.PracticePage;
import pages.components.Utils;

public class PracticeFormMinTests extends TestBase{
  PracticePage practicePage = new PracticePage();
  @Test
  void fillFormTestMin() {
    practicePage.openTestPage("/automation-practice-form");
    Utils.removeBanner();
      practicePage.setFirstName("Alice")
      .setLastName("Ivanova")
      .setGender("Female")
      .setUserNumber("1234567891")
      .submitButton();
      practicePage.checkResult("Student Name", "Alice Ivanova")
      .checkResult("Gender", "Female")
      .checkResult("Mobile","1234567891");
  }

}
