package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xb {
    public String a;
    public ub b;
    public String c;

    public xb(String str, ub ubVar, String str2) {
        this.a = str;
        this.b = ubVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb)) {
            return false;
        }
        xb xbVar = (xb) obj;
        return k71.k.b(this.a, xbVar.a) && k71.k.b(this.b, xbVar.b) && k71.k.b(this.c, xbVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ub ubVar = this.b;
        return this.c.hashCode() + ((hashCode + (ubVar == null ? 0 : ubVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Discussion(id=");
        sb.append(this.a);
        sb.append(", comment=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
