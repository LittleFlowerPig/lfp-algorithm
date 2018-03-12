package com.lfp.algorithm.sort;

import java.util.*;

/**
 * Project: lfp-algorithm
 * Title: 桶排序
 * Description: 对原始序列进行分组，对每组数据进行排序，在按分组输出。
 * Date: 2018-3-12
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class BucketSort implements LfpSort {
    @Override
    public String[] sort(String[] array) {
        int len = array.length;
        TreeMap<String, List<String>> bucket = new TreeMap<>();
        for (int i=0;i<len;i++){
            String key = array[i].substring(0,1);
            if (bucket.containsKey(key)){
                List<String> list = bucket.get(key);
                list.add(array[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(array[i]);
                bucket.put(key, list);
            }
        }


        String[] result = new String[len];
        int index = 0;
        for (String key : bucket.keySet()){
            List<String> list = bucket.get(key);
            list.sort(String::compareTo);
            for (String s : list){
                result[index++] = s;
            }
        }

        return result;
    }
}
