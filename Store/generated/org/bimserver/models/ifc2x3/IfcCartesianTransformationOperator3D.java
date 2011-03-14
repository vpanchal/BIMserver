/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cartesian Transformation Operator3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator3D#getAxis3 <em>Axis3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator3D()
 * @model
 * @generated
 */
public interface IfcCartesianTransformationOperator3D extends IfcCartesianTransformationOperator {
	/**
	 * Returns the value of the '<em><b>Axis3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis3</em>' reference.
	 * @see #isSetAxis3()
	 * @see #unsetAxis3()
	 * @see #setAxis3(IfcDirection)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator3D_Axis3()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDirection getAxis3();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator3D#getAxis3 <em>Axis3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis3</em>' reference.
	 * @see #isSetAxis3()
	 * @see #unsetAxis3()
	 * @see #getAxis3()
	 * @generated
	 */
	void setAxis3(IfcDirection value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator3D#getAxis3 <em>Axis3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAxis3()
	 * @see #getAxis3()
	 * @see #setAxis3(IfcDirection)
	 * @generated
	 */
	void unsetAxis3();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator3D#getAxis3 <em>Axis3</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Axis3</em>' reference is set.
	 * @see #unsetAxis3()
	 * @see #getAxis3()
	 * @see #setAxis3(IfcDirection)
	 * @generated
	 */
	boolean isSetAxis3();

} // IfcCartesianTransformationOperator3D