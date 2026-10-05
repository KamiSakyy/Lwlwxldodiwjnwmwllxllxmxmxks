package eb0;

import hc0.eq;
import hc0.fq;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[fq.values().length];
        try {
            eq eqVar = fq.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            eq eqVar2 = fq.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            eq eqVar3 = fq.Companion;
            iArr[4] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            eq eqVar4 = fq.Companion;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
