package activities.browserstack;

import controls.Button;
import org.openqa.selenium.By;

public class singin {
    public Button userName = new Button(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Accepted usernames are\"]"));
    public Button password = new Button(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Password for all users\"]"));
    public Button nameuser = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"demouser\"]"));
    public Button inpassword = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"testingisfun99\"]"));
    public  Button botonsingin = new Button(By.xpath("//android.widget.TextView[@text=\"Sign in\"]"));


    public void singin(){
        userName.click();
        nameuser.click();

        password.click();
        inpassword.click();
        botonsingin.click();
    }
}
