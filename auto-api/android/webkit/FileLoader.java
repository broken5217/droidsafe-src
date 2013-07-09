package android.webkit;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import com.android.internal.R;
import android.content.res.AssetManager;
import android.net.http.EventHandler;
import android.net.http.Headers;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;

class FileLoader extends StreamLoader {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.575 -0400", hash_original_field = "FB4FCB3508FC66D4E3F113990AC335C6", hash_generated_field = "6FACC3B41470C8330B5F0BB43FA7FD9F")

    private String mPath;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.575 -0400", hash_original_field = "3462A1A18A0EE070E8953CCF1DD788C0", hash_generated_field = "E6B4AC7A48E0E54E09A504C828AF50C5")

    private int mType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.575 -0400", hash_original_field = "B1028CE892468A1504CF91F79B7267EA", hash_generated_field = "B054B0568675CAED6B0FC902EBB17D6A")

    private boolean mAllowFileAccess;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.576 -0400", hash_original_method = "0A468BF2FF018C04A055F46D2001401C", hash_generated_method = "206DC8C157076D586BFBE7694CC7CC7C")
      FileLoader(String url, LoadListener loadListener, int type,
            boolean allowFileAccess) {
        super(loadListener);
        mType = type;
        mAllowFileAccess = allowFileAccess;
        int index = url.indexOf('?');
        {
            mPath = index > 0 ? URLUtil.stripAnchor(
                    url.substring(URLUtil.ASSET_BASE.length(), index)) :
                    URLUtil.stripAnchor(url.substring(
                            URLUtil.ASSET_BASE.length()));
        } 
        {
            mPath = index > 0 ? URLUtil.stripAnchor(
                    url.substring(URLUtil.RESOURCE_BASE.length(), index)) :
                    URLUtil.stripAnchor(url.substring(
                            URLUtil.RESOURCE_BASE.length()));
        } 
        {
            mPath = index > 0 ? URLUtil.stripAnchor(
                    url.substring(URLUtil.FILE_BASE.length(), index)) :
                    URLUtil.stripAnchor(url.substring(
                            URLUtil.FILE_BASE.length()));
        } 
        addTaint(loadListener.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.577 -0400", hash_original_method = "987DD890C3289D23A785AB1F430BD4A8", hash_generated_method = "0E75E5177A6E77B6106930405F65E438")
    private String errString(Exception ex) {
        String varB4EAC82CA7396A68D541C85D26508E83_1706160810 = null; 
        String exMessage = ex.getMessage();
        String errString = mContext.getString(R.string.httpErrorFileNotFound);
        {
            errString += " " + exMessage;
        } 
        varB4EAC82CA7396A68D541C85D26508E83_1706160810 = errString;
        addTaint(ex.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1706160810.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1706160810;
        
        
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.580 -0400", hash_original_method = "97D1B11BE7CB4BE78107ED00EAAEAEA4", hash_generated_method = "430C2C6B545C2A8587B89CA23213337C")
    @Override
    protected boolean setupStreamAndSendStatus() {
        try 
        {
            {
                try 
                {
                    mDataStream = mContext.getAssets().open(mPath);
                } 
                catch (java.io.FileNotFoundException ex)
                {
                    mDataStream = mContext.getAssets().openNonAsset(mPath);
                } 
            } 
            {
                {
                    boolean varD4B8FA11CB22531163AB9A0D260CA64A_1611522191 = (mPath == null || mPath.length() == 0);
                    {
                        mLoadListener.error(EventHandler.FILE_ERROR, mContext
                            .getString(R.string.httpErrorFileNotFound));
                    } 
                } 
                int slash = mPath.indexOf('/');
                int dot = mPath.indexOf('.', slash);
                {
                    mLoadListener.error(EventHandler.FILE_ERROR, mContext
                            .getString(R.string.httpErrorFileNotFound));
                } 
                String subClassName = mPath.substring(0, slash);
                String fieldName = mPath.substring(slash + 1, dot);
                String errorMsg = null;
                try 
                {
                    final Class<?> d = mContext.getApplicationContext()
                            .getClassLoader().loadClass(
                                    mContext.getPackageName() + ".R$"
                                            + subClassName);
                    final Field field = d.getField(fieldName);
                    final int id = field.getInt(null);
                    TypedValue value = new TypedValue();
                    mContext.getResources().getValue(id, value, true);
                    {
                        mDataStream = mContext.getAssets().openNonAsset(
                                value.assetCookie, value.string.toString(),
                                AssetManager.ACCESS_STREAMING);
                    } 
                    {
                        errorMsg = "Only support TYPE_STRING for the res files";
                    } 
                } 
                catch (ClassNotFoundException e)
                {
                    errorMsg = "Can't find class:  "
                            + mContext.getPackageName() + ".R$" + subClassName;
                } 
                catch (SecurityException e)
                {
                    errorMsg = "Caught SecurityException: " + e;
                } 
                catch (NoSuchFieldException e)
                {
                    errorMsg = "Can't find field:  " + fieldName + " in "
                            + mContext.getPackageName() + ".R$" + subClassName;
                } 
                catch (IllegalArgumentException e)
                {
                    errorMsg = "Caught IllegalArgumentException: " + e;
                } 
                catch (IllegalAccessException e)
                {
                    errorMsg = "Caught IllegalAccessException: " + e;
                } 
                {
                    mLoadListener.error(EventHandler.FILE_ERROR, mContext
                            .getString(R.string.httpErrorFileNotFound));
                } 
            } 
            {
                {
                    mLoadListener.error(EventHandler.FILE_ERROR,
                            mContext.getString(R.string.httpErrorFileNotFound));
                } 
                mDataStream = new FileInputStream(mPath);
                mContentLength = (new File(mPath)).length();
            } 
            mLoadListener.status(1, 1, 200, "OK");
        } 
        catch (java.io.FileNotFoundException ex)
        {
            mLoadListener.error(EventHandler.FILE_NOT_FOUND_ERROR, errString(ex));
        } 
        catch (java.io.IOException ex)
        {
            mLoadListener.error(EventHandler.FILE_ERROR, errString(ex));
        } 
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1678806939 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1678806939;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.580 -0400", hash_original_method = "EECFC31B2787C18B03F2C6B112B9990D", hash_generated_method = "E46259D9AABAC67CD274455544731825")
    @Override
    protected void buildHeaders(Headers headers) {
        addTaint(headers.getTaint());
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.580 -0400", hash_original_field = "DC873D9FC22AE0F3BA2786ED2D83AA0B", hash_generated_field = "1961BC7D2105DF0CF9A74E0FB587B24A")

    static final int TYPE_ASSET = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.580 -0400", hash_original_field = "409C348550739E902EC65BF8588EFA20", hash_generated_field = "37CFCBEAA36971A1B22E497F54B484AC")

    static final int TYPE_RES = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.580 -0400", hash_original_field = "DD6C634954B8927E0E83CC512CEAB424", hash_generated_field = "9E507F10BB893E2897D9DF437CDF3C57")

    static final int TYPE_FILE = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:04.580 -0400", hash_original_field = "9722F24E24D81405093C0E61AAF58518", hash_generated_field = "061362C112C980EB4954480FBAFBE378")

    private static final String LOGTAG = "webkit";
}

