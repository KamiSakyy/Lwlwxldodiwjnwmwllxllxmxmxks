package yz0;

import com.github.service.models.response.IssueOrPullRequestState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a8 {
    public IssueOrPullRequestState a;
    public boolean b;

    public a8(IssueOrPullRequestState issueOrPullRequestState, boolean z) {
        k71.k.g(issueOrPullRequestState, "state");
        this.a = issueOrPullRequestState;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        return this.a == a8Var.a && this.b == a8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdatePullRequestState(state=" + this.a + ", viewerCanReopen=" + this.b + ")";
    }
}
