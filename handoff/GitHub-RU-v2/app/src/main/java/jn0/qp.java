package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qp {
    public final String a;
    public final pp b;
    public final String c;

    public qp(String str, pp ppVar, String str2) {
        this.a = str;
        this.b = ppVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp)) {
            return false;
        }
        qp qpVar = (qp) obj;
        return k71.k.b(this.a, qpVar.a) && k71.k.b(this.b, qpVar.b) && k71.k.b(this.c, qpVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pp ppVar = this.b;
        return this.c.hashCode() + ((hashCode + (ppVar == null ? 0 : ppVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", ref=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
