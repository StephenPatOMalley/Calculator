package ie.gmit;

public class Calculator {

    public static int Add(int firstNum, int secondNum){

        int addedNum = 0;
        addedNum = firstNum + secondNum;

        return addedNum;
    }
    public static void main(String args[]) {
        int num1 = 3, num2 = 5, added = 0;

        added = Add(num1, num2);
        System.out.println(added);
    }
}
