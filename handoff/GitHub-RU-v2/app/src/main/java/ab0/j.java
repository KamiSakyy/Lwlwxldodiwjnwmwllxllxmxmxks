package ab0;

import com.github.service.models.response.type.PullRequestUpdateState;
import hc0.km;
import hc0.lm;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class j {
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
        int[] iArr2 = new int[lm.values().length];
        try {
            km kmVar = lm.Companion;
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            km kmVar2 = lm.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            km kmVar3 = lm.Companion;
            iArr2[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
