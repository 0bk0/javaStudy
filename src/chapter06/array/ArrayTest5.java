package chapter06.array;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 오리지널:10 20 30 40 50 60 70 80 90 100
 * 변경하고 싶은 위치1을 입력하라
 * 1
 * 변경하고 싶은 위치2을 입력하라
 * 10
 * 뉴:100 20 30 40 50 60 70 80 90 10
 */
	/*	int[] score = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.print("Original: ");
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("\n변경하고 싶은 위치1을 입력하라: ");
		int a = scan.nextInt();
		System.out.println("변경하고 싶은 위치2을 입력하라: ");
		int b = scan.nextInt();
		
		int c;
		c=a*10;
		a=b*10;
		b=c*10;
		
		score = new int[] {100, 20, 30, 40, 50, 60, 70, 80, 90, 10};
		System.out.print("new: ");
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		}
	} */
		Scanner scan = new Scanner(System.in);
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.print("Original: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("\n변경하고 싶은 위치1을 입력하라: ");
		int a = scan.nextInt();
		System.out.println("변경하고 싶은 위치2을 입력하라: ");
		int b = scan.nextInt();
		int c;
		// 위치바꾸기(인덱스안에 값이 정수면 아무튼 됨)
		c= arr[a-1];
		arr[a-1] = arr[b-1];
		arr[b-1] = c;
		
		System.out.print("new: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}}}

