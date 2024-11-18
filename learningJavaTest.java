import org.junit.Test;
import static org.junit.Assert.*;

public class learningJavaTest {
    public boolean isEven(double num){
        if(num % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    @Test
    public void testGetBigNum(){
        double[] array = {-19595954.0002, 19595954.0001, -3, 40404};
        assertEquals(learningJava.getBigNum(array), 19595954.0001, 0.0001);
        assertEquals(isEven(learningJava.getBigNum(array)), true);
}
}
