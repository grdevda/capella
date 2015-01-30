/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.business.queries.queries.capellacommon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.common.queries.AbstractQuery;
import org.polarsys.capella.common.queries.queryContext.IQueryContext;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.information.Class;
import org.polarsys.capella.core.model.helpers.ComponentExt;

public class GetAvailable_Mode_AvailableInStates extends AbstractQuery {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Object> execute(Object input, IQueryContext context) {
		CapellaElement capellaElement = (CapellaElement) input;
		List<CapellaElement> availableElements = getAvailableElements(capellaElement);
		return (List) availableElements;
	}

	/** 
	 * @see org.polarsys.capella.core.business.queries.IBusinessQuery#getAvailableElements(org.polarsys.capella.core.data.capellacore.CapellaElement)
	 */
	public List<CapellaElement> getAvailableElements(CapellaElement element_p) {
		List<CapellaElement> availableElements = new ArrayList<CapellaElement>();
		if (element_p instanceof State) {
		      EObject eContainer = element_p.eContainer();
		      if (eContainer != null) {
		        while (!(eContainer instanceof Component) && !(eContainer instanceof Class)) {
		          eContainer = eContainer.eContainer();
		        }
		        if ((eContainer instanceof Component)){
		        availableElements.addAll(getElementsFromComponentAndSubComponents((Component) eContainer));
		        }
		      }
		    }
		return availableElements;
	}

	/** 
	 * same level Visibility Layer
	 * @param state_p
	 */
	protected List<CapellaElement> getElementsFromComponentAndSubComponents(Component component_p) {
	      List<CapellaElement> availableElements = new ArrayList<CapellaElement>(1);
	      Collection<Component> subComponents = ComponentExt.getSubDefinedComponents(component_p);
	      subComponents.add(component_p);

	      for (Component component : subComponents) {
	        availableElements.addAll(component.getAllocatedFunctions());
	       	}
	      return availableElements;
	    }

	/** 
	 * @see org.polarsys.capella.core.business.queries.IBusinessQuery#getCurrentElements(org.polarsys.capella.core.data.capellacore.CapellaElement,boolean)
	 */
	public List<CapellaElement> getCurrentElements(CapellaElement element_p, boolean onlyGenerated_p) {
		List<CapellaElement> currentElements = new ArrayList<CapellaElement>();
		if (element_p instanceof State) {
			for (EObject referencer : EObjectExt.getReferencers(element_p, FaPackage.Literals.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES)) {
				currentElements.add((CapellaElement) referencer);
			}
		}
		return currentElements;
	}

}