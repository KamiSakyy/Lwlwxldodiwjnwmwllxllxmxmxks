package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i2 {
    public final String a;
    public final String b;
    public final ih0.m c;

    public i2(String str, String str2, ih0.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return k71.k.b(this.a, i2Var.a) && k71.k.b(this.b, i2Var.b) && k71.k.b(this.c, i2Var.c);
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
