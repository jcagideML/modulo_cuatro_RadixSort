package meli.ejerc;

import java.util.ArrayList;
import java.util.HashMap;

public class RadixSortEjerc
{
	public static void radixSort(int[] arr)
	{
		String[] myArr = StringUtil.toStringArray(arr);
		StringUtil.lNormalize(myArr,'0');
		HashMap<Integer, ArrayList<String>> map = new HashMap<>();

		int init = 0;
		while(init<10){
			map.put(init,new ArrayList<String>());
			init++;
		}

		for(int i = 0; i< myArr[0].length(); i++){
			for (String s: myArr) {
				char[] digits = s.toCharArray();
				int key = Integer.parseInt(String.valueOf(digits[digits.length-1-i]));
				map.get(key).add(s);
			}

			int aux = 0;

			for(int j = 0; j<map.keySet().size();j++){
				for(String s : map.get(j)){
					myArr[aux] = s;
					aux = aux +1;
				}

				map.get(j).clear();
			}
		}

		for(int i = 0; i<myArr.length;i++){
			arr[i] = Integer.parseInt(myArr[i]);
		}
	}

	public static void main(String[] args)
	{
		int[] arr={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}