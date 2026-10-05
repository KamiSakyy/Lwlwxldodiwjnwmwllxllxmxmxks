package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wn {
    public final String a;
    public final String b;
    public final we0.e1 c;

    public wn(String str, String str2, we0.e1 e1Var) {
        this.a = str;
        this.b = str2;
        this.c = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn)) {
            return false;
        }
        wn wnVar = (wn) obj;
        return k71.k.b(this.a, wnVar.a) && k71.k.b(this.b, wnVar.b) && k71.k.b(this.c, wnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", commitDiffEntryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
