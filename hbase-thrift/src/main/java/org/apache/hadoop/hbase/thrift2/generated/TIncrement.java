/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Used to perform Increment operations for a single row.
 * 
 * You can specify how this Increment should be written to the write-ahead Log (WAL)
 * by changing the durability. If you don't provide durability, it defaults to
 * column family's default setting for durability.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-12-27")
public class TIncrement implements org.apache.thrift.TBase<TIncrement, TIncrement._Fields>, java.io.Serializable, Cloneable, Comparable<TIncrement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TIncrement");

  private static final org.apache.thrift.protocol.TField ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("row", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("attributes", org.apache.thrift.protocol.TType.MAP, (short)4);
  private static final org.apache.thrift.protocol.TField DURABILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("durability", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField CELL_VISIBILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("cellVisibility", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField RETURN_RESULTS_FIELD_DESC = new org.apache.thrift.protocol.TField("returnResults", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TIncrementStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TIncrementTupleSchemeFactory());
  }

  public ByteBuffer row; // required
  public List<TColumnIncrement> columns; // required
  public Map<ByteBuffer,ByteBuffer> attributes; // optional
  /**
   * 
   * @see TDurability
   */
  public TDurability durability; // optional
  public TCellVisibility cellVisibility; // optional
  public boolean returnResults; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROW((short)1, "row"),
    COLUMNS((short)2, "columns"),
    ATTRIBUTES((short)4, "attributes"),
    /**
     * 
     * @see TDurability
     */
    DURABILITY((short)5, "durability"),
    CELL_VISIBILITY((short)6, "cellVisibility"),
    RETURN_RESULTS((short)7, "returnResults");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROW
          return ROW;
        case 2: // COLUMNS
          return COLUMNS;
        case 4: // ATTRIBUTES
          return ATTRIBUTES;
        case 5: // DURABILITY
          return DURABILITY;
        case 6: // CELL_VISIBILITY
          return CELL_VISIBILITY;
        case 7: // RETURN_RESULTS
          return RETURN_RESULTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RETURNRESULTS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ATTRIBUTES,_Fields.DURABILITY,_Fields.CELL_VISIBILITY,_Fields.RETURN_RESULTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROW, new org.apache.thrift.meta_data.FieldMetaData("row", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TColumnIncrement.class))));
    tmpMap.put(_Fields.ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("attributes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    tmpMap.put(_Fields.DURABILITY, new org.apache.thrift.meta_data.FieldMetaData("durability", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDurability.class)));
    tmpMap.put(_Fields.CELL_VISIBILITY, new org.apache.thrift.meta_data.FieldMetaData("cellVisibility", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCellVisibility.class)));
    tmpMap.put(_Fields.RETURN_RESULTS, new org.apache.thrift.meta_data.FieldMetaData("returnResults", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TIncrement.class, metaDataMap);
  }

  public TIncrement() {
  }

  public TIncrement(
    ByteBuffer row,
    List<TColumnIncrement> columns)
  {
    this();
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
    this.columns = columns;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TIncrement(TIncrement other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRow()) {
      this.row = org.apache.thrift.TBaseHelper.copyBinary(other.row);
    }
    if (other.isSetColumns()) {
      List<TColumnIncrement> __this__columns = new ArrayList<TColumnIncrement>(other.columns.size());
      for (TColumnIncrement other_element : other.columns) {
        __this__columns.add(new TColumnIncrement(other_element));
      }
      this.columns = __this__columns;
    }
    if (other.isSetAttributes()) {
      Map<ByteBuffer,ByteBuffer> __this__attributes = new HashMap<ByteBuffer,ByteBuffer>(other.attributes);
      this.attributes = __this__attributes;
    }
    if (other.isSetDurability()) {
      this.durability = other.durability;
    }
    if (other.isSetCellVisibility()) {
      this.cellVisibility = new TCellVisibility(other.cellVisibility);
    }
    this.returnResults = other.returnResults;
  }

  public TIncrement deepCopy() {
    return new TIncrement(this);
  }

  @Override
  public void clear() {
    this.row = null;
    this.columns = null;
    this.attributes = null;
    this.durability = null;
    this.cellVisibility = null;
    setReturnResultsIsSet(false);
    this.returnResults = false;
  }

  public byte[] getRow() {
    setRow(org.apache.thrift.TBaseHelper.rightSize(row));
    return row == null ? null : row.array();
  }

  public ByteBuffer bufferForRow() {
    return org.apache.thrift.TBaseHelper.copyBinary(row);
  }

  public TIncrement setRow(byte[] row) {
    this.row = row == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(row, row.length));
    return this;
  }

  public TIncrement setRow(ByteBuffer row) {
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
    return this;
  }

  public void unsetRow() {
    this.row = null;
  }

  /** Returns true if field row is set (has been assigned a value) and false otherwise */
  public boolean isSetRow() {
    return this.row != null;
  }

  public void setRowIsSet(boolean value) {
    if (!value) {
      this.row = null;
    }
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<TColumnIncrement> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(TColumnIncrement elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<TColumnIncrement>();
    }
    this.columns.add(elem);
  }

  public List<TColumnIncrement> getColumns() {
    return this.columns;
  }

  public TIncrement setColumns(List<TColumnIncrement> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getAttributesSize() {
    return (this.attributes == null) ? 0 : this.attributes.size();
  }

  public void putToAttributes(ByteBuffer key, ByteBuffer val) {
    if (this.attributes == null) {
      this.attributes = new HashMap<ByteBuffer,ByteBuffer>();
    }
    this.attributes.put(key, val);
  }

  public Map<ByteBuffer,ByteBuffer> getAttributes() {
    return this.attributes;
  }

  public TIncrement setAttributes(Map<ByteBuffer,ByteBuffer> attributes) {
    this.attributes = attributes;
    return this;
  }

  public void unsetAttributes() {
    this.attributes = null;
  }

  /** Returns true if field attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributes() {
    return this.attributes != null;
  }

  public void setAttributesIsSet(boolean value) {
    if (!value) {
      this.attributes = null;
    }
  }

  /**
   * 
   * @see TDurability
   */
  public TDurability getDurability() {
    return this.durability;
  }

  /**
   * 
   * @see TDurability
   */
  public TIncrement setDurability(TDurability durability) {
    this.durability = durability;
    return this;
  }

  public void unsetDurability() {
    this.durability = null;
  }

  /** Returns true if field durability is set (has been assigned a value) and false otherwise */
  public boolean isSetDurability() {
    return this.durability != null;
  }

  public void setDurabilityIsSet(boolean value) {
    if (!value) {
      this.durability = null;
    }
  }

  public TCellVisibility getCellVisibility() {
    return this.cellVisibility;
  }

  public TIncrement setCellVisibility(TCellVisibility cellVisibility) {
    this.cellVisibility = cellVisibility;
    return this;
  }

  public void unsetCellVisibility() {
    this.cellVisibility = null;
  }

  /** Returns true if field cellVisibility is set (has been assigned a value) and false otherwise */
  public boolean isSetCellVisibility() {
    return this.cellVisibility != null;
  }

  public void setCellVisibilityIsSet(boolean value) {
    if (!value) {
      this.cellVisibility = null;
    }
  }

  public boolean isReturnResults() {
    return this.returnResults;
  }

  public TIncrement setReturnResults(boolean returnResults) {
    this.returnResults = returnResults;
    setReturnResultsIsSet(true);
    return this;
  }

  public void unsetReturnResults() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RETURNRESULTS_ISSET_ID);
  }

  /** Returns true if field returnResults is set (has been assigned a value) and false otherwise */
  public boolean isSetReturnResults() {
    return EncodingUtils.testBit(__isset_bitfield, __RETURNRESULTS_ISSET_ID);
  }

  public void setReturnResultsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RETURNRESULTS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROW:
      if (value == null) {
        unsetRow();
      } else {
        setRow((ByteBuffer)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<TColumnIncrement>)value);
      }
      break;

    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((Map<ByteBuffer,ByteBuffer>)value);
      }
      break;

    case DURABILITY:
      if (value == null) {
        unsetDurability();
      } else {
        setDurability((TDurability)value);
      }
      break;

    case CELL_VISIBILITY:
      if (value == null) {
        unsetCellVisibility();
      } else {
        setCellVisibility((TCellVisibility)value);
      }
      break;

    case RETURN_RESULTS:
      if (value == null) {
        unsetReturnResults();
      } else {
        setReturnResults((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROW:
      return getRow();

    case COLUMNS:
      return getColumns();

    case ATTRIBUTES:
      return getAttributes();

    case DURABILITY:
      return getDurability();

    case CELL_VISIBILITY:
      return getCellVisibility();

    case RETURN_RESULTS:
      return isReturnResults();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROW:
      return isSetRow();
    case COLUMNS:
      return isSetColumns();
    case ATTRIBUTES:
      return isSetAttributes();
    case DURABILITY:
      return isSetDurability();
    case CELL_VISIBILITY:
      return isSetCellVisibility();
    case RETURN_RESULTS:
      return isSetReturnResults();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TIncrement)
      return this.equals((TIncrement)that);
    return false;
  }

  public boolean equals(TIncrement that) {
    if (that == null)
      return false;

    boolean this_present_row = true && this.isSetRow();
    boolean that_present_row = true && that.isSetRow();
    if (this_present_row || that_present_row) {
      if (!(this_present_row && that_present_row))
        return false;
      if (!this.row.equals(that.row))
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_attributes = true && this.isSetAttributes();
    boolean that_present_attributes = true && that.isSetAttributes();
    if (this_present_attributes || that_present_attributes) {
      if (!(this_present_attributes && that_present_attributes))
        return false;
      if (!this.attributes.equals(that.attributes))
        return false;
    }

    boolean this_present_durability = true && this.isSetDurability();
    boolean that_present_durability = true && that.isSetDurability();
    if (this_present_durability || that_present_durability) {
      if (!(this_present_durability && that_present_durability))
        return false;
      if (!this.durability.equals(that.durability))
        return false;
    }

    boolean this_present_cellVisibility = true && this.isSetCellVisibility();
    boolean that_present_cellVisibility = true && that.isSetCellVisibility();
    if (this_present_cellVisibility || that_present_cellVisibility) {
      if (!(this_present_cellVisibility && that_present_cellVisibility))
        return false;
      if (!this.cellVisibility.equals(that.cellVisibility))
        return false;
    }

    boolean this_present_returnResults = true && this.isSetReturnResults();
    boolean that_present_returnResults = true && that.isSetReturnResults();
    if (this_present_returnResults || that_present_returnResults) {
      if (!(this_present_returnResults && that_present_returnResults))
        return false;
      if (this.returnResults != that.returnResults)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_row = true && (isSetRow());
    list.add(present_row);
    if (present_row)
      list.add(row);

    boolean present_columns = true && (isSetColumns());
    list.add(present_columns);
    if (present_columns)
      list.add(columns);

    boolean present_attributes = true && (isSetAttributes());
    list.add(present_attributes);
    if (present_attributes)
      list.add(attributes);

    boolean present_durability = true && (isSetDurability());
    list.add(present_durability);
    if (present_durability)
      list.add(durability.getValue());

    boolean present_cellVisibility = true && (isSetCellVisibility());
    list.add(present_cellVisibility);
    if (present_cellVisibility)
      list.add(cellVisibility);

    boolean present_returnResults = true && (isSetReturnResults());
    list.add(present_returnResults);
    if (present_returnResults)
      list.add(returnResults);

    return list.hashCode();
  }

  @Override
  public int compareTo(TIncrement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRow()).compareTo(other.isSetRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row, other.row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAttributes()).compareTo(other.isSetAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attributes, other.attributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDurability()).compareTo(other.isSetDurability());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDurability()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.durability, other.durability);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCellVisibility()).compareTo(other.isSetCellVisibility());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCellVisibility()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cellVisibility, other.cellVisibility);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReturnResults()).compareTo(other.isSetReturnResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReturnResults()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.returnResults, other.returnResults);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TIncrement(");
    boolean first = true;

    sb.append("row:");
    if (this.row == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.row, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (isSetAttributes()) {
      if (!first) sb.append(", ");
      sb.append("attributes:");
      if (this.attributes == null) {
        sb.append("null");
      } else {
        sb.append(this.attributes);
      }
      first = false;
    }
    if (isSetDurability()) {
      if (!first) sb.append(", ");
      sb.append("durability:");
      if (this.durability == null) {
        sb.append("null");
      } else {
        sb.append(this.durability);
      }
      first = false;
    }
    if (isSetCellVisibility()) {
      if (!first) sb.append(", ");
      sb.append("cellVisibility:");
      if (this.cellVisibility == null) {
        sb.append("null");
      } else {
        sb.append(this.cellVisibility);
      }
      first = false;
    }
    if (isSetReturnResults()) {
      if (!first) sb.append(", ");
      sb.append("returnResults:");
      sb.append(this.returnResults);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (row == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'row' was not present! Struct: " + toString());
    }
    if (columns == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'columns' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (cellVisibility != null) {
      cellVisibility.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TIncrementStandardSchemeFactory implements SchemeFactory {
    public TIncrementStandardScheme getScheme() {
      return new TIncrementStandardScheme();
    }
  }

  private static class TIncrementStandardScheme extends StandardScheme<TIncrement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TIncrement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.row = iprot.readBinary();
              struct.setRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list70 = iprot.readListBegin();
                struct.columns = new ArrayList<TColumnIncrement>(_list70.size);
                TColumnIncrement _elem71;
                for (int _i72 = 0; _i72 < _list70.size; ++_i72)
                {
                  _elem71 = new TColumnIncrement();
                  _elem71.read(iprot);
                  struct.columns.add(_elem71);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ATTRIBUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map73 = iprot.readMapBegin();
                struct.attributes = new HashMap<ByteBuffer,ByteBuffer>(2*_map73.size);
                ByteBuffer _key74;
                ByteBuffer _val75;
                for (int _i76 = 0; _i76 < _map73.size; ++_i76)
                {
                  _key74 = iprot.readBinary();
                  _val75 = iprot.readBinary();
                  struct.attributes.put(_key74, _val75);
                }
                iprot.readMapEnd();
              }
              struct.setAttributesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DURABILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.durability = org.apache.hadoop.hbase.thrift2.generated.TDurability.findByValue(iprot.readI32());
              struct.setDurabilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CELL_VISIBILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.cellVisibility = new TCellVisibility();
              struct.cellVisibility.read(iprot);
              struct.setCellVisibilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // RETURN_RESULTS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.returnResults = iprot.readBool();
              struct.setReturnResultsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TIncrement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.row != null) {
        oprot.writeFieldBegin(ROW_FIELD_DESC);
        oprot.writeBinary(struct.row);
        oprot.writeFieldEnd();
      }
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.columns.size()));
          for (TColumnIncrement _iter77 : struct.columns)
          {
            _iter77.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.attributes != null) {
        if (struct.isSetAttributes()) {
          oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.attributes.size()));
            for (Map.Entry<ByteBuffer, ByteBuffer> _iter78 : struct.attributes.entrySet())
            {
              oprot.writeBinary(_iter78.getKey());
              oprot.writeBinary(_iter78.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.durability != null) {
        if (struct.isSetDurability()) {
          oprot.writeFieldBegin(DURABILITY_FIELD_DESC);
          oprot.writeI32(struct.durability.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.cellVisibility != null) {
        if (struct.isSetCellVisibility()) {
          oprot.writeFieldBegin(CELL_VISIBILITY_FIELD_DESC);
          struct.cellVisibility.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetReturnResults()) {
        oprot.writeFieldBegin(RETURN_RESULTS_FIELD_DESC);
        oprot.writeBool(struct.returnResults);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TIncrementTupleSchemeFactory implements SchemeFactory {
    public TIncrementTupleScheme getScheme() {
      return new TIncrementTupleScheme();
    }
  }

  private static class TIncrementTupleScheme extends TupleScheme<TIncrement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TIncrement struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBinary(struct.row);
      {
        oprot.writeI32(struct.columns.size());
        for (TColumnIncrement _iter79 : struct.columns)
        {
          _iter79.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetAttributes()) {
        optionals.set(0);
      }
      if (struct.isSetDurability()) {
        optionals.set(1);
      }
      if (struct.isSetCellVisibility()) {
        optionals.set(2);
      }
      if (struct.isSetReturnResults()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAttributes()) {
        {
          oprot.writeI32(struct.attributes.size());
          for (Map.Entry<ByteBuffer, ByteBuffer> _iter80 : struct.attributes.entrySet())
          {
            oprot.writeBinary(_iter80.getKey());
            oprot.writeBinary(_iter80.getValue());
          }
        }
      }
      if (struct.isSetDurability()) {
        oprot.writeI32(struct.durability.getValue());
      }
      if (struct.isSetCellVisibility()) {
        struct.cellVisibility.write(oprot);
      }
      if (struct.isSetReturnResults()) {
        oprot.writeBool(struct.returnResults);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TIncrement struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.row = iprot.readBinary();
      struct.setRowIsSet(true);
      {
        org.apache.thrift.protocol.TList _list81 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.columns = new ArrayList<TColumnIncrement>(_list81.size);
        TColumnIncrement _elem82;
        for (int _i83 = 0; _i83 < _list81.size; ++_i83)
        {
          _elem82 = new TColumnIncrement();
          _elem82.read(iprot);
          struct.columns.add(_elem82);
        }
      }
      struct.setColumnsIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map84 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.attributes = new HashMap<ByteBuffer,ByteBuffer>(2*_map84.size);
          ByteBuffer _key85;
          ByteBuffer _val86;
          for (int _i87 = 0; _i87 < _map84.size; ++_i87)
          {
            _key85 = iprot.readBinary();
            _val86 = iprot.readBinary();
            struct.attributes.put(_key85, _val86);
          }
        }
        struct.setAttributesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.durability = org.apache.hadoop.hbase.thrift2.generated.TDurability.findByValue(iprot.readI32());
        struct.setDurabilityIsSet(true);
      }
      if (incoming.get(2)) {
        struct.cellVisibility = new TCellVisibility();
        struct.cellVisibility.read(iprot);
        struct.setCellVisibilityIsSet(true);
      }
      if (incoming.get(3)) {
        struct.returnResults = iprot.readBool();
        struct.setReturnResultsIsSet(true);
      }
    }
  }

}

