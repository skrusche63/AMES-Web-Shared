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

public class FormatConstants {

	/*
	 * Format Classification Nodes
	 */
	public static String FNC_ID_Format = ClassificationConstants.FNC_ID + ":Format";

	public static String FNC_FORMAT_ID_File  = FNC_ID_Format + ":File";
	public static String FNC_FORMAT_ID_Html  = FNC_ID_Format + ":Html";
	public static String FNC_FORMAT_ID_Image = FNC_ID_Format + ":Image";

	// Classifcation Node for all JSON based response formats
	public static String FNC_FORMAT_ID_Json = FNC_ID_Format + ":Json";

	public static String FNC_FORMAT_ID_Grid   = FNC_FORMAT_ID_Json + ":Grid";
	public static String FNC_FORMAT_ID_Object = FNC_FORMAT_ID_Json + ":Object";
	public static String FNC_FORMAT_ID_Tree   = FNC_FORMAT_ID_Json + ":Tree";

	// Classification Node for all RSS based response formats
	public static String FNC_FORMAT_ID_Rss = FNC_ID_Format + ":Rss";
	
	public static String FNC_FORMAT_ID_Text = FNC_ID_Format + ":Text";
	public static String FNC_FORMAT_ID_XML  = FNC_ID_Format + ":Xml";

}
