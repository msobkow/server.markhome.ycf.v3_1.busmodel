// Description: Java 25 Table Object interface for CFBam.

/*
 *	server.markhome.mcf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.mcf.v3_1.cfbam.cfbamobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cflib.keyhash.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfbam.cfbampub.*;
import server.markhome.mcf.v3_1.cfbam.cfbamprot.*;
import server.markhome.mcf.v3_1.cfbam.cfbam.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbampubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbamprotobj.*;

public interface ICFBamStringColTableObj
{
	public ICFBamSchemaObj getSchema();
	public void setSchema( ICFBamSchemaObj value );

	public void minimizeMemory();

	public String getTableName();
	public String getTableDbName();

	/**
	 *	Get class code always returns the runtime class code for the objects, which is not stable until the application is done initializing and registering its objects.
	 *
	 *	@return runtime classcode
	 */ 
	public int getClassCode();

	/**
	 *	Get the backing store schema's class code, which is hard-coded into the object hierarchy.
	 *
	 *	@return The hardcoded backing store class code for this object, which is only valid in that schema.
	 */
	// public static int getBackingClassCode();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new StringCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamStringColObj newInstance();

	/**
	 *	Instantiate a new StringCol edition of the specified StringCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamStringColEditObj newEditInstance( ICFBamStringColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamStringColObj realiseStringCol( ICFBamStringColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamStringColObj createStringCol( ICFBamStringColObj Obj );

	/**
	 *	Read a StringCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamStringColObj readStringCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a StringCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamStringColObj readStringCol( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	ICFBamStringColObj readCachedStringCol( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeStringCol( ICFBamStringColObj obj );

	void deepDisposeStringCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamStringColObj lockStringCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the StringCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamStringColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamStringColObj> readAllStringCol();

	/**
	 *	Return a sorted map of all the StringCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamStringColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamStringColObj> readAllStringCol( boolean forceRead );

	List<ICFBamStringColObj> readCachedAllStringCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringColObj readStringColByIdIdx( IMCFKeyHash256 Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringColObj readStringColByIdIdx( IMCFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringColObj readStringColByUNameIdx( IMCFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamStringColObj readStringColByUNameIdx( IMCFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByScopeIdx( IMCFKeyHash256 ScopeId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByScopeIdx( IMCFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByDefSchemaIdx( IMCFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByDefSchemaIdx( IMCFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByPrevIdx( IMCFKeyHash256 PrevId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByPrevIdx( IMCFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByNextIdx( IMCFKeyHash256 NextId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByNextIdx( IMCFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByContPrevIdx( IMCFKeyHash256 ScopeId,
		IMCFKeyHash256 PrevId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByContPrevIdx( IMCFKeyHash256 ScopeId,
		IMCFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByContNextIdx( IMCFKeyHash256 ScopeId,
		IMCFKeyHash256 NextId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByContNextIdx( IMCFKeyHash256 ScopeId,
		IMCFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByTableIdx( IMCFKeyHash256 TableId );

	/**
	 *	Get the map of CFBamStringColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamStringColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamStringColObj> readStringColByTableIdx( IMCFKeyHash256 TableId,
		boolean forceRead );

	ICFBamStringColObj readCachedStringColByIdIdx( IMCFKeyHash256 Id );

	ICFBamStringColObj readCachedStringColByUNameIdx( IMCFKeyHash256 ScopeId,
		String Name );

	List<ICFBamStringColObj> readCachedStringColByScopeIdx( IMCFKeyHash256 ScopeId );

	List<ICFBamStringColObj> readCachedStringColByDefSchemaIdx( IMCFKeyHash256 DefSchemaId );

	List<ICFBamStringColObj> readCachedStringColByPrevIdx( IMCFKeyHash256 PrevId );

	List<ICFBamStringColObj> readCachedStringColByNextIdx( IMCFKeyHash256 NextId );

	List<ICFBamStringColObj> readCachedStringColByContPrevIdx( IMCFKeyHash256 ScopeId,
		IMCFKeyHash256 PrevId );

	List<ICFBamStringColObj> readCachedStringColByContNextIdx( IMCFKeyHash256 ScopeId,
		IMCFKeyHash256 NextId );

	List<ICFBamStringColObj> readCachedStringColByTableIdx( IMCFKeyHash256 TableId );

	void deepDisposeStringColByIdIdx( IMCFKeyHash256 Id );

	void deepDisposeStringColByUNameIdx( IMCFKeyHash256 ScopeId,
		String Name );

	void deepDisposeStringColByScopeIdx( IMCFKeyHash256 ScopeId );

	void deepDisposeStringColByDefSchemaIdx( IMCFKeyHash256 DefSchemaId );

	void deepDisposeStringColByPrevIdx( IMCFKeyHash256 PrevId );

	void deepDisposeStringColByNextIdx( IMCFKeyHash256 NextId );

	void deepDisposeStringColByContPrevIdx( IMCFKeyHash256 ScopeId,
		IMCFKeyHash256 PrevId );

	void deepDisposeStringColByContNextIdx( IMCFKeyHash256 ScopeId,
		IMCFKeyHash256 NextId );

	void deepDisposeStringColByTableIdx( IMCFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamStringColObj updateStringCol( ICFBamStringColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteStringCol( ICFBamStringColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByIdIdx( IMCFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByUNameIdx( IMCFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByScopeIdx( IMCFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByDefSchemaIdx( IMCFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByPrevIdx( IMCFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByNextIdx( IMCFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByContPrevIdx( IMCFKeyHash256 ScopeId,
		IMCFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByContNextIdx( IMCFKeyHash256 ScopeId,
		IMCFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The StringCol key attribute of the instance generating the id.
	 */
	void deleteStringColByTableIdx( IMCFKeyHash256 TableId );

	/**
	 *	Move the CFBamStringColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamStringColObj refreshed cache instance.
	 */
	ICFBamStringColObj moveUpStringCol( ICFBamStringColObj Obj );

	/**
	 *	Move the CFBamStringColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamStringColObj refreshed cache instance.
	 */
	ICFBamStringColObj moveDownStringCol( ICFBamStringColObj Obj );
}
