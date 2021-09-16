package com.shrishti.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Features {
	private String oS;
	private String processor;

	public String getOs() {
		return oS;
	}

	@Value("Android")
	public void setOs(String oS) {
		this.oS = oS;
	}

	public String getProcessor() {
		return processor;
	}

	@Value("intell")
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Features [oS=" + oS + ", processor=" + processor + "]";
	}

}
