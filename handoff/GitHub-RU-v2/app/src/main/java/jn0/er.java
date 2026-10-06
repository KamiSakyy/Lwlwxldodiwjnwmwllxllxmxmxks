package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class er {
    public jr a;
    public String b;
    public String c;

    public er(jr jrVar, String str, String str2) {
        this.a = jrVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er)) {
            return false;
        }
        er erVar = (er) obj;
        return k71.k.b(this.a, erVar.a) && k71.k.b(this.b, erVar.b) && k71.k.b(this.c, erVar.c);
    }

    public final int hashCode() {
        jr jrVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((jrVar == null ? 0 : jrVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(user=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
