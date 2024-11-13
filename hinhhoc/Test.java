package bai7;

import java.util.Scanner;
import java.util.*;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 3;
        ResizableCircle[] arr = new ResizableCircle[n];
        for(int i = 0; i < 3; i++){
            boolean check = false;
            
            while(!check){
                try{
                    check = true;
                    double radius = sc.nextDouble();
                    if(radius < 0){
                            radius = radius / 0;
                        }
                }catch(ArithmeticException e){
                    check = false;
                    System.out.println("Ban kinh phai lon hon 0!");
                    System.out.println("Nhap lai!");
                }catch(Exception e){
                    check = false;
                    System.out.println("Nhap sai du lieu!");
                    System.out.println("Nhap sai kieu du lieu cua ban kinh!");
                }
            }
            ResizableCircle x = new ResizableCircle(radius);
            arr[i] = x;
        }
        Arrays.sort(arr, new Comparator<ResizableCircle>(){

           
            public int compare(ResizableCircle o1, ResizableCircle o2) {
                if(o1.radius > o2.radius){
                    return 1;
                }else{
                    return -1;
                }
            }

        });
      
        for(int i = 0; i < 3; i++){
            System.out.println(arr[i]);
        }
    }
    
}
