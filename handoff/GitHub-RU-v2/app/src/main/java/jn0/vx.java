package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vx {
    public final String a;
    public final String b;
    public final qu0.c c;

    public vx(String str, String str2, qu0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx)) {
            return false;
        }
        vx vxVar = (vx) obj;
        return k71.k.b(this.a, vxVar.a) && k71.k.b(this.b, vxVar.b) && k71.k.b(this.c, vxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", repoBranchFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
