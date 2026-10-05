package f00;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import m10.b00;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class x implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "title", "number", "url", "locked", "pullRequestState", "isDraft", "isInMergeQueue", "updatedAt", "createdAt", "totalCommentsCount", "completedTasksCount", "totalTaskCount", "baseRefName", "headRefName", "viewerCanReopen", "viewerCanUpdate", "viewerDidAuthor", "viewerCanAssign", "viewerCanLabel"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0041. Please report as an issue. */
    public static w c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Integer num;
        Integer num2;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Integer valueOf;
        Object obj;
        Integer valueOf2;
        Integer valueOf3;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool9 = null;
        String str4 = null;
        Boolean bool10 = null;
        b00 b00Var = null;
        Boolean bool11 = null;
        Integer num4 = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        Integer num5 = null;
        Integer num6 = null;
        Boolean bool12 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool13 = null;
        Boolean bool14 = null;
        Boolean bool15 = null;
        Boolean bool16 = null;
        while (true) {
            int r0 = eVar.r0(a);
            aa.x xVar = sa.a;
            Integer num7 = num3;
            String str7 = str;
            switch (r0) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    num3 = num7;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 3:
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    num = num4;
                    num2 = num6;
                    bool4 = bool12;
                    bool5 = bool13;
                    bool6 = bool14;
                    bool7 = bool15;
                    bool8 = bool16;
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
                    str = str7;
                    bool9 = bool;
                    bool10 = bool2;
                    bool11 = bool3;
                    num4 = num;
                    num6 = num2;
                    bool12 = bool4;
                    bool13 = bool5;
                    bool14 = bool6;
                    bool15 = bool7;
                    bool16 = bool8;
                case 4:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 5:
                    bool9 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 6:
                    bool = bool9;
                    bool2 = bool10;
                    bool3 = bool11;
                    num = num4;
                    num2 = num6;
                    bool4 = bool12;
                    bool5 = bool13;
                    bool6 = bool14;
                    bool7 = bool15;
                    bool8 = bool16;
                    String u = eVar.u();
                    k71.k.d(u);
                    b00.Companion.getClass();
                    Iterator it = b00.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((b00) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    b00 b00Var2 = (b00) obj;
                    b00Var = b00Var2 == null ? b00.v : b00Var2;
                    num3 = num7;
                    str = str7;
                    bool9 = bool;
                    bool10 = bool2;
                    bool11 = bool3;
                    num4 = num;
                    num6 = num2;
                    bool12 = bool4;
                    bool13 = bool5;
                    bool14 = bool6;
                    bool15 = bool7;
                    bool16 = bool8;
                case 7:
                    bool10 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 8:
                    bool11 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 9:
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 10:
                    sa.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 11:
                    num5 = (Integer) aa.c.b(tp.a.a).a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 12:
                    Boolean bool17 = bool9;
                    Boolean bool18 = bool10;
                    Boolean bool19 = bool11;
                    num2 = num6;
                    bool4 = bool12;
                    bool5 = bool13;
                    bool6 = bool14;
                    bool7 = bool15;
                    bool8 = bool16;
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
                    num3 = num7;
                    str = str7;
                    bool9 = bool17;
                    bool10 = bool18;
                    bool11 = bool19;
                    num6 = num2;
                    bool12 = bool4;
                    bool13 = bool5;
                    bool14 = bool6;
                    bool15 = bool7;
                    bool16 = bool8;
                case 13:
                    Boolean bool20 = bool9;
                    Boolean bool21 = bool10;
                    Boolean bool22 = bool11;
                    Integer num8 = num4;
                    bool4 = bool12;
                    bool5 = bool13;
                    bool6 = bool14;
                    bool7 = bool15;
                    bool8 = bool16;
                    long nextLong3 = eVar.nextLong();
                    if (nextLong3 > 2147483647L) {
                        while (nextLong3 > 2147483647L) {
                            nextLong3 = f4.c(1, nextLong3, "substring(...)");
                        }
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    } else {
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    }
                    num6 = valueOf3;
                    num3 = num7;
                    str = str7;
                    bool9 = bool20;
                    bool10 = bool21;
                    bool11 = bool22;
                    num4 = num8;
                    bool12 = bool4;
                    bool13 = bool5;
                    bool14 = bool6;
                    bool15 = bool7;
                    bool16 = bool8;
                case 14:
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 15:
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 16:
                    bool12 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 17:
                    bool13 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 18:
                    bool14 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 19:
                    bool15 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
                case 20:
                    bool16 = (Boolean) aa.c.f.a(eVar, wVar);
                    num3 = num7;
                    str = str7;
            }
            eVar.s0();
            rt.e c = rt.g.c(eVar, wVar);
            if (str7 == null) {
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
            if (num7 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool23 = bool9;
            int intValue = num7.intValue();
            if (str4 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (bool23 == null) {
                k41.b.B(eVar, "locked");
                throw null;
            }
            Boolean bool24 = bool10;
            boolean booleanValue = bool23.booleanValue();
            if (b00Var == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (bool24 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            Boolean bool25 = bool11;
            boolean booleanValue2 = bool24.booleanValue();
            if (bool25 == null) {
                k41.b.B(eVar, "isInMergeQueue");
                throw null;
            }
            Integer num9 = num4;
            boolean booleanValue3 = bool25.booleanValue();
            if (zonedDateTime == null) {
                k41.b.B(eVar, "updatedAt");
                throw null;
            }
            if (zonedDateTime2 == null) {
                k41.b.B(eVar, "createdAt");
                throw null;
            }
            if (num9 == null) {
                k41.b.B(eVar, "completedTasksCount");
                throw null;
            }
            Integer num10 = num6;
            int intValue2 = num9.intValue();
            if (num10 == null) {
                k41.b.B(eVar, "totalTaskCount");
                throw null;
            }
            Boolean bool26 = bool12;
            int intValue3 = num10.intValue();
            if (str5 == null) {
                k41.b.B(eVar, "baseRefName");
                throw null;
            }
            if (str6 == null) {
                k41.b.B(eVar, "headRefName");
                throw null;
            }
            if (bool26 == null) {
                k41.b.B(eVar, "viewerCanReopen");
                throw null;
            }
            Boolean bool27 = bool13;
            boolean booleanValue4 = bool26.booleanValue();
            if (bool27 == null) {
                k41.b.B(eVar, "viewerCanUpdate");
                throw null;
            }
            Boolean bool28 = bool14;
            boolean booleanValue5 = bool27.booleanValue();
            if (bool28 == null) {
                k41.b.B(eVar, "viewerDidAuthor");
                throw null;
            }
            Boolean bool29 = bool15;
            boolean booleanValue6 = bool28.booleanValue();
            if (bool29 == null) {
                k41.b.B(eVar, "viewerCanAssign");
                throw null;
            }
            Boolean bool30 = bool16;
            boolean booleanValue7 = bool29.booleanValue();
            if (bool30 != null) {
                return new w(str7, str2, str3, intValue, str4, booleanValue, b00Var, booleanValue2, booleanValue3, zonedDateTime, zonedDateTime2, num5, intValue2, intValue3, str5, str6, booleanValue4, booleanValue5, booleanValue6, booleanValue7, bool30.booleanValue(), c);
            }
            k41.b.B(eVar, "viewerCanLabel");
            throw null;
        }
    }
}
