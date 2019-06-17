/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.daos;


import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvoryGroupMutes;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.records.IvoryGroupMutesRecord;

import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IvoryGroupMutesDao extends DAOImpl<IvoryGroupMutesRecord, com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupMutes, Record2<UUID, Long>> {

	/**
	 * Create a new IvoryGroupMutesDao without any configuration
	 */
	public IvoryGroupMutesDao() {
		super(IvoryGroupMutes.IVORY_GROUP_MUTES, com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupMutes.class);
	}

	/**
	 * Create a new IvoryGroupMutesDao with an attached configuration
	 */
	public IvoryGroupMutesDao(Configuration configuration) {
		super(IvoryGroupMutes.IVORY_GROUP_MUTES, com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupMutes.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Record2<UUID, Long> getId(com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupMutes object) {
		return compositeKeyRecord(object.getPuuid(), object.getGroupId());
	}

	/**
	 * Fetch records that have <code>group_id IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupMutes> fetchByGroupId(Long... values) {
		return fetch(IvoryGroupMutes.IVORY_GROUP_MUTES.GROUP_ID, values);
	}

	/**
	 * Fetch records that have <code>puuid IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupMutes> fetchByPuuid(UUID... values) {
		return fetch(IvoryGroupMutes.IVORY_GROUP_MUTES.PUUID, values);
	}
}