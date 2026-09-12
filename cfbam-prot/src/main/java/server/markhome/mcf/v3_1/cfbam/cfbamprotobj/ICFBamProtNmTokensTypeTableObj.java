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

public interface ICFBamProtNmTokensTypeTableObj
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
	 *	Instantiate a new NmTokensType instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamProtNmTokensTypeObj newInstance();

	/**
	 *	Instantiate a new NmTokensType edition of the specified NmTokensType instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamProtNmTokensTypeEditObj newEditInstance( ICFBamProtNmTokensTypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamProtNmTokensTypeObj realiseNmTokensType( ICFBamProtNmTokensTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamProtNmTokensTypeObj createNmTokensType( ICFBamProtNmTokensTypeObj Obj );

	/**
	 *	Read a NmTokensType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtNmTokensTypeObj readNmTokensType( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a NmTokensType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtNmTokensTypeObj readNmTokensType( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFBamProtNmTokensTypeObj readCachedNmTokensType( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeNmTokensType( ICFBamProtNmTokensTypeObj obj );

	void deepDisposeNmTokensType( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamProtNmTokensTypeObj lockNmTokensType( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the NmTokensType-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readAllNmTokensType();

	/**
	 *	Return a sorted map of all the NmTokensType-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readAllNmTokensType( boolean forceRead );

	List<ICFBamProtNmTokensTypeObj> readCachedAllNmTokensType();

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtNmTokensTypeObj readNmTokensTypeByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtNmTokensTypeObj readNmTokensTypeByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtNmTokensTypeObj readNmTokensTypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtNmTokensTypeObj readNmTokensTypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByScopeIdx( ICFLibKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByPrevIdx( CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByNextIdx( CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtNmTokensTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFBamProtNmTokensTypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtNmTokensTypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	/**
	 *	Get the map of List<ICFBamProtNmTokensTypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtNmTokensTypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtNmTokensTypeObj> readNmTokensTypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId,
		boolean forceRead );

	ICFBamProtValueObj readCachedNmTokensTypeByIdIdx( ICFLibKeyHash256 Id );

	ICFBamProtValueObj readCachedNmTokensTypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	List<List<ICFBamProtValueObj>> readCachedNmTokensTypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	List<List<ICFBamProtValueObj>> readCachedNmTokensTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	List<List<ICFBamProtValueObj>> readCachedNmTokensTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedNmTokensTypeByNextIdx( CFLibDbKeyHash256 NextId );

	List<List<ICFBamProtValueObj>> readCachedNmTokensTypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedNmTokensTypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	List<List<ICFBamProtNmTokensTypeObj>> readCachedNmTokensTypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	void deepDisposeNmTokensTypeByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeNmTokensTypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	void deepDisposeNmTokensTypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	void deepDisposeNmTokensTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeNmTokensTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	void deepDisposeNmTokensTypeByNextIdx( CFLibDbKeyHash256 NextId );

	void deepDisposeNmTokensTypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	void deepDisposeNmTokensTypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	void deepDisposeNmTokensTypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamProtNmTokensTypeObj updateNmTokensType( ICFBamProtNmTokensTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokensType( ICFBamProtNmTokensTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	/**
	 *	Move the ICFBamProtNmTokensTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtNmTokensTypeObj refreshed cache instance.
	 */
	ICFBamProtNmTokensTypeObj moveUpNmTokensType( ICFBamProtNmTokensTypeObj Obj );

	/**
	 *	Move the ICFBamProtNmTokensTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtNmTokensTypeObj refreshed cache instance.
	 */
	ICFBamProtNmTokensTypeObj moveDownNmTokensType( ICFBamProtNmTokensTypeObj Obj );
}
