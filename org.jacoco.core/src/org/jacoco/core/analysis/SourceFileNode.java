/*******************************************************************************
 * Copyright (c) 2009 Mountainminds GmbH & Co. KG and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Marc R. Hoffmann - initial API and implementation
 *    
 * $Id: $
 *******************************************************************************/
package org.jacoco.core.analysis;

/**
 * Coverage data of a single source file. As source file contains one or more
 * classes.
 * 
 * @author Marc R. Hoffmann
 * @version $Revision: $
 */
public class SourceFileNode extends CoverageDataNodeImpl {

	private final String packagename;

	/**
	 * Creates a source file data object with the given parameters.
	 * 
	 * @param name
	 *            name of the source file
	 * @param packagename
	 *            vm name of the package the source file belongs to
	 */
	public SourceFileNode(final String name, final String packagename) {
		super(ElementType.SOURCEFILE, name, true);
		this.packagename = packagename;
	}

	/**
	 * Returns the vm name of the package the source file belongs to.
	 * 
	 * @return package name
	 */
	public String getPackagename() {
		return packagename;
	}

}