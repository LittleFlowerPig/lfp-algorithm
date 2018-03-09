package com.lfp.algorithm.sort;

/**
 * Project: lfp-algorithm
 * Title: 冒泡排序
 * Description: 每次将最大的沉淀到最下面
 * Date: 2018-3-9
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class BubbleSort implements LfpSort {

    @Override
    public String[] sort(String[] array) {
        int len = array.length;
        for (int i=0;i<len;i++){
            for (int j=0;j<len-1-i;j++){
                if (array[j].compareTo(array[j+1])>0){
                    String temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
