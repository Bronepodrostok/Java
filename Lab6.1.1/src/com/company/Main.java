package com.company;

import java.util.*;

public class Main {
    public static Boolean compare(int a, int b){
        if ((a==0 && b==9)) return true;
        if ((a==9 && b==0)) return false;
        if(a>b) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Print first deck: ");
        Deque<Integer> q1 = new ArrayDeque<>();
        int tmp;
        for (int i = 0; i < 5; i++) {
            tmp = cin.nextInt();
            q1.add(tmp);
        }
        System.out.print("Print second deck: ");
        Deque<Integer> q2 = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            tmp = cin.nextInt();
            q2.add(tmp);
        }
        int count =0;
        while (!q1.isEmpty()&&!q2.isEmpty()){
            System.out.println(count + ": " + q1 + "\n   " + q2);
            if (compare(q1.peek(),q2.peek())) {
                q1.addLast(q1.poll());
                q1.add(q2.poll());
            } else {
                q2.add(q1.poll());
                q2.addLast(q2.poll());
            }
            count++;
            if(count>105){
                System.out.println("botva\n");
                return;
            }
        }

        if(q2.isEmpty()) System.out.println("First "+count);
        else System.out.println("Second "+count);
    }
}
