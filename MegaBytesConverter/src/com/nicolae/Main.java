package com.nicolae;

public class Main {

    public static void main(String[] args) {

        MegaBytesConverter.printMegaBytesAndKiloBytes(40000);
    }
    
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        int megaByte = 1024;
        int kiloBytesIntoMegaBytes = kiloBytes / megaByte;
        int remainderKiloBytes = kiloBytes % megaByte;

        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + kiloBytesIntoMegaBytes + " MB and " + remainderKiloBytes + " KB");
        } else if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
    }
}
