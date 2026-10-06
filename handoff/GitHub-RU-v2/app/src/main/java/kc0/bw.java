package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bw {
    public final String a;
    public final String b;
    public final mj0.c c;

    public bw(String str, String str2, mj0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return k71.k.b(this.a, bwVar.a) && k71.k.b(this.b, bwVar.b) && k71.k.b(this.c, bwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DefaultBranchRef(__typename=", this.a, ", id=", this.b, ", repoBranchFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
