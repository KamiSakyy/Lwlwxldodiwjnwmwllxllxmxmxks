package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qp {
    public final String a;
    public final String b;
    public final rp c;

    public qp(String str, String str2, rp rpVar) {
        this.a = str;
        this.b = str2;
        this.c = rpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp)) {
            return false;
        }
        qp qpVar = (qp) obj;
        return k71.k.b(this.a, qpVar.a) && k71.k.b(this.b, qpVar.b) && k71.k.b(this.c, qpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", onDiscussion=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
