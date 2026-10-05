package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public final String a;
    public final String b;
    public final r c;

    public q(String str, String str2, r rVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        r rVar = this.c;
        return i + (rVar == null ? 0 : rVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Author(__typename=", this.a, ", login=", this.b, ", onNode=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
