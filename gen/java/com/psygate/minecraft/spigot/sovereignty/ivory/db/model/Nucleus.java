/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.ivory.db.model;


import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvoryGroupInvites;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvoryGroupMembers;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvoryGroupMutes;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvoryGroups;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvoryPlayerMutes;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvoryPlayerSettings;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvorySubGroups;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvoryTokens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Nucleus extends SchemaImpl {

	private static final long serialVersionUID = -2067071629;

	/**
	 * The reference instance of <code>nucleus</code>
	 */
	public static final Nucleus NUCLEUS = new Nucleus();

	/**
	 * No further instances allowed
	 */
	private Nucleus() {
		super("nucleus");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			IvoryGroups.IVORY_GROUPS,
			IvoryGroupInvites.IVORY_GROUP_INVITES,
			IvoryGroupMembers.IVORY_GROUP_MEMBERS,
			IvoryGroupMutes.IVORY_GROUP_MUTES,
			IvoryPlayerMutes.IVORY_PLAYER_MUTES,
			IvoryPlayerSettings.IVORY_PLAYER_SETTINGS,
			IvorySubGroups.IVORY_SUB_GROUPS,
			IvoryTokens.IVORY_TOKENS);
	}
}
