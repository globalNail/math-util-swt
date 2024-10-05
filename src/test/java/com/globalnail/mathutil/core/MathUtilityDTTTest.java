package com.globalnail.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDTTTest {

//    @Test là 1 phần annotation của framework, biến hàm cửa ta thành hàm main
//    Để có thể run, hàm bình thường chỉ có thể trong main() để chạy
//    @Test biến hàm bất kì thành main()

//    Kĩ thuật DDT (Data Driven Testing): là kĩ thuật tách data kiểm thử ra
//    khỏi các câu lệnh, mục đích giúp dev nhìn nhanh được xem bộ test case thiếu hay 0
//    Kĩ thuật này còn gọi tên khác là tham số hóa bộ data kiểm thử Parameterized Testing

//    Ta làm 1 hàm riêng, phải là static, để lưu bộ data kiểm thử
    public static Object[][] initTestData(){
        return new Object[][]
                {
                    {0, 1},
                    {1, 1},
                    {2, 2},
                    {3, 6},
                    {4, 24},
                    {5, 120},
                    {6, 720},
                };
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    void testGetFactorialGivenRightArgument5Runwell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

    public static Integer[] initTestDataForCheckingException(){
        return new Integer[]
                {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -100, 21, 22, 23, 24, 25,100};
    }

    @ParameterizedTest
    @MethodSource("initTestDataForCheckingException")
    void testGetFactorialGivenWrongArgument(int n) {
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(n));
    }
}