/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.pojos;


import com.psygate.minecraft.spigot.sovereignty.ivory.groups.Rank;

import java.io.Serializable;
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
public class IvoryTokens implements Serializable {

	private static final long serialVersionUID = 1554476970;

	private final Long    groupId;
	private final String  token;
	private final Rank    rank;
	private final Integer usages;
	private final UUID    creator;

	public IvoryTokens(IvoryTokens value) {
		this.groupId = value.groupId;
		this.token = value.token;
		this.rank = value.rank;
		this.usages = value.usages;
		this.creator = value.creator;
	}

	public IvoryTokens(
		Long    groupId,
		String  token,
		Rank    rank,
		Integer usages,
		UUID    creator
	) {
		this.groupId = groupId;
		this.token = token;
		this.rank = rank;
		this.usages = usages;
		this.creator = creator;
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public String getToken() {
		return this.token;
	}

	public Rank getRank() {
		return this.rank;
	}

	public Integer getUsages() {
		return this.usages;
	}

	public UUID getCreator() {
		return this.creator;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("IvoryTokens (");

		sb.append(groupId);
		sb.append(", ").append(token);
		sb.append(", ").append(rank);
		sb.append(", ").append(usages);
		sb.append(", ").append(creator);

		sb.append(")");
		return sb.toString();
	}
}
