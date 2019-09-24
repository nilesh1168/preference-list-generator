/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nilesh
 */
public class ListFormTest {
    static ListForm l;
    public ListFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws InterruptedException {
        l = new ListForm();
        l.setVisible(true);
        Thread.sleep(1000);
        l.jButton1.doClick();
        Thread.sleep(2000);
    }
    
    @AfterClass
    public static void tearDownClass() {
        l.dispose();
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void listcheck() {
//        check of data is retrieved or not
        assertNotNull(l.rs);  
    }
}
