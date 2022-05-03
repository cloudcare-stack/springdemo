package com.revature.springdemo.models;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

public class Todo {
    private int id;
    private String user;
    @Size(min=10, message="Enter at least 10 Characters...")
    private String desc;
    private Date targetDate;
    private boolean isDone;

    public Todo() {
        super();
    }

    public Todo(int id, String user, String desc, Date targetDate, boolean isDone) {
        super();
        this.id = id;
        this.user = user;
        this.desc = desc;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Todo)) return false;
        Todo todo = (Todo) o;
        return getId() == todo.getId() && isDone() == todo.isDone() && Objects.equals(getUser(), todo.getUser()) && Objects.equals(getDesc(), todo.getDesc()) && Objects.equals(getTargetDate(), todo.getTargetDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUser(), getDesc(), getTargetDate(), isDone());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Todo{");
        sb.append("id=").append(id);
        sb.append(", user='").append(user).append('\'');
        sb.append(", desc='").append(desc).append('\'');
        sb.append(", targetDate=").append(targetDate);
        sb.append(", isDone=").append(isDone);
        sb.append('}');
        return sb.toString();
    }
}
