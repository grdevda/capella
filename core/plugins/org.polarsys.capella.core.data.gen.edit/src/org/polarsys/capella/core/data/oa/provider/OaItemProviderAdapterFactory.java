/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.data.oa.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.polarsys.capella.common.data.activity.AbstractActivity;
import org.polarsys.capella.common.data.activity.ActivityGroup;
import org.polarsys.capella.common.data.activity.ActivityPackage;
import org.polarsys.capella.common.data.activity.util.ActivitySwitch;
import org.polarsys.capella.core.data.capellamodeller.provider.CapellaModellerEditPlugin;
import org.polarsys.capella.core.data.oa.OaFactory;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.oa.util.OaAdapterFactory;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.extension.edit.ChildCreationExtenderManager;
import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OaItemProviderAdapterFactory extends OaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(CapellaModellerEditPlugin.INSTANCE, OaPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.OperationalAnalysis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalAnalysisItemProvider operationalAnalysisItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.OperationalAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationalAnalysisAdapter() {
		if (operationalAnalysisItemProvider == null) {
			operationalAnalysisItemProvider = new OperationalAnalysisItemProvider(this);
		}

		return operationalAnalysisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.OperationalActivityPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalActivityPkgItemProvider operationalActivityPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.OperationalActivityPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationalActivityPkgAdapter() {
		if (operationalActivityPkgItemProvider == null) {
			operationalActivityPkgItemProvider = new OperationalActivityPkgItemProvider(this);
		}

		return operationalActivityPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.OperationalActivity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalActivityItemProvider operationalActivityItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.OperationalActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationalActivityAdapter() {
		if (operationalActivityItemProvider == null) {
			operationalActivityItemProvider = new OperationalActivityItemProvider(this);
		}

		return operationalActivityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.OperationalProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalProcessItemProvider operationalProcessItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.OperationalProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationalProcessAdapter() {
		if (operationalProcessItemProvider == null) {
			operationalProcessItemProvider = new OperationalProcessItemProvider(this);
		}

		return operationalProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.Swimlane} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwimlaneItemProvider swimlaneItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.Swimlane}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwimlaneAdapter() {
		if (swimlaneItemProvider == null) {
			swimlaneItemProvider = new SwimlaneItemProvider(this);
		}

		return swimlaneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.OperationalCapabilityPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalCapabilityPkgItemProvider operationalCapabilityPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.OperationalCapabilityPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationalCapabilityPkgAdapter() {
		if (operationalCapabilityPkgItemProvider == null) {
			operationalCapabilityPkgItemProvider = new OperationalCapabilityPkgItemProvider(this);
		}

		return operationalCapabilityPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.OperationalCapability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalCapabilityItemProvider operationalCapabilityItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.OperationalCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationalCapabilityAdapter() {
		if (operationalCapabilityItemProvider == null) {
			operationalCapabilityItemProvider = new OperationalCapabilityItemProvider(this);
		}

		return operationalCapabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.ActivityAllocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityAllocationItemProvider activityAllocationItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.ActivityAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAllocationAdapter() {
		if (activityAllocationItemProvider == null) {
			activityAllocationItemProvider = new ActivityAllocationItemProvider(this);
		}

		return activityAllocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.RolePkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolePkgItemProvider rolePkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.RolePkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRolePkgAdapter() {
		if (rolePkgItemProvider == null) {
			rolePkgItemProvider = new RolePkgItemProvider(this);
		}

		return rolePkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.RoleAssemblyUsage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleAssemblyUsageItemProvider roleAssemblyUsageItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.RoleAssemblyUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAssemblyUsageAdapter() {
		if (roleAssemblyUsageItemProvider == null) {
			roleAssemblyUsageItemProvider = new RoleAssemblyUsageItemProvider(this);
		}

		return roleAssemblyUsageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.RoleAllocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleAllocationItemProvider roleAllocationItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.RoleAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAllocationAdapter() {
		if (roleAllocationItemProvider == null) {
			roleAllocationItemProvider = new RoleAllocationItemProvider(this);
		}

		return roleAllocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.EntityPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityPkgItemProvider entityPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.EntityPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityPkgAdapter() {
		if (entityPkgItemProvider == null) {
			entityPkgItemProvider = new EntityPkgItemProvider(this);
		}

		return entityPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.ConceptPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptPkgItemProvider conceptPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.ConceptPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptPkgAdapter() {
		if (conceptPkgItemProvider == null) {
			conceptPkgItemProvider = new ConceptPkgItemProvider(this);
		}

		return conceptPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.Concept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptItemProvider conceptItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptAdapter() {
		if (conceptItemProvider == null) {
			conceptItemProvider = new ConceptItemProvider(this);
		}

		return conceptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.ConceptCompliance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptComplianceItemProvider conceptComplianceItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.ConceptCompliance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConceptComplianceAdapter() {
		if (conceptComplianceItemProvider == null) {
			conceptComplianceItemProvider = new ConceptComplianceItemProvider(this);
		}

		return conceptComplianceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.ItemInConcept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemInConceptItemProvider itemInConceptItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.ItemInConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemInConceptAdapter() {
		if (itemInConceptItemProvider == null) {
			itemInConceptItemProvider = new ItemInConceptItemProvider(this);
		}

		return itemInConceptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.OperationalActor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalActorItemProvider operationalActorItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.OperationalActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationalActorAdapter() {
		if (operationalActorItemProvider == null) {
			operationalActorItemProvider = new OperationalActorItemProvider(this);
		}

		return operationalActorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.CommunityOfInterest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunityOfInterestItemProvider communityOfInterestItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.CommunityOfInterest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunityOfInterestAdapter() {
		if (communityOfInterestItemProvider == null) {
			communityOfInterestItemProvider = new CommunityOfInterestItemProvider(this);
		}

		return communityOfInterestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.CommunityOfInterestComposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunityOfInterestCompositionItemProvider communityOfInterestCompositionItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.CommunityOfInterestComposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunityOfInterestCompositionAdapter() {
		if (communityOfInterestCompositionItemProvider == null) {
			communityOfInterestCompositionItemProvider = new CommunityOfInterestCompositionItemProvider(this);
		}

		return communityOfInterestCompositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.OrganisationalUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationalUnitItemProvider organisationalUnitItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.OrganisationalUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrganisationalUnitAdapter() {
		if (organisationalUnitItemProvider == null) {
			organisationalUnitItemProvider = new OrganisationalUnitItemProvider(this);
		}

		return organisationalUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.OrganisationalUnitComposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationalUnitCompositionItemProvider organisationalUnitCompositionItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.OrganisationalUnitComposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrganisationalUnitCompositionAdapter() {
		if (organisationalUnitCompositionItemProvider == null) {
			organisationalUnitCompositionItemProvider = new OrganisationalUnitCompositionItemProvider(this);
		}

		return organisationalUnitCompositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.Location} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationItemProvider locationItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocationAdapter() {
		if (locationItemProvider == null) {
			locationItemProvider = new LocationItemProvider(this);
		}

		return locationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.CapabilityConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityConfigurationItemProvider capabilityConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.CapabilityConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapabilityConfigurationAdapter() {
		if (capabilityConfigurationItemProvider == null) {
			capabilityConfigurationItemProvider = new CapabilityConfigurationItemProvider(this);
		}

		return capabilityConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.CommunicationMean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationMeanItemProvider communicationMeanItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.CommunicationMean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationMeanAdapter() {
		if (communicationMeanItemProvider == null) {
			communicationMeanItemProvider = new CommunicationMeanItemProvider(this);
		}

		return communicationMeanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.EntityOperationalCapabilityInvolvement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityOperationalCapabilityInvolvementItemProvider entityOperationalCapabilityInvolvementItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.EntityOperationalCapabilityInvolvement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityOperationalCapabilityInvolvementAdapter() {
		if (entityOperationalCapabilityInvolvementItemProvider == null) {
			entityOperationalCapabilityInvolvementItemProvider = new EntityOperationalCapabilityInvolvementItemProvider(this);
		}

		return entityOperationalCapabilityInvolvementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.polarsys.capella.core.data.oa.OperationalContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalContextItemProvider operationalContextItemProvider;

	/**
	 * This creates an adapter for a {@link org.polarsys.capella.core.data.oa.OperationalContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationalContextAdapter() {
		if (operationalContextItemProvider == null) {
			operationalContextItemProvider = new OperationalContextItemProvider(this);
		}

		return operationalContextItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (operationalAnalysisItemProvider != null) operationalAnalysisItemProvider.dispose();
		if (operationalActivityPkgItemProvider != null) operationalActivityPkgItemProvider.dispose();
		if (operationalActivityItemProvider != null) operationalActivityItemProvider.dispose();
		if (operationalProcessItemProvider != null) operationalProcessItemProvider.dispose();
		if (swimlaneItemProvider != null) swimlaneItemProvider.dispose();
		if (operationalCapabilityPkgItemProvider != null) operationalCapabilityPkgItemProvider.dispose();
		if (operationalCapabilityItemProvider != null) operationalCapabilityItemProvider.dispose();
		if (activityAllocationItemProvider != null) activityAllocationItemProvider.dispose();
		if (rolePkgItemProvider != null) rolePkgItemProvider.dispose();
		if (roleItemProvider != null) roleItemProvider.dispose();
		if (roleAssemblyUsageItemProvider != null) roleAssemblyUsageItemProvider.dispose();
		if (roleAllocationItemProvider != null) roleAllocationItemProvider.dispose();
		if (entityPkgItemProvider != null) entityPkgItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (conceptPkgItemProvider != null) conceptPkgItemProvider.dispose();
		if (conceptItemProvider != null) conceptItemProvider.dispose();
		if (conceptComplianceItemProvider != null) conceptComplianceItemProvider.dispose();
		if (itemInConceptItemProvider != null) itemInConceptItemProvider.dispose();
		if (operationalActorItemProvider != null) operationalActorItemProvider.dispose();
		if (communityOfInterestItemProvider != null) communityOfInterestItemProvider.dispose();
		if (communityOfInterestCompositionItemProvider != null) communityOfInterestCompositionItemProvider.dispose();
		if (organisationalUnitItemProvider != null) organisationalUnitItemProvider.dispose();
		if (organisationalUnitCompositionItemProvider != null) organisationalUnitCompositionItemProvider.dispose();
		if (locationItemProvider != null) locationItemProvider.dispose();
		if (capabilityConfigurationItemProvider != null) capabilityConfigurationItemProvider.dispose();
		if (communicationMeanItemProvider != null) communicationMeanItemProvider.dispose();
		if (entityOperationalCapabilityInvolvementItemProvider != null) entityOperationalCapabilityInvolvementItemProvider.dispose();
		if (operationalContextItemProvider != null) operationalContextItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link ActivityPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ActivityChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ActivitySwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAbstractActivity(AbstractActivity object) {
				// begin-extension-code
				if (ModelExtensionHelper.getInstance(object).isExtensionModelDisabled(EcoreUtil.getRootContainer(object).eClass().getEPackage().getNsURI(), "http://www.polarsys.org/capella/core/oa/1.2.0")) { //$NON-NLS-1$
					return null;				
				}
				// end-extension-code
                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (ActivityPackage.Literals.ABSTRACT_ACTIVITY__OWNED_NODES,
                         OaFactory.eINSTANCE.createOperationalActivity());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (ActivityPackage.Literals.ABSTRACT_ACTIVITY__OWNED_GROUPS,
                         OaFactory.eINSTANCE.createSwimlane());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseActivityGroup(ActivityGroup object) {
				// begin-extension-code
				if (ModelExtensionHelper.getInstance(object).isExtensionModelDisabled(EcoreUtil.getRootContainer(object).eClass().getEPackage().getNsURI(), "http://www.polarsys.org/capella/core/oa/1.2.0")) { //$NON-NLS-1$
					return null;				
				}
				// end-extension-code
                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (ActivityPackage.Literals.ACTIVITY_GROUP__SUB_GROUPS,
                         OaFactory.eINSTANCE.createSwimlane());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



                // begin-extension-code
                {
                    CommandParameter commandParameter = createChildParameter
                        (ActivityPackage.Literals.ACTIVITY_GROUP__OWNED_NODES,
                         OaFactory.eINSTANCE.createOperationalActivity());
                    if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
                        newChildDescriptors.add(commandParameter);      
                    }
                }
                // end-extension-code



				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
		   new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
		   return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return CapellaModellerEditPlugin.INSTANCE;
		}
	}

}
