package bp;

import aa.t0;
import aa.u0;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.WorkflowRunEvent;
import com.github.service.models.response.type.StatusState;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import jo.gh;
import m10.n40;
import mn.e;
import mn.f;
import mn.h;
import mn.j;
import mn.s;
import mn.t;
import mn.u;
import mn.w;
import mn.xShadow;
import qo.a3;
import qo.c3;
import qo.d3;
import qo.e3;
import qo.f3;
import qo.h0;
import qo.j0;
import qo.j1;
import qo.k0;
import qo.k1;
import qo.l0;
import qo.l1;
import qo.m0;
import qo.m1;
import qo.n0;
import qo.n1;
import qo.o1;
import qo.q0;
import qo.q1;
import qo.q2;
import qo.r0;
import qo.r1;
import qo.r2;
import qo.s0;
import qo.s1;
import qo.s2;
import qo.t1;
import qo.t2;
import qo.u2;
import qo.w2;
import qo.x1;
import qo.x2;
import qo.y1;
import qo.y2;
import qo.z1;
import sy.a0;
import sy.y;
import vo.a1;
import vo.a2;
import vo.b2;
import vo.c2;
import vo.g;
import vo.k;
import vo.k2;
import vo.l;
import vo.l2;
import vo.m;
import vo.m2;
import vo.o;
import vo.u1;
import vo.v;
import vo.v0;
import vo.v1;
import vo.v2;
import vo.w0;
import vo.w1;
import vo.x0;
import vo.z0;
import vo.z2;
import x01.i;
import x61.n;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ a(int i) {
        this.r = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v27, types: [mn.n] */
    public final Object k(Object obj) {
        l0 l0Var;
        v vVar;
        g gVar;
        List list;
        l0 l0Var2;
        v vVar2;
        g gVar2;
        o oVar;
        l0 l0Var3;
        v vVar3;
        g gVar3;
        l0 l0Var4;
        String str;
        CheckStatusState checkStatusState;
        e eVar;
        String str2;
        String str3;
        String str4;
        CheckConclusionState checkConclusionState;
        String str5;
        m0 m0Var;
        m0 m0Var2;
        s0 s0Var;
        v vVar4;
        g gVar4;
        List list2;
        s0 s0Var2;
        v vVar5;
        g gVar5;
        o oVar2;
        s0 s0Var3;
        v vVar6;
        g gVar6;
        m1 m1Var;
        ArrayList arrayList;
        i iVar;
        j jVar;
        List<l> list3;
        List list4;
        m mVar;
        List<k> list5;
        s1 s1Var;
        a1 a1Var;
        v0 v0Var;
        List list6;
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
        s2 s2Var;
        t2 t2Var;
        m2 m2Var;
        List list7;
        s2 s2Var2;
        t2 t2Var2;
        m2 m2Var2;
        l2 l2Var;
        s2 s2Var3;
        t2 t2Var3;
        m2 m2Var3;
        y2 y2Var;
        u uVar;
        z2 z2Var;
        List list8;
        v2 v2Var;
        e3 e3Var;
        w1 w1Var;
        List list9;
        e3 e3Var2;
        w1 w1Var2;
        v1 v1Var;
        e3 e3Var3;
        w1 w1Var3;
        a2 a2Var;
        switch (this.r) {
            case 0:
                j0 j0Var = (j0) obj;
                k71.k.g(j0Var, "data");
                k0 k0Var = j0Var.a;
                return Boolean.valueOf((k0Var == null || (l0Var = k0Var.c) == null || (vVar = l0Var.d) == null || (gVar = vVar.n) == null || (list = gVar.c) == null) ? false : !list.isEmpty());
            case 1:
                j0 j0Var2 = (j0) obj;
                k71.k.g(j0Var2, "data");
                k0 k0Var2 = j0Var2.a;
                if (k0Var2 == null || (l0Var2 = k0Var2.c) == null || (vVar2 = l0Var2.d) == null || (gVar2 = vVar2.n) == null || (oVar = gVar2.b) == null) {
                    return null;
                }
                return new i(oVar.c, oVar.a, !oVar.b);
            case 2:
                j0 j0Var3 = (j0) obj;
                k71.k.g(j0Var3, "data");
                k0 k0Var3 = j0Var3.a;
                List list10 = (k0Var3 == null || (l0Var3 = k0Var3.c) == null || (vVar3 = l0Var3.d) == null || (gVar3 = vVar3.n) == null) ? null : gVar3.c;
                return list10 == null ? rShadow.r : list10;
            case 3:
                j0 j0Var4 = (j0) obj;
                k71.k.g(j0Var4, "data");
                k0 k0Var4 = j0Var4.a;
                if (k0Var4 == null || (l0Var4 = k0Var4.c) == null) {
                    return null;
                }
                v vVar7 = l0Var4.d;
                h0 h0Var = l0Var4.c;
                String str6 = vVar7.a;
                n0 n0Var = l0Var4.b;
                if (n0Var == null || (m0Var2 = n0Var.b) == null || (str = m0Var2.a) == null) {
                    str = h0Var != null ? h0Var.b : "";
                }
                String str7 = h0Var != null ? h0Var.c : null;
                CheckStatusState d0 = d5.d0(vVar7.b);
                CheckConclusionState w0 = i4.w0(vVar7.c);
                e b = a0.b(vVar7.n, (n0Var == null || (m0Var = n0Var.b) == null) ? null : m0Var.a);
                String str8 = n0Var != null ? n0Var.a : null;
                if (str8 == null) {
                    eVar = b;
                    str2 = str6;
                    str3 = str7;
                    str4 = str;
                    checkConclusionState = w0;
                    str5 = "";
                    checkStatusState = d0;
                } else {
                    checkStatusState = d0;
                    eVar = b;
                    str2 = str6;
                    str3 = str7;
                    str4 = str;
                    checkConclusionState = w0;
                    str5 = str8;
                }
                return new f(str2, str4, str3, checkStatusState, checkConclusionState, eVar, str5);
            case 4:
                b bVar = (b) obj;
                k71.k.g(bVar, "id");
                String str9 = bVar.a;
                u0 u0Var = new u0(100);
                String str10 = bVar.b;
                return new o1(str9, u0Var, str10 == null ? t0.d : new u0(str10), new u0(Boolean.valueOf(str10 != null)));
            case 5:
                b bVar2 = (b) obj;
                k71.k.g(bVar2, "id");
                String str11 = bVar2.a;
                u0 u0Var2 = new u0(100);
                String str12 = bVar2.b;
                aa1.b bVar3 = t0.d;
                return new qo.t0(str11, u0Var2, bVar3, str12 == null ? bVar3 : new u0(str12), new u0(Boolean.valueOf(str12 != null)));
            case 6:
                q0 q0Var = (q0) obj;
                k71.k.g(q0Var, "data");
                r0 r0Var = q0Var.a;
                return Boolean.valueOf((r0Var == null || (s0Var = r0Var.c) == null || (vVar4 = s0Var.c) == null || (gVar4 = vVar4.n) == null || (list2 = gVar4.c) == null) ? false : !list2.isEmpty());
            case 7:
                q0 q0Var2 = (q0) obj;
                k71.k.g(q0Var2, "data");
                r0 r0Var2 = q0Var2.a;
                if (r0Var2 == null || (s0Var2 = r0Var2.c) == null || (vVar5 = s0Var2.c) == null || (gVar5 = vVar5.n) == null || (oVar2 = gVar5.b) == null) {
                    return null;
                }
                return new i(oVar2.c, oVar2.a, !oVar2.b);
            case 8:
                q0 q0Var3 = (q0) obj;
                k71.k.g(q0Var3, "data");
                r0 r0Var3 = q0Var3.a;
                List list11 = (r0Var3 == null || (s0Var3 = r0Var3.c) == null || (vVar6 = s0Var3.c) == null || (gVar6 = vVar6.n) == null) ? null : gVar6.c;
                return list11 == null ? rShadow.r : list11;
            case 9:
                k1 k1Var = (k1) obj;
                k71.k.g(k1Var, "data");
                l1 l1Var = k1Var.a;
                if (l1Var == null || (m1Var = l1Var.c) == null) {
                    return null;
                }
                n1 n1Var = m1Var.d;
                v vVar8 = m1Var.f;
                g gVar7 = vVar8.n;
                vo.i iVar2 = vVar8.o;
                vo.rShadow rVar = vVar8.h;
                vo.h hVar2 = vVar8.k;
                ArrayList arrayList3 = rShadow.r;
                if (gVar7 == null || (list5 = gVar7.c) == null) {
                    arrayList = arrayList3;
                } else {
                    arrayList = new ArrayList();
                    for (k kVar : list5) {
                        mn.a b2 = kVar != null ? xo.a.b(kVar.c, n1Var != null ? n1Var.c.i.c : null) : null;
                        if (b2 != null) {
                            arrayList.add(b2);
                        }
                    }
                }
                int i = gVar7 != null ? gVar7.a : 0;
                if (gVar7 != null) {
                    o oVar3 = gVar7.b;
                    iVar = new i(oVar3.c, oVar3.a, !oVar3.b);
                } else {
                    iVar = new i((String) null, false, true);
                }
                e eVar2 = new e(i, arrayList, iVar);
                String str13 = vVar8.a;
                vo.e eVar3 = hVar2.c;
                String str14 = (eVar3 == null || (list4 = eVar3.a) == null || (mVar = (m) x61.m.W(list4)) == null) ? n1Var != null ? n1Var.c.i.c : "" : mVar.b;
                CheckStatusState d02 = d5.d0(vVar8.b);
                CheckConclusionState w02 = i4.w0(vVar8.c);
                int i2 = gVar7 != null ? gVar7.a : 0;
                mn.m h = y.h(vVar8);
                if (iVar2 != null && (list3 = iVar2.b) != null) {
                    arrayList3 = new ArrayList();
                    for (l lVar : list3) {
                        mn.a b3 = lVar != null ? xo.a.b(lVar.c, n1Var != null ? n1Var.c.i.c : null) : null;
                        if (b3 != null) {
                            arrayList3.add(b3);
                        }
                    }
                }
                e eVar4 = new e(iVar2 != null ? iVar2.a : 0, arrayList3, new i((String) null, false, true));
                com.github.service.models.response.a e = v8.l0.e(rVar.c.b);
                String str15 = rVar.b;
                String str16 = hVar2.b;
                String str17 = hVar2.a;
                vo.f fVar2 = vVar8.j;
                String str18 = fVar2 != null ? fVar2.b : null;
                j1 j1Var = m1Var.c;
                com.github.service.models.response.a e2 = v8.l0.e(j1Var != null ? j1Var.c : null);
                if (n1Var != null) {
                    String str19 = n1Var.b;
                    vo.r0 r0Var4 = n1Var.c;
                    jVar = new j(str19, r0Var4.i.c, r0Var4.d, r0Var4.e, r0Var4.c, r0Var4.b, r0Var4.f, r0Var4.h);
                } else {
                    jVar = null;
                }
                String str20 = vVar8.d;
                n40 n40Var = rVar.d;
                int i3 = n40Var == null ? -1 : kz.a.a[n40Var.ordinal()];
                boolean z = i3 == 1 || i3 == 2 || i3 == 3;
                boolean z2 = vVar8.l;
                int i4 = vVar8.e;
                vo.d dVar = vVar8.g;
                Integer valueOf = dVar != null ? Integer.valueOf(dVar.a) : null;
                vo.c cVar = vVar8.m;
                return new mn.g(str13, str14, e, str15, str16, str17, str18, e2, d02, w02, i2, h, eVar2, eVar4, jVar, str20, z, z2, i4, valueOf, cVar != null ? new Avatar(cVar.c, Avatar.Type.Organization) : null, b31.b.f0(n1Var != null ? n1Var.c.g : null));
            case 10:
                c cVar2 = (c) obj;
                k71.k.g(cVar2, "id");
                String str21 = cVar2.a;
                u0 u0Var3 = new u0(100);
                String str22 = cVar2.b;
                return new qo.a2(str21, u0Var3, str22 == null ? t0.d : new u0(str22), new u0(Boolean.valueOf(str22 != null)));
            case 11:
                c cVar3 = (c) obj;
                k71.k.g(cVar3, "id");
                String str23 = cVar3.a;
                u0 u0Var4 = new u0(100);
                String str24 = cVar3.b;
                return new t1(str23, u0Var4, null, str24 == null ? t0.d : new u0(str24), new u0(Boolean.valueOf(str24 != null)), 12);
            case 12:
                q1 q1Var = (q1) obj;
                k71.k.g(q1Var, "data");
                r1 r1Var = q1Var.a;
                return Boolean.valueOf((r1Var == null || (s1Var = r1Var.c) == null || (a1Var = s1Var.c) == null || (v0Var = a1Var.b) == null || (list6 = v0Var.c) == null) ? false : !list6.isEmpty());
            case 13:
                q1 q1Var2 = (q1) obj;
                k71.k.g(q1Var2, "data");
                r1 r1Var2 = q1Var2.a;
                if (r1Var2 == null || (s1Var2 = r1Var2.c) == null || (a1Var2 = s1Var2.c) == null || (v0Var2 = a1Var2.b) == null || (x0Var = v0Var2.b) == null) {
                    return null;
                }
                return new i(x0Var.c, x0Var.a, !x0Var.b);
            case 14:
                q1 q1Var3 = (q1) obj;
                k71.k.g(q1Var3, "data");
                r1 r1Var3 = q1Var3.a;
                List list12 = (r1Var3 == null || (s1Var3 = r1Var3.c) == null || (a1Var3 = s1Var3.c) == null || (v0Var3 = a1Var3.b) == null) ? null : v0Var3.c;
                return list12 == null ? rShadow.r : list12;
            case 15:
                qo.w1 w1Var4 = (qo.w1) obj;
                k71.k.g(w1Var4, "data");
                x1 x1Var = w1Var4.a;
                if (x1Var == null || (y1Var = x1Var.c) == null) {
                    return null;
                }
                z1 z1Var = y1Var.c;
                v0 v0Var4 = y1Var.d.b;
                mn.m mVar3 = mn.m.g;
                if (v0Var4 != null) {
                    List<w0> list13 = v0Var4.c;
                    if (list13 != null) {
                        mVar2 = null;
                        for (w0 w0Var : list13) {
                            if (w0Var != null) {
                                mn.m h2 = y.h(w0Var.e);
                                mVar2 = mVar2 != null ? new mn.m(mVar2.a + h2.a, mVar2.b + h2.b, mVar2.c + h2.c, mVar2.d + h2.d, mVar2.e + h2.e, mVar2.f + h2.f) : h2;
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
                String str25 = y1Var.b;
                if (z1Var == null || (statusState = b4.o0(z1Var.a)) == null) {
                    statusState = StatusState.UNKNOWN__;
                }
                StatusState statusState2 = statusState;
                ArrayList arrayList4 = rShadow.r;
                if (z1Var != null) {
                    ArrayList arrayList5 = z1Var.b;
                    ArrayList arrayList6 = new ArrayList(n.F(arrayList5, 10));
                    int size = arrayList5.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj2 = arrayList5.get(i5);
                        i5++;
                        arrayList6.add(xo.a.a(((qo.v1) obj2).c));
                    }
                    arrayList2 = arrayList6;
                } else {
                    arrayList2 = arrayList4;
                }
                if (v0Var4 == null) {
                    hVar = new h(arrayList4, new i((String) null, false, true));
                } else {
                    x0 x0Var2 = v0Var4.b;
                    i iVar3 = new i(x0Var2.c, x0Var2.a, !x0Var2.b);
                    List<w0> list14 = v0Var4.c;
                    if (list14 != null) {
                        arrayList4 = new ArrayList();
                        for (w0 w0Var2 : list14) {
                            if (w0Var2 != null) {
                                vo.u0 u0Var5 = w0Var2.c;
                                v vVar9 = w0Var2.e;
                                String str26 = vVar9.a;
                                z0 z0Var = w0Var2.b;
                                fVar = new f(str26, z0Var != null ? z0Var.b.b : u0Var5 != null ? u0Var5.b : "", u0Var5 != null ? u0Var5.c : null, d5.d0(vVar9.b), i4.w0(vVar9.c), a0.b(vVar9.n, z0Var != null ? z0Var.b.b : null), z0Var != null ? z0Var.a : null);
                            } else {
                                fVar = null;
                            }
                            if (fVar != null) {
                                arrayList4.add(fVar);
                            }
                        }
                    }
                    hVar = new h(arrayList4, iVar3);
                }
                return new mn.i(str25, statusState2, mVar4, arrayList2, hVar);
            case 16:
                String str27 = (String) obj;
                k71.k.g(str27, "id");
                return new a3(str27);
            case 17:
                String str28 = (String) obj;
                k71.k.g(str28, "id");
                return new u2(str28, t0.d);
            case 18:
                q2 q2Var = (q2) obj;
                k71.k.g(q2Var, "it");
                r2 r2Var = q2Var.a;
                return Boolean.valueOf((r2Var == null || (s2Var = r2Var.c) == null || (t2Var = s2Var.b) == null || (m2Var = t2Var.b) == null || (list7 = m2Var.b) == null) ? false : !list7.isEmpty());
            case 19:
                q2 q2Var2 = (q2) obj;
                k71.k.g(q2Var2, "data");
                r2 r2Var2 = q2Var2.a;
                if (r2Var2 == null || (s2Var2 = r2Var2.c) == null || (t2Var2 = s2Var2.b) == null || (m2Var2 = t2Var2.b) == null || (l2Var = m2Var2.a) == null) {
                    return null;
                }
                return new i(l2Var.b, l2Var.a, !l2Var.c);
            case 20:
                q2 q2Var3 = (q2) obj;
                k71.k.g(q2Var3, "data");
                r2 r2Var3 = q2Var3.a;
                List list15 = (r2Var3 == null || (s2Var3 = r2Var3.c) == null || (t2Var3 = s2Var3.b) == null || (m2Var3 = t2Var3.b) == null) ? null : m2Var3.b;
                return list15 == null ? rShadow.r : list15;
            case 21:
                w2 w2Var = (w2) obj;
                k71.k.g(w2Var, "data");
                x2 x2Var = w2Var.a;
                if (x2Var == null || (y2Var = x2Var.c) == null) {
                    return null;
                }
                return (w) in.rShadow.j(y2Var, "Invalid request for workflow runs.", new a(22));
            case 22:
                y2 y2Var2 = (y2) obj;
                k71.k.g(y2Var2, "$this$mapOrApiFailure");
                m2 m2Var4 = y2Var2.f.c;
                r<k2> rVar2 = m2Var4.b;
                if (rVar2 == null) {
                    rVar2 = rShadow.r;
                }
                ArrayList arrayList7 = new ArrayList();
                for (k2 k2Var : rVar2) {
                    if (k2Var == null || (z2Var = k2Var.c) == null) {
                        uVar = null;
                    } else {
                        vo.r2 r2Var4 = z2Var.g;
                        vo.u2 u2Var = r2Var4.f;
                        vo.q2 q2Var4 = r2Var4.h;
                        mn.r rVar3 = (u2Var == null || (list8 = u2Var.a) == null || (v2Var = (v2) x61.m.W(list8)) == null) ? null : new mn.r(v2Var.a, v2Var.b);
                        String str29 = z2Var.a;
                        int i6 = z2Var.c;
                        String str30 = z2Var.b;
                        String str31 = q2Var4 != null ? q2Var4.b : null;
                        WorkflowRunEvent f0 = b31.b.f0(z2Var.d);
                        ZonedDateTime zonedDateTime = z2Var.e;
                        String str32 = r2Var4.a;
                        CheckStatusState d03 = d5.d0(r2Var4.b);
                        vo.s2 s2Var4 = r2Var4.i;
                        s sVar = new s(str32, d03, s2Var4 != null ? s2Var4.b : null, r2Var4.g, i4.w0(r2Var4.c), q2Var4 != null ? q2Var4.b : null, rVar3);
                        String str33 = z2Var.f.b;
                        String str34 = r2Var4.d;
                        vo.x2 x2Var2 = r2Var4.e;
                        String str35 = x2Var2.b;
                        String str36 = x2Var2.c.b;
                        vo.t2 t2Var4 = x2Var2.e;
                        String str37 = t2Var4 != null ? t2Var4.b : null;
                        n40 n40Var2 = x2Var2.d;
                        int i7 = n40Var2 == null ? -1 : kz.a.a[n40Var2.ordinal()];
                        uVar = new u(str29, str30, i6, str31, zonedDateTime, f0, sVar, str33, str34, new t(str35, str36, str37, i7 == 1 || i7 == 2 || i7 == 3));
                    }
                    if (uVar != null) {
                        arrayList7.add(uVar);
                    }
                }
                l2 l2Var2 = m2Var4.a;
                return new w(y2Var2.b, y2Var2.c, com.google.common.util.concurrent.a.T(y2Var2.d), arrayList7, new i(l2Var2.b, l2Var2.a, false), y2Var2.e);
            case 23:
                d dVar2 = (d) obj;
                k71.k.g(dVar2, "<destruct>");
                return new f3(t0.d, dVar2.a, dVar2.b);
            case 24:
                c3 c3Var = (c3) obj;
                k71.k.g(c3Var, "it");
                d3 d3Var = c3Var.a;
                return Boolean.valueOf((d3Var == null || (e3Var = d3Var.b) == null || (w1Var = e3Var.b) == null || (list9 = w1Var.a) == null) ? false : !list9.isEmpty());
            case 25:
                c3 c3Var2 = (c3) obj;
                k71.k.g(c3Var2, "data");
                d3 d3Var2 = c3Var2.a;
                if (d3Var2 == null || (e3Var2 = d3Var2.b) == null || (w1Var2 = e3Var2.b) == null || (v1Var = w1Var2.b) == null) {
                    return null;
                }
                return new i(v1Var.b, v1Var.a, !v1Var.c);
            case 26:
                c3 c3Var3 = (c3) obj;
                k71.k.g(c3Var3, "data");
                d3 d3Var3 = c3Var3.a;
                List list16 = (d3Var3 == null || (e3Var3 = d3Var3.b) == null || (w1Var3 = e3Var3.b) == null) ? null : w1Var3.a;
                return list16 == null ? rShadow.r : list16;
            case 27:
                c3 c3Var4 = (c3) obj;
                k71.k.g(c3Var4, "data");
                d3 d3Var4 = c3Var4.a;
                return (xShadow) in.rShadow.j(d3Var4 != null ? d3Var4.b : null, "Invalid request for workflows.", new a(28));
            case 28:
                e3 e3Var4 = (e3) obj;
                k71.k.g(e3Var4, "$this$mapOrApiFailure");
                w1 w1Var5 = e3Var4.b;
                r<u1> rVar4 = w1Var5.a;
                if (rVar4 == null) {
                    rVar4 = rShadow.r;
                }
                ArrayList arrayList8 = new ArrayList();
                for (u1 u1Var : rVar4) {
                    ZonedDateTime zonedDateTime2 = null;
                    if (u1Var != null) {
                        c2 c2Var = u1Var.c;
                        String str38 = c2Var.a;
                        String str39 = c2Var.b;
                        b2 b2Var = c2Var.d;
                        List list17 = b2Var.b;
                        if (list17 != null && (a2Var = (a2) x61.m.W(list17)) != null) {
                            zonedDateTime2 = a2Var.a;
                        }
                        zonedDateTime2 = new mn.n(str38, str39, zonedDateTime2, b2Var.a, com.google.common.util.concurrent.a.T(c2Var.c));
                    }
                    if (zonedDateTime2 != null) {
                        arrayList8.add(zonedDateTime2);
                    }
                }
                v1 v1Var2 = w1Var5.b;
                return new xShadow(arrayList8, new i(v1Var2.b, v1Var2.a, false));
            default:
                bq.b bVar4 = (bq.b) obj;
                k71.k.g(bVar4, "id");
                return new gh(bVar4.a, bVar4.b, bVar4.c, null, 24);
        }
    }
}
