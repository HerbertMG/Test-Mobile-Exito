package steps.conf;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;



public class Hooks  {

    public static final Actor actor = Actor.named("ClienteExito");

    @Steps(shared = true)
    SharedComponents sharedComponents;

    @Before
    public void setup(Scenario scenario) throws MalformedURLException {

        Properties propiedades = new Properties();
        try {
            propiedades.load(Hooks.class.getClassLoader().getResourceAsStream("serenity.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", propiedades.getProperty("appium.platformName"));
        capabilities.setCapability("platformVersion", propiedades.getProperty("appium.platformVersion"));
        capabilities.setCapability("automationName", propiedades.getProperty("appium.automationName"));
        capabilities.setCapability("deviceName", propiedades.getProperty("appium.deviceName"));
        capabilities.setCapability("appium:app", propiedades.getProperty("appium.app"));
        capabilities.setCapability("appium:ensureWebviewsHavePages", true);

        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, propiedades.getProperty("appium.appPackage"));
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, propiedades.getProperty("appium.appActivity"));

        AndroidDriver driver = new AndroidDriver(new URL(propiedades.getProperty("appium.hub")), capabilities);

        sharedComponents.setDriver(driver);

        OnStage.setTheStage(new OnlineCast());
        actor.whoCan(BrowseTheWeb.with(driver));
    }

}