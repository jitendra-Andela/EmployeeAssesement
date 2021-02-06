package com.automate.Project;

public class ProjectResponse<T> {
    private String message;
    private boolean isSuccess;
    private T data;

    public ProjectResponse(String cannot_created_project, boolean b) {
        this.message = message;
        this.isSuccess = isSuccess;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
