package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cf {
    public final String a;
    public final bf b;
    public final String c;

    public cf(String str, bf bfVar, String str2) {
        this.a = str;
        this.b = bfVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return k71.k.b(this.a, cfVar.a) && k71.k.b(this.b, cfVar.b) && k71.k.b(this.c, cfVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bf bfVar = this.b;
        return this.c.hashCode() + ((hashCode + (bfVar == null ? 0 : bfVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", repoObject=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
