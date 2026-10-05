package jx0;

import com.github.service.models.response.CheckConclusionState;
import pz0.m30;
import pz0.n30;
import pz0.x2;
import pz0.y2;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CheckConclusionState.values().length];
        try {
            iArr[CheckConclusionState.ACTION_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckConclusionState.TIMED_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckConclusionState.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CheckConclusionState.FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CheckConclusionState.SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CheckConclusionState.NEUTRAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CheckConclusionState.SKIPPED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CheckConclusionState.STARTUP_FAILURE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[CheckConclusionState.STALE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[CheckConclusionState.UNKNOWN__.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        int[] iArr2 = new int[y2.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            x2 x2Var = y2.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            x2 x2Var2 = y2.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            x2 x2Var3 = y2.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            x2 x2Var4 = y2.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            x2 x2Var5 = y2.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            x2 x2Var6 = y2.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            x2 x2Var7 = y2.Companion;
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            x2 x2Var8 = y2.Companion;
            iArr2[8] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            x2 x2Var9 = y2.Companion;
            iArr2[9] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        a = iArr2;
        int[] iArr3 = new int[n30.values().length];
        try {
            iArr3[1] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            m30 m30Var = n30.Companion;
            iArr3[2] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            m30 m30Var2 = n30.Companion;
            iArr3[3] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            m30 m30Var3 = n30.Companion;
            iArr3[4] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            m30 m30Var4 = n30.Companion;
            iArr3[0] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            m30 m30Var5 = n30.Companion;
            iArr3[5] = 6;
        } catch (NoSuchFieldError unused26) {
        }
    }
}
