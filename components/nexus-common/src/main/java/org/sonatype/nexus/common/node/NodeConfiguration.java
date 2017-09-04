/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.common.node;

import org.sonatype.nexus.common.entity.Entity;

/**
 * Node configuration
 *
 * @since 3.6
 */
public class NodeConfiguration
    extends Entity
{

  /**
   * UUID identifying cluster node
   */
  private String id;

  /**
   * Admin-specified node identifier
   */
  private String friendlyNodeName;

  public NodeConfiguration() {
    // default constructor
  }

  public NodeConfiguration(final String id, final String friendlyNodeName) {
    this.id = id;
    this.friendlyNodeName = friendlyNodeName;
  }

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getFriendlyNodeName() {
    return friendlyNodeName;
  }

  public void setFriendlyNodeName(final String friendlyNodeName) {
    this.friendlyNodeName = friendlyNodeName;
  }
}
