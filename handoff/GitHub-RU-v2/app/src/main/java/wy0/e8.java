package wy0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.TimelineItem$TimelinePullRequestReview$ReviewState;
import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.type.SocialLinkService;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.ae0;
import jn0.aq;
import jn0.be0;
import jn0.bq;
import jn0.cq;
import jn0.dq;
import jn0.e40;
import jn0.eq;
import jn0.f00;
import jn0.f40;
import jn0.fq;
import jn0.g00;
import jn0.g40;
import jn0.gq;
import jn0.h00;
import jn0.h10;
import jn0.hc0;
import jn0.hq;
import jn0.i10;
import jn0.iq;
import jn0.j00;
import jn0.j10;
import jn0.j40;
import jn0.jq;
import jn0.k40;
import jn0.ki;
import jn0.ko;
import jn0.l10;
import jn0.l40;
import jn0.lf0;
import jn0.li;
import jn0.lo;
import jn0.mf0;
import jn0.mo;
import jn0.nf0;
import jn0.o40;
import jn0.oe0;
import jn0.p40;
import jn0.q40;
import jn0.r40;
import jn0.sp;
import jn0.t50;
import jn0.ta0;
import jn0.tp;
import jn0.ud0;
import jn0.uf0;
import jn0.v50;
import jn0.vd0;
import jn0.vp;
import jn0.w50;
import jn0.wd0;
import jn0.yp;
import jn0.zd0;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e8 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ e8(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        l9 l9Var;
        int i;
        yz0.p8 p8Var;
        boolean z;
        String str;
        yz0.o8 o8Var;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        java.util.ArrayList r6;
        boolean z4;
        int i2;
        java.util.ArrayList r7;
        fw0.l1 l1Var;
        if (cVar instanceof l9) {
            l9Var = (l9) cVar;
            int i3 = l9Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l9Var.v = i3 - Integer.MIN_VALUE;
                Object obj2 = l9Var.u;
                b71.a aVar = b71.a.r;
                i = l9Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    lf0 lf0Var = (lf0) obj;
                    nf0 nf0Var = lf0Var.a;
                    x61.r rVar = x61.r.r;
                    if (nf0Var != null) {
                        fw0.s1 s1Var = nf0Var.c;
                        String str2 = s1Var.b;
                        String str3 = s1Var.c;
                        Avatar L = m7.y.L(s1Var.G);
                        String str4 = s1Var.d;
                        String str5 = s1Var.e;
                        String str6 = s1Var.f;
                        int i4 = s1Var.H.c.a;
                        int i5 = s1Var.g.a;
                        boolean z5 = s1Var.h;
                        boolean z6 = s1Var.i;
                        boolean z7 = s1Var.j;
                        boolean z8 = s1Var.k;
                        boolean z9 = s1Var.l;
                        String str7 = s1Var.n;
                        String str8 = str7 == null ? "" : str7;
                        String str9 = s1Var.o;
                        String str10 = s1Var.p;
                        String str11 = str10 == null ? "" : str10;
                        int i6 = s1Var.q.a;
                        String str12 = s1Var.r;
                        String str13 = str12 == null ? "" : str12;
                        int i7 = s1Var.s.a;
                        int i8 = s1Var.t.a;
                        boolean z10 = s1Var.x;
                        boolean z12 = s1Var.y;
                        String str14 = s1Var.z;
                        String str15 = str14 == null ? "" : str14;
                        fw0.q1 q1Var = s1Var.u;
                        if (q1Var != null) {
                            fw0.n0 n0Var = q1Var.c;
                            z = z8;
                            String str16 = n0Var.b;
                            fw0.m0 m0Var = n0Var.g;
                            str = "";
                            String str17 = str16 == null ? str : str16;
                            boolean z13 = n0Var.c;
                            String str18 = n0Var.d;
                            String str19 = str18 == null ? str : str18;
                            String str20 = n0Var.e;
                            o8Var = new yz0.o8(str17, str20 == null ? str : str20, z13, str19, m0Var != null ? i21.a.K(m0Var.c) : null, m0Var != null ? m0Var.c.a : null, n0Var.f);
                        } else {
                            z = z8;
                            str = "";
                            o8Var = null;
                        }
                        tt0.f fVar = s1Var.m.b;
                        boolean z14 = fVar.a;
                        List list = fVar.b.a;
                        if (list == null) {
                            list = rVar;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            tt0.e eVar = (tt0.e) it.next();
                            boolean z15 = z14;
                            yz0.k8 g = (eVar != null ? eVar.c : null) != null ? i21.a.g(eVar.c) : (eVar != null ? eVar.b : null) != null ? i21.a.h(eVar.b.c) : null;
                            if (g != null) {
                                arrayList2.add(g);
                            }
                            it = it2;
                            z14 = z15;
                        }
                        boolean z16 = z14;
                        yz0.m8 i9 = (!s1Var.v || (l1Var = s1Var.w) == null) ? null : i21.a.i(l1Var.b);
                        boolean z17 = s1Var.A;
                        boolean z18 = s1Var.B;
                        List list2 = s1Var.E.a;
                        if (list2 != null) {
                            z2 = z18;
                            ArrayList S = x61.m.S(list2);
                            arrayList = arrayList2;
                            z3 = z7;
                            r6 = new ArrayList(x61.n.F(S, 10));
                            int size = S.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj3 = S.get(i10);
                                int i12 = i10 + 1;
                                fw0.j1 j1Var = (fw0.j1) obj3;
                                int i13 = size;
                                String str21 = j1Var.c;
                                r01.w wVar = SocialLinkService.Companion;
                                String str22 = str3;
                                String str23 = j1Var.b.r;
                                wVar.getClass();
                                r6.add(new yz0.n8(str21, r01.w.a(str23), j1Var.a));
                                S = S;
                                i10 = i12;
                                size = i13;
                                str3 = str22;
                            }
                        } else {
                            z2 = z18;
                            arrayList = arrayList2;
                            z3 = z7;
                            r6 = 0;
                        }
                        String str24 = str3;
                        x61.r rVar2 = r6 == 0 ? rVar : r6;
                        boolean z19 = s1Var.C;
                        int i14 = s1Var.D.a;
                        List list3 = s1Var.F.a;
                        if (list3 != null) {
                            ArrayList S2 = x61.m.S(list3);
                            ArrayList arrayList3 = new ArrayList(x61.n.F(S2, 10));
                            int size2 = S2.size();
                            int i15 = 0;
                            while (i15 < size2) {
                                Object obj4 = S2.get(i15);
                                i15++;
                                ArrayList arrayList4 = S2;
                                fw0.i1 i1Var = (fw0.i1) obj4;
                                boolean z20 = z19;
                                int i16 = i14;
                                fw0.e1 e1Var = i1Var.a;
                                int i17 = size2;
                                String str25 = e1Var.b;
                                String str26 = e1Var.a;
                                fw0.r1 r1Var = i1Var.b;
                                String str27 = r1Var != null ? r1Var.b : null;
                                if (str27 == null) {
                                    str27 = str;
                                }
                                arrayList3.add(new yz0.h8(str25, str26, str27));
                                size2 = i17;
                                S2 = arrayList4;
                                z19 = z20;
                                i14 = i16;
                            }
                            z4 = z19;
                            i2 = i14;
                            r7 = new ArrayList();
                            int size3 = arrayList3.size();
                            int i18 = 0;
                            while (i18 < size3) {
                                Object obj5 = arrayList3.get(i18);
                                i18++;
                                yz0.h8 h8Var = (yz0.h8) obj5;
                                int i19 = size3;
                                if (!t71.p.T(h8Var.a) && !t71.p.T(h8Var.c)) {
                                    r7.add(obj5);
                                }
                                size3 = i19;
                            }
                        } else {
                            z4 = z19;
                            i2 = i14;
                            r7 = 0;
                        }
                        p8Var = new yz0.p8(str2, str24, L, str4, str5, str6, i4, i5, z5, false, z6, z3, z, z9, str8, str9, str11, i6, str13, i7, i8, 0, z10, z12, str15, o8Var, z16, arrayList, i9, false, z17, z2, "", z4, i2, null, r7 == 0 ? rVar : r7, rVar2);
                    } else {
                        mf0 mf0Var = lf0Var.b;
                        if (mf0Var == null) {
                            throw new ApiFailure(ApiFailureType.NOT_FOUND, null, null, null, null, null, null, 120);
                        }
                        kt0.i iVar = mf0Var.c;
                        String str28 = iVar.i;
                        String str29 = iVar.b;
                        String str30 = iVar.c;
                        Avatar L2 = m7.y.L(iVar.r);
                        String str31 = iVar.d;
                        String str32 = str31 == null ? "" : str31;
                        String str33 = iVar.e;
                        String str34 = str33 == null ? "" : str33;
                        boolean z22 = iVar.f;
                        String str35 = iVar.h;
                        String str36 = str35 == null ? "" : str35;
                        String str37 = iVar.j;
                        String str38 = str37 == null ? "" : str37;
                        int i20 = iVar.l.a;
                        boolean z23 = iVar.k;
                        String str39 = iVar.n;
                        String str40 = str39 == null ? "" : str39;
                        tt0.f fVar2 = iVar.g.b;
                        boolean z24 = fVar2.a;
                        List<tt0.e> list4 = fVar2.b.a;
                        if (list4 == null) {
                            list4 = rVar;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (tt0.e eVar2 : list4) {
                            boolean z25 = z22;
                            int i22 = i20;
                            yz0.k8 g2 = (eVar2 != null ? eVar2.c : null) != null ? i21.a.g(eVar2.c) : (eVar2 != null ? eVar2.b : null) != null ? i21.a.h(eVar2.b.c) : null;
                            if (g2 != null) {
                                arrayList5.add(g2);
                            }
                            z22 = z25;
                            i20 = i22;
                        }
                        boolean z26 = z22;
                        int i23 = i20;
                        kt0.h hVar = iVar.m;
                        yz0.m8 i24 = hVar != null ? i21.a.i(hVar.b) : null;
                        String str41 = iVar.o;
                        String str42 = str41 == null ? "" : str41;
                        int i25 = iVar.p.a;
                        kt0.d dVar = iVar.q;
                        p8Var = new yz0.p8(str29, str30, L2, str32, "", str34, -1, -1, false, z26, false, false, false, false, str36, str28, str38, -1, "", i23, -1, 0, true, z23, str40, null, z24, arrayList5, i24, true, false, false, str42, false, i25, dVar != null ? new yz0.d1(str28, dVar.b.a, dVar.a) : null, rVar, rVar);
                    }
                    l9Var.v = 1;
                    if (this.s.c(p8Var, l9Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        l9Var = new l9(this, cVar);
        Object obj22 = l9Var.u;
        b71.a aVar2 = b71.a.r;
        i = l9Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        m9 m9Var;
        int i;
        ArrayList arrayList;
        if (cVar instanceof m9) {
            m9Var = (m9) cVar;
            int i2 = m9Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m9Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = m9Var.u;
                b71.a aVar = b71.a.r;
                i = m9Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List list = ((so0.b) obj).a.a;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list) {
                            if (((so0.c) obj3).b) {
                                arrayList2.add(obj3);
                            }
                        }
                        arrayList = new ArrayList();
                        int size = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj4 = arrayList2.get(i3);
                            i3++;
                            r10.a aVar2 = r10.b.Companion;
                            String str = ((so0.c) obj4).a;
                            aVar2.getClass();
                            r10.b a = r10.a.a(str);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        m9Var.v = 1;
                        if (this.s.c(arrayList, m9Var) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        m9Var = new m9(this, cVar);
        Object obj22 = m9Var.u;
        b71.a aVar3 = b71.a.r;
        i = m9Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        o9 o9Var;
        int i;
        String a;
        if (cVar instanceof o9) {
            o9Var = (o9) cVar;
            int i2 = o9Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o9Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = o9Var.u;
                b71.a aVar = b71.a.r;
                i = o9Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    fa1.q0 q0Var = (fa1.q0) obj;
                    k71.k.g(q0Var, "<this>");
                    q81.a0 a0Var = q0Var.a;
                    c11.a aVar2 = null;
                    if (a0Var.u == 301 && (a = a0Var.w.a("Location")) != null) {
                        List g0 = t71.p.g0(a, new String[]{"/"}, 6);
                        if (g0.size() == 8 && k71.k.b(g0.get(3), "repos") && k71.k.b(g0.get(6), "issues")) {
                            String str = (String) g0.get(4);
                            String str2 = (String) g0.get(5);
                            Integer G = t71.w.G((String) g0.get(7));
                            if (G != null) {
                                aVar2 = new c11.a(str, G.intValue(), str2);
                            }
                        }
                    }
                    o9Var.v = 1;
                    if (this.s.c(aVar2, o9Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        o9Var = new o9(this, cVar);
        Object obj22 = o9Var.u;
        b71.a aVar3 = b71.a.r;
        i = o9Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        x00.b bVar;
        int i;
        if (cVar instanceof x00.b) {
            bVar = (x00.b) cVar;
            int i2 = bVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.u;
                b71.a aVar = b71.a.r;
                i = bVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    lz.d dVar = (lz.d) obj;
                    fz.i iVar = new fz.i(dVar);
                    lz.i0 i0Var = dVar.a.b.a;
                    w61.k kVar = new w61.k(iVar, new x01.i(i0Var.b, i0Var.a, false));
                    bVar.v = 1;
                    if (this.s.c(kVar, bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        bVar = new x00.b(this, cVar);
        Object obj22 = bVar.u;
        b71.a aVar2 = b71.a.r;
        i = bVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        x00.c cVar2;
        int i;
        if (cVar instanceof x00.c) {
            cVar2 = (x00.c) cVar;
            int i2 = cVar2.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.v = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar2.u;
                b71.a aVar = b71.a.r;
                i = cVar2.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    lz.d dVar = (lz.d) obj;
                    fz.i iVar = new fz.i(dVar);
                    lz.i0 i0Var = dVar.a.b.a;
                    w61.k kVar = new w61.k(iVar, new x01.i(i0Var.b, i0Var.a, false));
                    cVar2.v = 1;
                    if (this.s.c(kVar, cVar2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        cVar2 = new x00.c(this, cVar);
        Object obj22 = cVar2.u;
        b71.a aVar2 = b71.a.r;
        i = cVar2.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        x00.d dVar;
        int i;
        lz.w0 w0Var;
        if (cVar instanceof x00.d) {
            dVar = (x00.d) cVar;
            int i2 = dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.u;
                b71.a aVar = b71.a.r;
                i = dVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    Iterable<lz.u0> iterable = ((lz.s0) obj).a.a.a;
                    if (iterable == null) {
                        iterable = x61.r.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (lz.u0 u0Var : iterable) {
                        j01.b bVar = null;
                        if (u0Var != null && (w0Var = u0Var.c.b) != null) {
                            int i3 = u0Var.a;
                            int i4 = u0Var.b;
                            String str = w0Var.a;
                            String str2 = w0Var.b;
                            lz.x0 x0Var = w0Var.c;
                            bVar = new j01.b(i3, i4, w8.s.A(x0Var.d), str, str2, x0Var.c);
                        }
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                    }
                    dVar.v = 1;
                    if (this.s.c(arrayList, dVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        dVar = new x00.d(this, cVar);
        Object obj22 = dVar.u;
        b71.a aVar2 = b71.a.r;
        i = dVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        x00.e eVar;
        int i;
        j01.a aVar;
        if (cVar instanceof x00.e) {
            eVar = (x00.e) cVar;
            int i2 = eVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = eVar.u;
                b71.a aVar2 = b71.a.r;
                i = eVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    lz.b1 b1Var = (lz.b1) obj;
                    k71.k.g(b1Var, "<this>");
                    lz.f1 f1Var = b1Var.a;
                    int i3 = f1Var.a.a;
                    Iterable<lz.d1> iterable = f1Var.b.a;
                    if (iterable == null) {
                        iterable = x61.r.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (lz.d1 d1Var : iterable) {
                        if (d1Var != null) {
                            nu.a aVar3 = d1Var.c;
                            aVar = new j01.a(aVar3.c, aVar3.a, aVar3.b, aVar3.d, aVar3.e);
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    yz0.a3 a3Var = new yz0.a3(i3, arrayList);
                    eVar.v = 1;
                    if (this.s.c(a3Var, eVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        eVar = new x00.e(this, cVar);
        Object obj22 = eVar.u;
        b71.a aVar22 = b71.a.r;
        i = eVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        xb0.a aVar;
        int i;
        if (cVar instanceof xb0.a) {
            aVar = (xb0.a) cVar;
            int i2 = aVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = aVar.u;
                b71.a aVar2 = b71.a.r;
                i = aVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    q81.c0 c0Var = (q81.c0) ((fa1.q0) obj).b;
                    String t = c0Var != null ? c0Var.t() : null;
                    if (t == null) {
                        t = "";
                    }
                    aVar.v = 1;
                    if (this.s.c(t, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        aVar = new xb0.a(this, cVar);
        Object obj22 = aVar.u;
        b71.a aVar22 = b71.a.r;
        i = aVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0930 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        d8 d8Var;
        int i;
        g8 g8Var;
        int i2;
        yz0.a7 s;
        jn0.a1 a1Var;
        jn0.a1 a1Var2;
        i8 i8Var;
        int i3;
        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState;
        b71.a aVar;
        fq fqVar;
        String str;
        String str2;
        ArrayList arrayList;
        yz0.k3 k3Var;
        boolean z;
        CommentLevelType commentLevelType;
        gq gqVar;
        List list;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str3;
        String str4;
        boolean z2;
        CommentLevelType commentLevelType2;
        j8 j8Var;
        int i4;
        k8 k8Var;
        int i5;
        yz0.a7 s2;
        v50 v50Var;
        l8 l8Var;
        int i6;
        jn0.z7 z7Var;
        List<jn0.b8> list2;
        jn0.c8 c8Var;
        m8 m8Var;
        int i7;
        List<q40> list3;
        r40 r40Var;
        n8 n8Var;
        int i8;
        ArrayList arrayList4;
        List list4;
        o8 o8Var;
        int i9;
        vd0 vd0Var;
        r8 r8Var;
        int i10;
        ae0 ae0Var;
        s8 s8Var;
        int i12;
        ae0 ae0Var2;
        v8 v8Var;
        int i13;
        w8 w8Var;
        int i14;
        x8 x8Var;
        int i15;
        g00 g00Var;
        g00 g00Var2;
        g00 g00Var3;
        y8 y8Var;
        int i16;
        f40 f40Var;
        c9 c9Var;
        int i17;
        f9 f9Var;
        int i18;
        i9 i9Var;
        int i19;
        i10 i10Var;
        i10 i10Var2;
        i10 i10Var3;
        j9 j9Var;
        int i20;
        k9 k9Var;
        int i22;
        n9 n9Var;
        int i23;
        xk.k kVar;
        int i24;
        switch (this.r) {
            case 0:
                if (cVar instanceof d8) {
                    d8Var = (d8) cVar;
                    int i25 = d8Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        d8Var.v = i25 - Integer.MIN_VALUE;
                        Object obj2 = d8Var.u;
                        b71.a aVar2 = b71.a.r;
                        i = d8Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            ko koVar = (ko) obj;
                            mo moVar = koVar.a;
                            List list5 = moVar != null ? moVar.a.b : null;
                            if (list5 == null) {
                                list5 = x61.r.r;
                            }
                            ArrayList S = x61.m.S(list5);
                            ArrayList arrayList5 = new ArrayList(x61.n.F(S, 10));
                            int size = S.size();
                            int i26 = 0;
                            while (i26 < size) {
                                Object obj3 = S.get(i26);
                                i26++;
                                lo loVar = (lo) obj3;
                                String str5 = loVar.c;
                                String str6 = loVar.d;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                arrayList5.add(new yz0.e2(new com.github.service.models.response.a(str5, new Avatar(str6, Avatar.Type.Organization), (String) null, false, (String) null, 60), IssueOrPullRequest$ReviewerReviewState.PENDING, loVar.b, yz0.f2.b, false, 96));
                            }
                            mo moVar2 = koVar.a;
                            w61.k kVar2 = new w61.k(arrayList5, new x01.i(moVar2 != null ? moVar2.a.a.b : null, moVar2 != null ? moVar2.a.a.a : false, false));
                            d8Var.v = 1;
                            if (this.s.c(kVar2, d8Var) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj2);
                        }
                        return w61.a0.a;
                    }
                }
                d8Var = new d8(this, cVar);
                Object obj22 = d8Var.u;
                b71.a aVar22 = b71.a.r;
                i = d8Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof g8) {
                    g8Var = (g8) cVar;
                    int i27 = g8Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        g8Var.v = i27 - Integer.MIN_VALUE;
                        Object obj4 = g8Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = g8Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            jn0.y0 y0Var = (jn0.y0) obj;
                            k71.k.g(y0Var, "<this>");
                            jn0.w0 w0Var = y0Var.a;
                            String str7 = (w0Var == null || (a1Var2 = w0Var.a) == null) ? "" : a1Var2.b;
                            cu0.c cVar2 = (w0Var == null || (a1Var = w0Var.a) == null) ? null : a1Var.d;
                            if (cVar2 == null) {
                                yz0.s.Companion.getClass();
                                s = new yz0.a7(yz0.r.b, true, TimelineItem$TimelinePullRequestReview$ReviewState.UNKNOWN);
                            } else {
                                s = com.google.android.gms.internal.measurement.b4.s(cVar2);
                            }
                            yz0.c cVar3 = new yz0.c(str7, s);
                            g8Var.v = 1;
                            if (this.s.c(cVar3, g8Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                g8Var = new g8(this, cVar);
                Object obj42 = g8Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = g8Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof i8) {
                    i8Var = (i8) cVar;
                    int i28 = i8Var.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        i8Var.v = i28 - Integer.MIN_VALUE;
                        Object obj5 = i8Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = i8Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj5);
                            bq bqVar = (bq) obj;
                            k71.k.g(bqVar, "<this>");
                            String str8 = bqVar.d;
                            gu0.c cVar4 = bqVar.l;
                            String str9 = bqVar.b;
                            fq fqVar2 = bqVar.i;
                            jq jqVar = bqVar.j;
                            eq eqVar = bqVar.g;
                            String str10 = eqVar.a;
                            String str11 = eqVar.b;
                            List<yp> list6 = jqVar != null ? jqVar.a : null;
                            if (list6 == null) {
                                list6 = x61.r.r;
                            }
                            ArrayList arrayList6 = new ArrayList();
                            for (yp ypVar : list6) {
                                if (ypVar != null) {
                                    fq fqVar3 = fqVar2;
                                    cq cqVar = ypVar.c;
                                    dq dqVar = ypVar.b;
                                    if (dqVar != null) {
                                        bx0.h hVar = bx0.i.Companion;
                                        str = str11;
                                        tp tpVar = dqVar.k;
                                        List list7 = dqVar.j;
                                        ArrayList S2 = list7 != null ? x61.m.S(list7) : null;
                                        String str12 = dqVar.c;
                                        String str13 = dqVar.b;
                                        eu0.a aVar5 = dqVar.l;
                                        boolean z3 = dqVar.e;
                                        hq hqVar = dqVar.h;
                                        if (hqVar != null) {
                                            arrayList2 = arrayList6;
                                            arrayList3 = S2;
                                            str3 = str12;
                                            str4 = hqVar.a;
                                        } else {
                                            arrayList2 = arrayList6;
                                            arrayList3 = S2;
                                            str3 = str12;
                                            str4 = "";
                                        }
                                        boolean z4 = dqVar.f;
                                        boolean z5 = dqVar.g;
                                        boolean z6 = dqVar.i;
                                        int ordinal = dqVar.d.ordinal();
                                        if (ordinal != 0) {
                                            z2 = z6;
                                            if (ordinal == 1) {
                                                commentLevelType2 = CommentLevelType.LINE;
                                            } else {
                                                if (ordinal != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                commentLevelType2 = CommentLevelType.UNKNOWN__;
                                            }
                                        } else {
                                            z2 = z6;
                                            commentLevelType2 = CommentLevelType.FILE;
                                        }
                                        CommentLevelType commentLevelType3 = commentLevelType2;
                                        hVar.getClass();
                                        fqVar = fqVar3;
                                        str2 = str10;
                                        boolean z7 = z2;
                                        aVar = aVar4;
                                        arrayList = arrayList2;
                                        k3Var = bx0.h.a(str9, null, commentLevelType3, tpVar, null, arrayList3, str3, str13, aVar5, str2, str, z3, str4, z4, z5, z7);
                                    } else {
                                        aVar = aVar4;
                                        str = str11;
                                        str2 = str10;
                                        arrayList = arrayList6;
                                        fqVar = fqVar3;
                                        String str14 = "";
                                        if (cqVar != null) {
                                            iq iqVar = cqVar.e;
                                            bx0.h hVar2 = bx0.i.Companion;
                                            ArrayList S3 = (iqVar == null || (list = iqVar.g) == null) ? null : x61.m.S(list);
                                            String str15 = cqVar.c;
                                            String str16 = cqVar.b;
                                            eu0.a aVar6 = iqVar != null ? iqVar.i : null;
                                            boolean z8 = iqVar != null ? iqVar.b : false;
                                            String str17 = str9;
                                            if (iqVar != null && (gqVar = iqVar.c) != null) {
                                                str14 = gqVar.a;
                                            }
                                            boolean z9 = iqVar != null ? iqVar.d : false;
                                            boolean z10 = iqVar != null ? iqVar.e : false;
                                            boolean z12 = iqVar != null ? iqVar.f : false;
                                            int ordinal2 = cqVar.d.ordinal();
                                            if (ordinal2 != 0) {
                                                z = z10;
                                                if (ordinal2 == 1) {
                                                    commentLevelType = CommentLevelType.LINE;
                                                } else {
                                                    if (ordinal2 != 2) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    commentLevelType = CommentLevelType.UNKNOWN__;
                                                }
                                            } else {
                                                z = z10;
                                                commentLevelType = CommentLevelType.FILE;
                                            }
                                            CommentLevelType commentLevelType4 = commentLevelType;
                                            hVar2.getClass();
                                            str9 = str17;
                                            k3Var = bx0.h.a(str9, cqVar, commentLevelType4, null, S3, null, str15, str16, aVar6, str2, str, z8, str14, z9, z, z12);
                                        }
                                    }
                                    if (k3Var == null) {
                                        arrayList.add(k3Var);
                                    }
                                    arrayList6 = arrayList;
                                    fqVar2 = fqVar;
                                    str10 = str2;
                                    str11 = str;
                                    aVar4 = aVar;
                                } else {
                                    aVar = aVar4;
                                    fqVar = fqVar2;
                                    str = str11;
                                    str2 = str10;
                                    arrayList = arrayList6;
                                }
                                k3Var = null;
                                if (k3Var == null) {
                                }
                                arrayList6 = arrayList;
                                fqVar2 = fqVar;
                                str10 = str2;
                                str11 = str;
                                aVar4 = aVar;
                            }
                            b71.a aVar7 = aVar4;
                            fq fqVar4 = fqVar2;
                            ArrayList arrayList7 = arrayList6;
                            uu0.k3 k3Var2 = fqVar4.c;
                            String str18 = k3Var2.d;
                            String str19 = k3Var2.c;
                            uu0.h3 h3Var = k3Var2.h;
                            yz0.t7 t7Var = new yz0.t7(str18, str19, h3Var.c, m7.y.L(h3Var.d), new kx0.j(fqVar4.d), k3Var2.e);
                            String str20 = k3Var2.h.b;
                            kx0.b bVar = new kx0.b(bqVar.k, str8, new yz0.k0(str9));
                            ZonedDateTime zonedDateTime = bqVar.f;
                            ArrayList o = m7.y.o(cVar4, str9);
                            boolean z13 = cVar4.c;
                            int ordinal3 = bqVar.c.ordinal();
                            if (ordinal3 == 0) {
                                issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.APPROVED;
                            } else if (ordinal3 != 1) {
                                if (ordinal3 != 2) {
                                    if (ordinal3 == 3) {
                                        issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.DISMISSED;
                                    } else if (ordinal3 == 4) {
                                        issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.PENDING;
                                    } else if (ordinal3 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.COMMENTED;
                            } else {
                                issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.CHANGES_REQUESTED;
                            }
                            IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState2 = issueOrPullRequest$ReviewerReviewState;
                            sp spVar = bqVar.h;
                            com.github.service.models.response.a e = k41.b.e(spVar != null ? spVar.b : null);
                            boolean z14 = bqVar.e;
                            gt0.a aVar8 = bqVar.n;
                            yz0.l3 l3Var = new yz0.l3(str9, arrayList7, t7Var, str20, bVar, zonedDateTime, o, z13, issueOrPullRequest$ReviewerReviewState2, e, z14, str8, aVar8.b, aVar8.c);
                            i8Var.v = 1;
                            if (this.s.c(l3Var, i8Var) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                i8Var = new i8(this, cVar);
                Object obj52 = i8Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = i8Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof j8) {
                    j8Var = (j8) cVar;
                    int i29 = j8Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        j8Var.v = i29 - Integer.MIN_VALUE;
                        Object obj6 = j8Var.u;
                        b71.a aVar9 = b71.a.r;
                        i4 = j8Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj6);
                            aq aqVar = ((vp) obj).a;
                            bq bqVar2 = aqVar != null ? aqVar.c : null;
                            if (bqVar2 != null) {
                                j8Var.v = 1;
                                if (this.s.c(bqVar2, j8Var) == aVar9) {
                                    return aVar9;
                                }
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                j8Var = new j8(this, cVar);
                Object obj62 = j8Var.u;
                b71.a aVar92 = b71.a.r;
                i4 = j8Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof k8) {
                    k8Var = (k8) cVar;
                    int i30 = k8Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        k8Var.v = i30 - Integer.MIN_VALUE;
                        Object obj7 = k8Var.u;
                        b71.a aVar10 = b71.a.r;
                        i5 = k8Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj7);
                            t50 t50Var = (t50) obj;
                            k71.k.g(t50Var, "<this>");
                            w50 w50Var = t50Var.a;
                            cu0.c cVar5 = (w50Var == null || (v50Var = w50Var.a) == null) ? null : v50Var.d;
                            if (cVar5 == null) {
                                yz0.s.Companion.getClass();
                                s2 = new yz0.a7(yz0.r.b, false, TimelineItem$TimelinePullRequestReview$ReviewState.UNKNOWN);
                            } else {
                                s2 = com.google.android.gms.internal.measurement.b4.s(cVar5);
                            }
                            yz0.b5 b5Var = new yz0.b5(s2);
                            k8Var.v = 1;
                            if (this.s.c(b5Var, k8Var) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                k8Var = new k8(this, cVar);
                Object obj72 = k8Var.u;
                b71.a aVar102 = b71.a.r;
                i5 = k8Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof l8) {
                    l8Var = (l8) cVar;
                    int i32 = l8Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        l8Var.v = i32 - Integer.MIN_VALUE;
                        Object obj8 = l8Var.u;
                        b71.a aVar11 = b71.a.r;
                        i6 = l8Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj8);
                            jn0.y7 y7Var = ((jn0.a8) obj).a;
                            ArrayList arrayList8 = null;
                            if (y7Var != null && (z7Var = y7Var.a) != null && (list2 = z7Var.a.a) != null) {
                                ArrayList arrayList9 = new ArrayList();
                                for (jn0.b8 b8Var : list2) {
                                    q01.r L = (b8Var == null || (c8Var = b8Var.a) == null) ? null : y9.a.L(c8Var.c);
                                    if (L != null) {
                                        arrayList9.add(L);
                                    }
                                }
                                arrayList8 = arrayList9;
                            }
                            if (arrayList8 != null) {
                                l8Var.v = 1;
                                if (this.s.c(arrayList8, l8Var) == aVar11) {
                                    return aVar11;
                                }
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                l8Var = new l8(this, cVar);
                Object obj82 = l8Var.u;
                b71.a aVar112 = b71.a.r;
                i6 = l8Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof m8) {
                    m8Var = (m8) cVar;
                    int i33 = m8Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        m8Var.v = i33 - Integer.MIN_VALUE;
                        Object obj9 = m8Var.u;
                        b71.a aVar12 = b71.a.r;
                        i7 = m8Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj9);
                            o40 o40Var = ((p40) obj).a.a;
                            ArrayList arrayList10 = null;
                            if (o40Var != null && (list3 = o40Var.a.a) != null) {
                                ArrayList arrayList11 = new ArrayList();
                                for (q40 q40Var : list3) {
                                    q01.r L2 = (q40Var == null || (r40Var = q40Var.a) == null) ? null : y9.a.L(r40Var.c);
                                    if (L2 != null) {
                                        arrayList11.add(L2);
                                    }
                                }
                                arrayList10 = arrayList11;
                            }
                            if (arrayList10 != null) {
                                m8Var.v = 1;
                                if (this.s.c(arrayList10, m8Var) == aVar12) {
                                    return aVar12;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                m8Var = new m8(this, cVar);
                Object obj92 = m8Var.u;
                b71.a aVar122 = b71.a.r;
                i7 = m8Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof n8) {
                    n8Var = (n8) cVar;
                    int i34 = n8Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        n8Var.v = i34 - Integer.MIN_VALUE;
                        Object obj10 = n8Var.u;
                        b71.a aVar13 = b71.a.r;
                        i8 = n8Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj10);
                            k40 k40Var = ((j40) obj).a;
                            if (k40Var == null || (list4 = k40Var.a) == null) {
                                arrayList4 = null;
                            } else {
                                arrayList4 = new ArrayList(x61.n.F(list4, 10));
                                Iterator it = list4.iterator();
                                while (it.hasNext()) {
                                    arrayList4.add(y9.a.L(((l40) it.next()).c));
                                }
                            }
                            if (arrayList4 != null) {
                                n8Var.v = 1;
                                if (this.s.c(arrayList4, n8Var) == aVar13) {
                                    return aVar13;
                                }
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                n8Var = new n8(this, cVar);
                Object obj102 = n8Var.u;
                b71.a aVar132 = b71.a.r;
                i8 = n8Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof o8) {
                    o8Var = (o8) cVar;
                    int i35 = o8Var.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        o8Var.v = i35 - Integer.MIN_VALUE;
                        Object obj11 = o8Var.u;
                        b71.a aVar14 = b71.a.r;
                        i9 = o8Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj11);
                            wd0 wd0Var = ((ud0) obj).a;
                            q01.r L3 = (wd0Var == null || (vd0Var = wd0Var.a) == null) ? null : y9.a.L(vd0Var.c);
                            if (L3 != null) {
                                o8Var.v = 1;
                                if (this.s.c(L3, o8Var) == aVar14) {
                                    return aVar14;
                                }
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                o8Var = new o8(this, cVar);
                Object obj112 = o8Var.u;
                b71.a aVar142 = b71.a.r;
                i9 = o8Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof r8) {
                    r8Var = (r8) cVar;
                    int i36 = r8Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        r8Var.v = i36 - Integer.MIN_VALUE;
                        Object obj12 = r8Var.u;
                        b71.a aVar15 = b71.a.r;
                        i10 = r8Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj12);
                            be0 be0Var = ((zd0) obj).a;
                            pz0.f40 f40Var2 = (be0Var == null || (ae0Var = be0Var.a) == null) ? null : ae0Var.b.c;
                            Boolean valueOf = Boolean.valueOf((f40Var2 == null ? -1 : p8.a[f40Var2.ordinal()]) == 1);
                            r8Var.v = 1;
                            if (this.s.c(valueOf, r8Var) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                r8Var = new r8(this, cVar);
                Object obj122 = r8Var.u;
                b71.a aVar152 = b71.a.r;
                i10 = r8Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof s8) {
                    s8Var = (s8) cVar;
                    int i37 = s8Var.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        s8Var.v = i37 - Integer.MIN_VALUE;
                        Object obj13 = s8Var.u;
                        b71.a aVar16 = b71.a.r;
                        i12 = s8Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj13);
                            be0 be0Var2 = ((zd0) obj).a;
                            pz0.f40 f40Var3 = (be0Var2 == null || (ae0Var2 = be0Var2.a) == null) ? null : ae0Var2.b.c;
                            Boolean valueOf2 = Boolean.valueOf((f40Var3 == null ? -1 : p8.a[f40Var3.ordinal()]) == 1);
                            s8Var.v = 1;
                            if (this.s.c(valueOf2, s8Var) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                s8Var = new s8(this, cVar);
                Object obj132 = s8Var.u;
                b71.a aVar162 = b71.a.r;
                i12 = s8Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof v8) {
                    v8Var = (v8) cVar;
                    int i38 = v8Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        v8Var.v = i38 - Integer.MIN_VALUE;
                        Object obj14 = v8Var.u;
                        b71.a aVar17 = b71.a.r;
                        i13 = v8Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj14);
                            li liVar = ((ki) obj).a;
                            kx0.j jVar = new kx0.j(liVar != null ? liVar.c : null);
                            v8Var.v = 1;
                            if (this.s.c(jVar, v8Var) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                v8Var = new v8(this, cVar);
                Object obj142 = v8Var.u;
                b71.a aVar172 = b71.a.r;
                i13 = v8Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof w8) {
                    w8Var = (w8) cVar;
                    int i39 = w8Var.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        w8Var.v = i39 - Integer.MIN_VALUE;
                        Object obj15 = w8Var.u;
                        b71.a aVar18 = b71.a.r;
                        i14 = w8Var.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i14 != 0) {
                            sy.y.j(obj15);
                            w8Var.v = 1;
                            if (this.s.c(a0Var, w8Var) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return a0Var;
                    }
                }
                w8Var = new w8(this, cVar);
                Object obj152 = w8Var.u;
                b71.a aVar182 = b71.a.r;
                i14 = w8Var.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i14 != 0) {
                }
                return a0Var2;
            case 13:
                if (cVar instanceof x8) {
                    x8Var = (x8) cVar;
                    int i40 = x8Var.v;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        x8Var.v = i40 - Integer.MIN_VALUE;
                        Object obj16 = x8Var.u;
                        b71.a aVar19 = b71.a.r;
                        i15 = x8Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj16);
                            f00 f00Var = (f00) obj;
                            j00 j00Var = f00Var.a;
                            String str21 = null;
                            List list8 = (j00Var == null || (g00Var3 = j00Var.b) == null) ? null : g00Var3.b;
                            if (list8 == null) {
                                list8 = x61.r.r;
                            }
                            ArrayList S4 = x61.m.S(list8);
                            ArrayList arrayList12 = new ArrayList(x61.n.F(S4, 10));
                            int size2 = S4.size();
                            int i42 = 0;
                            while (i42 < size2) {
                                Object obj17 = S4.get(i42);
                                i42++;
                                h00 h00Var = (h00) obj17;
                                k71.k.g(h00Var, "<this>");
                                arrayList12.add(new kx0.f(h00Var.c, h00Var.a, h00Var.b));
                            }
                            j00 j00Var2 = f00Var.a;
                            boolean z15 = (j00Var2 == null || (g00Var2 = j00Var2.b) == null) ? false : g00Var2.a.a;
                            if (j00Var2 != null && (g00Var = j00Var2.b) != null) {
                                str21 = g00Var.a.b;
                            }
                            w61.k kVar3 = new w61.k(arrayList12, new x01.i(str21, z15, false));
                            x8Var.v = 1;
                            if (this.s.c(kVar3, x8Var) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                x8Var = new x8(this, cVar);
                Object obj162 = x8Var.u;
                b71.a aVar192 = b71.a.r;
                i15 = x8Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof y8) {
                    y8Var = (y8) cVar;
                    int i43 = y8Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        y8Var.v = i43 - Integer.MIN_VALUE;
                        Object obj18 = y8Var.u;
                        b71.a aVar20 = b71.a.r;
                        i16 = y8Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj18);
                            g40 g40Var = ((e40) obj).a;
                            List f = b91.g.f((g40Var == null || (f40Var = g40Var.a) == null) ? null : f40Var.b);
                            y8Var.v = 1;
                            if (this.s.c(f, y8Var) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                y8Var = new y8(this, cVar);
                Object obj182 = y8Var.u;
                b71.a aVar202 = b71.a.r;
                i16 = y8Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof c9) {
                    c9Var = (c9) cVar;
                    int i44 = c9Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        c9Var.v = i44 - Integer.MIN_VALUE;
                        Object obj19 = c9Var.u;
                        b71.a aVar21 = b71.a.r;
                        i17 = c9Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj19);
                            yz0.w7 z0 = com.google.android.gms.internal.measurement.i4.z0((ta0) obj);
                            c9Var.v = 1;
                            if (this.s.c(z0, c9Var) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                c9Var = new c9(this, cVar);
                Object obj192 = c9Var.u;
                b71.a aVar212 = b71.a.r;
                i17 = c9Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof f9) {
                    f9Var = (f9) cVar;
                    int i45 = f9Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        f9Var.v = i45 - Integer.MIN_VALUE;
                        Object obj20 = f9Var.u;
                        b71.a aVar23 = b71.a.r;
                        i18 = f9Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj20);
                            yz0.y7 G = b31.b.G((hc0) obj);
                            f9Var.v = 1;
                            if (this.s.c(G, f9Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                f9Var = new f9(this, cVar);
                Object obj202 = f9Var.u;
                b71.a aVar232 = b71.a.r;
                i18 = f9Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof i9) {
                    i9Var = (i9) cVar;
                    int i46 = i9Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        i9Var.v = i46 - Integer.MIN_VALUE;
                        Object obj21 = i9Var.u;
                        b71.a aVar24 = b71.a.r;
                        i19 = i9Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj21);
                            h10 h10Var = (h10) obj;
                            l10 l10Var = h10Var.a;
                            List list9 = (l10Var == null || (i10Var3 = l10Var.a) == null) ? null : i10Var3.b;
                            if (list9 == null) {
                                list9 = x61.r.r;
                            }
                            ArrayList S5 = x61.m.S(list9);
                            ArrayList arrayList13 = new ArrayList(x61.n.F(S5, 10));
                            int size3 = S5.size();
                            int i47 = 0;
                            while (i47 < size3) {
                                Object obj23 = S5.get(i47);
                                i47++;
                                ws0.a aVar25 = ((j10) obj23).c;
                                arrayList13.add(new kx0.g(aVar25.b, aVar25.c, w8.s.F(aVar25.d), (int) aVar25.e, aVar25.f));
                            }
                            l10 l10Var2 = h10Var.a;
                            w61.k kVar4 = new w61.k(arrayList13, new x01.i((l10Var2 == null || (i10Var = l10Var2.a) == null) ? null : i10Var.a.b, (l10Var2 == null || (i10Var2 = l10Var2.a) == null) ? false : i10Var2.a.a, false));
                            i9Var.v = 1;
                            if (this.s.c(kVar4, i9Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                i9Var = new i9(this, cVar);
                Object obj212 = i9Var.u;
                b71.a aVar242 = b71.a.r;
                i19 = i9Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof j9) {
                    j9Var = (j9) cVar;
                    int i48 = j9Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        j9Var.v = i48 - Integer.MIN_VALUE;
                        Object obj24 = j9Var.u;
                        b71.a aVar26 = b71.a.r;
                        i20 = j9Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj24);
                            Integer num = new Integer(((uf0) obj).a.a.a);
                            j9Var.v = 1;
                            if (this.s.c(num, j9Var) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                j9Var = new j9(this, cVar);
                Object obj242 = j9Var.u;
                b71.a aVar262 = b71.a.r;
                i20 = j9Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof k9) {
                    k9Var = (k9) cVar;
                    int i49 = k9Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        k9Var.v = i49 - Integer.MIN_VALUE;
                        Object obj25 = k9Var.u;
                        b71.a aVar27 = b71.a.r;
                        i22 = k9Var.v;
                        if (i22 != 0) {
                            sy.y.j(obj25);
                            oe0 oe0Var = (oe0) obj;
                            cp0.c cVar6 = oe0Var.a.d;
                            yz0.c8 c8Var2 = new yz0.c8(m7.y.L(cVar6.f), cVar6.b, oe0Var.a.b);
                            k9Var.v = 1;
                            if (this.s.c(c8Var2, k9Var) == aVar27) {
                                return aVar27;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                        }
                        return w61.a0.a;
                    }
                }
                k9Var = new k9(this, cVar);
                Object obj252 = k9Var.u;
                b71.a aVar272 = b71.a.r;
                i22 = k9Var.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
            case 20:
                return a(cVar, obj);
            case 21:
                return b(cVar, obj);
            case 22:
                if (cVar instanceof n9) {
                    n9Var = (n9) cVar;
                    int i50 = n9Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        n9Var.v = i50 - Integer.MIN_VALUE;
                        Object obj26 = n9Var.u;
                        b71.a aVar28 = b71.a.r;
                        i23 = n9Var.v;
                        if (i23 != 0) {
                            sy.y.j(obj26);
                            String str22 = ((dw0.b) obj).a.a;
                            n9Var.v = 1;
                            if (this.s.c(str22, n9Var) == aVar28) {
                                return aVar28;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return w61.a0.a;
                    }
                }
                n9Var = new n9(this, cVar);
                Object obj262 = n9Var.u;
                b71.a aVar282 = b71.a.r;
                i23 = n9Var.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
            case 23:
                return d(cVar, obj);
            case 24:
                return e(cVar, obj);
            case 25:
                return f(cVar, obj);
            case 26:
                return g(cVar, obj);
            case 27:
                return h(cVar, obj);
            case 28:
                return i(cVar, obj);
            default:
                if (cVar instanceof xk.k) {
                    kVar = (xk.k) cVar;
                    int i52 = kVar.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        kVar.v = i52 - Integer.MIN_VALUE;
                        Object obj27 = kVar.u;
                        b71.a aVar29 = b71.a.r;
                        i24 = kVar.v;
                        if (i24 != 0) {
                            sy.y.j(obj27);
                            List<bk.c> list10 = (List) obj;
                            ArrayList arrayList14 = new ArrayList(x61.n.F(list10, 10));
                            for (bk.c cVar7 : list10) {
                                arrayList14.add(new SimpleRepository(cVar7.d, cVar7.a, cVar7.b, cVar7.c, cVar7.e));
                            }
                            kVar.v = 1;
                            if (this.s.c(arrayList14, kVar) == aVar29) {
                                return aVar29;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                kVar = new xk.k(this, cVar);
                Object obj272 = kVar.u;
                b71.a aVar292 = b71.a.r;
                i24 = kVar.v;
                if (i24 != 0) {
                }
                return w61.a0.a;
        }
    }
}
