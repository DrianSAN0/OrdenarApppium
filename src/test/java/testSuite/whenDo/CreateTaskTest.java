package testSuite.whenDo;

import activities.wenDo.CreateTask;
import activities.wenDo.MainScreen;
import activities.wenDo.Sort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CreateTaskTest extends  BaseWhenDo{
    MainScreen mainScreen = new MainScreen();
    CreateTask createTask = new CreateTask();
    Sort sort = new Sort();

    @Test
    public void createtask(){
      String  title  = "Cr7";
      String notas = "estoy cansado";
      String title2 = "Messi";
      String notas2 = "estoy cansado";

      mainScreen.addButton.click();
      createTask.createTask(title,notas);
      mainScreen.addButton.click();
      createTask.createTask2(title2,notas2);
      sort.sortTask();
      Assertions.assertEquals(title,mainScreen.getTaskLabel(title).getText(), "ERRO al ordenar alfabeticamente");


    }
}
