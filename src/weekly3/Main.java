package weekly3;

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("((())())");
        list.add("(()()))(");
        list.add("((())");


        for(int i=0;i<list.size();i++){
            Stack<Character> stack=new Stack<>();
            validateInput(list, i, stack);
            printResult(stack);
        }

    }

    private static void validateInput(List<String> list, int i, Stack<Character> stack) {
        for(int j = 0; j< list.get(i).length(); j++){
            String input = list.get(i);
            if(input.charAt(j)=='('){
                stack.push(input.charAt(j));
            }else{
                if(stack.size()==0){
                    stack.push(input.charAt(j));
                    break;
                }else{
                    stack.pop();
                }
            }
        }
    }

    private static void printResult(Stack<Character> stack) {
        if(stack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
