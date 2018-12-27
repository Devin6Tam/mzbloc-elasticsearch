package com.mzbloc.elasticsearch.service;

import com.mzbloc.elasticsearch.entity.ClienteEntity;

/**
 * Created by tanxw on 2018/11/21.
 */
public interface ClienteService {

    ClienteEntity findCliente(String id);
}
