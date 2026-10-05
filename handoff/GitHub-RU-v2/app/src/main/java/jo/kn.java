package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kn {
    public final String a;
    public final String b;
    public final ln c;

    public kn(String str, String str2, ln lnVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = lnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj;
        return k71.k.b(this.a, knVar.a) && k71.k.b(this.b, knVar.b) && k71.k.b(this.c, knVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ln lnVar = this.c;
        return i + (lnVar == null ? 0 : lnVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
