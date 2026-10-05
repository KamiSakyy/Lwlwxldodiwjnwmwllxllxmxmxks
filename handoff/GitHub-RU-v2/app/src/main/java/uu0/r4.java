package uu0;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import pz0.bf;
import pz0.df;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r4 implements aa.a {
    public static final r4 a = new r4();
    public static final List b = sy.d0.o(new String[]{"__typename", "url", "id", "title", "titleHTMLString", "createdAt", "viewerDidAuthor", "locked", "author", "isReadByViewer", "bodyHtml", "bodyUrl", "number", "issueState", "milestone", "completeTaskListItemCount", "incompleteTaskListItemCount", "viewerCanReopen", "stateReason", "viewerCanAssign", "viewerCanLabel", "isPinned", "issueType"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0041. Please report as an issue. */
    public static l4 c(ea.e eVar, aa.w wVar) {
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
        i4 i4Var = null;
        Boolean bool7 = null;
        String str6 = null;
        String str7 = null;
        Integer num4 = null;
        bf bfVar = null;
        k4 k4Var = null;
        Integer num5 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        df dfVar = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        j4 j4Var = null;
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
                    o7.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
                    bool5 = bool;
                case 6:
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                case 7:
                    bool = bool12;
                    bool6 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool5 = bool;
                case 8:
                    bool = bool12;
                    i4Var = (i4) aa.c.b(aa.c.c(o4.a, true)).a(eVar, wVar);
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
                    bf.Companion.getClass();
                    Iterator it = bf.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((bf) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    bf bfVar2 = (bf) obj;
                    bfVar = bfVar2 == null ? bf.v : bfVar2;
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
                    k4Var = (k4) aa.c.b(aa.c.c(q4.a, true)).a(eVar, wVar);
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
                    dfVar = (df) aa.c.b(qz0.a.x).a(eVar, wVar);
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
                    j4Var = (j4) aa.c.b(aa.c.c(p4.a, true)).a(eVar, wVar);
                    bool5 = bool;
            }
            eVar.s0();
            yp0.c c = yp0.e.c(eVar, wVar);
            eVar.s0();
            gu0.f fVar = gu0.f.a;
            gu0.c c2 = gu0.f.c(eVar, wVar);
            eVar.s0();
            gt0.a c3 = gt0.b.c(eVar, wVar);
            eVar.s0();
            ep0.i c4 = ep0.j.c(eVar, wVar);
            eVar.s0();
            cs0.j c5 = cs0.n.c(eVar, wVar);
            eVar.s0();
            is0.o c6 = is0.q.c(eVar, wVar);
            eVar.s0();
            bw0.a c7 = bw0.b.c(eVar, wVar);
            eVar.s0();
            r0 c8 = u0.c(eVar, wVar);
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
            if (bfVar == null) {
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
            if (bool20 != null) {
                return new l4(str, str2, str3, str4, str5, zonedDateTime, booleanValue, booleanValue2, i4Var, bool7, str6, str7, intValue, bfVar, k4Var, intValue2, intValue3, booleanValue3, dfVar, booleanValue4, bool20.booleanValue(), bool11, j4Var, c, c2, c3, c4, c5, c6, c7, c8);
            }
            k41.b.B(eVar, "viewerCanLabel");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, l4 l4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l4Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l4Var.a);
        fVar.z0("url");
        bVar.b(fVar, wVar, l4Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, l4Var.c);
        fVar.z0("title");
        bVar.b(fVar, wVar, l4Var.d);
        fVar.z0("titleHTMLString");
        bVar.b(fVar, wVar, l4Var.e);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, l4Var.f);
        fVar.z0("viewerDidAuthor");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(l4Var.g, bVar2, fVar, wVar, "locked");
        jo.f4.C(l4Var.h, bVar2, fVar, wVar, "author");
        aa.c.b(aa.c.c(o4.a, true)).b(fVar, wVar, l4Var.i);
        fVar.z0("isReadByViewer");
        aa.o0 o0Var = aa.c.k;
        o0Var.b(fVar, wVar, l4Var.j);
        fVar.z0("bodyHtml");
        bVar.b(fVar, wVar, l4Var.k);
        fVar.z0("bodyUrl");
        bVar.b(fVar, wVar, l4Var.l);
        fVar.z0("number");
        fVar.z(l4Var.m);
        fVar.z0("issueState");
        fVar.I(l4Var.n.r);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(q4.a, true)).b(fVar, wVar, l4Var.o);
        fVar.z0("completeTaskListItemCount");
        fVar.z(l4Var.p);
        fVar.z0("incompleteTaskListItemCount");
        fVar.z(l4Var.q);
        fVar.z0("viewerCanReopen");
        jo.f4.C(l4Var.r, bVar2, fVar, wVar, "stateReason");
        aa.c.b(qz0.a.x).b(fVar, wVar, l4Var.s);
        fVar.z0("viewerCanAssign");
        jo.f4.C(l4Var.t, bVar2, fVar, wVar, "viewerCanLabel");
        jo.f4.C(l4Var.u, bVar2, fVar, wVar, "isPinned");
        o0Var.b(fVar, wVar, l4Var.v);
        fVar.z0("issueType");
        aa.c.b(aa.c.c(p4.a, true)).b(fVar, wVar, l4Var.w);
        List list = yp0.e.a;
        yp0.e.d(fVar, wVar, l4Var.x);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, l4Var.y);
        List list2 = gt0.b.a;
        gt0.b.d(fVar, wVar, l4Var.z);
        List list3 = ep0.j.a;
        ep0.j.d(fVar, wVar, l4Var.A);
        List list4 = cs0.n.a;
        cs0.n.d(fVar, wVar, l4Var.B);
        List list5 = is0.q.a;
        is0.q.d(fVar, wVar, l4Var.C);
        List list6 = bw0.b.a;
        bw0.b.d(fVar, wVar, l4Var.D);
        List list7 = u0.a;
        u0.d(fVar, wVar, l4Var.E);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (l4) obj);
    }
}
