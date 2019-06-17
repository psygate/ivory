/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos;


import com.psygate.minecraft.spigot.sovereignty.ivory.groups.Rank;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;


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
public class IvoryGroupMembers implements Serializable {

	private static final long serialVersionUID = -1230589235;

	private final Long      groupId;
	private final UUID      puuid;
	private final Rank      rank;
	private final Timestamp jointime;
	private final UUID      invitedByPuuid;
	private final Boolean   hiddenBool;

	public IvoryGroupMembers(IvoryGroupMembers value) {
		this.groupId = value.groupId;
		this.puuid = value.puuid;
		this.rank = value.rank;
		this.jointime = value.jointime;
		this.invitedByPuuid = value.invitedByPuuid;
		this.hiddenBool = value.hiddenBool;
	}

	public IvoryGroupMembers(
		Long      groupId,
		UUID      puuid,
		Rank      rank,
		Timestamp jointime,
		UUID      invitedByPuuid,
		Boolean   hiddenBool
	) {
		this.groupId = groupId;
		this.puuid = puuid;
		this.rank = rank;
		this.jointime = jointime;
		this.invitedByPuuid = invitedByPuuid;
		this.hiddenBool = hiddenBool;
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public UUID getPuuid() {
		return this.puuid;
	}

	public Rank getRank() {
		return this.rank;
	}

	public Timestamp getJointime() {
		return this.jointime;
	}

	public UUID getInvitedByPuuid() {
		return this.invitedByPuuid;
	}

	public Boolean getHiddenBool() {
		return this.hiddenBool;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("IvoryGroupMembers (");

		sb.append(groupId);
		sb.append(", ").append(puuid);
		sb.append(", ").append(rank);
		sb.append(", ").append(jointime);
		sb.append(", ").append(invitedByPuuid);
		sb.append(", ").append(hiddenBool);

		sb.append(")");
		return sb.toString();
	}
}