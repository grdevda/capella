/*******************************************************************************
 * Copyright (c) 2016 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.core.platform.sirius.clipboard.actions;

/**
 * Paste action for Capella Diagrams: paste style but not layout
 */
public class CapellaDiagramPasteActionStyleOnly extends CapellaDiagramPasteAction {
  @Override
  public boolean mustPasteLayout() {
    return false;
  }
}
