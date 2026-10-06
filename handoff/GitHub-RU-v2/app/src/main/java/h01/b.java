package h01;

import com.github.service.models.response.issueorpullrequest.PullRequestMergeMethodStatus;
import com.github.service.models.response.type.PullRequestMergeMethod;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public PullRequestMergeMethod a;
    public PullRequestMergeMethodStatus b;
    public boolean c;

    public b(PullRequestMergeMethod pullRequestMergeMethod, PullRequestMergeMethodStatus pullRequestMergeMethodStatus, boolean z) {
        k71.k.g(pullRequestMergeMethod, "mergeMethod");
        k71.k.g(pullRequestMergeMethodStatus, "allowableStatus");
        this.a = pullRequestMergeMethod;
        this.b = pullRequestMergeMethodStatus;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllowablePullRequestMergeMethod(mergeMethod=");
        sb.append(this.a);
        sb.append(", allowableStatus=");
        sb.append(this.b);
        sb.append(", isDefault=");
        return f4.s(sb, this.c, ")");
    }
}
