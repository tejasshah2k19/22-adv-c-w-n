package com.stag;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateTag extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {

		Date d  = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(d);
		JspWriter out = getJspContext().getOut();
		out.print(df.format(d));
	}
}
