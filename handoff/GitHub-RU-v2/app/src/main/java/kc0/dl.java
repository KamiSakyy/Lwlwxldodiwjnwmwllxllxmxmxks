package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dl {
    public final String a;
    public final String b;
    public final ih0.g c;

    public dl(String str, String str2, ih0.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        dl dlVar = (dl) obj;
        return k71.k.b(this.a, dlVar.a) && k71.k.b(this.b, dlVar.b) && k71.k.b(this.c, dlVar.c);
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
