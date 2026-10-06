package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class np implements aaShadow.v0 {
    public qp a;
    public String b;
    public String c;

    public np(qp qpVar, String str, String str2) {
        this.a = qpVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np)) {
            return false;
        }
        np npVar = (np) obj;
        return k71.k.b(this.a, npVar.a) && k71.k.b(this.b, npVar.b) && k71.k.b(this.c, npVar.c);
    }

    public final int hashCode() {
        qp qpVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((qpVar == null ? 0 : qpVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
