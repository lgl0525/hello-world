package com.qf.vo;

import java.math.BigDecimal;

public class StrategyVo {

    private String strTitle;//标题
    private String scenicSpot;//景点
    private String imgUrl;//图片地址
    private BigDecimal type;//类型（主题游或时令游）
    private String appropriateCrowd;//适宜人群
    private String appropriateTime;//事宜时间
    private String necessaryEquipment;//必备装备
    private String mattersNeedAttention;//注意事项
    private String particulars;//详情
    private String chengshi;//城市
    private String fabuTime;//发布时间
    private String faburen;//发布人
	public StrategyVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StrategyVo(String strTitle, String scenicSpot, String imgUrl, BigDecimal type, String appropriateCrowd,
			String appropriateTime, String necessaryEquipment, String mattersNeedAttention, String particulars,
			String chengshi, String fabuTime, String faburen) {
		super();
		this.strTitle = strTitle;
		this.scenicSpot = scenicSpot;
		this.imgUrl = imgUrl;
		this.type = type;
		this.appropriateCrowd = appropriateCrowd;
		this.appropriateTime = appropriateTime;
		this.necessaryEquipment = necessaryEquipment;
		this.mattersNeedAttention = mattersNeedAttention;
		this.particulars = particulars;
		this.chengshi = chengshi;
		this.fabuTime = fabuTime;
		this.faburen = faburen;
	}
	public String getStrTitle() {
		return strTitle;
	}
	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}
	public String getScenicSpot() {
		return scenicSpot;
	}
	public void setScenicSpot(String scenicSpot) {
		this.scenicSpot = scenicSpot;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public BigDecimal getType() {
		return type;
	}
	public void setType(BigDecimal type) {
		this.type = type;
	}
	public String getAppropriateCrowd() {
		return appropriateCrowd;
	}
	public void setAppropriateCrowd(String appropriateCrowd) {
		this.appropriateCrowd = appropriateCrowd;
	}
	public String getAppropriateTime() {
		return appropriateTime;
	}
	public void setAppropriateTime(String appropriateTime) {
		this.appropriateTime = appropriateTime;
	}
	public String getNecessaryEquipment() {
		return necessaryEquipment;
	}
	public void setNecessaryEquipment(String necessaryEquipment) {
		this.necessaryEquipment = necessaryEquipment;
	}
	public String getMattersNeedAttention() {
		return mattersNeedAttention;
	}
	public void setMattersNeedAttention(String mattersNeedAttention) {
		this.mattersNeedAttention = mattersNeedAttention;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getChengshi() {
		return chengshi;
	}
	public void setChengshi(String chengshi) {
		this.chengshi = chengshi;
	}
	public String getFabuTime() {
		return fabuTime;
	}
	public void setFabuTime(String fabuTime) {
		this.fabuTime = fabuTime;
	}
	public String getFaburen() {
		return faburen;
	}
	public void setFaburen(String faburen) {
		this.faburen = faburen;
	}
	@Override
	public String toString() {
		return "StrategyVo [strTitle=" + strTitle + ", scenicSpot=" + scenicSpot + ", imgUrl=" + imgUrl + ", type="
				+ type + ", appropriateCrowd=" + appropriateCrowd + ", appropriateTime=" + appropriateTime
				+ ", necessaryEquipment=" + necessaryEquipment + ", mattersNeedAttention=" + mattersNeedAttention
				+ ", particulars=" + particulars + ", chengshi=" + chengshi + ", fabuTime=" + fabuTime + ", faburen="
				+ faburen + "]";
	}
	
}
