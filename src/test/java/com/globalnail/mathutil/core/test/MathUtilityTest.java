package com.globalnail.mathutil.core.test;

import static com.globalnail.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {
    //    Test case 1: Check getFactorio() with n=0 to see result of 1...
    @Test
    void testGetFactorialGivenRightArgument5Runwell() {
    assertEquals(1, getFactorial(1));
    assertEquals(2, getFactorial(2));
    assertEquals(6, getFactorial(3));
    assertEquals(24, getFactorial(4));
    assertEquals(120, getFactorial(5));
    assertEquals(720, getFactorial(6));
    }
    
//    Cấu trúc test case: Id, Desc, Steps, Expected, Actual, Status, Date, Bug #(bug ID) bugzilla(bugDb)/Jira
//    Test case 1: Check getFactorio() with n=0 to see result of 1...
    @Test
    void testGetFactorialGivenRightArgument0Runwell() {
        long expectedValue = 1;
        long actualValue = getFactorial(0);
//        so sánh
//        chuyền thống ta sout() in kết quả và nhìn = mắt để đoán đúng sai
//        hiện đại: xài thêm tool, thư viện, unit testing framework JUnit
//        giúp đôi nắt ta nhìn kết quả đúng sai qua 2 màu xanh đỏ
//        Não và mắt 0 cần nhìn, đoán và kết luận như truyền thống
//        Đỏ => failled, Xanh => passed
//        Quy tắc xanh đỏ của Unit test tool, framework
//        Nếu tất cả các test case passed => màu xanh
//        chỉ cần 1 trong những test case failed => màu đỏ
//        Lý do: Hàm đã đúng thì phải đúng hết với các test case đã đưa ra
//        mắt chỉ cần nhìn 2 tín hiệu: xanh, đỏ theo style gộp kết quả
//        xanh đúng hết, đỏ 1 đứa chết => bỏ hàm, fix lại
        
//        Kĩ thuật viết code chính (hàm trong api, core...)
//        Mà đi kém code test hàm luôn, đúng 2 trạng thái xanh đỏ, cứ liên tục code
//        xong chạy xanh đỏ, sửa, chạy lại xanh đỏ, tối ưu chỉnh code, chạy lại xanh
//        đỏ, xanh liên tục trong quá trình viết code được gọi là TDD
//        Test Driven Development - viết code xong hành cùng code test
        assertEquals(expectedValue, actualValue);
    }
}