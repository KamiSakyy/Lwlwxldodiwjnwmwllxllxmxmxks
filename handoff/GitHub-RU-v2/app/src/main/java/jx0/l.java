package jx0;

import com.github.service.models.response.type.PullRequestUpdateState;
import pz0.nu;
import pz0.ou;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class l {
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
        int[] iArr2 = new int[ou.values().length];
        try {
            nu nuVar = ou.Companion;
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            nu nuVar2 = ou.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            nu nuVar3 = ou.Companion;
            iArr2[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
