/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables;


import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.Keys;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.Nucleus;
import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.records.IvoryTokensRecord;
import com.psygate.minecraft.spigot.sovereignty.ivory.groups.Rank;
import com.psygate.minecraft.spigot.sovereignty.ivory.sql.util.RankConverter;
import com.psygate.minecraft.spigot.sovereignty.nucleus.sql.util.UUIDByteConverter;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class IvoryTokens extends TableImpl<IvoryTokensRecord> {

	private static final long serialVersionUID = -502681963;

	/**
	 * The reference instance of <code>nucleus.ivory_tokens</code>
	 */
	public static final IvoryTokens IVORY_TOKENS = new IvoryTokens();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IvoryTokensRecord> getRecordType() {
		return IvoryTokensRecord.class;
	}

	/**
	 * The column <code>nucleus.ivory_tokens.group_id</code>.
	 */
	public final TableField<IvoryTokensRecord, Long> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>nucleus.ivory_tokens.token</code>.
	 */
	public final TableField<IvoryTokensRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>nucleus.ivory_tokens.rank</code>.
	 */
	public final TableField<IvoryTokensRecord, Rank> RANK = createField("rank", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "", new RankConverter());

	/**
	 * The column <code>nucleus.ivory_tokens.usages</code>.
	 */
	public final TableField<IvoryTokensRecord, Integer> USAGES = createField("usages", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>nucleus.ivory_tokens.creator</code>.
	 */
	public final TableField<IvoryTokensRecord, UUID> CREATOR = createField("creator", org.jooq.impl.SQLDataType.BINARY.length(16).nullable(false), this, "", new UUIDByteConverter());

	/**
	 * Create a <code>nucleus.ivory_tokens</code> table reference
	 */
	public IvoryTokens() {
		this("ivory_tokens", null);
	}

	/**
	 * Create an aliased <code>nucleus.ivory_tokens</code> table reference
	 */
	public IvoryTokens(String alias) {
		this(alias, IVORY_TOKENS);
	}

	private IvoryTokens(String alias, Table<IvoryTokensRecord> aliased) {
		this(alias, aliased, null);
	}

	private IvoryTokens(String alias, Table<IvoryTokensRecord> aliased, Field<?>[] parameters) {
		super(alias, Nucleus.NUCLEUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<IvoryTokensRecord> getPrimaryKey() {
		return Keys.KEY_IVORY_TOKENS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IvoryTokensRecord>> getKeys() {
		return Arrays.<UniqueKey<IvoryTokensRecord>>asList(Keys.KEY_IVORY_TOKENS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<IvoryTokensRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<IvoryTokensRecord, ?>>asList(Keys.IVORY_TOKENS_IBFK_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IvoryTokens as(String alias) {
		return new IvoryTokens(alias, this);
	}

	/**
	 * Rename this table
	 */
	public IvoryTokens rename(String name) {
		return new IvoryTokens(name, null);
	}
}
