//сортировка вставками
public class SortByInserts {
    int sortMass[];

    void insertSort(int mass[]){

        int i,j,s;
        s=1;
        System.out.println(" ***   Сортировка вставками   *** ");
        System.out.println("Не отсортированный массив");
        for (int x:mass){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println();
        for (i=1;i<mass.length;i++){
            j=i;
            while ((j>0)&&(mass[j]<mass[j-1])){
                int t;
                t=mass[j];
                mass[j]=mass[j-1];
                mass[j-1]=t;
                j=j-1;

                System.out.print(s+"   ");
                s++;
                for (int x:mass){
                    System.out.print(x+" ");
                }System.out.println();
            }
        }

        System.out.println("Для полной сортироки массива чисел длинной "+mass.length+" чисел понадобилось "+(s-1)+" итераций.");

    }
}
