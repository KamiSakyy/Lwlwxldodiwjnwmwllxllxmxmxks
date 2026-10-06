package h01;

import com.github.rudroid.m0;
import com.github.service.models.response.issueorpullrequest.PullRequestMergeAction;
import com.github.service.models.response.issueorpullrequest.PullRequestMergeMethodStatus;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public PullRequestMergeAction a;
    public PullRequestMergeMethodStatus b;
    public ArrayList c;

    public a(PullRequestMergeAction pullRequestMergeAction, PullRequestMergeMethodStatus pullRequestMergeMethodStatus, ArrayList arrayList) {
        k71.k.g(pullRequestMergeAction, "action");
        k71.k.g(pullRequestMergeMethodStatus, "allowableStatus");
        this.a = pullRequestMergeAction;
        this.b = pullRequestMergeMethodStatus;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllowablePullRequestMergeAction(action=");
        sb.append(this.a);
        sb.append(", allowableStatus=");
        sb.append(this.b);
        sb.append(", mergeMethods=");
        return m0.j(")", sb, this.c);
    }
}
