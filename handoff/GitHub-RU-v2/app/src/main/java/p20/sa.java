package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sa implements aaShadow.a {
    public static final sa a = new sa();
    public static final List b = sy.d0.o("name", "color", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str4 != null) {
            return new u10.wf(str, str2, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.wf wfVar = (u10.wf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wfVar, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wfVar.a);
        fVar.z0("color");
        aa.c.i.b(fVar, wVar, wfVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, wfVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, wfVar.d);
    }
}
