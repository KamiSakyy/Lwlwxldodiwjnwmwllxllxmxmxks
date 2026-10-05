package dz;

import com.github.service.models.response.PullRequestState;
import m10.a00;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PullRequestState.values().length];
        try {
            iArr[PullRequestState.OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PullRequestState.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PullRequestState.MERGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PullRequestState.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[b00.values().length];
        try {
            a00 a00Var = b00.Companion;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a00 a00Var2 = b00.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a00 a00Var3 = b00.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a00 a00Var4 = b00.Companion;
            iArr2[3] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr2;
    }
}
