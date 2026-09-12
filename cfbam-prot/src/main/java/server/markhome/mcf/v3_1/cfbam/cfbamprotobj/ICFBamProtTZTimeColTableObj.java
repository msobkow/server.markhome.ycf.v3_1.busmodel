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

public interface ICFBamProtTZTimeColTableObj
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
	 *	Instantiate a new TZTimeCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamProtTZTimeColObj newInstance();

	/**
	 *	Instantiate a new TZTimeCol edition of the specified TZTimeCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamProtTZTimeColEditObj newEditInstance( ICFBamProtTZTimeColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTZTimeColObj realiseTZTimeCol( ICFBamProtTZTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTZTimeColObj createTZTimeCol( ICFBamProtTZTimeColObj Obj );

	/**
	 *	Read a TZTimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtTZTimeColObj readTZTimeCol( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a TZTimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtTZTimeColObj readTZTimeCol( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFBamProtTZTimeColObj readCachedTZTimeCol( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeTZTimeCol( ICFBamProtTZTimeColObj obj );

	void deepDisposeTZTimeCol( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTZTimeColObj lockTZTimeCol( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TZTimeCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readAllTZTimeCol();

	/**
	 *	Return a sorted map of all the TZTimeCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readAllTZTimeCol( boolean forceRead );

	List<ICFBamProtTZTimeColObj> readCachedAllTZTimeCol();

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTZTimeColObj readTZTimeColByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTZTimeColObj readTZTimeColByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTZTimeColObj readTZTimeColByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTZTimeColObj readTZTimeColByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByScopeIdx( ICFLibKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByPrevIdx( CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByNextIdx( CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtTZTimeColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTZTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFBamProtTZTimeColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtTZTimeColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByTableIdx( ICFLibKeyHash256 TableId );

	/**
	 *	Get the map of List<ICFBamProtTZTimeColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtTZTimeColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTZTimeColObj> readTZTimeColByTableIdx( ICFLibKeyHash256 TableId,
		boolean forceRead );

	ICFBamProtValueObj readCachedTZTimeColByIdIdx( ICFLibKeyHash256 Id );

	ICFBamProtValueObj readCachedTZTimeColByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	List<List<ICFBamProtValueObj>> readCachedTZTimeColByScopeIdx( ICFLibKeyHash256 ScopeId );

	List<List<ICFBamProtValueObj>> readCachedTZTimeColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	List<List<ICFBamProtValueObj>> readCachedTZTimeColByPrevIdx( CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedTZTimeColByNextIdx( CFLibDbKeyHash256 NextId );

	List<List<ICFBamProtValueObj>> readCachedTZTimeColByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedTZTimeColByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	List<List<ICFBamProtTZTimeColObj>> readCachedTZTimeColByTableIdx( ICFLibKeyHash256 TableId );

	void deepDisposeTZTimeColByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeTZTimeColByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	void deepDisposeTZTimeColByScopeIdx( ICFLibKeyHash256 ScopeId );

	void deepDisposeTZTimeColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeTZTimeColByPrevIdx( CFLibDbKeyHash256 PrevId );

	void deepDisposeTZTimeColByNextIdx( CFLibDbKeyHash256 NextId );

	void deepDisposeTZTimeColByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	void deepDisposeTZTimeColByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	void deepDisposeTZTimeColByTableIdx( ICFLibKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTZTimeColObj updateTZTimeCol( ICFBamProtTZTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimeCol( ICFBamProtTZTimeColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByTableIdx( ICFLibKeyHash256 TableId );

	/**
	 *	Move the ICFBamProtTZTimeColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtTZTimeColObj refreshed cache instance.
	 */
	ICFBamProtTZTimeColObj moveUpTZTimeCol( ICFBamProtTZTimeColObj Obj );

	/**
	 *	Move the ICFBamProtTZTimeColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtTZTimeColObj refreshed cache instance.
	 */
	ICFBamProtTZTimeColObj moveDownTZTimeCol( ICFBamProtTZTimeColObj Obj );
}
