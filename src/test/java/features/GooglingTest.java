package features;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.runtime.arquillian.ArquillianCucumber;

@RunWith(ArquillianCucumber.class)
@RunAsClient
public class GooglingTest {

    @Drone
    private WebDriver driver;

    @Given("^I know where to find Google$")
    public void findGoogle() {
        driver.get("http://www.google.com/");
    }
}
