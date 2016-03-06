package com.funfit.usjr.thesis.backend.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class RequestRun implements Serializable{
	
	private int runId;
	private String date;
	private int distance;
	private int time;
	private int userId;
	
	public RequestRun(){}

	public RequestRun(int runId, String date, int distance, int time, int userId) {
		super();
		this.runId = runId;
		this.date = date;
		this.distance = distance;
		this.time = time;
		this.userId = userId;
	}

	public int getRunId() {
		return runId;
	}

	public void setRunId(int runId) {
		this.runId = runId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
