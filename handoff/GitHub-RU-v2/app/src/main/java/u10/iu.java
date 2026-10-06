package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class iu {
    public cu a;
    public String b;
    public String c;

    public iu(cu cuVar, String str, String str2) {
        this.a = cuVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu)) {
            return false;
        }
        iu iuVar = (iu) obj;
        return k71.k.b(this.a, iuVar.a) && k71.k.b(this.b, iuVar.b) && k71.k.b(this.c, iuVar.c);
    }

    public final int hashCode() {
        cu cuVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((cuVar == null ? 0 : cuVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequest(author=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
