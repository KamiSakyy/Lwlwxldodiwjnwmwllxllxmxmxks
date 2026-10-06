package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ts {
    public String a;
    public String b;
    public sd0.h0 c;

    public ts(String str, String str2, sd0.h0 h0Var) {
        this.a = str;
        this.b = str2;
        this.c = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts)) {
            return false;
        }
        ts tsVar = (ts) obj;
        return k71.k.b(this.a, tsVar.a) && k71.k.b(this.b, tsVar.b) && k71.k.b(this.c, tsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repoFileFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
