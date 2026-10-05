package bd;

import com.github.service.models.response.type.PullRequestReviewEvent;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3877a;

        static {
            int[] iArr = new int[PullRequestReviewEvent.values().length];
            try {
                iArr[PullRequestReviewEvent.COMMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullRequestReviewEvent.APPROVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PullRequestReviewEvent.REQUEST_CHANGES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PullRequestReviewEvent.UNKNOWN__.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PullRequestReviewEvent.DISMISS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3877a = iArr;
        }
    }

    public static final Integer a(PullRequestReviewEvent pullRequestReviewEvent, boolean z10) {
        k71.k.g(pullRequestReviewEvent, "<this>");
        int i = a.f3877a[pullRequestReviewEvent.ordinal()];
        if (i == 1) {
            return 2131954882;
        }
        if (i == 2) {
            return Integer.valueOf(z10 ? 2131954880 : 2131954879);
        }
        if (i == 3) {
            return Integer.valueOf(z10 ? 2131954891 : 2131954890);
        }
        if (i == 4 || i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
