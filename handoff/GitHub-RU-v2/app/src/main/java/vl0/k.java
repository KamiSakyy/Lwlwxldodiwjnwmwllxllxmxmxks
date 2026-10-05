package vl0;

import com.github.service.models.response.type.PullRequestUpdateState;
import gn0.mn;
import gn0.nn;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class k {
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
        int[] iArr2 = new int[nn.values().length];
        try {
            mn mnVar = nn.Companion;
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            mn mnVar2 = nn.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            mn mnVar3 = nn.Companion;
            iArr2[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
