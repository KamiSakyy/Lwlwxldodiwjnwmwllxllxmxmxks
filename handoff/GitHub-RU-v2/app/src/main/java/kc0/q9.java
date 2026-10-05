package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q9 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final m9 d;
    public final String e;

    public q9(String str, boolean z, boolean z2, m9 m9Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = m9Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9)) {
            return false;
        }
        q9 q9Var = (q9) obj;
        return k71.k.b(this.a, q9Var.a) && this.b == q9Var.b && this.c == q9Var.c && k71.k.b(this.d, q9Var.d) && k71.k.b(this.e, q9Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        m9 m9Var = this.d;
        return this.e.hashCode() + ((e + (m9Var == null ? 0 : m9Var.a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("PullRequest(id=", this.a, ", viewerCanEnableAutoMerge=", ", viewerCanDisableAutoMerge=", this.b);
        o.append(this.c);
        o.append(", autoMergeRequest=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
