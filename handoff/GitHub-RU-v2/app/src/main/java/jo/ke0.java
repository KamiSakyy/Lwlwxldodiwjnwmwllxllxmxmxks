package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ke0 {
    public String a;
    public String b;
    public bu.g c;

    public ke0(String str, String str2, bu.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke0)) {
            return false;
        }
        ke0 ke0Var = (ke0) obj;
        return k71.k.b(this.a, ke0Var.a) && k71.k.b(this.b, ke0Var.b) && k71.k.b(this.c, ke0Var.c);
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
