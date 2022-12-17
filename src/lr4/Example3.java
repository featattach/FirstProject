package lr4;

public class Example3 {
    public static void main(String[] args) {
        int [][] arrayTwos = new int [7][15];
        for(int i=0; i<7;i++){
            for(int j=0; j<15;j++){
                arrayTwos[i][j] = 2;
                System.out.print(arrayTwos[i][j]);
            }
            System.out.println();
        }

    }
}

//
//    Напишите программу, в которой создается двумерный массив, который
//    выводи прямоугольник из цифр 2;