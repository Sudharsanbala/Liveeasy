package com.assingment.liveasylogisticsapi.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "shipment")
public class LoadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "loading_point")
    private String loadingPoint;

    @Column(name = "unloading_point")
    private String unloadingPoint;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "truck_type")
    private String truckType;

    @Column(name = "no_of_trucks")
    private Integer noOfTrucks;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "comment")
    private String optionalComment;

    @Column(name = "shipper_id")
    private UUID shipperId;

    @Column(name = "shipment_date")
    @Temporal(TemporalType.DATE)
    private Date date;

    // Default constructor
    public LoadEntity() {
    }

    // Parameterized constructor
    public LoadEntity(String loadingPoint, String unloadingPoint, String productType, String truckType, Integer noOfTrucks, Integer weight, String optionalComment, UUID shipperId, Date date) {
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.optionalComment = optionalComment;
        this.shipperId = shipperId;
        this.date = date;
    }

    // Getters and setters...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public Integer getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(Integer noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getOptionalComment() {
        return optionalComment;
    }

    public void setOptionalComment(String optionalComment) {
        this.optionalComment = optionalComment;
    }

    public UUID getShipperId() {
        return shipperId;
    }

    public void setShipperId(UUID shipperId) {
        this.shipperId = shipperId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "LoadEntity{" +
                "id=" + id +
                ", loadingPoint='" + loadingPoint + '\'' +
                ", unloadingPoint='" + unloadingPoint + '\'' +
                ", productType='" + productType + '\'' +
                ", truckType='" + truckType + '\'' +
                ", noOfTrucks=" + noOfTrucks +
                ", weight=" + weight +
                ", optionalComment='" + optionalComment + '\'' +
                ", shipperId=" + shipperId +
                ", date=" + date +
                '}';
    }
}


