package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z6 {
    public final String a;
    public final a7 b;
    public final int c;
    public final String d;
    public final String e;

    public z6(String str, a7 a7Var, int i, String str2, String str3) {
        this.a = str;
        this.b = a7Var;
        this.c = i;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return k71.k.b(this.a, z6Var.a) && k71.k.b(this.b, z6Var.b) && this.c == z6Var.c && k71.k.b(this.d, z6Var.d) && k71.k.b(this.e, z6Var.e);
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
