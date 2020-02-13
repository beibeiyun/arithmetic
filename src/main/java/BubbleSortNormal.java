


public class BubbleSortNormal {


    /*
    *
    * 冒泡排序
    * */
    public static class Dubblesort{
        public static void main(String[] args) {

                int[] t = {2,9,3,6,8};
                int len = t.length-1;
                int temp = 0;     // 开辟一个临时空间, 存放交换的中间值
                int tempPostion = 0;  // 记录最后一次交换的位置
                for (int i=0;i<len;i++){
                    System.out.format("第 %d 遍：\n", i+1);
                    int flat = 1;
                    for(int j=0;j<len-i;j++){
                        if (t[j]<t[j+1]){
                            temp = t[j+1];
                            t[j+1]=t[j];
                            t[j]=temp;
                            flat = 0;//发生交换，标志位置0
                            tempPostion = j;  //记录交换的位置
                        }
                        System.out.format("第 %d 遍的第%d 次交换：", i+1,j+1);
                        for(int count:t) {
                            System.out.print(count);
                        }
                        System.out.println("");
                    }
                    len = tempPostion; //把最后一次交换的位置给len，来缩减内循环的次数

                    System.out.format("第 %d 遍最终结果：", i+1);
                                 for(int count:t) {
                                         System.out.print(count);
                                     }
                                 System.out.println("\n#########################");
                }

        }
    }
}
