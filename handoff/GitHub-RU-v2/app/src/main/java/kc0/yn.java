package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yn {
    public String a;
    public xn b;
    public String c;

    public yn(String str, xn xnVar, String str2) {
        this.a = str;
        this.b = xnVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) obj;
        return k71.k.b(this.a, ynVar.a) && k71.k.b(this.b, ynVar.b) && k71.k.b(this.c, ynVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xn xnVar = this.b;
        return this.c.hashCode() + ((hashCode + (xnVar == null ? 0 : xnVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", ref=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
