package com.padmaja.flowcontrol;

import org.junit.Test;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class ManagerTest {
    Manager manager = new Manager();
    @Test
    public void reportProjectStatus() {
        manager.startProjectWork();
        manager.reachOffice();
        manager.reportProjectStatus();
        manager.attendTraining();
        manager.conductInterview();
        manager.bookConferenceRoom(LocalDateTime.now(),5);

    }
}