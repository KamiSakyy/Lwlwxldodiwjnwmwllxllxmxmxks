package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y4 {
    public final String a;
    public final String b;
    public final ih0.m c;

    public y4(String str, String str2, ih0.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return k71.k.b(this.a, y4Var.a) && k71.k.b(this.b, y4Var.b) && k71.k.b(this.c, y4Var.c);
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
