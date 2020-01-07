package com.in28minutes.springboot.web.model;

import java.util.Date;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Todo {

	private int id;

	@EqualsAndHashCode.Exclude
	private String user;

	@Size(min = 10, message = "Enter at least 10 Characters...")
	@EqualsAndHashCode.Exclude
	private String desc;

	/*
	 * /^(0?[1-9]|1[0-2])[\/](0?[1-9]|[12]\d|3[01])[\/](19|20)\d{2}$/
	 */
	@EqualsAndHashCode.Exclude
	/*
	 * @Pattern(message = "Invalid M/D/YYYY or MM/DD/YYYY", regexp =
	 * "^(0?[1-9]|1[0-2])[\\/](0?[1-9]|[12]\\d|3[01])[\\/](19|20)\\d{2}$")
	 */
	private Date targetDate;

	@EqualsAndHashCode.Exclude
	private boolean isDone;

//    public Todo() {
//    		super();
//    }
//    
//    public Todo(int id, String user, String desc, Date targetDate, boolean isDone) {
//        super();
//        this.id = id;
//        this.user = user;
//        this.desc = desc;
//        this.targetDate = targetDate;
//        this.isDone = isDone;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getUser() {
//        return user;
//    }
//
//    public void setUser(String user) {
//        this.user = user;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//
//    public Date getTargetDate() {
//        return targetDate;
//    }
//
//    public void setTargetDate(Date targetDate) {
//        this.targetDate = targetDate;
//    }
//
//    public boolean isDone() {
//        return isDone;
//    }
//
//    public void setDone(boolean isDone) {
//        this.isDone = isDone;
//    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + id;
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        Todo other = (Todo) obj;
//        if (id != other.id) {
//            return false;
//        }
//        return true;
//    }

//    @Override
//    public String toString() {
//        return String.format(
//                "Todo [id=%s, user=%s, desc=%s, targetDate=%s, isDone=%s]", id,
//                user, desc, targetDate, isDone);
//    }

}