package f00;

import dw.c7;
import java.util.List;
import jo.f4;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
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
        q c = u.c(eVar, wVar);
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
        List list = u.a;
        q qVar = cVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, qVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, qVar.b);
        fVar.z0("title");
        bVar2.b(fVar, wVar, qVar.c);
        fVar.z0("number");
        int i = qVar.d;
        nn.a aVar = tp.a.a;
        f1.e.A(i, aVar, fVar, wVar, "url");
        bVar2.b(fVar, wVar, qVar.e);
        fVar.z0("locked");
        aa.b bVar3 = aa.c.f;
        f4.C(qVar.f, bVar3, fVar, wVar, "issueState");
        fVar.I(qVar.g.r);
        fVar.z0("updatedAt");
        sa.Companion.getClass();
        aa.x xVar = sa.a;
        wVar.e(xVar).b(fVar, wVar, qVar.h);
        fVar.z0("totalCommentsCount");
        aa.c.b(aVar).b(fVar, wVar, qVar.i);
        fVar.z0("stateReason");
        aa.c.b(n10.b.f).b(fVar, wVar, qVar.j);
        fVar.z0("completedTasksCount");
        f1.e.A(qVar.k, aVar, fVar, wVar, "totalTaskCount");
        f1.e.A(qVar.l, aVar, fVar, wVar, "viewerCanReopen");
        f4.C(qVar.m, bVar3, fVar, wVar, "viewerCanUpdate");
        f4.C(qVar.n, bVar3, fVar, wVar, "viewerDidAuthor");
        f4.C(qVar.o, bVar3, fVar, wVar, "createdAt");
        wVar.e(xVar).b(fVar, wVar, qVar.p);
        fVar.z0("viewerCanAssign");
        f4.C(qVar.q, bVar3, fVar, wVar, "viewerCanLabel");
        f4.C(qVar.r, bVar3, fVar, wVar, "issueType");
        aa.c.b(aa.c.c(s.a, true)).b(fVar, wVar, qVar.s);
        fVar.z0("repository");
        aa.c.c(v.a, true).b(fVar, wVar, qVar.t);
        fVar.z0("duplicateOf");
        aa.c.b(aa.c.c(r.a, true)).b(fVar, wVar, qVar.u);
        c7 c7Var = c7.a;
        c7.d(fVar, wVar, qVar.v);
        List list2 = dw.w0.a;
        dw.w0.d(fVar, wVar, qVar.w);
    }
}
