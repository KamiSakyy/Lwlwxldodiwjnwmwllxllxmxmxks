package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q60 {
    public final String a;
    public final String b;
    public final e80.l c;

    public q60(String str, String str2, e80.l lVar) {
        this.a = str;
        this.b = str2;
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q60)) {
            return false;
        }
        q60 q60Var = (q60) obj;
        return k71.k.b(this.a, q60Var.a) && k71.k.b(this.b, q60Var.b) && k71.k.b(this.c, q60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", reviewFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }







}
