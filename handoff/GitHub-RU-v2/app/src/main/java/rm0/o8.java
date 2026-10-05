package rm0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.TimelineItem$TimelinePullRequestReview$ReviewState;
import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import com.github.service.models.response.type.SocialLinkService;
import gn0.kw;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kc0.a10;
import kc0.a20;
import kc0.aa0;
import kc0.ao;
import kc0.b10;
import kc0.ba0;
import kc0.bo;
import kc0.c10;
import kc0.c20;
import kc0.d00;
import kc0.d20;
import kc0.e00;
import kc0.e80;
import kc0.eo;
import kc0.f00;
import kc0.g00;
import kc0.h00;
import kc0.ho;
import kc0.iy;
import kc0.jo;
import kc0.jy;
import kc0.ko;
import kc0.lb0;
import kc0.lo;
import kc0.m60;
import kc0.mb0;
import kc0.mo;
import kc0.nb0;
import kc0.no;
import kc0.oa0;
import kc0.oo;
import kc0.p00;
import kc0.po;
import kc0.pw;
import kc0.q00;
import kc0.qo;
import kc0.qv;
import kc0.qw;
import kc0.r00;
import kc0.ro;
import kc0.rv;
import kc0.rw;
import kc0.rx;
import kc0.sm;
import kc0.so;
import kc0.sx;
import kc0.tg;
import kc0.tm;
import kc0.tv;
import kc0.tw;
import kc0.tx;
import kc0.u00;
import kc0.u90;
import kc0.ub0;
import kc0.ug;
import kc0.um;
import kc0.uv;
import kc0.v00;
import kc0.v90;
import kc0.vx;
import kc0.w00;
import kc0.w90;
import kc0.wv;
import kc0.xv;
import kc0.z00;
import kc0.z90;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o8 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ o8(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        da daVar;
        int i;
        qw qwVar;
        qw qwVar2;
        qw qwVar3;
        if (cVar instanceof da) {
            daVar = (da) cVar;
            int i2 = daVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                daVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = daVar.u;
                b71.a aVar = b71.a.r;
                i = daVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    pw pwVar = (pw) obj;
                    tw twVar = pwVar.a;
                    String str = null;
                    List list = (twVar == null || (qwVar3 = twVar.b) == null) ? null : qwVar3.b;
                    if (list == null) {
                        list = x61.r.r;
                    }
                    ArrayList S = x61.m.S(list);
                    ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                    int size = S.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = S.get(i3);
                        i3++;
                        rw rwVar = (rw) obj3;
                        k71.k.g(rwVar, "<this>");
                        arrayList.add(new wl0.f(rwVar.c, rwVar.a, rwVar.b));
                    }
                    tw twVar2 = pwVar.a;
                    boolean z = (twVar2 == null || (qwVar2 = twVar2.b) == null) ? false : qwVar2.a.a;
                    if (twVar2 != null && (qwVar = twVar2.b) != null) {
                        str = qwVar.a.b;
                    }
                    w61.k kVar = new w61.k(arrayList, new x01.i(str, z, false));
                    daVar.v = 1;
                    if (this.s.c(kVar, daVar) == aVar) {
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
        daVar = new da(this, cVar);
        Object obj22 = daVar.u;
        b71.a aVar2 = b71.a.r;
        i = daVar.v;
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
        ga gaVar;
        int i;
        if (cVar instanceof ga) {
            gaVar = (ga) cVar;
            int i2 = gaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gaVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = gaVar.u;
                b71.a aVar = b71.a.r;
                i = gaVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    yz0.w7 Y = com.google.common.util.concurrent.a.Y((m60) obj);
                    gaVar.v = 1;
                    if (this.s.c(Y, gaVar) == aVar) {
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
        gaVar = new ga(this, cVar);
        Object obj22 = gaVar.u;
        b71.a aVar2 = b71.a.r;
        i = gaVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        ha haVar;
        int i;
        if (cVar instanceof ha) {
            haVar = (ha) cVar;
            int i2 = haVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                haVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = haVar.u;
                b71.a aVar = b71.a.r;
                i = haVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    yz0.y7 i3 = k21.f.i((e80) obj);
                    haVar.v = 1;
                    if (this.s.c(i3, haVar) == aVar) {
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
        haVar = new ha(this, cVar);
        Object obj22 = haVar.u;
        b71.a aVar2 = b71.a.r;
        i = haVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        ia iaVar;
        int i;
        sx sxVar;
        sx sxVar2;
        sx sxVar3;
        if (cVar instanceof ia) {
            iaVar = (ia) cVar;
            int i2 = iaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iaVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = iaVar.u;
                b71.a aVar = b71.a.r;
                i = iaVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    rx rxVar = (rx) obj;
                    vx vxVar = rxVar.a;
                    List list = (vxVar == null || (sxVar3 = vxVar.a) == null) ? null : sxVar3.b;
                    if (list == null) {
                        list = x61.r.r;
                    }
                    ArrayList S = x61.m.S(list);
                    ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                    int size = S.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = S.get(i3);
                        i3++;
                        mh0.a aVar2 = ((tx) obj3).c;
                        arrayList.add(new wl0.g(aVar2.b, aVar2.c, sy.d0.A(aVar2.d), (int) aVar2.e, aVar2.f));
                    }
                    vx vxVar2 = rxVar.a;
                    w61.k kVar = new w61.k(arrayList, new x01.i((vxVar2 == null || (sxVar = vxVar2.a) == null) ? null : sxVar.a.b, (vxVar2 == null || (sxVar2 = vxVar2.a) == null) ? false : sxVar2.a.a, false));
                    iaVar.v = 1;
                    if (this.s.c(kVar, iaVar) == aVar) {
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
        iaVar = new ia(this, cVar);
        Object obj22 = iaVar.u;
        b71.a aVar3 = b71.a.r;
        i = iaVar.v;
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
        ka kaVar;
        int i;
        if (cVar instanceof ka) {
            kaVar = (ka) cVar;
            int i2 = kaVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kaVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = kaVar.u;
                b71.a aVar = b71.a.r;
                i = kaVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    Integer num = new Integer(((ub0) obj).a.a.a);
                    kaVar.v = 1;
                    if (this.s.c(num, kaVar) == aVar) {
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
        kaVar = new ka(this, cVar);
        Object obj22 = kaVar.u;
        b71.a aVar2 = b71.a.r;
        i = kaVar.v;
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
        la laVar;
        int i;
        if (cVar instanceof la) {
            laVar = (la) cVar;
            int i2 = laVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                laVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = laVar.u;
                b71.a aVar = b71.a.r;
                i = laVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    oa0 oa0Var = (oa0) obj;
                    ud0.a aVar2 = oa0Var.a.d;
                    yz0.c8 c8Var = new yz0.c8(b41.b.O(aVar2.d), aVar2.b, oa0Var.a.b);
                    laVar.v = 1;
                    if (this.s.c(c8Var, laVar) == aVar) {
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
        laVar = new la(this, cVar);
        Object obj22 = laVar.u;
        b71.a aVar3 = b71.a.r;
        i = laVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        na naVar;
        int i;
        yz0.p8 p8Var;
        boolean z;
        String str;
        boolean z2;
        String str2;
        yz0.o8 o8Var;
        boolean z3;
        ArrayList arrayList;
        ?? r5;
        boolean z4;
        int i2;
        ?? r7;
        wk0.l1 l1Var;
        ZonedDateTime zonedDateTime;
        OrganizationNameAndAvatarUrl organizationNameAndAvatarUrl;
        if (cVar instanceof na) {
            naVar = (na) cVar;
            int i3 = naVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                naVar.v = i3 - Integer.MIN_VALUE;
                Object obj2 = naVar.u;
                b71.a aVar = b71.a.r;
                i = naVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    lb0 lb0Var = (lb0) obj;
                    nb0 nb0Var = lb0Var.a;
                    x61.r rVar = x61.r.r;
                    if (nb0Var != null) {
                        wk0.s1 s1Var = nb0Var.c;
                        String str3 = s1Var.b;
                        String str4 = s1Var.c;
                        Avatar O = b41.b.O(s1Var.G);
                        String str5 = s1Var.d;
                        String str6 = s1Var.e;
                        String str7 = s1Var.f;
                        int i4 = s1Var.H.c.a;
                        int i5 = s1Var.g.a;
                        boolean z5 = s1Var.h;
                        boolean z6 = s1Var.i;
                        boolean z7 = s1Var.j;
                        boolean z8 = s1Var.k;
                        boolean z9 = s1Var.l;
                        String str8 = s1Var.n;
                        String str9 = str8 == null ? "" : str8;
                        String str10 = s1Var.o;
                        String str11 = s1Var.p;
                        String str12 = str11 == null ? "" : str11;
                        int i6 = s1Var.q.a;
                        String str13 = s1Var.r;
                        String str14 = str13 == null ? "" : str13;
                        int i7 = s1Var.s.a;
                        int i8 = s1Var.t.a;
                        boolean z10 = s1Var.x;
                        boolean z12 = s1Var.y;
                        String str15 = s1Var.z;
                        String str16 = str15 == null ? "" : str15;
                        wk0.q1 q1Var = s1Var.u;
                        if (q1Var != null) {
                            wk0.n0 n0Var = q1Var.c;
                            z = z8;
                            String str17 = n0Var.b;
                            wk0.m0 m0Var = n0Var.g;
                            str = "";
                            String str18 = str17 == null ? str : str17;
                            boolean z13 = n0Var.c;
                            String str19 = n0Var.d;
                            String str20 = str19 == null ? str : str19;
                            String str21 = n0Var.e;
                            String str22 = str21 == null ? str : str21;
                            ZonedDateTime zonedDateTime2 = n0Var.f;
                            if (m0Var != null) {
                                sd0.s sVar = m0Var.c;
                                zonedDateTime = zonedDateTime2;
                                z2 = z7;
                                str2 = str4;
                                organizationNameAndAvatarUrl = new OrganizationNameAndAvatarUrl(sVar.b, sVar.c, sVar.d);
                            } else {
                                zonedDateTime = zonedDateTime2;
                                z2 = z7;
                                str2 = str4;
                                organizationNameAndAvatarUrl = null;
                            }
                            o8Var = new yz0.o8(str18, str22, z13, str20, organizationNameAndAvatarUrl, m0Var != null ? m0Var.c.a : null, zonedDateTime);
                        } else {
                            z = z8;
                            str = "";
                            z2 = z7;
                            str2 = str4;
                            o8Var = null;
                        }
                        ji0.f fVar = s1Var.m.b;
                        boolean z14 = fVar.a;
                        List<ji0.e> list = fVar.b.a;
                        if (list == null) {
                            list = rVar;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (ji0.e eVar : list) {
                            yz0.k8 j = (eVar != null ? eVar.c : null) != null ? m7.y.j(eVar.c) : (eVar != null ? eVar.b : null) != null ? m7.y.k(eVar.b.c) : null;
                            if (j != null) {
                                arrayList2.add(j);
                            }
                        }
                        yz0.m8 n = (!s1Var.v || (l1Var = s1Var.w) == null) ? null : m7.y.n(l1Var.b);
                        boolean z15 = s1Var.A;
                        boolean z16 = s1Var.B;
                        List list2 = s1Var.E.a;
                        if (list2 != null) {
                            ArrayList S = x61.m.S(list2);
                            z3 = z14;
                            arrayList = arrayList2;
                            r5 = new ArrayList(x61.n.F(S, 10));
                            int size = S.size();
                            int i9 = 0;
                            while (i9 < size) {
                                Object obj3 = S.get(i9);
                                int i10 = i9 + 1;
                                wk0.j1 j1Var = (wk0.j1) obj3;
                                boolean z17 = z16;
                                String str23 = j1Var.c;
                                r01.w wVar = SocialLinkService.Companion;
                                ArrayList arrayList3 = S;
                                String str24 = j1Var.b.r;
                                wVar.getClass();
                                r5.add(new yz0.n8(str23, r01.w.a(str24), j1Var.a));
                                size = size;
                                i9 = i10;
                                S = arrayList3;
                                z16 = z17;
                            }
                        } else {
                            z3 = z14;
                            arrayList = arrayList2;
                            r5 = 0;
                        }
                        boolean z18 = z16;
                        x61.r rVar2 = r5 == 0 ? rVar : r5;
                        boolean z19 = s1Var.C;
                        int i12 = s1Var.D.a;
                        List list3 = s1Var.F.a;
                        if (list3 != null) {
                            ArrayList S2 = x61.m.S(list3);
                            ArrayList arrayList4 = new ArrayList(x61.n.F(S2, 10));
                            int size2 = S2.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                Object obj4 = S2.get(i13);
                                i13++;
                                ArrayList arrayList5 = S2;
                                wk0.i1 i1Var = (wk0.i1) obj4;
                                boolean z20 = z19;
                                int i14 = i12;
                                wk0.e1 e1Var = i1Var.a;
                                int i15 = size2;
                                String str25 = e1Var.b;
                                String str26 = e1Var.a;
                                wk0.r1 r1Var = i1Var.b;
                                String str27 = r1Var != null ? r1Var.b : null;
                                if (str27 == null) {
                                    str27 = str;
                                }
                                arrayList4.add(new yz0.h8(str25, str26, str27));
                                size2 = i15;
                                S2 = arrayList5;
                                z19 = z20;
                                i12 = i14;
                            }
                            z4 = z19;
                            i2 = i12;
                            r7 = new ArrayList();
                            int size3 = arrayList4.size();
                            int i16 = 0;
                            while (i16 < size3) {
                                Object obj5 = arrayList4.get(i16);
                                i16++;
                                yz0.h8 h8Var = (yz0.h8) obj5;
                                int i17 = size3;
                                if (!t71.p.T(h8Var.a) && !t71.p.T(h8Var.c)) {
                                    r7.add(obj5);
                                }
                                size3 = i17;
                            }
                        } else {
                            z4 = z19;
                            i2 = i12;
                            r7 = 0;
                        }
                        p8Var = new yz0.p8(str3, str2, O, str5, str6, str7, i4, i5, z5, false, z6, z2, z, z9, str9, str10, str12, i6, str14, i7, i8, 0, z10, z12, str16, o8Var, z3, arrayList, n, false, z15, z18, "", z4, i2, null, r7 == 0 ? rVar : r7, rVar2);
                    } else {
                        mb0 mb0Var = lb0Var.b;
                        if (mb0Var == null) {
                            throw new ApiFailure(ApiFailureType.NOT_FOUND, null, null, null, null, null, null, 120);
                        }
                        ci0.i iVar = mb0Var.c;
                        String str28 = iVar.i;
                        String str29 = iVar.b;
                        String str30 = iVar.c;
                        Avatar O2 = b41.b.O(iVar.r);
                        String str31 = iVar.d;
                        String str32 = str31 == null ? "" : str31;
                        String str33 = iVar.e;
                        String str34 = str33 == null ? "" : str33;
                        boolean z22 = iVar.f;
                        String str35 = iVar.h;
                        String str36 = str35 == null ? "" : str35;
                        String str37 = iVar.j;
                        String str38 = str37 == null ? "" : str37;
                        int i18 = iVar.l.a;
                        boolean z23 = iVar.k;
                        String str39 = iVar.n;
                        String str40 = str39 == null ? "" : str39;
                        ji0.f fVar2 = iVar.g.b;
                        boolean z24 = fVar2.a;
                        List<ji0.e> list4 = fVar2.b.a;
                        if (list4 == null) {
                            list4 = rVar;
                        }
                        ArrayList arrayList6 = new ArrayList();
                        for (ji0.e eVar2 : list4) {
                            boolean z25 = z22;
                            int i19 = i18;
                            yz0.k8 j2 = (eVar2 != null ? eVar2.c : null) != null ? m7.y.j(eVar2.c) : (eVar2 != null ? eVar2.b : null) != null ? m7.y.k(eVar2.b.c) : null;
                            if (j2 != null) {
                                arrayList6.add(j2);
                            }
                            z22 = z25;
                            i18 = i19;
                        }
                        boolean z26 = z22;
                        int i20 = i18;
                        ci0.h hVar = iVar.m;
                        yz0.m8 n2 = hVar != null ? m7.y.n(hVar.b) : null;
                        String str41 = iVar.o;
                        String str42 = str41 == null ? "" : str41;
                        int i22 = iVar.p.a;
                        ci0.d dVar = iVar.q;
                        p8Var = new yz0.p8(str29, str30, O2, str32, "", str34, -1, -1, false, z26, false, false, false, false, str36, str28, str38, -1, "", i20, -1, 0, true, z23, str40, null, z24, arrayList6, n2, true, false, false, str42, false, i22, dVar != null ? new yz0.d1(str28, dVar.b.a, dVar.a) : null, rVar, rVar);
                    }
                    naVar.v = 1;
                    if (this.s.c(p8Var, naVar) == aVar) {
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
        naVar = new na(this, cVar);
        Object obj22 = naVar.u;
        b71.a aVar2 = b71.a.r;
        i = naVar.v;
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
        pa paVar;
        int i;
        if (cVar instanceof pa) {
            paVar = (pa) cVar;
            int i2 = paVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = paVar.u;
                b71.a aVar = b71.a.r;
                i = paVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    String str = ((uk0.b) obj).a.a;
                    paVar.v = 1;
                    if (this.s.c(str, paVar) == aVar) {
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
        paVar = new pa(this, cVar);
        Object obj22 = paVar.u;
        b71.a aVar2 = b71.a.r;
        i = paVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x069a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0a6a  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        n8 n8Var;
        int i;
        s8 s8Var;
        int i2;
        v8 v8Var;
        int i3;
        w8 w8Var;
        int i4;
        x8 x8Var;
        int i5;
        a9 a9Var;
        int i6;
        qv qvVar;
        b9 b9Var;
        int i7;
        d9 d9Var;
        int i8;
        f9 f9Var;
        int i9;
        yz0.a7 w;
        kc0.a1 a1Var;
        kc0.a1 a1Var2;
        h9 h9Var;
        int i10;
        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState;
        b71.a aVar;
        oo ooVar;
        String str;
        String str2;
        ArrayList arrayList;
        yz0.k3 k3Var;
        boolean z;
        CommentLevelType commentLevelType;
        po poVar;
        List list;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str3;
        String str4;
        boolean z2;
        CommentLevelType commentLevelType2;
        i9 i9Var;
        int i12;
        j9 j9Var;
        int i13;
        yz0.a7 w2;
        c20 c20Var;
        m9 m9Var;
        int i14;
        kc0.j7 j7Var;
        List<kc0.l7> list2;
        kc0.m7 m7Var;
        n9 n9Var;
        int i15;
        List<b10> list3;
        c10 c10Var;
        o9 o9Var;
        int i16;
        ArrayList arrayList4;
        List list4;
        p9 p9Var;
        int i17;
        v90 v90Var;
        t9 t9Var;
        int i18;
        aa0 aa0Var;
        u9 u9Var;
        int i19;
        aa0 aa0Var2;
        z9 z9Var;
        int i20;
        ba baVar;
        int i22;
        ea eaVar;
        int i23;
        q00 q00Var;
        va vaVar;
        int i24;
        String a;
        switch (this.r) {
            case 0:
                if (cVar instanceof n8) {
                    n8Var = (n8) cVar;
                    int i25 = n8Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        n8Var.v = i25 - Integer.MIN_VALUE;
                        Object obj2 = n8Var.u;
                        b71.a aVar2 = b71.a.r;
                        i = n8Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            jy jyVar = ((iy) obj).a;
                            if (jyVar != null) {
                                n8Var.v = 1;
                                if (this.s.c(jyVar, n8Var) == aVar2) {
                                    return aVar2;
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
                n8Var = new n8(this, cVar);
                Object obj22 = n8Var.u;
                b71.a aVar22 = b71.a.r;
                i = n8Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof s8) {
                    s8Var = (s8) cVar;
                    int i26 = s8Var.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        s8Var.v = i26 - Integer.MIN_VALUE;
                        Object obj3 = s8Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = s8Var.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            s8Var.v = 1;
                            if (this.s.c(a0Var, s8Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return a0Var;
                    }
                }
                s8Var = new s8(this, cVar);
                Object obj32 = s8Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = s8Var.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i2 != 0) {
                }
                return a0Var2;
            case 2:
                if (cVar instanceof v8) {
                    v8Var = (v8) cVar;
                    int i27 = v8Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        v8Var.v = i27 - Integer.MIN_VALUE;
                        Object obj4 = v8Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = v8Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            d00 d00Var = (d00) obj;
                            h00 h00Var = d00Var.a;
                            int i28 = h00Var.a;
                            Iterable iterable = h00Var.c;
                            if (iterable == null) {
                                iterable = x61.r.r;
                            }
                            ArrayList S = x61.m.S(iterable);
                            ArrayList arrayList5 = new ArrayList();
                            int size = S.size();
                            int i29 = 0;
                            while (i29 < size) {
                                Object obj5 = S.get(i29);
                                i29++;
                                f00 f00Var = ((e00) obj5).b;
                                SimpleRepository Z = f00Var != null ? b91.g.Z(f00Var.c) : null;
                                if (Z != null) {
                                    arrayList5.add(Z);
                                }
                            }
                            g00 g00Var = d00Var.a.b;
                            yz0.d4 d4Var = new yz0.d4(i28, arrayList5, new x01.i(g00Var.b, g00Var.a, false));
                            v8Var.v = 1;
                            if (this.s.c(d4Var, v8Var) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                v8Var = new v8(this, cVar);
                Object obj42 = v8Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = v8Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof w8) {
                    w8Var = (w8) cVar;
                    int i30 = w8Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        w8Var.v = i30 - Integer.MIN_VALUE;
                        Object obj6 = w8Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = w8Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj6);
                            Boolean bool = Boolean.FALSE;
                            w8Var.v = 1;
                            if (this.s.c(bool, w8Var) == aVar5) {
                                return aVar5;
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
                w8Var = new w8(this, cVar);
                Object obj62 = w8Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = w8Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof x8) {
                    x8Var = (x8) cVar;
                    int i32 = x8Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        x8Var.v = i32 - Integer.MIN_VALUE;
                        Object obj7 = x8Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = x8Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj7);
                            Boolean bool2 = Boolean.TRUE;
                            x8Var.v = 1;
                            if (this.s.c(bool2, x8Var) == aVar6) {
                                return aVar6;
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
                x8Var = new x8(this, cVar);
                Object obj72 = x8Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = x8Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof a9) {
                    a9Var = (a9) cVar;
                    int i33 = a9Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        a9Var.v = i33 - Integer.MIN_VALUE;
                        Object obj8 = a9Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = a9Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj8);
                            xv xvVar = (xv) obj;
                            int i34 = xvVar.a;
                            rv rvVar = xvVar.c;
                            Integer num = new Integer(i34);
                            List list5 = rvVar != null ? rvVar.c : null;
                            if (list5 == null) {
                                list5 = x61.r.r;
                            }
                            ArrayList S2 = x61.m.S(list5);
                            ArrayList arrayList6 = new ArrayList();
                            int size2 = S2.size();
                            int i35 = 0;
                            while (i35 < size2) {
                                Object obj9 = S2.get(i35);
                                i35++;
                                String str5 = ((uv) obj9).c.d;
                                wv wvVar = xvVar.b;
                                if (!str5.equals((wvVar == null || (qvVar = wvVar.a) == null) ? null : qvVar.b.b)) {
                                    arrayList6.add(obj9);
                                }
                            }
                            ArrayList arrayList7 = new ArrayList(x61.n.F(arrayList6, 10));
                            int size3 = arrayList6.size();
                            int i36 = 0;
                            while (i36 < size3) {
                                Object obj10 = arrayList6.get(i36);
                                i36++;
                                uv uvVar = (uv) obj10;
                                wk0.c1 c1Var = uvVar.c;
                                arrayList7.add(new yz0.e2(new com.github.service.models.response.a(c1Var.d, b41.b.O(c1Var.g), (String) null, false, (String) null, 60), IssueOrPullRequest$ReviewerReviewState.PENDING, uvVar.c.b, yz0.f2.d, false, 96));
                            }
                            w61.q qVar = new w61.q(num, arrayList7, new x01.i(rvVar != null ? rvVar.a.b : null, rvVar != null ? rvVar.a.a : false, false));
                            a9Var.v = 1;
                            if (this.s.c(qVar, a9Var) == aVar7) {
                                return aVar7;
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
                a9Var = new a9(this, cVar);
                Object obj82 = a9Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = a9Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof b9) {
                    b9Var = (b9) cVar;
                    int i37 = b9Var.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        b9Var.v = i37 - Integer.MIN_VALUE;
                        Object obj11 = b9Var.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = b9Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj11);
                            xv xvVar2 = ((tv) obj).a;
                            if (xvVar2 != null) {
                                b9Var.v = 1;
                                if (this.s.c(xvVar2, b9Var) == aVar8) {
                                    return aVar8;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                b9Var = new b9(this, cVar);
                Object obj112 = b9Var.u;
                b71.a aVar82 = b71.a.r;
                i7 = b9Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof d9) {
                    d9Var = (d9) cVar;
                    int i38 = d9Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        d9Var.v = i38 - Integer.MIN_VALUE;
                        Object obj12 = d9Var.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = d9Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj12);
                            sm smVar = (sm) obj;
                            um umVar = smVar.a;
                            List list6 = umVar != null ? umVar.a.b : null;
                            if (list6 == null) {
                                list6 = x61.r.r;
                            }
                            ArrayList S3 = x61.m.S(list6);
                            ArrayList arrayList8 = new ArrayList(x61.n.F(S3, 10));
                            int size4 = S3.size();
                            int i39 = 0;
                            while (i39 < size4) {
                                Object obj13 = S3.get(i39);
                                i39++;
                                tm tmVar = (tm) obj13;
                                String str6 = tmVar.c;
                                String str7 = tmVar.d;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                arrayList8.add(new yz0.e2(new com.github.service.models.response.a(str6, new Avatar(str7, Avatar.Type.Organization), (String) null, false, (String) null, 60), IssueOrPullRequest$ReviewerReviewState.PENDING, tmVar.b, yz0.f2.b, false, 96));
                            }
                            um umVar2 = smVar.a;
                            w61.k kVar = new w61.k(arrayList8, new x01.i(umVar2 != null ? umVar2.a.a.b : null, umVar2 != null ? umVar2.a.a.a : false, false));
                            d9Var.v = 1;
                            if (this.s.c(kVar, d9Var) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                d9Var = new d9(this, cVar);
                Object obj122 = d9Var.u;
                b71.a aVar92 = b71.a.r;
                i8 = d9Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof f9) {
                    f9Var = (f9) cVar;
                    int i40 = f9Var.v;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        f9Var.v = i40 - Integer.MIN_VALUE;
                        Object obj14 = f9Var.u;
                        b71.a aVar10 = b71.a.r;
                        i9 = f9Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj14);
                            kc0.y0 y0Var = (kc0.y0) obj;
                            k71.k.g(y0Var, "<this>");
                            kc0.w0 w0Var = y0Var.a;
                            String str8 = (w0Var == null || (a1Var2 = w0Var.a) == null) ? "" : a1Var2.b;
                            wi0.c cVar2 = (w0Var == null || (a1Var = w0Var.a) == null) ? null : a1Var.d;
                            if (cVar2 == null) {
                                yz0.s.Companion.getClass();
                                w = new yz0.a7(yz0.r.b, true, TimelineItem$TimelinePullRequestReview$ReviewState.UNKNOWN);
                            } else {
                                w = b31.b.w(cVar2);
                            }
                            yz0.c cVar3 = new yz0.c(str8, w);
                            f9Var.v = 1;
                            if (this.s.c(cVar3, f9Var) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                f9Var = new f9(this, cVar);
                Object obj142 = f9Var.u;
                b71.a aVar102 = b71.a.r;
                i9 = f9Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof h9) {
                    h9Var = (h9) cVar;
                    int i42 = h9Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        h9Var.v = i42 - Integer.MIN_VALUE;
                        Object obj15 = h9Var.u;
                        b71.a aVar11 = b71.a.r;
                        i10 = h9Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj15);
                            ko koVar = (ko) obj;
                            k71.k.g(koVar, "<this>");
                            String str9 = koVar.d;
                            aj0.c cVar4 = koVar.l;
                            String str10 = koVar.b;
                            oo ooVar2 = koVar.i;
                            so soVar = koVar.j;
                            no noVar = koVar.g;
                            String str11 = noVar.a;
                            String str12 = noVar.b;
                            List<ho> list7 = soVar != null ? soVar.a : null;
                            if (list7 == null) {
                                list7 = x61.r.r;
                            }
                            ArrayList arrayList9 = new ArrayList();
                            for (ho hoVar : list7) {
                                if (hoVar != null) {
                                    oo ooVar3 = ooVar2;
                                    lo loVar = hoVar.c;
                                    mo moVar = hoVar.b;
                                    if (moVar != null) {
                                        pl0.h hVar = pl0.i.Companion;
                                        str = str12;
                                        bo boVar = moVar.k;
                                        List list8 = moVar.j;
                                        ArrayList S4 = list8 != null ? x61.m.S(list8) : null;
                                        String str13 = moVar.c;
                                        String str14 = moVar.b;
                                        yi0.a aVar12 = moVar.l;
                                        boolean z3 = moVar.e;
                                        qo qoVar = moVar.h;
                                        if (qoVar != null) {
                                            arrayList2 = arrayList9;
                                            arrayList3 = S4;
                                            str3 = str13;
                                            str4 = qoVar.a;
                                        } else {
                                            arrayList2 = arrayList9;
                                            arrayList3 = S4;
                                            str3 = str13;
                                            str4 = "";
                                        }
                                        boolean z4 = moVar.f;
                                        boolean z5 = moVar.g;
                                        boolean z6 = moVar.i;
                                        int ordinal = moVar.d.ordinal();
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
                                        ooVar = ooVar3;
                                        str2 = str11;
                                        boolean z7 = z2;
                                        aVar = aVar11;
                                        arrayList = arrayList2;
                                        k3Var = pl0.h.a(str10, null, commentLevelType3, boVar, null, arrayList3, str3, str14, aVar12, str2, str, z3, str4, z4, z5, z7);
                                    } else {
                                        aVar = aVar11;
                                        str = str12;
                                        str2 = str11;
                                        arrayList = arrayList9;
                                        ooVar = ooVar3;
                                        String str15 = "";
                                        if (loVar != null) {
                                            ro roVar = loVar.e;
                                            pl0.h hVar2 = pl0.i.Companion;
                                            ArrayList S5 = (roVar == null || (list = roVar.g) == null) ? null : x61.m.S(list);
                                            String str16 = loVar.c;
                                            String str17 = loVar.b;
                                            yi0.a aVar13 = roVar != null ? roVar.i : null;
                                            boolean z8 = roVar != null ? roVar.b : false;
                                            String str18 = str10;
                                            if (roVar != null && (poVar = roVar.c) != null) {
                                                str15 = poVar.a;
                                            }
                                            boolean z9 = roVar != null ? roVar.d : false;
                                            boolean z10 = roVar != null ? roVar.e : false;
                                            boolean z12 = roVar != null ? roVar.f : false;
                                            int ordinal2 = loVar.d.ordinal();
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
                                            str10 = str18;
                                            k3Var = pl0.h.a(str10, loVar, commentLevelType4, null, S5, null, str16, str17, aVar13, str2, str, z8, str15, z9, z, z12);
                                        }
                                    }
                                    if (k3Var == null) {
                                        arrayList.add(k3Var);
                                    }
                                    arrayList9 = arrayList;
                                    ooVar2 = ooVar;
                                    str11 = str2;
                                    str12 = str;
                                    aVar11 = aVar;
                                } else {
                                    aVar = aVar11;
                                    ooVar = ooVar2;
                                    str = str12;
                                    str2 = str11;
                                    arrayList = arrayList9;
                                }
                                k3Var = null;
                                if (k3Var == null) {
                                }
                                arrayList9 = arrayList;
                                ooVar2 = ooVar;
                                str11 = str2;
                                str12 = str;
                                aVar11 = aVar;
                            }
                            b71.a aVar14 = aVar11;
                            oo ooVar4 = ooVar2;
                            ArrayList arrayList10 = arrayList9;
                            oj0.e2 e2Var = ooVar4.c;
                            String str19 = e2Var.d;
                            String str20 = e2Var.c;
                            oj0.b2 b2Var = e2Var.h;
                            yz0.t7 t7Var = new yz0.t7(str19, str20, b2Var.c, b41.b.O(b2Var.d), new wl0.j(ooVar4.d), e2Var.e);
                            String str21 = e2Var.h.b;
                            wl0.b bVar = new wl0.b(koVar.k, str9, new yz0.k0(str10));
                            ZonedDateTime zonedDateTime = koVar.f;
                            ArrayList p = aa1.b.p(cVar4, str10);
                            boolean z13 = cVar4.c;
                            int ordinal3 = koVar.c.ordinal();
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
                            ao aoVar = koVar.h;
                            com.github.service.models.response.a d = aa1.b.d(aoVar != null ? aoVar.b : null);
                            boolean z14 = koVar.e;
                            yh0.a aVar15 = koVar.n;
                            yz0.l3 l3Var = new yz0.l3(str10, arrayList10, t7Var, str21, bVar, zonedDateTime, p, z13, issueOrPullRequest$ReviewerReviewState2, d, z14, str9, aVar15.b, aVar15.c);
                            h9Var.v = 1;
                            if (this.s.c(l3Var, h9Var) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return w61.a0.a;
                    }
                }
                h9Var = new h9(this, cVar);
                Object obj152 = h9Var.u;
                b71.a aVar112 = b71.a.r;
                i10 = h9Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof i9) {
                    i9Var = (i9) cVar;
                    int i43 = i9Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        i9Var.v = i43 - Integer.MIN_VALUE;
                        Object obj16 = i9Var.u;
                        b71.a aVar16 = b71.a.r;
                        i12 = i9Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj16);
                            jo joVar = ((eo) obj).a;
                            ko koVar2 = joVar != null ? joVar.c : null;
                            if (koVar2 != null) {
                                i9Var.v = 1;
                                if (this.s.c(koVar2, i9Var) == aVar16) {
                                    return aVar16;
                                }
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                i9Var = new i9(this, cVar);
                Object obj162 = i9Var.u;
                b71.a aVar162 = b71.a.r;
                i12 = i9Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof j9) {
                    j9Var = (j9) cVar;
                    int i44 = j9Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        j9Var.v = i44 - Integer.MIN_VALUE;
                        Object obj17 = j9Var.u;
                        b71.a aVar17 = b71.a.r;
                        i13 = j9Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj17);
                            a20 a20Var = (a20) obj;
                            k71.k.g(a20Var, "<this>");
                            d20 d20Var = a20Var.a;
                            wi0.c cVar5 = (d20Var == null || (c20Var = d20Var.a) == null) ? null : c20Var.d;
                            if (cVar5 == null) {
                                yz0.s.Companion.getClass();
                                w2 = new yz0.a7(yz0.r.b, false, TimelineItem$TimelinePullRequestReview$ReviewState.UNKNOWN);
                            } else {
                                w2 = b31.b.w(cVar5);
                            }
                            yz0.b5 b5Var = new yz0.b5(w2);
                            j9Var.v = 1;
                            if (this.s.c(b5Var, j9Var) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                j9Var = new j9(this, cVar);
                Object obj172 = j9Var.u;
                b71.a aVar172 = b71.a.r;
                i13 = j9Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof m9) {
                    m9Var = (m9) cVar;
                    int i45 = m9Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        m9Var.v = i45 - Integer.MIN_VALUE;
                        Object obj18 = m9Var.u;
                        b71.a aVar18 = b71.a.r;
                        i14 = m9Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj18);
                            kc0.i7 i7Var = ((kc0.k7) obj).a;
                            ArrayList arrayList11 = null;
                            if (i7Var != null && (j7Var = i7Var.a) != null && (list2 = j7Var.a.a) != null) {
                                ArrayList arrayList12 = new ArrayList();
                                for (kc0.l7 l7Var : list2) {
                                    q01.r r0 = (l7Var == null || (m7Var = l7Var.a) == null) ? null : com.google.android.gms.internal.measurement.b4.r0(m7Var.c);
                                    if (r0 != null) {
                                        arrayList12.add(r0);
                                    }
                                }
                                arrayList11 = arrayList12;
                            }
                            if (arrayList11 != null) {
                                m9Var.v = 1;
                                if (this.s.c(arrayList11, m9Var) == aVar18) {
                                    return aVar18;
                                }
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                m9Var = new m9(this, cVar);
                Object obj182 = m9Var.u;
                b71.a aVar182 = b71.a.r;
                i14 = m9Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof n9) {
                    n9Var = (n9) cVar;
                    int i46 = n9Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        n9Var.v = i46 - Integer.MIN_VALUE;
                        Object obj19 = n9Var.u;
                        b71.a aVar19 = b71.a.r;
                        i15 = n9Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj19);
                            z00 z00Var = ((a10) obj).a.a;
                            ArrayList arrayList13 = null;
                            if (z00Var != null && (list3 = z00Var.a.a) != null) {
                                ArrayList arrayList14 = new ArrayList();
                                for (b10 b10Var : list3) {
                                    q01.r r02 = (b10Var == null || (c10Var = b10Var.a) == null) ? null : com.google.android.gms.internal.measurement.b4.r0(c10Var.c);
                                    if (r02 != null) {
                                        arrayList14.add(r02);
                                    }
                                }
                                arrayList13 = arrayList14;
                            }
                            if (arrayList13 != null) {
                                n9Var.v = 1;
                                if (this.s.c(arrayList13, n9Var) == aVar19) {
                                    return aVar19;
                                }
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                n9Var = new n9(this, cVar);
                Object obj192 = n9Var.u;
                b71.a aVar192 = b71.a.r;
                i15 = n9Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof o9) {
                    o9Var = (o9) cVar;
                    int i47 = o9Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        o9Var.v = i47 - Integer.MIN_VALUE;
                        Object obj20 = o9Var.u;
                        b71.a aVar20 = b71.a.r;
                        i16 = o9Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj20);
                            v00 v00Var = ((u00) obj).a;
                            if (v00Var == null || (list4 = v00Var.a) == null) {
                                arrayList4 = null;
                            } else {
                                arrayList4 = new ArrayList(x61.n.F(list4, 10));
                                Iterator it = list4.iterator();
                                while (it.hasNext()) {
                                    arrayList4.add(com.google.android.gms.internal.measurement.b4.r0(((w00) it.next()).c));
                                }
                            }
                            if (arrayList4 != null) {
                                o9Var.v = 1;
                                if (this.s.c(arrayList4, o9Var) == aVar20) {
                                    return aVar20;
                                }
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                o9Var = new o9(this, cVar);
                Object obj202 = o9Var.u;
                b71.a aVar202 = b71.a.r;
                i16 = o9Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof p9) {
                    p9Var = (p9) cVar;
                    int i48 = p9Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        p9Var.v = i48 - Integer.MIN_VALUE;
                        Object obj21 = p9Var.u;
                        b71.a aVar21 = b71.a.r;
                        i17 = p9Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj21);
                            w90 w90Var = ((u90) obj).a;
                            q01.r r03 = (w90Var == null || (v90Var = w90Var.a) == null) ? null : com.google.android.gms.internal.measurement.b4.r0(v90Var.c);
                            if (r03 != null) {
                                p9Var.v = 1;
                                if (this.s.c(r03, p9Var) == aVar21) {
                                    return aVar21;
                                }
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                p9Var = new p9(this, cVar);
                Object obj212 = p9Var.u;
                b71.a aVar212 = b71.a.r;
                i17 = p9Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof t9) {
                    t9Var = (t9) cVar;
                    int i49 = t9Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        t9Var.v = i49 - Integer.MIN_VALUE;
                        Object obj23 = t9Var.u;
                        b71.a aVar23 = b71.a.r;
                        i18 = t9Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj23);
                            ba0 ba0Var = ((z90) obj).a;
                            kw kwVar = (ba0Var == null || (aa0Var = ba0Var.a) == null) ? null : aa0Var.b.c;
                            Boolean valueOf = Boolean.valueOf((kwVar == null ? -1 : r9.a[kwVar.ordinal()]) == 1);
                            t9Var.v = 1;
                            if (this.s.c(valueOf, t9Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return w61.a0.a;
                    }
                }
                t9Var = new t9(this, cVar);
                Object obj232 = t9Var.u;
                b71.a aVar232 = b71.a.r;
                i18 = t9Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof u9) {
                    u9Var = (u9) cVar;
                    int i50 = u9Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        u9Var.v = i50 - Integer.MIN_VALUE;
                        Object obj24 = u9Var.u;
                        b71.a aVar24 = b71.a.r;
                        i19 = u9Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj24);
                            ba0 ba0Var2 = ((z90) obj).a;
                            kw kwVar2 = (ba0Var2 == null || (aa0Var2 = ba0Var2.a) == null) ? null : aa0Var2.b.c;
                            Boolean valueOf2 = Boolean.valueOf((kwVar2 == null ? -1 : r9.a[kwVar2.ordinal()]) == 1);
                            u9Var.v = 1;
                            if (this.s.c(valueOf2, u9Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                u9Var = new u9(this, cVar);
                Object obj242 = u9Var.u;
                b71.a aVar242 = b71.a.r;
                i19 = u9Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof z9) {
                    z9Var = (z9) cVar;
                    int i52 = z9Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        z9Var.v = i52 - Integer.MIN_VALUE;
                        Object obj25 = z9Var.u;
                        b71.a aVar25 = b71.a.r;
                        i20 = z9Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj25);
                            ug ugVar = ((tg) obj).a;
                            wl0.j jVar = new wl0.j(ugVar != null ? ugVar.c : null);
                            z9Var.v = 1;
                            if (this.s.c(jVar, z9Var) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                        }
                        return w61.a0.a;
                    }
                }
                z9Var = new z9(this, cVar);
                Object obj252 = z9Var.u;
                b71.a aVar252 = b71.a.r;
                i20 = z9Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof ba) {
                    baVar = (ba) cVar;
                    int i53 = baVar.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        baVar.v = i53 - Integer.MIN_VALUE;
                        Object obj26 = baVar.u;
                        b71.a aVar26 = b71.a.r;
                        i22 = baVar.v;
                        w61.a0 a0Var3 = w61.a0.a;
                        if (i22 != 0) {
                            sy.y.j(obj26);
                            baVar.v = 1;
                            if (this.s.c(a0Var3, baVar) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return a0Var3;
                    }
                }
                baVar = new ba(this, cVar);
                Object obj262 = baVar.u;
                b71.a aVar262 = b71.a.r;
                i22 = baVar.v;
                w61.a0 a0Var32 = w61.a0.a;
                if (i22 != 0) {
                }
                return a0Var32;
            case 20:
                return a(cVar, obj);
            case 21:
                if (cVar instanceof ea) {
                    eaVar = (ea) cVar;
                    int i54 = eaVar.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        eaVar.v = i54 - Integer.MIN_VALUE;
                        Object obj27 = eaVar.u;
                        b71.a aVar27 = b71.a.r;
                        i23 = eaVar.v;
                        if (i23 != 0) {
                            sy.y.j(obj27);
                            r00 r00Var = ((p00) obj).a;
                            List f = com.google.common.util.concurrent.a.f((r00Var == null || (q00Var = r00Var.a) == null) ? null : q00Var.b);
                            eaVar.v = 1;
                            if (this.s.c(f, eaVar) == aVar27) {
                                return aVar27;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                eaVar = new ea(this, cVar);
                Object obj272 = eaVar.u;
                b71.a aVar272 = b71.a.r;
                i23 = eaVar.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
            case 22:
                return b(cVar, obj);
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
                if (cVar instanceof va) {
                    vaVar = (va) cVar;
                    int i55 = vaVar.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        vaVar.v = i55 - Integer.MIN_VALUE;
                        Object obj28 = vaVar.u;
                        b71.a aVar28 = b71.a.r;
                        i24 = vaVar.v;
                        if (i24 != 0) {
                            sy.y.j(obj28);
                            fa1.q0 q0Var = (fa1.q0) obj;
                            k71.k.g(q0Var, "<this>");
                            q81.a0 a0Var4 = q0Var.a;
                            c11.a aVar29 = null;
                            if (a0Var4.u == 301 && (a = a0Var4.w.a("Location")) != null) {
                                List g0 = t71.p.g0(a, new String[]{"/"}, 6);
                                if (g0.size() == 8 && k71.k.b(g0.get(3), "repos") && k71.k.b(g0.get(6), "issues")) {
                                    String str22 = (String) g0.get(4);
                                    String str23 = (String) g0.get(5);
                                    Integer G = t71.w.G((String) g0.get(7));
                                    if (G != null) {
                                        aVar29 = new c11.a(str22, G.intValue(), str23);
                                    }
                                }
                            }
                            vaVar.v = 1;
                            if (this.s.c(aVar29, vaVar) == aVar28) {
                                return aVar28;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                        }
                        return w61.a0.a;
                    }
                }
                vaVar = new va(this, cVar);
                Object obj282 = vaVar.u;
                b71.a aVar282 = b71.a.r;
                i24 = vaVar.v;
                if (i24 != 0) {
                }
                return w61.a0.a;
        }
    }
}
