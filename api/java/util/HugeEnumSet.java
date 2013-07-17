package java.util;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

final class HugeEnumSet<E extends Enum<E>> extends EnumSet<E> {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.454 -0400", hash_original_field = "407482FEF87D1B9F3A34AF46A705ABA8", hash_generated_field = "783D81D695A8378E8654E8D6DD3B9BE2")

    private E[] enums;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.455 -0400", hash_original_field = "CC411E6C13670E52124629B8AC83F7D0", hash_generated_field = "487233F7143B18DBA481DB90C8ACD8D3")

    private long[] bits;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.455 -0400", hash_original_field = "F7BD60B75B29D79B660A2859395C1A24", hash_generated_field = "F06612A05C836674433E69C513561353")

    private int size;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.455 -0400", hash_original_method = "EEA55C49C96425F7EA6FAB4AE055FF38", hash_generated_method = "03986B409E8343D111EAE6CD8CE436E7")
      HugeEnumSet(Class<E> elementType, E[] enums) {
        super(elementType);
        addTaint(elementType.getTaint());
        this.enums = enums;
        bits = new long[(enums.length + BIT_IN_LONG - 1) / BIT_IN_LONG];
        // ---------- Original Method ----------
        //this.enums = enums;
        //bits = new long[(enums.length + BIT_IN_LONG - 1) / BIT_IN_LONG];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.456 -0400", hash_original_method = "AA8C9EBB2E9808034C94DE14598C355D", hash_generated_method = "279FDD9AFA1C7F68F5522D1D0D12381B")
    @Override
    public boolean add(E element) {
        addTaint(element.getTaint());
        elementClass.cast(element);
        int ordinal = element.ordinal();
        int index = ordinal / BIT_IN_LONG;
        int inBits = ordinal % BIT_IN_LONG;
        long oldBits = bits[index];
        long newBits = oldBits | (1L << inBits);
        if(oldBits != newBits)        
        {
            bits[index] = newBits;
            size++;
            boolean varB326B5062B2F0E69046810717534CB09_32559669 = (true);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1201907903 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1201907903;
        } //End block
        boolean var68934A3E9455FA72420237EB05902327_607878240 = (false);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_543797718 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_543797718;
        // ---------- Original Method ----------
        //elementClass.cast(element);
        //int ordinal = element.ordinal();
        //int index = ordinal / BIT_IN_LONG;
        //int inBits = ordinal % BIT_IN_LONG;
        //long oldBits = bits[index];
        //long newBits = oldBits | (1L << inBits);
        //if (oldBits != newBits) {
            //bits[index] = newBits;
            //size++;
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.457 -0400", hash_original_method = "E12827AAC6F89269FBC667C494374EA1", hash_generated_method = "7972D02824F023F8A3C144D8B20F1ED1")
    @Override
    public boolean addAll(Collection<? extends E> collection) {
        addTaint(collection.getTaint());
        if(collection.isEmpty() || collection == this)        
        {
            boolean var68934A3E9455FA72420237EB05902327_409726187 = (false);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_520978723 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_520978723;
        } //End block
        if(collection instanceof EnumSet)        
        {
            EnumSet<?> set = (EnumSet) collection;
            set.elementClass.asSubclass(elementClass);
            HugeEnumSet<E> hugeSet = (HugeEnumSet<E>) set;
            boolean changed = false;
for(int i = 0;i < bits.length;i++)
            {
                long oldBits = bits[i];
                long newBits = oldBits | hugeSet.bits[i];
                if(oldBits != newBits)                
                {
                    bits[i] = newBits;
                    size += Long.bitCount(newBits) - Long.bitCount(oldBits);
                    changed = true;
                } //End block
            } //End block
            boolean var8977DFAC2F8E04CB96E66882235F5ABA_940884891 = (changed);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1054904069 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1054904069;
        } //End block
        boolean varB2042CE01B55200C7258CBFA6D7E5E4D_496153448 = (super.addAll(collection));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1001097427 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1001097427;
        // ---------- Original Method ----------
        //if (collection.isEmpty() || collection == this) {
            //return false;
        //}
        //if (collection instanceof EnumSet) {
            //EnumSet<?> set = (EnumSet) collection; 
            //set.elementClass.asSubclass(elementClass); 
            //HugeEnumSet<E> hugeSet = (HugeEnumSet<E>) set;
            //boolean changed = false;
            //for (int i = 0; i < bits.length; i++) {
                //long oldBits = bits[i];
                //long newBits = oldBits | hugeSet.bits[i];
                //if (oldBits != newBits) {
                    //bits[i] = newBits;
                    //size += Long.bitCount(newBits) - Long.bitCount(oldBits);
                    //changed = true;
                //}
            //}
            //return changed;
        //}
        //return super.addAll(collection);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.457 -0400", hash_original_method = "3CA361324F026F8C9B0AA94A864ACDD9", hash_generated_method = "B8739FB70710D69A1FDDA9DB2540A2F9")
    @Override
    public int size() {
        int varF7BD60B75B29D79B660A2859395C1A24_1988279220 = (size);
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1581320192 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1581320192;
        // ---------- Original Method ----------
        //return size;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.458 -0400", hash_original_method = "DCEAB8467BE76F2C68D656B465986296", hash_generated_method = "44B0C7C748288EE706DEDE8A6C28EFB5")
    @Override
    public void clear() {
        Arrays.fill(bits, 0);
        size = 0;
        // ---------- Original Method ----------
        //Arrays.fill(bits, 0);
        //size = 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.459 -0400", hash_original_method = "A9576B1054BBEFBD598CED30CCA4181D", hash_generated_method = "8CF9D93D28C4DE728BB17571026E0683")
    @Override
    protected void complement() {
        size = 0;
for(int i = 0, length = bits.length;i < length;i++)
        {
            long b = ~bits[i];
            if(i == length - 1)            
            {
                b &= -1L >>> (BIT_IN_LONG - (enums.length % BIT_IN_LONG));
            } //End block
            size += Long.bitCount(b);
            bits[i] = b;
        } //End block
        // ---------- Original Method ----------
        //size = 0;
        //for (int i = 0, length = bits.length; i < length; i++) {
            //long b = ~bits[i];
            //if (i == length - 1) {
                //b &= -1L >>> (BIT_IN_LONG - (enums.length % BIT_IN_LONG));
            //}
            //size += Long.bitCount(b);
            //bits[i] = b;
        //}
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.460 -0400", hash_original_method = "B006F695BBA9ACB2815E6A6799929FF8", hash_generated_method = "E7A124F3D9864E851ECC9D2F1328D425")
    @Override
    public boolean contains(Object object) {
        addTaint(object.getTaint());
        if(object == null || !isValidType(object.getClass()))        
        {
            boolean var68934A3E9455FA72420237EB05902327_663552300 = (false);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2068757243 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_2068757243;
        } //End block
        @SuppressWarnings("unchecked") int ordinal = ((E) object).ordinal();
        int index = ordinal / BIT_IN_LONG;
        int inBits = ordinal % BIT_IN_LONG;
        boolean var3C5D027058CFAB105FD9BB849250873A_599055359 = ((bits[index] & (1L << inBits)) != 0);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1376898845 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1376898845;
        // ---------- Original Method ----------
        //if (object == null || !isValidType(object.getClass())) {
            //return false;
        //}
        //@SuppressWarnings("unchecked") 
        //int ordinal = ((E) object).ordinal();
        //int index = ordinal / BIT_IN_LONG;
        //int inBits = ordinal % BIT_IN_LONG;
        //return (bits[index] & (1L << inBits)) != 0;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.460 -0400", hash_original_method = "826B98DAC190E2D4BDC8BAF1B8E9FA22", hash_generated_method = "F45ED2A59C3EC7765933D90F4D682197")
    @Override
    public HugeEnumSet<E> clone() {
        HugeEnumSet<E> set = (HugeEnumSet<E>) super.clone();
        set.bits = bits.clone();
HugeEnumSet<E> varD2D4612E029977363A9BBEBD4F0339C0_1588935502 =         set;
        varD2D4612E029977363A9BBEBD4F0339C0_1588935502.addTaint(taint);
        return varD2D4612E029977363A9BBEBD4F0339C0_1588935502;
        // ---------- Original Method ----------
        //HugeEnumSet<E> set = (HugeEnumSet<E>) super.clone();
        //set.bits = bits.clone();
        //return set;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.461 -0400", hash_original_method = "339CE6C6AEA3B599DB9A44E737F0BFCB", hash_generated_method = "1DADB239F46C9FCA54392770E0E2C355")
    @Override
    public boolean containsAll(Collection<?> collection) {
        addTaint(collection.getTaint());
        if(collection.isEmpty())        
        {
            boolean varB326B5062B2F0E69046810717534CB09_172901989 = (true);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_168706539 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_168706539;
        } //End block
        if(collection instanceof HugeEnumSet)        
        {
            HugeEnumSet<?> set = (HugeEnumSet<?>) collection;
            if(isValidType(set.elementClass))            
            {
for(int i = 0;i < bits.length;i++)
                {
                    long setBits = set.bits[i];
                    if((bits[i] & setBits) != setBits)                    
                    {
                        boolean var68934A3E9455FA72420237EB05902327_260302806 = (false);
                                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1725207912 = getTaintBoolean();
                        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1725207912;
                    } //End block
                } //End block
                boolean varB326B5062B2F0E69046810717534CB09_1321284158 = (true);
                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_971211528 = getTaintBoolean();
                return var84E2C64F38F78BA3EA5C905AB5A2DA27_971211528;
            } //End block
        } //End block
        boolean var0F80B7441EDA20A6384C819B6A7145F9_910991284 = (!(collection instanceof EnumSet) && super.containsAll(collection));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1593368131 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1593368131;
        // ---------- Original Method ----------
        //if (collection.isEmpty()) {
            //return true;
        //}
        //if (collection instanceof HugeEnumSet) {
            //HugeEnumSet<?> set = (HugeEnumSet<?>) collection;
            //if (isValidType(set.elementClass)) {
                //for (int i = 0; i < bits.length; i++) {
                    //long setBits = set.bits[i];
                    //if ((bits[i] & setBits) != setBits) {
                        //return false;
                    //}
                //}
                //return true;
            //}
        //}
        //return !(collection instanceof EnumSet) && super.containsAll(collection);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.462 -0400", hash_original_method = "29B1F731631A653DA7254FAD146C3D30", hash_generated_method = "1CEF02ABD323C9C5D524509FBB0932D3")
    @Override
    public boolean equals(Object object) {
        addTaint(object.getTaint());
        if(object == null)        
        {
            boolean var68934A3E9455FA72420237EB05902327_2102115475 = (false);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_789693309 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_789693309;
        } //End block
        if(!isValidType(object.getClass()))        
        {
            boolean var75EAEC12DA10D524D5BB1C4333283B8A_1743300560 = (super.equals(object));
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2139404036 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_2139404036;
        } //End block
        boolean var3AB7E17F85829400C7A7282BEC8BFB05_582924952 = (Arrays.equals(bits, ((HugeEnumSet<?>) object).bits));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1041457242 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1041457242;
        // ---------- Original Method ----------
        //if (object == null) {
            //return false;
        //}
        //if (!isValidType(object.getClass())) {
            //return super.equals(object);
        //}
        //return Arrays.equals(bits, ((HugeEnumSet<?>) object).bits);
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.463 -0400", hash_original_method = "B316E1958D9D53581FC97DA7E1235F34", hash_generated_method = "22A4D79610FA003B46895466D936C28D")
    @Override
    public Iterator<E> iterator() {
Iterator<E> var23ABE8665BBA8FC4E64A26ACD82C00C6_286513336 =         new HugeEnumSetIterator();
        var23ABE8665BBA8FC4E64A26ACD82C00C6_286513336.addTaint(taint);
        return var23ABE8665BBA8FC4E64A26ACD82C00C6_286513336;
        // ---------- Original Method ----------
        //return new HugeEnumSetIterator();
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.463 -0400", hash_original_method = "0CEE396056E1D776D537706DDC043702", hash_generated_method = "84536673B0895AF5365287FB6A8432E1")
    @Override
    public boolean remove(Object object) {
        addTaint(object.getTaint());
        if(object == null || !isValidType(object.getClass()))        
        {
            boolean var68934A3E9455FA72420237EB05902327_23617973 = (false);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_629795347 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_629795347;
        } //End block
        @SuppressWarnings("unchecked") int ordinal = ((E) object).ordinal();
        int index = ordinal / BIT_IN_LONG;
        int inBits = ordinal % BIT_IN_LONG;
        long oldBits = bits[index];
        long newBits = oldBits & ~(1L << inBits);
        if(oldBits != newBits)        
        {
            bits[index] = newBits;
            size--;
            boolean varB326B5062B2F0E69046810717534CB09_551006143 = (true);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_194684042 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_194684042;
        } //End block
        boolean var68934A3E9455FA72420237EB05902327_1313680841 = (false);
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_311748654 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_311748654;
        // ---------- Original Method ----------
        //if (object == null || !isValidType(object.getClass())) {
            //return false;
        //}
        //@SuppressWarnings("unchecked") 
        //int ordinal = ((E) object).ordinal();
        //int index = ordinal / BIT_IN_LONG;
        //int inBits = ordinal % BIT_IN_LONG;
        //long oldBits = bits[index];
        //long newBits = oldBits & ~(1L << inBits);
        //if (oldBits != newBits) {
            //bits[index] = newBits;
            //size--;
            //return true;
        //}
        //return false;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.464 -0400", hash_original_method = "3A1F4E4B375F17905B34B03F15B39BEF", hash_generated_method = "80BF3898C1785D91ED30F43C9DA8BCBE")
    @Override
    public boolean removeAll(Collection<?> collection) {
        addTaint(collection.getTaint());
        if(collection.isEmpty())        
        {
            boolean var68934A3E9455FA72420237EB05902327_729711930 = (false);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1822087451 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1822087451;
        } //End block
        if(collection instanceof EnumSet)        
        {
            EnumSet<?> set = (EnumSet<?>) collection;
            if(!isValidType(set.elementClass))            
            {
                boolean var68934A3E9455FA72420237EB05902327_466236621 = (false);
                                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_958749239 = getTaintBoolean();
                return var84E2C64F38F78BA3EA5C905AB5A2DA27_958749239;
            } //End block
            HugeEnumSet<E> hugeSet = (HugeEnumSet<E>) set;
            boolean changed = false;
for(int i = 0;i < bits.length;i++)
            {
                long oldBits = bits[i];
                long newBits = oldBits & ~hugeSet.bits[i];
                if(oldBits != newBits)                
                {
                    bits[i] = newBits;
                    size += Long.bitCount(newBits) - Long.bitCount(oldBits);
                    changed = true;
                } //End block
            } //End block
            boolean var8977DFAC2F8E04CB96E66882235F5ABA_1209325899 = (changed);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1758278118 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1758278118;
        } //End block
        boolean varC59E950B034B0097B868C2C96544231D_1831601082 = (super.removeAll(collection));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1875744246 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1875744246;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.465 -0400", hash_original_method = "60F21531B5154FAF39DCC5FD8D5C4219", hash_generated_method = "56354532C3971144E1CB2441749BEC54")
    @Override
    public boolean retainAll(Collection<?> collection) {
        addTaint(collection.getTaint());
        if(collection instanceof EnumSet)        
        {
            EnumSet<?> set = (EnumSet<?>) collection;
            if(!isValidType(set.elementClass))            
            {
                if(size > 0)                
                {
                    clear();
                    boolean varB326B5062B2F0E69046810717534CB09_2015817539 = (true);
                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1587604011 = getTaintBoolean();
                    return var84E2C64F38F78BA3EA5C905AB5A2DA27_1587604011;
                } //End block
                else
                {
                    boolean var68934A3E9455FA72420237EB05902327_1238136586 = (false);
                                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1067335103 = getTaintBoolean();
                    return var84E2C64F38F78BA3EA5C905AB5A2DA27_1067335103;
                } //End block
            } //End block
            HugeEnumSet<E> hugeSet = (HugeEnumSet<E>) set;
            boolean changed = false;
for(int i = 0;i < bits.length;i++)
            {
                long oldBits = bits[i];
                long newBits = oldBits & hugeSet.bits[i];
                if(oldBits != newBits)                
                {
                    bits[i] = newBits;
                    size += Long.bitCount(newBits) - Long.bitCount(oldBits);
                    changed = true;
                } //End block
            } //End block
            boolean var8977DFAC2F8E04CB96E66882235F5ABA_1161805651 = (changed);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1397015634 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1397015634;
        } //End block
        boolean var503FF497CC541185965B7F24CCB51DB8_382759513 = (super.retainAll(collection));
                boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_117838938 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_117838938;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.468 -0400", hash_original_method = "8A87EADAF5D536F1830CF4EB88261592", hash_generated_method = "B47E8A32CAF2F12EAF6D168ED98BF2D1")
    @Override
     void setRange(E start, E end) {
        addTaint(end.getTaint());
        addTaint(start.getTaint());
        int startOrdinal = start.ordinal();
        int startIndex = startOrdinal / BIT_IN_LONG;
        int startInBits = startOrdinal % BIT_IN_LONG;
        int endOrdinal = end.ordinal();
        int endIndex = endOrdinal / BIT_IN_LONG;
        int endInBits = endOrdinal % BIT_IN_LONG;
        if(startIndex == endIndex)        
        {
            long range = (-1L >>> (BIT_IN_LONG -(endInBits - startInBits + 1))) << startInBits;
            size -= Long.bitCount(bits[startIndex]);
            bits[startIndex] |= range;
            size += Long.bitCount(bits[startIndex]);
        } //End block
        else
        {
            long range = (-1L >>> startInBits) << startInBits;
            size -= Long.bitCount(bits[startIndex]);
            bits[startIndex] |= range;
            size += Long.bitCount(bits[startIndex]);
            range = -1L >>> (BIT_IN_LONG - (endInBits + 1));
            size -= Long.bitCount(bits[endIndex]);
            bits[endIndex] |= range;
            size += Long.bitCount(bits[endIndex]);
for(int i = (startIndex + 1);i <= (endIndex - 1);i++)
            {
                size -= Long.bitCount(bits[i]);
                bits[i] = -1L;
                size += Long.bitCount(bits[i]);
            } //End block
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    private class HugeEnumSetIterator implements Iterator<E> {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.469 -0400", hash_original_field = "82C47125B2259EDDE10B83EF1976B39A", hash_generated_field = "C1B6116DE9FEB291CD26A801EC34041A")

        private long currentBits = bits[0];
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.469 -0400", hash_original_field = "6A992D5529F459A44FEE58C733255E86", hash_generated_field = "56A277C77B76B31C1E1045C8C11CA802")

        private int index;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.469 -0400", hash_original_field = "F2CE11EBF110993621BEDD8E747D7B1B", hash_generated_field = "EAE061265E9AAFE24A096DF314F2EEC2")

        private long mask;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.469 -0400", hash_original_field = "98BD1C45684CF587AC2347A92DD7BB51", hash_generated_field = "D8F234509BE4DCE084A89E169B9321DD")

        private E last;
        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.469 -0400", hash_original_method = "FF84D40F2248B9BB6D017CB27211B237", hash_generated_method = "93D38B12F784CDCB9694A9331A12A737")
        private  HugeEnumSetIterator() {
            computeNextElement();
            // ---------- Original Method ----------
            //computeNextElement();
        }

        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.470 -0400", hash_original_method = "2CE5F24A4C571BEECB25C40400E44908", hash_generated_method = "BC6D53F8A1B341BC320605F46B1E3098")
         void computeNextElement() {
            while
(true)            
            {
                if(currentBits != 0)                
                {
                    mask = currentBits & -currentBits;
                    return;
                } //End block
                else
                if(++index < bits.length)                
                {
                    currentBits = bits[index];
                } //End block
                else
                {
                    mask = 0;
                    return;
                } //End block
            } //End block
            // ---------- Original Method ----------
            //while (true) {
                //if (currentBits != 0) {
                    //mask = currentBits & -currentBits; 
                    //return;
                //} else if (++index < bits.length) {
                    //currentBits = bits[index];
                //} else {
                    //mask = 0;
                    //return;
                //}
            //}
        }

        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.471 -0400", hash_original_method = "04AD09EE87D1D0FB4F163A9180F152BA", hash_generated_method = "49297EE9C1D33EF547EDE01DA276CE20")
        public boolean hasNext() {
            boolean varD4C71BBF3A783D0D50DB7E2A5ECD4FBD_2085925077 = (mask != 0);
                        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1107936971 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_1107936971;
            // ---------- Original Method ----------
            //return mask != 0;
        }

        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.472 -0400", hash_original_method = "B99B4F6D513EFDAF8AFCA1BFB6A725C7", hash_generated_method = "25A1062A3F82AF8FB66879096BC1E400")
        public E next() {
            if(mask == 0)            
            {
                NoSuchElementException var28D00AB599969908D71F102AF992D49A_1539177122 = new NoSuchElementException();
                var28D00AB599969908D71F102AF992D49A_1539177122.addTaint(taint);
                throw var28D00AB599969908D71F102AF992D49A_1539177122;
            } //End block
            int ordinal = Long.numberOfTrailingZeros(mask) + index * BIT_IN_LONG;
            last = enums[ordinal];
            currentBits &= ~mask;
            computeNextElement();
E var3D331EA760A7BCD3BF7E380A6C79C638_1776530075 =             last;
            var3D331EA760A7BCD3BF7E380A6C79C638_1776530075.addTaint(taint);
            return var3D331EA760A7BCD3BF7E380A6C79C638_1776530075;
            // ---------- Original Method ----------
            //if (mask == 0) {
                //throw new NoSuchElementException();
            //}
            //int ordinal = Long.numberOfTrailingZeros(mask) + index * BIT_IN_LONG;
            //last = enums[ordinal];
            //currentBits &= ~mask;
            //computeNextElement();
            //return last;
        }

        
                @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.472 -0400", hash_original_method = "56FBFE20B1E9D061DA542B4F3A5EEEAB", hash_generated_method = "E7333C1A438332CFC3A42F8667629077")
        public void remove() {
            if(last == null)            
            {
                IllegalStateException varC311A989A119B96A6232C22ABFE87C25_1419823091 = new IllegalStateException();
                varC311A989A119B96A6232C22ABFE87C25_1419823091.addTaint(taint);
                throw varC311A989A119B96A6232C22ABFE87C25_1419823091;
            } //End block
            HugeEnumSet.this.remove(last);
            last = null;
            // ---------- Original Method ----------
            //if (last == null) {
                //throw new IllegalStateException();
            //}
            //HugeEnumSet.this.remove(last);
            //last = null;
        }

        
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:09.473 -0400", hash_original_field = "0292F67E7C59ADF794759ADEDFC60560", hash_generated_field = "4752A7C1FB2BE83B3E8CBE7929135C61")

    private static final int BIT_IN_LONG = 64;
}

