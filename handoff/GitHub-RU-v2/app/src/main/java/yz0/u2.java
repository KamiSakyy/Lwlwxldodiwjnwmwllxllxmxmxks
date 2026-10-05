package yz0;

import com.github.service.models.response.PullRequestState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u2 {
    public final PullRequestState a;
    public final v6 b;
    public final boolean c;
    public final ZonedDateTime d;

    public u2(PullRequestState pullRequestState, v6 v6Var, boolean z, ZonedDateTime zonedDateTime) {
        k71.k.g(pullRequestState, "state");
        this.a = pullRequestState;
        this.b = v6Var;
        this.c = z;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return this.a == u2Var.a && k71.k.b(this.b, u2Var.b) && this.c == u2Var.c && k71.k.b(this.d, u2Var.d);
    }

    public final int hashCode() {
        int e = x.i.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        ZonedDateTime zonedDateTime = this.d;
        return e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode());
    }

    public final String toString() {
        return "MergePullRequest(state=" + this.a + ", mergeEvent=" + this.b + ", viewerCanDeleteHeadRef=" + this.c + ", committedDate=" + this.d + ")";
    }
}
