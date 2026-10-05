package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jq implements aa.v0 {
    public final nq a;
    public final String b;
    public final String c;

    public jq(nq nqVar, String str, String str2) {
        this.a = nqVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq)) {
            return false;
        }
        jq jqVar = (jq) obj;
        return k71.k.b(this.a, jqVar.a) && k71.k.b(this.b, jqVar.b) && k71.k.b(this.c, jqVar.c);
    }

    public final int hashCode() {
        nq nqVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((nqVar == null ? 0 : nqVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(user=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
