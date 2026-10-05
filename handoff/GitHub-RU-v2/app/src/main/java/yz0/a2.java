package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a2 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final h2 e;

    public a2(int i, int i2, int i3, boolean z, h2 h2Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = h2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return this.a == a2Var.a && this.b == a2Var.b && this.c == a2Var.c && this.d == a2Var.d && k71.k.b(this.e, a2Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(a0.s0.b(this.c, a0.s0.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
        h2 h2Var = this.e;
        return e + (h2Var == null ? 0 : h2Var.hashCode());
    }

    public final String toString() {
        StringBuilder m = x.i.m(this.a, this.b, "FilesChangedOverview(changedFiles=", ", additions=", ", deletions=");
        com.github.rudroid.m0.w(m, this.c, ", viewerIsRequestedAsReviewer=", this.d, ", viewerLatestReview=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
