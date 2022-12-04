package reviewclass1;

import org.testng.annotations.Test;

public class DependsON {
    @Test
    public void login(){
        System.out.println("It will do my login");
    }

    @Test(dependsOnMethods = {"login"})
    public void addEmployee(){
        System.out.println("This will add an employee");
    }
}