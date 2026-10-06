package i01;

import a0.s0;
import com.github.service.models.response.type.PullRequestMergeMethod;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public String a;
    public int b;
    public PullRequestMergeMethod c;
    public Integer d;

    public a(String str, int i, PullRequestMergeMethod pullRequestMergeMethod, Integer num) {
        k.g(pullRequestMergeMethod, "mergeMethod");
        this.a = str;
        this.b = i;
        this.c = pullRequestMergeMethod;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && k.b(this.d, aVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + s0.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        Integer num = this.d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "MergeQueue(id=", this.a, ", entriesCount=", ", mergeMethod=");
        n.append(this.c);
        n.append(", nextEntryEstimatedTimeToMergeInSeconds=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
