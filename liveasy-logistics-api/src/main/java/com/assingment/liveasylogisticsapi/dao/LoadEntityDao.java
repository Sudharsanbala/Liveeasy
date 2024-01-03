package com.assingment.liveasylogisticsapi.dao;

import com.assingment.liveasylogisticsapi.entity.LoadEntity;

import java.util.List;

public interface LoadEntityDao {

    void saveLoadEntity(LoadEntity loadEntity);

    LoadEntity getLoadEntityById(Long id);

    List<LoadEntity> getAllLoadEntities();

    void updateLoadEntity(LoadEntity loadEntity);

    void deleteLoadEntity(Long id);
}
