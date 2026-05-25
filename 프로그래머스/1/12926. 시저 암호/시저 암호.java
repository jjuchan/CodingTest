import java.io.*;
import java.util.*;


class Solution {
			public String solution(String s, int n) {

				char[] arr = s.toCharArray();

				for (int i = 0; i < arr.length; i++) {
					char c = arr[i];

					if (c  == ' ') continue;

					if(Character.isUpperCase(c)){
						arr[i] = (char)((c - 'A' + n) % 26 + 'A');
					} else if (Character.isLowerCase(c)){
						arr[i] = (char)((c - 'a' + n) % 26 + 'a');
					}
				}

				return String.valueOf(arr);
			}
		}