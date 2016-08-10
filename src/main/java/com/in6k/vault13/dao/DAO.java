package com.in6k.vault13.dao;

import java.util.List;

/**
 * Created by employee on 8/10/16.
 */
public interface DAO {
    // TODO: 8/10/16 Implement it!
    void insert();

    void getById(int id);

    void update(int id);

    void delete(int id);

    List gelAll();
}
