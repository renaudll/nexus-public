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
package org.sonatype.nexus.repository.cocoapods.internal.pod;

import java.net.URI;

/**
 * @since 3.19
 */
public class PodInfo
{
  private String name;

  private String version;

  private URI uri;

  public PodInfo(final String name, final String version, final URI uri) {
    this.name = name;
    this.version = version;
    this.uri = uri;
  }

  public String getName() {
    return name;
  }

  public String getVersion() {
    return version;
  }

  public URI getUri() {
    return uri;
  }
}
