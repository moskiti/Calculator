package com.company;

//Первая задача калькулятор:
//Должно быть 2 класса Main и Calculator
//В классе Main в args передается выражение в виде строки (например "2+2" или "2+2*2-10")
//Ты должен разложить его на элементы и для каждой операции вызвать соответствующий метод из класса Calculator
//Важно помнить о приоритетах операций умножение и деление выполняются до сложения и вычитания
//Можешь начать сначала с простых примеров (2 значения и одна операция), потом добавить еще значение,
// потом добавить скобки, а потом допустить, что числа могут быть дробными (например, 2,33)


public class Main {


    public static void main(String[] args) {
        System.out.println(Calculator.fillingStack("(12+2)*2"));
        System.out.println(Calculator.calculate(Calculator.fillingStack("(12+2)*2")));

    }
}