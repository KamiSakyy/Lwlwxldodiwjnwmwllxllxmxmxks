package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vj {
    public String a;
    public String b;
    public ak c;
    public vx.a d;

    public vj(String str, String str2, ak akVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = akVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        return k71.k.b(this.a, vjVar.a) && k71.k.b(this.b, vjVar.b) && k71.k.b(this.c, vjVar.c) && k71.k.b(this.d, vjVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ak akVar = this.c;
        int hashCode = (i + (akVar == null ? 0 : akVar.hashCode())) * 31;
        vx.a aVar = this.d;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Actor(__typename=", this.a, ", login=", this.b, ", onBot=");
        o.append(this.c);
        o.append(", nodeIdFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
