package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class um {
    public final String a;
    public final String b;
    public final ss0.g c;

    public um(String str, String str2, ss0.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um)) {
            return false;
        }
        um umVar = (um) obj;
        return k71.k.b(this.a, umVar.a) && k71.k.b(this.b, umVar.b) && k71.k.b(this.c, umVar.c);
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
