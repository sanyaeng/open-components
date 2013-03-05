package com.wadpam.open.tag.dao;

import java.util.Date;

import net.sf.mardao.core.Filter;

/**
 * Implementation of Business Methods related to entity DTag. This (empty) class is generated by mardao, but edited by developers.
 * It is not overwritten by the generator once it exists.
 * 
 * Generated on 2013-03-01T11:56:39.376+0700.
 * 
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class DTagDaoBean extends GeneratedDTagDaoImpl implements DTagDao {

    public DTagDaoBean() {
        this.memCacheAll = true;
        this.memCacheEntities = true;
    }

    public boolean isRecordedModified(Date updatedDate) {
        final Filter filter = createGreaterThanOrEqualFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
        return queryIterableKeys(0, 1, null, null, COLUMN_NAME_UPDATEDDATE, false, null, false, filter).iterator().hasNext();

    }
}
