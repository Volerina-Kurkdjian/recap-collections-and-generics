package hashtables;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoArraysIntersection {


    //Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
    //Example 1:
    //Input: nums1 = [1,2,2,1], nums2 = [2,2]
    //Output: [2]

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums2)
                .distinct()
                .filter(set1::contains)
                .toArray();

    }
}
