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
package org.polarsys.capella.core.transition.system.topdown.rules.la;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.transition.system.rules.cs.ComponentPkgRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 *
 */
public class LogicalComponentPkgRule extends ComponentPkgRule {

  @Override
  protected EClass getSourceType() {
    return LaPackage.Literals.LOGICAL_COMPONENT_PKG;
  }

  @Override
  public EClass getTargetType(EObject element_p, IContext context_p) {
    return PaPackage.Literals.PHYSICAL_COMPONENT_PKG;
  }
}
