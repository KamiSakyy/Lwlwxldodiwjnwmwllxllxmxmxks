package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tp {
    public final qp a;
    public final String b;
    public final String c;

    public tp(qp qpVar, String str, String str2) {
        this.a = qpVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) obj;
        return k71.k.b(this.a, tpVar.a) && k71.k.b(this.b, tpVar.b) && k71.k.b(this.c, tpVar.c);
    }

    public final int hashCode() {
        qp qpVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((qpVar == null ? 0 : qpVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationDiscussionsRepository(discussion=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
