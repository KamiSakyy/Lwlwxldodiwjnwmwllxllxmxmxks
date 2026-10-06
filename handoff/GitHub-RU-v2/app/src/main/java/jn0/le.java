package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class le {
    public ne a;
    public String b;
    public String c;

    public le(ne neVar, String str, String str2) {
        this.a = neVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le)) {
            return false;
        }
        le leVar = (le) obj;
        return k71.k.b(this.a, leVar.a) && k71.k.b(this.b, leVar.b) && k71.k.b(this.c, leVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dashboard(feed=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
