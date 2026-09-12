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

public interface ICFBamPubTimeColTableObj
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
	 *	Instantiate a new TimeCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamPubTimeColObj newInstance();

	/**
	 *	Instantiate a new TimeCol edition of the specified TimeCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamPubTimeColEditObj newEditInstance( ICFBamPubTimeColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTimeColObj realiseTimeCol( ICFBamPubTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTimeColObj createTimeCol( ICFBamPubTimeColObj Obj );

	/**
	 *	Read a TimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubTimeColObj readTimeCol( ICFLibKeyHash256 pkey );

	/**
	 *	Read a TimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPubTimeColObj readTimeCol( ICFLibKeyHash256 pkey,
		boolean forceRead );

	ICFBamPubTimeColObj readCachedTimeCol( ICFLibKeyHash256 pkey );

	public void reallyDeepDisposeTimeCol( ICFBamPubTimeColObj obj );

	void deepDisposeTimeCol( ICFLibKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTimeColObj lockTimeCol( ICFLibKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TimeCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubTimeColObj> readAllTimeCol();

	/**
	 *	Return a sorted map of all the TimeCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamPubTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPubTimeColObj> readAllTimeCol( boolean forceRead );

	List<ICFBamPubTimeColObj> readCachedAllTimeCol();

	/**
	 *	Get the CFBamPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTimeColObj readTimeColByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Get the CFBamPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTimeColObj readTimeColByIdIdx( CFLibDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the CFBamPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTimeColObj readTimeColByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the CFBamPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPubTimeColObj readTimeColByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByScopeIdx( CFLibDbKeyHash256 ScopeId );

	/**
	 *	Get the map of CFBamPubTimeColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByScopeIdx( CFLibDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of CFBamPubTimeColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of CFBamPubTimeColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByPrevIdx( CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of CFBamPubTimeColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByNextIdx( CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of CFBamPubTimeColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of CFBamPubTimeColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPubTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByTableIdx( CFLibDbKeyHash256 TableId );

	/**
	 *	Get the map of CFBamPubTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPubTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPubTimeColObj> readTimeColByTableIdx( CFLibDbKeyHash256 TableId,
		boolean forceRead );

	ICFBamPubTimeColObj readCachedTimeColByIdIdx( CFLibDbKeyHash256 Id );

	ICFBamPubTimeColObj readCachedTimeColByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	List<ICFBamPubTimeColObj> readCachedTimeColByScopeIdx( CFLibDbKeyHash256 ScopeId );

	List<ICFBamPubTimeColObj> readCachedTimeColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	List<ICFBamPubTimeColObj> readCachedTimeColByPrevIdx( CFLibDbKeyHash256 PrevId );

	List<ICFBamPubTimeColObj> readCachedTimeColByNextIdx( CFLibDbKeyHash256 NextId );

	List<ICFBamPubTimeColObj> readCachedTimeColByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	List<ICFBamPubTimeColObj> readCachedTimeColByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	List<ICFBamPubTimeColObj> readCachedTimeColByTableIdx( CFLibDbKeyHash256 TableId );

	void deepDisposeTimeColByIdIdx( CFLibDbKeyHash256 Id );

	void deepDisposeTimeColByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimeColByScopeIdx( CFLibDbKeyHash256 ScopeId );

	void deepDisposeTimeColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeTimeColByPrevIdx( CFLibDbKeyHash256 PrevId );

	void deepDisposeTimeColByNextIdx( CFLibDbKeyHash256 NextId );

	void deepDisposeTimeColByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	void deepDisposeTimeColByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	void deepDisposeTimeColByTableIdx( CFLibDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamPubTimeColObj updateTimeCol( ICFBamPubTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeCol( ICFBamPubTimeColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByIdIdx( CFLibDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByUNameIdx( CFLibDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByScopeIdx( CFLibDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByContPrevIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByContNextIdx( CFLibDbKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TimeCol key attribute of the instance generating the id.
	 */
	void deleteTimeColByTableIdx( CFLibDbKeyHash256 TableId );

	/**
	 *	Move the CFBamPubTimeColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamPubTimeColObj refreshed cache instance.
	 */
	ICFBamPubTimeColObj moveUpTimeCol( ICFBamPubTimeColObj Obj );

	/**
	 *	Move the CFBamPubTimeColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamPubTimeColObj refreshed cache instance.
	 */
	ICFBamPubTimeColObj moveDownTimeCol( ICFBamPubTimeColObj Obj );
}
