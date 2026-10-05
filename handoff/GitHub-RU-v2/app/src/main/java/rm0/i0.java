package rm0;

import android.graphics.Color;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.Language;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.SpokenLanguage;
import com.github.service.models.response.TimelineItem$TimelinePullRequestReview$ReviewState;
import com.github.service.models.response.discussions.PinnedDiscussionPatternState;
import com.github.service.models.response.type.RepositoryRecommendationReason;
import com.github.service.models.response.type.StatusState;
import gn0.bk;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kc0.ad;
import kc0.ae;
import kc0.am;
import kc0.b50;
import kc0.bm;
import kc0.c50;
import kc0.cm;
import kc0.de;
import kc0.e70;
import kc0.eb;
import kc0.ed;
import kc0.ee;
import kc0.f60;
import kc0.f70;
import kc0.fb;
import kc0.fd;
import kc0.fn;
import kc0.g60;
import kc0.g70;
import kc0.gb;
import kc0.gd;
import kc0.ge;
import kc0.h60;
import kc0.hd;
import kc0.he;
import kc0.i30;
import kc0.id;
import kc0.in;
import kc0.j30;
import kc0.jd;
import kc0.je;
import kc0.jn;
import kc0.k30;
import kc0.kd;
import kc0.kn;
import kc0.ld;
import kc0.mn;
import kc0.o10;
import kc0.p10;
import kc0.p50;
import kc0.p90;
import kc0.q90;
import kc0.r50;
import kc0.r90;
import kc0.s50;
import kc0.tc;
import kc0.uc;
import kc0.wd;
import kc0.wl;
import kc0.xc;
import kc0.xd;
import kc0.xg;
import kc0.yd;
import kc0.yg;
import kc0.yl;
import kc0.z40;
import kc0.zd;
import kc0.zl;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ i0(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [b01.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        o1 o1Var;
        int i;
        bm bmVar;
        zl zlVar;
        wl wlVar;
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
                    am amVar = ((yl) obj).a;
                    if (amVar != null && (bmVar = amVar.a) != null && (zlVar = bmVar.b) != null && (wlVar = zlVar.a) != null) {
                        String str = wlVar.a;
                        cm cmVar = wlVar.b;
                        r7 = new b01.h(str, cmVar != null ? cmVar.a : null);
                    }
                    if (r7 != null) {
                        o1Var.v = 1;
                        if (this.s.c(r7, o1Var) == aVar) {
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
        o1Var = new o1(this, cVar);
        Object obj22 = o1Var.u;
        b71.a aVar2 = b71.a.r;
        i = o1Var.v;
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
    private final Object b(a71.c cVar, Object obj) {
        p1 p1Var;
        int i;
        bk bkVar;
        int i2;
        int i3;
        int i4;
        PinnedDiscussionPatternState pinnedDiscussionPatternState;
        if (cVar instanceof p1) {
            p1Var = (p1) cVar;
            int i5 = p1Var.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                p1Var.v = i5 - Integer.MIN_VALUE;
                Object obj2 = p1Var.u;
                b71.a aVar = b71.a.r;
                i = p1Var.v;
                int i6 = 1;
                if (i != 0) {
                    sy.y.j(obj2);
                    mn mnVar = ((in) obj).a;
                    List list = mnVar != null ? mnVar.b.a : null;
                    if (list == null) {
                        list = x61.r.r;
                    }
                    ArrayList S = x61.m.S(list);
                    ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                    int size = S.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj3 = S.get(i7);
                        i7++;
                        kn knVar = (kn) obj3;
                        k71.k.g(knVar, "<this>");
                        String str = knVar.a;
                        jn jnVar = knVar.b;
                        int i8 = jnVar.a;
                        fn fnVar = jnVar.c;
                        com.github.service.models.response.a d = aa1.b.d(fnVar != null ? fnVar.b : null);
                        String str2 = jnVar.b;
                        String str3 = jnVar.d.a;
                        bk bkVar2 = knVar.c;
                        ArrayList arrayList2 = knVar.d;
                        ArrayList arrayList3 = S;
                        try {
                            bkVar = bkVar2;
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
                                    switch (bkVar.ordinal()) {
                                    }
                                    arrayList.add(new b01.p(str, i8, d, str2, str3, new b01.n(i2, i4, pinnedDiscussionPatternState)));
                                    S = arrayList3;
                                    size = i3;
                                    i6 = 1;
                                }
                                switch (bkVar.ordinal()) {
                                }
                                arrayList.add(new b01.p(str, i8, d, str2, str3, new b01.n(i2, i4, pinnedDiscussionPatternState)));
                                S = arrayList3;
                                size = i3;
                                i6 = 1;
                            }
                        } catch (Exception unused3) {
                            bkVar = bkVar2;
                        }
                        try {
                            i3 = size;
                            i4 = Color.parseColor("#" + x61.m.f0(arrayList2));
                        } catch (Exception unused4) {
                            i3 = size;
                        }
                        switch (bkVar.ordinal()) {
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
                        arrayList.add(new b01.p(str, i8, d, str2, str3, new b01.n(i2, i4, pinnedDiscussionPatternState)));
                        S = arrayList3;
                        size = i3;
                        i6 = 1;
                    }
                    p1Var.v = i6;
                    if (this.s.c(arrayList, p1Var) == aVar) {
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
    private final Object d(a71.c cVar, Object obj) {
        w1 w1Var;
        int i;
        id0.k kVar;
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i2 = w1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = w1Var.u;
                b71.a aVar = b71.a.r;
                i = w1Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    id0.l lVar = ((id0.j) obj).a;
                    b01.f j = (lVar == null || (kVar = lVar.a) == null) ? null : y41.t1.j(kVar.c);
                    if (j != null) {
                        w1Var.v = 1;
                        if (this.s.c(j, w1Var) == aVar) {
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
        w1Var = new w1(this, cVar);
        Object obj22 = w1Var.u;
        b71.a aVar2 = b71.a.r;
        i = w1Var.v;
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
        a2 a2Var;
        int i;
        yf0.g gVar;
        p50 p50Var;
        p50 p50Var2;
        if (cVar instanceof a2) {
            a2Var = (a2) cVar;
            int i2 = a2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = a2Var.u;
                b71.a aVar = b71.a.r;
                i = a2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    s50 s50Var = ((r50) obj).a;
                    String str = null;
                    se0.c cVar2 = (s50Var == null || (p50Var2 = s50Var.a) == null) ? null : p50Var2.c.j;
                    aj0.c cVar3 = (s50Var == null || (p50Var = s50Var.a) == null) ? null : p50Var.d;
                    if (cVar2 == null || cVar3 == null) {
                        throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", null, null, null, null, null, 120);
                    }
                    p50 p50Var3 = s50Var.a;
                    yf0.i iVar = p50Var3.c;
                    String str2 = iVar.c;
                    qh0.a aVar2 = iVar.l;
                    yf0.o oVar = p50Var3.e;
                    boolean z = iVar.d;
                    boolean z2 = iVar.e;
                    boolean z3 = iVar.f;
                    boolean z4 = iVar.g;
                    yf0.h hVar = iVar.i;
                    if (hVar != null && (gVar = hVar.c) != null) {
                        str = gVar.b;
                    }
                    String str3 = str;
                    uf0.i1 i1Var = iVar.m;
                    yh0.a aVar3 = iVar.k;
                    b01.g g = v8.l0.g(cVar2, str2, cVar3, aVar2, oVar, z, z2, z3, z4, str3, false, i1Var, aVar3.b, aVar3.c, v8.l0.T(iVar));
                    a2Var.v = 1;
                    if (this.s.c(g, a2Var) == aVar) {
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
        a2Var = new a2(this, cVar);
        Object obj22 = a2Var.u;
        b71.a aVar4 = b71.a.r;
        i = a2Var.v;
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
        c2 c2Var;
        int i;
        if (cVar instanceof c2) {
            c2Var = (c2) cVar;
            int i2 = c2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = c2Var.u;
                b71.a aVar = b71.a.r;
                i = c2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    xg xgVar = (xg) obj;
                    k71.k.g(xgVar, "<this>");
                    ArrayList arrayList = xgVar.a;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        yg ygVar = (yg) obj3;
                        Language language = ygVar != null ? new Language(ygVar.a, ygVar.b) : null;
                        if (language != null) {
                            arrayList2.add(language);
                        }
                    }
                    c2Var.v = 1;
                    if (this.s.c(arrayList2, c2Var) == aVar) {
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
        c2Var = new c2(this, cVar);
        Object obj22 = c2Var.u;
        b71.a aVar2 = b71.a.r;
        i = c2Var.v;
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
        d2 d2Var;
        int i;
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i2 = d2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = d2Var.u;
                b71.a aVar = b71.a.r;
                i = d2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    o10 o10Var = (o10) obj;
                    k71.k.g(o10Var, "<this>");
                    ArrayList arrayList = o10Var.a;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        p10 p10Var = (p10) obj3;
                        SpokenLanguage spokenLanguage = p10Var != null ? new SpokenLanguage(p10Var.a, p10Var.b) : null;
                        if (spokenLanguage != null) {
                            arrayList2.add(spokenLanguage);
                        }
                    }
                    d2Var.v = 1;
                    if (this.s.c(arrayList2, d2Var) == aVar) {
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
        d2Var = new d2(this, cVar);
        Object obj22 = d2Var.u;
        b71.a aVar2 = b71.a.r;
        i = d2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        h2 h2Var;
        int i;
        String str;
        int i2;
        x61.r rVar;
        if (cVar instanceof h2) {
            h2Var = (h2) cVar;
            int i3 = h2Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h2Var.v = i3 - Integer.MIN_VALUE;
                Object obj2 = h2Var.u;
                b71.a aVar = b71.a.r;
                i = h2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    tc tcVar = (tc) obj;
                    k71.k.g(tcVar, "<this>");
                    xc xcVar = tcVar.a;
                    List list = xcVar != null ? xcVar.b.a : null;
                    x61.r rVar2 = x61.r.r;
                    if (list == null) {
                        list = rVar2;
                    }
                    ArrayList S = x61.m.S(list);
                    ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                    int size = S.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj3 = S.get(i4);
                        i4++;
                        uc ucVar = (uc) obj3;
                        oj0.e2 e2Var = ucVar.d;
                        RepositoryRecommendationReason repositoryRecommendationReason = RepositoryRecommendationReason.UNKNOWN__;
                        int i5 = ucVar.b;
                        String str2 = e2Var.c;
                        oj0.d2 d2Var = e2Var.i;
                        oj0.b2 b2Var = e2Var.h;
                        com.github.service.models.response.a aVar2 = new com.github.service.models.response.a(b2Var.c, b41.b.O(b2Var.d), (String) null, false, (String) null, 60);
                        String str3 = e2Var.d;
                        if (d2Var != null) {
                            try {
                                str = d2Var.a;
                            } catch (Exception unused) {
                                i2 = -16777216;
                            }
                        } else {
                            str = null;
                        }
                        i2 = Color.parseColor(str);
                        int i6 = i2;
                        String str4 = d2Var != null ? d2Var.b : null;
                        String str5 = e2Var.b;
                        oj0.q3 q3Var = e2Var.r;
                        boolean z = q3Var.d;
                        int i7 = q3Var.c;
                        ArrayList arrayList2 = S;
                        String str6 = (e2Var.j || e2Var.l) ? e2Var.k : null;
                        String str7 = e2Var.e;
                        List<oj0.z1> list2 = e2Var.q.a;
                        if (list2 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (oj0.z1 z1Var : list2) {
                                String str8 = str5;
                                String str9 = z1Var != null ? z1Var.b : null;
                                if (str9 != null) {
                                    arrayList3.add(str9);
                                }
                                str5 = str8;
                            }
                            rVar = arrayList3;
                        } else {
                            rVar = rVar2;
                        }
                        arrayList.add(new d01.c(str2, aVar2, str3, i6, str4, str5, z, i7, str6, i5, str7, rVar, repositoryRecommendationReason));
                        S = arrayList2;
                    }
                    x01.i.Companion.getClass();
                    d01.a aVar3 = new d01.a(arrayList);
                    h2Var.v = 1;
                    if (this.s.c(aVar3, h2Var) == aVar) {
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
        h2Var = new h2(this, cVar);
        Object obj22 = h2Var.u;
        b71.a aVar4 = b71.a.r;
        i = h2Var.v;
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
        j2 j2Var;
        int i;
        if (cVar instanceof j2) {
            j2Var = (j2) cVar;
            int i2 = j2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = j2Var.u;
                b71.a aVar = b71.a.r;
                i = j2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ArrayList M = m7.y.M((ad) obj);
                    j2Var.v = 1;
                    if (this.s.c(M, j2Var) == aVar) {
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
        j2Var = new j2(this, cVar);
        Object obj22 = j2Var.u;
        b71.a aVar2 = b71.a.r;
        i = j2Var.v;
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
        l2 l2Var;
        int i;
        oj0.v3 v3Var;
        g70 g70Var;
        if (cVar instanceof l2) {
            l2Var = (l2) cVar;
            int i2 = l2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = l2Var.u;
                b71.a aVar = b71.a.r;
                i = l2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    f70 f70Var = ((e70) obj).a;
                    List<wk0.h> list = (f70Var == null || (g70Var = f70Var.a) == null) ? null : g70Var.c.a.a;
                    if (list == null) {
                        list = x61.r.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (wk0.h hVar : list) {
                        SimpleRepository Z = (hVar == null || (v3Var = hVar.c) == null) ? null : b91.g.Z(v3Var);
                        if (Z != null) {
                            arrayList.add(Z);
                        }
                    }
                    l2Var.v = 1;
                    if (this.s.c(arrayList, l2Var) == aVar) {
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
        l2Var = new l2(this, cVar);
        Object obj22 = l2Var.u;
        b71.a aVar2 = b71.a.r;
        i = l2Var.v;
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
        q2 q2Var;
        int i;
        Object obj2;
        kd kdVar;
        hd hdVar;
        fd fdVar;
        gd gdVar;
        if (cVar instanceof q2) {
            q2Var = (q2) cVar;
            int i2 = q2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q2Var.v = i2 - Integer.MIN_VALUE;
                Object obj3 = q2Var.u;
                b71.a aVar = b71.a.r;
                i = q2Var.v;
                if (i != 0) {
                    sy.y.j(obj3);
                    ld ldVar = ((ed) obj).a;
                    if (ldVar == null || (kdVar = ldVar.b) == null || (hdVar = kdVar.c) == null || (fdVar = hdVar.b) == null || (gdVar = fdVar.b) == null) {
                        obj2 = null;
                    } else {
                        String str = ldVar.a;
                        jd jdVar = gdVar.c;
                        if (jdVar != null) {
                            obj2 = new yz0.j1(jdVar.a, str);
                        } else {
                            id idVar = gdVar.b;
                            obj2 = idVar != null ? new yz0.h1(idVar.a, str) : yz0.k1.a;
                        }
                    }
                    if (obj2 != null) {
                        q2Var.v = 1;
                        if (this.s.c(obj2, q2Var) == aVar) {
                            return aVar;
                        }
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
        q2Var = new q2(this, cVar);
        Object obj32 = q2Var.u;
        b71.a aVar2 = b71.a.r;
        i = q2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:541:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v97, types: [b01.h] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        h0 h0Var;
        int i;
        j30 j30Var;
        j0 j0Var;
        int i2;
        c50 c50Var;
        k0 k0Var;
        int i3;
        Object bVar;
        g60 g60Var;
        l0 l0Var;
        int i4;
        yz0.a7 w;
        q90 q90Var;
        n0 n0Var;
        int i5;
        we0.b0 b0Var;
        o0 o0Var;
        int i6;
        kc0.k5 k5Var;
        we0.b0 b0Var2;
        p0 p0Var;
        int i7;
        ArrayList arrayList;
        kc0.a6 a6Var;
        kc0.z5 z5Var;
        x01.i iVar;
        kc0.a6 a6Var2;
        kc0.a6 a6Var3;
        yz0.w0 w0Var;
        q0 q0Var;
        int i8;
        ee eeVar;
        he heVar;
        ee eeVar2;
        he heVar2;
        ee eeVar3;
        he heVar3;
        u0 u0Var;
        int i9;
        v0 v0Var;
        int i10;
        a01.d dVar;
        kc0.e9 e9Var;
        int i12;
        String str;
        x61.r rVar;
        String str2;
        oe0.b bVar2;
        String str3;
        oe0.b bVar3;
        List<oe0.c> list;
        CheckStatusState checkStatusState;
        String str4;
        w0 w0Var2;
        int i13;
        z0 z0Var;
        int i14;
        kc0.h hVar;
        kc0.h hVar2;
        f1 f1Var;
        int i15;
        id0.d dVar2;
        h1 h1Var;
        int i16;
        kc0.o6 o6Var;
        k1 k1Var;
        int i17;
        gb gbVar;
        l1 l1Var;
        int i18;
        m1 m1Var;
        int i19;
        n1 n1Var;
        int i20;
        kc0.ga gaVar;
        kc0.da daVar;
        i2 i2Var;
        int i22;
        r2 r2Var;
        int i23;
        yd ydVar;
        zd zdVar;
        xd xdVar;
        switch (this.r) {
            case 0:
                if (cVar instanceof h0) {
                    h0Var = (h0) cVar;
                    int i24 = h0Var.v;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        h0Var.v = i24 - Integer.MIN_VALUE;
                        Object obj2 = h0Var.u;
                        b71.a aVar = b71.a.r;
                        i = h0Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            k30 k30Var = ((i30) obj).a;
                            if (k30Var == null || (j30Var = k30Var.a) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "unresolveReviewThread field null", null, null, null, null, null, 120);
                            }
                            yz0.g4 h = com.google.android.gms.internal.measurement.z3.h(j30Var.c);
                            h0Var.v = 1;
                            if (this.s.c(h, h0Var) == aVar) {
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
                h0Var = new h0(this, cVar);
                Object obj22 = h0Var.u;
                b71.a aVar2 = b71.a.r;
                i = h0Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof j0) {
                    j0Var = (j0) cVar;
                    int i25 = j0Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        j0Var.v = i25 - Integer.MIN_VALUE;
                        Object obj3 = j0Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = j0Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            b50 b50Var = ((z40) obj).a;
                            yz0.x2 j = (b50Var == null || (c50Var = b50Var.a) == null) ? null : v8.l0.j(c50Var.c);
                            if (j != null) {
                                j0Var.v = 1;
                                if (this.s.c(j, j0Var) == aVar3) {
                                    return aVar3;
                                }
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
                j0Var = new j0(this, cVar);
                Object obj32 = j0Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = j0Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof k0) {
                    k0Var = (k0) cVar;
                    int i26 = k0Var.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        k0Var.v = i26 - Integer.MIN_VALUE;
                        Object obj4 = k0Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = k0Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            h60 h60Var = ((f60) obj).a;
                            se0.c cVar2 = (h60Var == null || (g60Var = h60Var.a) == null) ? null : g60Var.d;
                            if (cVar2 == null) {
                                yz0.s.Companion.getClass();
                                bVar = yz0.r.b;
                            } else {
                                bVar = new wl0.b(cVar2, h60Var.a.c, new yz0.d0(cVar2.b));
                            }
                            k0Var.v = 1;
                            if (this.s.c(bVar, k0Var) == aVar4) {
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
                k0Var = new k0(this, cVar);
                Object obj42 = k0Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = k0Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof l0) {
                    l0Var = (l0) cVar;
                    int i27 = l0Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        l0Var.v = i27 - Integer.MIN_VALUE;
                        Object obj5 = l0Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = l0Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            r90 r90Var = ((p90) obj).a;
                            wi0.c cVar3 = (r90Var == null || (q90Var = r90Var.a) == null) ? null : q90Var.c;
                            if (cVar3 == null) {
                                yz0.s.Companion.getClass();
                                w = new yz0.a7(yz0.r.b, false, TimelineItem$TimelinePullRequestReview$ReviewState.UNKNOWN);
                            } else {
                                w = b31.b.w(cVar3);
                            }
                            l0Var.v = 1;
                            if (this.s.c(w, l0Var) == aVar5) {
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
                l0Var = new l0(this, cVar);
                Object obj52 = l0Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = l0Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof n0) {
                    n0Var = (n0) cVar;
                    int i28 = n0Var.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        n0Var.v = i28 - Integer.MIN_VALUE;
                        Object obj6 = n0Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = n0Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj6);
                            kc0.p5 p5Var = ((kc0.o5) obj).a;
                            yz0.u0 M = (p5Var == null || (b0Var = p5Var.c) == null) ? null : com.google.android.gms.internal.measurement.z3.M(b0Var);
                            if (M != null) {
                                n0Var.v = 1;
                                if (this.s.c(M, n0Var) == aVar6) {
                                    return aVar6;
                                }
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
                n0Var = new n0(this, cVar);
                Object obj62 = n0Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = n0Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof o0) {
                    o0Var = (o0) cVar;
                    int i29 = o0Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        o0Var.v = i29 - Integer.MIN_VALUE;
                        Object obj7 = o0Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = o0Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj7);
                            kc0.l5 l5Var = ((kc0.j5) obj).a;
                            yz0.u0 M2 = (l5Var == null || (k5Var = l5Var.b) == null || (b0Var2 = k5Var.c) == null) ? null : com.google.android.gms.internal.measurement.z3.M(b0Var2);
                            if (M2 != null) {
                                o0Var.v = 1;
                                if (this.s.c(M2, o0Var) == aVar7) {
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
                o0Var = new o0(this, cVar);
                Object obj72 = o0Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = o0Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof p0) {
                    p0Var = (p0) cVar;
                    int i30 = p0Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        p0Var.v = i30 - Integer.MIN_VALUE;
                        Object obj8 = p0Var.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = p0Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj8);
                            kc0.u5 u5Var = (kc0.u5) obj;
                            kc0.z5 z5Var2 = u5Var.a;
                            String str5 = null;
                            kc0.b6 b6Var = z5Var2 != null ? z5Var2.c : null;
                            x61.r<kc0.y5> rVar2 = x61.r.r;
                            if (b6Var != null) {
                                java.util.ArrayList r2 = (java.util.ArrayList) (z5Var2.c.a.b);
                                if (r2 != 0) {
                                    rVar2 = r2;
                                }
                                arrayList = new ArrayList();
                                for (kc0.x5 x5Var : rVar2) {
                                    yz0.j4 t0 = x5Var != null ? com.google.android.gms.internal.measurement.i4.t0(x5Var.b.c) : null;
                                    if (t0 != null) {
                                        arrayList.add(t0);
                                    }
                                }
                            } else {
                                if ((z5Var2 != null ? z5Var2.d : null) != null) {
                                    kc0.v5 v5Var = z5Var2.d.a;
                                    x61.r rVar3 = (v5Var == null || (a6Var = v5Var.b) == null) ? null : a6Var.a.b;
                                    if (rVar3 != null) {
                                        rVar2 = rVar3;
                                    }
                                    arrayList = new ArrayList();
                                    for (kc0.y5 y5Var : rVar2) {
                                        yz0.j4 t02 = y5Var != null ? com.google.android.gms.internal.measurement.i4.t0(y5Var.c) : null;
                                        if (t02 != null) {
                                            arrayList.add(t02);
                                        }
                                    }
                                }
                                z5Var = u5Var.a;
                                if ((z5Var == null ? z5Var.c : null) == null) {
                                    kc0.e6 e6Var = z5Var.c.a.a;
                                    iVar = new x01.i(e6Var.b, e6Var.a, false);
                                } else if ((z5Var != null ? z5Var.d : null) != null) {
                                    kc0.v5 v5Var2 = z5Var.d.a;
                                    boolean z = (v5Var2 == null || (a6Var3 = v5Var2.b) == null) ? false : a6Var3.a.a.a;
                                    if (v5Var2 != null && (a6Var2 = v5Var2.b) != null) {
                                        str5 = a6Var2.a.a.b;
                                    }
                                    iVar = new x01.i(str5, z, false);
                                } else {
                                    iVar = new x01.i(null, false, false);
                                }
                                w0Var = new yz0.w0(rVar2, iVar);
                                p0Var.v = 1;
                                if (this.s.c(w0Var, p0Var) == aVar8) {
                                    return aVar8;
                                }
                            }
                            rVar2 = arrayList;
                            z5Var = u5Var.a;
                            if ((z5Var == null ? z5Var.c : null) == null) {
                            }
                            w0Var = new yz0.w0(rVar2, iVar);
                            p0Var.v = 1;
                            if (this.s.c(w0Var, p0Var) == aVar8) {
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
                p0Var = new p0(this, cVar);
                Object obj82 = p0Var.u;
                b71.a aVar82 = b71.a.r;
                i7 = p0Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof q0) {
                    q0Var = (q0) cVar;
                    int i32 = q0Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        q0Var.v = i32 - Integer.MIN_VALUE;
                        Object obj9 = q0Var.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = q0Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj9);
                            de deVar = (de) obj;
                            je jeVar = deVar.a;
                            String str6 = null;
                            List<ge> list2 = (jeVar == null || (eeVar3 = jeVar.b) == null || (heVar3 = eeVar3.b) == null) ? null : heVar3.b.b;
                            if (list2 == null) {
                                list2 = x61.r.r;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (ge geVar : list2) {
                                yz0.j4 t03 = geVar != null ? com.google.android.gms.internal.measurement.i4.t0(geVar.c) : null;
                                if (t03 != null) {
                                    arrayList2.add(t03);
                                }
                            }
                            je jeVar2 = deVar.a;
                            boolean z2 = (jeVar2 == null || (eeVar2 = jeVar2.b) == null || (heVar2 = eeVar2.b) == null) ? false : heVar2.b.a.a;
                            if (jeVar2 != null && (eeVar = jeVar2.b) != null && (heVar = eeVar.b) != null) {
                                str6 = heVar.b.a.b;
                            }
                            yz0.w0 w0Var3 = new yz0.w0(arrayList2, new x01.i(str6, z2, false));
                            q0Var.v = 1;
                            if (this.s.c(w0Var3, q0Var) == aVar9) {
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
                q0Var = new q0(this, cVar);
                Object obj92 = q0Var.u;
                b71.a aVar92 = b71.a.r;
                i8 = q0Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof u0) {
                    u0Var = (u0) cVar;
                    int i33 = u0Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        u0Var.v = i33 - Integer.MIN_VALUE;
                        Object obj10 = u0Var.u;
                        b71.a aVar10 = b71.a.r;
                        i9 = u0Var.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i9 != 0) {
                            sy.y.j(obj10);
                            u0Var.v = 1;
                            if (this.s.c(a0Var, u0Var) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return a0Var;
                    }
                }
                u0Var = new u0(this, cVar);
                Object obj102 = u0Var.u;
                b71.a aVar102 = b71.a.r;
                i9 = u0Var.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i9 != 0) {
                }
                return a0Var2;
            case 9:
                if (cVar instanceof v0) {
                    v0Var = (v0) cVar;
                    int i34 = v0Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        v0Var.v = i34 - Integer.MIN_VALUE;
                        Object obj11 = v0Var.u;
                        b71.a aVar11 = b71.a.r;
                        i10 = v0Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj11);
                            kc0.d9 d9Var = ((kc0.y8) obj).a;
                            if (d9Var == null || (e9Var = d9Var.c) == null) {
                                dVar = null;
                            } else {
                                String str7 = e9Var.a;
                                String str8 = e9Var.b;
                                CheckStatusState n = sy.u.n(e9Var.c);
                                kc0.h9 h9Var = e9Var.d;
                                String str9 = h9Var.b;
                                String str10 = h9Var.c;
                                com.github.service.models.response.a d = aa1.b.d(h9Var.a.b);
                                kc0.x8 x8Var = e9Var.e;
                                com.github.service.models.response.a d2 = aa1.b.d(x8Var != null ? x8Var.c : null);
                                kc0.j9 j9Var = e9Var.f;
                                if (j9Var == null) {
                                    throw new IllegalStateException("WorkFlowRun information can't be null");
                                }
                                String str11 = j9Var.a;
                                String str12 = j9Var.b;
                                int i35 = j9Var.c;
                                String str13 = j9Var.d.a;
                                List list3 = j9Var.e.a;
                                x61.r rVar4 = x61.r.r;
                                if (list3 == null) {
                                    list3 = rVar4;
                                }
                                ArrayList S = x61.m.S(list3);
                                ArrayList arrayList3 = new ArrayList(x61.n.F(S, 10));
                                int size = S.size();
                                int i36 = 0;
                                while (i36 < size) {
                                    Object obj12 = S.get(i36);
                                    int i37 = i36 + 1;
                                    ArrayList arrayList4 = S;
                                    of0.f fVar = ((kc0.a9) obj12).b;
                                    boolean z3 = fVar.a;
                                    int i38 = size;
                                    of0.a aVar12 = fVar.b;
                                    String str14 = str7;
                                    String str15 = aVar12.a;
                                    String str16 = aVar12.b;
                                    List list4 = fVar.c.a;
                                    if (list4 == null) {
                                        list4 = rVar4;
                                    }
                                    ArrayList S2 = x61.m.S(list4);
                                    String str17 = str8;
                                    ArrayList arrayList5 = new ArrayList();
                                    CheckStatusState checkStatusState2 = n;
                                    int size2 = S2.size();
                                    String str18 = str9;
                                    int i39 = 0;
                                    while (i39 < size2) {
                                        Object obj13 = S2.get(i39);
                                        i39++;
                                        ArrayList arrayList6 = S2;
                                        of0.b bVar4 = (of0.b) obj13;
                                        int i40 = size2;
                                        of0.c cVar4 = bVar4.c;
                                        if (cVar4 != null) {
                                            str4 = cVar4.a;
                                        } else {
                                            of0.d dVar3 = bVar4.b;
                                            str4 = dVar3 != null ? dVar3.a : null;
                                        }
                                        if (str4 != null) {
                                            arrayList5.add(str4);
                                        }
                                        size2 = i40;
                                        S2 = arrayList6;
                                    }
                                    arrayList3.add(new a01.c(str15, str16, arrayList5, z3));
                                    i36 = i37;
                                    S = arrayList4;
                                    size = i38;
                                    str7 = str14;
                                    str8 = str17;
                                    n = checkStatusState2;
                                    str9 = str18;
                                }
                                String str19 = str7;
                                String str20 = str8;
                                CheckStatusState checkStatusState3 = n;
                                String str21 = str9;
                                a01.f fVar2 = new a01.f(i35, str11, str12, str13, arrayList3);
                                kc0.v8 v8Var = e9Var.g;
                                List list5 = v8Var != null ? v8Var.a : null;
                                if (list5 == null) {
                                    list5 = rVar4;
                                }
                                ArrayList S3 = x61.m.S(list5);
                                ArrayList arrayList7 = new ArrayList(x61.n.F(S3, 10));
                                int size3 = S3.size();
                                int i42 = 0;
                                while (i42 < size3) {
                                    Object obj14 = S3.get(i42);
                                    int i43 = i42 + 1;
                                    oe0.f fVar3 = ((kc0.b9) obj14).c;
                                    String str22 = fVar3.c;
                                    String str23 = fVar3.a;
                                    CheckStatusState n2 = sy.u.n(fVar3.b);
                                    gn0.l2 l2Var = fVar3.d;
                                    CheckConclusionState u = l2Var != null ? sy.t.u(l2Var) : null;
                                    String str24 = fVar3.e;
                                    ArrayList arrayList8 = S3;
                                    oe0.e eVar = fVar3.g;
                                    int i44 = size3;
                                    int i45 = eVar != null ? eVar.a : 0;
                                    if (eVar == null || (list = eVar.b) == null) {
                                        i12 = i43;
                                        str = str22;
                                        rVar = rVar4;
                                    } else {
                                        i12 = i43;
                                        str = str22;
                                        ArrayList arrayList9 = new ArrayList(x61.n.F(list, 10));
                                        for (oe0.c cVar5 : list) {
                                            oe0.d dVar4 = cVar5 != null ? cVar5.b : null;
                                            if (dVar4 == null || (checkStatusState = sy.u.n(dVar4.a)) == null) {
                                                checkStatusState = CheckStatusState.UNKNOWN__;
                                            }
                                            arrayList9.add(new a01.b(checkStatusState));
                                        }
                                        rVar = arrayList9;
                                    }
                                    oe0.a aVar13 = fVar3.f;
                                    if (aVar13 == null || (bVar3 = aVar13.a) == null || (str3 = bVar3.a) == null) {
                                        if (aVar13 == null || (bVar2 = aVar13.a) == null) {
                                            str2 = null;
                                            arrayList7.add(new a01.a(str, str23, n2, u, str24, i45, rVar, str2));
                                            S3 = arrayList8;
                                            size3 = i44;
                                            i42 = i12;
                                        } else {
                                            str3 = bVar2.b;
                                        }
                                    }
                                    str2 = str3;
                                    arrayList7.add(new a01.a(str, str23, n2, u, str24, i45, rVar, str2));
                                    S3 = arrayList8;
                                    size3 = i44;
                                    i42 = i12;
                                }
                                kc0.z8 z8Var = e9Var.h;
                                List list6 = z8Var != null ? z8Var.a : null;
                                if (list6 == null) {
                                    list6 = rVar4;
                                }
                                ArrayList S4 = x61.m.S(list6);
                                ArrayList arrayList10 = new ArrayList(x61.n.F(S4, 10));
                                int size4 = S4.size();
                                int i46 = 0;
                                while (i46 < size4) {
                                    Object obj15 = S4.get(i46);
                                    i46++;
                                    ri0.e eVar2 = ((kc0.c9) obj15).c;
                                    ri0.p2 p2Var = eVar2.e;
                                    String str25 = p2Var.b;
                                    ri0.n2 n2Var = p2Var.m;
                                    ArrayList arrayList11 = S4;
                                    String str26 = n2Var.b;
                                    ArrayList arrayList12 = arrayList7;
                                    String str27 = p2Var.n;
                                    String str28 = p2Var.d;
                                    int i47 = p2Var.f;
                                    yz0.d3 d3Var = new yz0.d3(n2Var.e.b, str26);
                                    ZonedDateTime zonedDateTime = eVar2.b;
                                    if (zonedDateTime == null) {
                                        zonedDateTime = p2Var.g;
                                    }
                                    ZonedDateTime zonedDateTime2 = zonedDateTime;
                                    PullRequestState p = t.z.p(eVar2.c);
                                    List list7 = p2Var.r.a;
                                    if (list7 == null) {
                                        list7 = rVar4;
                                    }
                                    ArrayList S5 = x61.m.S(list7);
                                    ArrayList arrayList13 = new ArrayList(x61.n.F(S5, 10));
                                    int size5 = S5.size();
                                    int i48 = 0;
                                    while (i48 < size5) {
                                        Object obj16 = S5.get(i48);
                                        i48++;
                                        int i49 = size5;
                                        ri0.o2 o2Var = ((ri0.k2) obj16).b.b;
                                        arrayList13.add(o2Var != null ? sy.q.o(o2Var.b) : null);
                                        size5 = i49;
                                    }
                                    StatusState statusState = (StatusState) x61.m.W(arrayList13);
                                    if (statusState == null) {
                                        statusState = StatusState.UNKNOWN__;
                                    }
                                    arrayList10.add(new a01.e(str25, str27, str28, i47, d3Var, str26, zonedDateTime2, p, statusState));
                                    S4 = arrayList11;
                                    arrayList7 = arrayList12;
                                }
                                dVar = new a01.d(str19, str20, checkStatusState3, str21, str10, d, d2, fVar2, arrayList7, arrayList10);
                            }
                            if (dVar != null) {
                                v0Var.v = 1;
                                if (this.s.c(dVar, v0Var) == aVar11) {
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
                v0Var = new v0(this, cVar);
                Object obj112 = v0Var.u;
                b71.a aVar112 = b71.a.r;
                i10 = v0Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof w0) {
                    w0Var2 = (w0) cVar;
                    int i50 = w0Var2.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        w0Var2.v = i50 - Integer.MIN_VALUE;
                        Object obj17 = w0Var2.u;
                        b71.a aVar14 = b71.a.r;
                        i13 = w0Var2.v;
                        w61.a0 a0Var3 = w61.a0.a;
                        if (i13 != 0) {
                            sy.y.j(obj17);
                            w0Var2.v = 1;
                            if (this.s.c(a0Var3, w0Var2) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return a0Var3;
                    }
                }
                w0Var2 = new w0(this, cVar);
                Object obj172 = w0Var2.u;
                b71.a aVar142 = b71.a.r;
                i13 = w0Var2.v;
                w61.a0 a0Var32 = w61.a0.a;
                if (i13 != 0) {
                }
                return a0Var32;
            case 11:
                if (cVar instanceof z0) {
                    z0Var = (z0) cVar;
                    int i52 = z0Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        z0Var.v = i52 - Integer.MIN_VALUE;
                        Object obj18 = z0Var.u;
                        b71.a aVar15 = b71.a.r;
                        i14 = z0Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj18);
                            kc0.g gVar = ((kc0.k) obj).a;
                            aj0.c cVar6 = null;
                            se0.c cVar7 = (gVar == null || (hVar2 = gVar.a) == null) ? null : hVar2.d.j;
                            if (gVar != null && (hVar = gVar.a) != null) {
                                cVar6 = hVar.d.n;
                            }
                            aj0.c cVar8 = cVar6;
                            if (cVar7 == null || cVar8 == null) {
                                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", null, null, null, null, null, 120);
                            }
                            yf0.i iVar2 = gVar.a.d;
                            b01.g i53 = v8.l0.i(cVar7, iVar2.c, cVar8, (qh0.a) null, iVar2.d, iVar2.e, iVar2.f, false, (String) null, iVar2.m, false, false, v8.l0.T(iVar2), 14220);
                            z0Var.v = 1;
                            if (this.s.c(i53, z0Var) == aVar15) {
                                return aVar15;
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
                z0Var = new z0(this, cVar);
                Object obj182 = z0Var.u;
                b71.a aVar152 = b71.a.r;
                i14 = z0Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof f1) {
                    f1Var = (f1) cVar;
                    int i54 = f1Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        f1Var.v = i54 - Integer.MIN_VALUE;
                        Object obj19 = f1Var.u;
                        b71.a aVar16 = b71.a.r;
                        i15 = f1Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj19);
                            id0.a aVar17 = ((id0.c) obj).a;
                            b01.f j2 = (aVar17 == null || (dVar2 = aVar17.a) == null) ? null : y41.t1.j(dVar2.c);
                            if (j2 != null) {
                                f1Var.v = 1;
                                if (this.s.c(j2, f1Var) == aVar16) {
                                    return aVar16;
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
                f1Var = new f1(this, cVar);
                Object obj192 = f1Var.u;
                b71.a aVar162 = b71.a.r;
                i15 = f1Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof h1) {
                    h1Var = (h1) cVar;
                    int i55 = h1Var.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        h1Var.v = i55 - Integer.MIN_VALUE;
                        Object obj20 = h1Var.u;
                        b71.a aVar18 = b71.a.r;
                        i16 = h1Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj20);
                            kc0.m6 m6Var = ((kc0.n6) obj).a;
                            uf0.p0 p0Var2 = (m6Var == null || (o6Var = m6Var.a) == null) ? null : o6Var.c;
                            if (p0Var2 == null) {
                                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", null, null, null, null, null, 120);
                            }
                            b01.b i56 = y41.t1.i(p0Var2);
                            h1Var.v = 1;
                            if (this.s.c(i56, h1Var) == aVar18) {
                                return aVar18;
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
                h1Var = new h1(this, cVar);
                Object obj202 = h1Var.u;
                b71.a aVar182 = b71.a.r;
                i16 = h1Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof k1) {
                    k1Var = (k1) cVar;
                    int i57 = k1Var.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        k1Var.v = i57 - Integer.MIN_VALUE;
                        Object obj21 = k1Var.u;
                        b71.a aVar19 = b71.a.r;
                        i17 = k1Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj21);
                            fb fbVar = ((eb) obj).a;
                            uf0.p0 p0Var3 = (fbVar == null || (gbVar = fbVar.c) == null) ? null : gbVar.b;
                            if (p0Var3 == null) {
                                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", null, null, null, null, null, 120);
                            }
                            b01.b i58 = y41.t1.i(p0Var3);
                            k1Var.v = 1;
                            if (this.s.c(i58, k1Var) == aVar19) {
                                return aVar19;
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
                k1Var = new k1(this, cVar);
                Object obj212 = k1Var.u;
                b71.a aVar192 = b71.a.r;
                i17 = k1Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof l1) {
                    l1Var = (l1) cVar;
                    int i59 = l1Var.v;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        l1Var.v = i59 - Integer.MIN_VALUE;
                        Object obj23 = l1Var.u;
                        b71.a aVar20 = b71.a.r;
                        i18 = l1Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj23);
                            kc0.t9 t9Var = (kc0.t9) obj;
                            kc0.x9 x9Var = t9Var.a;
                            List list8 = x9Var != null ? x9Var.b.b : null;
                            if (list8 == null) {
                                list8 = x61.r.r;
                            }
                            ArrayList S6 = x61.m.S(list8);
                            ArrayList arrayList14 = new ArrayList(x61.n.F(S6, 10));
                            int size6 = S6.size();
                            int i60 = 0;
                            while (i60 < size6) {
                                Object obj24 = S6.get(i60);
                                i60++;
                                arrayList14.add(m7.y.i(((kc0.v9) obj24).c));
                            }
                            kc0.x9 x9Var2 = t9Var.a;
                            b01.d dVar5 = new b01.d(x9Var2 != null ? x9Var2.a : null, arrayList14, new x01.i(x9Var2 != null ? x9Var2.b.a.b : null, x9Var2 != null ? x9Var2.b.a.a : false, false));
                            l1Var.v = 1;
                            if (this.s.c(dVar5, l1Var) == aVar20) {
                                return aVar20;
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
                l1Var = new l1(this, cVar);
                Object obj232 = l1Var.u;
                b71.a aVar202 = b71.a.r;
                i18 = l1Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof m1) {
                    m1Var = (m1) cVar;
                    int i62 = m1Var.v;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        m1Var.v = i62 - Integer.MIN_VALUE;
                        Object obj25 = m1Var.u;
                        b71.a aVar21 = b71.a.r;
                        i19 = m1Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj25);
                            kc0.ba baVar = ((kc0.aa) obj).a;
                            b01.e i63 = baVar != null ? m7.y.i(baVar.c) : null;
                            m1Var.v = 1;
                            if (this.s.c(i63, m1Var) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                        }
                        return w61.a0.a;
                    }
                }
                m1Var = new m1(this, cVar);
                Object obj252 = m1Var.u;
                b71.a aVar212 = b71.a.r;
                i19 = m1Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof n1) {
                    n1Var = (n1) cVar;
                    int i64 = n1Var.v;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        n1Var.v = i64 - Integer.MIN_VALUE;
                        Object obj26 = n1Var.u;
                        b71.a aVar22 = b71.a.r;
                        i20 = n1Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj26);
                            kc0.ia iaVar = ((kc0.fa) obj).a;
                            if (iaVar != null && (gaVar = iaVar.b) != null && (daVar = gaVar.b) != null) {
                                String str29 = daVar.a;
                                kc0.ha haVar = daVar.b;
                                r2 = new b01.h(str29, haVar != null ? haVar.a : null);
                            }
                            if (r2 != null) {
                                n1Var.v = 1;
                                if (this.s.c(r2, n1Var) == aVar22) {
                                    return aVar22;
                                }
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return w61.a0.a;
                    }
                }
                n1Var = new n1(this, cVar);
                Object obj262 = n1Var.u;
                b71.a aVar222 = b71.a.r;
                i20 = n1Var.v;
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
                if (cVar instanceof i2) {
                    i2Var = (i2) cVar;
                    int i65 = i2Var.v;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        i2Var.v = i65 - Integer.MIN_VALUE;
                        Object obj27 = i2Var.u;
                        b71.a aVar23 = b71.a.r;
                        i22 = i2Var.v;
                        if (i22 != 0) {
                            sy.y.j(obj27);
                            ArrayList M3 = m7.y.M((ad) obj);
                            i2Var.v = 1;
                            if (this.s.c(M3, i2Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                i2Var = new i2(this, cVar);
                Object obj272 = i2Var.u;
                b71.a aVar232 = b71.a.r;
                i22 = i2Var.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
            case 26:
                return i(cVar, obj);
            case 27:
                return j(cVar, obj);
            case 28:
                return k(cVar, obj);
            default:
                if (cVar instanceof r2) {
                    r2Var = (r2) cVar;
                    int i66 = r2Var.v;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        r2Var.v = i66 - Integer.MIN_VALUE;
                        Object obj28 = r2Var.u;
                        b71.a aVar24 = b71.a.r;
                        i23 = r2Var.v;
                        if (i23 != 0) {
                            sy.y.j(obj28);
                            ae aeVar = ((wd) obj).a;
                            String str30 = (aeVar == null || (ydVar = aeVar.b) == null || (zdVar = ydVar.c) == null || (xdVar = zdVar.b) == null) ? null : xdVar.a;
                            Boolean valueOf = Boolean.valueOf(!(str30 == null || str30.length() == 0));
                            r2Var.v = 1;
                            if (this.s.c(valueOf, r2Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                        }
                        return w61.a0.a;
                    }
                }
                r2Var = new r2(this, cVar);
                Object obj282 = r2Var.u;
                b71.a aVar242 = b71.a.r;
                i23 = r2Var.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
        }
    }
}
