package yz0;

import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.PullRequestState;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o3 {
    public static IssueOrPullRequestState a(PullRequestState pullRequestState) {
        k71.k.g(pullRequestState, "<this>");
        int i = n3.a[pullRequestState.ordinal()];
        if (i == 1) {
            return IssueOrPullRequestState.PULL_REQUEST_OPEN;
        }
        if (i == 2) {
            return IssueOrPullRequestState.PULL_REQUEST_CLOSED;
        }
        if (i == 3) {
            return IssueOrPullRequestState.PULL_REQUEST_MERGED;
        }
        if (i == 4) {
            return IssueOrPullRequestState.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static PullRequestState b(String str) {
        PullRequestState pullRequestState;
        k71.k.g(str, "rawValue");
        PullRequestState[] values = PullRequestState.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                pullRequestState = null;
                break;
            }
            pullRequestState = values[i];
            if (k71.k.b(pullRequestState.getRawValue(), str)) {
                break;
            }
            i++;
        }
        return pullRequestState == null ? PullRequestState.UNKNOWN__ : pullRequestState;
    }
}
