package sy;

import com.github.service.models.response.type.StatusState;
import m10.s3;
import m10.t3;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[t3.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            s3 s3Var = t3.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            s3 s3Var2 = t3.Companion;
            iArr[3] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            s3 s3Var3 = t3.Companion;
            iArr[4] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            s3 s3Var4 = t3.Companion;
            iArr[5] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            s3 s3Var5 = t3.Companion;
            iArr[2] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            s3 s3Var6 = t3.Companion;
            iArr[8] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            s3 s3Var7 = t3.Companion;
            iArr[6] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            s3 s3Var8 = t3.Companion;
            iArr[7] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            s3 s3Var9 = t3.Companion;
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
