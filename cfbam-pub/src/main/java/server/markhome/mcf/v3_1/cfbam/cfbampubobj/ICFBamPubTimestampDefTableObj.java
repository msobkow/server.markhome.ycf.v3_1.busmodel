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

public interface ICFBamPubTimestampDefTableObj
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
	 *	Instantiate a new TimestampDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamPubTimestampDefObj newInstance();

	/**
	 *	Instantiate a new TimestampDef edition of the specified TimestampDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamPubTimestampDefEditObj newEditInstance( ICFBamPubTimestampDefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTimestampDefObj realiseTimestampDef( ICFBamPubTimestampDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTimestampDefObj createTimestampDef( ICFBamPubTimestampDefObj Obj );

	/**
	 *	Read a TimestampDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubTimestampDefObj readTimestampDef( ICFLibKeyHash256 pkey );

	/**
	 *	Read a TimestampDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubTimestampDefObj readTimestampDef( ICFLibKeyHash256 pkey,
		boolean forceRead );

	ICFBamPubTimestampDefObj readCachedTimestampDef( ICFLibKeyHash256 pkey );

	public void reallyDeepDisposeTimestampDef( ICFBamPubTimestampDefObj obj );

	void deepDisposeTimestampDef( ICFLibKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTimestampDefObj lockTimestampDef( ICFLibKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TimestampDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubTimestampDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readAllTimestampDef();

	/**
	 *	Return a sorted map of all the TimestampDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubTimestampDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readAllTimestampDef( boolean forceRead );

	List<ICFBamPubTimestampDefObj> readCachedAllTimestampDef();

	/**
	 *	Get the CFBamPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTimestampDefObj readTimestampDefByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Get the CFBamPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTimestampDefObj readTimestampDefByIdIdx( CFLibDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the CFBamPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTimestampDefObj readTimestampDefByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the CFBamPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTimestampDefObj readTimestampDefByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByScopeIdx( CFLibDbKeyHash256 ScopeId );

	/**
	 *	Get the map of CFBamPubTimestampDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByScopeIdx( CFLibDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of CFBamPubTimestampDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of CFBamPubTimestampDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByPrevIdx( CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of CFBamPubTimestampDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByNextIdx( CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of CFBamPubTimestampDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of CFBamPubTimestampDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimestampDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimestampDefObj> readTimestampDefByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId,
		boolean forceRead );

	ICFBamPubTimestampDefObj readCachedTimestampDefByIdIdx( CFLibDbKeyHash256 Id );

	ICFBamPubTimestampDefObj readCachedTimestampDefByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	List<ICFBamPubTimestampDefObj> readCachedTimestampDefByScopeIdx( CFLibDbKeyHash256 ScopeId );

	List<ICFBamPubTimestampDefObj> readCachedTimestampDefByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	List<ICFBamPubTimestampDefObj> readCachedTimestampDefByPrevIdx( CFLibDbKeyHash256 PrevId );

	List<ICFBamPubTimestampDefObj> readCachedTimestampDefByNextIdx( CFLibDbKeyHash256 NextId );

	List<ICFBamPubTimestampDefObj> readCachedTimestampDefByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	List<ICFBamPubTimestampDefObj> readCachedTimestampDefByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	void deepDisposeTimestampDefByIdIdx( CFLibDbKeyHash256 Id );

	void deepDisposeTimestampDefByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimestampDefByScopeIdx( CFLibDbKeyHash256 ScopeId );

	void deepDisposeTimestampDefByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeTimestampDefByPrevIdx( CFLibDbKeyHash256 PrevId );

	void deepDisposeTimestampDefByNextIdx( CFLibDbKeyHash256 NextId );

	void deepDisposeTimestampDefByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	void deepDisposeTimestampDefByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTimestampDefObj updateTimestampDef( ICFBamPubTimestampDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimestampDef( ICFBamPubTimestampDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByScopeIdx( CFLibDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 */
	void deleteTimestampDefByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Move the CFBamPubTimestampDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamPubTimestampDefObj refreshed cache instance.
	 */
	ICFBamPubTimestampDefObj moveUpTimestampDef( ICFBamPubTimestampDefObj Obj );

	/**
	 *	Move the CFBamPubTimestampDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamPubTimestampDefObj refreshed cache instance.
	 */
	ICFBamPubTimestampDefObj moveDownTimestampDef( ICFBamPubTimestampDefObj Obj );
}
