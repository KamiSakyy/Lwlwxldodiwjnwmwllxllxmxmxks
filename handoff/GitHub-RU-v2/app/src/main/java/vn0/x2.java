package vn0;

import pz0.py;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x2 {
    public final String a;
    public final String b;
    public final w2 c;
    public final py d;
    public final t2 e;
    public final String f;

    public x2(String str, String str2, w2 w2Var, py pyVar, t2 t2Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = w2Var;
        this.d = pyVar;
        this.e = t2Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return k71.k.b(this.a, x2Var.a) && k71.k.b(this.b, x2Var.b) && k71.k.b(this.c, x2Var.c) && this.d == x2Var.d && k71.k.b(this.e, x2Var.e) && k71.k.b(this.f, x2Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        py pyVar = this.d;
        int hashCode2 = (hashCode + (pyVar == null ? 0 : pyVar.hashCode())) * 31;
        t2 t2Var = this.e;
        return this.f.hashCode() + ((hashCode2 + (t2Var != null ? t2Var.hashCode() : 0)) * 31);
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
