package fd0;

import java.util.List;
import kc0.e10;
import kc0.z00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pp implements aaShadow.a {
    public static final pp a = new pp();
    public static final List b = sy.d0Shadow.o(new String[]{"dashboard", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        z00 z00Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                z00Var = (z00) aa.c.b(aa.c.c(kp.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new e10(z00Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e10 e10Var = (e10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e10Var, "value");
        fVar.z0("dashboard");
        aa.c.b(aa.c.c(kp.a, false)).b(fVar, wVar, e10Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e10Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, e10Var.c);
    }
}
