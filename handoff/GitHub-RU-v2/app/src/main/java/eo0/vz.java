package eo0;

import java.util.List;
import jn0.vf0;
import jn0.wf0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vz implements aaShadow.a {
    public static final vz a = new vz();
    public static final List b = sy.d0.o(new String[]{"notificationThreads", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        vf0 vf0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                vf0Var = (vf0) aa.c.c(uz.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (vf0Var == null) {
            k41.b.B(eVar, "notificationThreads");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new wf0(vf0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        wf0 wf0Var = (wf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wf0Var, "value");
        fVar.z0("notificationThreads");
        aa.c.c(uz.a, false).b(fVar, wVar, wf0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wf0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, wf0Var.c);
    }
}
