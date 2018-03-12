package com.lfp.algorithm.sort;

/**
 * Project: lfp-algorithm
 * Title: 归并排序
 * Description: 利用分治思想，先将子序列排序，在归并。
 * Date: 2018-3-12
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class MergeSort implements LfpSort {
    @Override
    public String[] sort(String[] array) {
        int len = array.length;
        if (len<2) return array;
        int middle = len/2;
        String[] arrayOne = new String[middle];
        String[] arrayTwo = new String[len-middle];
        System.arraycopy(array, 0, arrayOne, 0, middle);
        System.arraycopy(array, middle, arrayTwo, 0, len-middle);

        return merge(sort(arrayOne), sort(arrayTwo));
    }

    private String[] merge(String[] arrayOne, String[] arrayTwo){
        String [] result = new String[arrayOne.length+arrayTwo.length];
        int indexOne = 0;
        int indexTwo = 0;
        int indexRet = 0;
        while (indexOne<arrayOne.length && indexTwo<arrayTwo.length){
            if (arrayOne[indexOne].compareTo(arrayTwo[indexTwo])<0){
                result[indexRet++] = arrayOne[indexOne++];
            }else{
                result[indexRet++] = arrayTwo[indexTwo++];
            }
        }
        while (indexOne<arrayOne.length){
            result[indexRet++] = arrayOne[indexOne++];
        }
        while (indexTwo<arrayTwo.length){
            result[indexRet++] = arrayTwo[indexTwo++];
        }
        return result;
    }

}
