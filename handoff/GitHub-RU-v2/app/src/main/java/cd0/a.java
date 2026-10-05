package cd0;

import aa.t0;
import aa.u0;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.WorkflowRunEvent;
import com.github.service.models.response.type.StatusState;
import d3.c0;
import gn0.jr;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import mn.f;
import mn.h;
import mn.j;
import mn.s;
import mn.u;
import mn.w;
import mn.x;
import rc0.c2;
import rc0.d2;
import rc0.e2;
import rc0.f2;
import rc0.g2;
import rc0.j1;
import rc0.j2;
import rc0.k1;
import rc0.k2;
import rc0.l1;
import rc0.m1;
import rc0.m2;
import rc0.n1;
import rc0.q1;
import rc0.q2;
import rc0.r1;
import rc0.s1;
import rc0.t1;
import rc0.x1;
import rc0.y1;
import rc0.z1;
import sy.a0;
import sy.q;
import sy.t;
import sy.y;
import wc0.a1;
import wc0.a2;
import wc0.b2;
import wc0.g;
import wc0.h2;
import wc0.i2;
import wc0.k;
import wc0.l;
import wc0.m;
import wc0.n2;
import wc0.o;
import wc0.o2;
import wc0.p2;
import wc0.r;
import wc0.r0;
import wc0.r2;
import wc0.t2;
import wc0.u1;
import wc0.v;
import wc0.v0;
import wc0.v1;
import wc0.v2;
import wc0.w0;
import wc0.w1;
import wc0.x0;
import wc0.z0;
import x01.i;
import x61.n;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class a implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ a(int i) {
        this.r = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.List, x61.r] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    @Override // j71.c
    public final Object k(Object obj) {
        m1 m1Var;
        ArrayList arrayList;
        i iVar;
        j jVar;
        List<l> list;
        List list2;
        m mVar;
        List<k> list3;
        s1 s1Var;
        a1 a1Var;
        v0 v0Var;
        List list4;
        s1 s1Var2;
        a1 a1Var2;
        v0 v0Var2;
        x0 x0Var;
        s1 s1Var3;
        a1 a1Var3;
        v0 v0Var3;
        y1 y1Var;
        StatusState statusState;
        ArrayList arrayList2;
        h hVar;
        f fVar;
        mn.m mVar2;
        e2 e2Var;
        f2 f2Var;
        i2 i2Var;
        List list5;
        e2 e2Var2;
        f2 f2Var2;
        i2 i2Var2;
        h2 h2Var;
        e2 e2Var3;
        f2 f2Var3;
        i2 i2Var3;
        k2 k2Var;
        u uVar;
        v2 v2Var;
        List list6;
        r2 r2Var;
        q2 q2Var;
        w1 w1Var;
        List list7;
        q2 q2Var2;
        w1 w1Var2;
        v1 v1Var;
        q2 q2Var3;
        w1 w1Var3;
        a2 a2Var;
        v7.c F0;
        switch (this.r) {
            case 0:
                k1 k1Var = (k1) obj;
                k71.k.g(k1Var, "data");
                l1 l1Var = k1Var.a;
                if (l1Var == null || (m1Var = l1Var.c) == null) {
                    return null;
                }
                n1 n1Var = m1Var.d;
                v vVar = m1Var.f;
                g gVar = vVar.n;
                wc0.i iVar2 = vVar.o;
                r rVar = vVar.h;
                wc0.h hVar2 = vVar.k;
                java.util.List r9 = (java.util.List) (x61.r.r);
                if (gVar == null || (list3 = gVar.c) == null) {
                    arrayList = r9;
                } else {
                    arrayList = new ArrayList();
                    for (k kVar : list3) {
                        mn.a b = kVar != null ? yc0.a.b(kVar.c, n1Var != null ? n1Var.c.i.c : null) : null;
                        if (b != null) {
                            arrayList.add(b);
                        }
                    }
                }
                int i = gVar != null ? gVar.a : 0;
                if (gVar != null) {
                    o oVar = gVar.b;
                    iVar = new i(oVar.c, oVar.a, !oVar.b);
                } else {
                    iVar = new i(null, false, true);
                }
                mn.e eVar = new mn.e(i, arrayList, iVar);
                String str = vVar.a;
                wc0.e eVar2 = hVar2.c;
                String str2 = (eVar2 == null || (list2 = eVar2.a) == null || (mVar = (m) x61.m.W(list2)) == null) ? n1Var != null ? n1Var.c.i.c : "" : mVar.b;
                CheckStatusState n = sy.u.n(vVar.b);
                CheckConclusionState u = t.u(vVar.c);
                int i2 = gVar != null ? gVar.a : 0;
                mn.m i3 = y.i(vVar);
                if (iVar2 != null && (list = iVar2.b) != null) {
                    r9 = new ArrayList();
                    for (l lVar : list) {
                        mn.a b2 = lVar != null ? yc0.a.b(lVar.c, n1Var != null ? n1Var.c.i.c : null) : null;
                        if (b2 != null) {
                            r9.add(b2);
                        }
                    }
                }
                mn.e eVar3 = new mn.e(iVar2 != null ? iVar2.a : 0, (List) r9, new i(null, false, true));
                com.github.service.models.response.a d = aa1.b.d(rVar.c.b);
                String str3 = rVar.b;
                String str4 = hVar2.b;
                String str5 = hVar2.a;
                wc0.f fVar2 = vVar.j;
                String str6 = fVar2 != null ? fVar2.b : null;
                j1 j1Var = m1Var.c;
                com.github.service.models.response.a d2 = aa1.b.d(j1Var != null ? j1Var.c : null);
                if (n1Var != null) {
                    String str7 = n1Var.b;
                    r0 r0Var = n1Var.c;
                    jVar = new j(str7, r0Var.i.c, r0Var.d, r0Var.e, r0Var.c, r0Var.b, r0Var.f, r0Var.h);
                } else {
                    jVar = null;
                }
                String str8 = vVar.d;
                jr jrVar = rVar.d;
                int i4 = jrVar == null ? -1 : zl0.a.a[jrVar.ordinal()];
                boolean z = i4 == 1 || i4 == 2 || i4 == 3;
                boolean z2 = vVar.l;
                int i5 = vVar.e;
                wc0.d dVar = vVar.g;
                Integer valueOf = dVar != null ? Integer.valueOf(dVar.a) : null;
                wc0.c cVar = vVar.m;
                return new mn.g(str, str2, d, str3, str4, str5, str6, d2, n, u, i2, i3, eVar, eVar3, jVar, str8, z, z2, i5, valueOf, cVar != null ? new Avatar(cVar.c, Avatar.Type.Organization) : null, t.v(n1Var != null ? n1Var.c.g : null));
            case 1:
                c cVar2 = (c) obj;
                k71.k.g(cVar2, "id");
                String str9 = cVar2.a;
                u0 u0Var = new u0(100);
                String str10 = cVar2.b;
                return new rc0.a2(str9, u0Var, str10 == null ? t0.d : new u0(str10), new u0(Boolean.valueOf(str10 != null)));
            case 2:
                c cVar3 = (c) obj;
                k71.k.g(cVar3, "id");
                String str11 = cVar3.a;
                u0 u0Var2 = new u0(100);
                String str12 = cVar3.b;
                return new t1(str11, u0Var2, null, str12 == null ? t0.d : new u0(str12), new u0(Boolean.valueOf(str12 != null)), 12);
            case 3:
                q1 q1Var = (q1) obj;
                k71.k.g(q1Var, "data");
                r1 r1Var = q1Var.a;
                return Boolean.valueOf((r1Var == null || (s1Var = r1Var.c) == null || (a1Var = s1Var.c) == null || (v0Var = a1Var.b) == null || (list4 = v0Var.c) == null) ? false : !list4.isEmpty());
            case 4:
                q1 q1Var2 = (q1) obj;
                k71.k.g(q1Var2, "data");
                r1 r1Var2 = q1Var2.a;
                if (r1Var2 == null || (s1Var2 = r1Var2.c) == null || (a1Var2 = s1Var2.c) == null || (v0Var2 = a1Var2.b) == null || (x0Var = v0Var2.b) == null) {
                    return null;
                }
                return new i(x0Var.c, x0Var.a, !x0Var.b);
            case 5:
                q1 q1Var3 = (q1) obj;
                k71.k.g(q1Var3, "data");
                r1 r1Var3 = q1Var3.a;
                List list8 = (r1Var3 == null || (s1Var3 = r1Var3.c) == null || (a1Var3 = s1Var3.c) == null || (v0Var3 = a1Var3.b) == null) ? null : v0Var3.c;
                return list8 == null ? x61.r.r : list8;
            case 6:
                rc0.w1 w1Var4 = (rc0.w1) obj;
                k71.k.g(w1Var4, "data");
                x1 x1Var = w1Var4.a;
                if (x1Var == null || (y1Var = x1Var.c) == null) {
                    return null;
                }
                z1 z1Var = y1Var.c;
                v0 v0Var4 = y1Var.d.b;
                mn.m mVar3 = mn.m.g;
                if (v0Var4 != null) {
                    List<w0> list9 = v0Var4.c;
                    if (list9 != null) {
                        mVar2 = null;
                        for (w0 w0Var : list9) {
                            if (w0Var != null) {
                                mn.m i6 = y.i(w0Var.e);
                                mVar2 = mVar2 != null ? new mn.m(mVar2.a + i6.a, mVar2.b + i6.b, mVar2.c + i6.c, mVar2.d + i6.d, mVar2.e + i6.e, mVar2.f + i6.f) : i6;
                            }
                        }
                    } else {
                        mVar2 = null;
                    }
                    if (mVar2 == null) {
                        mn.m.Companion.getClass();
                    } else {
                        mVar3 = mVar2;
                    }
                } else {
                    mn.m.Companion.getClass();
                }
                mn.m mVar4 = mVar3;
                String str13 = y1Var.b;
                if (z1Var == null || (statusState = q.o(z1Var.a)) == null) {
                    statusState = StatusState.UNKNOWN__;
                }
                StatusState statusState2 = statusState;
                java.util.List r5 = (java.util.List) (x61.r.r);
                if (z1Var != null) {
                    ArrayList arrayList3 = z1Var.b;
                    ArrayList arrayList4 = new ArrayList(n.F(arrayList3, 10));
                    int size = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj2 = arrayList3.get(i7);
                        i7++;
                        arrayList4.add(yc0.a.a(((rc0.v1) obj2).c));
                    }
                    arrayList2 = arrayList4;
                } else {
                    arrayList2 = r5;
                }
                if (v0Var4 == null) {
                    hVar = new h((List) r5, new i(null, false, true));
                } else {
                    x0 x0Var2 = v0Var4.b;
                    i iVar3 = new i(x0Var2.c, x0Var2.a, !x0Var2.b);
                    List<w0> list10 = v0Var4.c;
                    if (list10 != null) {
                        r5 = new ArrayList();
                        for (w0 w0Var2 : list10) {
                            if (w0Var2 != null) {
                                wc0.u0 u0Var3 = w0Var2.c;
                                v vVar2 = w0Var2.e;
                                String str14 = vVar2.a;
                                z0 z0Var = w0Var2.b;
                                fVar = new f(str14, z0Var != null ? z0Var.b.b : u0Var3 != null ? u0Var3.b : "", u0Var3 != null ? u0Var3.c : null, sy.u.n(vVar2.b), t.u(vVar2.c), a0.c(vVar2.n, z0Var != null ? z0Var.b.b : null), z0Var != null ? z0Var.a : null);
                            } else {
                                fVar = null;
                            }
                            if (fVar != null) {
                                r5.add(fVar);
                            }
                        }
                    }
                    hVar = new h((List) r5, iVar3);
                }
                return new mn.i(str13, statusState2, mVar4, arrayList2, hVar);
            case 7:
                String str15 = (String) obj;
                k71.k.g(str15, "id");
                return new m2(str15);
            case 8:
                String str16 = (String) obj;
                k71.k.g(str16, "id");
                return new g2(str16, t0.d);
            case 9:
                c2 c2Var = (c2) obj;
                k71.k.g(c2Var, "it");
                d2 d2Var = c2Var.a;
                return Boolean.valueOf((d2Var == null || (e2Var = d2Var.c) == null || (f2Var = e2Var.b) == null || (i2Var = f2Var.b) == null || (list5 = i2Var.b) == null) ? false : !list5.isEmpty());
            case 10:
                c2 c2Var2 = (c2) obj;
                k71.k.g(c2Var2, "data");
                d2 d2Var2 = c2Var2.a;
                if (d2Var2 == null || (e2Var2 = d2Var2.c) == null || (f2Var2 = e2Var2.b) == null || (i2Var2 = f2Var2.b) == null || (h2Var = i2Var2.a) == null) {
                    return null;
                }
                return new i(h2Var.b, h2Var.a, !h2Var.c);
            case 11:
                c2 c2Var3 = (c2) obj;
                k71.k.g(c2Var3, "data");
                d2 d2Var3 = c2Var3.a;
                List list11 = (d2Var3 == null || (e2Var3 = d2Var3.c) == null || (f2Var3 = e2Var3.b) == null || (i2Var3 = f2Var3.b) == null) ? null : i2Var3.b;
                return list11 == null ? x61.r.r : list11;
            case 12:
                rc0.i2 i2Var4 = (rc0.i2) obj;
                k71.k.g(i2Var4, "data");
                j2 j2Var = i2Var4.a;
                if (j2Var == null || (k2Var = j2Var.c) == null) {
                    return null;
                }
                return (w) in.r.j(k2Var, "Invalid request for workflow runs.", new a(13));
            case 13:
                k2 k2Var2 = (k2) obj;
                k71.k.g(k2Var2, "$this$mapOrApiFailure");
                i2 i2Var5 = k2Var2.e.c;
                Iterable<wc0.g2> iterable = i2Var5.b;
                if (iterable == null) {
                    iterable = x61.r.r;
                }
                ArrayList arrayList5 = new ArrayList();
                for (wc0.g2 g2Var : iterable) {
                    if (g2Var == null || (v2Var = g2Var.c) == null) {
                        uVar = null;
                    } else {
                        n2 n2Var = v2Var.g;
                        wc0.q2 q2Var4 = n2Var.f;
                        wc0.m2 m2Var = n2Var.h;
                        mn.r rVar2 = (q2Var4 == null || (list6 = q2Var4.a) == null || (r2Var = (r2) x61.m.W(list6)) == null) ? null : new mn.r(r2Var.a, r2Var.b);
                        String str17 = v2Var.a;
                        int i8 = v2Var.c;
                        String str18 = v2Var.b;
                        String str19 = m2Var != null ? m2Var.b : null;
                        WorkflowRunEvent v = t.v(v2Var.d);
                        ZonedDateTime zonedDateTime = v2Var.e;
                        String str20 = n2Var.a;
                        CheckStatusState n2 = sy.u.n(n2Var.b);
                        o2 o2Var = n2Var.i;
                        s sVar = new s(str20, n2, o2Var != null ? o2Var.b : null, n2Var.g, t.u(n2Var.c), m2Var != null ? m2Var.b : null, rVar2);
                        String str21 = v2Var.f.b;
                        String str22 = n2Var.d;
                        t2 t2Var = n2Var.e;
                        String str23 = t2Var.b;
                        String str24 = t2Var.c.b;
                        p2 p2Var = t2Var.e;
                        String str25 = p2Var != null ? p2Var.b : null;
                        jr jrVar2 = t2Var.d;
                        int i9 = jrVar2 == null ? -1 : zl0.a.a[jrVar2.ordinal()];
                        uVar = new u(str17, str18, i8, str19, zonedDateTime, v, sVar, str21, str22, new mn.t(str23, str24, str25, i9 == 1 || i9 == 2 || i9 == 3));
                    }
                    if (uVar != null) {
                        arrayList5.add(uVar);
                    }
                }
                h2 h2Var2 = i2Var5.a;
                return new w(k2Var2.b, k2Var2.c, sy.u.o(k2Var2.d), arrayList5, new i(h2Var2.b, h2Var2.a, false), false);
            case 14:
                e eVar4 = (e) obj;
                k71.k.g(eVar4, "<destruct>");
                return new rc0.r2(t0.d, eVar4.a, eVar4.b);
            case 15:
                rc0.o2 o2Var2 = (rc0.o2) obj;
                k71.k.g(o2Var2, "it");
                rc0.p2 p2Var2 = o2Var2.a;
                return Boolean.valueOf((p2Var2 == null || (q2Var = p2Var2.b) == null || (w1Var = q2Var.b) == null || (list7 = w1Var.a) == null) ? false : !list7.isEmpty());
            case 16:
                rc0.o2 o2Var3 = (rc0.o2) obj;
                k71.k.g(o2Var3, "data");
                rc0.p2 p2Var3 = o2Var3.a;
                if (p2Var3 == null || (q2Var2 = p2Var3.b) == null || (w1Var2 = q2Var2.b) == null || (v1Var = w1Var2.b) == null) {
                    return null;
                }
                return new i(v1Var.b, v1Var.a, !v1Var.c);
            case 17:
                rc0.o2 o2Var4 = (rc0.o2) obj;
                k71.k.g(o2Var4, "data");
                rc0.p2 p2Var4 = o2Var4.a;
                List list12 = (p2Var4 == null || (q2Var3 = p2Var4.b) == null || (w1Var3 = q2Var3.b) == null) ? null : w1Var3.a;
                return list12 == null ? x61.r.r : list12;
            case 18:
                rc0.o2 o2Var5 = (rc0.o2) obj;
                k71.k.g(o2Var5, "data");
                rc0.p2 p2Var5 = o2Var5.a;
                return (x) in.r.j(p2Var5 != null ? p2Var5.b : null, "Invalid request for workflows.", new a(19));
            case 19:
                q2 q2Var5 = (q2) obj;
                k71.k.g(q2Var5, "$this$mapOrApiFailure");
                w1 w1Var5 = q2Var5.b;
                Iterable<u1> iterable2 = w1Var5.a;
                if (iterable2 == null) {
                    iterable2 = x61.r.r;
                }
                ArrayList arrayList6 = new ArrayList();
                for (u1 u1Var : iterable2) {
                    ZonedDateTime zonedDateTime2 = null;
                    if (u1Var != null) {
                        wc0.c2 c2Var4 = u1Var.c;
                        String str26 = c2Var4.a;
                        String str27 = c2Var4.b;
                        b2 b2Var = c2Var4.d;
                        List list13 = b2Var.b;
                        if (list13 != null && (a2Var = (a2) x61.m.W(list13)) != null) {
                            zonedDateTime2 = a2Var.a;
                        }
                        zonedDateTime2 = new mn.n(str26, str27, zonedDateTime2, b2Var.a, sy.u.o(c2Var4.c));
                    }
                    if (zonedDateTime2 != null) {
                        arrayList6.add(zonedDateTime2);
                    }
                }
                v1 v1Var2 = w1Var5.b;
                return new x(arrayList6, new i(v1Var2.b, v1Var2.a, false));
            case 20:
                v7.a aVar = (v7.a) obj;
                k71.k.g(aVar, "_connection");
                F0 = aVar.F0("DELETE FROM recent_searches WHERE `query` NOT IN (SELECT `query` FROM recent_searches ORDER BY performed_at DESC LIMIT 15)");
                try {
                    F0.B0();
                    F0.close();
                    return w61.a0.a;
                } finally {
                }
            case 21:
                v7.a aVar2 = (v7.a) obj;
                k71.k.g(aVar2, "_connection");
                F0 = aVar2.F0("SELECT * FROM recent_searches ORDER BY performed_at DESC LIMIT 15");
                try {
                    int o = y9.a.o(F0, "query");
                    int o2 = y9.a.o(F0, "performed_at");
                    ArrayList arrayList7 = new ArrayList();
                    while (F0.B0()) {
                        arrayList7.add(new ck.h(F0.l0(o), F0.getLong(o2)));
                    }
                    return arrayList7;
                } finally {
                }
            case 22:
                v7.a aVar3 = (v7.a) obj;
                k71.k.g(aVar3, "_connection");
                F0 = aVar3.F0("DELETE FROM recent_searches");
                try {
                    F0.B0();
                    F0.close();
                    return w61.a0.a;
                } finally {
                }
            case 23:
                k71.k.g((fl.b) obj, "it");
                return w61.a0.a;
            case 24:
                f2.d dVar2 = (f2.d) obj;
                k71.k.g(dVar2, "$this$drawBehind");
                f2.d.R(dVar2, d2.t.b(0.2f, d2.t.d), c2.e.d(dVar2.a()), 0L, 0.0f, (f2.e) null, 124);
                return w61.a0.a;
            case 25:
                m0.f fVar3 = (m0.f) obj;
                k71.k.g(fVar3, "$this$LazyColumn");
                for (int i10 = 0; i10 < 10; i10++) {
                    m0.f.q(fVar3, (String) null, com.github.rudroid.achievements.ui.f.a, 3);
                }
                return w61.a0.a;
            case 26:
                mn.d dVar3 = (mn.d) obj;
                mn.a aVar4 = dVar3 != null ? dVar3.b : null;
                return Boolean.valueOf((aVar4 != null ? aVar4.f : null) == CheckConclusionState.CANCELLED);
            case 27:
                mn.d dVar4 = (mn.d) obj;
                return Boolean.valueOf(com.github.rudroid.actions.checkdetail.t0.a(dVar4 != null ? dVar4.b : null));
            case 28:
                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                return w61.a0.a;
            default:
                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                return w61.a0.a;
        }
    }
}
