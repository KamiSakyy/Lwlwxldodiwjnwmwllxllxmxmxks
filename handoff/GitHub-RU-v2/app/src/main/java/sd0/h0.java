package sd0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h0 implements aa.h0 {
    public final String a;
    public final Integer b;
    public final w c;
    public final boolean d;
    public final e0 e;
    public final d0 f;
    public final boolean g;
    public final String h;

    public h0(String str, Integer num, w wVar, boolean z, e0 e0Var, d0 d0Var, boolean z2, String str2) {
        this.a = str;
        this.b = num;
        this.c = wVar;
        this.d = z;
        this.e = e0Var;
        this.f = d0Var;
        this.g = z2;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.a, h0Var.a) && k71.k.b(this.b, h0Var.b) && k71.k.b(this.c, h0Var.c) && this.d == h0Var.d && k71.k.b(this.e, h0Var.e) && k71.k.b(this.f, h0Var.f) && this.g == h0Var.g && k71.k.b(this.h, h0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        w wVar = this.c;
        int e = x.i.e((hashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31, 31, this.d);
        e0 e0Var = this.e;
        return this.h.hashCode() + x.i.e((this.f.hashCode() + ((e + (e0Var != null ? e0Var.hashCode() : 0)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder r = h1.r(this.b, "RepoFileFragment(id=", this.a, ", databaseId=", ", gitObject=");
        r.append(this.c);
        r.append(", viewerCanPush=");
        r.append(this.d);
        r.append(", ref=");
        r.append(this.e);
        r.append(", owner=");
        r.append(this.f);
        r.append(", isInOrganization=");
        return com.github.rudroid.m0.l(r, this.g, ", __typename=", this.h, ")");
    }
}
