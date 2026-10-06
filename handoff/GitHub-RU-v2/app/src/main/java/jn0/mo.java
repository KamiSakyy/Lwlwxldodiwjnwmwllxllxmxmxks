package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mo {
    public oo a;
    public String b;
    public String c;

    public mo(oo ooVar, String str, String str2) {
        this.a = ooVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo)) {
            return false;
        }
        mo moVar = (mo) obj;
        return k71.k.b(this.a, moVar.a) && k71.k.b(this.b, moVar.b) && k71.k.b(this.c, moVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Organization(teams=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
