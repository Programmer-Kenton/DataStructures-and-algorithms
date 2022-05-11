package com.tjxd.second_chapter.highPow;


import static jdk.vm.ci.code.CodeUtil.isEven;

public class powMath {
    public static void main(String[] args) {
        int a = 100;
        int b = 3;
        System.out.println(pow(a, b));
    }

    public static long pow(long x,int n){
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return x;
        }
        /*iseven函数是判断其参数是不是偶数,如果是偶数就返回TRUE,
        否则返回FASLE和错误值的一种excel 函数。*/
        if (isEven(n)){
            return pow(x * x,n / 2);
        }else {
            return pow(x * x,n / 2) * x;
        }
    }
}
