package r81;

import com.google.android.gms.internal.measurement.z3;
import k71.k;
import s71.j;
import v8.l0;
import x61.m;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b extends z3 {
    public k71.e b;
    public Object c;
    public z3 d;

    public b(k71.e eVar, Object obj, z3 z3Var) {
        k.g(obj, "value");
        k.g(z3Var, "next");
        this.b = eVar;
        this.c = obj;
        this.d = z3Var;
    }

    public final z3 D(k71.e eVar, Object obj) {
        k71.e eVar2 = this.b;
        boolean equals = eVar.equals(eVar2);
        z3 z3Var = this.d;
        if (!equals) {
            z3 D = z3Var.D(eVar, (Object) null);
            z3Var = D == z3Var ? this : new b(eVar2, this.c, D);
        }
        return obj != null ? new b(eVar, obj, z3Var) : z3Var;
    }

    public final Object p(k71.e eVar) {
        return eVar.equals(this.b) ? l0.x(eVar).cast(this.c) : this.d.p(eVar);
    }

    public final String toString() {
        return m.c0(m.r0(j.l0(j.h0(this, new q00.c(17)))), (String) null, "{", "}", 0, new q00.c(18), 25);
    }
}
