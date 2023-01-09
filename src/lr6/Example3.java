package lr6;
//Напишите программу с классом, в котором есть статические методы,
//        которым можно передавать произвольное количество целочисленных аргументов (или
//        целочисленный массив).
//        Методы, на основании переданных аргументов или массива,позволяют вычислить:
//        наибольшее значение,
//        наименьшее значение,
//        а также среднее значение из набора чисел.
public class Example3 {
    private static class Ex3{
        private static void Max(int ... array){
            int max = array[0];
            for (int i = 0; i < array.length; i++){
                max = Math.max(max, array[i]);
                }
            System.out.println("Maximum array[] = " + max);
        }
        private static void Min(int ... array){
            int min = array[0];
            for (int i = 0; i<array.length; i++){
                min = Math.min(min, array[i]);
            }
            System.out.println("Minimum array[] = "+min);
        }
        private static void Middl(int ... array){
            int sum = 0;
            for (int i = 0; i < array.length; i++){
               sum = array[i]+sum;
            }
            double middl = (double)sum/array.length;
            System.out.println("Middle array[] = " +middl);
        }
    }

    public static void main(String[] args) {
        Ex3.Max(1,0,42,4,-12,10);
        Ex3.Min(3,5,-12,-100,0,5);
        Ex3.Middl(1,2,3,4,5,6);
    }

}
