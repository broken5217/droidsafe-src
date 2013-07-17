package android.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import com.android.internal.R;

public class RatingBar extends AbsSeekBar {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.241 -0400", hash_original_field = "363D0777077E57DB14FD78240A95F5D1", hash_generated_field = "41FB5B10B91C91607A37B16172D7BB7B")

    private int mNumStars = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.242 -0400", hash_original_field = "05022DE7C184DCE58C4731645B8098FF", hash_generated_field = "29069870A57CAD9CDBBA4A9B273494B8")

    private int mProgressOnStartTracking;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.242 -0400", hash_original_field = "7DEBD693AAB84E4B40F94DB43FDD63FB", hash_generated_field = "26FA5FE396DAB5C7A7F6142358E24340")

    private OnRatingBarChangeListener mOnRatingBarChangeListener;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.243 -0400", hash_original_method = "938147F53CB460240E2DF1224551ED40", hash_generated_method = "3D0FC0536E70EC6A46844EF0EADFBAF9")
    public  RatingBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        addTaint(defStyle);
        addTaint(attrs.getTaint());
        addTaint(context.getTaint());
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.RatingBar,
                defStyle, 0);
        final int numStars = a.getInt(R.styleable.RatingBar_numStars, mNumStars);
        setIsIndicator(a.getBoolean(R.styleable.RatingBar_isIndicator, !mIsUserSeekable));
        final float rating = a.getFloat(R.styleable.RatingBar_rating, -1);
        final float stepSize = a.getFloat(R.styleable.RatingBar_stepSize, -1);
        a.recycle();
        if(numStars > 0 && numStars != mNumStars)        
        {
            setNumStars(numStars);
        } //End block
        if(stepSize >= 0)        
        {
            setStepSize(stepSize);
        } //End block
        else
        {
            setStepSize(0.5f);
        } //End block
        if(rating >= 0)        
        {
            setRating(rating);
        } //End block
        mTouchProgressOffset = 1.1f;
        // ---------- Original Method ----------
        //TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.RatingBar,
                //defStyle, 0);
        //final int numStars = a.getInt(R.styleable.RatingBar_numStars, mNumStars);
        //setIsIndicator(a.getBoolean(R.styleable.RatingBar_isIndicator, !mIsUserSeekable));
        //final float rating = a.getFloat(R.styleable.RatingBar_rating, -1);
        //final float stepSize = a.getFloat(R.styleable.RatingBar_stepSize, -1);
        //a.recycle();
        //if (numStars > 0 && numStars != mNumStars) {
            //setNumStars(numStars);            
        //}
        //if (stepSize >= 0) {
            //setStepSize(stepSize);
        //} else {
            //setStepSize(0.5f);
        //}
        //if (rating >= 0) {
            //setRating(rating);
        //}
        //mTouchProgressOffset = 1.1f;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.244 -0400", hash_original_method = "C497D2C446013A8A61B261C3CBB506B4", hash_generated_method = "0A2B05BBC4FC9CB95BAEBEF3F6E9F127")
    public  RatingBar(Context context, AttributeSet attrs) {
        this(context, attrs, com.android.internal.R.attr.ratingBarStyle);
        addTaint(attrs.getTaint());
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.244 -0400", hash_original_method = "D42949600C8B60C6F46AA1F41FAE4EFB", hash_generated_method = "D2A1F8453254063501F518FB3CF6FD6C")
    public  RatingBar(Context context) {
        this(context, null);
        addTaint(context.getTaint());
        // ---------- Original Method ----------
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.245 -0400", hash_original_method = "CB44A4D2B638D14CC961BB9C350C60D5", hash_generated_method = "0C38E6D8F5DE50714CF4743825B12928")
    public void setOnRatingBarChangeListener(OnRatingBarChangeListener listener) {
        mOnRatingBarChangeListener = listener;
        // ---------- Original Method ----------
        //mOnRatingBarChangeListener = listener;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.245 -0400", hash_original_method = "695CB7B11E4FD58B096410402E370F4D", hash_generated_method = "6525969A05DD4BA3D51A564B4F7B6F73")
    public OnRatingBarChangeListener getOnRatingBarChangeListener() {
OnRatingBarChangeListener varFABA60AF3E094144B7F538EC93E33703_2096033726 =         mOnRatingBarChangeListener;
        varFABA60AF3E094144B7F538EC93E33703_2096033726.addTaint(taint);
        return varFABA60AF3E094144B7F538EC93E33703_2096033726;
        // ---------- Original Method ----------
        //return mOnRatingBarChangeListener;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.246 -0400", hash_original_method = "3FF2593F21D7D3B2493BC4219B0E4596", hash_generated_method = "6D0D1563E0ECA110419C5FE774815B77")
    public void setIsIndicator(boolean isIndicator) {
        addTaint(isIndicator);
        mIsUserSeekable = !isIndicator;
        setFocusable(!isIndicator);
        // ---------- Original Method ----------
        //mIsUserSeekable = !isIndicator;
        //setFocusable(!isIndicator);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.247 -0400", hash_original_method = "874639FDA9C4F98AD3BF38D7B6BE89CD", hash_generated_method = "9CFB980D4A3BAE75C51A8A7521415322")
    public boolean isIndicator() {
        boolean varC6A597318EF09C03CCEF65798B9CBD4E_420792042 = (!mIsUserSeekable);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_461189173 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_461189173;
        // ---------- Original Method ----------
        //return !mIsUserSeekable;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.248 -0400", hash_original_method = "AEDBB722302E662B30772E575795E285", hash_generated_method = "607A92C38F74CB697B0B699326171492")
    public void setNumStars(final int numStars) {
        if(numStars <= 0)        
        {
            return;
        } //End block
        mNumStars = numStars;
        requestLayout();
        // ---------- Original Method ----------
        //if (numStars <= 0) {
            //return;
        //}
        //mNumStars = numStars;
        //requestLayout();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.248 -0400", hash_original_method = "D4C4902F9D646F6CD3B3EB2FB6EFDC13", hash_generated_method = "5E7050A84E3BA973822D8CB996E70014")
    public int getNumStars() {
        int var040414DF8719A630C798855CE8016CFC_1966748895 = (mNumStars);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1322268894 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1322268894;
        // ---------- Original Method ----------
        //return mNumStars;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.249 -0400", hash_original_method = "4B12106E3623F8927849B5EF91E272B5", hash_generated_method = "08CE3BB407B0557DD948B55C8A4AD0F6")
    public void setRating(float rating) {
        addTaint(rating);
        setProgress(Math.round(rating * getProgressPerStar()));
        // ---------- Original Method ----------
        //setProgress(Math.round(rating * getProgressPerStar()));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.250 -0400", hash_original_method = "EA1852BE7B44A888483D4F1C620CF769", hash_generated_method = "F94A41B45CD1F53D21ED2E2EA67B1884")
    public float getRating() {
        float varEBD1E63F546D0DD2F475ED0F89839FB7_126551968 = (getProgress() / getProgressPerStar());
                float var546ADE640B6EDFBC8A086EF31347E768_469401488 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_469401488;
        // ---------- Original Method ----------
        //return getProgress() / getProgressPerStar();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.268 -0400", hash_original_method = "A3E9B935F0D69FAE2374B5CF03A160E4", hash_generated_method = "C8857E49FBB2F2E20A7320DB65AA9869")
    public void setStepSize(float stepSize) {
        addTaint(stepSize);
        if(stepSize <= 0)        
        {
            return;
        } //End block
        final float newMax = mNumStars / stepSize;
        final int newProgress = (int) (newMax / getMax() * getProgress());
        setMax((int) newMax);
        setProgress(newProgress);
        // ---------- Original Method ----------
        //if (stepSize <= 0) {
            //return;
        //}
        //final float newMax = mNumStars / stepSize;
        //final int newProgress = (int) (newMax / getMax() * getProgress());
        //setMax((int) newMax);
        //setProgress(newProgress);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.268 -0400", hash_original_method = "2ABC51A03E553FCA3CBD93E8294B1CB6", hash_generated_method = "C6520028A2D64DEC431A8FFAE9D97C60")
    public float getStepSize() {
        float var12A311619CA29E033C872452AE0D62E8_1603316040 = ((float) getNumStars() / getMax());
                float var546ADE640B6EDFBC8A086EF31347E768_190163569 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_190163569;
        // ---------- Original Method ----------
        //return (float) getNumStars() / getMax();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.268 -0400", hash_original_method = "3A53F1CA5B2034CF32272EC34B36C37A", hash_generated_method = "9E1DE52A30890E64823862AA64C11438")
    private float getProgressPerStar() {
        if(mNumStars > 0)        
        {
            float var90BBA35586B272EB97143C6DB36B5B39_722351848 = (1f * getMax() / mNumStars);
                        float var546ADE640B6EDFBC8A086EF31347E768_419174895 = getTaintFloat();
            return var546ADE640B6EDFBC8A086EF31347E768_419174895;
        } //End block
        else
        {
            float varC4CA4238A0B923820DCC509A6F75849B_875700746 = (1);
                        float var546ADE640B6EDFBC8A086EF31347E768_1674596230 = getTaintFloat();
            return var546ADE640B6EDFBC8A086EF31347E768_1674596230;
        } //End block
        // ---------- Original Method ----------
        //if (mNumStars > 0) {
            //return 1f * getMax() / mNumStars;
        //} else {
            //return 1;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.268 -0400", hash_original_method = "505263BDF0A0C38F11468B8B577065DB", hash_generated_method = "5DE2BC4F31A4A541CE6479877B792299")
    @Override
     Shape getDrawableShape() {
Shape varFD572D5AD6370B39B60D854340119E95_736262057 =         new RectShape();
        varFD572D5AD6370B39B60D854340119E95_736262057.addTaint(taint);
        return varFD572D5AD6370B39B60D854340119E95_736262057;
        // ---------- Original Method ----------
        //return new RectShape();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.268 -0400", hash_original_method = "9369317EE923D808BCA8DA286976E63F", hash_generated_method = "39BBDA924FDDE1F87615758333DFE2C9")
    @Override
     void onProgressRefresh(float scale, boolean fromUser) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(fromUser);
        addTaint(scale);
        super.onProgressRefresh(scale, fromUser);
        updateSecondaryProgress(getProgress());
        if(!fromUser)        
        {
            dispatchRatingChange(false);
        } //End block
        // ---------- Original Method ----------
        //super.onProgressRefresh(scale, fromUser);
        //updateSecondaryProgress(getProgress());
        //if (!fromUser) {
            //dispatchRatingChange(false);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.268 -0400", hash_original_method = "8E49EEB31BBD9AD69349C4C139B0ADB3", hash_generated_method = "2DABF9E1533100A98DE68A36C815A320")
    private void updateSecondaryProgress(int progress) {
        addTaint(progress);
        final float ratio = getProgressPerStar();
        if(ratio > 0)        
        {
            final float progressInStars = progress / ratio;
            final int secondaryProgress = (int) (Math.ceil(progressInStars) * ratio);
            setSecondaryProgress(secondaryProgress);
        } //End block
        // ---------- Original Method ----------
        //final float ratio = getProgressPerStar();
        //if (ratio > 0) {
            //final float progressInStars = progress / ratio;
            //final int secondaryProgress = (int) (Math.ceil(progressInStars) * ratio);
            //setSecondaryProgress(secondaryProgress);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.268 -0400", hash_original_method = "A52B21EAEA0ABEA842DCABF14BA9A11D", hash_generated_method = "67DB17559D1E74C39015499BDC5A5A68")
    @Override
    protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        addTaint(heightMeasureSpec);
        addTaint(widthMeasureSpec);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if(mSampleTile != null)        
        {
            final int width = mSampleTile.getWidth() * mNumStars;
            setMeasuredDimension(resolveSizeAndState(width, widthMeasureSpec, 0),
                    getMeasuredHeight());
        } //End block
        // ---------- Original Method ----------
        //super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //if (mSampleTile != null) {
            //final int width = mSampleTile.getWidth() * mNumStars;
            //setMeasuredDimension(resolveSizeAndState(width, widthMeasureSpec, 0),
                    //getMeasuredHeight());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.269 -0400", hash_original_method = "226C4EA3B37AD5190041539897D2C6DD", hash_generated_method = "D46B39EED2C3FCB544AE1F9ECD553F30")
    @Override
     void onStartTrackingTouch() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        mProgressOnStartTracking = getProgress();
        super.onStartTrackingTouch();
        // ---------- Original Method ----------
        //mProgressOnStartTracking = getProgress();
        //super.onStartTrackingTouch();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.269 -0400", hash_original_method = "6235EE5490022867BAEF4FF5BA6A4578", hash_generated_method = "D6C3487AA022ECAA17D432F9D9179C29")
    @Override
     void onStopTrackingTouch() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onStopTrackingTouch();
        if(getProgress() != mProgressOnStartTracking)        
        {
            dispatchRatingChange(true);
        } //End block
        // ---------- Original Method ----------
        //super.onStopTrackingTouch();
        //if (getProgress() != mProgressOnStartTracking) {
            //dispatchRatingChange(true);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.269 -0400", hash_original_method = "90A55B8149F7E0DE715F35412D64649C", hash_generated_method = "7BA0FC9D64756D08AFC36F4673AD7D4C")
    @Override
     void onKeyChange() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onKeyChange();
        dispatchRatingChange(true);
        // ---------- Original Method ----------
        //super.onKeyChange();
        //dispatchRatingChange(true);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.269 -0400", hash_original_method = "BACFB5351B8F09A10BE81590146F8D2A", hash_generated_method = "4D4D00C28D48EC6EA5AFC71315DA16B5")
     void dispatchRatingChange(boolean fromUser) {
        addTaint(fromUser);
        if(mOnRatingBarChangeListener != null)        
        {
            mOnRatingBarChangeListener.onRatingChanged(this, getRating(),
                    fromUser);
        } //End block
        // ---------- Original Method ----------
        //if (mOnRatingBarChangeListener != null) {
            //mOnRatingBarChangeListener.onRatingChanged(this, getRating(),
                    //fromUser);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:03.269 -0400", hash_original_method = "0784AE840DC17E48B7292220CB837BFB", hash_generated_method = "79D0EABF6C35426B5ADA6CE9FDBAEE39")
    @Override
    public synchronized void setMax(int max) {
        addTaint(max);
        if(max <= 0)        
        {
            return;
        } //End block
        super.setMax(max);
        // ---------- Original Method ----------
        //if (max <= 0) {
            //return;
        //}
        //super.setMax(max);
    }

    
    public interface OnRatingBarChangeListener {
        
        
        void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser);

    }
    
}

