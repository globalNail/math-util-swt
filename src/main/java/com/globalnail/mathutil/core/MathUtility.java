package com.globalnail.mathutil.core;

// tạo thư viện cung cấp các hàm tiệm ích liên quan đến toán học
// vì là đồ tiện ích dùng chung, tool cho nhiều nơi sử dụng ->hàm static
public class MathUtility {
//    hàm tính n! = 1.2.3...n
//    không có giai thừa âm
//    0! = 1! = 1
//    20! vừa đủ kiểu long, 18 số 0
//    bài này 0 chơi với 21! trở lên    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid number, n must between 0..20");
        if (n == 0 || n == 1)
            return 1; //    0! = 1! = 1
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
