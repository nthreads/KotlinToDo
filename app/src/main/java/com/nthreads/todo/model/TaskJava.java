package com.nthreads.todo.model;

import java.util.Date;

/**
 * Created by Nauman Zubair on 10/11/2017.
 * Copyright (c) 2017 nThreads Apps. All rights reserved.
 */

public class TaskJava {
    private long id;
    private String title;
    private String description;
    private Date createdAt;

    public TaskJava(long id, String title, String description, Date createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskJava taskJava = (TaskJava) o;

        if (id != taskJava.id) return false;
        if (title != null ? !title.equals(taskJava.title) : taskJava.title != null) return false;
        if (description != null ? !description.equals(taskJava.description) : taskJava.description != null)
            return false;
        return createdAt != null ? createdAt.equals(taskJava.createdAt) : taskJava.createdAt == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskJava{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
