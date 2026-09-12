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

public interface ICFBamProtFloatTypeTableObj
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
	 *	Instantiate a new FloatType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamProtFloatTypeObj newInstance();

	/**
	 *	Instantiate a new FloatType edition of the specified FloatType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamProtFloatTypeEditObj newEditInstance( ICFBamProtFloatTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamProtFloatTypeObj realiseFloatType( ICFBamProtFloatTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamProtFloatTypeObj createFloatType( ICFBamProtFloatTypeObj Obj );

	/**
	 *	Read a FloatType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtFloatTypeObj readFloatType( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a FloatType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtFloatTypeObj readFloatType( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFBamProtFloatTypeObj readCachedFloatType( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeFloatType( ICFBamProtFloatTypeObj obj );

	void deepDisposeFloatType( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamProtFloatTypeObj lockFloatType( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the FloatType-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readAllFloatType();

	/**
	 *	Return a sorted map of all the FloatType-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readAllFloatType( boolean forceRead );

	List<ICFBamProtFloatTypeObj> readCachedAllFloatType();

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtFloatTypeObj readFloatTypeByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtFloatTypeObj readFloatTypeByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtFloatTypeObj readFloatTypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtFloatTypeObj readFloatTypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByScopeIdx( ICFLibKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByPrevIdx( CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByNextIdx( CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtFloatTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtFloatTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFBamProtFloatTypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtFloatTypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	/**
	 *	Get the map of List<ICFBamProtFloatTypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtFloatTypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtFloatTypeObj> readFloatTypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId,
		boolean forceRead );

	ICFBamProtValueObj readCachedFloatTypeByIdIdx( ICFLibKeyHash256 Id );

	ICFBamProtValueObj readCachedFloatTypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	List<List<ICFBamProtValueObj>> readCachedFloatTypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	List<List<ICFBamProtValueObj>> readCachedFloatTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	List<List<ICFBamProtValueObj>> readCachedFloatTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedFloatTypeByNextIdx( CFLibDbKeyHash256 NextId );

	List<List<ICFBamProtValueObj>> readCachedFloatTypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedFloatTypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	List<List<ICFBamProtFloatTypeObj>> readCachedFloatTypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	void deepDisposeFloatTypeByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeFloatTypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	void deepDisposeFloatTypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	void deepDisposeFloatTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeFloatTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	void deepDisposeFloatTypeByNextIdx( CFLibDbKeyHash256 NextId );

	void deepDisposeFloatTypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	void deepDisposeFloatTypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	void deepDisposeFloatTypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamProtFloatTypeObj updateFloatType( ICFBamProtFloatTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteFloatType( ICFBamProtFloatTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The FloatType key attribute of the instance generating the id.
	 */
	void deleteFloatTypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	/**
	 *	Move the ICFBamProtFloatTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtFloatTypeObj refreshed cache instance.
	 */
	ICFBamProtFloatTypeObj moveUpFloatType( ICFBamProtFloatTypeObj Obj );

	/**
	 *	Move the ICFBamProtFloatTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtFloatTypeObj refreshed cache instance.
	 */
	ICFBamProtFloatTypeObj moveDownFloatType( ICFBamProtFloatTypeObj Obj );
}
