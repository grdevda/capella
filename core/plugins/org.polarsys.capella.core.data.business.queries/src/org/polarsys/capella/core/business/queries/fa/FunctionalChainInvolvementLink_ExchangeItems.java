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
package org.polarsys.capella.core.business.queries.fa;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.capella.common.queries.interpretor.QueryInterpretor;
import org.polarsys.capella.common.queries.queryContext.QueryContext;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.QueryConstants;
import org.polarsys.capella.core.data.fa.FaPackage;

/**
 */
public class FunctionalChainInvolvementLink_ExchangeItems implements IBusinessQuery {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EClass getEClass() {
		return FaPackage.Literals.FUNCTIONAL_CHAIN_INVOLVEMENT_LINK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<EReference> getEStructuralFeatures() {
		return Collections.singletonList(FaPackage.Literals.FUNCTIONAL_CHAIN_INVOLVEMENT_LINK__EXCHANGED_ITEMS);
	}

	@Override
	public List<EObject> getAvailableElements(EObject element) {
		QueryContext context = new QueryContext();
		context.putValue(QueryConstants.ECLASS_PARAMETER, getEClass());
		return QueryInterpretor.executeQuery(QueryConstants.GET_AVAILABLE__FUNCTIONAL_CHAIN_INVOLVEMENT_LINK__EXCHANGE_ITEMS, element, context);
	}

	@Override
	public List<EObject> getCurrentElements(EObject element, boolean onlyGenerated) {
		QueryContext context = new QueryContext();
		context.putValue(QueryConstants.ECLASS_PARAMETER, getEClass());
		return QueryInterpretor.executeQuery(QueryConstants.GET_CURRENT__FUNCTIONAL_CHAIN_INVOLVEMENT_LINK__EXCHANGE_ITEMS, element, context);
	}
}
