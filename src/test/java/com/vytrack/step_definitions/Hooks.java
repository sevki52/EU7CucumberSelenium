package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
        //Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void teardown(){
        System.out.println("\tthis is coming from AFTER");
        System.out.println("\tthis is coming from AFTER");
    }
//    public void tearDown(Scenario scenario){
//        if(scenario.isFailed()){
//            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot,"image/png","screenshot");
//        }
//
//        Driver.closeDriver();
//
//    }
//
//    @Before("@abc")
//    public void setUpdb(){
//        System.out.println("\tconnecting to database...");
//    }
//
//    @After("@abc")
//    public void closeDb(){
//        System.out.println("\tdisconnecting to database...");
//
//    }
}
