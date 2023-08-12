/**
 */
package org.nasdanika.models.git;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.git.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.git.Person#getEMail <em>EMail</em>}</li>
 *   <li>{@link org.nasdanika.models.git.Person#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.git.GitPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.git.GitPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.git.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMail</em>' attribute.
	 * @see #setEMail(String)
	 * @see org.nasdanika.models.git.GitPackage#getPerson_EMail()
	 * @model
	 * @generated
	 */
	String getEMail();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.git.Person#getEMail <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail</em>' attribute.
	 * @see #getEMail()
	 * @generated
	 */
	void setEMail(String value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.git.PersonIdent}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.git.PersonIdent#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see org.nasdanika.models.git.GitPackage#getPerson_Activity()
	 * @see org.nasdanika.models.git.PersonIdent#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<PersonIdent> getActivity();

} // Person
