/**
 */
package org.nasdanika.models.git.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.git.GitPackage;
import org.nasdanika.models.git.Person;
import org.nasdanika.models.git.PersonIdent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Ident</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.git.impl.PersonIdentImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.nasdanika.models.git.impl.PersonIdentImpl#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonIdentImpl extends MinimalEObjectImpl.Container implements PersonIdent {
	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final Date WHEN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonIdentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitPackage.Literals.PERSON_IDENT;
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
	public Date getWhen() {
		return (Date)eDynamicGet(GitPackage.PERSON_IDENT__WHEN, GitPackage.Literals.PERSON_IDENT__WHEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhen(Date newWhen) {
		eDynamicSet(GitPackage.PERSON_IDENT__WHEN, GitPackage.Literals.PERSON_IDENT__WHEN, newWhen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getPerson() {
		return (Person)eDynamicGet(GitPackage.PERSON_IDENT__PERSON, GitPackage.Literals.PERSON_IDENT__PERSON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return (Person)eDynamicGet(GitPackage.PERSON_IDENT__PERSON, GitPackage.Literals.PERSON_IDENT__PERSON, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPerson, GitPackage.PERSON_IDENT__PERSON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerson(Person newPerson) {
		eDynamicSet(GitPackage.PERSON_IDENT__PERSON, GitPackage.Literals.PERSON_IDENT__PERSON, newPerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitPackage.PERSON_IDENT__PERSON:
				Person person = basicGetPerson();
				if (person != null)
					msgs = ((InternalEObject)person).eInverseRemove(this, GitPackage.PERSON__ACTIVITY, Person.class, msgs);
				return basicSetPerson((Person)otherEnd, msgs);
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
			case GitPackage.PERSON_IDENT__PERSON:
				return basicSetPerson(null, msgs);
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
			case GitPackage.PERSON_IDENT__WHEN:
				return getWhen();
			case GitPackage.PERSON_IDENT__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GitPackage.PERSON_IDENT__WHEN:
				setWhen((Date)newValue);
				return;
			case GitPackage.PERSON_IDENT__PERSON:
				setPerson((Person)newValue);
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
			case GitPackage.PERSON_IDENT__WHEN:
				setWhen(WHEN_EDEFAULT);
				return;
			case GitPackage.PERSON_IDENT__PERSON:
				setPerson((Person)null);
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
			case GitPackage.PERSON_IDENT__WHEN:
				return WHEN_EDEFAULT == null ? getWhen() != null : !WHEN_EDEFAULT.equals(getWhen());
			case GitPackage.PERSON_IDENT__PERSON:
				return basicGetPerson() != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonIdentImpl
