package com.lfp.algorithm.sort;

/**
 * Project: lfp-algorithm
 * Title: 选择排序
 * Description: 每次选择最小的放在前面
 * Date: 2018-3-9
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class SelectSort implements LfpSort {
    @Override
    public String[] sort(String[] array) {
        int len = array.length;
        for (int i=0;i<len-1;i++){
            int minIndex = i;
            for (int j=i+1;j<len;j++){
                if (array[j].compareTo(array[minIndex])<0){
                    minIndex = j;
                }
            }
            String temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}
