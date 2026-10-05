package w80;

import hc0.h6;
import hc0.jc;
import hc0.lc;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "url", "id", "title", "titleHTMLString", "createdAt", "viewerDidAuthor", "locked", "author", "isReadByViewer", "bodyHtml", "bodyUrl", "number", "issueState", "milestone", "projectCards", "completeTaskListItemCount", "incompleteTaskListItemCount", "viewerCanReopen", "stateReason", "viewerCanAssign", "viewerCanLabel", "isPinned"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0041. Please report as an issue. */
    public static c3 c(ea.e eVar, aa.w wVar) {
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
        w2 w2Var = null;
        Boolean bool7 = null;
        String str6 = null;
        String str7 = null;
        Integer num4 = null;
        jc jcVar = null;
        y2 y2Var = null;
        b3 b3Var = null;
        Integer num5 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        lc lcVar = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        while (true) {
            Boolean bool12 = bool5;
            switch (eVar.r0(a)) {
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
                    h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(h6.a).a(eVar, wVar);
                    bool5 = bool;
                case 6:
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                case 7:
                    bool = bool12;
                    bool6 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool5 = bool;
                case 8:
                    bool = bool12;
                    w2Var = (w2) aa.c.b(aa.c.c(d3.a, true)).a(eVar, wVar);
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
                            nextLong = f4.c(1, nextLong, "substring(...)");
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
                    jc.Companion.getClass();
                    Iterator it = jc.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((jc) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    jc jcVar2 = (jc) obj;
                    jcVar = jcVar2 == null ? jc.v : jcVar2;
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
                    y2Var = (y2) aa.c.b(aa.c.c(f3.a, true)).a(eVar, wVar);
                    bool5 = bool;
                case 15:
                    bool = bool12;
                    b3Var = (b3) aa.c.c(i3.a, false).a(eVar, wVar);
                    bool5 = bool;
                case 16:
                    Boolean bool15 = bool6;
                    Integer num7 = num3;
                    num2 = num5;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    long nextLong2 = eVar.nextLong();
                    if (nextLong2 > 2147483647L) {
                        while (nextLong2 > 2147483647L) {
                            nextLong2 = f4.c(1, nextLong2, "substring(...)");
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
                case 17:
                    Boolean bool16 = bool6;
                    Integer num8 = num3;
                    Integer num9 = num4;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    long nextLong3 = eVar.nextLong();
                    if (nextLong3 > 2147483647L) {
                        while (nextLong3 > 2147483647L) {
                            nextLong3 = f4.c(1, nextLong3, "substring(...)");
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
                case 18:
                    bool = bool12;
                    bool8 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool5 = bool;
                case 19:
                    bool = bool12;
                    lcVar = (lc) aa.c.b(ic0.a.t).a(eVar, wVar);
                    bool5 = bool;
                case 20:
                    bool = bool12;
                    bool9 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool5 = bool;
                case 21:
                    bool = bool12;
                    bool10 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool5 = bool;
                case 22:
                    bool = bool12;
                    bool11 = (Boolean) aa.c.k.a(eVar, wVar);
                    bool5 = bool;
            }
            eVar.s0();
            c40.c c = c40.e.c(eVar, wVar);
            eVar.s0();
            i80.e eVar2 = i80.e.a;
            i80.c c2 = i80.e.c(eVar, wVar);
            eVar.s0();
            g70.a c3 = g70.b.c(eVar, wVar);
            eVar.s0();
            i30.i c4 = i30.j.c(eVar, wVar);
            eVar.s0();
            c60.j c5 = c60.n.c(eVar, wVar);
            eVar.s0();
            i60.o c6 = i60.q.c(eVar, wVar);
            eVar.s0();
            aa0.a c7 = aa0.b.c(eVar, wVar);
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
            if (jcVar == null) {
                k41.b.B(eVar, "issueState");
                throw null;
            }
            if (b3Var == null) {
                k41.b.B(eVar, "projectCards");
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
                return new c3(str, str2, str3, str4, str5, zonedDateTime, booleanValue, booleanValue2, w2Var, bool7, str6, str7, intValue, jcVar, y2Var, b3Var, intValue2, intValue3, booleanValue3, lcVar, booleanValue4, bool20.booleanValue(), bool11, c, c2, c3, c4, c5, c6, c7);
            }
            k41.b.B(eVar, "viewerCanLabel");
            throw null;
        }
    }
}
