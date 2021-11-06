package com.gb.lessons;

public class Main {

    public static void main(String[] args) {
        int countTrees = 1000;
        int balanced = 0;

        for (int i = 0; i < countTrees; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            fillMap(map);
            if (map.isBalanced()) {
                balanced++;
            }
        }
        System.out.println("Из " + countTrees + " MyTreeMap сбалансированы " + balanced + "\r\nнесбалансированы " + (countTrees - balanced) + " деревьев");
        System.out.println("Несбалансированы " + ((((float) (countTrees - balanced)) * 100) / (float) countTrees) + " %");
    }

    public static void fillMap(MyTreeMap<Integer, Integer> MyTreeMap) {
        while (MyTreeMap.height() < 6) {
            int randomNumber = -100 + (int) (Math.random() * 100);
            MyTreeMap.put(randomNumber, 0);
        }
    }
}
