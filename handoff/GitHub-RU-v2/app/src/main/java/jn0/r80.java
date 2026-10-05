package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r80 {
    public final int a;
    public final s80 b;
    public final String c;
    public final String d;

    public r80(int i, s80 s80Var, String str, String str2) {
        this.a = i;
        this.b = s80Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r80)) {
            return false;
        }
        r80 r80Var = (r80) obj;
        return this.a == r80Var.a && k71.k.b(this.b, r80Var.b) && k71.k.b(this.c, r80Var.c) && k71.k.b(this.d, r80Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(number=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
