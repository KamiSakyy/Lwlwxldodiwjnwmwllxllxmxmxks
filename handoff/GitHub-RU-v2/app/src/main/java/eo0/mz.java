package eo0;

import java.util.List;
import jn0.hf0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mz implements aaShadow.a {
    public static final mz a = new mz();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "name"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new hf0(str, str2);
                }
                str2 = (String) aa.c.i.a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        hf0 hf0Var = (hf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hf0Var, "value");
        fVar.z0("id");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, hf0Var.a);
        fVar.z0("name");
        o0Var.b(fVar, wVar, hf0Var.b);
    }
}
