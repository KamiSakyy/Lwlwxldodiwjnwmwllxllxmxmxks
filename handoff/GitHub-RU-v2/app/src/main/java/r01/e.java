package r01;

import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.type.IssueState;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes4.dex */
public class e {
    public static IssueOrPullRequestState a(IssueState issueState) {
        k71.k.g(issueState, "<this>");
        int i = d.a[issueState.ordinal()];
        if (i == 1) {
            return IssueOrPullRequestState.ISSUE_OPEN;
        }
        if (i == 2) {
            return IssueOrPullRequestState.ISSUE_CLOSED;
        }
        if (i == 3) {
            return IssueOrPullRequestState.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static IssueState b(String str) {
        IssueState issueState;
        k71.k.g(str, "rawValue");
        IssueState[] values = IssueState.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                issueState = null;
                break;
            }
            issueState = values[i];
            if (k71.k.b(issueState.getRawValue(), str)) {
                break;
            }
            i++;
        }
        return issueState == null ? IssueState.UNKNOWN__ : issueState;
    }
}
