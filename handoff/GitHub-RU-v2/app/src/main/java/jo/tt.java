package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tt {
    public final qt a;
    public final String b;
    public final String c;

    public tt(qt qtVar, String str, String str2) {
        this.a = qtVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt)) {
            return false;
        }
        tt ttVar = (tt) obj;
        return k71.k.b(this.a, ttVar.a) && k71.k.b(this.b, ttVar.b) && k71.k.b(this.c, ttVar.c);
    }

    public final int hashCode() {
        qt qtVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((qtVar == null ? 0 : qtVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Release(mentions=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
