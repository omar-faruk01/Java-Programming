package com.company;


class Triangle{
    int x;
    int y;
    int z;

    Triangle(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    };

    double getArea(){
        int p;
        int q;
        p = (x + y + z)/2;
        q = (p*(p-x)*(p-y)*(p-z));
        return Math.sqrt(q);
    }

    int getCircleLength()
    {
        int p;
        return p = (x + y + z);
    };
}

public class Lab2 {

    public static void main(String[] args)
    {
        Triangle desk = new Triangle(3,4,5);
        Triangle table = new Triangle(7,8,9);

        System.out.println("Triangle 1   Area: " + desk.getArea() + " Circle Length " + desk.getCircleLength());
        System.out.println("Triangle 2   Area: " + table.getArea() + " Circle Length " + table.getCircleLength());


    }

}
