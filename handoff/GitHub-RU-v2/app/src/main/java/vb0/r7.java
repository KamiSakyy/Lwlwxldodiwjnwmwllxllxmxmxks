package vb0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.ContributionLevel;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import com.github.service.models.response.type.SocialLinkService;
import gn0.qw;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import jn0.a40;
import jn0.b40;
import jn0.y30;
import kc0.af;
import kc0.au;
import kc0.bf;
import kc0.bu;
import kc0.cu;
import kc0.eb0;
import kc0.ec0;
import kc0.fu;
import kc0.gb0;
import kc0.gu;
import kc0.hb0;
import kc0.hc;
import kc0.hu;
import kc0.ib0;
import kc0.ic;
import kc0.ic0;
import kc0.iu;
import kc0.ju;
import kc0.ks;
import kc0.ku;
import kc0.ls;
import kc0.ms;
import kc0.ns;
import kc0.os;
import kc0.ps;
import kc0.pz;
import kc0.qb0;
import kc0.qz;
import kc0.rb0;
import kc0.rz;
import kc0.sz;
import kc0.ta0;
import kc0.te;
import kc0.ue;
import kc0.va0;
import kc0.ve;
import kc0.we;
import kc0.xa0;
import kc0.xe;
import kc0.xt;
import kc0.ye;
import kc0.yt;
import kc0.ze;
import kc0.zt;
import kotlin.NoWhenBranchMatchedException;
import u10.e60;
import u10.l90;
import u10.m90;
import u10.n90;
import u10.o40;
import u10.o80;
import u10.ry;
import u10.sy;
import u10.tv;
import u10.ty;
import u10.u90;
import u10.uv;
import u10.vv;
import u10.xv;
import yz0.g8;
import yz0.h8;
import yz0.k8;
import yz0.m8;
import yz0.n8;
import yz0.o8;
import yz0.p8;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r7 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ r7(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        vm0.k kVar;
        int i;
        if (cVar instanceof vm0.k) {
            kVar = (vm0.k) cVar;
            int i2 = kVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = kVar.u;
                b71.a aVar = b71.a.r;
                i = kVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    Boolean valueOf = Boolean.valueOf(((ec0) obj).a.a);
                    kVar.v = 1;
                    if (this.s.c(valueOf, kVar) == aVar) {
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
        kVar = new vm0.k(this, cVar);
        Object obj22 = kVar.u;
        b71.a aVar2 = b71.a.r;
        i = kVar.v;
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
        vm0.l lVar;
        int i;
        if (cVar instanceof vm0.l) {
            lVar = (vm0.l) cVar;
            int i2 = lVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = lVar.u;
                b71.a aVar = b71.a.r;
                i = lVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    Boolean valueOf = Boolean.valueOf(((ic0) obj).a.a);
                    lVar.v = 1;
                    if (this.s.c(valueOf, lVar) == aVar) {
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
        lVar = new vm0.l(this, cVar);
        Object obj22 = lVar.u;
        b71.a aVar2 = b71.a.r;
        i = lVar.v;
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
        vm0.m mVar;
        int i;
        w61.k kVar;
        iu iuVar;
        if (cVar instanceof vm0.m) {
            mVar = (vm0.m) cVar;
            int i2 = mVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = mVar.u;
                b71.a aVar = b71.a.r;
                i = mVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    hu huVar = ((fu) obj).a;
                    if (huVar == null || (iuVar = huVar.c) == null) {
                        kVar = null;
                    } else {
                        ku kuVar = iuVar.a;
                        Iterable iterable = kuVar.b;
                        if (iterable == null) {
                            iterable = x61.r.r;
                        }
                        ArrayList S = x61.m.S(iterable);
                        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                        int size = S.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj3 = S.get(i3);
                            i3++;
                            arrayList.add(com.google.android.gms.internal.measurement.d5.w(((gu) obj3).c));
                        }
                        ju juVar = kuVar.a;
                        kVar = new w61.k(arrayList, new x01.i(juVar.b, juVar.a, false));
                    }
                    if (kVar != null) {
                        mVar.v = 1;
                        if (this.s.c(kVar, mVar) == aVar) {
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
        mVar = new vm0.m(this, cVar);
        Object obj22 = mVar.u;
        b71.a aVar2 = b71.a.r;
        i = mVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        vm0.n nVar;
        int i;
        if (cVar instanceof vm0.n) {
            nVar = (vm0.n) cVar;
            int i2 = nVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = nVar.u;
                b71.a aVar = b71.a.r;
                i = nVar.v;
                w61.a0 a0Var = w61.a0.a;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                    return a0Var;
                }
                sy.y.j(obj2);
                nVar.v = 1;
                return this.s.c(a0Var, nVar) == aVar ? aVar : a0Var;
            }
        }
        nVar = new vm0.n(this, cVar);
        Object obj22 = nVar.u;
        b71.a aVar2 = b71.a.r;
        i = nVar.v;
        w61.a0 a0Var2 = w61.a0.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        vm0.o oVar;
        int i;
        if (cVar instanceof vm0.o) {
            oVar = (vm0.o) cVar;
            int i2 = oVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = oVar.u;
                b71.a aVar = b71.a.r;
                i = oVar.v;
                w61.a0 a0Var = w61.a0.a;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                    return a0Var;
                }
                sy.y.j(obj2);
                oVar.v = 1;
                return this.s.c(a0Var, oVar) == aVar ? aVar : a0Var;
            }
        }
        oVar = new vm0.o(this, cVar);
        Object obj22 = oVar.u;
        b71.a aVar2 = b71.a.r;
        i = oVar.v;
        w61.a0 a0Var2 = w61.a0.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v0, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        vm0.p pVar;
        int i;
        ?? r4;
        if (cVar instanceof vm0.p) {
            pVar = (vm0.p) cVar;
            int i2 = pVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = pVar.u;
                b71.a aVar = b71.a.r;
                i = pVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ib0 ib0Var = ((eb0) obj).a;
                    yz0.f8 f8Var = null;
                    if (ib0Var != null) {
                        List<gb0> list = ib0Var.d.a;
                        if (list != null) {
                            r4 = new ArrayList();
                            for (gb0 gb0Var : list) {
                                yz0.e8 a0 = gb0Var != null ? k41.b.a0(gb0Var.c) : null;
                                if (a0 != null) {
                                    r4.add(a0);
                                }
                            }
                        } else {
                            r4 = x61.r.r;
                        }
                        List<hb0> list2 = ib0Var.c;
                        ArrayList arrayList = new ArrayList(x61.n.F(list2, 10));
                        for (hb0 hb0Var : list2) {
                            String str = hb0Var.b;
                            String str2 = "";
                            if (str == null) {
                                str = "";
                            }
                            String str3 = hb0Var.a;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            arrayList.add(new g8(str, str2));
                        }
                        f8Var = new yz0.f8(ib0Var.b, arrayList, r4);
                    }
                    if (f8Var != null) {
                        pVar.v = 1;
                        if (this.s.c(f8Var, pVar) == aVar) {
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
        pVar = new vm0.p(this, cVar);
        Object obj22 = pVar.u;
        b71.a aVar2 = b71.a.r;
        i = pVar.v;
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
        w00.b bVar;
        int i;
        if (cVar instanceof w00.b) {
            bVar = (w00.b) cVar;
            int i2 = bVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.u;
                b71.a aVar = b71.a.r;
                i = bVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    q81.c0 c0Var = (q81.c0) ((fa1.q0) obj).b;
                    String t = c0Var != null ? c0Var.t() : null;
                    if (t == null) {
                        t = "";
                    }
                    bVar.v = 1;
                    if (this.s.c(t, bVar) == aVar) {
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
        bVar = new w00.b(this, cVar);
        Object obj22 = bVar.u;
        b71.a aVar2 = b71.a.r;
        i = bVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        wy0.b bVar;
        int i;
        mx0.a aVar;
        if (cVar instanceof wy0.b) {
            bVar = (wy0.b) cVar;
            int i2 = bVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.u;
                b71.a aVar2 = b71.a.r;
                i = bVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    oo0.f fVar = ((oo0.c) obj).a;
                    if (fVar != null) {
                        int i3 = fVar.b;
                        oo0.a aVar3 = fVar.c;
                        Iterable iterable = aVar3.c;
                        if (iterable == null) {
                            iterable = x61.r.r;
                        }
                        ArrayList S = x61.m.S(iterable);
                        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                        int size = S.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj3 = S.get(i4);
                            i4++;
                            oo0.d dVar = (oo0.d) obj3;
                            k71.k.g(dVar, "<this>");
                            fw0.c1 c1Var = dVar.c;
                            String str = c1Var.d;
                            Avatar L = m7.y.L(c1Var.g);
                            String str2 = c1Var.b;
                            String str3 = c1Var.c;
                            if (str3 == null) {
                                str3 = "";
                            }
                            arrayList.add(new yz0.b2(str, L, str2, str3, false, false, 96));
                        }
                        oo0.e eVar = aVar3.a;
                        aVar = new mx0.a(i3, arrayList, new x01.i(eVar.b, eVar.a, false));
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        bVar.v = 1;
                        if (this.s.c(aVar, bVar) == aVar2) {
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
        bVar = new wy0.b(this, cVar);
        Object obj22 = bVar.u;
        b71.a aVar22 = b71.a.r;
        i = bVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(a71.c cVar, Object obj) {
        wy0.d dVar;
        int i;
        Object obj2;
        ep0.b bVar;
        ep0.i iVar;
        ep0.a aVar;
        y30 y30Var;
        if (cVar instanceof wy0.d) {
            dVar = (wy0.d) cVar;
            int i2 = dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.v = i2 - Integer.MIN_VALUE;
                Object obj3 = dVar.u;
                b71.a aVar2 = b71.a.r;
                i = dVar.v;
                if (i != 0) {
                    sy.y.j(obj3);
                    b40 b40Var = ((a40) obj).a;
                    ep0.c cVar2 = (b40Var == null || (y30Var = b40Var.a) == null) ? null : y30Var.b;
                    if (cVar2 != null && (aVar = cVar2.b) != null) {
                        iVar = aVar.c;
                    } else if (cVar2 == null || (bVar = cVar2.c) == null) {
                        obj2 = x61.r.r;
                        dVar.v = 1;
                        if (this.s.c(obj2, dVar) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        iVar = bVar.c;
                    }
                    obj2 = k21.f.d(iVar);
                    dVar.v = 1;
                    if (this.s.c(obj2, dVar) == aVar2) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj3);
                }
                return w61.a0.a;
            }
        }
        dVar = new wy0.d(this, cVar);
        Object obj32 = dVar.u;
        b71.a aVar22 = b71.a.r;
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
    private final Object k(a71.c cVar, Object obj) {
        wy0.p pVar;
        int i;
        yz0.o6 k;
        jn0.b bVar;
        jn0.e eVar;
        if (cVar instanceof wy0.p) {
            pVar = (wy0.p) cVar;
            int i2 = pVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = pVar.u;
                b71.a aVar = b71.a.r;
                i = pVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jn0.a aVar2 = ((jn0.d) obj).a;
                    wr0.a aVar3 = (aVar2 == null || (bVar = aVar2.a) == null || (eVar = bVar.a) == null) ? null : eVar.c;
                    if (aVar3 == null) {
                        yz0.s.Companion.getClass();
                        yz0.q qVar = yz0.r.b;
                        yz0.x2.Companion.getClass();
                        k = new yz0.o6(qVar);
                    } else {
                        k = com.google.android.gms.internal.measurement.b4.k(aVar3);
                    }
                    pVar.v = 1;
                    if (this.s.c(k, pVar) == aVar) {
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
        pVar = new wy0.p(this, cVar);
        Object obj22 = pVar.u;
        b71.a aVar4 = b71.a.r;
        i = pVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(a71.c cVar, Object obj) {
        wy0.r rVar;
        int i;
        if (cVar instanceof wy0.r) {
            rVar = (wy0.r) cVar;
            int i2 = rVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = rVar.u;
                b71.a aVar = b71.a.r;
                i = rVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jn0.o0 o0Var = ((jn0.r0) obj).a;
                    jn0.u0 u0Var = o0Var != null ? o0Var.a : null;
                    if (u0Var != null) {
                        rVar.v = 1;
                        if (this.s.c(u0Var, rVar) == aVar) {
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
        rVar = new wy0.r(this, cVar);
        Object obj22 = rVar.u;
        b71.a aVar2 = b71.a.r;
        i = rVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(a71.c cVar, Object obj) {
        wy0.s sVar;
        int i;
        f01.g gVar;
        String str;
        DiffLineType diffLineType;
        xt0.i7 i7Var;
        List list;
        xt0.g7 g7Var;
        List list2;
        xt0.g7 g7Var2;
        if (cVar instanceof wy0.s) {
            sVar = (wy0.s) cVar;
            int i2 = sVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = sVar.u;
                b71.a aVar = b71.a.r;
                i = sVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jn0.u0 u0Var = (jn0.u0) obj;
                    jn0.t0 t0Var = u0Var.b;
                    List list3 = u0Var.c.a;
                    jn0.s0 s0Var = list3 != null ? (jn0.s0) x61.m.W(list3) : null;
                    if (s0Var != null) {
                        xt0.k7 k7Var = s0Var.c;
                        xt0.j7 j7Var = k7Var.g;
                        yp0.c cVar2 = k7Var.k;
                        xt0.h7 h7Var = k7Var.f;
                        String str2 = h7Var != null ? h7Var.a : null;
                        String str3 = j7Var != null ? j7Var.b : "";
                        gu0.c cVar3 = k7Var.l;
                        String str4 = str3;
                        at0.a aVar2 = k7Var.o;
                        String str5 = k7Var.h;
                        PullRequestReviewCommentState U = b41.b.U(k7Var.i);
                        if (j7Var == null || (list2 = j7Var.g) == null || (g7Var2 = (xt0.g7) x61.m.f0(list2)) == null) {
                            str = null;
                        } else {
                            str = k7Var.c == null ? null : y41.t1.G(g7Var2.b);
                        }
                        String str6 = k7Var.j;
                        boolean z = k7Var.m.b;
                        if (j7Var == null || (list = j7Var.g) == null || (g7Var = (xt0.g7) x61.m.f0(list)) == null || (diffLineType = k41.b.X(g7Var.b.a)) == null) {
                            diffLineType = DiffLineType.UNKNOWN__;
                        }
                        gVar = y41.t1.f(cVar2, str4, str2, cVar3, aVar2, str5, U, str, str6, z, diffLineType, j7Var != null ? j7Var.h : null, t0Var.b, t0Var.c, true, j7Var != null ? j7Var.c : false, (j7Var == null || (i7Var = j7Var.d) == null) ? "" : i7Var.a, j7Var != null ? j7Var.e : false, j7Var != null ? j7Var.f : false, null, y41.t1.O(u0Var.a));
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        sVar.v = 1;
                        if (this.s.c(gVar, sVar) == aVar) {
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
        sVar = new wy0.s(this, cVar);
        Object obj22 = sVar.u;
        b71.a aVar3 = b71.a.r;
        i = sVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0b47  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0bd3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0160  */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v57, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        q7 q7Var;
        int i;
        sy syVar;
        t7 t7Var;
        int i2;
        u7 u7Var;
        int i3;
        v7 v7Var;
        int i4;
        uv uvVar;
        uv uvVar2;
        uv uvVar3;
        w7 w7Var;
        int i5;
        x7 x7Var;
        int i6;
        y7 y7Var;
        int i7;
        p8 p8Var;
        String str;
        boolean z;
        boolean z2;
        String str2;
        o8 o8Var;
        boolean z3;
        ArrayList arrayList;
        ?? r5;
        boolean z4;
        int i8;
        ?? r7;
        ea0.l1 l1Var;
        ZonedDateTime zonedDateTime;
        OrganizationNameAndAvatarUrl organizationNameAndAvatarUrl;
        z7 z7Var;
        int i9;
        e8 e8Var;
        int i10;
        String a;
        vm0.b bVar;
        int i12;
        w61.k kVar;
        os osVar;
        vm0.c cVar2;
        int i13;
        vm0.d dVar;
        int i14;
        w61.k kVar2;
        ze zeVar;
        vm0.e eVar;
        int i15;
        w61.k kVar3;
        ze zeVar2;
        vm0.f fVar;
        int i16;
        w61.k kVar4;
        au auVar;
        vm0.g gVar;
        int i17;
        yz0.b2 b2Var;
        vm0.i iVar;
        int i18;
        ContributionLevel contributionLevel;
        vm0.j jVar;
        int i19;
        rz rzVar;
        wy0.t tVar;
        int i20;
        switch (this.r) {
            case 0:
                if (cVar instanceof q7) {
                    q7Var = (q7) cVar;
                    int i22 = q7Var.v;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        q7Var.v = i22 - Integer.MIN_VALUE;
                        Object obj2 = q7Var.u;
                        b71.a aVar = b71.a.r;
                        i = q7Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            ty tyVar = ((ry) obj).a;
                            List c = sy.p.c((tyVar == null || (syVar = tyVar.a) == null) ? null : syVar.b);
                            q7Var.v = 1;
                            if (this.s.c(c, q7Var) == aVar) {
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
                q7Var = new q7(this, cVar);
                Object obj22 = q7Var.u;
                b71.a aVar2 = b71.a.r;
                i = q7Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof t7) {
                    t7Var = (t7) cVar;
                    int i23 = t7Var.v;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        t7Var.v = i23 - Integer.MIN_VALUE;
                        Object obj3 = t7Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = t7Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            yz0.w7 J = sy.n.J((o40) obj);
                            t7Var.v = 1;
                            if (this.s.c(J, t7Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                t7Var = new t7(this, cVar);
                Object obj32 = t7Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = t7Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof u7) {
                    u7Var = (u7) cVar;
                    int i24 = u7Var.v;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        u7Var.v = i24 - Integer.MIN_VALUE;
                        Object obj4 = u7Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = u7Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            yz0.y7 f = sy.p.f((e60) obj);
                            u7Var.v = 1;
                            if (this.s.c(f, u7Var) == aVar4) {
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
                u7Var = new u7(this, cVar);
                Object obj42 = u7Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = u7Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof v7) {
                    v7Var = (v7) cVar;
                    int i25 = v7Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        v7Var.v = i25 - Integer.MIN_VALUE;
                        Object obj5 = v7Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = v7Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            tv tvVar = (tv) obj;
                            xv xvVar = tvVar.a;
                            List list = (xvVar == null || (uvVar3 = xvVar.a) == null) ? null : uvVar3.b;
                            if (list == null) {
                                list = x61.r.r;
                            }
                            ArrayList S = x61.m.S(list);
                            ArrayList arrayList2 = new ArrayList(x61.n.F(S, 10));
                            int size = S.size();
                            int i26 = 0;
                            while (i26 < size) {
                                Object obj6 = S.get(i26);
                                i26++;
                                u60.a aVar6 = ((vv) obj6).c;
                                arrayList2.add(new bb0.g(aVar6.b, aVar6.c, b31.b.h0(aVar6.d), (int) aVar6.e, aVar6.f));
                            }
                            xv xvVar2 = tvVar.a;
                            w61.k kVar5 = new w61.k(arrayList2, new x01.i((xvVar2 == null || (uvVar = xvVar2.a) == null) ? null : uvVar.a.b, (xvVar2 == null || (uvVar2 = xvVar2.a) == null) ? false : uvVar2.a.a, false));
                            v7Var.v = 1;
                            if (this.s.c(kVar5, v7Var) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                v7Var = new v7(this, cVar);
                Object obj52 = v7Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = v7Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof w7) {
                    w7Var = (w7) cVar;
                    int i27 = w7Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        w7Var.v = i27 - Integer.MIN_VALUE;
                        Object obj7 = w7Var.u;
                        b71.a aVar7 = b71.a.r;
                        i5 = w7Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj7);
                            Integer num = new Integer(((u90) obj).a.a.a);
                            w7Var.v = 1;
                            if (this.s.c(num, w7Var) == aVar7) {
                                return aVar7;
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
                w7Var = new w7(this, cVar);
                Object obj72 = w7Var.u;
                b71.a aVar72 = b71.a.r;
                i5 = w7Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof x7) {
                    x7Var = (x7) cVar;
                    int i28 = x7Var.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        x7Var.v = i28 - Integer.MIN_VALUE;
                        Object obj8 = x7Var.u;
                        b71.a aVar8 = b71.a.r;
                        i6 = x7Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj8);
                            o80 o80Var = (o80) obj;
                            e30.a aVar9 = o80Var.a.d;
                            yz0.c8 c8Var = new yz0.c8(t.q.q(aVar9.d), aVar9.b, o80Var.a.b);
                            x7Var.v = 1;
                            if (this.s.c(c8Var, x7Var) == aVar8) {
                                return aVar8;
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
                x7Var = new x7(this, cVar);
                Object obj82 = x7Var.u;
                b71.a aVar82 = b71.a.r;
                i6 = x7Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof y7) {
                    y7Var = (y7) cVar;
                    int i29 = y7Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        y7Var.v = i29 - Integer.MIN_VALUE;
                        Object obj9 = y7Var.u;
                        b71.a aVar10 = b71.a.r;
                        i7 = y7Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj9);
                            l90 l90Var = (l90) obj;
                            n90 n90Var = l90Var.a;
                            x61.r rVar = x61.r.r;
                            if (n90Var != null) {
                                ea0.s1 s1Var = n90Var.c;
                                String str3 = s1Var.b;
                                String str4 = s1Var.c;
                                Avatar q = t.q.q(s1Var.G);
                                String str5 = s1Var.d;
                                String str6 = s1Var.e;
                                String str7 = s1Var.f;
                                int i30 = s1Var.H.c.a;
                                int i32 = s1Var.g.a;
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
                                int i33 = s1Var.q.a;
                                String str13 = s1Var.r;
                                String str14 = str13 == null ? "" : str13;
                                int i34 = s1Var.s.a;
                                int i35 = s1Var.t.a;
                                boolean z10 = s1Var.x;
                                boolean z12 = s1Var.y;
                                String str15 = s1Var.z;
                                String str16 = str15 == null ? "" : str15;
                                ea0.q1 q1Var = s1Var.u;
                                if (q1Var != null) {
                                    ea0.n0 n0Var = q1Var.c;
                                    str = "";
                                    String str17 = n0Var.b;
                                    ea0.m0 m0Var = n0Var.g;
                                    String str18 = str17 == null ? str : str17;
                                    z = z8;
                                    boolean z13 = n0Var.c;
                                    String str19 = n0Var.d;
                                    String str20 = str19 == null ? str : str19;
                                    String str21 = n0Var.e;
                                    String str22 = str21 == null ? str : str21;
                                    ZonedDateTime zonedDateTime2 = n0Var.f;
                                    if (m0Var != null) {
                                        c30.j jVar2 = m0Var.c;
                                        zonedDateTime = zonedDateTime2;
                                        z2 = z7;
                                        str2 = str4;
                                        organizationNameAndAvatarUrl = new OrganizationNameAndAvatarUrl(jVar2.b, jVar2.c, jVar2.d);
                                    } else {
                                        zonedDateTime = zonedDateTime2;
                                        z2 = z7;
                                        str2 = str4;
                                        organizationNameAndAvatarUrl = null;
                                    }
                                    o8Var = new o8(str18, str22, z13, str20, organizationNameAndAvatarUrl, m0Var != null ? m0Var.c.a : null, zonedDateTime);
                                } else {
                                    str = "";
                                    z = z8;
                                    z2 = z7;
                                    str2 = str4;
                                    o8Var = null;
                                }
                                r70.f fVar2 = s1Var.m.b;
                                boolean z14 = fVar2.a;
                                List<r70.e> list2 = fVar2.b.a;
                                if (list2 == null) {
                                    list2 = rVar;
                                }
                                ArrayList arrayList3 = new ArrayList();
                                for (r70.e eVar2 : list2) {
                                    k8 i36 = (eVar2 != null ? eVar2.c : null) != null ? sy.r.i(eVar2.c) : (eVar2 != null ? eVar2.b : null) != null ? sy.r.j(eVar2.b.c) : null;
                                    if (i36 != null) {
                                        arrayList3.add(i36);
                                    }
                                }
                                m8 k = (!s1Var.v || (l1Var = s1Var.w) == null) ? null : sy.r.k(l1Var.b);
                                boolean z15 = s1Var.A;
                                boolean z16 = s1Var.B;
                                List list3 = s1Var.E.a;
                                if (list3 != null) {
                                    ArrayList S2 = x61.m.S(list3);
                                    z3 = z14;
                                    arrayList = arrayList3;
                                    r5 = new ArrayList(x61.n.F(S2, 10));
                                    int size2 = S2.size();
                                    int i37 = 0;
                                    while (i37 < size2) {
                                        Object obj10 = S2.get(i37);
                                        int i38 = i37 + 1;
                                        ea0.j1 j1Var = (ea0.j1) obj10;
                                        boolean z17 = z16;
                                        String str23 = j1Var.c;
                                        r01.w wVar = SocialLinkService.Companion;
                                        ArrayList arrayList4 = S2;
                                        String str24 = j1Var.b.r;
                                        wVar.getClass();
                                        r5.add(new n8(str23, r01.w.a(str24), j1Var.a));
                                        size2 = size2;
                                        i37 = i38;
                                        S2 = arrayList4;
                                        z16 = z17;
                                    }
                                } else {
                                    z3 = z14;
                                    arrayList = arrayList3;
                                    r5 = 0;
                                }
                                boolean z18 = z16;
                                x61.r rVar2 = r5 == 0 ? rVar : r5;
                                boolean z19 = s1Var.C;
                                int i39 = s1Var.D.a;
                                List list4 = s1Var.F.a;
                                if (list4 != null) {
                                    ArrayList S3 = x61.m.S(list4);
                                    ArrayList arrayList5 = new ArrayList(x61.n.F(S3, 10));
                                    int size3 = S3.size();
                                    int i40 = 0;
                                    while (i40 < size3) {
                                        Object obj11 = S3.get(i40);
                                        i40++;
                                        ArrayList arrayList6 = S3;
                                        ea0.i1 i1Var = (ea0.i1) obj11;
                                        boolean z20 = z19;
                                        int i42 = i39;
                                        ea0.e1 e1Var = i1Var.a;
                                        int i43 = size3;
                                        String str25 = e1Var.b;
                                        String str26 = e1Var.a;
                                        ea0.r1 r1Var = i1Var.b;
                                        String str27 = r1Var != null ? r1Var.b : null;
                                        if (str27 == null) {
                                            str27 = str;
                                        }
                                        arrayList5.add(new h8(str25, str26, str27));
                                        size3 = i43;
                                        S3 = arrayList6;
                                        z19 = z20;
                                        i39 = i42;
                                    }
                                    z4 = z19;
                                    i8 = i39;
                                    r7 = new ArrayList();
                                    int size4 = arrayList5.size();
                                    int i44 = 0;
                                    while (i44 < size4) {
                                        Object obj12 = arrayList5.get(i44);
                                        i44++;
                                        h8 h8Var = (h8) obj12;
                                        int i45 = size4;
                                        if (!t71.p.T(h8Var.a) && !t71.p.T(h8Var.c)) {
                                            r7.add(obj12);
                                        }
                                        size4 = i45;
                                    }
                                } else {
                                    z4 = z19;
                                    i8 = i39;
                                    r7 = 0;
                                }
                                p8Var = new p8(str3, str2, q, str5, str6, str7, i30, i32, z5, false, z6, z2, z, z9, str9, str10, str12, i33, str14, i34, i35, 0, z10, z12, str16, o8Var, z3, arrayList, k, false, z15, z18, "", z4, i8, null, r7 == 0 ? rVar : r7, rVar2);
                            } else {
                                m90 m90Var = l90Var.b;
                                if (m90Var == null) {
                                    throw new ApiFailure(ApiFailureType.NOT_FOUND, null, null, null, null, null, null, 120);
                                }
                                k70.i iVar2 = m90Var.c;
                                String str28 = iVar2.i;
                                String str29 = iVar2.b;
                                String str30 = iVar2.c;
                                Avatar q2 = t.q.q(iVar2.r);
                                String str31 = iVar2.d;
                                String str32 = str31 == null ? "" : str31;
                                String str33 = iVar2.e;
                                String str34 = str33 == null ? "" : str33;
                                boolean z22 = iVar2.f;
                                String str35 = iVar2.h;
                                String str36 = str35 == null ? "" : str35;
                                String str37 = iVar2.j;
                                String str38 = str37 == null ? "" : str37;
                                int i46 = iVar2.l.a;
                                boolean z23 = iVar2.k;
                                String str39 = iVar2.n;
                                String str40 = str39 == null ? "" : str39;
                                r70.f fVar3 = iVar2.g.b;
                                boolean z24 = fVar3.a;
                                List<r70.e> list5 = fVar3.b.a;
                                if (list5 == null) {
                                    list5 = rVar;
                                }
                                ArrayList arrayList7 = new ArrayList();
                                for (r70.e eVar3 : list5) {
                                    boolean z25 = z22;
                                    int i47 = i46;
                                    k8 i48 = (eVar3 != null ? eVar3.c : null) != null ? sy.r.i(eVar3.c) : (eVar3 != null ? eVar3.b : null) != null ? sy.r.j(eVar3.b.c) : null;
                                    if (i48 != null) {
                                        arrayList7.add(i48);
                                    }
                                    z22 = z25;
                                    i46 = i47;
                                }
                                boolean z26 = z22;
                                int i49 = i46;
                                k70.h hVar = iVar2.m;
                                m8 k2 = hVar != null ? sy.r.k(hVar.b) : null;
                                String str41 = iVar2.o;
                                String str42 = str41 == null ? "" : str41;
                                int i50 = iVar2.p.a;
                                k70.d dVar2 = iVar2.q;
                                p8Var = new p8(str29, str30, q2, str32, "", str34, -1, -1, false, z26, false, false, false, false, str36, str28, str38, -1, "", i49, -1, 0, true, z23, str40, null, z24, arrayList7, k2, true, false, false, str42, false, i50, dVar2 != null ? new yz0.d1(str28, dVar2.b.a, dVar2.a) : null, rVar, rVar);
                            }
                            y7Var.v = 1;
                            if (this.s.c(p8Var, y7Var) == aVar10) {
                                return aVar10;
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
                y7Var = new y7(this, cVar);
                Object obj92 = y7Var.u;
                b71.a aVar102 = b71.a.r;
                i7 = y7Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof z7) {
                    z7Var = (z7) cVar;
                    int i52 = z7Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        z7Var.v = i52 - Integer.MIN_VALUE;
                        Object obj13 = z7Var.u;
                        b71.a aVar11 = b71.a.r;
                        i9 = z7Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj13);
                            String str43 = ((ca0.b) obj).a.a;
                            z7Var.v = 1;
                            if (this.s.c(str43, z7Var) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                z7Var = new z7(this, cVar);
                Object obj132 = z7Var.u;
                b71.a aVar112 = b71.a.r;
                i9 = z7Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof e8) {
                    e8Var = (e8) cVar;
                    int i53 = e8Var.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        e8Var.v = i53 - Integer.MIN_VALUE;
                        Object obj14 = e8Var.u;
                        b71.a aVar12 = b71.a.r;
                        i10 = e8Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj14);
                            fa1.q0 q0Var = (fa1.q0) obj;
                            k71.k.g(q0Var, "<this>");
                            q81.a0 a0Var = q0Var.a;
                            c11.a aVar13 = null;
                            if (a0Var.u == 301 && (a = a0Var.w.a("Location")) != null) {
                                List g0 = t71.p.g0(a, new String[]{"/"}, 6);
                                if (g0.size() == 10 && k71.k.b(g0.get(5), "repos") && k71.k.b(g0.get(8), "issues")) {
                                    String str44 = (String) g0.get(6);
                                    String str45 = (String) g0.get(7);
                                    Integer G = t71.w.G((String) g0.get(9));
                                    if (G != null) {
                                        aVar13 = new c11.a(str44, G.intValue(), str45);
                                    }
                                }
                            }
                            e8Var.v = 1;
                            if (this.s.c(aVar13, e8Var) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                e8Var = new e8(this, cVar);
                Object obj142 = e8Var.u;
                b71.a aVar122 = b71.a.r;
                i10 = e8Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof vm0.b) {
                    bVar = (vm0.b) cVar;
                    int i54 = bVar.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        bVar.v = i54 - Integer.MIN_VALUE;
                        Object obj15 = bVar.u;
                        b71.a aVar14 = b71.a.r;
                        i12 = bVar.v;
                        if (i12 != 0) {
                            sy.y.j(obj15);
                            ns nsVar = ((ls) obj).a;
                            if (nsVar == null || (osVar = nsVar.c) == null) {
                                kVar = null;
                            } else {
                                ks ksVar = osVar.a;
                                Iterable iterable = ksVar.b;
                                if (iterable == null) {
                                    iterable = x61.r.r;
                                }
                                ArrayList S4 = x61.m.S(iterable);
                                ArrayList arrayList8 = new ArrayList(x61.n.F(S4, 10));
                                int size5 = S4.size();
                                int i55 = 0;
                                while (i55 < size5) {
                                    Object obj16 = S4.get(i55);
                                    i55++;
                                    arrayList8.add(com.google.android.gms.internal.measurement.d5.w(((ms) obj16).c));
                                }
                                ArrayList arrayList9 = new ArrayList();
                                int size6 = arrayList8.size();
                                int i56 = 0;
                                while (i56 < size6) {
                                    Object obj17 = arrayList8.get(i56);
                                    i56++;
                                    if (!((yz0.l4) obj17).f) {
                                        arrayList9.add(obj17);
                                    }
                                }
                                ps psVar = ksVar.a;
                                kVar = new w61.k(arrayList9, new x01.i(psVar.b, psVar.a, false));
                            }
                            if (kVar != null) {
                                bVar.v = 1;
                                if (this.s.c(kVar, bVar) == aVar14) {
                                    return aVar14;
                                }
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return w61.a0.a;
                    }
                }
                bVar = new vm0.b(this, cVar);
                Object obj152 = bVar.u;
                b71.a aVar142 = b71.a.r;
                i12 = bVar.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof vm0.c) {
                    cVar2 = (vm0.c) cVar;
                    int i57 = cVar2.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        cVar2.v = i57 - Integer.MIN_VALUE;
                        Object obj18 = cVar2.u;
                        b71.a aVar15 = b71.a.r;
                        i13 = cVar2.v;
                        if (i13 != 0) {
                            sy.y.j(obj18);
                            ic icVar = ((hc) obj).a;
                            yz0.d5 d5Var = new yz0.d5(icVar != null ? icVar.a : "", (icVar != null ? icVar.b : null) == qw.t);
                            cVar2.v = 1;
                            if (this.s.c(d5Var, cVar2) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                cVar2 = new vm0.c(this, cVar);
                Object obj182 = cVar2.u;
                b71.a aVar152 = b71.a.r;
                i13 = cVar2.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof vm0.d) {
                    dVar = (vm0.d) cVar;
                    int i58 = dVar.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        dVar.v = i58 - Integer.MIN_VALUE;
                        Object obj19 = dVar.u;
                        b71.a aVar16 = b71.a.r;
                        i14 = dVar.v;
                        if (i14 != 0) {
                            sy.y.j(obj19);
                            ye yeVar = ((te) obj).a;
                            if (yeVar == null || (zeVar = yeVar.c) == null) {
                                kVar2 = null;
                            } else {
                                ue ueVar = zeVar.b;
                                Iterable iterable2 = ueVar.b;
                                if (iterable2 == null) {
                                    iterable2 = x61.r.r;
                                }
                                ArrayList S5 = x61.m.S(iterable2);
                                ArrayList arrayList10 = new ArrayList(x61.n.F(S5, 10));
                                int size7 = S5.size();
                                int i59 = 0;
                                while (i59 < size7) {
                                    Object obj20 = S5.get(i59);
                                    i59++;
                                    arrayList10.add(com.google.android.gms.internal.measurement.d5.w(((xe) obj20).c));
                                }
                                af afVar = ueVar.a;
                                kVar2 = new w61.k(arrayList10, new x01.i(afVar.b, afVar.a, false));
                            }
                            if (kVar2 != null) {
                                dVar.v = 1;
                                if (this.s.c(kVar2, dVar) == aVar16) {
                                    return aVar16;
                                }
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                dVar = new vm0.d(this, cVar);
                Object obj192 = dVar.u;
                b71.a aVar162 = b71.a.r;
                i14 = dVar.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof vm0.e) {
                    eVar = (vm0.e) cVar;
                    int i60 = eVar.v;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        eVar.v = i60 - Integer.MIN_VALUE;
                        Object obj21 = eVar.u;
                        b71.a aVar17 = b71.a.r;
                        i15 = eVar.v;
                        if (i15 != 0) {
                            sy.y.j(obj21);
                            ye yeVar2 = ((te) obj).a;
                            if (yeVar2 == null || (zeVar2 = yeVar2.c) == null) {
                                kVar3 = null;
                            } else {
                                ve veVar = zeVar2.a;
                                Iterable iterable3 = veVar.b;
                                if (iterable3 == null) {
                                    iterable3 = x61.r.r;
                                }
                                ArrayList S6 = x61.m.S(iterable3);
                                ArrayList arrayList11 = new ArrayList(x61.n.F(S6, 10));
                                int size8 = S6.size();
                                int i62 = 0;
                                while (i62 < size8) {
                                    Object obj23 = S6.get(i62);
                                    i62++;
                                    arrayList11.add(com.google.android.gms.internal.measurement.d5.w(((we) obj23).c));
                                }
                                bf bfVar = veVar.a;
                                kVar3 = new w61.k(arrayList11, new x01.i(bfVar.b, bfVar.a, false));
                            }
                            if (kVar3 != null) {
                                eVar.v = 1;
                                if (this.s.c(kVar3, eVar) == aVar17) {
                                    return aVar17;
                                }
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                eVar = new vm0.e(this, cVar);
                Object obj212 = eVar.u;
                b71.a aVar172 = b71.a.r;
                i15 = eVar.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof vm0.f) {
                    fVar = (vm0.f) cVar;
                    int i63 = fVar.v;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        fVar.v = i63 - Integer.MIN_VALUE;
                        Object obj24 = fVar.u;
                        b71.a aVar18 = b71.a.r;
                        i16 = fVar.v;
                        if (i16 != 0) {
                            sy.y.j(obj24);
                            zt ztVar = ((xt) obj).a;
                            if (ztVar == null || (auVar = ztVar.c) == null) {
                                kVar4 = null;
                            } else {
                                cu cuVar = auVar.a;
                                Iterable iterable4 = cuVar.b;
                                if (iterable4 == null) {
                                    iterable4 = x61.r.r;
                                }
                                ArrayList S7 = x61.m.S(iterable4);
                                ArrayList arrayList12 = new ArrayList(x61.n.F(S7, 10));
                                int size9 = S7.size();
                                int i64 = 0;
                                while (i64 < size9) {
                                    Object obj25 = S7.get(i64);
                                    i64++;
                                    arrayList12.add(com.google.android.gms.internal.measurement.d5.w(((yt) obj25).c));
                                }
                                bu buVar = cuVar.a;
                                kVar4 = new w61.k(arrayList12, new x01.i(buVar.b, buVar.a, false));
                            }
                            if (kVar4 != null) {
                                fVar.v = 1;
                                if (this.s.c(kVar4, fVar) == aVar18) {
                                    return aVar18;
                                }
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                fVar = new vm0.f(this, cVar);
                Object obj242 = fVar.u;
                b71.a aVar182 = b71.a.r;
                i16 = fVar.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof vm0.g) {
                    gVar = (vm0.g) cVar;
                    int i65 = gVar.v;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        gVar.v = i65 - Integer.MIN_VALUE;
                        Object obj26 = gVar.u;
                        b71.a aVar19 = b71.a.r;
                        i17 = gVar.v;
                        if (i17 != 0) {
                            sy.y.j(obj26);
                            rb0 rb0Var = ((qb0) obj).a;
                            if (rb0Var != null) {
                                String str46 = rb0Var.b;
                                Avatar O = b41.b.O(rb0Var.e);
                                String str47 = rb0Var.c;
                                String str48 = rb0Var.d;
                                if (str48 == null) {
                                    str48 = "";
                                }
                                b2Var = new yz0.b2(str46, O, str47, str48, false, false, 112);
                            } else {
                                b2Var = null;
                            }
                            if (b2Var != null) {
                                gVar.v = 1;
                                if (this.s.c(b2Var, gVar) == aVar19) {
                                    return aVar19;
                                }
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return w61.a0.a;
                    }
                }
                gVar = new vm0.g(this, cVar);
                Object obj262 = gVar.u;
                b71.a aVar192 = b71.a.r;
                i17 = gVar.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof vm0.i) {
                    iVar = (vm0.i) cVar;
                    int i66 = iVar.v;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        iVar.v = i66 - Integer.MIN_VALUE;
                        Object obj27 = iVar.u;
                        b71.a aVar20 = b71.a.r;
                        i18 = iVar.v;
                        if (i18 != 0) {
                            sy.y.j(obj27);
                            va0 va0Var = (va0) obj;
                            k71.k.g(va0Var, "<this>");
                            ArrayList arrayList13 = va0Var.a.a.a.a;
                            ArrayList arrayList14 = new ArrayList(x61.n.F(arrayList13, 10));
                            int size10 = arrayList13.size();
                            int i67 = 0;
                            while (i67 < size10) {
                                Object obj28 = arrayList13.get(i67);
                                i67++;
                                ArrayList arrayList15 = ((xa0) obj28).a;
                                ArrayList arrayList16 = new ArrayList(x61.n.F(arrayList15, 10));
                                int size11 = arrayList15.size();
                                int i68 = 0;
                                while (i68 < size11) {
                                    Object obj29 = arrayList15.get(i68);
                                    i68++;
                                    int ordinal = ((ta0) obj29).a.ordinal();
                                    if (ordinal == 0) {
                                        contributionLevel = ContributionLevel.FIRST_QUARTILE;
                                    } else if (ordinal == 1) {
                                        contributionLevel = ContributionLevel.FOURTH_QUARTILE;
                                    } else if (ordinal == 2) {
                                        contributionLevel = ContributionLevel.NONE;
                                    } else if (ordinal == 3) {
                                        contributionLevel = ContributionLevel.SECOND_QUARTILE;
                                    } else if (ordinal == 4) {
                                        contributionLevel = ContributionLevel.THIRD_QUARTILE;
                                    } else {
                                        if (ordinal != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        contributionLevel = ContributionLevel.UNKNOWN__;
                                    }
                                    arrayList16.add(contributionLevel);
                                }
                                arrayList14.add(arrayList16);
                            }
                            yz0.d8 d8Var = new yz0.d8(arrayList14);
                            iVar.v = 1;
                            if (this.s.c(d8Var, iVar) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                iVar = new vm0.i(this, cVar);
                Object obj272 = iVar.u;
                b71.a aVar202 = b71.a.r;
                i18 = iVar.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof vm0.j) {
                    jVar = (vm0.j) cVar;
                    int i69 = jVar.v;
                    if ((i69 & Integer.MIN_VALUE) != 0) {
                        jVar.v = i69 - Integer.MIN_VALUE;
                        Object obj30 = jVar.u;
                        b71.a aVar21 = b71.a.r;
                        i19 = jVar.v;
                        if (i19 != 0) {
                            sy.y.j(obj30);
                            pz pzVar = (pz) obj;
                            Iterable<qz> iterable5 = pzVar.a.c;
                            if (iterable5 == null) {
                                iterable5 = x61.r.r;
                            }
                            ArrayList arrayList17 = new ArrayList();
                            for (qz qzVar : iterable5) {
                                wk0.c1 c1Var = (qzVar == null || (rzVar = qzVar.b) == null) ? null : rzVar.c;
                                if (c1Var != null) {
                                    arrayList17.add(c1Var);
                                }
                            }
                            ArrayList arrayList18 = new ArrayList(x61.n.F(arrayList17, 10));
                            int size12 = arrayList17.size();
                            int i70 = 0;
                            while (i70 < size12) {
                                Object obj31 = arrayList17.get(i70);
                                i70++;
                                arrayList18.add(com.google.android.gms.internal.measurement.d5.w((wk0.c1) obj31));
                            }
                            sz szVar = pzVar.a.b;
                            w61.k kVar6 = new w61.k(arrayList18, new x01.i(szVar.b, szVar.a, false));
                            jVar.v = 1;
                            if (this.s.c(kVar6, jVar) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj30);
                        }
                        return w61.a0.a;
                    }
                }
                jVar = new vm0.j(this, cVar);
                Object obj302 = jVar.u;
                b71.a aVar212 = b71.a.r;
                i19 = jVar.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 17:
                return a(cVar, obj);
            case 18:
                return b(cVar, obj);
            case 19:
                return d(cVar, obj);
            case 20:
                return e(cVar, obj);
            case 21:
                return f(cVar, obj);
            case 22:
                return g(cVar, obj);
            case 23:
                return h(cVar, obj);
            case 24:
                return i(cVar, obj);
            case 25:
                return j(cVar, obj);
            case 26:
                return k(cVar, obj);
            case 27:
                return n(cVar, obj);
            case 28:
                return o(cVar, obj);
            default:
                if (cVar instanceof wy0.t) {
                    tVar = (wy0.t) cVar;
                    int i72 = tVar.v;
                    if ((i72 & Integer.MIN_VALUE) != 0) {
                        tVar.v = i72 - Integer.MIN_VALUE;
                        Object obj33 = tVar.u;
                        b71.a aVar22 = b71.a.r;
                        i20 = tVar.v;
                        if (i20 != 0) {
                            sy.y.j(obj33);
                            Boolean bool = Boolean.TRUE;
                            tVar.v = 1;
                            if (this.s.c(bool, tVar) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj33);
                        }
                        return w61.a0.a;
                    }
                }
                tVar = new wy0.t(this, cVar);
                Object obj332 = tVar.u;
                b71.a aVar222 = b71.a.r;
                i20 = tVar.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
        }
    }
}
