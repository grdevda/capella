/*******************************************************************************
 * Copyright (c) 2006, 2018 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.common.ui.actions;

import org.eclipse.osgi.util.NLS;

/**
 * I18n support.
 */
public class Messages extends NLS {
  
  private static final String BUNDLE_NAME = "org.polarsys.capella.common.ui.actions.messages"; //$NON-NLS-1$
  
  public static String LocateInCommonNavigator_SelectedElementNotVisible_0;
  public static String LocateInCommonNavigator_SelectedElementNotVisible_1;
  public static String LocateInCommonNavigator_SelectedElementNotVisible_2;
  public static String LocateInCommonNavigator_SelectedElementNotVisible_Title;
  
  static {
    // Initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  /**
   * Constructor.
   */
  private Messages() {
    // Do nothing.
  }
}
