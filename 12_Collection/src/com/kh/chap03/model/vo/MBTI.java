package com.kh.chap03.model.vo;

import java.util.Objects;

public class MBTI {
	private String introversionExtroversion;
	private String sensigniNtuition;
	private String thinkingFeeling;
	private String judgingPerceiving;
	
	
	
	public MBTI() {
		super();
	}
	
	
	public MBTI(String introversionExtroversion, String sensigniNtuition, String thinkingFeeling,
			String judgingPerceiving) {
		super();
		this.introversionExtroversion = introversionExtroversion;
		this.sensigniNtuition = sensigniNtuition;
		this.thinkingFeeling = thinkingFeeling;
		this.judgingPerceiving = judgingPerceiving;
	}
	
	
	public String getIntroversionExtroversion() {
		return introversionExtroversion;
	}
	public void setIntroversionExtroversion(String introversionExtroversion) {
		this.introversionExtroversion = introversionExtroversion;
	}
	
	public String getSensigniNtuition() {
		return sensigniNtuition;
	}
	public void setSensigniNtuition(String sensigniNtuition) {
		this.sensigniNtuition = sensigniNtuition;
	}
	
	public String getThinkingFeeling() {
		return thinkingFeeling;
	}
	public void setThinkingFeeling(String thinkingFeeling) {
		this.thinkingFeeling = thinkingFeeling;
	}
	
	public String getJudgingPerceiving() {
		return judgingPerceiving;
	}
	public void setJudgingPerceiving(String judgingPerceiving) {
		this.judgingPerceiving = judgingPerceiving;
	}
	
	@Override
	public String toString() {
		return "MBTI [introversionExtroversion=" + introversionExtroversion + ", sensigniNtuition=" + sensigniNtuition
				+ ", thinkingFeeling=" + thinkingFeeling + ", judgingPerceiving=" + judgingPerceiving + "]";
	}
	
	
	//결론적으로 우리가 해야할 일
	// 필드값이동일하다면
	// equals()와 hashCode()를 오버라이딩해서 동일한 결과값이 출력되도록 구현해야함
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MBTI other = (MBTI) obj;
		return Objects.equals(introversionExtroversion, other.introversionExtroversion)
				&& Objects.equals(judgingPerceiving, other.judgingPerceiving)
				&& Objects.equals(sensigniNtuition, other.sensigniNtuition)
				&& Objects.equals(thinkingFeeling, other.thinkingFeeling);
	}
	@Override
	public int hashCode() {
		return Objects.hash(introversionExtroversion, judgingPerceiving, sensigniNtuition, thinkingFeeling);
	}
}
