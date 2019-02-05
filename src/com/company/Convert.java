package com.company;

import java.util.Arrays;

/**
 * Created by al5091 on 2/4/19.
 */
public class Convert {

    private static String[] hexArray = {"0", "1" ,"2" ,"3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9" ,"A" ,"B" ,"C" ,"D" ,"E" ,"F"};

    public static String RGBToHex(int RGB) {
        String value = hexArray[RGB / 16];
        String r = hexArray[RGB % 16];
        String s = value + r;
        return s;
    }

    public static int HexToRGB(String hex) {
        int conversion = (Arrays.binarySearch(hexArray, hex.substring(0, 1)) * 16) + Arrays.binarySearch(hexArray, hex.substring(1));
        return conversion;
    }

}
