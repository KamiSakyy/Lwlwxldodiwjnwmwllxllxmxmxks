package fp;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public final String a;
    public final String b;
    public final List c;
    public final on.g d;
    public final int e;

    public q(String str, String str2, List list, on.g gVar, int i) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        k71.k.g(gVar, "order");
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = gVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c) && this.d == qVar.d && this.e == qVar.e;
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        List list = this.c;
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((i + (list == null ? 0 : list.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryAgentSessionParameters(repoOwner=", this.a, ", repoName=", this.b, ", filterStatus=");
        o.append(this.c);
        o.append(", order=");
        o.append(this.d);
        o.append(", pageSize=");
        return a0.s0.l(o, this.e, ")");
    }
}
