/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.capella.core.semantic.queries.basic.queries;

import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.oa.OperationalProcess;

/**
 * Return involved operational activities of the current operational process
 * 
 *
 */
public class OperationalProcessInvolvedOperationalActivities extends FunctionalChainInvolvementFunctions {

  /**
   * 
   */
  public OperationalProcessInvolvedOperationalActivities() {
    // do nothing
  }

  @Override
  protected boolean isValidInstanceOf(FunctionalChain functionalChain) {
    return (functionalChain instanceof OperationalProcess);
  }
}
