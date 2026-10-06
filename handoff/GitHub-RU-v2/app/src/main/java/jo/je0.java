package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class je0 {
    public String a;
    public String b;
    public bu.m c;

    public je0(String str, String str2, bu.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je0)) {
            return false;
        }
        je0 je0Var = (je0) obj;
        return k71.k.b(this.a, je0Var.a) && k71.k.b(this.b, je0Var.b) && k71.k.b(this.c, je0Var.c);
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
    public je0(String p1, String p2, Object p3) {
    }
}
