package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;


public class EmployeeTest {

         Employee employee;
         Manager manager;
         Programmer programmer;
        @BeforeClass
        public static void setUpClass()
        {
            System.out.println("set up class");
            // ForLoopExample forLoopExample = new ForLoopExample();
        }
        @Before
        public void setUp(){

            employee = new Employee();
            manager = new Manager();

        }

        @After
        public void tearDown(){
            System.out.println("tear down");
            employee = null;
        }
        @Test
        public void inheritanceExample() {
             employee.startProjectWork();
        }
    @Test
    public void inheritanceExample1() {
        employee.startProjectWork();
        employee.reachOffice();
        manager.reportProjectStatus();
        manager.bookConferenceRoom(LocalDateTime.MAX,6);

        //manager.teamSize();
    }


}



