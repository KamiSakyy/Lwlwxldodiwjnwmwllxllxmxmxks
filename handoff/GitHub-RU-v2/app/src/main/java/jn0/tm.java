package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tm {
    public String a;
    public String b;
    public ss0.m c;

    public tm(String str, String str2, ss0.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm)) {
            return false;
        }
        tm tmVar = (tm) obj;
        return k71.k.b(this.a, tmVar.a) && k71.k.b(this.b, tmVar.b) && k71.k.b(this.c, tmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("MergeQueue(__typename=", this.a, ", id=", this.b, ", mergeQueueFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
