package br.com.lovelo.enums;

public enum ClassTypeEnum {

	STRENCHT(1), 
	CARDIO(2);
	
	private Integer value;
	
	ClassTypeEnum(int value){
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}
}
