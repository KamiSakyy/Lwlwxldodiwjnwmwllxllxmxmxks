package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ts {
    public final String a;
    public final String b;
    public final is c;

    public ts(String str, String str2, is isVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = isVar;
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
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        is isVar = this.c;
        return i + (isVar == null ? 0 : isVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target1(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
