package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rd {
    public String a;
    public qd b;
    public String c;

    public rd(String str, qd qdVar, String str2) {
        this.a = str;
        this.b = qdVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd)) {
            return false;
        }
        rd rdVar = (rd) obj;
        return k71.k.b(this.a, rdVar.a) && k71.k.b(this.b, rdVar.b) && k71.k.b(this.c, rdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Topic(id=");
        sb.append(this.a);
        sb.append(", repositories=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
