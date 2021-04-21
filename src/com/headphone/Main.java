package com.headphone;

public class Main {

    public static void main(String[] args) {
	//create object inside main method
        HeadPhone h1 = new HeadPhone();
        System.out.println(h1.color);
        System.out.println(h1.charge);
    }
}

class HeadPhone{
    //class variables
    String color = "blue/green";
    String charge = "micro usb";
    String [] controls = {"volume", "power", "play/pause"};

    static boolean power = false;
    static int volume = 0;

     void powerOn(){
         power = true;
     }
     void powerOff(){
         power = false;
     }
     void volumeUp(){
         volume++;
     }
     void volumeDown(){
         volume--;
     }
}

