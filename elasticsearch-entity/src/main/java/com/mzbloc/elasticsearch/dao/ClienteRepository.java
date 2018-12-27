package com.mzbloc.elasticsearch.dao;


import com.mzbloc.elasticsearch.entity.ClienteEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by tanxw on 2018/11/21.
 */
@Repository
public interface ClienteRepository extends ElasticsearchRepository<ClienteEntity, String> {

}
