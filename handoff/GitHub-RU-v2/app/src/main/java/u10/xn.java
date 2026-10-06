package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xn {
    public co a;
    public String b;
    public String c;

    public xn(co coVar, String str, String str2) {
        this.a = coVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn)) {
            return false;
        }
        xn xnVar = (xn) obj;
        return k71.k.b(this.a, xnVar.a) && k71.k.b(this.b, xnVar.b) && k71.k.b(this.c, xnVar.c);
    }

    public final int hashCode() {
        co coVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((coVar == null ? 0 : coVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(user=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
