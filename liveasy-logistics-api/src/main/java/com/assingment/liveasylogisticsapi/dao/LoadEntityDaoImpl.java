package com.assingment.liveasylogisticsapi.dao;

import com.assingment.liveasylogisticsapi.entity.LoadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;


@Repository
public class LoadEntityDaoImpl implements LoadEntityDao {

    private  EntityManager entityManager;

    @Autowired
    public LoadEntityDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void saveLoadEntity(LoadEntity loadEntity) {
        entityManager.persist(loadEntity);
    }

    @Override
    public LoadEntity getLoadEntityById(Long id) {
        return entityManager.find(LoadEntity.class, id);
    }

    @Override
    public List<LoadEntity> getAllLoadEntities() {
        TypedQuery<LoadEntity> query = entityManager.createQuery("SELECT FROM shipment", LoadEntity.class);
        return query.getResultList();
    }

    @Override
    public void updateLoadEntity(LoadEntity loadEntity) {
        entityManager.merge(loadEntity);
    }

    @Override
    public void deleteLoadEntity(Long id) {
        LoadEntity loadEntity = entityManager.find(LoadEntity.class, id);
        if (loadEntity != null) {
            entityManager.remove(loadEntity);
        }
    }
}
