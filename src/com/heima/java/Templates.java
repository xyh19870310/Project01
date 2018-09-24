package com.heima.java;

import com.heima.bean.Customer;

import java.util.ArrayList;

/**
 * @author xyh
 * @date 2018/9/23-10:46
 * 常用的模板
 */
public class Templates {
    //模板六：prsf:private static final
    private static final Customer CUST = new Customer();
    //变形:psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2=2;
    //变形：psfs
    public static final String NATION ="china";


    //1模板一：psvm
    public static void main(String[] args) {

        //模板二：
        System.out.println("hello");
        //变型 ：soutp/soutm/soutv/xxx.sout

        int num1 = 10;

        int num2 = 20;
        System.out.println("num2 = " + num2);

        //模板三：fori
        String[] arr = new String[]{"Tom", "jerry", "lilei", "fangshuo"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }

        //模板四：List.for
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(567);
        list.add(890);
        for (Object o : list) {
            
        }
        //变形list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //倒叙遍历list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }


    public void method() {
        //模板五：ifn
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(567);
        list.add(890);
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形：xxx.nn /xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }


}
