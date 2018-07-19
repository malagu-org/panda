package org.malagu.panda.dorado.linq.parser;

import com.bstek.dorado.data.provider.filter.SingleValueFilterCriterion;


/**
 *@author Kevin.yang
 *@since 2015年8月16日
 */
public interface CriterionParser {
	boolean parse(SingleValueFilterCriterion criterion);
}
