package com.globalnail.mathutil.main;
import com.globalnail.mathutil.core.MathUtility;
import static com.globalnail.mathutil.core.MathUtility.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        testFactorialGivenRightArgument0RunsWell();
//        testFactorialGivenRightArgument1RunWell();
//        testFactorialGivenRightArgument5RunWell();
        testFactorialGivenWrongArgumentMinus5ThrowsException();
    }
//    Về lý thuyết ta phải test với data N = 1, 2,... ,
    
//    Test case 4
/*
    Description: Test factorial with invalid argument, E.G N = -5
    Steps:
            Call getFactorial(-5)
    Expected Result:
            An Exception is thrown - kì vọng 1 ngoại     
*/
    static void testFactorialGivenWrongArgumentMinus5ThrowsException(){
        getFactorial(-5);
    }
//Test case 3
static void testFactorialGivenRightArgument5RunWell(){
    int n = 5; // data in
    long expectedValue = 120; // expected 1! = 1
    long actualValue = getFactorial(n);
//        So sánh bằng mắt để luận kết quả đúng sai
    System.out.println("5! expected = 120: " + expectedValue
            + ", actual: " + actualValue);
}
/*     Test case #2:
       Description: Check getFactorial() function with valid argument (n=1)
        Steps/Procedures: (cách test, các bước verify hàm, chức năng)
                 Call function/method with n=1 getFactorial(1)
        Expected result: hy vọng gọi 1! giá trị trả về là mấy
                         To have 1 as the result of 1!
        Status (passed/failed-bug): mình phải run hàm và nhìn giá trị trả về 
                                    mới biết hàm chạy đúng hay sai
                  PASSED!!!!!!
        Chạy test case/ làm các bước ở trên để xác định được hàm đúng hay sai
        -> gọi là test run 
*/
    static void testFactorialGivenRightArgument1RunWell(){
        int n = 1; // data in
        long expectedValue = 1; // expected 1! = 1
        long actualValue = MathUtility.getFactorial(n);
//        So sánh bằng mắt để luận kết quả đúng sai
        System.out.println("1! expected: " + expectedValue 
                            + ", actual: " + actualValue);
    }
    
    //Các TEST CASE để dưới đây, lát run trong main
    static void testFactorialGivenRightArgument0RunsWell()
    {
//        Test case #1:
//        Description: Check getFactorial() function with valid argument (n=0)
//        Step: 
//              Call function/method with n=0 getFactorial(0)
//        Expected result:
//              Get 1 as the result of 0!
//        Actual result/Status (passed, failed) (waiting for test run)
        
//        Test run: run test case
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(0); //named-argument
        System.out.println("expected value: " + expectedResult 
                        + " | actual value: " + actualResult);
    }
    
}