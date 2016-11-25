/*
 * The class content the test for the NumberoAtzarClass
 * Date:25/11/16
 */
package NumeroAtzartest;

import java.util.ArrayList;
import java.util.List;
import numeroatzar.NumeroAtzarClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Kevin Casanova Armada
 * @ version 1.89
 */
@RunWith(value=Parameterized.class)
public class NumberoAtzarJUnitTest {
    
    @Parameterized.Parameters
   public static Iterable<Object[]> getData(){
       List <Object[]> obj=new ArrayList<>();
       obj.add(new Object[]{6,1,1,3,-1,1});
       obj.add(new Object[]{6,1,3,3,2,1});
       obj.add(new Object[]{9,5,1,3,5,7});
       obj.add(new Object[]{5,4,1,2,-9,8});
       obj.add(new Object[]{5,5,5,5,5,5});
       return obj;   
   }
    private int maxim;
    private int n;
    private double atzar;
    private int counter;
    private int counterExp;
    private int nExp;
    /**
     * the constructor of testclass
     * @param maxim the number maxim of posibility
     * @param n the number writer for user
     * @param atzar the number generate for pc
     * @param counter the number of intent
     * @param counterExp the number of intent expected in fuction counter for the diferents possibility result
     * @param nExp the number expected of fuction validation,
     */
    public NumberoAtzarJUnitTest(int maxim, int n, double atzar, int counter, int counterExp, int nExp) {
        this.maxim = maxim;
        this.n = n;
        this.atzar = atzar;
        this.counter = counter;
        this.counterExp = counterExp;
        this.nExp = nExp;
    }
    
    /**
     * the test validation the fuction int validation()
     */
    @Test
    public void testValidation() throws NumberFormatException {
     NumeroAtzarClass num=new NumeroAtzarClass(maxim);
       int result =num.validation(n);
     assertEquals(nExp, result);
     }
    
    /**
     * the test validation the fuction count
     */
    @Test
    public void testCount() throws NumberFormatException  {
     NumeroAtzarClass num=new NumeroAtzarClass(maxim);
       int result =num.counter(n,atzar,counter);
     assertEquals(counterExp, result);
     }
    
}
