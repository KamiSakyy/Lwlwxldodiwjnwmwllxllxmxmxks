package p20;

import java.util.Iterator;
import java.util.List;
import u10.r50;
import u10.s50;
import u10.t50;
import u10.v50;
import u10.x50;
import u10.y50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qs implements aaShadow.a {
    public static final qs a = new qs();
    public static final List b = sy.d0.o("__typename", "id", "headRefOid", "state", "mergeStateStatus", "repository", "headRef", "baseRefName", "viewerCanMergeAsAdmin", "mergedBy", "mergeCommit", "viewerCanUpdate", "timelineItems");

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0025. Please report as an issue. */
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
        hc0.fm fmVar = null;
        hc0.ff ffVar = null;
        x50 x50Var = null;
        r50 r50Var = null;
        String str4 = null;
        Boolean bool5 = null;
        t50 t50Var = null;
        s50 s50Var = null;
        y50 y50Var = null;
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
                    hc0.fm.Companion.getClass();
                    Iterator it = hc0.fm.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((hc0.fm) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    fmVar = (hc0.fm) obj;
                    if (fmVar == null) {
                        fmVar = hc0.fm.v;
                    }
                    bool4 = bool2;
                    bool5 = bool3;
                case 4:
                    bool2 = bool4;
                    bool3 = bool5;
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    hc0.ff.Companion.getClass();
                    Iterator it2 = hc0.ff.w.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((hc0.ff) obj2).r.equals(u2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ffVar = (hc0.ff) obj2;
                    if (ffVar == null) {
                        ffVar = hc0.ff.u;
                    }
                    bool4 = bool2;
                    bool5 = bool3;
                case 5:
                    bool = bool4;
                    x50Var = (x50) aa.c.c(ss.a, false).a(eVar, wVar);
                    bool4 = bool;
                case 6:
                    bool = bool4;
                    r50Var = (r50) aa.c.b(aa.c.c(ms.a, false)).a(eVar, wVar);
                    bool4 = bool;
                case 7:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                case 8:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                case 9:
                    bool = bool4;
                    t50Var = (t50) aa.c.b(aa.c.c(os.a, true)).a(eVar, wVar);
                    bool4 = bool;
                case 10:
                    bool = bool4;
                    s50Var = (s50) aa.c.b(aa.c.c(ns.a, false)).a(eVar, wVar);
                    bool4 = bool;
                case 11:
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                case 12:
                    bool = bool4;
                    y50Var = (y50) aa.c.c(ts.a, false).a(eVar, wVar);
                    bool4 = bool;
            }
            eVar.s0();
            z70.b c = z70.d.c(eVar, wVar);
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
            if (fmVar == null) {
                k41.b.B(eVar, "state");
                throw null;
            }
            if (ffVar == null) {
                k41.b.B(eVar, "mergeStateStatus");
                throw null;
            }
            if (x50Var == null) {
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
            if (y50Var != null) {
                return new v50(str, str2, str3, fmVar, ffVar, x50Var, r50Var, str4, booleanValue, t50Var, s50Var, booleanValue2, y50Var, c);
            }
            k41.b.B(eVar, "timelineItems");
            throw null;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v50 v50Var = (v50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v50Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v50Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, v50Var.b);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, v50Var.c);
        fVar.z0("state");
        fVar.I(v50Var.d.r);
        fVar.z0("mergeStateStatus");
        fVar.I(v50Var.e.r);
        fVar.z0("repository");
        aa.c.c(ss.a, false).b(fVar, wVar, v50Var.f);
        fVar.z0("headRef");
        aa.c.b(aa.c.c(ms.a, false)).b(fVar, wVar, v50Var.g);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, v50Var.h);
        fVar.z0("viewerCanMergeAsAdmin");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(v50Var.i, bVar2, fVar, wVar, "mergedBy");
        aa.c.b(aa.c.c(os.a, true)).b(fVar, wVar, v50Var.j);
        fVar.z0("mergeCommit");
        aa.c.b(aa.c.c(ns.a, false)).b(fVar, wVar, v50Var.k);
        fVar.z0("viewerCanUpdate");
        jo.f4.C(v50Var.l, bVar2, fVar, wVar, "timelineItems");
        aa.c.c(ts.a, false).b(fVar, wVar, v50Var.m);
        List list = z70.d.a;
        z70.d.d(fVar, wVar, v50Var.n);
    }
}
