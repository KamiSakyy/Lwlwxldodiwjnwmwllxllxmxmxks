package dz;

import com.github.service.models.response.CheckConclusionState;
import m10.ca0;
import m10.da0;
import m10.s3;
import m10.t3;

/* loaded from: /home/user/work/p/classes3.dex */
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
        int[] iArr2 = new int[t3.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            s3 s3Var = t3.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            s3 s3Var2 = t3.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            s3 s3Var3 = t3.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            s3 s3Var4 = t3.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            s3 s3Var5 = t3.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            s3 s3Var6 = t3.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            s3 s3Var7 = t3.Companion;
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            s3 s3Var8 = t3.Companion;
            iArr2[8] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            s3 s3Var9 = t3.Companion;
            iArr2[9] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        a = iArr2;
        int[] iArr3 = new int[da0.values().length];
        try {
            iArr3[1] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            ca0 ca0Var = da0.Companion;
            iArr3[2] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            ca0 ca0Var2 = da0.Companion;
            iArr3[3] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            ca0 ca0Var3 = da0.Companion;
            iArr3[4] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            ca0 ca0Var4 = da0.Companion;
            iArr3[0] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            ca0 ca0Var5 = da0.Companion;
            iArr3[5] = 6;
        } catch (NoSuchFieldError unused26) {
        }
    }
}
