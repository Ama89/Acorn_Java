package test.mypac;

public class Computer {
	public Cpu cpu;
	public Memory memory;
	public HardDisk hardDisk;
	
	/*
	 * 생성자를 하나라도 정의한 후 default 생성자를 정의하지 않으면
	 * default 생성자로 생성할 수 없음
	 */
//	public Computer(){
//		
//	}
		
	//Cpu, Memory, HardDisk type 데이터를 전달받는 생성자 정의
	public Computer(Cpu cpu, Memory memory, HardDisk hardDisk){
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
	}
}