package com.abhivanth.practice;

public class PracticeAccessModifier {
    private String Name = "Abhivanth ";
    private String Address = "Menlo Park USA";
    private static  int BuildingNumber = 15;
    protected float Coordinates = 1.000005f;
    public char initial = 'M';
    public boolean TrueOrfalse = false;
    int TestDefault = 1;

    private  String printString(){
        return (Name + Address);
    }
    static int getBuildingNumber(){
         int staticnumber = 10;
        return BuildingNumber;
    }
}
class TestPrivate extends PracticeAccessModifier{

    static int getBuildingNumber(){
        return 1;
    }
    public static void main(String[] args) {

        PracticeAccessModifier practiceAccessModifier = new PracticeAccessModifier();
        System.out.println(PracticeAccessModifier.getBuildingNumber());

        System.out.println(practiceAccessModifier.Coordinates);
        int number = PracticeAccessModifier.getBuildingNumber();
    }
}