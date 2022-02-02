package ie.gmit;

public class Calculator {

    public int Add(int firstNum, int secondNum){

        int addedNum = 0;
        addedNum = firstNum + secondNum;

        return addedNum;
    }

    public int Subtract(int firstNum, int secondNum){
        int subNum = 0;
        subNum = firstNum - secondNum;

        return subNum;
    }

    public int Multiply(int firstNum, int secondNum){
        int mulNum = 0;
        mulNum = firstNum * secondNum;

        return mulNum;
    }

    public int Divide(int firstNum, int secondNum){
        int divNum = 0;
        divNum = firstNum / secondNum;

        return divNum;
    }

}
