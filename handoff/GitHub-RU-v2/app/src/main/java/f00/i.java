package f00;

import java.util.List;
import jo.f4;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static d c(ea.e eVar, aa.w wVar) {
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
        w c = x.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new d(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, d dVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, dVar.b);
        List list = x.a;
        w wVar2 = dVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, wVar2.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, wVar2.b);
        fVar.z0("title");
        bVar2.b(fVar, wVar, wVar2.c);
        fVar.z0("number");
        int i = wVar2.d;
        nn.a aVar = tp.a.a;
        f1.e.A(i, aVar, fVar, wVar, "url");
        bVar2.b(fVar, wVar, wVar2.e);
        fVar.z0("locked");
        aa.b bVar3 = aa.c.f;
        f4.C(wVar2.f, bVar3, fVar, wVar, "pullRequestState");
        fVar.I(wVar2.g.r);
        fVar.z0("isDraft");
        f4.C(wVar2.h, bVar3, fVar, wVar, "isInMergeQueue");
        f4.C(wVar2.i, bVar3, fVar, wVar, "updatedAt");
        sa.Companion.getClass();
        aa.x xVar = sa.a;
        wVar.e(xVar).b(fVar, wVar, wVar2.j);
        fVar.z0("createdAt");
        wVar.e(xVar).b(fVar, wVar, wVar2.k);
        fVar.z0("totalCommentsCount");
        aa.c.b(aVar).b(fVar, wVar, wVar2.l);
        fVar.z0("completedTasksCount");
        f1.e.A(wVar2.m, aVar, fVar, wVar, "totalTaskCount");
        f1.e.A(wVar2.n, aVar, fVar, wVar, "baseRefName");
        bVar2.b(fVar, wVar, wVar2.o);
        fVar.z0("headRefName");
        bVar2.b(fVar, wVar, wVar2.p);
        fVar.z0("viewerCanReopen");
        f4.C(wVar2.q, bVar3, fVar, wVar, "viewerCanUpdate");
        f4.C(wVar2.r, bVar3, fVar, wVar, "viewerDidAuthor");
        f4.C(wVar2.s, bVar3, fVar, wVar, "viewerCanAssign");
        f4.C(wVar2.t, bVar3, fVar, wVar, "viewerCanLabel");
        bVar3.b(fVar, wVar, Boolean.valueOf(wVar2.u));
        List list2 = rt.g.a;
        rt.g.d(fVar, wVar, wVar2.v);
    }
}
