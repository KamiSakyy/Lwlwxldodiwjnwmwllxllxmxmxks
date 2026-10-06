package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jo implements aaShadow.a {
    public static final jo a = new jo();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        pt0.h c = pt0.o.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.yy(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.yy yyVar = (jn0.yy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yyVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, yyVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, yyVar.b);
        List list = pt0.o.a;
        pt0.h hVar = yyVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, hVar.a);
        fVar.z0("linesAdded");
        fVar.z(hVar.b);
        fVar.z0("linesDeleted");
        fVar.z(hVar.c);
        fVar.z0("oldTreeEntry");
        aa.c.b(aa.c.c(pt0.m.a, false)).b(fVar, wVar, hVar.d);
        fVar.z0("newTreeEntry");
        aa.c.b(aa.c.c(pt0.l.a, false)).b(fVar, wVar, hVar.e);
        fVar.z0("diffLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(pt0.i.a, true)))).b(fVar, wVar, hVar.f);
        fVar.z0("isBinary");
        aa.b bVar3 = aa.c.f;
        jo.f4.C(hVar.g, bVar3, fVar, wVar, "isLargeDiff");
        jo.f4.C(hVar.h, bVar3, fVar, wVar, "isSubmodule");
        jo.f4.C(hVar.i, bVar3, fVar, wVar, "status");
        fVar.I(hVar.j.r);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, hVar.k);
    }
}
