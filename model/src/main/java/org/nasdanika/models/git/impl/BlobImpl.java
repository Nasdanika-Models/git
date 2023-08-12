/**
 */
package org.nasdanika.models.git.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.git.Blob;
import org.nasdanika.models.git.GitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blob</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BlobImpl extends GitObjectImpl implements Blob {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitPackage.Literals.BLOB;
	}

} //BlobImpl
