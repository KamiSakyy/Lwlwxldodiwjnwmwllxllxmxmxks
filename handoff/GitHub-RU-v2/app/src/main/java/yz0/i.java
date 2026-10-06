package yz0;

import com.github.service.models.response.type.PullRequestMergeMethod;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public PullRequestMergeMethod a;

    public i(PullRequestMergeMethod pullRequestMergeMethod) {
        k71.k.g(pullRequestMergeMethod, "pullRequestMergeMethod");
        this.a = pullRequestMergeMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.a == ((i) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AutoMerge(pullRequestMergeMethod=" + this.a + ")";
    }
}
