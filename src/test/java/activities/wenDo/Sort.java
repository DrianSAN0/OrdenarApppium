package activities.wenDo;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class Sort {
    public Button ordenar = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Expand\"]"));
    public Button alfabeticamente = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Alphabetic\"]"));
    public Label A = new Label(By.xpath("//android.widget.ListView[@resource-id=\"com.vrproductiveapps.whendo:id/notesList\"]/android.view.ViewGroup[1]/android.widget.LinearLayout"));
    public Label B = new Label(By.xpath("//android.widget.ListView[@resource-id=\"com.vrproductiveapps.whendo:id/notesList\"]/android.view.ViewGroup[2]/android.widget.LinearLayout"));
    public void sortTask(){
        ordenar.click();
        alfabeticamente.click();
    }
 
}
