package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lc implements aa.v0 {
    public final nc a;
    public final String b;
    public final String c;

    public lc(nc ncVar, String str, String str2) {
        this.a = ncVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj;
        return k71.k.b(this.a, lcVar.a) && k71.k.b(this.b, lcVar.b) && k71.k.b(this.c, lcVar.c);
    }

    public final int hashCode() {
        nc ncVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ncVar == null ? 0 : ncVar.hashCode()) * 31, this.b, 31);
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
