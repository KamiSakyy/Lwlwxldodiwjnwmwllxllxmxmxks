package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public final c0 a;
    public final int b;
    public final String c;
    public final String d;

    public t(c0 c0Var, int i, String str, String str2) {
        this.a = c0Var;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && this.b == tVar.b && k71.k.b(this.c, tVar.c) && k71.k.b(this.d, tVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest1(repository=");
        sb.append(this.a);
        sb.append(", number=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
