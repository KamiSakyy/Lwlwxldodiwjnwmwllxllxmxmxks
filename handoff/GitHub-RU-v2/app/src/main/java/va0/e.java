package va0;

import com.github.service.models.response.type.DiffLineType;
import hc0.am;
import hc0.bm;
import hc0.y9;
import hc0.z9;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[z9.values().length];
        try {
            iArr[2] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            y9 y9Var = z9.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            y9 y9Var2 = z9.Companion;
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
        int[] iArr3 = new int[bm.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            am amVar = bm.Companion;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            am amVar2 = bm.Companion;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
