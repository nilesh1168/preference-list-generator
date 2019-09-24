/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
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
public class MarksFormTest {
    static MarksForm m;
    
    public MarksFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws InterruptedException, ClassNotFoundException, SQLException {
        m = new MarksForm();
        m.setVisible(true);
        Thread.sleep(2000);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("once at lasts");
        m.GenerateListBtn.doClick();
        m.dispose();
    }
    
    @Before
    public void setUp() throws InterruptedException {
        m.mathsc.setText("80");
//        Thread.sleep(1000);
        m.aggper.setText("80");
//        Thread.sleep(1000);
        m.cetrank.setText("1200");
//        Thread.sleep(1000);
        m.matcet.setText("90");
//        Thread.sleep(1000);
        m.phycet.setText("40");
//        Thread.sleep(1000);
        m.totcet.setText("175");
//        Thread.sleep(1000);
//        add combobox elements here
        m.HomeU.setSelectedItem("Savitribai Phule Pune University");
        m.category.setSelectedItem("Open");
        m.stream1.setSelectedItem("Information Technology");
        m.stream2.setSelectedItem("Computer");
        m.prefcity.setSelectedItem("Pune");
        m.prefarea.setSelectedItem("Camp");
        Thread.sleep(1000);
        
   }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void emptyfieldsTest()
    {
        //Check if Fields are null or not
        assertTrue(m.checkNull());
    }
    
    @Test
    public void manfieldsTest(){
//        all mandatory field should be filled
        assertFalse(m.checkNull());
        
    }
    
    @Test
    public void marksTest(){
//        check if marks are in valid range
        assertTrue(m.chk(Integer.parseInt( m.mathsc.getText()),
                Integer.parseInt(m.aggper.getText()),
                Integer.parseInt(m.cetrank.getText()),
                Integer.parseInt(m.matcet.getText()),
                Integer.parseInt(m.phycet.getText()),
                Integer.parseInt(m.totcet.getText())));
    }
    @Test
    public void dbTest(){
//        check if database is connected
        assertTrue(m.chkConn());
    }
    
    @Test
    public void dbInsertSuccess(){
//        check if record is inserted successfully 
        assertNotEquals(0, m.insertsuccess);
    }
}

