package iy0;

import java.util.List;
import jo.f4Shadow;
import pz0.o7;
import uu0.g6;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static c c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        p c = s.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new c(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, c cVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.b);
        List list = s.a;
        p pVar = cVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, pVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, pVar.b);
        fVar.z0("title");
        bVar2.b(fVar, wVar, pVar.c);
        fVar.z0("number");
        int i = pVar.d;
        nn.a aVar = ro0.a.a;
        f1.e.v(i, aVar, fVar, wVar, "url");
        bVar2.b(fVar, wVar, pVar.e);
        fVar.z0("locked");
        aa.b bVar3 = aa.c.f;
        f4.C(pVar.f, bVar3, fVar, wVar, "issueState");
        fVar.I(pVar.g.r);
        fVar.z0("updatedAt");
        o7.Companion.getClass();
        aa.xShadow xVar = o7.a;
        wVar.e(xVar).b(fVar, wVar, pVar.h);
        fVar.z0("totalCommentsCount");
        aa.c.b(aVar).b(fVar, wVar, pVar.i);
        fVar.z0("stateReason");
        aa.c.b(qz0.a.x).b(fVar, wVar, pVar.j);
        fVar.z0("completedTasksCount");
        f1.e.v(pVar.k, aVar, fVar, wVar, "totalTaskCount");
        f1.e.v(pVar.l, aVar, fVar, wVar, "viewerCanReopen");
        f4.C(pVar.m, bVar3, fVar, wVar, "viewerCanUpdate");
        f4.C(pVar.n, bVar3, fVar, wVar, "viewerDidAuthor");
        f4.C(pVar.o, bVar3, fVar, wVar, "createdAt");
        wVar.e(xVar).b(fVar, wVar, pVar.p);
        fVar.z0("viewerCanAssign");
        f4.C(pVar.q, bVar3, fVar, wVar, "viewerCanLabel");
        f4.C(pVar.r, bVar3, fVar, wVar, "issueType");
        aa.c.b(aa.c.c(q.a, true)).b(fVar, wVar, pVar.s);
        fVar.z0("repository");
        aa.c.c(t.a, true).b(fVar, wVar, pVar.t);
        g6 g6Var = g6.a;
        g6.d(fVar, wVar, pVar.u);
        List list2 = uu0.u0.a;
        uu0.u0.d(fVar, wVar, pVar.v);
    }
}
