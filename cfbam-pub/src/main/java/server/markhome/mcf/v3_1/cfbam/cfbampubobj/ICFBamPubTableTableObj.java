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

public interface ICFBamPubTableTableObj
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
	 *	Instantiate a new Table instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamPubTableObj newInstance();

	/**
	 *	Instantiate a new Table edition of the specified Table instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamPubTableEditObj newEditInstance( ICFBamPubTableObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTableObj realiseTable( ICFBamPubTableObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTableObj createTable( ICFBamPubTableObj Obj );

	/**
	 *	Read a Table-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Table-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubTableObj readTable( ICFLibKeyHash256 pkey );

	/**
	 *	Read a Table-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Table-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubTableObj readTable( ICFLibKeyHash256 pkey,
		boolean forceRead );

	ICFBamPubTableObj readCachedTable( ICFLibKeyHash256 pkey );

	public void reallyDeepDisposeTable( ICFBamPubTableObj obj );

	void deepDisposeTable( ICFLibKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTableObj lockTable( ICFLibKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Table-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubTableObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubTableObj> readAllTable();

	/**
	 *	Return a sorted map of all the Table-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubTableObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubTableObj> readAllTable( boolean forceRead );

	List<ICFBamPubTableObj> readCachedAllTable();

	/**
	 *	Get the CFBamPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTableObj readTableByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Get the CFBamPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTableObj readTableByIdIdx( CFLibDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByTenantIdx( CFLibDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate SchemaDefIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate SchemaDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableBySchemaDefIdx( CFLibDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate SchemaDefIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate SchemaDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableBySchemaDefIdx( CFLibDbKeyHash256 SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableBySchemaCodeVisIdx( CFLibDbKeyHash256 SchemaDefId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableBySchemaCodeVisIdx( CFLibDbKeyHash256 SchemaDefId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the CFBamPubTableObj instance for the unique UNameIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubTableObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTableObj readTableByUNameIdx(CFLibDbKeyHash256 SchemaDefId,
		String Name );

	/**
	 *	Get the CFBamPubTableObj instance for the unique UNameIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubTableObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTableObj readTableByUNameIdx(CFLibDbKeyHash256 SchemaDefId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the CFBamPubTableObj instance for the unique SchemaCdIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	TableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubTableObj cached instance for the unique SchemaCdIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTableObj readTableBySchemaCdIdx(CFLibDbKeyHash256 SchemaDefId,
		String TableClassCode );

	/**
	 *	Get the CFBamPubTableObj instance for the unique SchemaCdIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	TableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubTableObj refreshed instance for the unique SchemaCdIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTableObj readTableBySchemaCdIdx(CFLibDbKeyHash256 SchemaDefId,
		String TableClassCode,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate PrimaryIndexIdx key.
	 *
	 *	@param	PrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate PrimaryIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByPrimaryIndexIdx( CFLibDbKeyHash256 PrimaryIndexId );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate PrimaryIndexIdx key.
	 *
	 *	@param	PrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate PrimaryIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByPrimaryIndexIdx( CFLibDbKeyHash256 PrimaryIndexId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate LookupIndexIdx key.
	 *
	 *	@param	LookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate LookupIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByLookupIndexIdx( CFLibDbKeyHash256 LookupIndexId );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate LookupIndexIdx key.
	 *
	 *	@param	LookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate LookupIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByLookupIndexIdx( CFLibDbKeyHash256 LookupIndexId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate AltIndexIdx key.
	 *
	 *	@param	AltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate AltIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByAltIndexIdx( CFLibDbKeyHash256 AltIndexId );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate AltIndexIdx key.
	 *
	 *	@param	AltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate AltIndexIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByAltIndexIdx( CFLibDbKeyHash256 AltIndexId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate QualTableIdx key.
	 *
	 *	@param	QualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate QualTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByQualTableIdx( CFLibDbKeyHash256 QualifyingTableId );

	/**
	 *	Get the map of CFBamPubTableObj instances sorted by their primary keys for the duplicate QualTableIdx key.
	 *
	 *	@param	QualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTableObj cached instances sorted by their primary keys for the duplicate QualTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTableObj> readTableByQualTableIdx( CFLibDbKeyHash256 QualifyingTableId,
		boolean forceRead );

	ICFBamPubTableObj readCachedTableByIdIdx( CFLibDbKeyHash256 Id );

	List<ICFBamPubTableObj> readCachedTableByTenantIdx( CFLibDbKeyHash256 TenantId );

	List<ICFBamPubTableObj> readCachedTableBySchemaDefIdx( CFLibDbKeyHash256 SchemaDefId );

	List<ICFBamPubTableObj> readCachedTableByCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamPubTableObj> readCachedTableBySchemaCodeVisIdx( CFLibDbKeyHash256 SchemaDefId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	List<ICFBamPubTableObj> readCachedTableByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	ICFBamPubTableObj readCachedTableByUNameIdx( CFLibDbKeyHash256 SchemaDefId,
		String Name );

	ICFBamPubTableObj readCachedTableBySchemaCdIdx( CFLibDbKeyHash256 SchemaDefId,
		String TableClassCode );

	List<ICFBamPubTableObj> readCachedTableByPrimaryIndexIdx( CFLibDbKeyHash256 PrimaryIndexId );

	List<ICFBamPubTableObj> readCachedTableByLookupIndexIdx( CFLibDbKeyHash256 LookupIndexId );

	List<ICFBamPubTableObj> readCachedTableByAltIndexIdx( CFLibDbKeyHash256 AltIndexId );

	List<ICFBamPubTableObj> readCachedTableByQualTableIdx( CFLibDbKeyHash256 QualifyingTableId );

	void deepDisposeTableByIdIdx( CFLibDbKeyHash256 Id );

	void deepDisposeTableByTenantIdx( CFLibDbKeyHash256 TenantId );

	void deepDisposeTableBySchemaDefIdx( CFLibDbKeyHash256 SchemaDefId );

	void deepDisposeTableByCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTableBySchemaCodeVisIdx( CFLibDbKeyHash256 SchemaDefId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTableByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeTableByUNameIdx( CFLibDbKeyHash256 SchemaDefId,
		String Name );

	void deepDisposeTableBySchemaCdIdx( CFLibDbKeyHash256 SchemaDefId,
		String TableClassCode );

	void deepDisposeTableByPrimaryIndexIdx( CFLibDbKeyHash256 PrimaryIndexId );

	void deepDisposeTableByLookupIndexIdx( CFLibDbKeyHash256 LookupIndexId );

	void deepDisposeTableByAltIndexIdx( CFLibDbKeyHash256 AltIndexId );

	void deepDisposeTableByQualTableIdx( CFLibDbKeyHash256 QualifyingTableId );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTableObj updateTable( ICFBamPubTableObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTable( ICFBamPubTableObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByTenantIdx( CFLibDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaDefIdx( CFLibDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByCodeVisIdx( ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaCodeVisIdx( CFLibDbKeyHash256 SchemaDefId,
		ICFBamPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByUNameIdx(CFLibDbKeyHash256 SchemaDefId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	TableClassCode	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaCdIdx(CFLibDbKeyHash256 SchemaDefId,
		String TableClassCode );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrimaryIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByPrimaryIndexIdx( CFLibDbKeyHash256 PrimaryIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	LookupIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByLookupIndexIdx( CFLibDbKeyHash256 LookupIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	AltIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByAltIndexIdx( CFLibDbKeyHash256 AltIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	QualifyingTableId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByQualTableIdx( CFLibDbKeyHash256 QualifyingTableId );
}
