package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r6 {
    public final String a;
    public final s6 b;
    public final int c;
    public final String d;
    public final String e;

    public r6(String str, s6 s6Var, int i, String str2, String str3) {
        this.a = str;
        this.b = s6Var;
        this.c = i;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return k71.k.b(this.a, r6Var.a) && k71.k.b(this.b, r6Var.b) && this.c == r6Var.c && k71.k.b(this.d, r6Var.d) && k71.k.b(this.e, r6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(id=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", number=");
        x.i.r(this.c, ", title=", this.d, ", __typename=", sb);
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
