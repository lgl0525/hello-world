package com.qf.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class TbStrategy implements Serializable {
    private BigDecimal strId;

    private String strTitle;

    private String scenicSpot;

    private BigDecimal type;

    private String appropriateCrowd;

    private String appropriateTime;

    private String necessaryEquipment;

    private String mattersNeedAttention;

    private String particulars;

    private String img;

    private String chengshi;

    private String fabutime;

    private String faburen;

    private static final long serialVersionUID = 1L;

    public BigDecimal getStrId() {
        return strId;
    }

    public void setStrId(BigDecimal strId) {
        this.strId = strId;
    }

    public String getStrTitle() {
        return strTitle;
    }

    public void setStrTitle(String strTitle) {
        this.strTitle = strTitle == null ? null : strTitle.trim();
    }

    public String getScenicSpot() {
        return scenicSpot;
    }

    public void setScenicSpot(String scenicSpot) {
        this.scenicSpot = scenicSpot == null ? null : scenicSpot.trim();
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
        this.appropriateCrowd = appropriateCrowd == null ? null : appropriateCrowd.trim();
    }

    public String getAppropriateTime() {
        return appropriateTime;
    }

    public void setAppropriateTime(String appropriateTime) {
        this.appropriateTime = appropriateTime == null ? null : appropriateTime.trim();
    }

    public String getNecessaryEquipment() {
        return necessaryEquipment;
    }

    public void setNecessaryEquipment(String necessaryEquipment) {
        this.necessaryEquipment = necessaryEquipment == null ? null : necessaryEquipment.trim();
    }

    public String getMattersNeedAttention() {
        return mattersNeedAttention;
    }

    public void setMattersNeedAttention(String mattersNeedAttention) {
        this.mattersNeedAttention = mattersNeedAttention == null ? null : mattersNeedAttention.trim();
    }

    public String getParticulars() {
        return particulars;
    }

    public void setParticulars(String particulars) {
        this.particulars = particulars == null ? null : particulars.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getChengshi() {
        return chengshi;
    }

    public void setChengshi(String chengshi) {
        this.chengshi = chengshi == null ? null : chengshi.trim();
    }

    public String getFabutime() {
        return fabutime;
    }

    public void setFabutime(String fabutime) {
        this.fabutime = fabutime == null ? null : fabutime.trim();
    }

    public String getFaburen() {
        return faburen;
    }

    public void setFaburen(String faburen) {
        this.faburen = faburen == null ? null : faburen.trim();
    }
}