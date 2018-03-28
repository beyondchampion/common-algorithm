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


        int spacenum = 0;//spacenum为计算空格数
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                spacenum++;
        }
        int indexold = str.length() - 1; //indexold为为替换前的str下标
        int newlength = str.length() + spacenum * 2;//计算空格转换成%20之后的str长度(%20是3个字符，空格是一个，替换后比原来空格数多空格数的2倍【是3倍，多2倍】)
        int indexnew = newlength - 1;//indexold为为把空格替换为%20后的str下标
        str.setLength(newlength);//使str的长度扩大到转换成%20之后的长度,防止下标越界
        for (; indexold >= 0 && indexold < newlength; --indexold) {
            if (str.charAt(indexold) == ' ') {//
                str.setCharAt(indexnew--, '0');
                str.setCharAt(indexnew--, '2');
                str.setCharAt(indexnew--, '%');
            } else {
                str.setCharAt(indexnew--, str.charAt(indexold));
            }
        }
        return str.toString();

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
