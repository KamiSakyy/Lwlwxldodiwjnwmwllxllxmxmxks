package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final u0 i;
    public final v0 j;
    public final f1 k;
    public final p0 l;
    public final e1 m;
    public final t0 n;
    public final f0 o;

    public h1(String str, String str2, String str3, boolean z, String str4, String str5, int i, int i2, u0 u0Var, v0 v0Var, f1 f1Var, p0 p0Var, e1 e1Var, t0 t0Var, f0 f0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = i2;
        this.i = u0Var;
        this.j = v0Var;
        this.k = f1Var;
        this.l = p0Var;
        this.m = e1Var;
        this.n = t0Var;
        this.o = f0Var;
    }

    public static h1 a(h1 h1Var, p0 p0Var, t0 t0Var, int i) {
        return new h1(h1Var.a, h1Var.b, h1Var.c, h1Var.d, h1Var.e, h1Var.f, h1Var.g, h1Var.h, h1Var.i, h1Var.j, h1Var.k, (i & 2048) != 0 ? h1Var.l : p0Var, h1Var.m, (i & 8192) != 0 ? h1Var.n : t0Var, h1Var.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return k71.k.b(this.a, h1Var.a) && k71.k.b(this.b, h1Var.b) && k71.k.b(this.c, h1Var.c) && this.d == h1Var.d && k71.k.b(this.e, h1Var.e) && k71.k.b(this.f, h1Var.f) && this.g == h1Var.g && this.h == h1Var.h && k71.k.b(this.i, h1Var.i) && k71.k.b(this.j, h1Var.j) && k71.k.b(this.k, h1Var.k) && k71.k.b(this.l, h1Var.l) && k71.k.b(this.m, h1Var.m) && k71.k.b(this.n, h1Var.n) && k71.k.b(this.o, h1Var.o);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.h, a0.s0.b(this.g, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), this.e, 31), this.f, 31), 31), 31);
        u0 u0Var = this.i;
        int hashCode = (b + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        v0 v0Var = this.j;
        int hashCode2 = (this.k.hashCode() + ((hashCode + (v0Var == null ? 0 : v0Var.hashCode())) * 31)) * 31;
        p0 p0Var = this.l;
        int hashCode3 = (hashCode2 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        e1 e1Var = this.m;
        int hashCode4 = (hashCode3 + (e1Var == null ? 0 : e1Var.hashCode())) * 31;
        t0 t0Var = this.n;
        return this.o.hashCode() + ((hashCode4 + (t0Var != null ? t0Var.hashCode() : 0)) * 31);
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

    public Object e;
    public static final Object i = null;
}
