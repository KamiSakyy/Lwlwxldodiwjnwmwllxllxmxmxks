package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ve implements aa.v0 {
    public final cf a;
    public final String b;
    public final String c;

    public ve(cf cfVar, String str, String str2) {
        this.a = cfVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        return k71.k.b(this.a, veVar.a) && k71.k.b(this.b, veVar.b) && k71.k.b(this.c, veVar.c);
    }

    public final int hashCode() {
        cf cfVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((cfVar == null ? 0 : cfVar.hashCode()) * 31, this.b, 31);
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
