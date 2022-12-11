package lr3;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
       int x = 10, y = 3, z = 1, d;
       int[] priroda = new int[14];
       for (d = 0, d < priroda.length; d ++){
           priroda[d] = d + x+y+z;
       }
       for (d = 0, d< priroda.length-1; d++){
           priroda[d] = d - y;
       }

    }

}

