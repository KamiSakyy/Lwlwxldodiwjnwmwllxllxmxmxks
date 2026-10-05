package ab0;

import com.github.service.models.response.CheckConclusionState;
import hc0.i2;
import hc0.j2;
import hc0.tu;
import hc0.uu;

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
        int[] iArr2 = new int[j2.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            i2 i2Var = j2.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            i2 i2Var2 = j2.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            i2 i2Var3 = j2.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            i2 i2Var4 = j2.Companion;
            iArr2[4] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            i2 i2Var5 = j2.Companion;
            iArr2[5] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            i2 i2Var6 = j2.Companion;
            iArr2[6] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            i2 i2Var7 = j2.Companion;
            iArr2[7] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            i2 i2Var8 = j2.Companion;
            iArr2[8] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            i2 i2Var9 = j2.Companion;
            iArr2[9] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        a = iArr2;
        int[] iArr3 = new int[uu.values().length];
        try {
            iArr3[1] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            tu tuVar = uu.Companion;
            iArr3[2] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            tu tuVar2 = uu.Companion;
            iArr3[3] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            tu tuVar3 = uu.Companion;
            iArr3[4] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            tu tuVar4 = uu.Companion;
            iArr3[0] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            tu tuVar5 = uu.Companion;
            iArr3[5] = 6;
        } catch (NoSuchFieldError unused26) {
        }
    }
}
