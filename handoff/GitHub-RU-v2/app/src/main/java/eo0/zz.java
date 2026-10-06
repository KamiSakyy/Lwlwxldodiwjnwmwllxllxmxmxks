package eo0;

import java.util.List;
import jn0.fg0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zz implements aaShadow.a {
    public static final zz a = new zz();
    public static final List b = sy.d0.o(new String[]{"hasCreatedLists", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "hasCreatedLists");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new fg0(str, str2, booleanValue);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fg0 fg0Var = (fg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fg0Var, "value");
        fVar.z0("hasCreatedLists");
        jo.f4.C(fg0Var.a, aa.c.f, fVar, wVar, "id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fg0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, fg0Var.c);
    }
}
