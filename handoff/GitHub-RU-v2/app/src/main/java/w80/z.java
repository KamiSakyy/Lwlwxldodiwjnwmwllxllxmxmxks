package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements aa.h0 {
    public String a;
    public String b;
    public xShadow c;
    public g70.a d;

    public z(String str, String str2, xShadow xVar, g70.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = xVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.a, zVar.a) && k71.k.b(this.b, zVar.b) && k71.k.b(this.c, zVar.c) && k71.k.b(this.d, zVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        xShadow xVar = this.c;
        return this.d.hashCode() + ((i + (xVar == null ? 0 : xVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OrgBlockablePullRequestFragment(__typename=", this.a, ", id=", this.b, ", author=");
        o.append(this.c);
        o.append(", orgBlockableFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
