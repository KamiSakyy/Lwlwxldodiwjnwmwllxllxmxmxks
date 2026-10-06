package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nd implements aaShadow.v0 {
    public rd a;
    public String b;
    public String c;

    public nd(rd rdVar, String str, String str2) {
        this.a = rdVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd)) {
            return false;
        }
        nd ndVar = (nd) obj;
        return k71.k.b(this.a, ndVar.a) && k71.k.b(this.b, ndVar.b) && k71.k.b(this.c, ndVar.c);
    }

    public final int hashCode() {
        rd rdVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((rdVar == null ? 0 : rdVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(topic=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
