/**
 */
package org.nasdanika.models.git;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.git.Repository#getRemotes <em>Remotes</em>}</li>
 *   <li>{@link org.nasdanika.models.git.Repository#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.git.Repository#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.nasdanika.models.git.Repository#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.git.GitPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {

	/**
	 * Returns the value of the '<em><b>Remotes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.git.Remote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remotes</em>' containment reference list.
	 * @see org.nasdanika.models.git.GitPackage#getRepository_Remotes()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Remote> getRemotes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.git.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.nasdanika.models.git.GitPackage#getRepository_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.git.GitObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see org.nasdanika.models.git.GitPackage#getRepository_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<GitObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.git.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see org.nasdanika.models.git.GitPackage#getRepository_Persons()
	 * @model containment="true" keys="eMail"
	 * @generated
	 */
	EList<Person> getPersons();
} // Repository
