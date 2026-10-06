package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ta {
    public final String a;
    public final String b;
    public final gv.o c;

    public ta(String str, String str2, gv.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        return k71.k.b(this.a, taVar.a) && k71.k.b(this.b, taVar.b) && k71.k.b(this.c, taVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node3(__typename=", this.a, ", id=", this.b, ", deploymentReviewAssociatedPr=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
