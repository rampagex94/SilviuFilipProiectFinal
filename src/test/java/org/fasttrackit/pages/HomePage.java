package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = "#menu-item-122")
    private WebElementFacade myAccountLink;
    @FindBy(css = ".header-search")
    private WebElementFacade searchButton;
    @FindBy(css = ".search-field")
    private WebElementFacade searchField;
    @FindBy(css = "[type=\"submit\"]")
    private WebElementFacade goSearchIcon;

    public void clickAccountLink() {
        clickOn(myAccountLink);
    }

    public void openSearch() {
        clickOn(searchButton);
    }

    public void setSearchField(String keyword) {
        typeInto(searchField, keyword);
    }

    public void clickSearchIcon(){
        clickOn(goSearchIcon);
}
}
