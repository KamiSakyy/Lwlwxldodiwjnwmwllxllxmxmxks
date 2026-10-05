package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class up {
    public final tp a;
    public final String b;
    public final String c;

    public up(tp tpVar, String str, String str2) {
        this.a = tpVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up)) {
            return false;
        }
        up upVar = (up) obj;
        return k71.k.b(this.a, upVar.a) && k71.k.b(this.b, upVar.b) && k71.k.b(this.c, upVar.c);
    }

    public final int hashCode() {
        tp tpVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((tpVar == null ? 0 : tpVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(release=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
