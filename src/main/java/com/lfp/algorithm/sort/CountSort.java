package com.lfp.algorithm.sort;

/**
 * Project: lfp-algorithm
 * Title: 计数排序
 * Description: 可以统计的数据序列，对数据进行分类，按照类别分别输出。
 * Date: 2018-3-12
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class CountSort implements LfpSort {
    @Override
    public String[] sort(String[] array) {
        int len = array.length;
        int[] counter = new int[10];
        for (int i=0;i<len;i++){
            counter[Integer.parseInt(array[i])]++;
        }
        String[] result = new String[len];
        int index = 0;
        for (int j=0;j<10;j++){
            if (counter[j]>0){
                for (int k=0;k<counter[j];k++){
                    result[index++] = String.valueOf(j);
                }
            }
        }
        return result;
    }
}
