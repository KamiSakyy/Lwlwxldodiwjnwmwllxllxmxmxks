package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y30 {
    public final String a;
    public final String b;
    public final e50.x c;

    public y30(String str, String str2, e50.x xVar) {
        this.a = str;
        this.b = str2;
        this.c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y30)) {
            return false;
        }
        y30 y30Var = (y30) obj;
        return k71.k.b(this.a, y30Var.a) && k71.k.b(this.b, y30Var.b) && k71.k.b(this.c, y30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionDetailsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }







}
