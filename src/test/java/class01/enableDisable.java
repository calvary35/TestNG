package class01;

import org.testng.annotations.Test;

public class enableDisable {

    @Test(enabled = false)
    public void ATest(){
        System.out.println("I am A Test");
    }
    @Test
    public void BTest(){
        System.out.println("I am B Test");
    }
    @Test(enabled = false)
    public void CTest(){
        System.out.println("I am C Test");
    }
}
