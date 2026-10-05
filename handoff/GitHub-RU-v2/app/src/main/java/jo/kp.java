package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kp {
    public final lp a;
    public final String b;
    public final String c;

    public kp(lp lpVar, String str, String str2) {
        this.a = lpVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp)) {
            return false;
        }
        kp kpVar = (kp) obj;
        return k71.k.b(this.a, kpVar.a) && k71.k.b(this.b, kpVar.b) && k71.k.b(this.c, kpVar.c);
    }

    public final int hashCode() {
        lp lpVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((lpVar == null ? 0 : lpVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Organization(organizationDiscussionsRepository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
