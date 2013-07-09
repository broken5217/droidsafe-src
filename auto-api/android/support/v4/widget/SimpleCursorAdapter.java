package android.support.v4.widget;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SimpleCursorAdapter extends ResourceCursorAdapter {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.371 -0400", hash_original_field = "EDE7DB5B0C4E79BD52B42E685F59B951", hash_generated_field = "6AD876BF1B2A93FF841DC0A6CDF82D53")

    protected int[] mFrom;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.371 -0400", hash_original_field = "6F69D0C4D879F039DD614BB6C1B21419", hash_generated_field = "793C2D88DE3BA12DDE77A56E8B34D202")

    protected int[] mTo;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.371 -0400", hash_original_field = "CEFDB9C920BEC19CE1E004D5AC98B46C", hash_generated_field = "76FAAB307CBAB2502A74F2FD4809A2B4")

    private int mStringConversionColumn = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.371 -0400", hash_original_field = "B735DBCD7F83F11089B3A7B11285F9CD", hash_generated_field = "9EC5CDC29EBE32FECD7EDABDB5C61341")

    private CursorToStringConverter mCursorToStringConverter;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.371 -0400", hash_original_field = "DDDBAA0AB795AF915BA6E626A345701D", hash_generated_field = "308F8B2EF2E94DF958649BB3CD716341")

    private ViewBinder mViewBinder;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.371 -0400", hash_original_field = "6B24384939EB196E5C49F9311020A192", hash_generated_field = "393D022CD0A88B84A417682AA08505E2")

    String[] mOriginalFrom;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.371 -0400", hash_original_method = "4CA266072E0BEF58A4BC70323B402D31", hash_generated_method = "B80AC8A6A8977A7A9A1A8ACDC1391CD3")
    @Deprecated
    public  SimpleCursorAdapter(Context context, int layout, Cursor c, String[] from, int[] to) {
        super(context, layout, c);
        mTo = to;
        mOriginalFrom = from;
        findColumns(from);
        addTaint(context.getTaint());
        addTaint(layout);
        addTaint(c.getTaint());
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.372 -0400", hash_original_method = "07FEC305B6EF36E13BFB609FC3D08908", hash_generated_method = "98E65DF75FB0A629886E91A830466750")
    public  SimpleCursorAdapter(Context context, int layout, Cursor c, String[] from,
            int[] to, int flags) {
        super(context, layout, c, flags);
        mTo = to;
        mOriginalFrom = from;
        findColumns(from);
        addTaint(context.getTaint());
        addTaint(layout);
        addTaint(c.getTaint());
        addTaint(flags);
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.372 -0400", hash_original_method = "DC8B275A35A5B1D2099C370F56E50BB9", hash_generated_method = "07C18DE3FCBB6DBC83A872C40519FB8E")
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        final ViewBinder binder = mViewBinder;
        final int count = mTo.length;
        final int[] from = mFrom;
        final int[] to = mTo;
        {
            int i = 0;
            {
                final View v = view.findViewById(to[i]);
                {
                    boolean bound = false;
                    {
                        bound = binder.setViewValue(v, cursor, from[i]);
                    } 
                    {
                        String text = cursor.getString(from[i]);
                        {
                            text = "";
                        } 
                        {
                            setViewText((TextView) v, text);
                        } 
                        {
                            setViewImage((ImageView) v, text);
                        } 
                        {
                            if (DroidSafeAndroidRuntime.control) throw new IllegalStateException(v.getClass().getName() + " is not a " +
                                " view that can be bounds by this SimpleCursorAdapter");
                        } 
                    } 
                } 
            } 
        } 
        addTaint(view.getTaint());
        addTaint(context.getTaint());
        addTaint(cursor.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.373 -0400", hash_original_method = "E0E2C9BDE209838004B6CAB60CB87613", hash_generated_method = "5AA09A3D8474F7C6F23A010C60BE925C")
    public ViewBinder getViewBinder() {
        ViewBinder varB4EAC82CA7396A68D541C85D26508E83_769420248 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_769420248 = mViewBinder;
        varB4EAC82CA7396A68D541C85D26508E83_769420248.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_769420248;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.374 -0400", hash_original_method = "119DFC3ED073D5B4FB9A3C0337902379", hash_generated_method = "3E071F9EE6E9AEAADA16E4C43987A93F")
    public void setViewBinder(ViewBinder viewBinder) {
        mViewBinder = viewBinder;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.374 -0400", hash_original_method = "31A5526470C992FDAE212BFFA88B0730", hash_generated_method = "A719453AA57C570028BAEB7E56012A90")
    public void setViewImage(ImageView v, String value) {
        try 
        {
            v.setImageResource(Integer.parseInt(value));
        } 
        catch (NumberFormatException nfe)
        {
            v.setImageURI(Uri.parse(value));
        } 
        addTaint(v.getTaint());
        addTaint(value.getTaint());
        
        
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.374 -0400", hash_original_method = "5AA8DD17AC94ADB8D267F5D4267EA13E", hash_generated_method = "9BCC5D52A6F9BAB62DC965ECB5B879C3")
    public void setViewText(TextView v, String text) {
        v.setText(text);
        addTaint(v.getTaint());
        addTaint(text.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.375 -0400", hash_original_method = "505C15BD7A524BAA123874B0B6BE7D4B", hash_generated_method = "2839BCF0C681DFE94130D9B30605C97A")
    public int getStringConversionColumn() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_20278870 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_20278870;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.376 -0400", hash_original_method = "CAA7C791E82A28ED194AFE600FF6DEEE", hash_generated_method = "394118E429FB1DEC632B04FC7B5FB220")
    public void setStringConversionColumn(int stringConversionColumn) {
        mStringConversionColumn = stringConversionColumn;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.377 -0400", hash_original_method = "80E6B5584C3F52CF90E7103CF53469C6", hash_generated_method = "05A4645DC7FF957234DD82361D61C52C")
    public CursorToStringConverter getCursorToStringConverter() {
        CursorToStringConverter varB4EAC82CA7396A68D541C85D26508E83_1205093020 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1205093020 = mCursorToStringConverter;
        varB4EAC82CA7396A68D541C85D26508E83_1205093020.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1205093020;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.377 -0400", hash_original_method = "5D90B32B884A493C1622C9D829A83B10", hash_generated_method = "A9ACEF1EC294D60B7393749911E2426C")
    public void setCursorToStringConverter(CursorToStringConverter cursorToStringConverter) {
        mCursorToStringConverter = cursorToStringConverter;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.378 -0400", hash_original_method = "600E1910E4ECD6C26E4D3B813A27ACFC", hash_generated_method = "CF20F4BD0CAF5C59CCB9A017F77DE4D1")
    @Override
    public CharSequence convertToString(Cursor cursor) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1504256209 = null; 
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_167156432 = null; 
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1483418320 = null; 
        {
            varB4EAC82CA7396A68D541C85D26508E83_1504256209 = mCursorToStringConverter.convertToString(cursor);
        } 
        {
            varB4EAC82CA7396A68D541C85D26508E83_167156432 = cursor.getString(mStringConversionColumn);
        } 
        varB4EAC82CA7396A68D541C85D26508E83_1483418320 = super.convertToString(cursor);
        addTaint(cursor.getTaint());
        CharSequence varA7E53CE21691AB073D9660D615818899_1333524970; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_1333524970 = varB4EAC82CA7396A68D541C85D26508E83_1504256209;
                break;
            case 2: 
                varA7E53CE21691AB073D9660D615818899_1333524970 = varB4EAC82CA7396A68D541C85D26508E83_167156432;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1333524970 = varB4EAC82CA7396A68D541C85D26508E83_1483418320;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1333524970.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_1333524970;
        
        
            
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.378 -0400", hash_original_method = "FB1AB395EA625B0EC9BE174CD444F84E", hash_generated_method = "D62832C65DA92A4E26A7604426C0AD6A")
    private void findColumns(String[] from) {
        {
            int i;
            int count = from.length;
            {
                mFrom = new int[count];
            } 
            {
                i = 0;
                {
                    mFrom[i] = mCursor.getColumnIndexOrThrow(from[i]);
                } 
            } 
        } 
        {
            mFrom = null;
        } 
        
        
            
            
            
                
            
            
                
            
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.379 -0400", hash_original_method = "F69CFA3E437766E0BB7C3F894D67D08E", hash_generated_method = "9457F435A576ABC775449A836BE16553")
    @Override
    public Cursor swapCursor(Cursor c) {
        Cursor varB4EAC82CA7396A68D541C85D26508E83_1070901634 = null; 
        Cursor res = super.swapCursor(c);
        findColumns(mOriginalFrom);
        varB4EAC82CA7396A68D541C85D26508E83_1070901634 = res;
        addTaint(c.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1070901634.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1070901634;
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:47.379 -0400", hash_original_method = "B38CB52379BA28E208995EBA207AC843", hash_generated_method = "EE5B09CA7687CFB38B176D0EE8045047")
    public void changeCursorAndColumns(Cursor c, String[] from, int[] to) {
        mOriginalFrom = from;
        mTo = to;
        super.changeCursor(c);
        findColumns(mOriginalFrom);
        addTaint(c.getTaint());
        
        
        
        
        
    }

    
    public static interface ViewBinder {
        
        boolean setViewValue(View view, Cursor cursor, int columnIndex);
    }
    
    public static interface CursorToStringConverter {
        
        CharSequence convertToString(Cursor cursor);
    }
    
}

