package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sm {
    public String a;
    public String b;
    public g40.e1 c;

    public sm(String str, String str2, g40.e1 e1Var) {
        this.a = str;
        this.b = str2;
        this.c = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm)) {
            return false;
        }
        sm smVar = (sm) obj;
        return k71.k.b(this.a, smVar.a) && k71.k.b(this.b, smVar.b) && k71.k.b(this.c, smVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", commitDiffEntryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
