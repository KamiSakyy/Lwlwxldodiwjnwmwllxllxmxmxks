package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sy {
    public String a;
    public String b;
    public ty c;

    public sy(String str, String str2, ty tyVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = tyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy)) {
            return false;
        }
        sy syVar = (sy) obj;
        return k71.k.b(this.a, syVar.a) && k71.k.b(this.b, syVar.b) && k71.k.b(this.c, syVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ty tyVar = this.c;
        return i + (tyVar == null ? 0 : tyVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
