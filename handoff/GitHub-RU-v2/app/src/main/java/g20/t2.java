package g20;

import hc0.fq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t2 {
    public String a;
    public String b;
    public s2 c;
    public fq d;
    public p2 e;
    public String f;

    public t2(String str, String str2, s2 s2Var, fq fqVar, p2 p2Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = s2Var;
        this.d = fqVar;
        this.e = p2Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return k71.k.b(this.a, t2Var.a) && k71.k.b(this.b, t2Var.b) && k71.k.b(this.c, t2Var.c) && this.d == t2Var.d && k71.k.b(this.e, t2Var.e) && k71.k.b(this.f, t2Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        fq fqVar = this.d;
        int hashCode2 = (hashCode + (fqVar == null ? 0 : fqVar.hashCode())) * 31;
        p2 p2Var = this.e;
        return this.f.hashCode() + ((hashCode2 + (p2Var != null ? p2Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", viewerPermission=");
        o.append(this.d);
        o.append(", defaultBranchRef=");
        o.append(this.e);
        o.append(", __typename=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
