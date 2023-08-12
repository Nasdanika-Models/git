/**
 */
package org.nasdanika.models.git.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.git.GitPackage;
import org.nasdanika.models.git.Person;
import org.nasdanika.models.git.PersonIdent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.git.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.git.impl.PersonImpl#getEMail <em>EMail</em>}</li>
 *   <li>{@link org.nasdanika.models.git.impl.PersonImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(GitPackage.PERSON__NAME, GitPackage.Literals.PERSON__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(GitPackage.PERSON__NAME, GitPackage.Literals.PERSON__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEMail() {
		return (String)eDynamicGet(GitPackage.PERSON__EMAIL, GitPackage.Literals.PERSON__EMAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEMail(String newEMail) {
		eDynamicSet(GitPackage.PERSON__EMAIL, GitPackage.Literals.PERSON__EMAIL, newEMail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PersonIdent> getActivity() {
		return (EList<PersonIdent>)eDynamicGet(GitPackage.PERSON__ACTIVITY, GitPackage.Literals.PERSON__ACTIVITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitPackage.PERSON__ACTIVITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivity()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitPackage.PERSON__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitPackage.PERSON__NAME:
				return getName();
			case GitPackage.PERSON__EMAIL:
				return getEMail();
			case GitPackage.PERSON__ACTIVITY:
				return getActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GitPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case GitPackage.PERSON__EMAIL:
				setEMail((String)newValue);
				return;
			case GitPackage.PERSON__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends PersonIdent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GitPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GitPackage.PERSON__EMAIL:
				setEMail(EMAIL_EDEFAULT);
				return;
			case GitPackage.PERSON__ACTIVITY:
				getActivity().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GitPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GitPackage.PERSON__EMAIL:
				return EMAIL_EDEFAULT == null ? getEMail() != null : !EMAIL_EDEFAULT.equals(getEMail());
			case GitPackage.PERSON__ACTIVITY:
				return !getActivity().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonImpl
