package lr4;

public class Example4 {
    public static void main(String[] args) {
        String[][] arrayTwos = new String[5][5];
        for(int i=0; i<5;i++) {
            for (int j = 0; j < 5; j++) {
                arrayTwos[i][j] = "+";
            }
        }
int figure = 5;
        for(int i=0;i<figure;i++){
            for(int y=0; y<figure; y++){
                System.out.print(arrayTwos[i][y]);
            }
        }


    }
}

//
//    Напишите программу, в которой создается двумерный массив, который
//    выводит прямоугольный треугольник;