package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s70 {
    public String a;
    public String b;
    public ih0.g c;

    public s70(String str, String str2, ih0.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s70)) {
            return false;
        }
        s70 s70Var = (s70) obj;
        return k71.k.b(this.a, s70Var.a) && k71.k.b(this.b, s70Var.b) && k71.k.b(this.c, s70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("MergeQueueEntry(__typename=", this.a, ", id=", this.b, ", mergeQueueEntryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
