/**
 */
package org.nasdanika.models.git;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.git.Commit#getTree <em>Tree</em>}</li>
 *   <li>{@link org.nasdanika.models.git.Commit#getParents <em>Parents</em>}</li>
 *   <li>{@link org.nasdanika.models.git.Commit#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.git.GitPackage#getCommit()
 * @model
 * @generated
 */
public interface Commit extends GitObject {
	/**
	 * Returns the value of the '<em><b>Tree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree</em>' reference.
	 * @see #setTree(Tree)
	 * @see org.nasdanika.models.git.GitPackage#getCommit_Tree()
	 * @model required="true"
	 * @generated
	 */
	Tree getTree();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.git.Commit#getTree <em>Tree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree</em>' reference.
	 * @see #getTree()
	 * @generated
	 */
	void setTree(Tree value);

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.git.Commit}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.git.Commit#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see org.nasdanika.models.git.GitPackage#getCommit_Parents()
	 * @see org.nasdanika.models.git.Commit#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	EList<Commit> getParents();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.git.Commit}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.git.Commit#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.nasdanika.models.git.GitPackage#getCommit_Children()
	 * @see org.nasdanika.models.git.Commit#getParents
	 * @model opposite="parents"
	 * @generated
	 */
	EList<Commit> getChildren();

} // Commit
