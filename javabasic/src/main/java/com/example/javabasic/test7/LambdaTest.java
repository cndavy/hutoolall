package com.example.javabasic.test7;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author xqq
 * @date 2021/11/16
 **/
public class LambdaTest {

    public static void main(String arg[]){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(2, 3, 3, 2, 5, 2, 7);
        List<Integer> mutiList = numbers.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(mutiList.toArray());



        int[] numList = {7, 23, 4, 4, 22, 34, 45, 11, 33};
        System.out.println("最小数："+Arrays.stream(numList).min().getAsInt());

        int[] list = {1,2,3,3};
        System.out.println(Arrays.stream(list).distinct().map((i) -> i*2).sum());

//        LambdaTest lambdaTest = new LambdaTest();
//         MathOperation addition = (int a, int b) -> a + b;
//         MathOperation sub = (a, b) -> a - b ;
//         MathOperation muti = (a , b) -> {return a * b;} ;
//
//        System.out.println(lambdaTest.operate(10, 5, addition));
//        System.out.println(lambdaTest.operate(10, 5, sub));
//        System.out.println(lambdaTest.operate(10, 5, muti));
//
//
//        // 没有括号的表达式
//        GreetingService greetService1 = message ->
//                System.out.println("Hello " + message);
//
//        // 有括号的表达式
//        GreetingService greetService2 = (message) ->
//                System.out.println("Hello " + message);
//
//        // 调用sayMessage方法输出结果
//        greetService1.sayMessage("Shiyanlou");
//        greetService2.sayMessage("Classmate");


    }

    interface MinNum{
        int mix();
    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}


