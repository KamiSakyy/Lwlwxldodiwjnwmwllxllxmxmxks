package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public b0 a;
    public int b;
    public String c;
    public String d;

    public u(b0 b0Var, int i, String str, String str2) {
        this.a = b0Var;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && this.b == uVar.b && k71.k.b(this.c, uVar.c) && k71.k.b(this.d, uVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(repository=");
        sb.append(this.a);
        sb.append(", number=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
