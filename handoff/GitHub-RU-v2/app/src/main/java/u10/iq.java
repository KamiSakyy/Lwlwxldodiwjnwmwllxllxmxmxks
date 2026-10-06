package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class iq {
    public hq a;
    public String b;
    public String c;

    public iq(hq hqVar, String str, String str2) {
        this.a = hqVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq)) {
            return false;
        }
        iq iqVar = (iq) obj;
        return k71.k.b(this.a, iqVar.a) && k71.k.b(this.b, iqVar.b) && k71.k.b(this.c, iqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Reaction(reactable=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
