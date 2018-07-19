package org.malagu.panda.importexcel.converter.impl;

import org.apache.commons.lang.StringUtils;
import org.malagu.panda.importexcel.converter.TypeConverter;



public class StringTypeConverter implements TypeConverter {

	@Override
	public Object fromText(Class<?> type, String text) {
		if(StringUtils.isBlank(text)){
			return null;
		}
		return text;
	}

	@Override
	public boolean support(Class<?> clazz) {
		return clazz.isAssignableFrom(String.class);
	}

}
