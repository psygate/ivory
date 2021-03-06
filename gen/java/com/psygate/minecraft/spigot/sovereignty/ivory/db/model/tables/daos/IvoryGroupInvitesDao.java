/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.daos;


import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvoryGroupInvites;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.records.IvoryGroupInvitesRecord;
import com.psygate.minecraft.spigot.sovereignty.ivory.groups.Rank;

import java.sql.Timestamp;
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
public class IvoryGroupInvitesDao extends DAOImpl<IvoryGroupInvitesRecord, com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupInvites, Record2<UUID, Long>> {

	/**
	 * Create a new IvoryGroupInvitesDao without any configuration
	 */
	public IvoryGroupInvitesDao() {
		super(IvoryGroupInvites.IVORY_GROUP_INVITES, com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupInvites.class);
	}

	/**
	 * Create a new IvoryGroupInvitesDao with an attached configuration
	 */
	public IvoryGroupInvitesDao(Configuration configuration) {
		super(IvoryGroupInvites.IVORY_GROUP_INVITES, com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupInvites.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Record2<UUID, Long> getId(com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupInvites object) {
		return compositeKeyRecord(object.getPuuid(), object.getGroupId());
	}

	/**
	 * Fetch records that have <code>group_id IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupInvites> fetchByGroupId(Long... values) {
		return fetch(IvoryGroupInvites.IVORY_GROUP_INVITES.GROUP_ID, values);
	}

	/**
	 * Fetch records that have <code>puuid IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupInvites> fetchByPuuid(UUID... values) {
		return fetch(IvoryGroupInvites.IVORY_GROUP_INVITES.PUUID, values);
	}

	/**
	 * Fetch records that have <code>rank IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupInvites> fetchByRank(Rank... values) {
		return fetch(IvoryGroupInvites.IVORY_GROUP_INVITES.RANK, values);
	}

	/**
	 * Fetch records that have <code>inviter_puuid IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupInvites> fetchByInviterPuuid(UUID... values) {
		return fetch(IvoryGroupInvites.IVORY_GROUP_INVITES.INVITER_PUUID, values);
	}

	/**
	 * Fetch records that have <code>invitetime IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupInvites> fetchByInvitetime(Timestamp... values) {
		return fetch(IvoryGroupInvites.IVORY_GROUP_INVITES.INVITETIME, values);
	}

	/**
	 * Fetch records that have <code>expires IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos.IvoryGroupInvites> fetchByExpires(Timestamp... values) {
		return fetch(IvoryGroupInvites.IVORY_GROUP_INVITES.EXPIRES, values);
	}
}
