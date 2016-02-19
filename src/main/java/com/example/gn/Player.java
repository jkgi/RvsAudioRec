package com.example.gn;

import com.garrytrue.producer_consumer.ProduceConsumeChain;

public class Player extends ProduceConsumeChain {

	public Player(String filename) {
		super(new ReadFileProducer(filename), new PlayConsumer(), 10);
		// TODO Auto-generated constructor stub
	}

}
