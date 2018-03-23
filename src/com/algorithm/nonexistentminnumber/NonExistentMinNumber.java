package com.algorithm.nonexistentminnumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**

/**
 * Created with IntelliJ IDEA.
 * User: LK
 * Date: 2018/3/23
 * Time: 17:19
 * To change this template use File | Settings | File Templates.
 * Description: 求输入字符串中不能组成的最小的数（字符串由一串数字组成）
 */
public class NonExistentMinNumber {

    public static void main(String[] args) {

        String number = "";
        System.out.println("请输入一串数字：");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            number = sc.next();
        }
        if (number.trim().length() > 1000) {
            System.out.println("输入字符串长度不能大于1000！");
            return ;
        }
        char[] chars = number.trim().toCharArray();

        NonExistentMinNumber nonExistentMinNumber = new NonExistentMinNumber();
        String minNumber = nonExistentMinNumber.getNonExistentMinNumber(chars);
        System.out.println(minNumber);
    }

    /**
     * 获取传入字符数组（字符均是数字）所不能组成的最小数字
     * @param chars
     * @return
     */
    public String getNonExistentMinNumber(char[] chars){

        Map<Character, Character> allNum = new HashMap<>();
        for(Character number : chars){
            allNum.put(number,number);
        }
        if (allNum.size() >= 10) {
            return "输入数字有误，请输入0-9之间任意数字，不能全部输入！";
        }else{
            if (!allNum.containsKey('1')) {
                return "1";
            }else if (!allNum.containsKey('2')) {
                return "2";
            }else if (!allNum.containsKey('3')) {
                return "3";
            }else if (!allNum.containsKey('4')) {
                return "4";
            }else if (!allNum.containsKey('5')) {
                return "5";
            }else if (!allNum.containsKey('6')) {
                return "6";
            }else if (!allNum.containsKey('7')) {
                return "7";
            }else if (!allNum.containsKey('8')) {
                return "8";
            }else if (!allNum.containsKey('9')) {
                return "9";
            }else if (!allNum.containsKey('0')) {
                return "10";
            }
        }

        return "无结果";

    }

}
