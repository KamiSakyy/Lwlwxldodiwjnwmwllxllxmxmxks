package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vw {
    public final String a;
    public final String b;
    public final ww c;

    public vw(String str, String str2, ww wwVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = wwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw)) {
            return false;
        }
        vw vwVar = (vw) obj;
        return k71.k.b(this.a, vwVar.a) && k71.k.b(this.b, vwVar.b) && k71.k.b(this.c, vwVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ww wwVar = this.c;
        return i + (wwVar == null ? 0 : wwVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
