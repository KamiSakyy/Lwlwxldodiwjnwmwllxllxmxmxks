package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class so {
    public String a;
    public String b;
    public kt0.q c;

    public so(String str, String str2, kt0.q qVar) {
        this.a = str;
        this.b = str2;
        this.c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so)) {
            return false;
        }
        so soVar = (so) obj;
        return k71.k.b(this.a, soVar.a) && k71.k.b(this.b, soVar.b) && k71.k.b(this.c, soVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", organizationListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
