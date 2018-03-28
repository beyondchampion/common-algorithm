package com.algorithm.replacespace;

/**
 * /**
 * Created with IntelliJ IDEA.
 * User: LK
 * Date: 2018/3/28
 * Time: 15:56
 * To change this template use File | Settings | File Templates.
 * Description: 替换空格
 * <p>
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceSpace {

    public static String replaceSpace(StringBuffer str) {

        return str.toString().replaceAll(" ", "%20");

    }

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("We Are Happy");

        try {

            long startTime = System.currentTimeMillis();    //获取开始时间

            String replaceSpace = replaceSpace(str);
            System.out.println(replaceSpace);

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
