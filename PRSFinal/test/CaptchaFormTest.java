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
public class CaptchaFormTest {
   static CaptchaForm cap;
    public CaptchaFormTest() {

    }
    
    @BeforeClass
    public static void setUpClass() throws InterruptedException {
        cap = new CaptchaForm();
        cap.setVisible(true);
        Thread.sleep(3000);

   }
    
    @AfterClass
    public static void tearDownClass() {
        cap.NxtBtn.doClick();
        cap.dispose();
    }
    
    @Before
    public void setUp() throws InterruptedException {
        //success tests
        cap.Email.setText("abc@example.com");
        cap.Fname.setText("Nilesh");
        cap.Captcha.setText(cap.jLabel4.getText());
        System.out.println("IN BEFORE");
        Thread.sleep(3000);
    }
    
    @After
    public void tearDown() 
    {

    }
    @Test
    public void emptyfieldsTest()
    {
        assertFalse(cap.checkNull());
        System.out.println("1");
    }
    
    @Test
    public void nameTest(){
        assertTrue(cap.checkNameFormat(cap.Fname.getText()));
        System.out.println("2");
    }
    
    
    @Test
    public void emailidTest()
    {
        assertTrue(cap.checkEmailFormat(cap.Email.getText()));
        System.out.println("3");
    }
    
    @Test
    public void captchaTest()
    {
        assertEquals(cap.jLabel4.getText(), cap.Captcha.getText());
        System.out.println("4");
    }

    @Test
    public void newcaptchaTest()
    {   
        String str = cap.jLabel4.getText();
        System.out.println(cap.jLabel4.getText());
        cap.newCapBtn.doClick();
        System.out.println(cap.jLabel4.getText());
        assertFalse(cap.jLabel4.getText().equals(str));
        System.out.println("5");
    }
        
}
