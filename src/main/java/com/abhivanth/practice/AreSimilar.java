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
                        if(b[i] == a[j]) {
                            //swap
                            isElementNotPresent = false;
                            int temp = b[j];
                            b[j] = b[i];
                            b[i] = temp;
                            break;
                        }
                    }
                }
                if(isElementNotPresent){
                    return false;
                }

            }
        }

        return (!isSwapRequired||numberOfSwaps==1);

    }
    boolean areSimilar1(int[] a, int[] b) {
        int unequalPairs = 0, productOfA = 1, productOfB = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                unequalPairs++;

            productOfA *= a[i];
            productOfB *= b[i];
        }
        return unequalPairs <= 2 && productOfA == productOfB;
    }


        public static void main(String[] args) {
        //TODO Auto-generated method stub
        AreSimilar obj1 = new AreSimilar();
        int[] a = {1,1,2,2,33,44};
        int[] b = {33,1,2,2,1,44};
//        System.out.println(obj1.areSimilar(a,b));
        System.out.println(obj1.areSimilar1(a,b));


    }
}
