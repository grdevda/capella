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
package org.polarsys.capella.core.data.pa.ui.quickfix.resolver;

import java.util.Collection;

import org.eclipse.core.resources.IMarker;
import org.polarsys.capella.common.tools.report.appenders.reportlogview.MarkerViewHelper;
import org.polarsys.capella.core.data.pa.PhysicalComponentNature;

/**
 * Change the nature of the Physical Component to {@link PhysicalComponentNature.BEHAVIOR}
 */
public class PhysicalComponentNatureToBehaviorResolver extends AbstractPhysicalComponentNatureChangeResolver {
  private String label = "Switch to BEHAVIOR";
  private boolean multiMarkerQuickFix;
  
  public PhysicalComponentNatureToBehaviorResolver() {
    this.multiMarkerQuickFix = false;
  }

  public PhysicalComponentNatureToBehaviorResolver(String label, boolean multiMarkerQuickFix) {
    this.label = label;
    this.multiMarkerQuickFix = multiMarkerQuickFix;
  }

  @Override
  protected PhysicalComponentNature getPhysicalComponentNature() {
    return PhysicalComponentNature.BEHAVIOR;
  }

  @Override
  public String getLabel() {
    return label;
  }

  @Override
  protected boolean enabled(Collection<IMarker> markers) {
    return (markers.size() > 1) || multiMarkerQuickFix == false;
  }

  @Override
  protected boolean canResolve(IMarker marker) {
    String ruleId = "org.polarsys.capella.core.data.pa.validation.DWF_DC_22";
    String markerRuleId = MarkerViewHelper.getRuleID(marker, true);
    return this.multiMarkerQuickFix && ruleId.equals(markerRuleId);
  }
}
