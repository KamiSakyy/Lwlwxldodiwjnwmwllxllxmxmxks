package yz0;

import com.github.service.models.response.IssueOrPullRequestState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x7 {
    public final IssueOrPullRequestState a;
    public final boolean b;

    public x7(IssueOrPullRequestState issueOrPullRequestState, boolean z) {
        k71.k.g(issueOrPullRequestState, "state");
        this.a = issueOrPullRequestState;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        return this.a == x7Var.a && this.b == x7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateIssueState(state=" + this.a + ", viewerCanReopen=" + this.b + ")";
    }
    public Object add(Object p1) { return null; }
}
