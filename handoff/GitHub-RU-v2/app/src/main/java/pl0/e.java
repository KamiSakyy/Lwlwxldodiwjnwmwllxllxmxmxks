package pl0;

import com.github.service.models.response.type.DiffLineType;
import gn0.cn;
import gn0.dn;
import gn0.ma;
import gn0.na;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[na.values().length];
        try {
            iArr[2] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ma maVar = na.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            ma maVar2 = na.Companion;
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
        int[] iArr3 = new int[dn.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            cn cnVar = dn.Companion;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            cn cnVar2 = dn.Companion;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused12) {
        }
    }
    public Object t(Object p1) { return null; }
}
