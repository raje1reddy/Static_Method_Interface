package com.padmaja.flowcontrol;

public class  Programmer extends Employee implements Trainable{
     String[] programmingLanguages;
    public void writeCode(){
        System.out.println("writecode");
    }

    public void accessBaseClassMembers() {
        name = "Programmer";
        System.out.println(name);
    }
        public void attendTraining(){
            System.out.println("Prog. attendTraining");
        }
    }

