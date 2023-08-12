/**
 */
package org.nasdanika.models.git;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.git.GitFactory
 * @model kind="package"
 * @generated
 */
public interface GitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "git";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/git";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.git";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GitPackage eINSTANCE = org.nasdanika.models.git.impl.GitPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.git.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.git.impl.RepositoryImpl
	 * @see org.nasdanika.models.git.impl.GitPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Remotes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REMOTES = 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OBJECTS = 2;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PERSONS = 3;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.git.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.git.impl.ReferenceImpl
	 * @see org.nasdanika.models.git.impl.GitPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.git.impl.RemoteImpl <em>Remote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.git.impl.RemoteImpl
	 * @see org.nasdanika.models.git.impl.GitPackageImpl#getRemote()
	 * @generated
	 */
	int REMOTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Remote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Remote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.git.impl.GitObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.git.impl.GitObjectImpl
	 * @see org.nasdanika.models.git.impl.GitPackageImpl#getGitObject()
	 * @generated
	 */
	int GIT_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_OBJECT__ID = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.git.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.git.impl.TagImpl
	 * @see org.nasdanika.models.git.impl.GitPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 4;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.git.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.git.impl.TreeImpl
	 * @see org.nasdanika.models.git.impl.GitPackageImpl#getTree()
	 * @generated
	 */
	int TREE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ID = GIT_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = GIT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_OPERATION_COUNT = GIT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.git.impl.BlobImpl <em>Blob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.git.impl.BlobImpl
	 * @see org.nasdanika.models.git.impl.GitPackageImpl#getBlob()
	 * @generated
	 */
	int BLOB = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__ID = GIT_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_FEATURE_COUNT = GIT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_OPERATION_COUNT = GIT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.git.impl.CommitImpl <em>Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.git.impl.CommitImpl
	 * @see org.nasdanika.models.git.impl.GitPackageImpl#getCommit()
	 * @generated
	 */
	int COMMIT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__ID = GIT_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Tree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__TREE = GIT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__PARENTS = GIT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__CHILDREN = GIT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_FEATURE_COUNT = GIT_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_OPERATION_COUNT = GIT_OBJECT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.git.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.git.impl.PersonImpl
	 * @see org.nasdanika.models.git.impl.GitPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.git.impl.PersonIdentImpl <em>Person Ident</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.git.impl.PersonIdentImpl
	 * @see org.nasdanika.models.git.impl.GitPackageImpl#getPersonIdent()
	 * @generated
	 */
	int PERSON_IDENT = 9;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_IDENT__WHEN = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_IDENT__PERSON = 1;

	/**
	 * The number of structural features of the '<em>Person Ident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_IDENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person Ident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_IDENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.git.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.nasdanika.models.git.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.git.Repository#getRemotes <em>Remotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remotes</em>'.
	 * @see org.nasdanika.models.git.Repository#getRemotes()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Remotes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.git.Repository#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.nasdanika.models.git.Repository#getReferences()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_References();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.git.Repository#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see org.nasdanika.models.git.Repository#getObjects()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.git.Repository#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see org.nasdanika.models.git.Repository#getPersons()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Persons();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.git.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.nasdanika.models.git.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.git.Remote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote</em>'.
	 * @see org.nasdanika.models.git.Remote
	 * @generated
	 */
	EClass getRemote();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.git.Remote#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.git.Remote#getName()
	 * @see #getRemote()
	 * @generated
	 */
	EAttribute getRemote_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.git.GitObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.nasdanika.models.git.GitObject
	 * @generated
	 */
	EClass getGitObject();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.git.GitObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.git.GitObject#getId()
	 * @see #getGitObject()
	 * @generated
	 */
	EAttribute getGitObject_Id();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.git.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.nasdanika.models.git.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.git.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see org.nasdanika.models.git.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.git.Blob <em>Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blob</em>'.
	 * @see org.nasdanika.models.git.Blob
	 * @generated
	 */
	EClass getBlob();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.git.Commit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit</em>'.
	 * @see org.nasdanika.models.git.Commit
	 * @generated
	 */
	EClass getCommit();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.git.Commit#getTree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tree</em>'.
	 * @see org.nasdanika.models.git.Commit#getTree()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Tree();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.git.Commit#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see org.nasdanika.models.git.Commit#getParents()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Parents();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.git.Commit#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.git.Commit#getChildren()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.git.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.nasdanika.models.git.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.git.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.git.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.git.Person#getEMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail</em>'.
	 * @see org.nasdanika.models.git.Person#getEMail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_EMail();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.git.Person#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see org.nasdanika.models.git.Person#getActivity()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Activity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.git.PersonIdent <em>Person Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Ident</em>'.
	 * @see org.nasdanika.models.git.PersonIdent
	 * @generated
	 */
	EClass getPersonIdent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.git.PersonIdent#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see org.nasdanika.models.git.PersonIdent#getWhen()
	 * @see #getPersonIdent()
	 * @generated
	 */
	EAttribute getPersonIdent_When();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.git.PersonIdent#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see org.nasdanika.models.git.PersonIdent#getPerson()
	 * @see #getPersonIdent()
	 * @generated
	 */
	EReference getPersonIdent_Person();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GitFactory getGitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.git.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.git.impl.RepositoryImpl
		 * @see org.nasdanika.models.git.impl.GitPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();
		/**
		 * The meta object literal for the '<em><b>Remotes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__REMOTES = eINSTANCE.getRepository_Remotes();
		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__REFERENCES = eINSTANCE.getRepository_References();
		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__OBJECTS = eINSTANCE.getRepository_Objects();
		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__PERSONS = eINSTANCE.getRepository_Persons();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.git.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.git.impl.ReferenceImpl
		 * @see org.nasdanika.models.git.impl.GitPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.git.impl.RemoteImpl <em>Remote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.git.impl.RemoteImpl
		 * @see org.nasdanika.models.git.impl.GitPackageImpl#getRemote()
		 * @generated
		 */
		EClass REMOTE = eINSTANCE.getRemote();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE__NAME = eINSTANCE.getRemote_Name();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.git.impl.GitObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.git.impl.GitObjectImpl
		 * @see org.nasdanika.models.git.impl.GitPackageImpl#getGitObject()
		 * @generated
		 */
		EClass GIT_OBJECT = eINSTANCE.getGitObject();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_OBJECT__ID = eINSTANCE.getGitObject_Id();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.git.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.git.impl.TagImpl
		 * @see org.nasdanika.models.git.impl.GitPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.git.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.git.impl.TreeImpl
		 * @see org.nasdanika.models.git.impl.GitPackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.git.impl.BlobImpl <em>Blob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.git.impl.BlobImpl
		 * @see org.nasdanika.models.git.impl.GitPackageImpl#getBlob()
		 * @generated
		 */
		EClass BLOB = eINSTANCE.getBlob();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.git.impl.CommitImpl <em>Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.git.impl.CommitImpl
		 * @see org.nasdanika.models.git.impl.GitPackageImpl#getCommit()
		 * @generated
		 */
		EClass COMMIT = eINSTANCE.getCommit();
		/**
		 * The meta object literal for the '<em><b>Tree</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__TREE = eINSTANCE.getCommit_Tree();
		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__PARENTS = eINSTANCE.getCommit_Parents();
		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__CHILDREN = eINSTANCE.getCommit_Children();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.git.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.git.impl.PersonImpl
		 * @see org.nasdanika.models.git.impl.GitPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();
		/**
		 * The meta object literal for the '<em><b>EMail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_EMail();
		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ACTIVITY = eINSTANCE.getPerson_Activity();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.git.impl.PersonIdentImpl <em>Person Ident</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.git.impl.PersonIdentImpl
		 * @see org.nasdanika.models.git.impl.GitPackageImpl#getPersonIdent()
		 * @generated
		 */
		EClass PERSON_IDENT = eINSTANCE.getPersonIdent();
		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_IDENT__WHEN = eINSTANCE.getPersonIdent_When();
		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_IDENT__PERSON = eINSTANCE.getPersonIdent_Person();

	}

} //GitPackage
