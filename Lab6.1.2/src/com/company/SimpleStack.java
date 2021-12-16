package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleStack {
    public static String Stack(int word[]){
        String res = "";
        Deque<Integer> wordArray = new ArrayDeque<>();
        for(int i : word){
            if(i>0){
                wordArray.add(i);
                res = res.concat(",0");
            }
            else if(i == 0){
                if(wordArray.isEmpty()){
                    res = res.concat("-1");
                }
                else{
                    res = res.concat(",").concat(wordArray.pop().toString());
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {

        int word[] =new int[]{0,1,2,3,0,4,0,5,6,9,7,0,8,0,0,0,0,0};
        System.out.println(Stack(word));
    }
}
