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

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.polarsys.capella.common.helpers.query.IQuery;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalChainReference;
import org.polarsys.capella.core.data.oa.OperationalProcess;
import org.polarsys.capella.core.semantic.queries.basic.queries.utils.QueryHelper;

public class FunctionalChainChildren implements IQuery {

  public List<Object> compute(Object object) {
    FunctionalChain functionalChain = QueryHelper.getFunctionalChain(object);
    if (functionalChain != null && isValidInstanceOf(functionalChain)) {
      return functionalChain.getInvolvedFunctionalChainInvolvements().stream()
          .filter(FunctionalChainReference.class::isInstance).map(FunctionalChainReference.class::cast)
          .collect(Collectors.toList());
    }
    return Collections.emptyList();
  }

  protected boolean isValidInstanceOf(FunctionalChain functionalChain) {
    return !(functionalChain instanceof OperationalProcess);
  }

}
