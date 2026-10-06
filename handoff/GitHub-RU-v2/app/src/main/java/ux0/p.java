package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements aa.v0 {
    public q a;
    public String b;
    public String c;

    public p(q qVar, String str, String str2) {
        this.a = qVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b) && k71.k.b(this.c, pVar.c);
    }

    public final int hashCode() {
        q qVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((qVar == null ? 0 : qVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(organization=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
