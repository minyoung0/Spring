package DI_project.di.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Newlecexam implements Exam {

	@Value("40")
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	
	//�⺻ ������
	public Newlecexam() {
		// TODO Auto-generated constructor stub
	}
	
	
	//�����ε� ������
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
		// TODO Auto-generated method stub
		return kor+eng+math+com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}

	@Override
	public String toString() {
		return "Newlecexam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

}
