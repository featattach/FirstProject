package lr4;

public class Example4 {
    public static void main(String[] args) {
        String[][] arrayTwos = new String[5][5];
        for(int i=0; i<5;i++) {
            for (int j = 0; j < 5; j++) {
                arrayTwos[i][j] = "+";
            }
        }
        for(int i=0;i<5;i++){
            for(int y=i; y<5; y++){
                System.out.print(arrayTwos[i][y]);
            }
            System.out.println();
        }
    }
}

//
//    Напишите программу, в которой создается двумерный массив, который
//    выводит прямоугольный треугольник;