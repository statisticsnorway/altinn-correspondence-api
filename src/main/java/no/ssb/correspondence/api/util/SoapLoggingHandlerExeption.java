/*
 * #%L
 * Altinn Webservice
 * %%
 * Copyright (C) 2009 - 2016 Patentstyret
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */
package no.ssb.correspondence.api.util;

public class SoapLoggingHandlerExeption extends RuntimeException {

	public SoapLoggingHandlerExeption(Exception e) {
		super(e);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7112139019245724867L;

}
