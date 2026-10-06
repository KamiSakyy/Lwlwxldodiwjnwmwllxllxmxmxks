package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xn {
    public final String a;
    public final un b;
    public final String c;

    public xn(String str, un unVar, String str2) {
        this.a = str;
        this.b = unVar;
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
        int hashCode = this.a.hashCode() * 31;
        un unVar = this.b;
        return this.c.hashCode() + ((hashCode + (unVar == null ? 0 : unVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ref(id=");
        sb.append(this.a);
        sb.append(", compare=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
