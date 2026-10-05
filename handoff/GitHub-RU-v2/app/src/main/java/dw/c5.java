package dw;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import m10.sa;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c5 implements aa.a {
    public static final c5 a = new c5();
    public static final List b = sy.d0.o("__typename", "url", "id", "title", "titleHTMLString", "createdAt", "viewerDidAuthor", "locked", "author", "isReadByViewer", "bodyHtml", "bodyUrl", "number", "issueState", "milestone", "completeTaskListItemCount", "incompleteTaskListItemCount", "viewerCanReopen", "stateReason", "viewerCanAssign", "viewerCanLabel", "isPinned", "issueType", "duplicateOf", "suggestedActors");

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0045. Please report as an issue. */
    public static t4 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Integer num;
        Integer num2;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Integer valueOf;
        Object obj;
        Integer valueOf2;
        Integer valueOf3;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool5 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ZonedDateTime zonedDateTime = null;
        Boolean bool6 = null;
        Integer num3 = null;
        m4 m4Var = null;
        Boolean bool7 = null;
        String str6 = null;
        String str7 = null;
        Integer num4 = null;
        wi wiVar = null;
        p4 p4Var = null;
        Integer num5 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        yi yiVar = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        o4 o4Var = null;
        n4 n4Var = null;
        s4 s4Var = null;
        while (true) {
            Boolean bool12 = bool5;
            switch (eVar.r0(b)) {
                case 0:
                    bool = bool12;
                    str = (String) aa.c.a.a(eVar, wVar);
                    bool5 = bool;
                case 1:
                    bool = bool12;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    bool5 = bool;
                case 2:
                    bool = bool12;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    bool5 = bool;
                case 3:
                    bool = bool12;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    bool5 = bool;
                case 4:
                    bool = bool12;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    bool5 = bool;
                case 5:
                    bool = bool12;
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
                    bool5 = bool;
                case 6:
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                case 7:
                    bool = bool12;
                    bool6 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool5 = bool;
                case 8:
                    bool = bool12;
                    m4Var = (m4) aa.c.b(aa.c.c(w4.a, true)).a(eVar, wVar);
                    bool5 = bool;
                case 9:
                    bool = bool12;
                    bool7 = (Boolean) aa.c.k.a(eVar, wVar);
                    bool5 = bool;
                case 10:
                    bool = bool12;
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    bool5 = bool;
                case 11:
                    bool = bool12;
                    str7 = (String) aa.c.a.a(eVar, wVar);
                    bool5 = bool;
                case 12:
                    Boolean bool13 = bool6;
                    num = num4;
                    num2 = num5;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num3 = valueOf;
                    bool5 = bool12;
                    bool6 = bool13;
                    num4 = num;
                    num5 = num2;
                    bool8 = bool2;
                    bool9 = bool3;
                    bool10 = bool4;
                case 13:
                    Boolean bool14 = bool6;
                    Integer num6 = num3;
                    num = num4;
                    num2 = num5;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    String u = eVar.u();
                    k71.k.d(u);
                    wi.Companion.getClass();
                    Iterator it = wi.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((wi) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    wi wiVar2 = (wi) obj;
                    wiVar = wiVar2 == null ? wi.v : wiVar2;
                    bool5 = bool12;
                    bool6 = bool14;
                    num3 = num6;
                    num4 = num;
                    num5 = num2;
                    bool8 = bool2;
                    bool9 = bool3;
                    bool10 = bool4;
                case 14:
                    bool = bool12;
                    p4Var = (p4) aa.c.b(aa.c.c(z4.a, true)).a(eVar, wVar);
                    bool5 = bool;
                case 15:
                    Boolean bool15 = bool6;
                    Integer num7 = num3;
                    num2 = num5;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    long nextLong2 = eVar.nextLong();
                    if (nextLong2 > 2147483647L) {
                        while (nextLong2 > 2147483647L) {
                            nextLong2 = jo.f4.c(1, nextLong2, "substring(...)");
                        }
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    } else {
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    }
                    num4 = valueOf2;
                    bool5 = bool12;
                    bool6 = bool15;
                    num3 = num7;
                    num5 = num2;
                    bool8 = bool2;
                    bool9 = bool3;
                    bool10 = bool4;
                case 16:
                    Boolean bool16 = bool6;
                    Integer num8 = num3;
                    Integer num9 = num4;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    long nextLong3 = eVar.nextLong();
                    if (nextLong3 > 2147483647L) {
                        while (nextLong3 > 2147483647L) {
                            nextLong3 = jo.f4.c(1, nextLong3, "substring(...)");
                        }
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    } else {
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    }
                    num5 = valueOf3;
                    bool5 = bool12;
                    bool6 = bool16;
                    num3 = num8;
                    num4 = num9;
                    bool8 = bool2;
                    bool9 = bool3;
                    bool10 = bool4;
                case 17:
                    bool = bool12;
                    bool8 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool5 = bool;
                case 18:
                    bool = bool12;
                    yiVar = (yi) aa.c.b(n10.b.f).a(eVar, wVar);
                    bool5 = bool;
                case 19:
                    bool = bool12;
                    bool9 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool5 = bool;
                case 20:
                    bool = bool12;
                    bool10 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool5 = bool;
                case 21:
                    bool = bool12;
                    bool11 = (Boolean) aa.c.k.a(eVar, wVar);
                    bool5 = bool;
                case 22:
                    bool = bool12;
                    o4Var = (o4) aa.c.b(aa.c.c(y4.a, true)).a(eVar, wVar);
                    bool5 = bool;
                case 23:
                    bool = bool12;
                    n4Var = (n4) aa.c.b(aa.c.c(x4.a, true)).a(eVar, wVar);
                    bool5 = bool;
                case 24:
                    bool = bool12;
                    s4Var = (s4) aa.c.c(d5.a, false).a(eVar, wVar);
                    bool5 = bool;
            }
            eVar.s0();
            ar.c c = ar.e.c(eVar, wVar);
            eVar.s0();
            pv.f fVar = pv.f.a;
            pv.c c2 = pv.f.c(eVar, wVar);
            eVar.s0();
            pu.a c3 = pu.b.c(eVar, wVar);
            eVar.s0();
            gq.i c4 = gq.k.c(eVar, wVar);
            eVar.s0();
            lt.j c5 = lt.n.c(eVar, wVar);
            eVar.s0();
            rt.o c6 = rt.q.c(eVar, wVar);
            eVar.s0();
            mx.a c7 = mx.b.c(eVar, wVar);
            eVar.s0();
            s0 c8 = w0.c(eVar, wVar);
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (str5 == null) {
                k41.b.B(eVar, "titleHTMLString");
                throw null;
            }
            if (zonedDateTime == null) {
                k41.b.B(eVar, "createdAt");
                throw null;
            }
            if (bool12 == null) {
                k41.b.B(eVar, "viewerDidAuthor");
                throw null;
            }
            Boolean bool17 = bool6;
            boolean booleanValue = bool12.booleanValue();
            if (bool17 == null) {
                k41.b.B(eVar, "locked");
                throw null;
            }
            Integer num10 = num3;
            boolean booleanValue2 = bool17.booleanValue();
            if (str6 == null) {
                k41.b.B(eVar, "bodyHtml");
                throw null;
            }
            if (str7 == null) {
                k41.b.B(eVar, "bodyUrl");
                throw null;
            }
            if (num10 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Integer num11 = num4;
            int intValue = num10.intValue();
            if (wiVar == null) {
                k41.b.B(eVar, "issueState");
                throw null;
            }
            if (num11 == null) {
                k41.b.B(eVar, "completeTaskListItemCount");
                throw null;
            }
            Integer num12 = num5;
            int intValue2 = num11.intValue();
            if (num12 == null) {
                k41.b.B(eVar, "incompleteTaskListItemCount");
                throw null;
            }
            Boolean bool18 = bool8;
            int intValue3 = num12.intValue();
            if (bool18 == null) {
                k41.b.B(eVar, "viewerCanReopen");
                throw null;
            }
            Boolean bool19 = bool9;
            boolean booleanValue3 = bool18.booleanValue();
            if (bool19 == null) {
                k41.b.B(eVar, "viewerCanAssign");
                throw null;
            }
            Boolean bool20 = bool10;
            boolean booleanValue4 = bool19.booleanValue();
            if (bool20 == null) {
                k41.b.B(eVar, "viewerCanLabel");
                throw null;
            }
            boolean booleanValue5 = bool20.booleanValue();
            if (s4Var != null) {
                return new t4(str, str2, str3, str4, str5, zonedDateTime, booleanValue, booleanValue2, m4Var, bool7, str6, str7, intValue, wiVar, p4Var, intValue2, intValue3, booleanValue3, yiVar, booleanValue4, booleanValue5, bool11, o4Var, n4Var, s4Var, c, c2, c3, c4, c5, c6, c7, c8);
            }
            k41.b.B(eVar, "suggestedActors");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, t4 t4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t4Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t4Var.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, t4Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, t4Var.c);
        fVar.z0("title");
        bVar.b(fVar, wVar, t4Var.d);
        fVar.z0("titleHTMLString");
        bVar.b(fVar, wVar, t4Var.e);
        fVar.z0("createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, t4Var.f);
        fVar.z0("viewerDidAuthor");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(t4Var.g, bVar2, fVar, wVar, "locked");
        jo.f4.C(t4Var.h, bVar2, fVar, wVar, "author");
        aa.c.b(aa.c.c(w4.a, true)).b(fVar, wVar, t4Var.i);
        fVar.z0("isReadByViewer");
        aa.o0 o0Var = aa.c.k;
        o0Var.b(fVar, wVar, t4Var.j);
        fVar.z0("bodyHtml");
        bVar.b(fVar, wVar, t4Var.k);
        fVar.z0("bodyUrl");
        bVar.b(fVar, wVar, t4Var.l);
        fVar.z0("number");
        fVar.z(t4Var.m);
        fVar.z0("issueState");
        fVar.I(t4Var.n.r);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(z4.a, true)).b(fVar, wVar, t4Var.o);
        fVar.z0("completeTaskListItemCount");
        fVar.z(t4Var.p);
        fVar.z0("incompleteTaskListItemCount");
        fVar.z(t4Var.q);
        fVar.z0("viewerCanReopen");
        jo.f4.C(t4Var.r, bVar2, fVar, wVar, "stateReason");
        aa.c.b(n10.b.f).b(fVar, wVar, t4Var.s);
        fVar.z0("viewerCanAssign");
        jo.f4.C(t4Var.t, bVar2, fVar, wVar, "viewerCanLabel");
        jo.f4.C(t4Var.u, bVar2, fVar, wVar, "isPinned");
        o0Var.b(fVar, wVar, t4Var.v);
        fVar.z0("issueType");
        aa.c.b(aa.c.c(y4.a, true)).b(fVar, wVar, t4Var.w);
        fVar.z0("duplicateOf");
        aa.c.b(aa.c.c(x4.a, true)).b(fVar, wVar, t4Var.x);
        fVar.z0("suggestedActors");
        aa.c.c(d5.a, false).b(fVar, wVar, t4Var.y);
        List list = ar.e.a;
        ar.e.d(fVar, wVar, t4Var.z);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, t4Var.A);
        List list2 = pu.b.a;
        pu.b.d(fVar, wVar, t4Var.B);
        List list3 = gq.k.a;
        gq.k.d(fVar, wVar, t4Var.C);
        List list4 = lt.n.a;
        lt.n.d(fVar, wVar, t4Var.D);
        List list5 = rt.q.a;
        rt.q.d(fVar, wVar, t4Var.E);
        List list6 = mx.b.a;
        mx.b.d(fVar, wVar, t4Var.F);
        List list7 = w0.a;
        w0.d(fVar, wVar, t4Var.G);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (t4) obj);
    }
}
