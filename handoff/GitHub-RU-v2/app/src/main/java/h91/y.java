package h91;

import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes5.dex */
public final class y extends x61.e implements RandomAccess {
    public kShadow[] r;
    public int[] s;

    public y(kShadow[] kVarArr, int[] iArr) {
        this.r = kVarArr;
        this.s = iArr;
    }

    public final int a() {
        return this.r.length;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof kShadow) {
            return super/*x61.a*/.contains((kShadow) obj);
        }
        return false;
    }

    public final Object get(int i) {
        return this.r[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof kShadow) {
            return super.indexOf((kShadow) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof kShadow) {
            return super.lastIndexOf((kShadow) obj);
        }
        return -1;
    }
}
