package com.company;

public class Main {
    static class car
    {
        public void printType(){}
        public void printColor(){}
        public void printModel(){}
        public void printCost(){}
        public void printAll(){}
        {
            printType();
            printColor();
            printModel();
            printCost();
        }
    }
    static class BMW extends car
    {
        public void printType()
        {
            System.out.println("Тип автомобиля - легковой");
        }
        public void printColor()
        {
            System.out.println("Цвет автомобиля - черный");
        }
        public void printModel()
        {
            System.out.println("Модель автомобиля - BMW");
        }
        public void printCost()
        {
            System.out.println("Цена автомобиля - 1 млн.₽");
        }
    }
    static class Mersedes extends BMW
    {
        public void printColor()
        {
            System.out.println("Цвет автомобиля - белый");
        }
        public void printModel()
        {
            System.out.println("Модель автомобиля - Mersedes");
        }
        public void printCost()
        {
            System.out.println("Цена автомобиля - 1,5 млн.₽");
        }
    }


    public static void main(String[] args) {
        BMW BMW = new BMW();
        BMW.printAll();
        Mersedes Mersedes = new Mersedes();
        Mersedes.printAll();
    }
}