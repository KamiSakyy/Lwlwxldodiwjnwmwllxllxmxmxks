package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final j0 i;
    public final k0 j;
    public final u0 k;
    public final e0 l;
    public final t0 m;
    public final i0 n;
    public final v o;

    public w0(String str, String str2, String str3, boolean z, String str4, String str5, int i, int i2, j0 j0Var, k0 k0Var, u0 u0Var, e0 e0Var, t0 t0Var, i0 i0Var, v vVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = i2;
        this.i = j0Var;
        this.j = k0Var;
        this.k = u0Var;
        this.l = e0Var;
        this.m = t0Var;
        this.n = i0Var;
        this.o = vVar;
    }

    public static w0 a(w0 w0Var, e0 e0Var, i0 i0Var, int i) {
        return new w0(w0Var.a, w0Var.b, w0Var.c, w0Var.d, w0Var.e, w0Var.f, w0Var.g, w0Var.h, w0Var.i, w0Var.j, w0Var.k, (i & 2048) != 0 ? w0Var.l : e0Var, w0Var.m, (i & 8192) != 0 ? w0Var.n : i0Var, w0Var.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return k71.k.b(this.a, w0Var.a) && k71.k.b(this.b, w0Var.b) && k71.k.b(this.c, w0Var.c) && this.d == w0Var.d && k71.k.b(this.e, w0Var.e) && k71.k.b(this.f, w0Var.f) && this.g == w0Var.g && this.h == w0Var.h && k71.k.b(this.i, w0Var.i) && k71.k.b(this.j, w0Var.j) && k71.k.b(this.k, w0Var.k) && k71.k.b(this.l, w0Var.l) && k71.k.b(this.m, w0Var.m) && k71.k.b(this.n, w0Var.n) && k71.k.b(this.o, w0Var.o);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.h, a0.s0.b(this.g, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), this.e, 31), this.f, 31), 31), 31);
        j0 j0Var = this.i;
        int hashCode = (b + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        k0 k0Var = this.j;
        int hashCode2 = (this.k.hashCode() + ((hashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31)) * 31;
        e0 e0Var = this.l;
        int hashCode3 = (hashCode2 + (e0Var == null ? 0 : e0Var.a.hashCode())) * 31;
        t0 t0Var = this.m;
        int hashCode4 = (hashCode3 + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        i0 i0Var = this.n;
        return this.o.hashCode() + ((hashCode4 + (i0Var != null ? i0Var.hashCode() : 0)) * 31);
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
}
