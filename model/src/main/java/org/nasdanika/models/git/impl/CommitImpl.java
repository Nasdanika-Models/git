/**
 */
package org.nasdanika.models.git.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.git.Commit;
import org.nasdanika.models.git.GitPackage;
import org.nasdanika.models.git.Tree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.git.impl.CommitImpl#getTree <em>Tree</em>}</li>
 *   <li>{@link org.nasdanika.models.git.impl.CommitImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.nasdanika.models.git.impl.CommitImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommitImpl extends GitObjectImpl implements Commit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitPackage.Literals.COMMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tree getTree() {
		return (Tree)eDynamicGet(GitPackage.COMMIT__TREE, GitPackage.Literals.COMMIT__TREE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree basicGetTree() {
		return (Tree)eDynamicGet(GitPackage.COMMIT__TREE, GitPackage.Literals.COMMIT__TREE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTree(Tree newTree) {
		eDynamicSet(GitPackage.COMMIT__TREE, GitPackage.Literals.COMMIT__TREE, newTree);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Commit> getParents() {
		return (EList<Commit>)eDynamicGet(GitPackage.COMMIT__PARENTS, GitPackage.Literals.COMMIT__PARENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Commit> getChildren() {
		return (EList<Commit>)eDynamicGet(GitPackage.COMMIT__CHILDREN, GitPackage.Literals.COMMIT__CHILDREN, true, true);
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
			case GitPackage.COMMIT__PARENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParents()).basicAdd(otherEnd, msgs);
			case GitPackage.COMMIT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
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
			case GitPackage.COMMIT__PARENTS:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
			case GitPackage.COMMIT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case GitPackage.COMMIT__TREE:
				if (resolve) return getTree();
				return basicGetTree();
			case GitPackage.COMMIT__PARENTS:
				return getParents();
			case GitPackage.COMMIT__CHILDREN:
				return getChildren();
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
			case GitPackage.COMMIT__TREE:
				setTree((Tree)newValue);
				return;
			case GitPackage.COMMIT__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Commit>)newValue);
				return;
			case GitPackage.COMMIT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Commit>)newValue);
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
			case GitPackage.COMMIT__TREE:
				setTree((Tree)null);
				return;
			case GitPackage.COMMIT__PARENTS:
				getParents().clear();
				return;
			case GitPackage.COMMIT__CHILDREN:
				getChildren().clear();
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
			case GitPackage.COMMIT__TREE:
				return basicGetTree() != null;
			case GitPackage.COMMIT__PARENTS:
				return !getParents().isEmpty();
			case GitPackage.COMMIT__CHILDREN:
				return !getChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommitImpl
