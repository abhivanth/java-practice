package com.abhivanth.practice;

public class AreSimilar {
    boolean areSimilar(int[] a, int[] b) {
        boolean isSwapRequired=false;

        int numberOfSwaps=0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] == b[i]) {
                continue;
            } else {
                isSwapRequired=true;
                numberOfSwaps++;
                if(numberOfSwaps>1) break;
                boolean isElementNotPresent=true;
                for (int j = i+1; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        //swap
                        isElementNotPresent=false;
                        int temp = b[j];
                        b[j] = b[i] ;
                        b[i] = temp;
                        break;
                    }
                }
                if(isElementNotPresent){
                    return false;
                }

            }
        }

        return (!isSwapRequired)||(isSwapRequired&&numberOfSwaps==1);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AreSimilar obj1 = new AreSimilar();
        int[] a = {1,2,2};
        int[] b = {2,1,1};
        System.out.println(obj1.areSimilar(a,b));


    }
}
