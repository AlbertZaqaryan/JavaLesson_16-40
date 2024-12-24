import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(next_prime(19));
    }

    static boolean is_prime(int number){
        boolean state = true;
        for(int i = 2; i < number; i ++){
            if(number % i == 0){
                state = false;
            }
        }
        return state;
    }

    static int next_prime(int number){
        number ++;
        while(!is_prime(number)){
            number++;
        }
        return number;
    }


}