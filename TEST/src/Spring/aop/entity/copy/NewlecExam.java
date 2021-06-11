package Spring.aop.entity.copy;

public class NewlecExam implements Exam {
	
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public NewlecExam() {
		
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		//long start = System.currentTimeMillis();
		
		int result = kor+eng+math+com;
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//long end = System.currentTimeMillis();
		
		//String message = (end - start) + "ms ½Ã°£";
		//System.out.println(message);
		
		return result;
	}

	@Override
	public float avg() {
		float result = total() / 4.0f;
		return total() / 4.0f;
	}

	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}
	
	
}
