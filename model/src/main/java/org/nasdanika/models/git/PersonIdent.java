/**
 */
package org.nasdanika.models.git;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Ident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.git.PersonIdent#getWhen <em>When</em>}</li>
 *   <li>{@link org.nasdanika.models.git.PersonIdent#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.git.GitPackage#getPersonIdent()
 * @model
 * @generated
 */
public interface PersonIdent extends EObject {
	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(Date)
	 * @see org.nasdanika.models.git.GitPackage#getPersonIdent_When()
	 * @model
	 * @generated
	 */
	Date getWhen();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.git.PersonIdent#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Date value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.git.Person#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see org.nasdanika.models.git.GitPackage#getPersonIdent_Person()
	 * @see org.nasdanika.models.git.Person#getActivity
	 * @model opposite="activity"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.git.PersonIdent#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // PersonIdent
