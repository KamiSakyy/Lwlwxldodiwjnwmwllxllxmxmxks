package oj0;

import gn0.r6;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static n2 c(ea.e eVar, aa.w wVar) {
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
        ek0.f fVar = ek0.f.a;
        ek0.b c = ek0.f.c(eVar, wVar);
        eVar.s0();
        g3 c2 = n3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new n2(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, n2 n2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, n2Var.b);
        ek0.f fVar2 = ek0.f.a;
        ek0.f.d(fVar, wVar, n2Var.c);
        List list = n3.a;
        g3 g3Var = n2Var.d;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g3Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, g3Var.a);
        fVar.z0("url");
        bVar2.b(fVar, wVar, g3Var.b);
        fVar.z0("id");
        bVar2.b(fVar, wVar, g3Var.c);
        fVar.z0("title");
        bVar2.b(fVar, wVar, g3Var.d);
        fVar.z0("titleHTMLString");
        bVar2.b(fVar, wVar, g3Var.e);
        fVar.z0("createdAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, g3Var.f);
        fVar.z0("viewerDidAuthor");
        aa.b bVar3 = aa.c.f;
        jo.f4Shadow.C(g3Var.g, bVar3, fVar, wVar, "locked");
        jo.f4Shadow.C(g3Var.h, bVar3, fVar, wVar, "author");
        aa.c.b(aa.c.c(h3.a, true)).b(fVar, wVar, g3Var.i);
        fVar.z0("isReadByViewer");
        aa.o0 o0Var = aa.c.k;
        o0Var.b(fVar, wVar, g3Var.j);
        fVar.z0("bodyHtml");
        bVar2.b(fVar, wVar, g3Var.k);
        fVar.z0("bodyUrl");
        bVar2.b(fVar, wVar, g3Var.l);
        fVar.z0("number");
        fVar.z(g3Var.m);
        fVar.z0("issueState");
        fVar.I(g3Var.n.r);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(j3.a, true)).b(fVar, wVar, g3Var.o);
        fVar.z0("projectCards");
        aa.c.c(m3.a, false).b(fVar, wVar, g3Var.p);
        fVar.z0("completeTaskListItemCount");
        fVar.z(g3Var.q);
        fVar.z0("incompleteTaskListItemCount");
        fVar.z(g3Var.r);
        fVar.z0("viewerCanReopen");
        jo.f4Shadow.C(g3Var.s, bVar3, fVar, wVar, "stateReason");
        aa.c.b(hn0.a.t).b(fVar, wVar, g3Var.t);
        fVar.z0("viewerCanAssign");
        jo.f4Shadow.C(g3Var.u, bVar3, fVar, wVar, "viewerCanLabel");
        jo.f4Shadow.C(g3Var.v, bVar3, fVar, wVar, "isPinned");
        o0Var.b(fVar, wVar, g3Var.w);
        List list2 = se0.e.a;
        se0.e.d(fVar, wVar, g3Var.x);
        aj0.f fVar3 = aj0.f.a;
        aj0.f.d(fVar, wVar, g3Var.y);
        List list3 = yh0.b.a;
        yh0.b.d(fVar, wVar, g3Var.z);
        List list4 = yd0.j.a;
        yd0.j.d(fVar, wVar, g3Var.A);
        List list5 = sg0.n.a;
        sg0.n.d(fVar, wVar, g3Var.B);
        List list6 = yg0.q.a;
        yg0.q.d(fVar, wVar, g3Var.C);
        List list7 = sk0.b.a;
        sk0.b.d(fVar, wVar, g3Var.D);
    }
}
