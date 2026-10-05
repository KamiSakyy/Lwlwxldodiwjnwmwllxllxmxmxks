package dz;

import com.github.service.models.response.type.PullRequestUpdateState;
import m10.k00;
import m10.l00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PullRequestUpdateState.values().length];
        try {
            iArr[PullRequestUpdateState.UNKNOWN__.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PullRequestUpdateState.OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PullRequestUpdateState.CLOSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[l00.values().length];
        try {
            k00 k00Var = l00.Companion;
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            k00 k00Var2 = l00.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            k00 k00Var3 = l00.Companion;
            iArr2[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
