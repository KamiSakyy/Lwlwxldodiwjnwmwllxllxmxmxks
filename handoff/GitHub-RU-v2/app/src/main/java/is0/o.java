package is0;

import aa.h0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements h0 {
    public n a;
    public k b;
    public String c;
    public String d;

    public o(n nVar, k kVar, String str, String str2) {
        this.a = nVar;
        this.b = kVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && k71.k.b(this.c, oVar.c) && k71.k.b(this.d, oVar.d);
    }

    public final int hashCode() {
        n nVar = this.a;
        int hashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        k kVar = this.b;
        return this.d.hashCode() + h1.i((hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkedPullRequests(userLinkedOnlyClosedByPullRequestReferences=");
        sb.append(this.a);
        sb.append(", allClosedByPullRequestReferences=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
