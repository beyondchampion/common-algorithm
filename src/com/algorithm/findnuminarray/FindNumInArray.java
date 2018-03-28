package com.algorithm.findnuminarray;

/**
 * Created with IntelliJ IDEA.
 * User: LK
 * Date: 2018/3/28
 * Time: 14:09
 * To change this template use File | Settings | File Templates.
 * Description:二维数组的查找
 */
public class FindNumInArray {

    public boolean Find(int target,int [][] array) {
        int len = array.length-1; //数组长度，最大下标
        int i = 0;
       while((len >= 0) && (i < array[0].length)){
            if (array[len][i] > target) {
                len--;
            }else if(array[len][i] < target){
                i++;
            }else{
                return true;
            }
       }
        return false;
    }

    public static void main(String[] args) {

        int [][] array = {{1,2,3,29},{4,5,6,38},{7,8,9,47},{17,18,19,127}};
        int target = 29;
        FindNumInArray fa = new FindNumInArray();

        try {

            long startTime = System.currentTimeMillis();    //获取开始时间

            boolean find = fa.Find(target, array);
            System.out.println(find);

            long endTime = System.currentTimeMillis();    //获取结束时间
            System.out.println("-----------------------------");
            System.out.println("程序总运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
            float seconds = (endTime - startTime) / 1000F;
            System.out.println(Float.toString(seconds) + " seconds.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
