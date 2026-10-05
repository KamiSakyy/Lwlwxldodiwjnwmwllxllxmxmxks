package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lg implements aa.v0 {
    public final qg a;
    public final String b;
    public final String c;

    public lg(qg qgVar, String str, String str2) {
        this.a = qgVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg)) {
            return false;
        }
        lg lgVar = (lg) obj;
        return k71.k.b(this.a, lgVar.a) && k71.k.b(this.b, lgVar.b) && k71.k.b(this.c, lgVar.c);
    }

    public final int hashCode() {
        qg qgVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((qgVar == null ? 0 : qgVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
