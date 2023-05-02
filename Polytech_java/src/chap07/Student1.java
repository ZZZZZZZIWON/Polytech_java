package chap07;

import java.util.ArrayList;
import java.util.Scanner;

class Student1{
	private String name;
	private String dept;
	private int id;
	private double score;
	
	public Student1(String name, String dept, int id, double score) {
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + " 학과 : " + dept + " 학번 : " + id + " 학점평균 : " + score;
	}
		
}

