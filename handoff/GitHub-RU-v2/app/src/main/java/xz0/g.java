package xz0;

import java.util.List;
import x01.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public final Object a;
    public final i b;

    public g(List list, i iVar) {
        this.a = list;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && this.b.equals(gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchIssueOrPullRequestsPaged(issueOrPullRequests=" + this.a + ", page=" + this.b + ")";
    }
}
