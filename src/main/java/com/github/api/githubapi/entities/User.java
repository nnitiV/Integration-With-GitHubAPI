package com.github.api.githubapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	long id;
	@JsonProperty("gravatar_id")
	long gravatarId;
	@JsonProperty("login")
	String username;
	@JsonProperty("display_login")
	String displayLogin;
	String url;
	@JsonProperty("avatar_url")
	String avatarUrl;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getGravatar_id() {
		return gravatarId;
	}

	public void setGravatar_id(long gravatarId) {
		this.gravatarId = gravatarId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getDisplayLogin() {
		return displayLogin;
	}

	public void setDisplayLogin(String displayLogin) {
		this.displayLogin = displayLogin;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", gravatar_id=" + gravatarId + ", username=" + username + ", url=" + url
				+ ", avatarUrl=" + avatarUrl + "]";
	}

}
