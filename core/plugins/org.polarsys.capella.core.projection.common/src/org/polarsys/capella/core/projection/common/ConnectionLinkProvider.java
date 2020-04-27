/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.projection.common;

import org.eclipse.emf.ecore.EClass;

import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.tiger.ITracelinkProvider;

/**
 *
 */
public class ConnectionLinkProvider implements ITracelinkProvider {

  /**
   * @see org.polarsys.capella.core.tiger.ITracelinkProvider#getTraceLinkType()
   */
  public EClass getTraceLinkType() {
    return FaPackage.Literals.COMPONENT_EXCHANGE_REALIZATION;
  }

}
