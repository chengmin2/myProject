package com.jundeli.sslz.tool.protocol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import org.springframework.util.StringUtils;


public class SearchCondition  {

	/**
	 * 用于记录自定义查询条件值
	 */
	private List<Object> conditionvalue = new ArrayList<Object>();

	

	/**
	 * 用于记录request中参数名称及值
	 */
	private Map<String, Object> values = new HashMap<String, Object>();

	public SearchCondition(HttpServletRequest request) {
		if (null == request)
			return;
		for (Iterator<?> i = request.getParameterMap().keySet().iterator(); i
				.hasNext();) {
			String key = (String) i.next();
			values.put(key, request.getParameter(key));
		}
	}

	
	public String getValue(String key) {
		if (values.get(key) != null) {
			return (String) values.get(key);
		} else {
			return null;
		}
	}

	public Object[] getValues(String attributes) {
		List<String> attList = parseVertical(attributes);
		List<Object> objs = new ArrayList<Object>();
		for (String attName : attList) {
			if (attName.startsWith("%") && attName.endsWith("%")) {
				attName = attName.substring(1, attName.length() - 1);
				objs.add("%" + values.get(attName) + "%");
			} else if (attName.startsWith("%")) {
				attName = attName.substring(1);
				objs.add("%" + values.get(attName));
			} else if (attName.startsWith("%")) {
				attName = attName.substring(0, attName.length() - 1);
				objs.add("%" + values.get(attName));
			} else {
				objs.add(values.get(attName));
			}
		}
		return objs.toArray();
	}

	public Map<String, Object> getParameters() {
		return values;
	}

	public static List<String> parseVertical(String string) {
		List<String> list = new ArrayList<String>();
		StringTokenizer objTokenizer = new StringTokenizer(string, "|");
		while (objTokenizer.hasMoreTokens()) {
			list.add(objTokenizer.nextToken().trim());
		}
		return list;
	}


	public boolean valueIsEmpty(String key) {
		String v = getValue(key);
		if (v == null) {
			return true;
		} else {
			v = v.trim();
			if (v.length() == 0) {
				return true;
			}
		}
		return false;
	}


	public void setValue(String key, String val) {
		if (StringUtils.isEmpty(key))
			return;
		values.put(key, val);
	}


	public void addCustomCondition(Object o) {
		this.conditionvalue.add(o);
	}


	public Object[] getCustomCondition() {
		return this.conditionvalue.toArray();
	}


}
