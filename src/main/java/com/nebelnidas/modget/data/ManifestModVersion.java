package com.nebelnidas.modget.data;

import java.util.ArrayList;

public class ManifestModVersion {
	private String version;
	private ArrayList<String> minecraftVersions;
	private String md5;
	private String [] urls;

	public ManifestModVersion() {
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public ArrayList<String> getMinecraftVersions() {
		return this.minecraftVersions;
	}

	public void setMinecraftVersions(ArrayList<String> minecraftVersions) {
		this.minecraftVersions = minecraftVersions;
	}

	public String getMd5() {
		return this.md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String[] getUrls() {
		return this.urls;
	}

	public void setUrls(String[] urls) {
		this.urls = urls;
	}

}