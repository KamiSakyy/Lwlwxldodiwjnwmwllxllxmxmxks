package qo;

import m10.n40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public String a;
    public String b;
    public j c;
    public n40 d;
    public String e;

    public l(String str, String str2, j jVar, n40 n40Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
        this.d = n40Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c) && this.d == lVar.d && k71.k.b(this.e, lVar.e);
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
