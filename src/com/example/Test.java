package com.example;

import com.example.service.StudentService;

/**
 * 需求0
 * 在com.example下，创建包含main()主函数的Test类
 * 在Test中声明一个私有静态方法，在方法中创建1个包含5个元素的整型数组，添加考试成绩，将其个低于60分的成绩打印显示。
 * 成绩(可自定义)：94,64,55,59,88
 * 如何初始化一个整型数组？使用基本for循环，以及foreach循环分别实现
 */
public class Test {
    public static void main(String[] args) {
        /*int[] results = new int[5];
        results[0] = 94;
        results[1] = 64;
        results[2] = 55;
        results[3] = 59;
        results[4] = 88;*/
        int[] results = {94,64,55,59,88};  //静态
        int len = results.length;
        /*for (int i = 0; i < len; i++) {
            if(results[i] < 60) {
                System.out.println(results[i]);
            }
        }*/
        for (int x:results) {
            if(x < 60) {
                //x.sout
                System.out.println(x);
            }
        }

        StudentService.printStudentInfo();
        System.out.println("\n");
        StudentService ss = new StudentService();
        if(null!=StudentService.getStudentForNumber(1003)) {
            StudentService.getStudentForNumber(1003).printInfo();
        }

        System.out.println("平均分：" + StudentService.jsAverage(1));
    }
}
