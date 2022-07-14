package org.fasttrackit.features.search;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerWithValidCredentials() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        registerSteps.setRegisterCredentials(Constants.REGISTER_EMAIL, Constants.REGISTER_PASS);
        registerSteps.clickRegisterButton();
        loginSteps.verifySuccessfulLoginMessage("alabala");
    }
    @Test
    public void registerWithAlreadyUsedCredentials() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        registerSteps.setRegisterCredentials(Constants.REGISTER_EMAIL, Constants.REGISTER_PASS);
        registerSteps.clickRegisterButton();
        registerSteps.accountAlreadyRegisteredMessage();
    }
    @Test
    public void registerWithoutCredentials() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        registerSteps.clickRegisterButton();
        registerSteps.verifyNoCredentialsRegistrationError();
    }
    @Test
    public void registerWithInvalidCredentials() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        registerSteps.setRegisterCredentials("hello", "");
        registerSteps.clickRegisterButton();
        registerSteps.popUpAlertInvalidRegistrationEmail();

    }


}
