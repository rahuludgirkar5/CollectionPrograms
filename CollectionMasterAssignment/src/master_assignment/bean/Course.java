package master_assignment.bean;

import java.util.Date;

public class Course {
	public int  courseId;
	public String course_name;
	public Date startDate ;
	public String subject;
	public int courseFees;
	public String duration ;
	
	public Course(int  courseId,String course_name,Date startDate,String subject,int fees,String duration )
	{
		this.courseId=courseId;
		this.course_name=course_name;
		this.startDate=startDate;
		this.subject=subject;
		this.courseFees=fees;
		this.duration=duration;
	}
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String toString()
	{
		return("course id:  "+this.courseId+" "+"course name:  "+this.course_name+" "+"start date: "
	+this.startDate+" "+"subject: "+this.subject+" "+"course fees: "+courseFees+" "+"course duration: "+this.duration+"\n");
		
	}
	
}
