package ce;

import com.github.service.models.response.type.PullRequestUpdateBranchMethod;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4256a;

        static {
            int[] iArr = new int[PullRequestUpdateBranchMethod.values().length];
            try {
                iArr[PullRequestUpdateBranchMethod.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullRequestUpdateBranchMethod.REBASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4256a = iArr;
        }
    }

    public static final int a(PullRequestUpdateBranchMethod pullRequestUpdateBranchMethod) {
        k.g(pullRequestUpdateBranchMethod, "method");
        int i = a.f4256a[pullRequestUpdateBranchMethod.ordinal()];
        return (i == 1 || i != 2) ? 2131954841 : 2131954876;
    }
}
