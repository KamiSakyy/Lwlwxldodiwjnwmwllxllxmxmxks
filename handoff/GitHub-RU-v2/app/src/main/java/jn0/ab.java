package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ab {
    public String a;
    public xa b;
    public String c;

    public ab(String str, xa xaVar, String str2) {
        this.a = str;
        this.b = xaVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return k71.k.b(this.a, abVar.a) && k71.k.b(this.b, abVar.b) && k71.k.b(this.c, abVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xa xaVar = this.b;
        return this.c.hashCode() + ((hashCode + (xaVar == null ? 0 : xaVar.hashCode())) * 31);
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
