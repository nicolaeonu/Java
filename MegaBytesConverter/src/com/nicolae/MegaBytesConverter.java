package com.nicolae;

public class MegaBytesConverter {

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
