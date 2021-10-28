package com.apll.lss.gspPlus.vis.json;

public class CacheScreenJsonVo {
	
	private String screenName;
	private int appLevelSkey;
	private int entitySkey;
	private String jsonFile;
	private String baseJson;
	
	public CacheScreenJsonVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CacheScreenJsonVo(String screenName, int appLevelSkey, int entitySkey, String jsonFile, String baseJson) {
		super();
		this.screenName = screenName;
		this.appLevelSkey = appLevelSkey;
		this.entitySkey = entitySkey;
		this.jsonFile = jsonFile;
		this.baseJson = baseJson;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getAppLevelSkey() {
		return appLevelSkey;
	}

	public void setAppLevelSkey(int appLevelSkey) {
		this.appLevelSkey = appLevelSkey;
	}

	public int getEntitySkey() {
		return entitySkey;
	}

	public void setEntitySkey(int entitySkey) {
		this.entitySkey = entitySkey;
	}

	public String getJsonFile() {
		return jsonFile;
	}

	public void setJsonFile(String jsonFile) {
		this.jsonFile = jsonFile;
	}

	public String getBaseJson() {
		return baseJson;
	}

	public void setBaseJson(String baseJson) {
		this.baseJson = baseJson;
	}

	@Override
	public String toString() {
		return "CacheScreenJsonVo [screenName=" + screenName + ", appLevelSkey=" + appLevelSkey + ", entitySkey="
				+ entitySkey + ", jsonFile=" + jsonFile + ", baseJson=" + baseJson + "]";
	}
	
	
	
	

}
