/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.records;


import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvoryPlayerMutes;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class IvoryPlayerMutesRecord extends UpdatableRecordImpl<IvoryPlayerMutesRecord> implements Record2<UUID, UUID> {

	private static final long serialVersionUID = 1919539517;

	/**
	 * Setter for <code>nucleus.ivory_player_mutes.muted_puuid</code>.
	 */
	public void setMutedPuuid(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nucleus.ivory_player_mutes.muted_puuid</code>.
	 */
	public UUID getMutedPuuid() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>nucleus.ivory_player_mutes.puuid</code>.
	 */
	public void setPuuid(UUID value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nucleus.ivory_player_mutes.puuid</code>.
	 */
	public UUID getPuuid() {
		return (UUID) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<UUID, UUID> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<UUID, UUID> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<UUID, UUID> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return IvoryPlayerMutes.IVORY_PLAYER_MUTES.MUTED_PUUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field2() {
		return IvoryPlayerMutes.IVORY_PLAYER_MUTES.PUUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value1() {
		return getMutedPuuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value2() {
		return getPuuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IvoryPlayerMutesRecord value1(UUID value) {
		setMutedPuuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IvoryPlayerMutesRecord value2(UUID value) {
		setPuuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IvoryPlayerMutesRecord values(UUID value1, UUID value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IvoryPlayerMutesRecord
	 */
	public IvoryPlayerMutesRecord() {
		super(IvoryPlayerMutes.IVORY_PLAYER_MUTES);
	}

	/**
	 * Create a detached, initialised IvoryPlayerMutesRecord
	 */
	public IvoryPlayerMutesRecord(UUID mutedPuuid, UUID puuid) {
		super(IvoryPlayerMutes.IVORY_PLAYER_MUTES);

		setValue(0, mutedPuuid);
		setValue(1, puuid);
	}
}
