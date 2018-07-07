package com.moas.adam.lib;

public class BubbleSort {

    private int[] output;

    public BubbleSort(int[] input) {
        bubbleSort(input); //TODO refactor
    }

    private void bubbleSort(int[] input) {
        int temp;
        int length = input.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        output = input;
    }

    public int[] getSortedOutput() {
        return output;
    }

}
