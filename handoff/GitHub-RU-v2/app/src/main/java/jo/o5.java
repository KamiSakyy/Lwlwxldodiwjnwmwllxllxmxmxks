package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o5 {
    public final String a;
    public final m10.b00 b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public o5(String str, m10.b00 b00Var, boolean z, boolean z2, String str2) {
        this.a = str;
        this.b = b00Var;
        this.c = z;
        this.d = z2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return k71.k.b(this.a, o5Var.a) && this.b == o5Var.b && this.c == o5Var.c && this.d == o5Var.d && k71.k.b(this.e, o5Var.e);
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
