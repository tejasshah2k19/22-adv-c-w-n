package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.TagSupport;

public class GreetTag extends TagSupport {

	PageContext pageContext; 
	BodyContent bodyContent;
	
	
	
	@Override
	public int doStartTag() throws JspException {

		JspWriter out = pageContext.getOut();
		String str = bodyContent.getString();
		try {
			out.print("Welcome..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return EVAL_BODY_INCLUDE;// body
//		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {

		return EVAL_PAGE;
//		return SKIP_PAGE;
	}
}

//
//public class GreetTag implements Tag {
//
//	PageContext pageContext;
//	Tag parent;
//
//	public Tag getParent() {
//		return parent;
//	}
//
//	public void setParent(Tag parent) {
//		this.parent = parent;
//	}
//
//	public PageContext getPageContext() {
//		return pageContext;
//	}
//
//	public void setPageContext(PageContext pageContext) {
//		this.pageContext = pageContext;
//	}
//
//	public int doStartTag() throws JspException {
//		// TODO Auto-generated method stub
//		JspWriter out = getPageContext().getOut();
//		return 0;
//	}
//
//	public int doEndTag() throws JspException {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public void release() {
//
//	}
//}

//<greet></greet>
//<greet/>
