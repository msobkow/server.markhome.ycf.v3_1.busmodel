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

public interface ICFBamProtSchemaTweakTableObj
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
	 *	Instantiate a new SchemaTweak instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamProtSchemaTweakObj newInstance();

	/**
	 *	Instantiate a new SchemaTweak edition of the specified SchemaTweak instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamProtSchemaTweakEditObj newEditInstance( ICFBamProtSchemaTweakObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamProtSchemaTweakObj realiseSchemaTweak( ICFBamProtSchemaTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamProtSchemaTweakObj createSchemaTweak( ICFBamProtSchemaTweakObj Obj );

	/**
	 *	Read a SchemaTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtSchemaTweakObj readSchemaTweak( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a SchemaTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtSchemaTweakObj readSchemaTweak( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFBamProtSchemaTweakObj readCachedSchemaTweak( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeSchemaTweak( ICFBamProtSchemaTweakObj obj );

	void deepDisposeSchemaTweak( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamProtSchemaTweakObj lockSchemaTweak( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SchemaTweak-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtSchemaTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtSchemaTweakObj> readAllSchemaTweak();

	/**
	 *	Return a sorted map of all the SchemaTweak-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtSchemaTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtSchemaTweakObj> readAllSchemaTweak( boolean forceRead );

	List<ICFBamProtSchemaTweakObj> readCachedAllSchemaTweak();

	/**
	 *	Get the ICFBamProtTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtTweakObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtSchemaTweakObj readSchemaTweakByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the ICFBamProtTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtTweakObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtSchemaTweakObj readSchemaTweakByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the ICFBamProtTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtTweakObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtSchemaTweakObj readSchemaTweakByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the ICFBamProtTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtTweakObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtSchemaTweakObj readSchemaTweakByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtSchemaTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtSchemaTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtSchemaTweakObj> readSchemaTweakByValTentIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Get the map of ICFBamProtSchemaTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtSchemaTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtSchemaTweakObj> readSchemaTweakByValTentIdx( ICFLibKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtSchemaTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtSchemaTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtSchemaTweakObj> readSchemaTweakByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Get the map of ICFBamProtSchemaTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtSchemaTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtSchemaTweakObj> readSchemaTweakByScopeIdx( ICFLibKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtSchemaTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtSchemaTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtSchemaTweakObj> readSchemaTweakByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of ICFBamProtSchemaTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtSchemaTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtSchemaTweakObj> readSchemaTweakByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the ICFBamProtTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtTweakObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtSchemaTweakObj readSchemaTweakByUDefIdx( ICFLibKeyHash256 TenantId,
		ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 DefSchemaTenantId,
		CFLibDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Get the ICFBamProtTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtTweakObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtSchemaTweakObj readSchemaTweakByUDefIdx( ICFLibKeyHash256 TenantId,
		ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 DefSchemaTenantId,
		CFLibDbKeyHash256 DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFBamProtSchemaTweakObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtSchemaTweakObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtSchemaTweakObj> readSchemaTweakBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	/**
	 *	Get the map of List<ICFBamProtSchemaTweakObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtSchemaTweakObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtSchemaTweakObj> readSchemaTweakBySchemaIdx( ICFLibKeyHash256 SchemaDefId,
		boolean forceRead );

	ICFBamProtTweakObj readCachedSchemaTweakByIdIdx( ICFLibKeyHash256 Id );

	ICFBamProtTweakObj readCachedSchemaTweakByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	List<List<ICFBamProtTweakObj>> readCachedSchemaTweakByValTentIdx( ICFLibKeyHash256 TenantId );

	List<List<ICFBamProtTweakObj>> readCachedSchemaTweakByScopeIdx( ICFLibKeyHash256 ScopeId );

	List<List<ICFBamProtTweakObj>> readCachedSchemaTweakByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	ICFBamProtTweakObj readCachedSchemaTweakByUDefIdx( ICFLibKeyHash256 TenantId,
		ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 DefSchemaTenantId,
		CFLibDbKeyHash256 DefSchemaId,
		String Name );

	List<List<ICFBamProtSchemaTweakObj>> readCachedSchemaTweakBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	void deepDisposeSchemaTweakByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeSchemaTweakByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	void deepDisposeSchemaTweakByValTentIdx( ICFLibKeyHash256 TenantId );

	void deepDisposeSchemaTweakByScopeIdx( ICFLibKeyHash256 ScopeId );

	void deepDisposeSchemaTweakByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeSchemaTweakByUDefIdx( ICFLibKeyHash256 TenantId,
		ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 DefSchemaTenantId,
		CFLibDbKeyHash256 DefSchemaId,
		String Name );

	void deepDisposeSchemaTweakBySchemaIdx( ICFLibKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamProtSchemaTweakObj updateSchemaTweak( ICFBamProtSchemaTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaTweak( ICFBamProtSchemaTweakObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByValTentIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByUDefIdx( ICFLibKeyHash256 TenantId,
		ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 DefSchemaTenantId,
		CFLibDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakBySchemaIdx( ICFLibKeyHash256 SchemaDefId );
}
