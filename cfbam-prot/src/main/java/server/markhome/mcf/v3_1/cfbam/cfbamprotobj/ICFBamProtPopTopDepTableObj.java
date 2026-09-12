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

public interface ICFBamProtPopTopDepTableObj
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
	 *	Instantiate a new PopTopDep instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamProtPopTopDepObj newInstance();

	/**
	 *	Instantiate a new PopTopDep edition of the specified PopTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamProtPopTopDepEditObj newEditInstance( ICFBamProtPopTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamProtPopTopDepObj realisePopTopDep( ICFBamProtPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamProtPopTopDepObj createPopTopDep( ICFBamProtPopTopDepObj Obj );

	/**
	 *	Read a PopTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtPopTopDepObj readPopTopDep( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a PopTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtPopTopDepObj readPopTopDep( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFBamProtPopTopDepObj readCachedPopTopDep( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposePopTopDep( ICFBamProtPopTopDepObj obj );

	void deepDisposePopTopDep( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamProtPopTopDepObj lockPopTopDep( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the PopTopDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtPopTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtPopTopDepObj> readAllPopTopDep();

	/**
	 *	Return a sorted map of all the PopTopDep-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtPopTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtPopTopDepObj> readAllPopTopDep( boolean forceRead );

	List<ICFBamProtPopTopDepObj> readCachedAllPopTopDep();

	/**
	 *	Get the ICFBamProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtPopTopDepObj readPopTopDepByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the ICFBamProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtPopTopDepObj readPopTopDepByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtPopTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtPopTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtPopTopDepObj> readPopTopDepByTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Get the map of ICFBamProtPopTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtPopTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtPopTopDepObj> readPopTopDepByTenantIdx( ICFLibKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtPopTopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtPopTopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtPopTopDepObj> readPopTopDepByRelationIdx( ICFLibKeyHash256 RelationId );

	/**
	 *	Get the map of ICFBamProtPopTopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtPopTopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtPopTopDepObj> readPopTopDepByRelationIdx( ICFLibKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtPopTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtPopTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtPopTopDepObj> readPopTopDepByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of ICFBamProtPopTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtPopTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtPopTopDepObj> readPopTopDepByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of List<ICFBamProtPopTopDepObj> instances sorted by their primary keys for the duplicate ContRelIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtPopTopDepObj> cached instances sorted by their primary keys for the duplicate ContRelIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtPopTopDepObj> readPopTopDepByContRelIdx( ICFLibKeyHash256 ContRelationId );

	/**
	 *	Get the map of List<ICFBamProtPopTopDepObj> instances sorted by their primary keys for the duplicate ContRelIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ICFBamProtPopTopDepObj> cached instances sorted by their primary keys for the duplicate ContRelIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtPopTopDepObj> readPopTopDepByContRelIdx( ICFLibKeyHash256 ContRelationId,
		boolean forceRead );

	/**
	 *	Get the ICFBamProtPopTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtPopTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtPopTopDepObj readPopTopDepByUNameIdx(ICFLibKeyHash256 ContRelationId,
		String Name );

	/**
	 *	Get the ICFBamProtPopTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtPopTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtPopTopDepObj readPopTopDepByUNameIdx(ICFLibKeyHash256 ContRelationId,
		String Name,
		boolean forceRead );

	ICFBamProtScopeObj readCachedPopTopDepByIdIdx( ICFLibKeyHash256 Id );

	List<List<ICFBamProtScopeObj>> readCachedPopTopDepByTenantIdx( ICFLibKeyHash256 TenantId );

	List<List<ICFBamProtPopDepObj>> readCachedPopTopDepByRelationIdx( ICFLibKeyHash256 RelationId );

	List<List<ICFBamProtPopDepObj>> readCachedPopTopDepByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	List<List<ICFBamProtPopTopDepObj>> readCachedPopTopDepByContRelIdx( ICFLibKeyHash256 ContRelationId );

	ICFBamProtPopTopDepObj readCachedPopTopDepByUNameIdx( ICFLibKeyHash256 ContRelationId,
		String Name );

	void deepDisposePopTopDepByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposePopTopDepByTenantIdx( ICFLibKeyHash256 TenantId );

	void deepDisposePopTopDepByRelationIdx( ICFLibKeyHash256 RelationId );

	void deepDisposePopTopDepByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposePopTopDepByContRelIdx( ICFLibKeyHash256 ContRelationId );

	void deepDisposePopTopDepByUNameIdx( ICFLibKeyHash256 ContRelationId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFBamProtPopTopDepObj updatePopTopDep( ICFBamProtPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopTopDep( ICFBamProtPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByTenantIdx( ICFLibKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByRelationIdx( ICFLibKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByContRelIdx( ICFLibKeyHash256 ContRelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByUNameIdx(ICFLibKeyHash256 ContRelationId,
		String Name );
}
