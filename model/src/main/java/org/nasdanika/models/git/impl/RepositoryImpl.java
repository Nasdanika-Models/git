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
import org.nasdanika.models.git.GitObject;
import org.nasdanika.models.git.GitPackage;
import org.nasdanika.models.git.Person;
import org.nasdanika.models.git.Reference;
import org.nasdanika.models.git.Remote;
import org.nasdanika.models.git.Repository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.git.impl.RepositoryImpl#getRemotes <em>Remotes</em>}</li>
 *   <li>{@link org.nasdanika.models.git.impl.RepositoryImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.git.impl.RepositoryImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.nasdanika.models.git.impl.RepositoryImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitPackage.Literals.REPOSITORY;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Remote> getRemotes() {
		return (EList<Remote>)eDynamicGet(GitPackage.REPOSITORY__REMOTES, GitPackage.Literals.REPOSITORY__REMOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Reference> getReferences() {
		return (EList<Reference>)eDynamicGet(GitPackage.REPOSITORY__REFERENCES, GitPackage.Literals.REPOSITORY__REFERENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<GitObject> getObjects() {
		return (EList<GitObject>)eDynamicGet(GitPackage.REPOSITORY__OBJECTS, GitPackage.Literals.REPOSITORY__OBJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getPersons() {
		return (EList<Person>)eDynamicGet(GitPackage.REPOSITORY__PERSONS, GitPackage.Literals.REPOSITORY__PERSONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitPackage.REPOSITORY__REMOTES:
				return ((InternalEList<?>)getRemotes()).basicRemove(otherEnd, msgs);
			case GitPackage.REPOSITORY__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case GitPackage.REPOSITORY__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case GitPackage.REPOSITORY__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
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
			case GitPackage.REPOSITORY__REMOTES:
				return getRemotes();
			case GitPackage.REPOSITORY__REFERENCES:
				return getReferences();
			case GitPackage.REPOSITORY__OBJECTS:
				return getObjects();
			case GitPackage.REPOSITORY__PERSONS:
				return getPersons();
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
			case GitPackage.REPOSITORY__REMOTES:
				getRemotes().clear();
				getRemotes().addAll((Collection<? extends Remote>)newValue);
				return;
			case GitPackage.REPOSITORY__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case GitPackage.REPOSITORY__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends GitObject>)newValue);
				return;
			case GitPackage.REPOSITORY__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
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
			case GitPackage.REPOSITORY__REMOTES:
				getRemotes().clear();
				return;
			case GitPackage.REPOSITORY__REFERENCES:
				getReferences().clear();
				return;
			case GitPackage.REPOSITORY__OBJECTS:
				getObjects().clear();
				return;
			case GitPackage.REPOSITORY__PERSONS:
				getPersons().clear();
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
			case GitPackage.REPOSITORY__REMOTES:
				return !getRemotes().isEmpty();
			case GitPackage.REPOSITORY__REFERENCES:
				return !getReferences().isEmpty();
			case GitPackage.REPOSITORY__OBJECTS:
				return !getObjects().isEmpty();
			case GitPackage.REPOSITORY__PERSONS:
				return !getPersons().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
