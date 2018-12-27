package com.mzbloc.elasticsearch.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mzbloc.elasticsearch.dao.ClienteRepository;
import com.mzbloc.elasticsearch.entity.ClienteEntity;
import com.mzbloc.elasticsearch.service.ClienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tanxw on 2018/11/21.
 */
@Service(interfaceClass = ClienteService.class)
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    private static final Logger LOG = LoggerFactory.getLogger(ClienteServiceImpl.class);

    @Override
    public ClienteEntity findCliente(String id)
    {
        ClienteEntity cliente = clienteRepository.findOne(id);
        LOG.info(" get cliente by id {} is {}", id, cliente);
        return cliente;
    }

}
