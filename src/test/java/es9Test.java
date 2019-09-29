/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.esercizio9.es9;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jessi
 */
public class es9Test {
    
    public es9Test() {
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void EasyBalanceChecking() {
         String cB= "1000.00\n"
                + "125 Market 125.45\n"
                + "126 Hardware 34.95\n"
                + "127 Video 7.45\n"
                + "128 Book 14.32\n"
                + "129 Gasoline 16.10\n";
                 String out="Original Balance: 1000.0\n"+
                            "125 Market 125.45 Balance 874.55\n"+
                            "126 Hardware 34.95 Balance 839.6\n"+
                            "127 Video 7.45 Balance 832.15\n"+
                            "128 Book 14.32 Balance 817.83\n"+
                            "129 Gasoline 16.10 Balance 801.73\n"+
                            "Total expence: 198.27\n"+
                            "Average expence: 32.04";
     assertEquals(es9.EasyBalanceChecking(cB),out);
     }
}
