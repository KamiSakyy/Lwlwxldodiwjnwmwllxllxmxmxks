package e50;

import com.github.rudroid.copilot.h1;
import hc0.fq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 {
    public final String a;
    public final String b;
    public final h0 c;
    public final fq d;
    public final boolean e;
    public final String f;

    public k0(String str, String str2, h0 h0Var, fq fqVar, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = h0Var;
        this.d = fqVar;
        this.e = z;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k71.k.b(this.a, k0Var.a) && k71.k.b(this.b, k0Var.b) && k71.k.b(this.c, k0Var.c) && this.d == k0Var.d && this.e == k0Var.e && k71.k.b(this.f, k0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        fq fqVar = this.d;
        return this.f.hashCode() + x.i.e((hashCode + (fqVar == null ? 0 : fqVar.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", viewerPermission=");
        o.append(this.d);
        o.append(", isOrganizationDiscussionRepository=");
        return com.github.rudroid.m0.l(o, this.e, ", __typename=", this.f, ")");
    }
}
