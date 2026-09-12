// Description: Java 25 Protected Table Object interface for CFBamProt.

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

package server.markhome.mcf.v3_1.cfbam.cfbamprotobj;

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
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbampubobj.*;

public interface ICFBamProtTZTimestampColTableObj
{
	public ICFBamProtSchemaObj getSchema();
	public void setSchema( ICFBamProtSchemaObj value );

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
	 *	Instantiate a new TZTimestampCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamProtTZTimestampColObj newInstance();

	/**
	 *	Instantiate a new TZTimestampCol edition of the specified TZTimestampCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamProtTZTimestampColEditObj newEditInstance( ICFBamProtTZTimestampColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTZTimestampColObj realiseTZTimestampCol( ICFBamProtTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTZTimestampColObj createTZTimestampCol( ICFBamProtTZTimestampColObj Obj );

	/**
	 *	Read a TZTimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtTZTimestampColObj readTZTimestampCol( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a TZTimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtTZTimestampColObj readTZTimestampCol( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFBamProtTZTimestampColObj readCachedTZTimestampCol( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeTZTimestampCol( ICFBamProtTZTimestampColObj obj );

	void deepDisposeTZTimestampCol( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTZTimestampColObj lockTZTimestampCol( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TZTimestampCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readAllTZTimestampCol();

	/**
	 *	Return a sorted map of all the TZTimestampCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readAllTZTimestampCol( boolean forceRead );

	List<ICFBamProtTZTimestampColObj> readCachedAllTZTimestampCol();

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTZTimestampColObj readTZTimestampColByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTZTimestampColObj readTZTimestampColByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTZTimestampColObj readTZTimestampColByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTZTimestampColObj readTZTimestampColByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByScopeIdx( ICFLibKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByPrevIdx( CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByNextIdx( CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtTZTimestampColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFBamProtTZTimestampColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtTZTimestampColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByTableIdx( ICFLibKeyHash256 TableId );

	/**
	 *	Get the map of List<ICFBamProtTZTimestampColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtTZTimestampColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimestampColObj> readTZTimestampColByTableIdx( ICFLibKeyHash256 TableId,
		boolean forceRead );

	ICFBamProtValueObj readCachedTZTimestampColByIdIdx( ICFLibKeyHash256 Id );

	ICFBamProtValueObj readCachedTZTimestampColByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	List<List<ICFBamProtValueObj>> readCachedTZTimestampColByScopeIdx( ICFLibKeyHash256 ScopeId );

	List<List<ICFBamProtValueObj>> readCachedTZTimestampColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	List<List<ICFBamProtValueObj>> readCachedTZTimestampColByPrevIdx( CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedTZTimestampColByNextIdx( CFLibDbKeyHash256 NextId );

	List<List<ICFBamProtValueObj>> readCachedTZTimestampColByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedTZTimestampColByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	List<List<ICFBamProtTZTimestampColObj>> readCachedTZTimestampColByTableIdx( ICFLibKeyHash256 TableId );

	void deepDisposeTZTimestampColByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeTZTimestampColByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	void deepDisposeTZTimestampColByScopeIdx( ICFLibKeyHash256 ScopeId );

	void deepDisposeTZTimestampColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeTZTimestampColByPrevIdx( CFLibDbKeyHash256 PrevId );

	void deepDisposeTZTimestampColByNextIdx( CFLibDbKeyHash256 NextId );

	void deepDisposeTZTimestampColByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	void deepDisposeTZTimestampColByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	void deepDisposeTZTimestampColByTableIdx( ICFLibKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTZTimestampColObj updateTZTimestampCol( ICFBamProtTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimestampCol( ICFBamProtTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByTableIdx( ICFLibKeyHash256 TableId );

	/**
	 *	Move the ICFBamProtTZTimestampColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtTZTimestampColObj refreshed cache instance.
	 */
	ICFBamProtTZTimestampColObj moveUpTZTimestampCol( ICFBamProtTZTimestampColObj Obj );

	/**
	 *	Move the ICFBamProtTZTimestampColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtTZTimestampColObj refreshed cache instance.
	 */
	ICFBamProtTZTimestampColObj moveDownTZTimestampCol( ICFBamProtTZTimestampColObj Obj );
}
