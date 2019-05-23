package com.atguigu.atcrowdfunding.util;

import java.util.List;

public class Page {
	//当前页
	private Integer pageno;
	//页大小
	private Integer pagesize;
	//当前页数据
	private List datas;
	//总记录数
	private Integer totalsize;
	//总页数
	private Integer totalno;
	//要使用我的分页必须给我2个参数
	//构造方法  传递2个参数(当前页,每页显示记录条数)
	public Page(Integer pageno, Integer pagesize) {
		if (pageno <= 0) {
			this.pageno = 1;
		} else {
			this.pageno = pageno;
		}
		if (pagesize <= 0) {
			this.pagesize = 10;
		} else {
			this.pagesize = pagesize;
		}
	}

	public Integer getPageno() {
		return pageno;
	}

	public void setPageno(Integer pageno) {
		this.pageno = pageno;
	}

	public Integer getPagesize() {
		return pagesize;
	}

	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}

	public List getDatas() {
		return datas;
	}

	public void setDatas(List datas) {
		this.datas = datas;
	}

	public Integer getTotalsize() {
		return totalsize;
	}
	//当传递总记录数时，直接计算出总页数
	public void setTotalsize(Integer totalsize) {
		this.totalsize = totalsize;
		this.totalno = (totalsize % pagesize) == 0 ? (totalsize / pagesize) : (totalsize / pagesize + 1);
	}

	public Integer getTotalno() {
		return totalno;
	}
	//总页数，不允许其他程序调用，由setTotalsize直接计算得出
	private void setTotalno(Integer totalno) {
		this.totalno = totalno;
	}
	//取开始索引
	public Integer getStartIndex() {
		return (this.pageno - 1) * pagesize;
	}

}
