package de.kp.ames.web.shared.constants;
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

public class JsonConstants {

	/*
	 * Common exchange parameters
	 */
	public static String J_ID       = "id";
	public static String J_PID      = MethodConstants.ATTR_PARENT;
	public static String J_NAME     = "name";

	public static String J_IS_FOLDER = "isFolder";

	/*
	 * Symbol specific exchange parameters
	 */
	public static String J_CHILDREN = "children";
	public static String J_SYMB     = "symb";
	public static String J_SYMBOL   = "symbol";
	public static String J_URL      = "url";


	public static String J_AFFILIATE = "affiliate";
	public static String J_CARD      = "card";
	public static String J_CHECK     = "checked";
	public static String J_COUNT     = "count";
	public static String J_DESC      = "desc";
	public static String J_END  	 = "end";
	public static String J_FACET     = "facet";
	public static String J_FIELD     = "field";
	public static String J_GROUP     = "group";
	public static String J_ICON      = "icon";      
	public static String J_KEY       = "key";
	public static String J_LAT  	 = "lat";
	public static String J_LON  	 = "lon";
	public static String J_MIME      = "mimetype";
	public static String J_QUERY     = "query";
	public static String J_SOURCE    = "source";
	public static String J_START 	 = "start";
	public static String J_TERM      = "term";
	public static String J_VALUE     = "value";

	public static String J_SUCCESS   = "success";
	public static String J_MESSAGE   = "message";

	/*
	 * Remote DAV object description
	 */
	public static String J_URI = "uri";

	public static String J_CREATION_DATE = "creationDate";
	public static String J_LAST_MODIFIED = "lastModified";

	public static String J_CONTENT_LENGTH = "contentLength";
	public static String J_CONTENT_TYPE   = "contentType";

	/*
	 * Remote IMAP object
	 */
	public static String J_ATTACHMENT = "attachment";
	public static String J_DATE 	  = "date";
	public static String J_FROM       = "from";
    public static String J_SUBJECT    = "subject";		      
	
	/*
	 * Map specific exchange parameters
	 */
	public static String J_BBOX  = "bbox";
	public static String J_MAXX  = "maxx";
	public static String J_MAXY  = "maxy";
	public static String J_MINX  = "minx";
	public static String J_MINY  = "miny";
	public static String J_SRS   = "srs";
	public static String J_TITLE = "title";
	
}
