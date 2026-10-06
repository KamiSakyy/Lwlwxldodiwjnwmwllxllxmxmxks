package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public String a;
    public n b;
    public String c;

    public q(String str, n nVar, String str2) {
        this.a = str;
        this.b = nVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Discussion(id=");
        sb.append(this.a);
        sb.append(", comments=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
