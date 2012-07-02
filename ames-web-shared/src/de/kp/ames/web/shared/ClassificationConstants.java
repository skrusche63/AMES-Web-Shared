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
	 * Common Classification Scheme
	 */
	public static String FNC_ID = "urn:oasis:names:tc:ebxml-regrep:FNC";
		
	/*
	 * Business Classification Nodes
	 */
	public static String FNC_ID_Accessor       = FNC_ID + ":Accessor";
	public static String FNC_ID_Affiliation    = FNC_ID + ":Affiliation";
	public static String FNC_ID_Category       = FNC_ID + ":Category";
	public static String FNC_ID_Contact        = FNC_ID + ":Contact";	
	public static String FNC_ID_Community      = FNC_ID + ":Community";
	public static String FNC_ID_Database       = FNC_ID + ":Database";
	public static String FNC_ID_Document       = FNC_ID + ":Document";
	public static String FNC_ID_Edge           = FNC_ID + ":Edge";
	public static String FNC_ID_Evaluation     = FNC_ID + ":Evaluation";
	public static String FNC_ID_Folder         = FNC_ID + ":Folder";
	public static String FNC_ID_Image          = FNC_ID + ":Image";
	public static String FNC_ID_Link           = FNC_ID + ":Link";
	public static String FNC_ID_Namespace      = FNC_ID + ":Namespace";	
	public static String FNC_ID_Node           = FNC_ID + ":Node";
	public static String FNC_ID_Package        = FNC_ID + ":Package";
	public static String FNC_ID_Product        = FNC_ID + ":Product";
	public static String FNC_ID_Productor      = FNC_ID + ":Productor";
	public static String FNC_ID_Reasoner       = FNC_ID + ":Reasoner";
	public static String FNC_ID_Remote         = FNC_ID + ":Remote";
	public static String FNC_ID_Responsibility = FNC_ID + ":Responsibility";
	public static String FNC_ID_Role           = FNC_ID + ":Role";
	public static String FNC_ID_User           = FNC_ID + ":User";
	public static String FNC_ID_WebDav		   = FNC_ID + ":WebDav";
	
	/*
	 * Communication Classification Nodes
	 */
	public static String FNC_ID_Chat    = FNC_ID + ":Chat";
	public static String FNC_ID_Mail    = FNC_ID + ":Mail";
	public static String FNC_ID_Posting = FNC_ID + ":Posting";

	/*
	 * Security Classification Nodes
	 */
	public static String FNC_ID_Security = FNC_ID + ":Security";	
	
	public static String FNC_SECURITY_ID_App  = FNC_ID_Security + ":App";
	public static String FNC_SECURITY_ID_Safe = FNC_ID_Security + ":Safe";
	
	/*
	 * Symbol Classification Nodes
	 */
	public static String FNC_ID_Symbol = FNC_ID + ":Symbol";
	
	public static String FNC_SYMBOL_ID_APP6B = FNC_ID_Symbol + ":APP6-B";
	public static String FNC_SYMBOL_ID_Icon  = FNC_ID_Symbol + ":Icon";
	
	/*
	 * Transformation Classification Nodes
	 */
	public static String FNC_ID_Transformator =  FNC_ID + ":Transformator";

}
