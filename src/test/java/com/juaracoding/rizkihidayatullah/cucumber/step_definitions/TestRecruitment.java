package com.juaracoding.rizkihidayatullah.cucumber.step_definitions;

import com.juaracoding.rizkihidayatullah.cucumber.pages.RecruitmentPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRecruitment {
    WebDriver driver;
    private static ExtentTest extentTest;
    private RecruitmentPage recruitmentPage = new RecruitmentPage();

    public TestRecruitment() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }





    //Test case one
    @When("User click menus recruitment")
    public void user_click_menus_recruitment() {
        Hooks.delay(1);
        recruitmentPage.menuRecruitment();
        extentTest.log(LogStatus.PASS, "User click menus recruitment");
    }

    @Then("User on menu recruitment")
    public void user_on_menu_recruitment() {
        Assert.assertEquals(recruitmentPage.getTxtRecruitment(), "Recruitment");
        extentTest.log(LogStatus.PASS, "User on menu recruitment");
        Hooks.delay(1);
    }

    @When("User select search candidate by date")
    public void user_select_search_candidate_by_date() {
        recruitmentPage.menuRecruitment();
        recruitmentPage.searchCandidateByDate("2022-10-28");
        extentTest.log(LogStatus.PASS, "User select search Linda Anderson by hiring manager");
        Hooks.delay(2);
    }

    @And("User click button search")
    public void user_click_button_search() {
        recruitmentPage.ClickBtnSearch();
        extentTest.log(LogStatus.PASS, "User click button search");
        Hooks.delay(1);
    }

    @Then("User showing candidate by date")
    public void user_showing_linda_anderson_by_hiring_manager() {
        Assert.assertEquals(recruitmentPage.getTxtCandidateName(), ("Rizki Hidayatullah"));
        extentTest.log(LogStatus.PASS, "User success showing candidate by date");
        Hooks.delay(2);
    }




    //Test case two
    @When("User click button add")
    public void user_click_button_add() {
        recruitmentPage.ClickBtnAdd();
        extentTest.log(LogStatus.PASS, "User click button add");
        Hooks.delay(1);
    }

    @And("User enter fullname")
    public void user_enter_fullname() {
        recruitmentPage.fullname("Rizki", "", "Hidayatullah");
        extentTest.log(LogStatus.PASS, "User enter fullname");
    }

    @And("User select vacancy")
    public void user_select_vacancy() {
        recruitmentPage.selectVacancy();
        extentTest.log(LogStatus.PASS, "User select vacancy");
    }

    @And("User enter email")
    public void user_enter_email() {
        recruitmentPage.email("rizki.hidayatulllah007@gmail.com");
        extentTest.log(LogStatus.PASS, "User enter email");
    }

    @And("User enter contact number")
    public void user_enter_contact_number() {
        recruitmentPage.contactNumber("0899866677890");
        extentTest.log(LogStatus.PASS, "User enter contact number");
    }

    @And("User upload resume")
    public void user_upload_resume() {
        recruitmentPage.uploadResume("D:\\cv\\cv rizki hidayatullah.pdf");
        extentTest.log(LogStatus.PASS, "User upload resume");
    }

    @And("User enter keywords")
    public void user_enter_keywords() {
        recruitmentPage.keywords("Tes aja");
        extentTest.log(LogStatus.PASS, "User enter keywords");
    }

    @And("User enter date of application")
    public void user_enter_date_of_application() {
        recruitmentPage.dateOfApplication("");
        extentTest.log(LogStatus.PASS, "User enter date of application");
    }

    @And("User enter notes")
    public void user_enter_notes() {
        recruitmentPage.Notes("Tes aja");
        extentTest.log(LogStatus.PASS, "User enter notes");
    }

    @And("User checklist consent to keep data")
    public void user_checklist_consent_to_keep_data() {
        recruitmentPage.CheckListConsent();
        extentTest.log(LogStatus.PASS, "User checklist consent to keep data");
    }

    @And("User click button save")
    public void user_click_button_save() {
        recruitmentPage.ClickBtnSave();
        extentTest.log(LogStatus.PASS, "User click button save");
    }

    @Then("User showing application stage data")
    public void user_showing_application_stage_data() {
        Assert.assertEquals(recruitmentPage.getTxtApplicationStage(), "Application Stage");
        extentTest.log(LogStatus.PASS, "User success showing application stage data");
    }

    //Test case three

}
