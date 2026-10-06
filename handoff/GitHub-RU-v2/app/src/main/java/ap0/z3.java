package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z3 implements aa.h0 {
    public String a;
    public Integer b;
    public o3 c;
    public boolean d;
    public w3 e;
    public v3 f;
    public boolean g;
    public String h;

    public z3(String str, Integer num, o3 o3Var, boolean z, w3 w3Var, v3 v3Var, boolean z2, String str2) {
        this.a = str;
        this.b = num;
        this.c = o3Var;
        this.d = z;
        this.e = w3Var;
        this.f = v3Var;
        this.g = z2;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return k71.k.b(this.a, z3Var.a) && k71.k.b(this.b, z3Var.b) && k71.k.b(this.c, z3Var.c) && this.d == z3Var.d && k71.k.b(this.e, z3Var.e) && k71.k.b(this.f, z3Var.f) && this.g == z3Var.g && k71.k.b(this.h, z3Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        o3 o3Var = this.c;
        int e = x.i.e((hashCode2 + (o3Var == null ? 0 : o3Var.hashCode())) * 31, 31, this.d);
        w3 w3Var = this.e;
        return this.h.hashCode() + x.i.e((this.f.hashCode() + ((e + (w3Var != null ? w3Var.hashCode() : 0)) * 31)) * 31, 31, this.g);
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
