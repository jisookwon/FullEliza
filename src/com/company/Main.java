package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Full Eliza
        HashMap<String, String> table = new HashMap<String, String>();

        table.put("i", "you");
        table.put("me", "you");
        table.put("my", "your");
        table.put("am", "are");

        ArrayList<String> qualifierArr = new ArrayList<String>();
        qualifierArr.add("Why do you say that ");
        qualifierArr.add("You seem to think that ");
        qualifierArr.add("So, you are concerned that ");

        ArrayList<String> hedgeArr= new ArrayList<String>();
        hedgeArr.add("Please tell me more ");
        hedgeArr.add("Many of my patients tell me the same thing ");
        hedgeArr.add("It is getting late, maybe we had better quit ");

        Scanner keyboard = new Scanner(System.in);
        String answer;

        System.out.println("Good day. What is your problem?");

        while (true) {
            System.out.print("\nEnter your response here or Q to quit : ");
            answer = keyboard.nextLine().toLowerCase();
            if (answer.equals("q")) {
                break;
            } else {
                String[] answerArray = answer.split("\\s");

                for (String i : answerArray) {
                    System.out.println(i);
                }

                for (int j = 0; j < answerArray.length; j++) {
                    String answerKey = answerArray[j];
                    if (table.get(answerKey) != null) {
                        System.out.println(table.get(answerKey));
                        answerArray[j] = table.get(answerKey);
                    }
                    //else {
                        //System.out.println(answer);
                    //}
                }

                Random r = new Random();
                int k= (r.nextInt(3)-1);
                System.out.print(qualifierArr.get(k) + " ");
                for (String i : answerArray) {
                    System.out.print(i + " ");
                }
                System.out.println(".");


                Random rr = new Random();
                int l= (rr.nextInt(3)-1);
                System.out.println(hedgeArr.get(l));


                //System.out.print();
                if (answer.equalsIgnoreCase("I am feeling great") ){
                    break;
                }
            }
        }
        System.out.println("\n>>> BYE!!");// write your code here

    }
}




