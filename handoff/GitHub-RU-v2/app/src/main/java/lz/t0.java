package lz;

import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 {
    public String a;
    public w0 b;
    public vx.a c;

    public t0(String str, w0 w0Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = w0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.a, t0Var.a) && k71.k.b(this.b, t0Var.b) && k71.k.b(this.c, t0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w0 w0Var = this.b;
        int hashCode2 = (hashCode + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("List(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
