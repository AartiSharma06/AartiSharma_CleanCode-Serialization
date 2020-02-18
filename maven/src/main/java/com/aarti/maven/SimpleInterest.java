package com.aarti.maven;

public class SimpleInterest implements SimpleCompoundInterest {

		
		int principle;
		double rate,time;
		
		public SimpleInterest(int principle, double rate, double time) {
			super();
			this.principle = principle;
			this.rate = rate;
			this.time = time;
		}
		
		public double calculateInterest() {
			double simpleinterest=((principle*rate*time)/100.0);
			return simpleinterest;
		}

	}


