package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e5 {
    public String a;
    public pz0.gu b;
    public boolean c;
    public boolean d;
    public String e;

    public e5(String str, pz0.gu guVar, boolean z, boolean z2, String str2) {
        this.a = str;
        this.b = guVar;
        this.c = z;
        this.d = z2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return k71.k.b(this.a, e5Var.a) && this.b == e5Var.b && this.c == e5Var.c && this.d == e5Var.d && k71.k.b(this.e, e5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + x.i.e(x.i.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", viewerCanReopen=");
        com.github.rudroid.m0.A(sb, this.c, ", viewerCanDeleteHeadRef=", this.d, ", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
