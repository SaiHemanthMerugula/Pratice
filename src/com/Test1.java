package com;

public class Test1 {

	public static void main(String[] args) {

		Test1 test = new Test1();
        String[] strs= {"dog","bat","cat"};
        String longestCommonPrefix = test.longestCommonPrefix(strs);
        System.out.println(longestCommonPrefix);
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "Nothing";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++)
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "Nothing";
			}
		return prefix;
	}
}
