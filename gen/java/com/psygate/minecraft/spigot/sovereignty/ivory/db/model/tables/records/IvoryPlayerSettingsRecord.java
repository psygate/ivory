/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.records;


import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvoryPlayerSettings;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
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
public class IvoryPlayerSettingsRecord extends UpdatableRecordImpl<IvoryPlayerSettingsRecord> implements Record2<UUID, Boolean> {

	private static final long serialVersionUID = -2073514907;

	/**
	 * Setter for <code>nucleus.ivory_player_settings.puuid</code>.
	 */
	public void setPuuid(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nucleus.ivory_player_settings.puuid</code>.
	 */
	public UUID getPuuid() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>nucleus.ivory_player_settings.autoaccept_bool</code>.
	 */
	public void setAutoacceptBool(Boolean value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nucleus.ivory_player_settings.autoaccept_bool</code>.
	 */
	public Boolean getAutoacceptBool() {
		return (Boolean) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<UUID> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<UUID, Boolean> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<UUID, Boolean> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return IvoryPlayerSettings.IVORY_PLAYER_SETTINGS.PUUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field2() {
		return IvoryPlayerSettings.IVORY_PLAYER_SETTINGS.AUTOACCEPT_BOOL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value1() {
		return getPuuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value2() {
		return getAutoacceptBool();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IvoryPlayerSettingsRecord value1(UUID value) {
		setPuuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IvoryPlayerSettingsRecord value2(Boolean value) {
		setAutoacceptBool(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IvoryPlayerSettingsRecord values(UUID value1, Boolean value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IvoryPlayerSettingsRecord
	 */
	public IvoryPlayerSettingsRecord() {
		super(IvoryPlayerSettings.IVORY_PLAYER_SETTINGS);
	}

	/**
	 * Create a detached, initialised IvoryPlayerSettingsRecord
	 */
	public IvoryPlayerSettingsRecord(UUID puuid, Boolean autoacceptBool) {
		super(IvoryPlayerSettings.IVORY_PLAYER_SETTINGS);

		setValue(0, puuid);
		setValue(1, autoacceptBool);
	}
}