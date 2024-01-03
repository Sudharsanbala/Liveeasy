package com.assingment.liveasylogisticsapi.servicelayer;

import com.assingment.liveasylogisticsapi.entity.LoadEntity;

import java.util.List;

public interface LoadEntityService {

    void saveLoadEntity(LoadEntity loadEntity);

    LoadEntity getLoadEntityById(Long id);

    List<LoadEntity> getAllLoadEntities();

    void updateLoadEntity(LoadEntity loadEntity);

    void deleteLoadEntity(Long id);

    List<LoadEntity> getLoadsByShipperId(String shipperId);

    void updateLoadEntity(Long loadId, LoadEntity updatedLoad);
}
