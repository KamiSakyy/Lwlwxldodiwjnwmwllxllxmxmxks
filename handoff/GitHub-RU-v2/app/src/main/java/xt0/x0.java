package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final k0 i;
    public final l0 j;
    public final v0 k;
    public final f0 l;
    public final u0 m;
    public final j0 n;
    public final v o;

    public x0(String str, String str2, String str3, boolean z, String str4, String str5, int i, int i2, k0 k0Var, l0 l0Var, v0 v0Var, f0 f0Var, u0 u0Var, j0 j0Var, v vVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = i2;
        this.i = k0Var;
        this.j = l0Var;
        this.k = v0Var;
        this.l = f0Var;
        this.m = u0Var;
        this.n = j0Var;
        this.o = vVar;
    }

    public static x0 a(x0 x0Var, f0 f0Var, j0 j0Var, int i) {
        return new x0(x0Var.a, x0Var.b, x0Var.c, x0Var.d, x0Var.e, x0Var.f, x0Var.g, x0Var.h, x0Var.i, x0Var.j, x0Var.k, (i & 2048) != 0 ? x0Var.l : f0Var, x0Var.m, (i & 8192) != 0 ? x0Var.n : j0Var, x0Var.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b) && k71.k.b(this.c, x0Var.c) && this.d == x0Var.d && k71.k.b(this.e, x0Var.e) && k71.k.b(this.f, x0Var.f) && this.g == x0Var.g && this.h == x0Var.h && k71.k.b(this.i, x0Var.i) && k71.k.b(this.j, x0Var.j) && k71.k.b(this.k, x0Var.k) && k71.k.b(this.l, x0Var.l) && k71.k.b(this.m, x0Var.m) && k71.k.b(this.n, x0Var.n) && k71.k.b(this.o, x0Var.o);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.h, a0.s0.b(this.g, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), this.e, 31), this.f, 31), 31), 31);
        k0 k0Var = this.i;
        int hashCode = (b + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        l0 l0Var = this.j;
        int hashCode2 = (this.k.hashCode() + ((hashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31)) * 31;
        f0 f0Var = this.l;
        int hashCode3 = (hashCode2 + (f0Var == null ? 0 : f0Var.a.hashCode())) * 31;
        u0 u0Var = this.m;
        int hashCode4 = (hashCode3 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        j0 j0Var = this.n;
        return this.o.hashCode() + ((hashCode4 + (j0Var != null ? j0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("FilesPullRequestFragment(__typename=", this.a, ", id=", this.b, ", headRefOid=");
        com.github.rudroid.m0.x(o, this.c, ", viewerCanEditFiles=", this.d, ", baseRefName=");
        f1.e.x(o, this.e, ", headRefName=", this.f, ", additions=");
        a0.s0.z(o, this.g, ", deletions=", this.h, ", headRepository=");
        o.append(this.i);
        o.append(", headRepositoryOwner=");
        o.append(this.j);
        o.append(", repository=");
        o.append(this.k);
        o.append(", diff=");
        o.append(this.l);
        o.append(", pendingReviews=");
        o.append(this.m);
        o.append(", files=");
        o.append(this.n);
        o.append(", filesChangedReviewThreadFragment=");
        o.append(this.o);
        o.append(")");
        return o.toString();
    }
}
