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

public interface ICFBamPubServerMethodTableObj
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
	 *	Instantiate a new ServerMethod instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamPubServerMethodObj newInstance();

	/**
	 *	Instantiate a new ServerMethod edition of the specified ServerMethod instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamPubServerMethodEditObj newEditInstance( ICFBamPubServerMethodObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamPubServerMethodObj realiseServerMethod( ICFBamPubServerMethodObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamPubServerMethodObj createServerMethod( ICFBamPubServerMethodObj Obj );

	/**
	 *	Read a ServerMethod-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerMethod-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubServerMethodObj readServerMethod( ICFLibKeyHash256 pkey );

	/**
	 *	Read a ServerMethod-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerMethod-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubServerMethodObj readServerMethod( ICFLibKeyHash256 pkey,
		boolean forceRead );

	ICFBamPubServerMethodObj readCachedServerMethod( ICFLibKeyHash256 pkey );

	public void reallyDeepDisposeServerMethod( ICFBamPubServerMethodObj obj );

	void deepDisposeServerMethod( ICFLibKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamPubServerMethodObj lockServerMethod( ICFLibKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ServerMethod-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubServerMethodObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubServerMethodObj> readAllServerMethod();

	/**
	 *	Return a sorted map of all the ServerMethod-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubServerMethodObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubServerMethodObj> readAllServerMethod( boolean forceRead );

	List<ICFBamPubServerMethodObj> readCachedAllServerMethod();

	/**
	 *	Get the CFBamPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubServerMethodObj readServerMethodByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Get the CFBamPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubServerMethodObj readServerMethodByIdIdx( CFLibDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerMethodObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerMethodObj> readServerMethodByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerMethodObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerMethodObj> readServerMethodByTenantIdx( CFLibDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the CFBamPubServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubServerMethodObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubServerMethodObj readServerMethodByUNameIdx(CFLibDbKeyHash256 TableId,
		String Name );

	/**
	 *	Get the CFBamPubServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubServerMethodObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubServerMethodObj readServerMethodByUNameIdx(CFLibDbKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerMethodObj> readServerMethodByMethTableIdx( CFLibDbKeyHash256 TableId );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerMethodObj> readServerMethodByMethTableIdx( CFLibDbKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerMethodObj> readServerMethodByMethCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerMethodObj> readServerMethodByMethCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerMethodObj> readServerMethodByMethTableVisIdx( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerMethodObj> readServerMethodByMethTableVisIdx( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerMethodObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerMethodObj> readServerMethodByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerMethodObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerMethodObj> readServerMethodByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	ICFBamPubServerMethodObj readCachedServerMethodByIdIdx( CFLibDbKeyHash256 Id );

	List<ICFBamPubServerMethodObj> readCachedServerMethodByTenantIdx( CFLibDbKeyHash256 TenantId );

	ICFBamPubServerMethodObj readCachedServerMethodByUNameIdx( CFLibDbKeyHash256 TableId,
		String Name );

	List<ICFBamPubServerMethodObj> readCachedServerMethodByMethTableIdx( CFLibDbKeyHash256 TableId );

	List<ICFBamPubServerMethodObj> readCachedServerMethodByMethCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamPubServerMethodObj> readCachedServerMethodByMethTableVisIdx( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamPubServerMethodObj> readCachedServerMethodByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeServerMethodByIdIdx( CFLibDbKeyHash256 Id );

	void deepDisposeServerMethodByTenantIdx( CFLibDbKeyHash256 TenantId );

	void deepDisposeServerMethodByUNameIdx( CFLibDbKeyHash256 TableId,
		String Name );

	void deepDisposeServerMethodByMethTableIdx( CFLibDbKeyHash256 TableId );

	void deepDisposeServerMethodByMethCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerMethodByMethTableVisIdx( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerMethodByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 */
	ICFBamPubServerMethodObj updateServerMethod( ICFBamPubServerMethodObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServerMethod( ICFBamPubServerMethodObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByUNameIdx(CFLibDbKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByMethTableIdx( CFLibDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByMethCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByMethTableVisIdx( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );
}
