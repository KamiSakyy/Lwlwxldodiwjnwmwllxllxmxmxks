package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final String a;
    public final String b;
    public final h c;
    public final i d;
    public final g20.m1 e;

    public g(String str, String str2, h hVar, i iVar, g20.m1 m1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = hVar;
        this.d = iVar;
        this.e = m1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c) && k71.k.b(this.d, gVar.d) && k71.k.b(this.e, gVar.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        h hVar = this.c;
        int hashCode = (i + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.d;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        g20.m1 m1Var = this.e;
        return hashCode2 + (m1Var != null ? m1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCheckRun=");
        o.append(this.c);
        o.append(", onRequiredStatusCheck=");
        o.append(this.d);
        o.append(", statusContextFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
