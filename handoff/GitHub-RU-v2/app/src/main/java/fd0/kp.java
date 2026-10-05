package fd0;

import java.util.List;
import kc0.d10;
import kc0.z00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kp implements aa.a {
    public static final kp a = new kp();
    public static final List b = sy.d0.o(new String[]{"shortcuts", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d10 d10Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                d10Var = (d10) aa.c.c(op.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (d10Var == null) {
            k41.b.B(eVar, "shortcuts");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new z00(d10Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z00 z00Var = (z00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z00Var, "value");
        fVar.z0("shortcuts");
        aa.c.c(op.a, false).b(fVar, wVar, z00Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z00Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z00Var.c);
    }
}
