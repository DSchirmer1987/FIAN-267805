/**
 * Daniel Schirmer
 *
 * 30.11.2020
 * Project : Tag_04
 * ©2020
 *
 */

package tag_04;

public class SumUneven {
	public int boundary;
	public int sum;
	public int counter;
	
	public int getBoundary() {
		return boundary;
	}
	public void setBoundary(int boundary) {
		this.boundary = boundary;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public SumUneven(int boundary) {
		super();
		this.boundary = boundary;
		this.sum = 0;
		this.counter = 1;
	}
	
	public void calculate() {
		for (; counter <= boundary; counter++) {
			if(counter % 2 != 0) {
				sum = sum + counter;
			}
		}
		System.out.print("Die Summe der ungeraden Zahlen von 1 bis ");
		System.out.print(boundary);
		System.out.print(" ist ");
		System.out.println(sum);
	}
}
