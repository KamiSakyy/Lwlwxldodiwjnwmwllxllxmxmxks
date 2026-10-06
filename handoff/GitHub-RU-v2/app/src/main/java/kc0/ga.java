package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ga {
    public String a;
    public da b;
    public String c;

    public ga(String str, da daVar, String str2) {
        this.a = str;
        this.b = daVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj;
        return k71.k.b(this.a, gaVar.a) && k71.k.b(this.b, gaVar.b) && k71.k.b(this.c, gaVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        da daVar = this.b;
        return this.c.hashCode() + ((hashCode + (daVar == null ? 0 : daVar.hashCode())) * 31);
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
