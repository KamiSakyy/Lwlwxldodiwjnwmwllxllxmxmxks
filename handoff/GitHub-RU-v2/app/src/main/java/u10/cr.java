package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cr {
    public String a;
    public String b;
    public w50.i0 c;

    public cr(String str, String str2, w50.i0 i0Var) {
        k71.k.g(str, "__typename");
        k71.k.g(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr)) {
            return false;
        }
        cr crVar = (cr) obj;
        return k71.k.b(this.a, crVar.a) && k71.k.b(this.b, crVar.b) && k71.k.b(this.c, crVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", updateIssueStateFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
