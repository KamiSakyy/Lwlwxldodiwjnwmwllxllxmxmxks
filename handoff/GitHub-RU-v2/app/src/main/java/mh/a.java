package mh;

import com.github.rudroid.uitoolkit.utils.b;
import d2.e0;
import d2.t;
import java.util.ArrayList;
import w61.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static final e0 a;

    static {
        k[] kVarArr = {new k(Float.valueOf(0.18f), new t(b.a("#0DFF50"))), new k(Float.valueOf(0.37f), new t(b.a("#67C2F5"))), new k(Float.valueOf(0.51f), new t(b.a("#8E47FE"))), new k(Float.valueOf(0.8f), new t(b.a("#8E47FE"))), new k(Float.valueOf(0.92f), new t(b.a("#67C2F5")))};
        long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(new t(((t) kVarArr[i].s).a));
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            arrayList2.add(Float.valueOf(((Number) kVarArr[i2].r).floatValue()));
        }
        a = new e0(arrayList, arrayList2, floatToRawIntBits, floatToRawIntBits2, 0);
    }
}
