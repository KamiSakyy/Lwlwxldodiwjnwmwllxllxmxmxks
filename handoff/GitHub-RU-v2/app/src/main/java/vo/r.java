package vo;

import m10.n40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public String a;
    public String b;
    public n c;
    public n40 d;
    public String e;

    public r(String str, String str2, n nVar, n40 n40Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = nVar;
        this.d = n40Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c) && this.d == rVar.d && k71.k.b(this.e, rVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        n40 n40Var = this.d;
        return this.e.hashCode() + ((hashCode + (n40Var == null ? 0 : n40Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", viewerPermission=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
