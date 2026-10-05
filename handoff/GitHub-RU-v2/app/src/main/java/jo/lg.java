package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lg implements aa.v0 {
    public final pg a;
    public final String b;
    public final String c;

    public lg(pg pgVar, String str, String str2) {
        this.a = pgVar;
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
        pg pgVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((pgVar == null ? 0 : pgVar.hashCode()) * 31, this.b, 31);
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
