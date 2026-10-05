package pl0;

import com.github.service.models.response.type.StatusState;
import gn0.k2;
import gn0.l2;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[l2.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            k2 k2Var = l2.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            k2 k2Var2 = l2.Companion;
            iArr[3] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            k2 k2Var3 = l2.Companion;
            iArr[4] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            k2 k2Var4 = l2.Companion;
            iArr[5] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            k2 k2Var5 = l2.Companion;
            iArr[2] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            k2 k2Var6 = l2.Companion;
            iArr[8] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            k2 k2Var7 = l2.Companion;
            iArr[6] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            k2 k2Var8 = l2.Companion;
            iArr[7] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            k2 k2Var9 = l2.Companion;
            iArr[9] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        int[] iArr2 = new int[StatusState.values().length];
        try {
            iArr2[StatusState.FAILURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[StatusState.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[StatusState.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[StatusState.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[StatusState.PENDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[StatusState.EXPECTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        a = iArr2;
    }
}
