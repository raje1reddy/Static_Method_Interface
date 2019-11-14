package com.padmaja.flowcontrol;


import java.time.LocalDateTime;

interface Interviewer{
    //public void conductInterview();
     static void bookConferenceRoom(LocalDateTime localDateTime, int dur) {
        System.out.println("Interviewer-bookConferenceRoom");
    }

}

