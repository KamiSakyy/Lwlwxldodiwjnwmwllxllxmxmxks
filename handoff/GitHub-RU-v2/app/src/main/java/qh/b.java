package qh;

import com.github.service.models.response.PullRequestState;
import k71.k;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {

    public static final /* synthetic */ class a {
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
            a = iArr;
        }
    }

    public static final int a(PullRequestState pullRequestState, boolean z, boolean z2) {
        k.g(pullRequestState, "<this>");
        if (z2) {
            return 2131953237;
        }
        int i = a.a[pullRequestState.ordinal()];
        if (i == 1) {
            return z ? 2131953932 : 2131953938;
        }
        if (i == 2) {
            return 2131953929;
        }
        if (i == 3) {
            return 2131953936;
        }
        if (i == 4) {
            return 2131953939;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int b(PullRequestState pullRequestState, boolean z, boolean z2) {
        k.g(pullRequestState, "<this>");
        if (z2) {
            return 2131952852;
        }
        int i = a.a[pullRequestState.ordinal()];
        if (i == 1) {
            return z ? 2131952806 : 2131952841;
        }
        if (i == 2) {
            return 2131952757;
        }
        if (i == 3) {
            return 2131952839;
        }
        if (i == 4) {
            return 2131952965;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int c(PullRequestState pullRequestState, boolean z, boolean z2) {
        k.g(pullRequestState, "<this>");
        if (z2) {
            return 2131231288;
        }
        int i = a.a[pullRequestState.ordinal()];
        if (i == 1) {
            return z ? 2131231297 : 2131231292;
        }
        if (i == 2) {
            return 2131231295;
        }
        if (i == 3) {
            return 2131231286;
        }
        if (i == 4) {
            return 2131231292;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int d(PullRequestState pullRequestState, boolean z, boolean z2) {
        k.g(pullRequestState, "<this>");
        if (z2) {
            return 2131231287;
        }
        int i = a.a[pullRequestState.ordinal()];
        if (i == 1) {
            return z ? 2131231296 : 2131231290;
        }
        if (i == 2) {
            return 2131231294;
        }
        if (i == 3) {
            return 2131231285;
        }
        if (i == 4) {
            return 2131231290;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int e(PullRequestState pullRequestState, boolean z, boolean z2) {
        k.g(pullRequestState, "<this>");
        if (z2) {
            return 2131101015;
        }
        int i = a.a[pullRequestState.ordinal()];
        if (i == 1) {
            return z ? 2131099948 : 2131100988;
        }
        if (i == 2) {
            return 2131100991;
        }
        if (i == 3) {
            return 2131100990;
        }
        if (i == 4) {
            return 2131099948;
        }
        throw new NoWhenBranchMatchedException();
    }
}
