package com.lfp.algorithm.sort;

/**
 * Project: lfp-algorithm
 * Title: 希尔排序
 * Description: 分组进行排序，在减少分组大小。
 * Date: 2018-3-9
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class ShellSort implements LfpSort {
    @Override
    public String[] sort(String[] array) {
        int len = array.length;
        for(int gap=len/2;gap>0;gap/=2){
            for(int i=gap;i<len;i++){
                int j = i;
                while(j-gap>=0 && array[j].compareTo(array[j-gap])<0){
                    String temp = array[j];
                    array[j] = array[j-gap];
                    array[j-gap] = temp;
                    j-=gap;
                }
            }
        }
        return array;
    }
}
