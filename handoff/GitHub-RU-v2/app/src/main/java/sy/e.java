package sy;

import com.github.service.models.response.type.DiffLineType;
import m10.pf;
import m10.qf;
import m10.wz;
import m10.xz;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[qf.values().length];
        try {
            iArr[2] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            pf pfVar = qf.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            pf pfVar2 = qf.Companion;
            iArr[0] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[DiffLineType.values().length];
        try {
            iArr2[DiffLineType.DELETION.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DiffLineType.ADDITION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DiffLineType.CONTEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DiffLineType.INJECTED_CONTEXT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DiffLineType.HUNK.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DiffLineType.UNKNOWN__.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
        int[] iArr3 = new int[xz.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            wz wzVar = xz.Companion;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            wz wzVar2 = xz.Companion;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused12) {
        }
    }
    public Object b(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public Object p(Object p1) { return null; }
}
