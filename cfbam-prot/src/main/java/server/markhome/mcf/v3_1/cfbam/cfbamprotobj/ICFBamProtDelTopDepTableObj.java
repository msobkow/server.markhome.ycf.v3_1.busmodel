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

public interface ICFBamProtDelTopDepTableObj
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
	 *	Instantiate a new DelTopDep instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamProtDelTopDepObj newInstance();

	/**
	 *	Instantiate a new DelTopDep edition of the specified DelTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamProtDelTopDepEditObj newEditInstance( ICFBamProtDelTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamProtDelTopDepObj realiseDelTopDep( ICFBamProtDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamProtDelTopDepObj createDelTopDep( ICFBamProtDelTopDepObj Obj );

	/**
	 *	Read a DelTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtDelTopDepObj readDelTopDep( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a DelTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtDelTopDepObj readDelTopDep( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFBamProtDelTopDepObj readCachedDelTopDep( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeDelTopDep( ICFBamProtDelTopDepObj obj );

	void deepDisposeDelTopDep( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamProtDelTopDepObj lockDelTopDep( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DelTopDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtDelTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readAllDelTopDep();

	/**
	 *	Return a sorted map of all the DelTopDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtDelTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readAllDelTopDep( boolean forceRead );

	List<ICFBamProtDelTopDepObj> readCachedAllDelTopDep();

	/**
	 *	Get the ICFBamProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtDelTopDepObj readDelTopDepByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the ICFBamProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtDelTopDepObj readDelTopDepByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtDelTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtDelTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Get the map of ICFBamProtDelTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtDelTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByTenantIdx( ICFLibKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtDelTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtDelTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of ICFBamProtDelTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtDelTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtDelTopDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	RelationId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtDelTopDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByDelDepIdx( ICFLibKeyHash256 RelationId );

	/**
	 *	Get the map of ICFBamProtDelTopDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	RelationId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtDelTopDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByDelDepIdx( ICFLibKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFBamProtDelTopDepObj> instances sorted by their primary keys for the duplicate DelTopDepTblIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtDelTopDepObj> cached instances sorted by their primary keys for the duplicate DelTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByDelTopDepTblIdx( ICFLibKeyHash256 TableId );

	/**
	 *	Get the map of List<ICFBamProtDelTopDepObj> instances sorted by their primary keys for the duplicate DelTopDepTblIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtDelTopDepObj> cached instances sorted by their primary keys for the duplicate DelTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByDelTopDepTblIdx( ICFLibKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the ICFBamProtDelTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtDelTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtDelTopDepObj readDelTopDepByUNameIdx(ICFLibKeyHash256 TableId,
		String Name );

	/**
	 *	Get the ICFBamProtDelTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtDelTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtDelTopDepObj readDelTopDepByUNameIdx(ICFLibKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFBamProtDelTopDepObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtDelTopDepObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of List<ICFBamProtDelTopDepObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtDelTopDepObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByPrevIdx( CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFBamProtDelTopDepObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtDelTopDepObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of List<ICFBamProtDelTopDepObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtDelTopDepObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtDelTopDepObj> readDelTopDepByNextIdx( CFLibDbKeyHash256 NextId,
		boolean forceRead );

	ICFBamProtScopeObj readCachedDelTopDepByIdIdx( ICFLibKeyHash256 Id );

	List<List<ICFBamProtScopeObj>> readCachedDelTopDepByTenantIdx( ICFLibKeyHash256 TenantId );

	List<List<ICFBamProtDelDepObj>> readCachedDelTopDepByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	List<List<ICFBamProtDelDepObj>> readCachedDelTopDepByDelDepIdx( ICFLibKeyHash256 RelationId );

	List<List<ICFBamProtDelTopDepObj>> readCachedDelTopDepByDelTopDepTblIdx( ICFLibKeyHash256 TableId );

	ICFBamProtDelTopDepObj readCachedDelTopDepByUNameIdx( ICFLibKeyHash256 TableId,
		String Name );

	List<List<ICFBamProtDelTopDepObj>> readCachedDelTopDepByPrevIdx( CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtDelTopDepObj>> readCachedDelTopDepByNextIdx( CFLibDbKeyHash256 NextId );

	void deepDisposeDelTopDepByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeDelTopDepByTenantIdx( ICFLibKeyHash256 TenantId );

	void deepDisposeDelTopDepByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeDelTopDepByDelDepIdx( ICFLibKeyHash256 RelationId );

	void deepDisposeDelTopDepByDelTopDepTblIdx( ICFLibKeyHash256 TableId );

	void deepDisposeDelTopDepByUNameIdx( ICFLibKeyHash256 TableId,
		String Name );

	void deepDisposeDelTopDepByPrevIdx( CFLibDbKeyHash256 PrevId );

	void deepDisposeDelTopDepByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	ICFBamProtDelTopDepObj updateDelTopDep( ICFBamProtDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDelTopDep( ICFBamProtDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDelDepIdx( ICFLibKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDelTopDepTblIdx( ICFLibKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByUNameIdx(ICFLibKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Move the ICFBamProtDelTopDepObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtDelTopDepObj refreshed cache instance.
	 */
	ICFBamProtDelTopDepObj moveUpDelTopDep( ICFBamProtDelTopDepObj Obj );

	/**
	 *	Move the ICFBamProtDelTopDepObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtDelTopDepObj refreshed cache instance.
	 */
	ICFBamProtDelTopDepObj moveDownDelTopDep( ICFBamProtDelTopDepObj Obj );
}
