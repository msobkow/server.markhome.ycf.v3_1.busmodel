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

public interface ICFBamProtTokenDefTableObj
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
	 *	Instantiate a new TokenDef instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamProtTokenDefObj newInstance();

	/**
	 *	Instantiate a new TokenDef edition of the specified TokenDef instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamProtTokenDefEditObj newEditInstance( ICFBamProtTokenDefObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTokenDefObj realiseTokenDef( ICFBamProtTokenDefObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTokenDefObj createTokenDef( ICFBamProtTokenDefObj Obj );

	/**
	 *	Read a TokenDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtTokenDefObj readTokenDef( CFLibDbKeyHash256 pkey );

	/**
	 *	Read a TokenDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamProtTokenDefObj readTokenDef( CFLibDbKeyHash256 pkey,
		boolean forceRead );

	ICFBamProtTokenDefObj readCachedTokenDef( CFLibDbKeyHash256 pkey );

	public void reallyDeepDisposeTokenDef( ICFBamProtTokenDefObj obj );

	void deepDisposeTokenDef( CFLibDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTokenDefObj lockTokenDef( CFLibDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TokenDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtTokenDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtTokenDefObj> readAllTokenDef();

	/**
	 *	Return a sorted map of all the TokenDef-derived instances in the database.
	 *
	 *	@return	List of ICFBamProtTokenDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamProtTokenDefObj> readAllTokenDef( boolean forceRead );

	List<ICFBamProtTokenDefObj> readCachedAllTokenDef();

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTokenDefObj readTokenDefByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Get the ICFBamProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTokenDefObj readTokenDefByIdIdx( ICFLibKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTokenDefObj readTokenDefByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the ICFBamProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	ICFBamProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamProtTokenDefObj readTokenDefByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByScopeIdx( ICFLibKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByPrevIdx( CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByNextIdx( CFLibDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Get the map of ICFBamProtTokenDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@return	List of ICFBamProtTokenDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamProtTokenDefObj> readTokenDefByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId,
		boolean forceRead );

	ICFBamProtValueObj readCachedTokenDefByIdIdx( ICFLibKeyHash256 Id );

	ICFBamProtValueObj readCachedTokenDefByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	List<List<ICFBamProtValueObj>> readCachedTokenDefByScopeIdx( ICFLibKeyHash256 ScopeId );

	List<List<ICFBamProtValueObj>> readCachedTokenDefByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	List<List<ICFBamProtValueObj>> readCachedTokenDefByPrevIdx( CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedTokenDefByNextIdx( CFLibDbKeyHash256 NextId );

	List<List<ICFBamProtValueObj>> readCachedTokenDefByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	List<List<ICFBamProtValueObj>> readCachedTokenDefByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	void deepDisposeTokenDefByIdIdx( ICFLibKeyHash256 Id );

	void deepDisposeTokenDefByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	void deepDisposeTokenDefByScopeIdx( ICFLibKeyHash256 ScopeId );

	void deepDisposeTokenDefByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	void deepDisposeTokenDefByPrevIdx( CFLibDbKeyHash256 PrevId );

	void deepDisposeTokenDefByNextIdx( CFLibDbKeyHash256 NextId );

	void deepDisposeTokenDefByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	void deepDisposeTokenDefByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	ICFBamProtTokenDefObj updateTokenDef( ICFBamProtTokenDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTokenDef( ICFBamProtTokenDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByIdIdx( ICFLibKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByUNameIdx( ICFLibKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByScopeIdx( ICFLibKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByDefSchemaIdx( CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByPrevIdx( CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByNextIdx( CFLibDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByContPrevIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenDef key attribute of the instance generating the id.
	 */
	void deleteTokenDefByContNextIdx( ICFLibKeyHash256 ScopeId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Move the ICFBamProtTokenDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtTokenDefObj refreshed cache instance.
	 */
	ICFBamProtTokenDefObj moveUpTokenDef( ICFBamProtTokenDefObj Obj );

	/**
	 *	Move the ICFBamProtTokenDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	ICFBamProtTokenDefObj refreshed cache instance.
	 */
	ICFBamProtTokenDefObj moveDownTokenDef( ICFBamProtTokenDefObj Obj );
}
