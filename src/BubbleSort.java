//сортировка пузырьком
public class BubbleSort {
    int sortMass[];

    void insertSort(int mass[]){
        int i,j,t,s;
        s=1;
        System.out.println(" ***   Сортировка пузырьком   *** ");
        System.out.println("Не отсортированный массив");
        for (int x:mass){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println();
        for (i=1;i<mass.length;i++){
            for (j=mass.length-1;j>=i;j--){
                if(mass[j-1]>mass[j]){
                  t=mass[j-1];
                  mass[j-1]=mass[j];
                  mass[j]=t;

                    System.out.print(s+"   ");
                    s++;
                  for (int x:mass){
                      System.out.print(x+" ");
                  }System.out.println();
                }
            }
        }
        System.out.println("Для полной сортироки массива чисел длинной "+mass.length+" чисел понадобилось "+(s-1)+" итераций.");
    }
    // char сортировка массива пузырьком
    void insertSortChar(char mass[]){
        int i,j,s;
        char t;
        s=1;
        System.out.println(" ***   Сортировка пузырьком   *** ");
        System.out.println("Не отсортированный массив");
        for (int x:mass){
            System.out.print((char)x+" ");
        }
        System.out.println();
        System.out.println();
        for (i=1;i<mass.length;i++){
            for (j=mass.length-1;j>=i;j--){
                if(mass[j-1]>mass[j]){
                    t=mass[j-1];
                    mass[j-1]=mass[j];
                    mass[j]=t;

                    System.out.print(s+"   ");
                    s++;
                    for (int x:mass){
                        System.out.print((char)x+" ");
                    }System.out.println();
                }
            }
        }
        System.out.println("Для полной сортироки массива символов длинной "+mass.length+", понадобилось "+(s-1)+" итераций.");
    }
}
