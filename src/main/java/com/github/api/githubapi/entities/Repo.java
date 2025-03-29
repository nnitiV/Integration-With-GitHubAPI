package com.github.api.githubapi.entities;

public class Repo {
	long id;
	String name, url;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Repo [id=" + id + ", name=" + name + ", url=" + url + "]";
	}

}
