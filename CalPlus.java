package main;

public class CalPlus {

	private int result;
	
	public void add(int ... params) {
		for(Integer param : params) {
			this.result += param;
		}
	}
	
	public void mns(int ... params) {
		this.result = params[0] -= params[1];
	}

	public void mlp(int ... params) {
		this.result = params[0] * params[1];
	}

	public void dvd(int ... params) {
		this.result = params[0] / params[1];
	}
	
	public int getResult() {
		return this.result;
	}
	
	public void cleanResult() {
		this.result = 0;
	}
}
