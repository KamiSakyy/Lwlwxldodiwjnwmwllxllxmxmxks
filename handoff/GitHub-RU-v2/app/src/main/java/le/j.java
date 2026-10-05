package le;

import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28680a;

        static {
            int[] iArr = new int[IssueOrPullRequestState.values().length];
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_DRAFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_MERGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IssueOrPullRequestState.ISSUE_OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IssueOrPullRequestState.ISSUE_CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IssueOrPullRequestState.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f28680a = iArr;
        }
    }

    public static final int a(IssueOrPullRequestState issueOrPullRequestState, boolean z10, CloseReason closeReason, boolean z11) {
        k71.k.g(issueOrPullRequestState, "<this>");
        if (z10) {
            return 2131101015;
        }
        switch (a.f28680a[issueOrPullRequestState.ordinal()]) {
            case 1:
                return 2131099948;
            case 2:
                return z11 ? 2131099948 : 2131100988;
            case 3:
                return 2131100991;
            case 4:
                return 2131100990;
            case 5:
                return 2131100988;
            case 6:
                return closeReason == CloseReason.NotPlanned ? 2131099947 : 2131100990;
            case 7:
                return 2131099926;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int b(IssueOrPullRequestState issueOrPullRequestState, boolean z10, boolean z11) {
        k71.k.g(issueOrPullRequestState, "<this>");
        if (z10) {
            return 2131953237;
        }
        switch (a.f28680a[issueOrPullRequestState.ordinal()]) {
            case 1:
                return 2131954051;
            case 2:
                return z11 ? 2131954051 : 2131954056;
            case 3:
                return 2131954048;
            case 4:
                return 2131954054;
            case 5:
                return 2131954055;
            case 6:
                return 2131954047;
            case 7:
                return 2131954055;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int c(IssueOrPullRequestState issueOrPullRequestState, boolean z10, CloseReason closeReason, boolean z11) {
        k71.k.g(issueOrPullRequestState, "<this>");
        if (z10) {
            return 2131231287;
        }
        switch (a.f28680a[issueOrPullRequestState.ordinal()]) {
            case 1:
                return 2131231296;
            case 2:
                return z11 ? 2131231296 : 2131231290;
            case 3:
                return 2131231294;
            case 4:
                return 2131231285;
            case 5:
                return 2131231327;
            case 6:
                return (closeReason == CloseReason.NotPlanned || closeReason == CloseReason.Duplicate) ? 2131231447 : 2131231322;
            case 7:
                return 2131231327;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
