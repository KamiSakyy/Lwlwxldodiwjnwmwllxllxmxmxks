package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tf implements aaShadow.v0 {
    public ag a;
    public String b;
    public String c;

    public tf(ag agVar, String str, String str2) {
        this.a = agVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf)) {
            return false;
        }
        tf tfVar = (tf) obj;
        return k71.k.b(this.a, tfVar.a) && k71.k.b(this.b, tfVar.b) && k71.k.b(this.c, tfVar.c);
    }

    public final int hashCode() {
        ag agVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((agVar == null ? 0 : agVar.hashCode()) * 31, this.b, 31);
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
