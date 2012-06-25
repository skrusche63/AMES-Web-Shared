package de.kp.ames.web.shared;
/**
 *	Copyright 2012 Dr. Krusche & Partner PartG
 *
 *	AMES-Web-Shared is free software: you can redistribute it and/or 
 *	modify it under the terms of the GNU General Public License 
 *	as published by the Free Software Foundation, either version 3 of 
 *	the License, or (at your option) any later version.
 *
 *	AMES- Web-Shared is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * 
 *  See the GNU General Public License for more details. 
 *
 *	You should have received a copy of the GNU General Public License
 *	along with this software. If not, see <http://www.gnu.org/licenses/>.
 *
 */

public class ClassificationConstants {

	/* 
	 * Common Classification Node
	 */
	public static String FNC_ID = "urn:oasis:names:tc:ebxml-regrep:FNC";

	/*
	 * Security Classification Nodes
	 */
	public static String FNC_ID_Security = FNC_ID + ":Security";	
	
	public static String FNC_SECURITY_ID_App  = FNC_ID_Security + ":App";
	public static String FNC_SECURITY_ID_Safe = FNC_ID_Security + ":Safe";

}
