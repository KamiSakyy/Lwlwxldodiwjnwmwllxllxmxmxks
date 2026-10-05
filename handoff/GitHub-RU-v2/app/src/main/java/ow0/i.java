package ow0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public final String a;
    public final String b;
    public final uu0.c1 c;
    public final uu0.c d;

    public i(String str, String str2, uu0.c1 c1Var, uu0.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = c1Var;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c) && k71.k.b(this.d, iVar.d);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        uu0.c1 c1Var = this.c;
        int hashCode = (i + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        uu0.c cVar = this.d;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", pullRequestV2ItemsFragment=");
        o.append(this.c);
        o.append(", issueProjectV2ItemsFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
