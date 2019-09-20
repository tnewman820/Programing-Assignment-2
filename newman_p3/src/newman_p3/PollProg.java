package newman_p3;

import java.util.Scanner;

public class PollProg {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//string creation
		String[] topics = new String[4+1];
		topics[0] = "Motorcycles";
		topics[1] = "Cars";
		topics[2] = "Gaming";
		topics[3] = "Powerlifting";
		topics[4] = "Politics";
		
		//variable declaration
		int [][] responses = new int[4+1][9+1]; 
		int n = 1, k = 0, topicNum, highestPoints, x = 1, y = 1;
		double topic1Avg, topic2Avg, topic3Avg, topic4Avg, topic5Avg;
		
		//while loop for each poll
		while(n != 1) {
			System.out.println("-------------------Poll " + n + "------------------");
			System.out.println("--       Please Rate From 1 to 10        --");
			System.out.println("--1: Least important | 10: Most important--");
			System.out.println("-------------------------------------------");
			System.out.println("");
			System.out.printf("Please rate how you feel about %s: ", topics[0]);
			responses[0][k] = scnr.nextInt();
			System.out.printf("Please rate how you feel about %s: ", topics[1]);
			responses[1][k] = scnr.nextInt();
			System.out.printf("Please rate how you feel about %s: ", topics[2]);
			responses[2][k] = scnr.nextInt();
			System.out.printf("Please rate how you feel about %s: ", topics[3]);
			responses[3][k] = scnr.nextInt();
			System.out.printf("Please rate how you feel about %s: ", topics[4]);
			responses[4][k] = scnr.nextInt();
			System.out.println();
			k++;
			//n++;
			System.out.println("Enter any key to add more responses, Enter 1 if you are finished");
			n = scnr.nextInt();
		}
		double nDouble = n;
		//average calculation
		topic1Avg = (responses[0][0] + responses[0][1] + responses[0][2] + responses[0][3] + responses[0][4] + responses[0][5] + responses[0][6] + responses[0][7] + responses[0][8] +responses[0][9])/nDouble;
		topic2Avg = (responses[1][0] + responses[1][1] + responses[1][2] + responses[1][3] + responses[1][4] + responses[1][5] + responses[1][6] + responses[1][7] + responses[1][8] +responses[1][9])/nDouble;
		topic3Avg = (responses[2][0] + responses[2][1] + responses[2][2] + responses[2][3] + responses[2][4] + responses[2][5] + responses[2][6] + responses[2][7] + responses[2][8] +responses[2][9])/nDouble;
		topic4Avg = (responses[3][0] + responses[3][1] + responses[3][2] + responses[3][3] + responses[3][4] + responses[3][5] + responses[3][6] + responses[3][7] + responses[3][8] +responses[3][9])/nDouble;
		topic5Avg = (responses[4][0] + responses[4][1] + responses[4][2] + responses[4][3] + responses[4][4] + responses[4][5] + responses[4][6] + responses[4][7] + responses[4][8] +responses[4][9])/nDouble;
		//Table for results
		System.out.println("------------Poll Results------------ ");
		System.out.println("-Topic#|1|2|3|4|5|6|7|8|9|10| Avg| - ");
		System.out.println("------------------------------------ ");
		System.out.println("Topic1:|" + responses[0][0] + " " + responses[0][1] + " " + responses[0][2] + " " + responses[0][3] + " " + responses[0][4] + " " + responses[0][5] + " " +  responses[0][6] + " " + responses[0][7] + " " + responses[0][8] + " " + responses[0][9] + " | " + topic1Avg);
		System.out.println("Topic2:|" + responses[1][0] + " " + responses[1][1] + " " + responses[1][2] + " " + responses[1][3] + " " + responses[1][4] + " " + responses[1][5] + " " +  responses[1][6] + " " + responses[1][7] + " " + responses[1][8] + " " + responses[1][9] + " | " + topic2Avg);
		System.out.println("Topic3:|" + responses[2][0] + " " + responses[2][1] + " " + responses[2][2] + " " + responses[2][3] + " " + responses[2][4] + " " + responses[2][5] + " " +  responses[2][6] + " " + responses[2][7] + " " + responses[2][8] + " " + responses[2][9] + " | " + topic3Avg);
		System.out.println("Topic4:|" + responses[3][0] + " " + responses[3][1] + " " + responses[0][2] + " " + responses[3][3] + " " + responses[3][4] + " " + responses[3][5] + " " +  responses[3][6] + " " + responses[3][7] + " " + responses[3][8] + " " + responses[3][9] + " | " + topic4Avg);
		System.out.println("Topic5:|" + responses[4][0] + " " + responses[4][1] + " " + responses[4][2] + " " + responses[4][3] + " " + responses[4][4] + " " + responses[4][5] + " " +  responses[4][6] + " " + responses[4][7] + " " + responses[4][8] + " " + responses[4][9] + " | " + topic5Avg);
		System.out.println();
		
		//calculate highest point total
		if(topic1Avg > topic2Avg && topic1Avg > topic3Avg && topic1Avg > topic4Avg && topic1Avg > topic5Avg) {
			topicNum = 0;
		}
		else if(topic2Avg > topic3Avg && topic2Avg > topic4Avg && topic2Avg > topic5Avg) {
			topicNum = 1;
		}
		else if(topic3Avg > topic4Avg && topic3Avg > topic5Avg) {
			topicNum = 2;
		}
		else if(topic4Avg > topic5Avg) {
			topicNum = 3;
		}
		else if(topic5Avg > topic4Avg){
			topicNum = 4;
		}
		//if no result is highest dont print one
		else {
			topicNum = 4;
			y = 0;
			System.out.println("Some issues rated the same, no highest to display!");
		}
		if(y != 0) {
		highestPoints = responses[topicNum][0] + responses[topicNum][1] + responses[topicNum][2] + responses[topicNum][3] + responses[topicNum][4] + responses[topicNum][5] + responses[topicNum][6] + responses[topicNum][7] + responses[topicNum][8] +responses[topicNum][9];
		System.out.println("The issue with the hightest point total was " + topics[topicNum] + " with " + highestPoints + " points!");
		}
		
		//calculate lowest point total
		if(topic1Avg < topic2Avg && topic1Avg < topic3Avg && topic1Avg < topic4Avg && topic1Avg < topic5Avg) {
			topicNum = 0;
		}
		else if(topic2Avg < topic3Avg && topic2Avg < topic4Avg && topic2Avg < topic5Avg) {
			topicNum = 1;
		}
		else if(topic3Avg < topic4Avg && topic3Avg < topic5Avg) {
			topicNum = 2;
		}
		else if(topic4Avg < topic5Avg) {
			topicNum = 3;
		}
		else if (topic5Avg < topic4Avg){
			topicNum = 4;
		}
		//if no result is lowest dont print one
		else {
			topicNum = 4;
			x = 0;
			System.out.println("Some issues rated the same, no lowest to display!");
		}
		if(x != 0) {
		highestPoints = responses[topicNum][0] + responses[topicNum][1] + responses[topicNum][2] + responses[topicNum][3] + responses[topicNum][4] + responses[topicNum][5] + responses[topicNum][6] + responses[topicNum][7] + responses[topicNum][8] +responses[topicNum][9];
		System.out.println("The issue with the lowest point total was " + topics[topicNum] + " with " + highestPoints + " points!");
		}
		
		scnr.close();
	}

}
