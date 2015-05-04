/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Topic extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Topic\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"subscriptionType\",\"type\":{\"type\":\"enum\",\"name\":\"SubscriptionType\",\"symbols\":[\"MANDATORY_SUBSCRIPTION\",\"OPTIONAL_SUBSCRIPTION\"]}}],\"direction\":\"in\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String id;
   private java.lang.String name;
   private org.kaaproject.kaa.common.endpoint.gen.SubscriptionType subscriptionType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public Topic() {}

  /**
   * All-args constructor.
   */
  public Topic(java.lang.String id, java.lang.String name, org.kaaproject.kaa.common.endpoint.gen.SubscriptionType subscriptionType) {
    this.id = id;
    this.name = name;
    this.subscriptionType = subscriptionType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return subscriptionType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.String)value$; break;
    case 1: name = (java.lang.String)value$; break;
    case 2: subscriptionType = (org.kaaproject.kaa.common.endpoint.gen.SubscriptionType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'subscriptionType' field.
   */
  public org.kaaproject.kaa.common.endpoint.gen.SubscriptionType getSubscriptionType() {
    return subscriptionType;
  }

  /**
   * Sets the value of the 'subscriptionType' field.
   * @param value the value to set.
   */
  public void setSubscriptionType(org.kaaproject.kaa.common.endpoint.gen.SubscriptionType value) {
    this.subscriptionType = value;
  }

  /** Creates a new Topic RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.Topic.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.Topic.Builder();
  }
  
  /** Creates a new Topic RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.Topic.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.Topic.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.Topic.Builder(other);
  }
  
  /** Creates a new Topic RecordBuilder by copying an existing Topic instance */
  public static org.kaaproject.kaa.common.endpoint.gen.Topic.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.Topic other) {
    return new org.kaaproject.kaa.common.endpoint.gen.Topic.Builder(other);
  }
  
  /**
   * RecordBuilder for Topic instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Topic>
    implements org.apache.avro.data.RecordBuilder<Topic> {

    private java.lang.String id;
    private java.lang.String name;
    private org.kaaproject.kaa.common.endpoint.gen.SubscriptionType subscriptionType;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.Topic.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.Topic.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.subscriptionType)) {
        this.subscriptionType = data().deepCopy(fields()[2].schema(), other.subscriptionType);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Topic instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.Topic other) {
            super(org.kaaproject.kaa.common.endpoint.gen.Topic.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.subscriptionType)) {
        this.subscriptionType = data().deepCopy(fields()[2].schema(), other.subscriptionType);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.String getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.kaaproject.kaa.common.endpoint.gen.Topic.Builder setId(java.lang.String value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public org.kaaproject.kaa.common.endpoint.gen.Topic.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.kaaproject.kaa.common.endpoint.gen.Topic.Builder setName(java.lang.String value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public org.kaaproject.kaa.common.endpoint.gen.Topic.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'subscriptionType' field */
    public org.kaaproject.kaa.common.endpoint.gen.SubscriptionType getSubscriptionType() {
      return subscriptionType;
    }
    
    /** Sets the value of the 'subscriptionType' field */
    public org.kaaproject.kaa.common.endpoint.gen.Topic.Builder setSubscriptionType(org.kaaproject.kaa.common.endpoint.gen.SubscriptionType value) {
      validate(fields()[2], value);
      this.subscriptionType = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'subscriptionType' field has been set */
    public boolean hasSubscriptionType() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'subscriptionType' field */
    public org.kaaproject.kaa.common.endpoint.gen.Topic.Builder clearSubscriptionType() {
      subscriptionType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Topic build() {
      try {
        Topic record = new Topic();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.String) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.subscriptionType = fieldSetFlags()[2] ? this.subscriptionType : (org.kaaproject.kaa.common.endpoint.gen.SubscriptionType) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
