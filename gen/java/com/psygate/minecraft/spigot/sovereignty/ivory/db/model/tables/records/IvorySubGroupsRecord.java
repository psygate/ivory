/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.records;


import com.psygate.minecraft.spigot.sovereignty.ivory.db.model.tables.IvorySubGroups;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class IvorySubGroupsRecord extends TableRecordImpl<IvorySubGroupsRecord> implements Record2<Long, Long> {

	private static final long serialVersionUID = -1170669959;

	/**
	 * Setter for <code>nucleus.ivory_sub_groups.parent_id</code>.
	 */
	public void setParentId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nucleus.ivory_sub_groups.parent_id</code>.
	 */
	public Long getParentId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>nucleus.ivory_sub_groups.child_id</code>.
	 */
	public void setChildId(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nucleus.ivory_sub_groups.child_id</code>.
	 */
	public Long getChildId() {
		return (Long) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, Long> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return IvorySubGroups.IVORY_SUB_GROUPS.PARENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return IvorySubGroups.IVORY_SUB_GROUPS.CHILD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getParentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getChildId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IvorySubGroupsRecord value1(Long value) {
		setParentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IvorySubGroupsRecord value2(Long value) {
		setChildId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IvorySubGroupsRecord values(Long value1, Long value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IvorySubGroupsRecord
	 */
	public IvorySubGroupsRecord() {
		super(IvorySubGroups.IVORY_SUB_GROUPS);
	}

	/**
	 * Create a detached, initialised IvorySubGroupsRecord
	 */
	public IvorySubGroupsRecord(Long parentId, Long childId) {
		super(IvorySubGroups.IVORY_SUB_GROUPS);

		setValue(0, parentId);
		setValue(1, childId);
	}
}
