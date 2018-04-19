package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class RoadlightEntity {
    @Id
    private int roadlightid;
    private String status;
    private String controlmode;


    public int getRoadlightid() {
        return roadlightid;
    }

    public void setRoadlightid(int roadlightid) {
        this.roadlightid = roadlightid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getControlmode() {
        return controlmode;
    }

    public void setControlmode(String controlmode) {
        this.controlmode = controlmode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoadlightEntity that = (RoadlightEntity) o;
        return roadlightid == that.roadlightid &&
                Objects.equals(status, that.status) &&
                Objects.equals(controlmode, that.controlmode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roadlightid, status, controlmode);
    }
}
