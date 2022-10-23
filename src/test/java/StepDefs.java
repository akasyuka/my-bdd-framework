import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;

public class StepDefs {
    @Given("Открываем сайт")
    public void openWebSite() {
        Selenide.open("https://keep.google.com/");


    }


}
