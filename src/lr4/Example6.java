package lr4;


import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = 10;
        int y = 10;
        int array1[][] = new int[x][y];
        int body = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = body;
                body++;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println();
        int row = random.nextInt(x-1);
        int collumn =random.nextInt(y-1);
        int array2[][] = new int[x-1][y-1];
        System.out.println("строка к удалению "+row);
        System.out.println("столбец к удалению "+ collumn);
        System.out.println();

        for( int i = 0, z=0; i<x-1 ;z++){
            if(z!=row){
                for(int j = 0,q = 0; j<y-1;q++){
                    if(q!=collumn){
                        array2[i][j] = array1[z][q];
                        j++;
                    }
                }
                i++;
                }

            }
        for (int i = 0; i < x-1; i++) {
            for (int j = 0; j < y-1; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        }

    }

//    Напишите программу, в которой создается и инициализируется
//    двумерный числовой массив. Затем из этого массива удаляется строка и
//столбец (создается новый массив, в котором по сравнению с исходным
//                удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//        удаляемого столбца определяется с помощью генератора случайных чисел