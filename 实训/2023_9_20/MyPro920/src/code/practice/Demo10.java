package code.practice;

import java.util.ArrayList;
import java.util.Iterator;

/*
假设顺序列表ArrayList中存储的元素是整型数字1~5 (加入泛型限制数据类型)，
遍历每个元素，将每个元素顺序输出。
 */
public class Demo10 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

    }


}
