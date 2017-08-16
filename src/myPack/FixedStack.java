package myPack;

public class FixedStack implements Stack{
	int[] stack;
	private int size;
	static int position;
	static int maxSize=0;
	FixedStack(int size){
		this.size=size;
		stack =new int[size];
		this.position=0;
	}
	@Override
	public void push(int i) {
		if(maxSize>stack.length){
			System.out.println("Stack Overflow");
		}else
		{
		stack[position]=i;
		position++;
		maxSize++;
		
		}
		
		
	}

	@Override
	public int pop() {
		position--;
		return stack[position];
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
