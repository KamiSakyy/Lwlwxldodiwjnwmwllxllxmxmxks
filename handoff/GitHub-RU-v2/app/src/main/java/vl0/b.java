package vl0;

import com.github.service.models.response.CheckConclusionState;
import gn0.k2;
import gn0.l2;
import gn0.xv;
import gn0.yv;

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
        int[] iArr2 = new int[l2.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            k2 k2Var = l2.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            k2 k2Var2 = l2.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            k2 k2Var3 = l2.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            k2 k2Var4 = l2.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            k2 k2Var5 = l2.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            k2 k2Var6 = l2.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            k2 k2Var7 = l2.Companion;
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            k2 k2Var8 = l2.Companion;
            iArr2[8] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            k2 k2Var9 = l2.Companion;
            iArr2[9] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        a = iArr2;
        int[] iArr3 = new int[yv.values().length];
        try {
            iArr3[1] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            xv xvVar = yv.Companion;
            iArr3[2] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            xv xvVar2 = yv.Companion;
            iArr3[3] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            xv xvVar3 = yv.Companion;
            iArr3[4] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            xv xvVar4 = yv.Companion;
            iArr3[0] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            xv xvVar5 = yv.Companion;
            iArr3[5] = 6;
        } catch (NoSuchFieldError unused26) {
        }
    }
}
