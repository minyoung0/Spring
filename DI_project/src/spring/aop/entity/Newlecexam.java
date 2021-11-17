package spring.aop.entity;

public class Newlecexam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;

	// 기본 생성자
	public Newlecexam() {
		// TODO Auto-generated constructor stub
	}

	// 오버로딩 생성자
	public Newlecexam(int kor, int eng, int math, int com) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		//long start = System.currentTimeMillis();
		int result = kor + eng + math + com;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//long end = System.currentTimeMillis();
		//String message = (end - start) + "ms 시간이 걸렸습니다";
		//System.out.println(message);
		return result;
	}

	@Override
	public float avg() {
		float result = total() / 4.0f;
		return result;
	}

	@Override
	public String toString() {
		return "Newlecexam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

}
