// Description: Java 25 Public Table Object interface for CFBamPub.

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

package server.markhome.mcf.v3_1.cfbam.cfbampubobj;

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
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;

public interface ICFBamPubUuidTypeTableObj
{
	public ICFBamPubSchemaObj getSchema();
	public void setSchema( ICFBamPubSchemaObj value );

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
	 *	Instantiate a new UuidType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamPubUuidTypeObj newInstance();

	/**
	 *	Instantiate a new UuidType edition of the specified UuidType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamPubUuidTypeEditObj newEditInstance( ICFBamPubUuidTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamPubUuidTypeObj realiseUuidType( ICFBamPubUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamPubUuidTypeObj createUuidType( ICFBamPubUuidTypeObj Obj );

	/**
	 *	Read a UuidType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubUuidTypeObj readUuidType( ICFLibKeyHash256 pkey );

	/**
	 *	Read a UuidType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubUuidTypeObj readUuidType( ICFLibKeyHash256 pkey,
		boolean forceRead );

	ICFBamPubUuidTypeObj readCachedUuidType( ICFLibKeyHash256 pkey );

	public void reallyDeepDisposeUuidType( ICFBamPubUuidTypeObj obj );

	void deepDisposeUuidType( ICFLibKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamPubUuidTypeObj lockUuidType( ICFLibKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the UuidType-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubUuidTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readAllUuidType();

	/**
	 *	Return a sorted map of all the UuidType-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubUuidTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readAllUuidType( boolean forceRead );

	List<ICFBamPubUuidTypeObj> readCachedAllUuidType();

	/**
	 *	Get the CFBamPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubUuidTypeObj readUuidTypeByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Get the CFBamPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubUuidTypeObj readUuidTypeByIdIdx( CFLibDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the CFBamPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubUuidTypeObj readUuidTypeByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the CFBamPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubUuidTypeObj readUuidTypeByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByScopeIdx( CFLibDbKeyHash256 ScopeId );

	/**
	 *	Get the map of CFBamPubUuidTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByScopeIdx( CFLibDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of CFBamPubUuidTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of CFBamPubUuidTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByPrevIdx( CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of CFBamPubUuidTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByNextIdx( CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of CFBamPubUuidTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of CFBamPubUuidTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubUuidTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeBySchemaIdx( CFLibDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of CFBamPubUuidTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubUuidTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubUuidTypeObj> readUuidTypeBySchemaIdx( CFLibDbKeyHash256 SchemaDefId,
		boolean forceRead );

	ICFBamPubUuidTypeObj readCachedUuidTypeByIdIdx( CFLibDbKeyHash256 Id );

	ICFBamPubUuidTypeObj readCachedUuidTypeByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	List<ICFBamPubUuidTypeObj> readCachedUuidTypeByScopeIdx( CFLibDbKeyHash256 ScopeId );

	List<ICFBamPubUuidTypeObj> readCachedUuidTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	List<ICFBamPubUuidTypeObj> readCachedUuidTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	List<ICFBamPubUuidTypeObj> readCachedUuidTypeByNextIdx( CFLibDbKeyHash256 NextId );

	List<ICFBamPubUuidTypeObj> readCachedUuidTypeByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	List<ICFBamPubUuidTypeObj> readCachedUuidTypeByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	List<ICFBamPubUuidTypeObj> readCachedUuidTypeBySchemaIdx( CFLibDbKeyHash256 SchemaDefId );

	void deepDisposeUuidTypeByIdIdx( CFLibDbKeyHash256 Id );

	void deepDisposeUuidTypeByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeUuidTypeByScopeIdx( CFLibDbKeyHash256 ScopeId );

	void deepDisposeUuidTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeUuidTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	void deepDisposeUuidTypeByNextIdx( CFLibDbKeyHash256 NextId );

	void deepDisposeUuidTypeByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	void deepDisposeUuidTypeByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	void deepDisposeUuidTypeBySchemaIdx( CFLibDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamPubUuidTypeObj updateUuidType( ICFBamPubUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidType( ICFBamPubUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByScopeIdx( CFLibDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeBySchemaIdx( CFLibDbKeyHash256 SchemaDefId );

	/**
	 *	Move the CFBamPubUuidTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamPubUuidTypeObj refreshed cache instance.
	 */
	ICFBamPubUuidTypeObj moveUpUuidType( ICFBamPubUuidTypeObj Obj );

	/**
	 *	Move the CFBamPubUuidTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamPubUuidTypeObj refreshed cache instance.
	 */
	ICFBamPubUuidTypeObj moveDownUuidType( ICFBamPubUuidTypeObj Obj );
}
