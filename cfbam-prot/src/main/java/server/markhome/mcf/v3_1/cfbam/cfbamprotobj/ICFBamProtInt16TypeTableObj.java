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

public interface ICFBamProtInt16TypeTableObj
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
	 *	Instantiate a new Int16Type instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamProtInt16TypeObj newInstance();

	/**
	 *	Instantiate a new Int16Type edition of the specified Int16Type instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamProtInt16TypeEditObj newEditInstance( ICFBamProtInt16TypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamProtInt16TypeObj realiseInt16Type( ICFBamProtInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamProtInt16TypeObj createInt16Type( ICFBamProtInt16TypeObj Obj );

	/**
	 *	Read a Int16Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtInt16TypeObj readInt16Type( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a Int16Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int16Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtInt16TypeObj readInt16Type( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFBamProtInt16TypeObj readCachedInt16Type( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeInt16Type( ICFBamProtInt16TypeObj obj );

	void deepDisposeInt16Type( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamProtInt16TypeObj lockInt16Type( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Int16Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readAllInt16Type();

	/**
	 *	Return a sorted map of all the Int16Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readAllInt16Type( boolean forceRead );

	List<ICFBamProtInt16TypeObj> readCachedAllInt16Type();

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtInt16TypeObj readInt16TypeByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtInt16TypeObj readInt16TypeByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtInt16TypeObj readInt16TypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtInt16TypeObj readInt16TypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByScopeIdx( ICFLibKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByPrevIdx( CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByNextIdx( CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtInt16TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtInt16TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFBamProtInt16TypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtInt16TypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	/**
	 *	Get the map of List<ICFBamProtInt16TypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtInt16TypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtInt16TypeObj> readInt16TypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId,
		boolean forceRead );

	ICFBamProtValueObj readCachedInt16TypeByIdIdx( ICFLibKeyHash256 Id );

	ICFBamProtValueObj readCachedInt16TypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	List<List<ICFBamProtValueObj>> readCachedInt16TypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	List<List<ICFBamProtValueObj>> readCachedInt16TypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	List<List<ICFBamProtValueObj>> readCachedInt16TypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedInt16TypeByNextIdx( CFLibDbKeyHash256 NextId );

	List<List<ICFBamProtValueObj>> readCachedInt16TypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedInt16TypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	List<List<ICFBamProtInt16TypeObj>> readCachedInt16TypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	void deepDisposeInt16TypeByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeInt16TypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	void deepDisposeInt16TypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	void deepDisposeInt16TypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeInt16TypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	void deepDisposeInt16TypeByNextIdx( CFLibDbKeyHash256 NextId );

	void deepDisposeInt16TypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	void deepDisposeInt16TypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	void deepDisposeInt16TypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamProtInt16TypeObj updateInt16Type( ICFBamProtInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt16Type( ICFBamProtInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int16Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Int16Type key attribute of the instance generating the id.
	 */
	void deleteInt16TypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	/**
	 *	Move the ICFBamProtInt16TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtInt16TypeObj refreshed cache instance.
	 */
	ICFBamProtInt16TypeObj moveUpInt16Type( ICFBamProtInt16TypeObj Obj );

	/**
	 *	Move the ICFBamProtInt16TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtInt16TypeObj refreshed cache instance.
	 */
	ICFBamProtInt16TypeObj moveDownInt16Type( ICFBamProtInt16TypeObj Obj );
}
