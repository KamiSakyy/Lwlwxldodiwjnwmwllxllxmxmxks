package va0;

import hc0.em;
import hc0.fm;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[fm.values().length];
        try {
            em emVar = fm.Companion;
            iArr[2] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            em emVar2 = fm.Companion;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            em emVar3 = fm.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            em emVar4 = fm.Companion;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
