package iy0;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import pz0.bf;
import pz0.df;
import pz0.o7;
import uu0.d6;
import uu0.g6;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "title", "number", "url", "locked", "issueState", "updatedAt", "totalCommentsCount", "stateReason", "completedTasksCount", "totalTaskCount", "viewerCanReopen", "viewerCanUpdate", "viewerDidAuthor", "createdAt", "viewerCanAssign", "viewerCanLabel", "issueType", "repository"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x003f. Please report as an issue. */
    public static p c(ea.e eVar, aa.w wVar) {
        Integer num;
        Boolean bool;
        Integer num2;
        Integer num3;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Integer valueOf;
        Object obj;
        Integer valueOf2;
        Integer valueOf3;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num4 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool7 = null;
        String str4 = null;
        Integer num5 = null;
        bf bfVar = null;
        ZonedDateTime zonedDateTime = null;
        Integer num6 = null;
        df dfVar = null;
        Integer num7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        ZonedDateTime zonedDateTime2 = null;
        Boolean bool12 = null;
        m mVar = null;
        o oVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            aa.xShadow xVar = o7.a;
            Integer num8 = num4;
            String str5 = str;
            switch (r0) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    num4 = num8;
                case 1:
                    num = num8;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 2:
                    num = num8;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 3:
                    bool = bool7;
                    num2 = num5;
                    num3 = num7;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    bool5 = bool11;
                    bool6 = bool12;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num4 = valueOf;
                    str = str5;
                    bool7 = bool;
                    num5 = num2;
                    num7 = num3;
                    bool8 = bool2;
                    bool9 = bool3;
                    bool10 = bool4;
                    bool11 = bool5;
                    bool12 = bool6;
                case 4:
                    num = num8;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 5:
                    num = num8;
                    bool7 = (Boolean) aa.c.f.a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 6:
                    bool = bool7;
                    num2 = num5;
                    num3 = num7;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    bool5 = bool11;
                    bool6 = bool12;
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
                    num4 = num8;
                    str = str5;
                    bool7 = bool;
                    num5 = num2;
                    num7 = num3;
                    bool8 = bool2;
                    bool9 = bool3;
                    bool10 = bool4;
                    bool11 = bool5;
                    bool12 = bool6;
                case 7:
                    num = num8;
                    o7.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 8:
                    num = num8;
                    num6 = (Integer) aa.c.b(ro0.a.a).a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 9:
                    num = num8;
                    dfVar = (df) aa.c.b(qz0.a.x).a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 10:
                    Boolean bool13 = bool7;
                    num3 = num7;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    bool5 = bool11;
                    bool6 = bool12;
                    long nextLong2 = eVar.nextLong();
                    if (nextLong2 > 2147483647L) {
                        while (nextLong2 > 2147483647L) {
                            nextLong2 = f4.c(1, nextLong2, "substring(...)");
                        }
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    } else {
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    }
                    num5 = valueOf2;
                    num4 = num8;
                    str = str5;
                    bool7 = bool13;
                    num7 = num3;
                    bool8 = bool2;
                    bool9 = bool3;
                    bool10 = bool4;
                    bool11 = bool5;
                    bool12 = bool6;
                case 11:
                    Boolean bool14 = bool7;
                    Integer num9 = num5;
                    bool2 = bool8;
                    bool3 = bool9;
                    bool4 = bool10;
                    bool5 = bool11;
                    bool6 = bool12;
                    long nextLong3 = eVar.nextLong();
                    if (nextLong3 > 2147483647L) {
                        while (nextLong3 > 2147483647L) {
                            nextLong3 = f4.c(1, nextLong3, "substring(...)");
                        }
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    } else {
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    }
                    num7 = valueOf3;
                    num4 = num8;
                    str = str5;
                    bool7 = bool14;
                    num5 = num9;
                    bool8 = bool2;
                    bool9 = bool3;
                    bool10 = bool4;
                    bool11 = bool5;
                    bool12 = bool6;
                case 12:
                    num = num8;
                    bool8 = (Boolean) aa.c.f.a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 13:
                    num = num8;
                    bool9 = (Boolean) aa.c.f.a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 14:
                    num = num8;
                    bool10 = (Boolean) aa.c.f.a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 15:
                    num = num8;
                    o7.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 16:
                    num = num8;
                    bool11 = (Boolean) aa.c.f.a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 17:
                    num = num8;
                    bool12 = (Boolean) aa.c.f.a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 18:
                    num = num8;
                    mVar = (m) aa.c.b(aa.c.c(q.a, true)).a(eVar, wVar);
                    num4 = num;
                    str = str5;
                case 19:
                    num = num8;
                    oVar = (o) aa.c.c(t.a, true).a(eVar, wVar);
                    num4 = num;
                    str = str5;
            }
            eVar.s0();
            g6 g6Var = g6.a;
            d6 c = g6.c(eVar, wVar);
            eVar.s0();
            uu0.r0 c2 = uu0.u0.c(eVar, wVar);
            if (str5 == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (num8 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool15 = bool7;
            int intValue = num8.intValue();
            if (str4 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (bool15 == null) {
                k41.b.B(eVar, "locked");
                throw null;
            }
            Integer num10 = num5;
            boolean booleanValue = bool15.booleanValue();
            if (bfVar == null) {
                k41.b.B(eVar, "issueState");
                throw null;
            }
            if (zonedDateTime == null) {
                k41.b.B(eVar, "updatedAt");
                throw null;
            }
            if (num10 == null) {
                k41.b.B(eVar, "completedTasksCount");
                throw null;
            }
            Integer num11 = num7;
            int intValue2 = num10.intValue();
            if (num11 == null) {
                k41.b.B(eVar, "totalTaskCount");
                throw null;
            }
            Boolean bool16 = bool8;
            int intValue3 = num11.intValue();
            if (bool16 == null) {
                k41.b.B(eVar, "viewerCanReopen");
                throw null;
            }
            Boolean bool17 = bool9;
            boolean booleanValue2 = bool16.booleanValue();
            if (bool17 == null) {
                k41.b.B(eVar, "viewerCanUpdate");
                throw null;
            }
            Boolean bool18 = bool10;
            boolean booleanValue3 = bool17.booleanValue();
            if (bool18 == null) {
                k41.b.B(eVar, "viewerDidAuthor");
                throw null;
            }
            Boolean bool19 = bool11;
            boolean booleanValue4 = bool18.booleanValue();
            if (zonedDateTime2 == null) {
                k41.b.B(eVar, "createdAt");
                throw null;
            }
            if (bool19 == null) {
                k41.b.B(eVar, "viewerCanAssign");
                throw null;
            }
            Boolean bool20 = bool12;
            boolean booleanValue5 = bool19.booleanValue();
            if (bool20 == null) {
                k41.b.B(eVar, "viewerCanLabel");
                throw null;
            }
            boolean booleanValue6 = bool20.booleanValue();
            if (oVar != null) {
                return new p(str5, str2, str3, intValue, str4, booleanValue, bfVar, zonedDateTime, num6, dfVar, intValue2, intValue3, booleanValue2, booleanValue3, booleanValue4, zonedDateTime2, booleanValue5, booleanValue6, mVar, oVar, c, c2);
            }
            k41.b.B(eVar, "repository");
            throw null;
        }
    }
}
