package com.padmaja.flowcontrol;

import java.time.LocalDateTime;

public class Manager extends Employee implements Interviewer,Trainable{
    int teamSize;
    void reportProjectStatus(){
        System.out.println("reportprojectstatus");
    }
        public void attendTraining(){
            System.out.println("Mgr. attendTraining");
    }
        public void conductInterview(){
            System.out.println("Mgr. conductInterview");
    }
        static String bookConferenceRoom(LocalDateTime localDateTime,int dur) {
        System.out.println("Manager-bookConferenceRoom");
        return null;
        }

}

