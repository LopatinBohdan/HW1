import java.lang.reflect.Array;
import java.util.*;

import static java.util.Collections.sort;
import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
//        System.out.println("Task1");
//        System.out.println("\"Your time is limited,\n" +
//                "\tso don’t waste it\n" +
//                "\t\tliving someone else’s life\n" +
//                "\t\t\tSteve Jobs\"");

//        System.out.println("Task2");
//
//        System.out.println("Enter a number");
//        int num= scanner.nextInt();
//
//        System.out.println("Enter a percent");
//        int percent=scanner.nextInt();
//
//        double result=(num*percent)/100;
//
//        System.out.println("Result: "+result);

//        System.out.println("Task3");
//
//        System.out.println("Enter first number");
//        int first=scanner.nextInt();
//        System.out.println("Enter second number");
//        int second=scanner.nextInt();
//        System.out.println("Enter third number");
//        int third=scanner.nextInt();
//
//        String res=Integer.toString(first)+Integer.toString(second)+Integer.toString(third);
//
//        System.out.println(res);

//        System.out.println("Task4");
//
//        System.out.println("Enter 6 digit number");
//        int num=scanner.nextInt();
//
//        if(num<100000 || num>999999){
//            System.out.println("Invalid number");
//        }
//        else{
//            int[] arr= DigitToArr(num);
//            SwapElements(arr,0,5);
//            SwapElements(arr,1,4);
//            System.out.println(Arrays.toString(arr));
//        }

//        System.out.println("Task5");
//        System.out.println("Enter a month number");
//        int month=scanner.nextInt();
//        if(month<1||month>12){
//            System.out.println("Invalid month entered");
//        }
//        else if((month>0&&month<3)|| month==12 ){
//            System.out.println("Winter");
//        }
//        else if(month>2&&month<6){
//            System.out.println("Spring");
//        }
//        else if(month>5&& month<9){
//            System.out.println("Summer");
//        }
//        else {
//            System.out.println("Autumn");
//        }

//        System.out.println("Task6");
//
//        System.out.println("Enter meters amount");
//        int meter=scanner.nextInt();
//
//        System.out.println("Make your choice:");
//        System.out.println("1. Miles");
//        System.out.println("2. Inches");
//        System.out.println("3. Yards");
//        int choice=scanner.nextInt();
//        double result=0;
//
//        switch (choice){
//            case 1:{
//                result=ToMiles(meter);
//                System.out.println(result);
//            }break;
//
//            case 2:{
//                result=ToInches(meter);
//                System.out.println(result);
//            }break;
//
//            case 3:{
//                result=ToYards(meter);
//                System.out.println(result);
//            }break;
//
//            default:{
//                System.out.println("Invalid choice");
//            }
//        }

        System.out.println("Task7");
//        Користувач вводить з клавіатури два числа. Потрібно вивести всі непарні числа в вказаному
//        діапазоні. Якщо границі вказані не вірно потрібно провести нормалізацію границь. Наприклад,
//                якщо ввели 20 і 11, потрібна нормалізація, після якої початок стане рівним 11, а кінець 20.

//        System.out.println("Enter start point");
//        int start=scanner.nextInt();
//        System.out.println("Enter end point");
//        int end=scanner.nextInt();
//
//        if(start>end){
//            int temp=start;
//            start=end;
//            end=temp;
//        }
//
//        System.out.println("Start: " +start);
//        System.out.println("End: " +end);
//
//        for (int i = start; i <end; i++) {
//            if(i%2!=0){
//                System.out.println(i);
//            }
//        }

//        Показати на екрані таблицю множення в діапазоні, вказаному користувачем. Наприклад, якщо
//        користувач вказав 3 і 5, таблиця може виглядати так

//        System.out.println("Task8");
//        System.out.println("Enter start point");
//        int start=scanner.nextInt();
//        System.out.println("Enter end point");
//        int end=scanner.nextInt();
//
//        if(start>end){
//            int temp=start;
//            start=end;
//            end=temp;
//        }
//
//        for (int i = start; i < end; i++) {
//            PrintTable(i);
//        }
        
//        System.out.println("Task9");
//
//        System.out.println("Enter length of array");
//        int size=scanner.nextInt();
//        if(size<2){
//            System.out.println("Invalid length");
//        }
//        else{
//            int[] arr=new int[size];
//            for (int i = 0; i < arr.length; i++) {
//                arr[i]=((int)(Math.random()*19-9));
//            }
//            System.out.println(Arrays.toString(arr));
//
//            int max=Arrays.stream(arr).max().getAsInt();
//            System.out.println("Max: "+max);
//            int min=Arrays.stream(arr).min().getAsInt();
//            System.out.println("Min: "+min);
//            ZeroCount(arr);
//            NegativeCount(arr);
//            PositiveCount(arr);
//        }

//        System.out.println("Task10");
//
//        System.out.println("Enter length of array");
//        int size=scanner.nextInt();
//        if(size<2){
//            System.out.println("Invalid length");
//        }
//        else{
//            int[] arr=new int[size];
//            for (int i = 0; i < arr.length; i++) {
//                arr[i]=((int)(Math.random()*19-9));
//            }
//            System.out.println(Arrays.toString(arr));
//
//          ArrayList<Integer> evens=new ArrayList<Integer>();
//          ArrayList<Integer> odds=new ArrayList<Integer>();
//          ArrayList<Integer> positive=new ArrayList<Integer>();
//          ArrayList<Integer> negative=new ArrayList<Integer>();
//
//          TakeEvens(arr,evens);
//          TakeOdds(arr,odds);
//          TakePositive(arr,positive);
//          TakeNegative(arr,negative);
//        }

//        System.out.println("Task11");
//        DrawLine(4,true,'t');
//        DrawLine(4,false,'f');

          System.out.println("Task12");
        System.out.println("Enter length of array");
        int size=scanner.nextInt();
        Integer[] arr=new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=((int)(Math.random()*19-9));
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.naturalOrder());
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));





    }

    public static void DrawLine(int length, boolean direction, char symbol){
        if(direction){
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        }
        else{
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
        }
    }
    public static void TakeEvens(int[] arr, ArrayList<Integer> list){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                list.add(arr[i]);
            }
        }
        System.out.println("Evens:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void TakeOdds(int[] arr, ArrayList<Integer> list){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                list.add(arr[i]);
            }
        }
        System.out.println("Odds:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void TakePositive(int[] arr, ArrayList<Integer> list){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                list.add(arr[i]);
            }
        }
        System.out.println("Positive:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void TakeNegative(int[] arr, ArrayList<Integer> list){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                list.add(arr[i]);
            }
        }
        System.out.println("Negative:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void ZeroCount(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count++;
            }
        }
        System.out.println("ZeroCount: " + count);
    }
    public static void NegativeCount(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                count++;
            }
        }
        System.out.println("NegativeCount: " + count);
    }
    public static void PositiveCount(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                count++;
            }
        }
        System.out.println("PositiveCount: " + count);
    }
    public static void PrintTable(int num){
        for (int i = 1; i < 10; i++) {
            System.out.println(num+"*"+i+"="+num*i);
        }
        System.out.println("\n");
    }
    public static double ToMiles(int num){
        double res=num/1609;
        return res;
    }
    public static double ToInches(int num){
        double res=num*39.37;
        return res;
    }
    public static double ToYards(int num){
        double res=num*1.094;
        return res;
    }
    public static void SwapElements(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static int[] DigitToArr(int num){
       int[] arr=new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[arr.length-1-i]=num%10;
            num/=10;
        }

        return arr;
    }

}