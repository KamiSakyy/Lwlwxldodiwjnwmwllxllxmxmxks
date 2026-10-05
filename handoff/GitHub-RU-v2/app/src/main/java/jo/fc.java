package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fc {
    public final String a;
    public final String b;
    public final gc c;
    public final ms.d0 d;

    public fc(String str, String str2, gc gcVar, ms.d0 d0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = gcVar;
        this.d = d0Var;
    }

    public static fc a(fc fcVar, ms.d0 d0Var) {
        String str = fcVar.a;
        String str2 = fcVar.b;
        gc gcVar = fcVar.c;
        fcVar.getClass();
        k71.k.g(str, "__typename");
        return new fc(str, str2, gcVar, d0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        return k71.k.b(this.a, fcVar.a) && k71.k.b(this.b, fcVar.b) && k71.k.b(this.c, fcVar.c) && k71.k.b(this.d, fcVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        gc gcVar = this.c;
        int hashCode = (i + (gcVar == null ? 0 : gcVar.hashCode())) * 31;
        ms.d0 d0Var = this.d;
        return hashCode + (d0Var != null ? d0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onDiscussionComment=");
        o.append(this.c);
        o.append(", discussionSubThreadHeadFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
