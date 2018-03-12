package com.lfp.algorithm.sort;

/**
 * Project: lfp-algorithm
 * Title: 快速排序
 * Description: 选取基准值，将序列分为两部分，再递归求解每个子序列
 * Date: 2018-3-12
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class QuickSort implements LfpSort {
    @Override
    public String[] sort(String[] array) {
        quick(array, 0, array.length);
        return array;
    }

    private void quick(String[] array, int beg, int end){
        if (beg<end){
            int middle = partition(array, beg, end);
            quick(array, beg, middle-1);
            quick(array, middle, end);
        }
    }

    private int partition(String[] array, int beg, int end) {
        String base = array[beg];
        int index = beg+1;
        for (int i=beg+1;i<end;i++){
            if (array[i].compareTo(base)<0){
                String temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }
        array[beg] = array[index-1];
        array[index-1] = base;
        return index;
    }
}
