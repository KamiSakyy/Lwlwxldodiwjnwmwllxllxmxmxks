package l01;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s0 {
    public l0 a;
    public ArrayList b;
    public t0 c;

    public s0(l0 l0Var, ArrayList arrayList, t0 t0Var) {
        k71.k.g(l0Var, "defaultView");
        this.a = l0Var;
        this.b = arrayList;
        this.c = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && this.b.equals(s0Var.b) && this.c.equals(s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ProjectViewsInfo(defaultView=" + this.a + ", projectViews=" + this.b + ", projectWithFields=" + this.c + ")";
    }
}
