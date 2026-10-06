package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class go {
    public final String a;
    public final String b;
    public final bu.g c;

    public go(String str, String str2, bu.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        return k71.k.b(this.a, goVar.a) && k71.k.b(this.b, goVar.b) && k71.k.b(this.c, goVar.c);
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
