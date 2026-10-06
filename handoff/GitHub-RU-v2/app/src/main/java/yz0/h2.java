package yz0;

import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h2 {
    public final IssueOrPullRequest$ReviewerReviewState a;
    public ZonedDateTime b;
    public boolean c;

    public h2(IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState, ZonedDateTime zonedDateTime, boolean z) {
        k71.k.g(issueOrPullRequest$ReviewerReviewState, "state");
        this.a = issueOrPullRequest$ReviewerReviewState;
        this.b = zonedDateTime;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.a == h2Var.a && k71.k.b(this.b, h2Var.b) && this.c == h2Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewerLatestReview(state=");
        sb.append(this.a);
        sb.append(", submittedAt=");
        sb.append(this.b);
        sb.append(", didCommitsChangeSinceLatestReview=");
        return jo.f4.s(sb, this.c, ")");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class IssueOrPullRequest$ReviewerReviewState {
        public IssueOrPullRequest$ReviewerReviewState() {
        }
    }
}
