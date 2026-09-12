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

public interface ICFBamPubServerProcTableObj
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
	 *	Instantiate a new ServerProc instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamPubServerProcObj newInstance();

	/**
	 *	Instantiate a new ServerProc edition of the specified ServerProc instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamPubServerProcEditObj newEditInstance( ICFBamPubServerProcObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamPubServerProcObj realiseServerProc( ICFBamPubServerProcObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamPubServerProcObj createServerProc( ICFBamPubServerProcObj Obj );

	/**
	 *	Read a ServerProc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerProc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubServerProcObj readServerProc( ICFLibKeyHash256 pkey );

	/**
	 *	Read a ServerProc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerProc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubServerProcObj readServerProc( ICFLibKeyHash256 pkey,
		boolean forceRead );

	ICFBamPubServerProcObj readCachedServerProc( ICFLibKeyHash256 pkey );

	public void reallyDeepDisposeServerProc( ICFBamPubServerProcObj obj );

	void deepDisposeServerProc( ICFLibKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamPubServerProcObj lockServerProc( ICFLibKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ServerProc-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubServerProcObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubServerProcObj> readAllServerProc();

	/**
	 *	Return a sorted map of all the ServerProc-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubServerProcObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubServerProcObj> readAllServerProc( boolean forceRead );

	List<ICFBamPubServerProcObj> readCachedAllServerProc();

	/**
	 *	Get the CFBamPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubServerProcObj readServerProcByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Get the CFBamPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubServerProcObj readServerProcByIdIdx( CFLibDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerProcObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerProcObj> readServerProcByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Get the map of CFBamPubServerProcObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerProcObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerProcObj> readServerProcByTenantIdx( CFLibDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the CFBamPubServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubServerMethodObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubServerProcObj readServerProcByUNameIdx( CFLibDbKeyHash256 TableId,
		String Name );

	/**
	 *	Get the CFBamPubServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubServerMethodObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubServerProcObj readServerProcByUNameIdx( CFLibDbKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerProcObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerProcObj> readServerProcByMethTableIdx( CFLibDbKeyHash256 TableId );

	/**
	 *	Get the map of CFBamPubServerProcObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerProcObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerProcObj> readServerProcByMethTableIdx( CFLibDbKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerProcObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerProcObj> readServerProcByMethCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamPubServerProcObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerProcObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerProcObj> readServerProcByMethCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerProcObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerProcObj> readServerProcByMethTableVisIdx( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamPubServerProcObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerProcObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerProcObj> readServerProcByMethTableVisIdx( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerProcObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerProcObj> readServerProcByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of CFBamPubServerProcObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubServerProcObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubServerProcObj> readServerProcByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	ICFBamPubServerProcObj readCachedServerProcByIdIdx( CFLibDbKeyHash256 Id );

	List<ICFBamPubServerProcObj> readCachedServerProcByTenantIdx( CFLibDbKeyHash256 TenantId );

	ICFBamPubServerProcObj readCachedServerProcByUNameIdx( CFLibDbKeyHash256 TableId,
		String Name );

	List<ICFBamPubServerProcObj> readCachedServerProcByMethTableIdx( CFLibDbKeyHash256 TableId );

	List<ICFBamPubServerProcObj> readCachedServerProcByMethCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamPubServerProcObj> readCachedServerProcByMethTableVisIdx( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamPubServerProcObj> readCachedServerProcByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeServerProcByIdIdx( CFLibDbKeyHash256 Id );

	void deepDisposeServerProcByTenantIdx( CFLibDbKeyHash256 TenantId );

	void deepDisposeServerProcByUNameIdx( CFLibDbKeyHash256 TableId,
		String Name );

	void deepDisposeServerProcByMethTableIdx( CFLibDbKeyHash256 TableId );

	void deepDisposeServerProcByMethCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerProcByMethTableVisIdx( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerProcByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 */
	ICFBamPubServerProcObj updateServerProc( ICFBamPubServerProcObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServerProc( ICFBamPubServerProcObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByUNameIdx( CFLibDbKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByMethTableIdx( CFLibDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByMethCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByMethTableVisIdx( CFLibDbKeyHash256 TableId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );
}
