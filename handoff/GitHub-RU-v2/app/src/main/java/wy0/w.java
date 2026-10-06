package wy0;

import android.graphics.Color;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.Language;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.SpokenLanguage;
import com.github.service.models.response.TimelineItem$TimelinePullRequestReview$ReviewState;
import com.github.service.models.response.discussions.PinnedDiscussionPatternState;
import com.github.service.models.response.type.RepositoryRecommendationReason;
import com.github.service.models.response.type.StatusState;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import jn0.ab;
import jn0.ac;
import jn0.an;
import jn0.ap;
import jn0.b70;
import jn0.ba;
import jn0.bb;
import jn0.bg;
import jn0.bn;
import jn0.bp;
import jn0.c70;
import jn0.cb;
import jn0.cp;
import jn0.d50;
import jn0.d70;
import jn0.da;
import jn0.e50;
import jn0.ep;
import jn0.ha0;
import jn0.ia0;
import jn0.ja0;
import jn0.m90;
import jn0.na;
import jn0.nd;
import jn0.nn;
import jn0.o90;
import jn0.od;
import jn0.oi;
import jn0.p90;
import jn0.pa;
import jn0.pd0;
import jn0.pi;
import jn0.pn;
import jn0.qd0;
import jn0.qn;
import jn0.r9;
import jn0.ra;
import jn0.rd;
import jn0.rd0;
import jn0.rn;
import jn0.s9;
import jn0.sn;
import jn0.t9;
import jn0.tn;
import jn0.u9;
import jn0.ua;
import jn0.v9;
import jn0.va;
import jn0.vf;
import jn0.w80;
import jn0.w9;
import jn0.wf;
import jn0.x10;
import jn0.x9;
import jn0.xa;
import jn0.xo;
import jn0.y10;
import jn0.y80;
import jn0.y9;
import jn0.yb;
import jn0.yf;
import jn0.z10;
import jn0.z80;
import jn0.za;
import jn0.zb;
import jn0.zf;
import jn0.zm;
import kotlin.NoWhenBranchMatchedException;
import pz0.dn;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ w(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        x0 x0Var;
        int i;
        ac acVar;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i2 = x0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = x0Var.u;
                b71.a aVar = b71.a.r;
                i = x0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    zb zbVar = ((yb) obj).a;
                    ar0.p0 p0Var = (zbVar == null || (acVar = zbVar.c) == null) ? null : acVar.b;
                    if (p0Var == null) {
                        throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", null, null, null, null, null, 120);
                    }
                    b01.b d = b91.g.d(p0Var);
                    x0Var.v = 1;
                    if (this.s.c(d, x0Var) == aVar) {
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
        x0Var = new x0(this, cVar);
        Object obj22 = x0Var.u;
        b71.a aVar2 = b71.a.r;
        i = x0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        y0 y0Var;
        int i;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i2 = y0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = y0Var.u;
                b71.a aVar = b71.a.r;
                i = y0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    na naVar = (na) obj;
                    ra raVar = naVar.a;
                    List list = raVar != null ? raVar.b.b : null;
                    if (list == null) {
                        list = x61.rShadow.r;
                    }
                    ArrayList S = x61.m.S(list);
                    ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                    int size = S.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = S.get(i3);
                        i3++;
                        arrayList.add(y9.a.e(((pa) obj3).c));
                    }
                    ra raVar2 = naVar.a;
                    b01.d dVar = new b01.d(raVar2 != null ? raVar2.a : null, arrayList, new x01.i(raVar2 != null ? raVar2.b.a.b : null, raVar2 != null ? raVar2.b.a.a : false, false));
                    y0Var.v = 1;
                    if (this.s.c(dVar, y0Var) == aVar) {
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
        y0Var = new y0(this, cVar);
        Object obj22 = y0Var.u;
        b71.a aVar2 = b71.a.r;
        i = y0Var.v;
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
        z0 z0Var;
        int i;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i2 = z0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = z0Var.u;
                b71.a aVar = b71.a.r;
                i = z0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    va vaVar = ((ua) obj).a;
                    b01.e e = vaVar != null ? y9.a.e(vaVar.c) : null;
                    z0Var.v = 1;
                    if (this.s.c(e, z0Var) == aVar) {
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
        z0Var = new z0(this, cVar);
        Object obj22 = z0Var.u;
        b71.a aVar2 = b71.a.r;
        i = z0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [b01.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        b01.h r7 = null;
        a1 a1Var;
        int i;
        ab abVar;
        xa xaVar;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i2 = a1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = a1Var.u;
                b71.a aVar = b71.a.r;
                i = a1Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    cb cbVar = ((za) obj).a;
                    if (cbVar != null && (abVar = cbVar.b) != null && (xaVar = abVar.b) != null) {
                        String str = xaVar.a;
                        bb bbVar = xaVar.b;
                        r7 = new b01.h(str, bbVar != null ? bbVar.a : null);
                    }
                    if (r7 != null) {
                        a1Var.v = 1;
                        if (this.s.c(r7, a1Var) == aVar) {
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
        a1Var = new a1(this, cVar);
        Object obj22 = a1Var.u;
        b71.a aVar2 = b71.a.r;
        i = a1Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [b01.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(
        b01.h r7 = null;a71.c cVar, Object obj) {
        b1 b1Var;
        int i;
        sn snVar;
        qn qnVar;
        nn nnVar;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i2 = b1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = b1Var.u;
                b71.a aVar = b71.a.r;
                i = b1Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    rn rnVar = ((pn) obj).a;
                    if (rnVar != null && (snVar = rnVar.a) != null && (qnVar = snVar.b) != null && (nnVar = qnVar.a) != null) {
                        String str = nnVar.a;
                        tn tnVar = nnVar.b;
                        r7 = new b01.h(str, tnVar != null ? tnVar.a : null);
                    }
                    if (r7 != null) {
                        b1Var.v = 1;
                        if (this.s.c(r7, b1Var) == aVar) {
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
        b1Var = new b1(this, cVar);
        Object obj22 = b1Var.u;
        b71.a aVar2 = b71.a.r;
        i = b1Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        c1 c1Var;
        int i;
        dn dnVar;
        int i2;
        int i3;
        int i4;
        PinnedDiscussionPatternState pinnedDiscussionPatternState;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i5 = c1Var.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c1Var.v = i5 - Integer.MIN_VALUE;
                Object obj2 = c1Var.u;
                b71.a aVar = b71.a.r;
                i = c1Var.v;
                int i6 = 1;
                if (i != 0) {
                    sy.y.j(obj2);
                    ep epVar = ((ap) obj).a;
                    List list = epVar != null ? epVar.b.a : null;
                    if (list == null) {
                        list = x61.rShadow.r;
                    }
                    ArrayList S = x61.m.S(list);
                    ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                    int size = S.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj3 = S.get(i7);
                        i7++;
                        cp cpVar = (cp) obj3;
                        k71.k.g(cpVar, "<this>");
                        String str = cpVar.a;
                        bp bpVar = cpVar.b;
                        int i8 = bpVar.a;
                        xo xoVar = bpVar.c;
                        com.github.service.models.response.a e = k41.b.e(xoVar != null ? xoVar.b : null);
                        String str2 = bpVar.b;
                        String str3 = bpVar.d.a;
                        dn dnVar2 = cpVar.c;
                        ArrayList arrayList2 = cpVar.d;
                        ArrayList arrayList3 = S;
                        try {
                            dnVar = dnVar2;
                            try {
                                i2 = Color.parseColor("#" + x61.m.W(arrayList2));
                            } catch (Exception unused) {
                                arrayList2.toString();
                                i2 = -16777216;
                                i3 = size;
                                try {
                                    i4 = Color.parseColor("#" + x61.m.f0(arrayList2));
                                } catch (Exception unused2) {
                                    arrayList2.toString();
                                    i4 = -1;
                                    switch (dnVar.ordinal()) {
                                    }
                                    arrayList.add(new b01.p(str, i8, e, str2, str3, new b01.n(i2, i4, pinnedDiscussionPatternState)));
                                    S = arrayList3;
                                    size = i3;
                                    i6 = 1;
                                }
                                switch (dnVar.ordinal()) {
                                }
                                arrayList.add(new b01.p(str, i8, e, str2, str3, new b01.n(i2, i4, pinnedDiscussionPatternState)));
                                S = arrayList3;
                                size = i3;
                                i6 = 1;
                            }
                        } catch (Exception unused3) {
                            dnVar = dnVar2;
                        }
                        try {
                            i3 = size;
                            i4 = Color.parseColor("#" + x61.m.f0(arrayList2));
                        } catch (Exception unused4) {
                            i3 = size;
                        }
                        switch (dnVar.ordinal()) {
                            case 0:
                                pinnedDiscussionPatternState = PinnedDiscussionPatternState.CHEVRON_UP;
                                break;
                            case 1:
                                pinnedDiscussionPatternState = PinnedDiscussionPatternState.DOT;
                                break;
                            case 2:
                                pinnedDiscussionPatternState = PinnedDiscussionPatternState.DOT_FILL;
                                break;
                            case 3:
                                pinnedDiscussionPatternState = PinnedDiscussionPatternState.HEART_FILL;
                                break;
                            case 4:
                                pinnedDiscussionPatternState = PinnedDiscussionPatternState.PLUS;
                                break;
                            case 5:
                                pinnedDiscussionPatternState = PinnedDiscussionPatternState.ZAP;
                                break;
                            case 6:
                                pinnedDiscussionPatternState = PinnedDiscussionPatternState.UNKNOWN__;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        arrayList.add(new b01.p(str, i8, e, str2, str3, new b01.n(i2, i4, pinnedDiscussionPatternState)));
                        S = arrayList3;
                        size = i3;
                        i6 = 1;
                    }
                    c1Var.v = i6;
                    if (this.s.c(arrayList, c1Var) == aVar) {
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
        c1Var = new c1(this, cVar);
        Object obj22 = c1Var.u;
        b71.a aVar2 = b71.a.r;
        i = c1Var.v;
        int i62 = 1;
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
        g1 g1Var;
        int i;
        io0.l lVar;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i2 = g1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = g1Var.u;
                b71.a aVar = b71.a.r;
                i = g1Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    io0.m mVar = ((io0.k) obj).a;
                    b01.f e = (mVar == null || (lVar = mVar.a) == null) ? null : b91.g.e(lVar.c);
                    if (e != null) {
                        g1Var.v = 1;
                        if (this.s.c(e, g1Var) == aVar) {
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
        g1Var = new g1(this, cVar);
        Object obj22 = g1Var.u;
        b71.a aVar2 = b71.a.r;
        i = g1Var.v;
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
        k1 k1Var;
        int i;
        er0.g gVar;
        m90 m90Var;
        m90 m90Var2;
        if (cVar instanceof k1) {
            k1Var = (k1) cVar;
            int i2 = k1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = k1Var.u;
                b71.a aVar = b71.a.r;
                i = k1Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    p90 p90Var = ((o90) obj).a;
                    String str = null;
                    yp0.c cVar2 = (p90Var == null || (m90Var2 = p90Var.a) == null) ? null : m90Var2.c.j;
                    gu0.c cVar3 = (p90Var == null || (m90Var = p90Var.a) == null) ? null : m90Var.d;
                    if (cVar2 == null || cVar3 == null) {
                        throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", null, null, null, null, null, 120);
                    }
                    m90 m90Var3 = p90Var.a;
                    er0.i iVar = m90Var3.c;
                    String str2 = iVar.c;
                    at0.a aVar2 = iVar.l;
                    er0.o oVar = m90Var3.e;
                    boolean z = iVar.d;
                    boolean z2 = iVar.e;
                    boolean z3 = iVar.f;
                    boolean z4 = iVar.g;
                    er0.h hVar = iVar.i;
                    if (hVar != null && (gVar = hVar.c) != null) {
                        str = gVar.b;
                    }
                    String str3 = str;
                    ar0.i1 i1Var = iVar.m;
                    gt0.a aVar3 = iVar.k;
                    b01.g g = aa1.b.g(cVar2, str2, cVar3, aVar2, oVar, z, z2, z3, z4, str3, false, i1Var, aVar3.b, aVar3.c, aa1.b.c0(iVar));
                    k1Var.v = 1;
                    if (this.s.c(g, k1Var) == aVar) {
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
        k1Var = new k1(this, cVar);
        Object obj22 = k1Var.u;
        b71.a aVar4 = b71.a.r;
        i = k1Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(a71.c cVar, Object obj) {
        m1 m1Var;
        int i;
        if (cVar instanceof m1) {
            m1Var = (m1) cVar;
            int i2 = m1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = m1Var.u;
                b71.a aVar = b71.a.r;
                i = m1Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    lo0.f fVar = ((lo0.c) obj).a;
                    Object j = in.rShadow.j(fVar != null ? fVar.c : null, "Invalid draft issue Id", n1.s);
                    m1Var.v = 1;
                    if (this.s.c(j, m1Var) == aVar) {
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
        m1Var = new m1(this, cVar);
        Object obj22 = m1Var.u;
        b71.a aVar2 = b71.a.r;
        i = m1Var.v;
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
        o1 o1Var;
        int i;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i2 = o1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = o1Var.u;
                b71.a aVar = b71.a.r;
                i = o1Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    oi oiVar = (oi) obj;
                    k71.k.g(oiVar, "<this>");
                    ArrayList arrayList = oiVar.a;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        pi piVar = (pi) obj3;
                        Language language = piVar != null ? new Language(piVar.a, piVar.b) : null;
                        if (language != null) {
                            arrayList2.add(language);
                        }
                    }
                    o1Var.v = 1;
                    if (this.s.c(arrayList2, o1Var) == aVar) {
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
        o1Var = new o1(this, cVar);
        Object obj22 = o1Var.u;
        b71.a aVar2 = b71.a.r;
        i = o1Var.v;
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
        p1 p1Var;
        int i;
        if (cVar instanceof p1) {
            p1Var = (p1) cVar;
            int i2 = p1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = p1Var.u;
                b71.a aVar = b71.a.r;
                i = p1Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    d50 d50Var = (d50) obj;
                    k71.k.g(d50Var, "<this>");
                    ArrayList arrayList = d50Var.a;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        e50 e50Var = (e50) obj3;
                        SpokenLanguage spokenLanguage = e50Var != null ? new SpokenLanguage(e50Var.a, e50Var.b) : null;
                        if (spokenLanguage != null) {
                            arrayList2.add(spokenLanguage);
                        }
                    }
                    p1Var.v = 1;
                    if (this.s.c(arrayList2, p1Var) == aVar) {
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
        p1Var = new p1(this, cVar);
        Object obj22 = p1Var.u;
        b71.a aVar2 = b71.a.r;
        i = p1Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:446:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0188  */
    /* JADX WARN: Type inference failed for: r1v194, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        v vVar;
        int i;
        x xVar;
        int i2;
        z zVar;
        int i3;
        bn bnVar;
        c0 c0Var;
        int i4;
        z10 z10Var;
        d0 d0Var;
        int i5;
        c70 c70Var;
        e0 e0Var;
        int i6;
        z80 z80Var;
        f0 f0Var;
        int i7;
        Object bVar;
        ia0 ia0Var;
        g0 g0Var;
        int i8;
        yz0.a7 s;
        qd0 qd0Var;
        h0 h0Var;
        int i9;
        cq0.b0 b0Var;
        i0 i0Var;
        int i10;
        jn0.q5 q5Var;
        cq0.b0 b0Var2;
        j0 j0Var;
        int i12;
        ArrayList arrayList;
        jn0.g6 g6Var;
        jn0.f6 f6Var;
        x01.i iVar;
        jn0.g6 g6Var2;
        jn0.g6 g6Var3;
        yz0.w0 w0Var;
        k0 k0Var;
        int i13;
        wf wfVar;
        zf zfVar;
        wf wfVar2;
        zf zfVar2;
        wf wfVar3;
        zf zfVar3;
        l0 l0Var;
        int i14;
        m0 m0Var;
        int i15;
        a01.d dVar;
        y9 y9Var;
        int i16;
        String str;
        x61.rShadow rVar;
        String str2;
        up0.b bVar2;
        String str3;
        up0.b bVar3;
        List<up0.c> list;
        CheckStatusState checkStatusState;
        String str4;
        n0 n0Var;
        int i17;
        p0 p0Var;
        int i18;
        jn0.h hVar;
        jn0.h hVar2;
        t0 t0Var;
        int i19;
        io0.d dVar2;
        v0 v0Var;
        int i20;
        jn0.d7 d7Var;
        r1 r1Var;
        int i22;
        String str5;
        int i23;
        x61.rShadow rVar2;
        switch (this.r) {
            case 0:
                if (cVar instanceof v) {
                    vVar = (v) cVar;
                    int i24 = vVar.v;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        vVar.v = i24 - Integer.MIN_VALUE;
                        Object obj2 = vVar.u;
                        b71.a aVar = b71.a.r;
                        i = vVar.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i != 0) {
                            sy.y.j(obj2);
                            vVar.v = 1;
                            if (this.s.c(a0Var, vVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj2);
                        }
                        return a0Var;
                    }
                }
                vVar = new v(this, cVar);
                Object obj22 = vVar.u;
                b71.a aVar2 = b71.a.r;
                i = vVar.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i != 0) {
                }
                return a0Var2;
            case 1:
                if (cVar instanceof x) {
                    xVar = (x) cVar;
                    int i25 = xVar.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        xVar.v = i25 - Integer.MIN_VALUE;
                        Object obj3 = xVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = xVar.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            Boolean bool = Boolean.TRUE;
                            xVar.v = 1;
                            if (this.s.c(bool, xVar) == aVar3) {
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
                xVar = new x(this, cVar);
                Object obj32 = xVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = xVar.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof z) {
                    zVar = (z) cVar;
                    int i26 = zVar.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        zVar.v = i26 - Integer.MIN_VALUE;
                        Object obj4 = zVar.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = zVar.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            an anVar = ((zm) obj).a;
                            yz0.x2 g = (anVar == null || (bnVar = anVar.a) == null) ? null : com.google.common.util.concurrent.a.g(bnVar.c);
                            if (g != null) {
                                zVar.v = 1;
                                if (this.s.c(g, zVar) == aVar4) {
                                    return aVar4;
                                }
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
                zVar = new z(this, cVar);
                Object obj42 = zVar.u;
                b71.a aVar42 = b71.a.r;
                i3 = zVar.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof c0) {
                    c0Var = (c0) cVar;
                    int i27 = c0Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        c0Var.v = i27 - Integer.MIN_VALUE;
                        Object obj5 = c0Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = c0Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            y10 y10Var = ((x10) obj).a;
                            if (y10Var == null || (z10Var = y10Var.a) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "resolveReviewThread field null", null, null, null, null, null, 120);
                            }
                            yz0.g4 l = y41.t1.l(z10Var.c);
                            c0Var.v = 1;
                            if (this.s.c(l, c0Var) == aVar5) {
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
                c0Var = new c0(this, cVar);
                Object obj52 = c0Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = c0Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof d0) {
                    d0Var = (d0) cVar;
                    int i28 = d0Var.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        d0Var.v = i28 - Integer.MIN_VALUE;
                        Object obj6 = d0Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = d0Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj6);
                            d70 d70Var = ((b70) obj).a;
                            if (d70Var == null || (c70Var = d70Var.a) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "unresolveReviewThread field null", null, null, null, null, null, 120);
                            }
                            yz0.g4 l2 = y41.t1.l(c70Var.c);
                            d0Var.v = 1;
                            if (this.s.c(l2, d0Var) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                d0Var = new d0(this, cVar);
                Object obj62 = d0Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = d0Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof e0) {
                    e0Var = (e0) cVar;
                    int i29 = e0Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        e0Var.v = i29 - Integer.MIN_VALUE;
                        Object obj7 = e0Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = e0Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj7);
                            y80 y80Var = ((w80) obj).a;
                            yz0.x2 g2 = (y80Var == null || (z80Var = y80Var.a) == null) ? null : com.google.common.util.concurrent.a.g(z80Var.c);
                            if (g2 != null) {
                                e0Var.v = 1;
                                if (this.s.c(g2, e0Var) == aVar7) {
                                    return aVar7;
                                }
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                e0Var = new e0(this, cVar);
                Object obj72 = e0Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = e0Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof f0) {
                    f0Var = (f0) cVar;
                    int i30 = f0Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        f0Var.v = i30 - Integer.MIN_VALUE;
                        Object obj8 = f0Var.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = f0Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj8);
                            ja0 ja0Var = ((ha0) obj).a;
                            yp0.c cVar2 = (ja0Var == null || (ia0Var = ja0Var.a) == null) ? null : ia0Var.d;
                            if (cVar2 == null) {
                                yz0.s.Companion.getClass();
                                bVar = yz0.r.b;
                            } else {
                                bVar = new kx0.b(cVar2, ja0Var.a.c, new yz0.d0(cVar2.b));
                            }
                            f0Var.v = 1;
                            if (this.s.c(bVar, f0Var) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                f0Var = new f0(this, cVar);
                Object obj82 = f0Var.u;
                b71.a aVar82 = b71.a.r;
                i7 = f0Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof g0) {
                    g0Var = (g0) cVar;
                    int i32 = g0Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        g0Var.v = i32 - Integer.MIN_VALUE;
                        Object obj9 = g0Var.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = g0Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj9);
                            rd0 rd0Var = ((pd0) obj).a;
                            cu0.c cVar3 = (rd0Var == null || (qd0Var = rd0Var.a) == null) ? null : qd0Var.c;
                            if (cVar3 == null) {
                                yz0.s.Companion.getClass();
                                s = new yz0.a7(yz0.r.b, false, TimelineItem$TimelinePullRequestReview$ReviewState.UNKNOWN);
                            } else {
                                s = com.google.android.gms.internal.measurement.b4.s(cVar3);
                            }
                            g0Var.v = 1;
                            if (this.s.c(s, g0Var) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                g0Var = new g0(this, cVar);
                Object obj92 = g0Var.u;
                b71.a aVar92 = b71.a.r;
                i8 = g0Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof h0) {
                    h0Var = (h0) cVar;
                    int i33 = h0Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        h0Var.v = i33 - Integer.MIN_VALUE;
                        Object obj10 = h0Var.u;
                        b71.a aVar10 = b71.a.r;
                        i9 = h0Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj10);
                            jn0.v5 v5Var = ((jn0.u5) obj).a;
                            yz0.u0 M = (v5Var == null || (b0Var = v5Var.c) == null) ? null : v8.l0.M(b0Var);
                            if (M != null) {
                                h0Var.v = 1;
                                if (this.s.c(M, h0Var) == aVar10) {
                                    return aVar10;
                                }
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                h0Var = new h0(this, cVar);
                Object obj102 = h0Var.u;
                b71.a aVar102 = b71.a.r;
                i9 = h0Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof i0) {
                    i0Var = (i0) cVar;
                    int i34 = i0Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        i0Var.v = i34 - Integer.MIN_VALUE;
                        Object obj11 = i0Var.u;
                        b71.a aVar11 = b71.a.r;
                        i10 = i0Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj11);
                            jn0.r5 r5Var = ((jn0.p5) obj).a;
                            yz0.u0 M2 = (r5Var == null || (q5Var = r5Var.b) == null || (b0Var2 = q5Var.c) == null) ? null : v8.l0.M(b0Var2);
                            if (M2 != null) {
                                i0Var.v = 1;
                                if (this.s.c(M2, i0Var) == aVar11) {
                                    return aVar11;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                i0Var = new i0(this, cVar);
                Object obj112 = i0Var.u;
                b71.a aVar112 = b71.a.r;
                i10 = i0Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof j0) {
                    j0Var = (j0) cVar;
                    int i35 = j0Var.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        j0Var.v = i35 - Integer.MIN_VALUE;
                        Object obj12 = j0Var.u;
                        b71.a aVar12 = b71.a.r;
                        i12 = j0Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj12);
                            jn0.a6 a6Var = (jn0.a6) obj;
                            jn0.f6 f6Var2 = a6Var.a;
                            String str6 = null;
                            jn0.h6 h6Var = f6Var2 != null ? f6Var2.c : null;
                            x61.rShadow<jn0.e6> rVar3 = x61.rShadow.r;
                            if (h6Var != null) {
                                java.util.ArrayList r2 = (java.util.ArrayList) (f6Var2.c.a.b);
                                if (r2 != 0) {
                                    rVar3 = r2;
                                }
                                arrayList = new ArrayList();
                                for (jn0.d6 d6Var : rVar3) {
                                    yz0.j4 y = d6Var != null ? a.a.y(d6Var.b.c) : null;
                                    if (y != null) {
                                        arrayList.add(y);
                                    }
                                }
                            } else {
                                if ((f6Var2 != null ? f6Var2.d : null) != null) {
                                    jn0.b6 b6Var = f6Var2.d.a;
                                    x61.rShadow rVar4 = (b6Var == null || (g6Var = b6Var.b) == null) ? null : g6Var.a.b;
                                    if (rVar4 != null) {
                                        rVar3 = rVar4;
                                    }
                                    arrayList = new ArrayList();
                                    for (jn0.e6 e6Var : rVar3) {
                                        yz0.j4 y2 = e6Var != null ? a.a.y(e6Var.c) : null;
                                        if (y2 != null) {
                                            arrayList.add(y2);
                                        }
                                    }
                                }
                                f6Var = a6Var.a;
                                if ((f6Var == null ? f6Var.c : null) == null) {
                                    jn0.k6 k6Var = f6Var.c.a.a;
                                    iVar = new x01.i(k6Var.b, k6Var.a, false);
                                } else if ((f6Var != null ? f6Var.d : null) != null) {
                                    jn0.b6 b6Var2 = f6Var.d.a;
                                    boolean z = (b6Var2 == null || (g6Var3 = b6Var2.b) == null) ? false : g6Var3.a.a.a;
                                    if (b6Var2 != null && (g6Var2 = b6Var2.b) != null) {
                                        str6 = g6Var2.a.a.b;
                                    }
                                    iVar = new x01.i(str6, z, false);
                                } else {
                                    iVar = new x01.i(null, false, false);
                                }
                                w0Var = new yz0.w0(rVar3, iVar);
                                j0Var.v = 1;
                                if (this.s.c(w0Var, j0Var) == aVar12) {
                                    return aVar12;
                                }
                            }
                            rVar3 = arrayList;
                            f6Var = a6Var.a;
                            if ((f6Var == null ? f6Var.c : null) == null) {
                            }
                            w0Var = new yz0.w0(rVar3, iVar);
                            j0Var.v = 1;
                            if (this.s.c(w0Var, j0Var) == aVar12) {
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                j0Var = new j0(this, cVar);
                Object obj122 = j0Var.u;
                b71.a aVar122 = b71.a.r;
                i12 = j0Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof k0) {
                    k0Var = (k0) cVar;
                    int i36 = k0Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        k0Var.v = i36 - Integer.MIN_VALUE;
                        Object obj13 = k0Var.u;
                        b71.a aVar13 = b71.a.r;
                        i13 = k0Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj13);
                            vf vfVar = (vf) obj;
                            bg bgVar = vfVar.a;
                            String str7 = null;
                            List<yf> list2 = (bgVar == null || (wfVar3 = bgVar.b) == null || (zfVar3 = wfVar3.b) == null) ? null : zfVar3.b.b;
                            if (list2 == null) {
                                list2 = x61.rShadow.r;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (yf yfVar : list2) {
                                yz0.j4 y3 = yfVar != null ? a.a.y(yfVar.c) : null;
                                if (y3 != null) {
                                    arrayList2.add(y3);
                                }
                            }
                            bg bgVar2 = vfVar.a;
                            boolean z2 = (bgVar2 == null || (wfVar2 = bgVar2.b) == null || (zfVar2 = wfVar2.b) == null) ? false : zfVar2.b.a.a;
                            if (bgVar2 != null && (wfVar = bgVar2.b) != null && (zfVar = wfVar.b) != null) {
                                str7 = zfVar.b.a.b;
                            }
                            yz0.w0 w0Var2 = new yz0.w0(arrayList2, new x01.i(str7, z2, false));
                            k0Var.v = 1;
                            if (this.s.c(w0Var2, k0Var) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                k0Var = new k0(this, cVar);
                Object obj132 = k0Var.u;
                b71.a aVar132 = b71.a.r;
                i13 = k0Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof l0) {
                    l0Var = (l0) cVar;
                    int i37 = l0Var.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        l0Var.v = i37 - Integer.MIN_VALUE;
                        Object obj14 = l0Var.u;
                        b71.a aVar14 = b71.a.r;
                        i14 = l0Var.v;
                        w61.a0 a0Var3 = w61.a0.a;
                        if (i14 != 0) {
                            sy.y.j(obj14);
                            l0Var.v = 1;
                            if (this.s.c(a0Var3, l0Var) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return a0Var3;
                    }
                }
                l0Var = new l0(this, cVar);
                Object obj142 = l0Var.u;
                b71.a aVar142 = b71.a.r;
                i14 = l0Var.v;
                w61.a0 a0Var32 = w61.a0.a;
                if (i14 != 0) {
                }
                return a0Var32;
            case 13:
                if (cVar instanceof m0) {
                    m0Var = (m0) cVar;
                    int i38 = m0Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        m0Var.v = i38 - Integer.MIN_VALUE;
                        Object obj15 = m0Var.u;
                        b71.a aVar15 = b71.a.r;
                        i15 = m0Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj15);
                            x9 x9Var = ((s9) obj).a;
                            if (x9Var == null || (y9Var = x9Var.c) == null) {
                                dVar = null;
                            } else {
                                String str8 = y9Var.a;
                                String str9 = y9Var.b;
                                CheckStatusState K = k21.f.K(y9Var.c);
                                ba baVar = y9Var.d;
                                String str10 = baVar.b;
                                String str11 = baVar.c;
                                com.github.service.models.response.a e = k41.b.e(baVar.a.b);
                                r9 r9Var = y9Var.e;
                                com.github.service.models.response.a e2 = k41.b.e(r9Var != null ? r9Var.c : null);
                                da daVar = y9Var.f;
                                if (daVar == null) {
                                    throw new IllegalStateException("WorkFlowRun information can't be null");
                                }
                                String str12 = daVar.a;
                                String str13 = daVar.b;
                                int i39 = daVar.c;
                                String str14 = daVar.d.a;
                                List list3 = daVar.e.a;
                                x61.rShadow rVar5 = x61.rShadow.r;
                                if (list3 == null) {
                                    list3 = rVar5;
                                }
                                ArrayList S = x61.m.S(list3);
                                ArrayList arrayList3 = new ArrayList(x61.n.F(S, 10));
                                int size = S.size();
                                int i40 = 0;
                                while (i40 < size) {
                                    Object obj16 = S.get(i40);
                                    int i42 = i40 + 1;
                                    ArrayList arrayList4 = S;
                                    uq0.f fVar = ((u9) obj16).b;
                                    boolean z3 = fVar.a;
                                    int i43 = size;
                                    uq0.a aVar16 = fVar.b;
                                    String str15 = str8;
                                    String str16 = aVar16.a;
                                    String str17 = aVar16.b;
                                    List list4 = fVar.c.a;
                                    if (list4 == null) {
                                        list4 = rVar5;
                                    }
                                    ArrayList S2 = x61.m.S(list4);
                                    String str18 = str9;
                                    ArrayList arrayList5 = new ArrayList();
                                    CheckStatusState checkStatusState2 = K;
                                    int size2 = S2.size();
                                    String str19 = str10;
                                    int i44 = 0;
                                    while (i44 < size2) {
                                        Object obj17 = S2.get(i44);
                                        i44++;
                                        ArrayList arrayList6 = S2;
                                        uq0.b bVar4 = (uq0.b) obj17;
                                        int i45 = size2;
                                        uq0.c cVar4 = bVar4.c;
                                        if (cVar4 != null) {
                                            str4 = cVar4.a;
                                        } else {
                                            uq0.d dVar3 = bVar4.b;
                                            str4 = dVar3 != null ? dVar3.a : null;
                                        }
                                        if (str4 != null) {
                                            arrayList5.add(str4);
                                        }
                                        size2 = i45;
                                        S2 = arrayList6;
                                    }
                                    arrayList3.add(new a01.c(str16, str17, arrayList5, z3));
                                    i40 = i42;
                                    S = arrayList4;
                                    size = i43;
                                    str8 = str15;
                                    str9 = str18;
                                    K = checkStatusState2;
                                    str10 = str19;
                                }
                                String str20 = str8;
                                String str21 = str9;
                                CheckStatusState checkStatusState3 = K;
                                String str22 = str10;
                                a01.f fVar2 = new a01.f(i39, str12, str13, str14, arrayList3);
                                jn0.p9 p9Var = y9Var.g;
                                List list5 = p9Var != null ? p9Var.a : null;
                                if (list5 == null) {
                                    list5 = rVar5;
                                }
                                ArrayList S3 = x61.m.S(list5);
                                ArrayList arrayList7 = new ArrayList(x61.n.F(S3, 10));
                                int size3 = S3.size();
                                int i46 = 0;
                                while (i46 < size3) {
                                    Object obj18 = S3.get(i46);
                                    int i47 = i46 + 1;
                                    up0.f fVar3 = ((v9) obj18).c;
                                    String str23 = fVar3.c;
                                    String str24 = fVar3.a;
                                    CheckStatusState K2 = k21.f.K(fVar3.b);
                                    pz0.y2 y2Var = fVar3.d;
                                    CheckConclusionState N = y2Var != null ? i21.a.N(y2Var) : null;
                                    String str25 = fVar3.e;
                                    ArrayList arrayList8 = S3;
                                    up0.e eVar = fVar3.g;
                                    int i48 = size3;
                                    int i49 = eVar != null ? eVar.a : 0;
                                    if (eVar == null || (list = eVar.b) == null) {
                                        i16 = i47;
                                        str = str23;
                                        rVar = rVar5;
                                    } else {
                                        i16 = i47;
                                        str = str23;
                                        ArrayList arrayList9 = new ArrayList(x61.n.F(list, 10));
                                        for (up0.c cVar5 : list) {
                                            up0.d dVar4 = cVar5 != null ? cVar5.b : null;
                                            if (dVar4 == null || (checkStatusState = k21.f.K(dVar4.a)) == null) {
                                                checkStatusState = CheckStatusState.UNKNOWN__;
                                            }
                                            arrayList9.add(new a01.b(checkStatusState));
                                        }
                                        rVar = arrayList9;
                                    }
                                    up0.a aVar17 = fVar3.f;
                                    if (aVar17 == null || (bVar3 = aVar17.a) == null || (str3 = bVar3.a) == null) {
                                        if (aVar17 == null || (bVar2 = aVar17.a) == null) {
                                            str2 = null;
                                            arrayList7.add(new a01.a(str, str24, K2, N, str25, i49, rVar, str2));
                                            S3 = arrayList8;
                                            size3 = i48;
                                            i46 = i16;
                                        } else {
                                            str3 = bVar2.b;
                                        }
                                    }
                                    str2 = str3;
                                    arrayList7.add(new a01.a(str, str24, K2, N, str25, i49, rVar, str2));
                                    S3 = arrayList8;
                                    size3 = i48;
                                    i46 = i16;
                                }
                                t9 t9Var = y9Var.h;
                                List list6 = t9Var != null ? t9Var.a : null;
                                if (list6 == null) {
                                    list6 = rVar5;
                                }
                                ArrayList S4 = x61.m.S(list6);
                                ArrayList arrayList10 = new ArrayList(x61.n.F(S4, 10));
                                int size4 = S4.size();
                                int i50 = 0;
                                while (i50 < size4) {
                                    Object obj19 = S4.get(i50);
                                    i50++;
                                    xt0.e eVar2 = ((w9) obj19).c;
                                    xt0.p2 p2Var = eVar2.e;
                                    String str26 = p2Var.b;
                                    xt0.n2 n2Var = p2Var.m;
                                    ArrayList arrayList11 = S4;
                                    String str27 = n2Var.b;
                                    ArrayList arrayList12 = arrayList7;
                                    String str28 = p2Var.n;
                                    String str29 = p2Var.d;
                                    int i52 = p2Var.f;
                                    yz0.d3 d3Var = new yz0.d3(n2Var.e.b, str27);
                                    ZonedDateTime zonedDateTime = eVar2.b;
                                    if (zonedDateTime == null) {
                                        zonedDateTime = p2Var.g;
                                    }
                                    ZonedDateTime zonedDateTime2 = zonedDateTime;
                                    PullRequestState Q = com.google.android.gms.internal.measurement.z3.Q(eVar2.c);
                                    List list7 = p2Var.r.a;
                                    if (list7 == null) {
                                        list7 = rVar5;
                                    }
                                    ArrayList S5 = x61.m.S(list7);
                                    ArrayList arrayList13 = new ArrayList(x61.n.F(S5, 10));
                                    int size5 = S5.size();
                                    int i53 = 0;
                                    while (i53 < size5) {
                                        Object obj20 = S5.get(i53);
                                        i53++;
                                        int i54 = size5;
                                        xt0.o2 o2Var = ((xt0.k2) obj20).b.b;
                                        arrayList13.add(o2Var != null ? com.google.common.util.concurrent.a.W(o2Var.b) : null);
                                        size5 = i54;
                                    }
                                    StatusState statusState = (StatusState) x61.m.W(arrayList13);
                                    if (statusState == null) {
                                        statusState = StatusState.UNKNOWN__;
                                    }
                                    arrayList10.add(new a01.e(str26, str28, str29, i52, d3Var, str27, zonedDateTime2, Q, statusState));
                                    S4 = arrayList11;
                                    arrayList7 = arrayList12;
                                }
                                dVar = new a01.d(str20, str21, checkStatusState3, str22, str11, e, e2, fVar2, arrayList7, arrayList10);
                            }
                            if (dVar != null) {
                                m0Var.v = 1;
                                if (this.s.c(dVar, m0Var) == aVar15) {
                                    return aVar15;
                                }
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return w61.a0.a;
                    }
                }
                m0Var = new m0(this, cVar);
                Object obj152 = m0Var.u;
                b71.a aVar152 = b71.a.r;
                i15 = m0Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof n0) {
                    n0Var = (n0) cVar;
                    int i55 = n0Var.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        n0Var.v = i55 - Integer.MIN_VALUE;
                        Object obj21 = n0Var.u;
                        b71.a aVar18 = b71.a.r;
                        i17 = n0Var.v;
                        w61.a0 a0Var4 = w61.a0.a;
                        if (i17 != 0) {
                            sy.y.j(obj21);
                            n0Var.v = 1;
                            if (this.s.c(a0Var4, n0Var) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return a0Var4;
                    }
                }
                n0Var = new n0(this, cVar);
                Object obj212 = n0Var.u;
                b71.a aVar182 = b71.a.r;
                i17 = n0Var.v;
                w61.a0 a0Var42 = w61.a0.a;
                if (i17 != 0) {
                }
                return a0Var42;
            case 15:
                if (cVar instanceof p0) {
                    p0Var = (p0) cVar;
                    int i56 = p0Var.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        p0Var.v = i56 - Integer.MIN_VALUE;
                        Object obj23 = p0Var.u;
                        b71.a aVar19 = b71.a.r;
                        i18 = p0Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj23);
                            jn0.g gVar = ((jn0.k) obj).a;
                            gu0.c cVar6 = null;
                            yp0.c cVar7 = (gVar == null || (hVar2 = gVar.a) == null) ? null : hVar2.d.j;
                            if (gVar != null && (hVar = gVar.a) != null) {
                                cVar6 = hVar.d.n;
                            }
                            gu0.c cVar8 = cVar6;
                            if (cVar7 == null || cVar8 == null) {
                                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", null, null, null, null, null, 120);
                            }
                            er0.i iVar2 = gVar.a.d;
                            b01.g j = aa1.b.j(cVar7, iVar2.c, cVar8, (at0.a) null, iVar2.d, iVar2.e, iVar2.f, false, (String) null, iVar2.m, false, false, aa1.b.c0(iVar2), 14220);
                            p0Var.v = 1;
                            if (this.s.c(j, p0Var) == aVar19) {
                                return aVar19;
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
                p0Var = new p0(this, cVar);
                Object obj232 = p0Var.u;
                b71.a aVar192 = b71.a.r;
                i18 = p0Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof t0) {
                    t0Var = (t0) cVar;
                    int i57 = t0Var.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        t0Var.v = i57 - Integer.MIN_VALUE;
                        Object obj24 = t0Var.u;
                        b71.a aVar20 = b71.a.r;
                        i19 = t0Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj24);
                            io0.a aVar21 = ((io0.c) obj).a;
                            b01.f e3 = (aVar21 == null || (dVar2 = aVar21.a) == null) ? null : b91.g.e(dVar2.c);
                            if (e3 != null) {
                                t0Var.v = 1;
                                if (this.s.c(e3, t0Var) == aVar20) {
                                    return aVar20;
                                }
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
                t0Var = new t0(this, cVar);
                Object obj242 = t0Var.u;
                b71.a aVar202 = b71.a.r;
                i19 = t0Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof v0) {
                    v0Var = (v0) cVar;
                    int i58 = v0Var.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        v0Var.v = i58 - Integer.MIN_VALUE;
                        Object obj25 = v0Var.u;
                        b71.a aVar22 = b71.a.r;
                        i20 = v0Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj25);
                            jn0.b7 b7Var = ((jn0.c7) obj).a;
                            ar0.p0 p0Var2 = (b7Var == null || (d7Var = b7Var.a) == null) ? null : d7Var.c;
                            if (p0Var2 == null) {
                                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", null, null, null, null, null, 120);
                            }
                            b01.b d = b91.g.d(p0Var2);
                            v0Var.v = 1;
                            if (this.s.c(d, v0Var) == aVar22) {
                                return aVar22;
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
                v0Var = new v0(this, cVar);
                Object obj252 = v0Var.u;
                b71.a aVar222 = b71.a.r;
                i20 = v0Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
            case 18:
                return a(cVar, obj);
            case 19:
                return b(cVar, obj);
            case 20:
                return d(cVar, obj);
            case 21:
                return e(cVar, obj);
            case 22:
                return f(cVar, obj);
            case 23:
                return g(cVar, obj);
            case 24:
                return h(cVar, obj);
            case 25:
                return i(cVar, obj);
            case 26:
                return j(cVar, obj);
            case 27:
                return k(cVar, obj);
            case 28:
                return n(cVar, obj);
            default:
                if (cVar instanceof r1) {
                    r1Var = (r1) cVar;
                    int i59 = r1Var.v;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        r1Var.v = i59 - Integer.MIN_VALUE;
                        Object obj26 = r1Var.u;
                        b71.a aVar23 = b71.a.r;
                        i22 = r1Var.v;
                        if (i22 != 0) {
                            sy.y.j(obj26);
                            nd ndVar = (nd) obj;
                            k71.k.g(ndVar, "<this>");
                            rd rdVar = ndVar.a;
                            List list8 = rdVar != null ? rdVar.b.a : null;
                            x61.rShadow rVar6 = x61.rShadow.r;
                            if (list8 == null) {
                                list8 = rVar6;
                            }
                            ArrayList S6 = x61.m.S(list8);
                            ArrayList arrayList14 = new ArrayList(x61.n.F(S6, 10));
                            int size6 = S6.size();
                            int i60 = 0;
                            while (i60 < size6) {
                                Object obj27 = S6.get(i60);
                                i60++;
                                od odVar = (od) obj27;
                                uu0.k3Shadow k3Var = odVar.d;
                                RepositoryRecommendationReason repositoryRecommendationReason = RepositoryRecommendationReason.UNKNOWN__;
                                int i62 = odVar.b;
                                String str30 = k3Var.c;
                                uu0.j3 j3Var = k3Var.i;
                                uu0.h3 h3Var = k3Var.h;
                                com.github.service.models.response.a aVar24 = new com.github.service.models.response.a(h3Var.c, m7.y.L(h3Var.d), (String) null, false, (String) null, 60);
                                String str31 = k3Var.d;
                                if (j3Var != null) {
                                    try {
                                        str5 = j3Var.a;
                                    } catch (Exception unused) {
                                        i23 = -16777216;
                                    }
                                } else {
                                    str5 = null;
                                }
                                i23 = Color.parseColor(str5);
                                int i63 = i23;
                                String str32 = j3Var != null ? j3Var.b : null;
                                String str33 = k3Var.b;
                                uu0.u4 u4Var = k3Var.r;
                                boolean z4 = u4Var.d;
                                int i64 = u4Var.c;
                                ArrayList arrayList15 = S6;
                                String str34 = (k3Var.j || k3Var.l) ? k3Var.k : null;
                                String str35 = k3Var.e;
                                List<uu0.f3> list9 = k3Var.q.a;
                                if (list9 != null) {
                                    ArrayList arrayList16 = new ArrayList();
                                    for (uu0.f3 f3Var : list9) {
                                        String str36 = str33;
                                        String str37 = f3Var != null ? f3Var.b : null;
                                        if (str37 != null) {
                                            arrayList16.add(str37);
                                        }
                                        str33 = str36;
                                    }
                                    rVar2 = arrayList16;
                                } else {
                                    rVar2 = rVar6;
                                }
                                arrayList14.add(new d01.c(str30, aVar24, str31, i63, str32, str33, z4, i64, str34, i62, str35, rVar2, repositoryRecommendationReason));
                                S6 = arrayList15;
                            }
                            x01.i.Companion.getClass();
                            d01.a aVar25 = new d01.a(arrayList14);
                            r1Var.v = 1;
                            if (this.s.c(aVar25, r1Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return w61.a0.a;
                    }
                }
                r1Var = new r1(this, cVar);
                Object obj262 = r1Var.u;
                b71.a aVar232 = b71.a.r;
                i22 = r1Var.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
        }
    }
}
