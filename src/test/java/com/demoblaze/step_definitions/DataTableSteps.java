package com.demoblaze.step_definitions;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataTableSteps {

    ProductPage page = new ProductPage();
    @Then("Under {string} category User should be able to see the list of following products")
    public void underCategoryUserShouldBeAbleToSeeTheListOfFollowingProducts(String category, List<String> expectedProducts) {
        Driver.get().findElement(By.linkText(category)).click();
        BrowserUtils.sleep(2);
        List<WebElement> productsElements = page.products;
          List<String > actualProducts = BrowserUtils.getElementsText(page.products);
        System.out.println("expectedProducts = " + expectedProducts);
        System.out.println("actualProducts = " + actualProducts);
        Assert.assertEquals("List of Products are NOT as expected",expectedProducts,actualProducts);


    }

}
