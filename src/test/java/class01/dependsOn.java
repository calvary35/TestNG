package class01;

import org.testng.annotations.Test;

public class dependsOn {

    @Test
    public void Login(){
        System.out.println(5/0);
    }

    @Test(dependsOnMethods = {"Login"})
    public void DashBoardVerification(){
        System.out.println("After login I am verifying the dashboard page");
    }
}
