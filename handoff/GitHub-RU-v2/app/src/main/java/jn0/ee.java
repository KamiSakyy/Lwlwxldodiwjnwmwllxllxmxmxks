package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ee {
    public ge a;
    public String b;
    public String c;

    public ee(ge geVar, String str, String str2) {
        this.a = geVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee)) {
            return false;
        }
        ee eeVar = (ee) obj;
        return k71.k.b(this.a, eeVar.a) && k71.k.b(this.b, eeVar.b) && k71.k.b(this.c, eeVar.c);
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
