package dz;

import com.github.service.models.response.type.PullRequestUpdateBranchMethod;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PullRequestUpdateBranchMethod.values().length];
        try {
            iArr[PullRequestUpdateBranchMethod.UNKNOWN__.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PullRequestUpdateBranchMethod.MERGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PullRequestUpdateBranchMethod.REBASE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
