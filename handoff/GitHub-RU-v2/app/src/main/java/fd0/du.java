package fd0;

import java.util.Iterator;
import java.util.List;
import kc0.p70;
import kc0.q70;
import kc0.r70;
import kc0.s70;
import kc0.t70;
import kc0.v70;
import kc0.x70;
import kc0.y70;

/* loaded from: /home/user/work/p/classes4.dex */
public final class du implements aaShadow.a {
    public static final du a = new du();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id", "headRefOid", "state", "mergeStateStatus", "repository", "headRef", "baseRefName", "viewerCanMergeAsAdmin", "mergedBy", "mergeCommit", "mergeQueueEntry", "mergeQueue", "viewerCanUpdate", "timelineItems"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002a. Please report as an issue. */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Object obj;
        Object obj2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool4 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        gn0.hn hnVar = null;
        gn0.gg ggVar = null;
        x70 x70Var = null;
        p70 p70Var = null;
        String str4 = null;
        Boolean bool5 = null;
        t70 t70Var = null;
        q70 q70Var = null;
        s70 s70Var = null;
        r70 r70Var = null;
        y70 y70Var = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                case 3:
                    bool2 = bool4;
                    bool3 = bool5;
                    String u = eVar.u();
                    k71.k.d(u);
                    gn0.hn.Companion.getClass();
                    Iterator it = gn0.hn.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((gn0.hn) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    hnVar = (gn0.hn) obj;
                    if (hnVar == null) {
                        hnVar = gn0.hn.v;
                    }
                    bool4 = bool2;
                    bool5 = bool3;
                case 4:
                    bool2 = bool4;
                    bool3 = bool5;
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    gn0.gg.Companion.getClass();
                    Iterator it2 = gn0.gg.v.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((gn0.gg) obj2).r.equals(u2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ggVar = (gn0.gg) obj2;
                    if (ggVar == null) {
                        ggVar = gn0.gg.t;
                    }
                    bool4 = bool2;
                    bool5 = bool3;
                case 5:
                    bool = bool4;
                    x70Var = (x70) aa.c.c(fu.a, false).a(eVar, wVar);
                    bool4 = bool;
                case 6:
                    bool = bool4;
                    p70Var = (p70) aa.c.b(aa.c.c(xt.a, false)).a(eVar, wVar);
                    bool4 = bool;
                case 7:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                case 8:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                case 9:
                    bool = bool4;
                    t70Var = (t70) aa.c.b(aa.c.c(bu.a, true)).a(eVar, wVar);
                    bool4 = bool;
                case 10:
                    bool = bool4;
                    q70Var = (q70) aa.c.b(aa.c.c(yt.a, false)).a(eVar, wVar);
                    bool4 = bool;
                case 11:
                    bool = bool4;
                    s70Var = (s70) aa.c.b(aa.c.c(au.a, true)).a(eVar, wVar);
                    bool4 = bool;
                case 12:
                    bool = bool4;
                    r70Var = (r70) aa.c.b(aa.c.c(zt.a, true)).a(eVar, wVar);
                    bool4 = bool;
                case 13:
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                case 14:
                    bool = bool4;
                    y70Var = (y70) aa.c.c(gu.a, false).a(eVar, wVar);
                    bool4 = bool;
            }
            eVar.s0();
            ri0.b c = ri0.d.c(eVar, wVar);
            Boolean bool6 = bool4;
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "headRefOid");
                throw null;
            }
            if (hnVar == null) {
                k41.b.B(eVar, "state");
                throw null;
            }
            if (ggVar == null) {
                k41.b.B(eVar, "mergeStateStatus");
                throw null;
            }
            if (x70Var == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "baseRefName");
                throw null;
            }
            if (bool6 == null) {
                k41.b.B(eVar, "viewerCanMergeAsAdmin");
                throw null;
            }
            Boolean bool7 = bool5;
            boolean booleanValue = bool6.booleanValue();
            if (bool7 == null) {
                k41.b.B(eVar, "viewerCanUpdate");
                throw null;
            }
            boolean booleanValue2 = bool7.booleanValue();
            if (y70Var != null) {
                return new v70(str, str2, str3, hnVar, ggVar, x70Var, p70Var, str4, booleanValue, t70Var, q70Var, s70Var, r70Var, booleanValue2, y70Var, c);
            }
            k41.b.B(eVar, "timelineItems");
            throw null;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v70 v70Var = (v70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v70Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v70Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, v70Var.b);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, v70Var.c);
        fVar.z0("state");
        fVar.I(v70Var.d.r);
        fVar.z0("mergeStateStatus");
        fVar.I(v70Var.e.r);
        fVar.z0("repository");
        aa.c.c(fu.a, false).b(fVar, wVar, v70Var.f);
        fVar.z0("headRef");
        aa.c.b(aa.c.c(xt.a, false)).b(fVar, wVar, v70Var.g);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, v70Var.h);
        fVar.z0("viewerCanMergeAsAdmin");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(v70Var.i, bVar2, fVar, wVar, "mergedBy");
        aa.c.b(aa.c.c(bu.a, true)).b(fVar, wVar, v70Var.j);
        fVar.z0("mergeCommit");
        aa.c.b(aa.c.c(yt.a, false)).b(fVar, wVar, v70Var.k);
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(au.a, true)).b(fVar, wVar, v70Var.l);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(zt.a, true)).b(fVar, wVar, v70Var.m);
        fVar.z0("viewerCanUpdate");
        jo.f4Shadow.C(v70Var.n, bVar2, fVar, wVar, "timelineItems");
        aa.c.c(gu.a, false).b(fVar, wVar, v70Var.o);
        List list = ri0.d.a;
        ri0.d.d(fVar, wVar, v70Var.p);
    }
}
