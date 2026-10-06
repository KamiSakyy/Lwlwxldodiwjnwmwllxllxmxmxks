package uf0;

import gn0.jr;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 {
    public String a;
    public String b;
    public l0 c;
    public jr d;
    public boolean e;
    public String f;

    public o0(String str, String str2, l0 l0Var, jr jrVar, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = l0Var;
        this.d = jrVar;
        this.e = z;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.a, o0Var.a) && k71.k.b(this.b, o0Var.b) && k71.k.b(this.c, o0Var.c) && this.d == o0Var.d && this.e == o0Var.e && k71.k.b(this.f, o0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        jr jrVar = this.d;
        return this.f.hashCode() + x.i.e((hashCode + (jrVar == null ? 0 : jrVar.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", viewerPermission=");
        o.append(this.d);
        o.append(", isOrganizationDiscussionRepository=");
        return com.github.rudroid.m0.l(o, this.e, ", __typename=", this.f, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
