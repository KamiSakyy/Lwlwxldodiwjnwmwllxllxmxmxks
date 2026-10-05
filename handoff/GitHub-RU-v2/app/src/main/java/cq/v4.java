package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v4 implements aa.h0 {
    public final String a;
    public final Integer b;
    public final k4 c;
    public final boolean d;
    public final s4 e;
    public final r4 f;
    public final boolean g;
    public final String h;

    public v4(String str, Integer num, k4 k4Var, boolean z, s4 s4Var, r4 r4Var, boolean z2, String str2) {
        this.a = str;
        this.b = num;
        this.c = k4Var;
        this.d = z;
        this.e = s4Var;
        this.f = r4Var;
        this.g = z2;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return k71.k.b(this.a, v4Var.a) && k71.k.b(this.b, v4Var.b) && k71.k.b(this.c, v4Var.c) && this.d == v4Var.d && k71.k.b(this.e, v4Var.e) && k71.k.b(this.f, v4Var.f) && this.g == v4Var.g && k71.k.b(this.h, v4Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        k4 k4Var = this.c;
        int e = x.i.e((hashCode2 + (k4Var == null ? 0 : k4Var.hashCode())) * 31, 31, this.d);
        s4 s4Var = this.e;
        return this.h.hashCode() + x.i.e((this.f.hashCode() + ((e + (s4Var != null ? s4Var.hashCode() : 0)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder r = com.github.rudroid.copilot.h1.r(this.b, "RepoFileFragment(id=", this.a, ", databaseId=", ", gitObject=");
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
