/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables;


import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.Keys;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.Nucleus;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.records.IvoryPlayerMutesRecord;
import com.psygate.minecraft.spigot.sovereignty.nucleus.sql.util.UUIDByteConverter;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class IvoryPlayerMutes extends TableImpl<IvoryPlayerMutesRecord> {

	private static final long serialVersionUID = -1045058108;

	/**
	 * The reference instance of <code>nucleus.ivory_player_mutes</code>
	 */
	public static final IvoryPlayerMutes IVORY_PLAYER_MUTES = new IvoryPlayerMutes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IvoryPlayerMutesRecord> getRecordType() {
		return IvoryPlayerMutesRecord.class;
	}

	/**
	 * The column <code>nucleus.ivory_player_mutes.muted_puuid</code>.
	 */
	public final TableField<IvoryPlayerMutesRecord, UUID> MUTED_PUUID = createField("muted_puuid", org.jooq.impl.SQLDataType.BINARY.length(16).nullable(false), this, "", new UUIDByteConverter());

	/**
	 * The column <code>nucleus.ivory_player_mutes.puuid</code>.
	 */
	public final TableField<IvoryPlayerMutesRecord, UUID> PUUID = createField("puuid", org.jooq.impl.SQLDataType.BINARY.length(16).nullable(false), this, "", new UUIDByteConverter());

	/**
	 * Create a <code>nucleus.ivory_player_mutes</code> table reference
	 */
	public IvoryPlayerMutes() {
		this("ivory_player_mutes", null);
	}

	/**
	 * Create an aliased <code>nucleus.ivory_player_mutes</code> table reference
	 */
	public IvoryPlayerMutes(String alias) {
		this(alias, IVORY_PLAYER_MUTES);
	}

	private IvoryPlayerMutes(String alias, Table<IvoryPlayerMutesRecord> aliased) {
		this(alias, aliased, null);
	}

	private IvoryPlayerMutes(String alias, Table<IvoryPlayerMutesRecord> aliased, Field<?>[] parameters) {
		super(alias, Nucleus.NUCLEUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IvoryPlayerMutesRecord> getPrimaryKey() {
		return Keys.KEY_IVORY_PLAYER_MUTES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IvoryPlayerMutesRecord>> getKeys() {
		return Arrays.<UniqueKey<IvoryPlayerMutesRecord>>asList(Keys.KEY_IVORY_PLAYER_MUTES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IvoryPlayerMutes as(String alias) {
		return new IvoryPlayerMutes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IvoryPlayerMutes rename(String name) {
		return new IvoryPlayerMutes(name, null);
	}
}