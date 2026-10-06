package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r70 {
    public final String a;
    public final String b;
    public final ih0.m c;

    public r70(String str, String str2, ih0.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r70)) {
            return false;
        }
        r70 r70Var = (r70) obj;
        return k71.k.b(this.a, r70Var.a) && k71.k.b(this.b, r70Var.b) && k71.k.b(this.c, r70Var.c);
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
