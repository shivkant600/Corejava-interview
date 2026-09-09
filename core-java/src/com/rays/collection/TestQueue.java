package com.rays.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new ArrayBlockingQueue<Integer>(3);

		q.offer(100);
		q.offer(200);
		q.add(300);

		
		// offer say add kara gai too false return kara gaa 
		System.out.println(q.offer(300));
		
		//orr add say add kara gai tooo excaption dai gaaa illegal state exception
    //	System.out.println(q.add(300));

		System.out.println(q);
	}

}