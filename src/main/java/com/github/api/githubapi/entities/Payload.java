package com.github.api.githubapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Payload {
	String ref, description;
	@JsonProperty("ref_type")
	String refType;
	@JsonProperty("master_branch")
	String masterBranch;
	@JsonProperty("pusher_type")
	String pusherType;
	
	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getRefType() {
		return refType;
	}

	public void setRefType(String refType) {
		this.refType = refType;
	}

	public String getMasterBranch() {
		return masterBranch;
	}

	public void setMasterBranch(String masterBranch) {
		this.masterBranch = masterBranch;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPusherType() {
		return pusherType;
	}

	public void setPusherType(String pusherType) {
		this.pusherType = pusherType;
	}

	@Override
	public String toString() {
		return "Payload [ref=" + ref + ", refType=" + refType + ", masterBranch=" + masterBranch + ", description="
				+ description + ", pusherType=" + pusherType + "]";
	}

}
