//package model;
//
//import java.time.LocalDate;
//
//public class  Blog
//{
//	 private long blogId;
//	 private String blogTitle;
//	 private String blogDescription;
//	 private LocalDate postedOn;
//	
//	
//	
//	public long getBlogId() {
//		return blogId;
//	}
//	public void setBlogId(long blogId) {
//		this.blogId = blogId;
//	}
//	public String getBlogTitle() {
//		return blogTitle;
//	}
//	public void setBlogTitle(String blogTitle) {
//		this.blogTitle = blogTitle;
//	}
//	public String getBlogDescription() {
//		return blogDescription;
//	}
//	public void setBlogDescription(String blogDescription) {
//		this.blogDescription = blogDescription;
//	}
//	public LocalDate getPostedOn() {
//		return postedOn;
//	}
//	
//	public void setPostedOn(LocalDate postedOn) {
//		this.postedOn = postedOn;
//	}
//	
//	 
//}


package model;

import java.time.LocalDate;

public class Blog{
	
	int blogId;
	String blogTitle;
	String blogDescription;
	LocalDate postedOn;

	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogDescription() {
		return blogDescription;
	}
	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}

}