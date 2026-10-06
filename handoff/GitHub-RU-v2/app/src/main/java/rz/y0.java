package rz;

import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 {
    public String a;
    public z0 b;
    public vx.a c;

    public y0(String str, z0 z0Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = z0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && k71.k.b(this.b, y0Var.b) && k71.k.b(this.c, y0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z0 z0Var = this.b;
        int hashCode2 = (hashCode + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnProjectV2Owner(__typename=");
        sb.append(this.a);
        sb.append(", projectV2=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
