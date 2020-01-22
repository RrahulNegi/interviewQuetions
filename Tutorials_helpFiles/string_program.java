//Anagram
String str1="Army";
String str2="Mary";
if(str1.length()==str2.length(){
char[] arr1 =str1.toLowerCase().toCharArray();
StringBuilder arr2 =new String(str2.toLowerCase());
	forEach(char c : arr1){
	int index=arr2.indexOf(""+c);
		if(index>-1)){
		arr2.deleteAt(index);
		}
	}
	if(arr2.toString.isEmpty()){
	System.out.println("Strings are anagram");
	}
}

//first Non Repeated character of String with Map
String str="Program";
char[] arr=str.toLowerCase().toCharArray();
Map<Character,Integer> map=new HashMap<>();
for(char c :arr){
 if(map.containsKey(c)){
		map.put(c,map.get(c)+1);
	}
 else{
		map.put(c,1);
 }
}
 for(Map.Entry<Character,Integer> set: map.entrySet()){
		if(set.getValue()==1){
			System.out.println("First Non Repeated Character: "+set.getKey());
			break;
		}
 }
 
//first Non Repeated character of String without Map
String str="Programp";
char[] arr=str.toLowerCase().toCharArray();
StringBuilder temp=new StringBuilder(str.toLowerCase().toString());
for(int i=0;i<arr.length;i++){
	int index=temp.indexOf(""+arr[i]);
	int lastIndex=temp.lastIndex(""+arr[i]);
	if(lastIndex - index <1){
		System.out.println("First Non Repeated Character: "+set.getKey());
		i=arr.length;
	}
}

//String reverse using recursion
String str="Program";
String rev=reverse(str);
System.out.println(rev);

private static String reverse(String str){
		if(null==str){
			return str;
		}
		if(null!=str&& str.length()<=1){
			return str;
		}
		char temp=str.charAt(str.length()-1);
		return temp+reverse(str.substring(0,str.length()-1));
}

//String reverse without recursion
String str="Program";
for(int i=str.length()-1;i>=0;--i){
		System.out.print(str.charAt(i));
}

//Find duplicate characters from 2 strings without using 2 loops
String str1="asdfg";
String str2="axcgg";
StringBuilder fstr=new StringBuilder(str2.toLowerCase());
StringBuilder finals=new StringBuilder();
char[] temp=str1.toLowerCase().toCharArray();
for(char c: temp){
	int index=str2.indexOf(c);
	if(str2.indexOf(c)>=0){
		 finals.append(c);
		}
}
System.out.println(finals);


//Find duplicate integer from 2 integer array without using 2 loops
int[] arr1={1,32,6,4,7,0};
int[] arr2={1,3,0,32,5};
Arrays.sort(arr1);//{0,1,4,6,7,32}
Arrays.sort(arr2);//{0,1,3,5,32}
List<Integer> list=new ArrayList<>()
for(int i=0, j=0,i<arr1.length && j<arr2.length;){
				if(arr1[i]==arr2[j]){
					list.add(arr1[i]);
					i++;
					j++;
					
				}
				else if(arr1[i]> arr2[j]){
					j++;
				}
				else if(arr1[i]< arr2[j]){
					i++;
				}
		}

		
//count number of vowels and consonants in a String
String str="Java";
int vowel=0,consonants=0;
for(int i=0;i<str.length();i++){
	char temp=str.charAt[i];
	if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'){
		++vowel;
	}
	else{
		++consonants;
		}
}
System.out.prinln("Vowels="+ vowel);
System.out.prinln("consonants="+ consonants);


//check if a String contains only digits
String str="1234$ k";
boolean flag=false;
for(int i=0;i<str.length();i++){
	if(!(str.charAt(i)>='0' && str.charAt(i)<='9')){
		{ 
			flag=true;
			i=str.length();
		}
	if(flag==false){
		System.out.println("String contains only digits");
	}else {
				System.out.println("String contains characters other than digits");
			}
	}
}

//permutations of a string using recursion

private static void  permutations(String str, String perm){
		if(null==str || str.length()==0){
			System.out.println(perm);
		}
		for(int i=0;i<str.length();i++){
			char temp=str.charAt(i);
			permutations(str.substring(0,i)+str.substring(i+1),perm+temp);
	}

}

//reverse words in a sentence without using library method
String str="Java is best programming language";
String[] temp=str.split(" ");
Stack stack=new Stack();
StringBuilder finals=new StringBuilder();
for(int i=0 ; i<temp.length(); i++)
	{
		stack.push(temp[i]);
	}
while(!stack.isEmpty()){
			finals.append(stack.pop()+" ");
		}
System.out.println("Reverse word String---"+ finals);


class Stack{
	String[] arr;
	int top=-1
	int len;
	Stack(int len){
		arr=new String[len];
		this.len=len;
	}
	public void push(String temp){
		if(top<len-1){
			arr.add(temp);
			++top;
		}
	}
	public String pop(){
		if(top!=-1){
			return arr.remove(top--);
		}
		return "";
	}
	public boolean isEmpty() {
		return top==-1;
	}
}

//palindrome
if(s.length()==0 || s.length()==1) {
			return true;
		}
if(str.charAt(0)==str.charAt(str.length-1))
	palindrome(str.substring(1,str.length-1));

return false;

1) How to find the maximum occurring character in given String? (solution)
Write an efficient Java/C/Python program to return the maximum occurring character in the input string e.g., if the input string is "Java" then the function should return 'a'.

public static void maximumOccuringCharacter(String str){
		Map<Character,Integer> map=new HashMap<>();
		char[] strarr=str.toCharArray();
		for(int i=0;i<strarr.length;i++){
			if(map.containsKey(strarr[i])){
				map.put(strarr[i],map.get(strarr[i])+1);
			}
			else{
				map.put(strarr[i],1);
			}
		}
		Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
		int count=1;
		List<Character> max=new ArrayList<>();
		for(Map.Entry<Character,Integer> entry:entrySet){
			if(entry.getValue()>count){
				if(!max.isEmpty()) {
					max.removeAll(max);
				}
				max.add(entry.getKey());
				count=entry.getValue();
				
			}
			else if(entry.getValue()==count){
				max.add(entry.getKey());
			}
		}
		
		
		System.out.println("maximumOccuringCharacter: "+max+" count: "+count);
}


2) How to remove all duplicates from a given string? (solution)
Write a program to remove all the duplicate characters from a given input String e.g. if given String is "Java" then output should be "Java". The second or further occurrence of duplicate should be removed.

public static void removeDuplicateCharFromString(String str){
		System.out.println("removeDuplicateCharFromString--->String with duplicates:  "+str);
		StringBuilder sb=new StringBuilder(str);
		char[] arr=str.toLowerCase().toCharArray();
		for(int i=0;i<arr.length;i++){
			int index=sb.toString().toLowerCase().indexOf(String.valueOf(arr[i]));
			int lastindex=sb.toString().toLowerCase().lastIndexOf(String.valueOf(arr[i]));
			if(lastindex-index>0){
				sb.deleteCharAt(lastindex);
			}
		}
		System.out.println("String without duplicates:  "+sb);
	}


3) How to print the duplicate characters from the given String? (solution)
Write an efficient Java/C/Python/Ruby program to return the duplicate characters from given String, for example if given String is "C++" then your program should print "+" Similarly, if input is "Java and JavaScript" then your program should print "J", "a" and "v". You can ignore case for finding duplicates.

		printDuplicateCharFromString("C++");
		printDuplicateCharFromString("Java and JavaScript");

	public static void printDuplicateCharFromString(String str){
		System.out.println("\nprintDuplicateCharFromString-->Original String with duplicates:  "+str);
		System.out.print("printDuplicateCharFromString--> Duplicates Characters:  ");
		StringBuilder sb=new StringBuilder(str.toLowerCase());
		char[] arr=str.toLowerCase().toCharArray();
		for(int i=0;i<arr.length;i++){
			if( sb.lastIndexOf(String.valueOf(arr[i])) - sb.indexOf(String.valueOf(arr[i])) > 0){
			//	sb.deleteCharAt(sb.lastIndexOf(String.valueOf(arr[i])));
				while(sb.indexOf(String.valueOf(arr[i]))>=0) {
					sb.deleteCharAt(sb.indexOf(String.valueOf(arr[i])));
				}
				System.out.print("\t"+arr[i]);
			}
		}
	}



4) How to remove characters from the first String which are present in the second String? (solution)
Write an efficient Java/c/Python function that takes two strings as arguments and removes the characters from the first string which are present in the second string. For example, if the first String "India is great" and second String is "in" then output should be "da s great"


5) How to check if two strings are rotations of each other? (solution)
Write an efficient program to test if two given String is a rotation of each other or not e.g. if given String is "XYZ" and "ZXY"/"YZX" then your function should return true but if the input is "XYZ" and "YXZ" then return false.

public static void printStringsInRotation(String str1,String str2){
	System.out.println("printStringsInRotation-->Original String:  "+str1);
	System.out.println("printStringsInRotation-->String to verify:  "+str2);
	char[] org=str1.toLowerCase().toCharArray();
	char[] arr=str2.toLowerCase().toCharArray();
	boolean rotation=true;
	if(org.length==arr.length){
		for(int i=0,j=org.length-1;i<arr.length;i++,--j){
			if(org[j]-arr[i]!=0){
				rotation=false;
			}
		}
	}
	else{
		rotation=false;
	}
	if(rotation==true){
		System.out.println("Strings are rotational");
	}
}


6) How to reverse a given String? (solution)
Write a program to reverse a String in C/Java/Python or choice of your programming language. You can write either the recursive or iterative solution. For example, if a given input is "abcd" then your function should return "dcba".


7) How to reverse String without recursion? (solution)
Same as the previous program but you cannot use recursion, this time, you must solve this problem in C/Java/Python using iteration or loops. If you are not familiar with recursion and iteration, you can further check the Algorithms and Data Structures - Part 1 and 2 courses on Pluralsight. One of the better course to start with fundamental techniques to solve algorithms based problems.





8) How to print all permutation of a String? (solution)
Write an efficient program to print all permutations of a given String in Java/C/Python or any programming language of your choice. For example, if given input is "123" then your program should print all 6 permutations e.g. "123", "132", "213", "231", "312" and "321".


9) How to find the first non-repeating character in a given String? (solution)
Write a program in any programming language you to find the first non-repeated character in a given String, for example, if given String is "Java" then first non-repeated character is "J"


10) How to reverse the words in a given String sentence? (solution)
Write an efficient program in Java or C++ to reverse the words in a given String sentence. For example, if the input is "Java is best" then your program should print "best is Java". There is no restriction on preserving white space.


11) How to find the smallest substring in a given string containing all characters of another string? (solution)
Write an efficient function in C/C++ or Java to print the smallest substring in a given String containing all characters of another String. For example, if given String is "this is a test string" and "tist", then output should be "t stri".


12) How to check if two given String is the anagram of each other? (solution)
Write an efficient program in Java/C/C++ to check if two String is an anagram of each other. An anagram contains are of the same length and contains the same character but in the different order for example "Army" and "Mary" is the anagram. Your program should return true if both Strings are the anagram, false otherwise
public static void anagram(String str,String ana){
		if(str.length()==ana.length()){
			char[] temp=str.toLowerCase().toCharArray();
			StringBuilder sb=new StringBuilder(ana.toLowerCase());
			for(int i=0;i<temp.length;i++){
				if(sb.indexOf(String.valueOf(temp[i]))>=0){
					sb.deleteCharAt(sb.indexOf(String.valueOf(temp[i])));
				}
			}
			if(sb.toString().isEmpty()){
				System.out.println(ana+"  is Anagram");
			}
			else{
				System.out.println(ana+"  is not Anagram");
			}
		}
	}
}

13) How do you check if a given String is Palindrome or not? (solution)
Write an efficient program in your favorite programming language to check if a Given a string is a palindrome, considering only alphanumeric characters and ignoring cases. For example,"121" is a palindrome, but "123" is not. Your function should return true if given String is a palindrome, false otherwise.

public static boolean palindrome(String str){
		if(str.length()==0|| str.length()==1){
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			return palindrome(str.substring(1,str.length()-1));
		}
		return false;
	}


14) How do you convert String to integer?  (solution)
Implement atoi() like function in C/C++/Java to convert a string to an integer. Consider all possible cases e.g. positive and negative String, the presence of + or - character etc. For example, if given input String is "123" then your program should return 123 and if a given input is "+231" then your program should return 231. I first learned about this problem on Programming Interviews Exposed: Secrets to Landing Your Next Job, one of the finest book on interviews and still its explanation is best I have read so far.

String Programming Interview Questions With Solutions


17) How do you remove a given character from String? (solution)
Write an efficient method in Java to remove all occurrence of a given character in Java. For example, if given String is "Programming" and given character to remove is "m" then your function should return "Prograing".


18) How do you count a number of words in String? (solution)
Write a program to count a number of words in a given String. The words are separated by the following characters: space (‘ ‘) or newline (‘\n’) or tab (‘\t’) or a combination of these. For example, if input "Java is great" your program should print 3.


19) How do you check if a given String contains valid parentheses? (solution)
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', write a function in Java or C++ to check if the input string is valid. The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not








	
	

	
