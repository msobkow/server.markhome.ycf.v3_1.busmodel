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

public interface ICFBamPubIndexTableObj
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
	 *	Instantiate a new Index instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamPubIndexObj newInstance();

	/**
	 *	Instantiate a new Index edition of the specified Index instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamPubIndexEditObj newEditInstance( ICFBamPubIndexObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamPubIndexObj realiseIndex( ICFBamPubIndexObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamPubIndexObj createIndex( ICFBamPubIndexObj Obj );

	/**
	 *	Read a Index-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Index-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubIndexObj readIndex( ICFLibKeyHash256 pkey );

	/**
	 *	Read a Index-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Index-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubIndexObj readIndex( ICFLibKeyHash256 pkey,
		boolean forceRead );

	ICFBamPubIndexObj readCachedIndex( ICFLibKeyHash256 pkey );

	public void reallyDeepDisposeIndex( ICFBamPubIndexObj obj );

	void deepDisposeIndex( ICFLibKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamPubIndexObj lockIndex( ICFLibKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Index-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubIndexObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubIndexObj> readAllIndex();

	/**
	 *	Return a sorted map of all the Index-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubIndexObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubIndexObj> readAllIndex( boolean forceRead );

	List<ICFBamPubIndexObj> readCachedAllIndex();

	/**
	 *	Get the CFBamPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubIndexObj readIndexByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Get the CFBamPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubIndexObj readIndexByIdIdx( CFLibDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubIndexObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubIndexObj> readIndexByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Get the map of CFBamPubIndexObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubIndexObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubIndexObj> readIndexByTenantIdx( CFLibDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the CFBamPubIndexObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubIndexObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubIndexObj readIndexByUNameIdx(CFLibDbKeyHash256 TableId,
		String Name );

	/**
	 *	Get the CFBamPubIndexObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Index key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubIndexObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubIndexObj readIndexByUNameIdx(CFLibDbKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubIndexObj instances sorted by their primary keys for the duplicate IdxTableIdx key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubIndexObj cached instances sorted by their primary keys for the duplicate IdxTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubIndexObj> readIndexByIdxTableIdx( CFLibDbKeyHash256 TableId );

	/**
	 *	Get the map of CFBamPubIndexObj instances sorted by their primary keys for the duplicate IdxTableIdx key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubIndexObj cached instances sorted by their primary keys for the duplicate IdxTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubIndexObj> readIndexByIdxTableIdx( CFLibDbKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubIndexObj instances sorted by their primary keys for the duplicate IdxCodeVisIdx key.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubIndexObj cached instances sorted by their primary keys for the duplicate IdxCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubIndexObj> readIndexByIdxCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamPubIndexObj instances sorted by their primary keys for the duplicate IdxCodeVisIdx key.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubIndexObj cached instances sorted by their primary keys for the duplicate IdxCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubIndexObj> readIndexByIdxCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubIndexObj instances sorted by their primary keys for the duplicate IdxTblCdVisX key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubIndexObj cached instances sorted by their primary keys for the duplicate IdxTblCdVisX key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubIndexObj> readIndexByIdxTblCdVisX( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamPubIndexObj instances sorted by their primary keys for the duplicate IdxTblCdVisX key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubIndexObj cached instances sorted by their primary keys for the duplicate IdxTblCdVisX key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubIndexObj> readIndexByIdxTblCdVisX( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubIndexObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubIndexObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubIndexObj> readIndexByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of CFBamPubIndexObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubIndexObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubIndexObj> readIndexByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	ICFBamPubIndexObj readCachedIndexByIdIdx( CFLibDbKeyHash256 Id );

	List<ICFBamPubIndexObj> readCachedIndexByTenantIdx( CFLibDbKeyHash256 TenantId );

	ICFBamPubIndexObj readCachedIndexByUNameIdx( CFLibDbKeyHash256 TableId,
		String Name );

	List<ICFBamPubIndexObj> readCachedIndexByIdxTableIdx( CFLibDbKeyHash256 TableId );

	List<ICFBamPubIndexObj> readCachedIndexByIdxCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamPubIndexObj> readCachedIndexByIdxTblCdVisX( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamPubIndexObj> readCachedIndexByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeIndexByIdIdx( CFLibDbKeyHash256 Id );

	void deepDisposeIndexByTenantIdx( CFLibDbKeyHash256 TenantId );

	void deepDisposeIndexByUNameIdx( CFLibDbKeyHash256 TableId,
		String Name );

	void deepDisposeIndexByIdxTableIdx( CFLibDbKeyHash256 TableId );

	void deepDisposeIndexByIdxCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeIndexByIdxTblCdVisX( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeIndexByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 */
	ICFBamPubIndexObj updateIndex( ICFBamPubIndexObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteIndex( ICFBamPubIndexObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByUNameIdx(CFLibDbKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdxTableIdx( CFLibDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdxCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdxTblCdVisX( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );
}
