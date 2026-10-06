package e50;

import hc0.h6;
import hc0.p3;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class q0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "title", "updatedAt", "createdAt", "lastEditedAt", "number", "viewerDidAuthor", "viewerCanUpdate", "viewerCanUpvote", "authorAssociation", "url", "repository", "answerChosenAt", "answer", "category", "author", "comments", "poll"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0035. Please report as an issue. */
    public static l0 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Integer valueOf;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        ZonedDateTime zonedDateTime3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        p3 p3Var = null;
        String str4 = null;
        k0 k0Var = null;
        ZonedDateTime zonedDateTime4 = null;
        c0 c0Var = null;
        e0 e0Var = null;
        d0 d0Var = null;
        f0 f0Var = null;
        i0 i0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            aa.xShadow xVar = h6.a;
            Integer num3 = num2;
            switch (r0) {
                case 0:
                    num = num3;
                    str = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 1:
                    num = num3;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 2:
                    num = num3;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 3:
                    num = num3;
                    h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    num2 = num;
                case 4:
                    num = num3;
                    h6.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    num2 = num;
                case 5:
                    num = num3;
                    h6.Companion.getClass();
                    zonedDateTime3 = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                    num2 = num;
                case 6:
                    bool = bool4;
                    bool2 = bool5;
                    bool3 = bool6;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num2 = valueOf;
                    bool4 = bool;
                    bool5 = bool2;
                    bool6 = bool3;
                case 7:
                    num = num3;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 8:
                    num = num3;
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 9:
                    num = num3;
                    bool6 = (Boolean) aa.c.f.a(eVar, wVar);
                    num2 = num;
                case 10:
                    bool = bool4;
                    bool2 = bool5;
                    bool3 = bool6;
                    String u = eVar.u();
                    k71.k.d(u);
                    p3.Companion.getClass();
                    Iterator it = p3.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((p3) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    p3 p3Var2 = (p3) obj;
                    p3Var = p3Var2 == null ? p3.t : p3Var2;
                    num2 = num3;
                    bool4 = bool;
                    bool5 = bool2;
                    bool6 = bool3;
                case 11:
                    num = num3;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    num2 = num;
                case 12:
                    num = num3;
                    k0Var = (k0) aa.c.c(v0.a, false).a(eVar, wVar);
                    num2 = num;
                case 13:
                    num = num3;
                    h6.Companion.getClass();
                    zonedDateTime4 = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                    num2 = num;
                case 14:
                    num = num3;
                    c0Var = (c0) aa.c.b(aa.c.c(m0.a, true)).a(eVar, wVar);
                    num2 = num;
                case 15:
                    num = num3;
                    e0Var = (e0) aa.c.c(o0.a, true).a(eVar, wVar);
                    num2 = num;
                case 16:
                    num = num3;
                    d0Var = (d0) aa.c.b(aa.c.c(n0.a, true)).a(eVar, wVar);
                    num2 = num;
                case 17:
                    num = num3;
                    f0Var = (f0) aa.c.c(p0.a, false).a(eVar, wVar);
                    num2 = num;
                case 18:
                    num = num3;
                    i0Var = (i0) aa.c.b(aa.c.c(t0.a, true)).a(eVar, wVar);
                    num2 = num;
            }
            eVar.s0();
            c60.j c = c60.n.c(eVar, wVar);
            eVar.s0();
            d1 c2 = e1.c(eVar, wVar);
            eVar.s0();
            l lVar = l.a;
            j c3 = l.c(eVar, wVar);
            if (str == null) {
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
            if (zonedDateTime == null) {
                k41.b.B(eVar, "updatedAt");
                throw null;
            }
            if (zonedDateTime2 == null) {
                k41.b.B(eVar, "createdAt");
                throw null;
            }
            if (num3 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool7 = bool4;
            int intValue = num3.intValue();
            if (bool7 == null) {
                k41.b.B(eVar, "viewerDidAuthor");
                throw null;
            }
            Boolean bool8 = bool5;
            boolean booleanValue = bool7.booleanValue();
            if (bool8 == null) {
                k41.b.B(eVar, "viewerCanUpdate");
                throw null;
            }
            Boolean bool9 = bool6;
            boolean booleanValue2 = bool8.booleanValue();
            if (bool9 == null) {
                k41.b.B(eVar, "viewerCanUpvote");
                throw null;
            }
            boolean booleanValue3 = bool9.booleanValue();
            if (p3Var == null) {
                k41.b.B(eVar, "authorAssociation");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (k0Var == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (e0Var == null) {
                k41.b.B(eVar, "category");
                throw null;
            }
            if (f0Var != null) {
                return new l0(str, str2, str3, zonedDateTime, zonedDateTime2, zonedDateTime3, intValue, booleanValue, booleanValue2, booleanValue3, p3Var, str4, k0Var, zonedDateTime4, c0Var, e0Var, d0Var, f0Var, i0Var, c, c2, c3);
            }
            k41.b.B(eVar, "comments");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, l0 l0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, l0Var.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, l0Var.c);
        fVar.z0("updatedAt");
        h6.Companion.getClass();
        aa.xShadow xVar = h6.a;
        wVar.e(xVar).b(fVar, wVar, l0Var.d);
        fVar.z0("createdAt");
        wVar.e(xVar).b(fVar, wVar, l0Var.e);
        no.a.e(fVar, "lastEditedAt", wVar, xVar).b(fVar, wVar, l0Var.f);
        fVar.z0("number");
        fVar.z(l0Var.g);
        fVar.z0("viewerDidAuthor");
        aa.b bVar2 = aa.c.f;
        f4.C(l0Var.h, bVar2, fVar, wVar, "viewerCanUpdate");
        f4.C(l0Var.i, bVar2, fVar, wVar, "viewerCanUpvote");
        f4.C(l0Var.j, bVar2, fVar, wVar, "authorAssociation");
        fVar.I(l0Var.k.r);
        fVar.z0("url");
        bVar.b(fVar, wVar, l0Var.l);
        fVar.z0("repository");
        aa.c.c(v0.a, false).b(fVar, wVar, l0Var.m);
        no.a.e(fVar, "answerChosenAt", wVar, xVar).b(fVar, wVar, l0Var.n);
        fVar.z0("answer");
        aa.c.b(aa.c.c(m0.a, true)).b(fVar, wVar, l0Var.o);
        fVar.z0("category");
        aa.c.c(o0.a, true).b(fVar, wVar, l0Var.p);
        fVar.z0("author");
        aa.c.b(aa.c.c(n0.a, true)).b(fVar, wVar, l0Var.q);
        fVar.z0("comments");
        aa.c.c(p0.a, false).b(fVar, wVar, l0Var.r);
        fVar.z0("poll");
        aa.c.b(aa.c.c(t0.a, true)).b(fVar, wVar, l0Var.s);
        List list = c60.n.a;
        c60.n.d(fVar, wVar, l0Var.t);
        List list2 = e1.a;
        e1.d(fVar, wVar, l0Var.u);
        l lVar = l.a;
        l.d(fVar, wVar, l0Var.v);
    }
}
