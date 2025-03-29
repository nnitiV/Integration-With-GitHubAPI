package com.github.api.githubapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitHubResponse {

	long id;
	String type;
	User actor;
	Repo repo;
	Payload payload;
	@JsonProperty("public")
	boolean isPublic;
	@JsonProperty("created_at")
	String createdAt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User getActor() {
		return actor;
	}

	public void setActor(User actor) {
		this.actor = actor;
	}

	public Repo getRepo() {
		return repo;
	}

	public void setRepo(Repo repo) {
		this.repo = repo;
	}

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public String getData() {
		return createdAt;
	}

	public void setData(String data) {
		this.createdAt = data;
	}

	@Override
	public String toString() {
		return "GitHubResponse [id=" + id + ", type=" + type + ", actor=" + actor + ", repo=" + repo + ", payload="
				+ payload + ", isPublic=" + isPublic + ", data=" + createdAt + "]";
	}

}
