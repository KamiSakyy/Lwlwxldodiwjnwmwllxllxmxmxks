package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tj implements aaShadow.a {
    public static final tj a = new tj();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "owner", "ref", "release", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.ks ksVar = null;
        jn0.ms msVar = null;
        jn0.ns nsVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                ksVar = (jn0.ks) aa.c.c(oj.a, true).a(eVar, wVar);
            } else if (r0 == 2) {
                msVar = (jn0.ms) aa.c.b(aa.c.c(qj.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                nsVar = (jn0.ns) aa.c.b(aa.c.c(rj.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (ksVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new jn0.ps(str, ksVar, msVar, nsVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ps psVar = (jn0.ps) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(psVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, psVar.a);
        fVar.z0("owner");
        aa.c.c(oj.a, true).b(fVar, wVar, psVar.b);
        fVar.z0("ref");
        aa.c.b(aa.c.c(qj.a, false)).b(fVar, wVar, psVar.c);
        fVar.z0("release");
        aa.c.b(aa.c.c(rj.a, true)).b(fVar, wVar, psVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, psVar.e);
    }
}
