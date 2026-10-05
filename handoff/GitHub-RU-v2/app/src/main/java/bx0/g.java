package bx0;

import com.github.service.models.response.type.StatusState;
import pz0.x2;
import pz0.y2;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[y2.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            x2 x2Var = y2.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            x2 x2Var2 = y2.Companion;
            iArr[3] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            x2 x2Var3 = y2.Companion;
            iArr[4] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            x2 x2Var4 = y2.Companion;
            iArr[5] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            x2 x2Var5 = y2.Companion;
            iArr[2] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            x2 x2Var6 = y2.Companion;
            iArr[8] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            x2 x2Var7 = y2.Companion;
            iArr[6] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            x2 x2Var8 = y2.Companion;
            iArr[7] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            x2 x2Var9 = y2.Companion;
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
