/**
 */
package org.nasdanika.models.git.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.git.GitPackage;
import org.nasdanika.models.git.Tree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TreeImpl extends GitObjectImpl implements Tree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitPackage.Literals.TREE;
	}

} //TreeImpl
