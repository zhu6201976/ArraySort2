/**
真正的冒泡法排序，当然，大学学的也不错的，效果都是一样的。
冒泡排序算法
冒泡排序算法的运作如下：（从后往前）
比较相邻的元素。如果第一个比第二个大，就交换他们两个。
对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
针对所有的元素重复以上的步骤，除了最后一个。
持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
相同元素的前后顺序并没有改变，所以冒泡排序是一种稳定排序算法。
*/

import java.util.Scanner;
import java.util.Arrays;
public class Test{
	public static void main(String[] args){
		
		int[] numbers = {34,4,56,17,90,65};
		// 从小到大排序
		// 外循环控制轮数，6个数比较5轮
		for(int i=0;i<numbers.length-1;i++){
			for(int j=0;j<numbers.length-1-i;j++){
				if(numbers[j]>numbers[j+1]){
					numbers[j] = numbers[j]+numbers[j+1];
					numbers[j+1] = numbers[j]-numbers[j+1];
					numbers[j] = numbers[j]-numbers[j+1];
				}
			}
		}
		// 打印结果
		System.out.println("从小到大排序："+Arrays.toString(numbers));
	
	}
	
}

/**
34 4 56 17 90 65

4 34 17 56 65 90  第1轮，比较5次，确定了最大值90
4 17 34 56 65     第2轮，比较4次，确定了最大值65
4 17 34 56        第3轮，比较3次，确定了最大值56
4 17 34           第4轮，比较2次，确定了最大值34
4 17              第5轮，比较1次，确定了最大值17
*/

