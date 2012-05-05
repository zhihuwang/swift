/*
 * Copyright 2004-present Facebook. All Rights Reserved.
 */
package com.facebook.swift.metadata;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class ThriftParameterInjection implements ThriftInjection {
  private final short id;
  private final String name;
  private final int parameterIndex;

  public ThriftParameterInjection(
      short id,
      String name,
      int parameterIndex
  ) {
    checkArgument(id >= 0, "fieldId is negative");
    checkNotNull(name, "name is null");
    checkArgument(parameterIndex >= 0, "parameterIndex is negative");

    this.id = id;
    this.name = name;
    this.parameterIndex = parameterIndex;
  }

  @Override
  public short getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  public int getParameterIndex() {
    return parameterIndex;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("ThriftParameterInjection");
    sb.append("{fieldId=").append(id);
    sb.append(", name=").append(name);
    sb.append(", index=").append(parameterIndex);
    sb.append('}');
    return sb.toString();
  }
}