package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bf {
    public df a;
    public String b;
    public String c;

    public bf(df dfVar, String str, String str2) {
        this.a = dfVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        return k71.k.b(this.a, bfVar.a) && k71.k.b(this.b, bfVar.b) && k71.k.b(this.c, bfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dashboard(feed=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
