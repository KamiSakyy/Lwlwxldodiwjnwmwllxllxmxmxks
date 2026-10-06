package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public a0 a;
    public int b;
    public String c;
    public String d;

    public k(a0 a0Var, int i, String str, String str2) {
        this.a = a0Var;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && this.b == kVar.b && k71.k.b(this.c, kVar.c) && k71.k.b(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnPullRequest(repository=");
        sb.append(this.a);
        sb.append(", number=");
        sb.append(this.b);
        sb.append(", url=");
        return x.i.k(sb, this.c, ", id=", this.d, ")");
    }
}
