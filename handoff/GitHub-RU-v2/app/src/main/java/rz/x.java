package rz;

import cq.u2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x {
    public final String a;
    public final String b;
    public final v c;
    public final u2 d;

    public x(String str, String str2, v vVar, u2 u2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = vVar;
        this.d = u2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b) && k71.k.b(this.c, xVar.c) && k71.k.b(this.d, xVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        v vVar = this.c;
        int hashCode = (i + (vVar == null ? 0 : vVar.hashCode())) * 31;
        u2 u2Var = this.d;
        return hashCode + (u2Var != null ? u2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryOwner(__typename=", this.a, ", id=", this.b, ", onProjectV2Owner=");
        o.append(this.c);
        o.append(", organizationNameAndAvatar=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
