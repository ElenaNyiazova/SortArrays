// Реализация сортировки массивов чисел
public class SortArrays {
    public static void main(String args[]){
        int massive[]= {2,67,12,5,99,31,6,9,7,1,54,67,8,70,0,5,1};
        int massive2[]={2,67,12,5,99,31,6,9,7,1,54,67,8,70,0,5,1};//создаем два идентичных массива чисел
        char cMass[]= {'g','u','a','i','t'};
        char cMass2[]={'g','u','a','i','t'};//создаем два идентичных массива символов


        //Сортировка вставкой
//        SortByInserts sortByInserts = new SortByInserts();
//        sortByInserts.insertSort(massive);

        //Сортировка пузырьком
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.insertSort(massive2);// чисел
        bubbleSort.insertSortChar(cMass);//символов

    }
}
