package com.hypeone.logmonitoring.persistence.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class ServiceStatusEntity {

    private Integer id;
    private Integer serviceId;
    private String responseCode;
    private String response;
    private String status;
    private LocalDateTime createdAt;

    public ServiceStatusEntity() {

    }

    public ServiceStatusEntity(Integer id, Integer serviceId, String responseCode, String response, String status, LocalDateTime createdAt) {
        this.id = id;
        this.serviceId = serviceId;
        this.responseCode = responseCode;
        this.response = response;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceStatusEntity that = (ServiceStatusEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
