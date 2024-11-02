package activities.browserstack;

import controls.Button;
import org.openqa.selenium.By;

public class homeMenu {
    public Button singin = new Button(By.xpath("//android.view.ViewGroup[@content-desc=\"nav-signin\"]"));
    public Button welcom = new Button(By.xpath("//android.widget.TextView[@content-desc=\"username\"]"));
    public Button usernamemensaje = new Button(By.xpath("//android.widget.TextView[@content-desc=\"username\"]"));

}

