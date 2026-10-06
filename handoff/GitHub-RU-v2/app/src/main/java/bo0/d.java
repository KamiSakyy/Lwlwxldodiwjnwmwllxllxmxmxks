package bo0;

import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public String a;
    public String b;

    public d(String str, String str2) {
        k.g(str, "commitId");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.g("CommitSummaryParameters(commitId=", this.a, ", pullRequestId=", this.b, ")");
    }
}
