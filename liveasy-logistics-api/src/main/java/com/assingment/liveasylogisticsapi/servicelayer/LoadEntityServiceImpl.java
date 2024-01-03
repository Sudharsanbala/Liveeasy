package com.assingment.liveasylogisticsapi.servicelayer;

import com.assingment.liveasylogisticsapi.dao.LoadEntityDao;
import com.assingment.liveasylogisticsapi.entity.LoadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class LoadEntityServiceImpl implements LoadEntityService {

    private final LoadEntityDao loadEntityDao;

    @Autowired
    public LoadEntityServiceImpl(LoadEntityDao loadEntityDao) {
        this.loadEntityDao = loadEntityDao;
    }

    @Override
    @Transactional
    public void saveLoadEntity(LoadEntity loadEntity) {
        loadEntityDao.saveLoadEntity(loadEntity);
    }

    @Override
    public LoadEntity getLoadEntityById(Long id) {
        return loadEntityDao.getLoadEntityById(id);
    }

    @Override
    public List<LoadEntity> getAllLoadEntities() {
        return loadEntityDao.getAllLoadEntities();
    }

    @Override
    @Transactional
    public void updateLoadEntity(LoadEntity loadEntity) {
        loadEntityDao.updateLoadEntity(loadEntity);
    }

    @Override
    @Transactional
    public void deleteLoadEntity(Long id) {
        loadEntityDao.deleteLoadEntity(id);
    }

    @Override
    public List<LoadEntity> getLoadsByShipperId(String shipperId) {
        return null;
    }

    @Override
    public void updateLoadEntity(Long loadId, LoadEntity updatedLoad) {

    }
}
