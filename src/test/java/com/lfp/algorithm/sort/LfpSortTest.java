package com.lfp.algorithm.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Project: lfp-algorithm
 * Title:
 * Description:
 * Date: 2018-3-9
 * Copyright: Copyright (c) 2018
 * Company: LFP
 *
 * @author ZhuTao
 * @version 1.0
 */
public class LfpSortTest {

    private String[] array = {
            "3",
            "9",
            "5",
            "7",
            "8",
            "4",
            "1",
            "6",
            "0",
            "2"
    };

    private String result = "0,1,2,3,4,5,6,7,8,9,";

    private String print(String[] array){
        StringBuilder ret = new StringBuilder();
        for (String a : array){
            ret.append(a).append(",");
        }
        return ret.toString();
    }


    @Before
    public void init(){

    }

    @Test
    public void testBubbleSort(){
        LfpSort sort = new BubbleSort();
        String[] ret = sort.sort(array);
        Assert.assertEquals("排序结果不同", result, print(ret));
    }

    @Test
    public void testSelectSort(){
        LfpSort sort = new SelectSort();
        String[] ret = sort.sort(array);
        Assert.assertEquals("排序结果不同", result, print(ret));
    }

    @Test
    public void testInsertSort(){
        LfpSort sort = new InsertSort();
        String[] ret = sort.sort(array);
        Assert.assertEquals("排序结果不同", result, print(ret));
    }

    @Test
    public void testShellSort(){
        LfpSort sort = new ShellSort();
        String[] ret = sort.sort(array);
        Assert.assertEquals("排序结果不同", result, print(ret));
    }

    @Test
    public void testMergeSort(){
        LfpSort sort = new MergeSort();
        String[] ret = sort.sort(array);
        Assert.assertEquals("排序结果不同", result, print(ret));
    }

    @Test
    public void testQuickSort(){
        LfpSort sort = new QuickSort();
        String[] ret = sort.sort(array);
        Assert.assertEquals("排序结果不同", result, print(ret));
    }

    @Test
    public void testHeapSort(){
        LfpSort sort = new HeapSort();
        String[] ret = sort.sort(array);
        Assert.assertEquals("排序结果不同", result, print(ret));
    }

    @Test
    public void testCountSort(){
        LfpSort sort = new CountSort();
        String[] ret = sort.sort(array);
        Assert.assertEquals("排序结果不同", result, print(ret));
    }

    @Test
    public void testBucketSort(){
        LfpSort sort = new BucketSort();
        String[] ret = sort.sort(array);
        Assert.assertEquals("排序结果不同", result, print(ret));
    }

    @Test
    public void testRadixSort(){
        LfpSort sort = new RadixSort();
        String[] ret = sort.sort(array);
        Assert.assertEquals("排序结果不同", result, print(ret));
    }

}
