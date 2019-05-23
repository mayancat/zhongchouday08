package com.atguigu.atcrowdfunding.util;

public class AjaxResult {
	//表示成功还是失败
	private boolean success ;
	//原因
	private String message ;
	//封装的page对象
	private Page page ;

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
	
	
	
}
