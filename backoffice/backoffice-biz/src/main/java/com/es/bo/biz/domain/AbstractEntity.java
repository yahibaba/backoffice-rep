package com.es.bo.biz.domain;

import java.time.LocalDateTime;

/**
 * Created by myachb on 3/8/2016.
 */
public class AbstractEntity {

    private LocalDateTime displayStartDate;
    private LocalDateTime displayEndDate;
    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime modifiedDate;
    private String modifiedBy;

    public LocalDateTime getDisplayStartDate() {
        return displayStartDate;
    }

    public void setDisplayStartDate(LocalDateTime displayStartDate) {
        this.displayStartDate = displayStartDate;
    }

    public LocalDateTime getDisplayEndDate() {
        return displayEndDate;
    }

    public void setDisplayEndDate(LocalDateTime displayEndDate) {
        this.displayEndDate = displayEndDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

}
