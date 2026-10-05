package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pn implements aa.v0 {
    public final rn a;
    public final String b;
    public final String c;

    public pn(rn rnVar, String str, String str2) {
        this.a = rnVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn)) {
            return false;
        }
        pn pnVar = (pn) obj;
        return k71.k.b(this.a, pnVar.a) && k71.k.b(this.b, pnVar.b) && k71.k.b(this.c, pnVar.c);
    }

    public final int hashCode() {
        rn rnVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((rnVar == null ? 0 : rnVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(organization=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
