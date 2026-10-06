package w80;

import hc0.h6;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static j2 c(ea.e eVar, aa.w wVar) {
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
        m90.e eVar2 = m90.e.a;
        m90.b c = m90.e.c(eVar, wVar);
        eVar.s0();
        c3 c2 = j3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new j2(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, j2 j2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, j2Var.b);
        m90.e eVar = m90.e.a;
        m90.e.d(fVar, wVar, j2Var.c);
        List list = j3.a;
        c3 c3Var = j2Var.d;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c3Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, c3Var.a);
        fVar.z0("url");
        bVar2.b(fVar, wVar, c3Var.b);
        fVar.z0("id");
        bVar2.b(fVar, wVar, c3Var.c);
        fVar.z0("title");
        bVar2.b(fVar, wVar, c3Var.d);
        fVar.z0("titleHTMLString");
        bVar2.b(fVar, wVar, c3Var.e);
        fVar.z0("createdAt");
        h6.Companion.getClass();
        wVar.e(h6.a).b(fVar, wVar, c3Var.f);
        fVar.z0("viewerDidAuthor");
        aa.b bVar3 = aa.c.f;
        f4.C(c3Var.g, bVar3, fVar, wVar, "locked");
        f4.C(c3Var.h, bVar3, fVar, wVar, "author");
        aa.c.b(aa.c.c(d3.a, true)).b(fVar, wVar, c3Var.i);
        fVar.z0("isReadByViewer");
        aa.o0 o0Var = aa.c.k;
        o0Var.b(fVar, wVar, c3Var.j);
        fVar.z0("bodyHtml");
        bVar2.b(fVar, wVar, c3Var.k);
        fVar.z0("bodyUrl");
        bVar2.b(fVar, wVar, c3Var.l);
        fVar.z0("number");
        fVar.z(c3Var.m);
        fVar.z0("issueState");
        fVar.I(c3Var.n.r);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(f3.a, true)).b(fVar, wVar, c3Var.o);
        fVar.z0("projectCards");
        aa.c.c(i3.a, false).b(fVar, wVar, c3Var.p);
        fVar.z0("completeTaskListItemCount");
        fVar.z(c3Var.q);
        fVar.z0("incompleteTaskListItemCount");
        fVar.z(c3Var.r);
        fVar.z0("viewerCanReopen");
        f4.C(c3Var.s, bVar3, fVar, wVar, "stateReason");
        aa.c.b(ic0.a.t).b(fVar, wVar, c3Var.t);
        fVar.z0("viewerCanAssign");
        f4.C(c3Var.u, bVar3, fVar, wVar, "viewerCanLabel");
        f4.C(c3Var.v, bVar3, fVar, wVar, "isPinned");
        o0Var.b(fVar, wVar, c3Var.w);
        List list2 = c40.e.a;
        c40.e.d(fVar, wVar, c3Var.x);
        i80.e eVar2 = i80.e.a;
        i80.e.d(fVar, wVar, c3Var.y);
        List list3 = g70.b.a;
        g70.b.d(fVar, wVar, c3Var.z);
        List list4 = i30.j.a;
        i30.j.d(fVar, wVar, c3Var.A);
        List list5 = c60.n.a;
        c60.n.d(fVar, wVar, c3Var.B);
        List list6 = i60.q.a;
        i60.q.d(fVar, wVar, c3Var.C);
        List list7 = aa0.b.a;
        aa0.b.d(fVar, wVar, c3Var.D);
    }
}
