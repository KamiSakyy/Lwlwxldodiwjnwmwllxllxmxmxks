package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iu {
    public String a;
    public fu b;
    public String c;

    public iu(String str, fu fuVar, String str2) {
        this.a = str;
        this.b = fuVar;
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
        int hashCode = this.a.hashCode() * 31;
        fu fuVar = this.b;
        return this.c.hashCode() + ((hashCode + (fuVar == null ? 0 : fuVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubIssue(id=");
        sb.append(this.a);
        sb.append(", parent=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
