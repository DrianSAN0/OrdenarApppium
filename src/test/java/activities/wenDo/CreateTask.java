package activities.wenDo;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class CreateTask {
    public TextBox tittleTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    public TextBox tittleTextBox2 = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteTextBox2 = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton2 = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    public void createTask (String tittle, String note){
        tittleTextBox.setText(tittle);
        noteTextBox.setText(note);
        saveButton.click();
    }
    public void createTask2(String tittle2,String note2){
        tittleTextBox2.setText(tittle2);
        noteTextBox2.setText(note2);
        saveButton2.click();
    }
}
