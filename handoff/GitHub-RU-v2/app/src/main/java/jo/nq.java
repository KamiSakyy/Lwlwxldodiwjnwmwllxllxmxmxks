package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nq {
    public lq a;
    public String b;
    public String c;

    public nq(lq lqVar, String str, String str2) {
        this.a = lqVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq)) {
            return false;
        }
        nq nqVar = (nq) obj;
        return k71.k.b(this.a, nqVar.a) && k71.k.b(this.b, nqVar.b) && k71.k.b(this.c, nqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(organizations=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
