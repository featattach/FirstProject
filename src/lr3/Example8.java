package lr3;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        char mainmass[] = new char[10];
        char i = 'A';
        char massglas [] = {'A', 'E', 'I'};
        for (int x = 0; x < mainmass.length; i++)
        {
            for (int y = 0; y < massglas.length; y++)
            {
                if (i == massglas[y]) {
                    i++;
                }
            }
            mainmass[x] = i;
            System.out.println("Элемент массива ["+x+"] = " + mainmass[x]);
            x++;
        }
    }
}



//    Напишите программу, в которой создается символьный массив из 10 элементов.
//        Массив заполнить большими (прописными) буквами английского алфавита.
//        Буквы берутся подряд, но только согласные
//        (то есть гласные буквы ’ А','Е' и ' I' при присваивании значений элементам массива нужно пропустить).
//        Отобразите содержимое созданного массива в консольном окне.