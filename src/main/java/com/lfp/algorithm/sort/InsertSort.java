package com.lfp.algorithm.sort;

/**
 * Project: lfp-algorithm
 * Title: 插入排序
 * Description: 依次选择并插入在正确的位置
 * Date: 2018-3-9
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class InsertSort implements LfpSort {
    @Override
    public String[] sort(String[] array) {
        int len = array.length;
        for (int i=1;i<len;i++){
            int preIndex = i-1;
            String current = array[i];
            while (preIndex>=0 && array[preIndex].compareTo(current)>0){
                array[preIndex+1] = array[preIndex];
                preIndex--;
            }
            array[preIndex+1] = current;
        }
        return array;
    }
}
