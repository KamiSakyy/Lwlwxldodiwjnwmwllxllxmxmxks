package sy;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.InteractionType;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.MergeStateStatus;
import com.google.android.gms.internal.measurement.i4;
import gn0.fc;
import gn0.gg;
import hc0.zm;
import is.i1;
import java.util.ArrayList;
import java.util.List;
import jo.te0;
import jo.ve0;
import jo.we0;
import jo.xe0;
import jo.ye0;
import kc0.pg;
import kc0.qg;
import kotlin.NoWhenBranchMatchedException;
import m10.b00;
import t00.f8;
import vo.g2;
import yz0.f4;
import yz0.q4;
import yz0.r3;
import yz0.r4;
import yz0.t3;
import yz0.x1;
import yz0.y7;
import yz0.z4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c0 {
    public static final b01.i b(is.r rVar) {
        ms.g gVar;
        is.o oVar = rVar.c;
        x61.r rVar2 = oVar.b;
        if (rVar2 == null) {
            rVar2 = x61.r.r;
        }
        ArrayList S = x61.m.S(rVar2);
        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            is.p pVar = (is.p) obj;
            ms.i iVar = pVar.c;
            ar.c cVar = iVar.j;
            String str = iVar.c;
            pv.c cVar2 = pVar.d;
            ju.a aVar = iVar.l;
            ms.o oVar2 = pVar.e;
            boolean z = iVar.d;
            boolean z2 = iVar.e;
            boolean z3 = iVar.f;
            boolean z4 = iVar.g;
            ArrayList arrayList2 = S;
            ms.h hVar = iVar.i;
            int i2 = size;
            String str2 = (hVar == null || (gVar = hVar.c) == null) ? null : gVar.b;
            boolean z5 = iVar.h != null;
            i1 i1Var = iVar.m;
            pu.a aVar2 = iVar.k;
            arrayList.add(d0.d(cVar, str, cVar2, aVar, oVar2, z, z2, z3, z4, str2, z5, i1Var, aVar2.b, aVar2.c, hVar != null ? hVar.b : false));
            S = arrayList2;
            size = i2;
        }
        wu.a aVar3 = oVar.a.b;
        boolean z6 = aVar3.a;
        String str3 = aVar3.b;
        if (str3 == null) {
            str3 = "";
        }
        return new b01.i(arrayList, new f4(str3, z6));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g01.a c(pg pgVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Boolean bool;
        Boolean bool2;
        com.github.service.models.response.a aVar;
        String str10;
        int i;
        int i2;
        int i3;
        qg qgVar;
        z4 z4Var;
        com.github.service.models.response.a aVar2;
        k71.k.g(pgVar, "<this>");
        qg qgVar2 = pgVar.a;
        boolean z = qgVar2.d;
        ArrayList arrayList = qgVar2.f.a;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            wk0.w wVar = (wk0.w) obj;
            com.github.service.models.response.a aVar3 = new com.github.service.models.response.a(qgVar2.c, b41.b.O(qgVar2.e), (String) null, false, (String) null, 60);
            k71.k.g(wVar, "<this>");
            wk0.p pVar = wVar.d;
            wk0.r rVar = pVar.c;
            wk0.s sVar = pVar.b;
            String str11 = "";
            if (rVar != null) {
                str2 = rVar.a;
            } else if (sVar != null) {
                str2 = sVar.a;
            } else {
                str = "";
                if (rVar == null) {
                    str4 = rVar.b;
                } else if (sVar != null) {
                    str4 = sVar.b;
                } else {
                    str3 = "";
                    if (rVar != null) {
                        str6 = rVar.c;
                    } else if (sVar != null) {
                        str6 = sVar.c;
                    } else {
                        str5 = "";
                        if (rVar == null) {
                            str8 = rVar.i.b;
                        } else if (sVar != null) {
                            str8 = sVar.k.b;
                        } else {
                            str7 = "";
                            if (rVar != null) {
                                str11 = rVar.i.c.c;
                            } else if (sVar != null) {
                                str11 = sVar.k.c.c;
                            }
                            String str12 = str11;
                            if (rVar != null || (bool2 = rVar.g) == null) {
                                if (sVar != null) {
                                    bool2 = sVar.h;
                                } else {
                                    str9 = str;
                                    bool = null;
                                    if (rVar == null) {
                                        i2 = rVar.d;
                                    } else if (sVar != null) {
                                        i2 = sVar.d;
                                    } else {
                                        aVar = aVar3;
                                        str10 = str3;
                                        i = 0;
                                        fc fcVar = wVar.a;
                                        x1 x1Var = InteractionType.Companion;
                                        String str13 = fcVar.r;
                                        x1Var.getClass();
                                        InteractionType a = x1.a(str13);
                                        wk0.o oVar = wVar.c;
                                        g01.c cVar = new g01.c(a, oVar != null ? oVar.b : null, b41.b.O(oVar != null ? oVar.d : null), wVar.b, aVar);
                                        String str14 = str5;
                                        com.github.service.models.response.a aVar4 = aVar;
                                        if (rVar != null) {
                                            i3 = rVar.f.a;
                                        } else if (sVar != null) {
                                            Integer num = sVar.e;
                                            i3 = num != null ? num.intValue() : sVar.g.a;
                                        } else {
                                            i3 = 0;
                                        }
                                        if (rVar != null) {
                                            String str15 = rVar.a;
                                            String str16 = rVar.b;
                                            int i5 = rVar.d;
                                            r01.e eVar = IssueState.Companion;
                                            String str17 = rVar.e.r;
                                            eVar.getClass();
                                            IssueState b = r01.e.b(str17);
                                            wk0.x xVar = rVar.i;
                                            qgVar = qgVar2;
                                            z4Var = new q4(str15, str16, i5, b, xVar.c.c, xVar.b, b31.b.d0(rVar.j));
                                        } else if (sVar != null) {
                                            String str18 = sVar.a;
                                            String str19 = sVar.b;
                                            boolean z2 = sVar.i;
                                            int i6 = sVar.d;
                                            PullRequestState p = t.z.p(sVar.f);
                                            wk0.y yVar = sVar.k;
                                            qgVar = qgVar2;
                                            z4 r4Var = new r4(str18, str19, z2, i6, p, yVar.c.c, yVar.b, sVar.l);
                                            aVar2 = aVar4;
                                            z4Var = r4Var;
                                            arrayList2.add(new g01.f(aVar2, str9, str10, str14, str7, str12, bool, i, cVar, i3, z4Var));
                                            qgVar2 = qgVar;
                                        } else {
                                            qgVar = qgVar2;
                                            z4Var = z4.t;
                                        }
                                        aVar2 = aVar4;
                                        arrayList2.add(new g01.f(aVar2, str9, str10, str14, str7, str12, bool, i, cVar, i3, z4Var));
                                        qgVar2 = qgVar;
                                    }
                                    aVar = aVar3;
                                    str10 = str3;
                                    i = i2;
                                    fc fcVar2 = wVar.a;
                                    x1 x1Var2 = InteractionType.Companion;
                                    String str132 = fcVar2.r;
                                    x1Var2.getClass();
                                    InteractionType a2 = x1.a(str132);
                                    wk0.o oVar2 = wVar.c;
                                    g01.c cVar2 = new g01.c(a2, oVar2 != null ? oVar2.b : null, b41.b.O(oVar2 != null ? oVar2.d : null), wVar.b, aVar);
                                    String str142 = str5;
                                    com.github.service.models.response.a aVar42 = aVar;
                                    if (rVar != null) {
                                    }
                                    if (rVar != null) {
                                    }
                                    aVar2 = aVar42;
                                    arrayList2.add(new g01.f(aVar2, str9, str10, str142, str7, str12, bool, i, cVar2, i3, z4Var));
                                    qgVar2 = qgVar;
                                }
                            }
                            str9 = str;
                            bool = bool2;
                            if (rVar == null) {
                            }
                            aVar = aVar3;
                            str10 = str3;
                            i = i2;
                            fc fcVar22 = wVar.a;
                            x1 x1Var22 = InteractionType.Companion;
                            String str1322 = fcVar22.r;
                            x1Var22.getClass();
                            InteractionType a22 = x1.a(str1322);
                            wk0.o oVar22 = wVar.c;
                            g01.c cVar22 = new g01.c(a22, oVar22 != null ? oVar22.b : null, b41.b.O(oVar22 != null ? oVar22.d : null), wVar.b, aVar);
                            String str1422 = str5;
                            com.github.service.models.response.a aVar422 = aVar;
                            if (rVar != null) {
                            }
                            if (rVar != null) {
                            }
                            aVar2 = aVar422;
                            arrayList2.add(new g01.f(aVar2, str9, str10, str1422, str7, str12, bool, i, cVar22, i3, z4Var));
                            qgVar2 = qgVar;
                        }
                        str7 = str8;
                        if (rVar != null) {
                        }
                        String str122 = str11;
                        if (rVar != null) {
                        }
                        if (sVar != null) {
                        }
                    }
                    str5 = str6;
                    if (rVar == null) {
                    }
                    str7 = str8;
                    if (rVar != null) {
                    }
                    String str1222 = str11;
                    if (rVar != null) {
                    }
                    if (sVar != null) {
                    }
                }
                str3 = str4;
                if (rVar != null) {
                }
                str5 = str6;
                if (rVar == null) {
                }
                str7 = str8;
                if (rVar != null) {
                }
                String str12222 = str11;
                if (rVar != null) {
                }
                if (sVar != null) {
                }
            }
            str = str2;
            if (rVar == null) {
            }
            str3 = str4;
            if (rVar != null) {
            }
            str5 = str6;
            if (rVar == null) {
            }
            str7 = str8;
            if (rVar != null) {
            }
            String str122222 = str11;
            if (rVar != null) {
            }
            if (sVar != null) {
            }
        }
        return new g01.a(arrayList2, z);
    }

    public static final y7 d(ve0 ve0Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        yz0.q bVar;
        xe0 xe0Var;
        xe0 xe0Var2;
        te0 te0Var;
        xe0 xe0Var3;
        xe0 xe0Var4;
        we0 we0Var;
        xe0 xe0Var5;
        xe0 xe0Var6;
        xe0 xe0Var7;
        xe0 xe0Var8;
        k71.k.g(ve0Var, "<this>");
        ye0 ye0Var = ve0Var.a;
        String str = "";
        String str2 = (ye0Var == null || (xe0Var8 = ye0Var.b) == null) ? "" : xe0Var8.b;
        ar.c cVar = null;
        b00 b00Var = (ye0Var == null || (xe0Var7 = ye0Var.b) == null) ? null : xe0Var7.d;
        int i = b00Var == null ? -1 : b0.a[b00Var.ordinal()];
        if (i == -1) {
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        } else if (i == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
        } else if (i == 2) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
        } else if (i == 3) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        List f = m71.a.f((ye0Var == null || (xe0Var6 = ye0Var.b) == null) ? null : xe0Var6.h);
        List P = i4.P((ye0Var == null || (xe0Var5 = ye0Var.b) == null) ? null : xe0Var5.i);
        fz.g g = k21.f.g((ye0Var == null || (xe0Var4 = ye0Var.b) == null || (we0Var = xe0Var4.e) == null) ? null : we0Var.c);
        if (ye0Var != null && (xe0Var3 = ye0Var.b) != null) {
            cVar = xe0Var3.j;
        }
        if (cVar == null) {
            yz0.s.Companion.getClass();
            bVar = yz0.r.b;
        } else {
            xe0 xe0Var9 = ye0Var.b;
            bVar = new fz.b(cVar, xe0Var9.c, new yz0.b0(xe0Var9.b));
        }
        if (ye0Var != null && (te0Var = ye0Var.a) != null) {
            str = te0Var.b;
        }
        return new y7(str2, issueOrPullRequestState, f, P, x61.r.r, g, bVar, new com.github.service.models.response.a(str, (Avatar) null, (String) null, false, (String) null, 62), new ArrayList(), (ye0Var == null || (xe0Var2 = ye0Var.b) == null || !xe0Var2.f) ? false : true, (ye0Var == null || (xe0Var = ye0Var.b) == null || !xe0Var.g) ? false : true);
    }

    public static final mn.p e(g2 g2Var) {
        k71.k.g(g2Var, "<this>");
        mn.o oVar = mn.p.Companion;
        List list = g2Var.a;
        String str = g2Var.e;
        String str2 = g2Var.b;
        boolean z = g2Var.c;
        String str3 = g2Var.f;
        mn.q valueOf = mn.q.valueOf(g2Var.d.name());
        oVar.getClass();
        return mn.o.a(list, str2, z, str3, valueOf, str);
    }

    public static final ArrayList f(i80.c cVar, String str) {
        k71.k.g(str, "subjectId");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<i80.a> list = cVar != null ? cVar.d : null;
        if (list == null) {
            list = x61.r.r;
        }
        for (i80.a aVar : list) {
            zm zmVar = aVar.d;
            int i = aVar.c.b;
            String str2 = zmVar.r;
            t3 t3Var = t3.c;
            if (!k71.k.b(str2, "CONFUSED")) {
                t3Var = t3.d;
                if (!k71.k.b(str2, "EYES")) {
                    t3Var = t3.e;
                    if (!k71.k.b(str2, "HEART")) {
                        t3Var = t3.f;
                        if (!k71.k.b(str2, "HOORAY")) {
                            t3Var = t3.g;
                            if (!k71.k.b(str2, "LAUGH")) {
                                t3Var = t3.h;
                                if (!k71.k.b(str2, "ROCKET")) {
                                    t3Var = t3.i;
                                    if (!k71.k.b(str2, "THUMBS_DOWN")) {
                                        t3Var = t3.j;
                                        if (!k71.k.b(str2, "THUMBS_UP")) {
                                            t3Var = t3.k;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            r3 r3Var = new r3(t3Var, str, i, aVar.b);
            arrayList2.add(r3Var);
            if (i > 0) {
                arrayList.add(r3Var);
            }
        }
        return x61.m.l0(d0.b(new yz0.b(arrayList2)), arrayList);
    }

    public static final void g(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(jo.f4.h(i, i2, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static final f8 j() {
        return new f8(new do0.m(2, (a71.c) null, 11));
    }

    public static final MergeStateStatus o(gg ggVar) {
        switch (ggVar.ordinal()) {
            case 0:
                return MergeStateStatus.BEHIND;
            case 1:
                return MergeStateStatus.BLOCKED;
            case 2:
                return MergeStateStatus.CLEAN;
            case 3:
                return MergeStateStatus.DIRTY;
            case 4:
                return MergeStateStatus.DRAFT;
            case 5:
                return MergeStateStatus.HAS_HOOKS;
            case 6:
                return MergeStateStatus.UNKNOWN;
            case 7:
                return MergeStateStatus.UNSTABLE;
            case 8:
                return MergeStateStatus.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final double p(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static final String q(int i, long j) {
        if (j >= 0) {
            r.m(i);
            String l = Long.toString(j, i);
            k71.k.f(l, "toString(...)");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        r.m(i);
        String l2 = Long.toString(j3, i);
        k71.k.f(l2, "toString(...)");
        r.m(i);
        String l3 = Long.toString(j4, i);
        k71.k.f(l3, "toString(...)");
        return l2.concat(l3);
    }

    public abstract v8.w h(Context context, String str, WorkerParameters workerParameters);

    public v8.w i(Context context, String str, WorkerParameters workerParameters) {
        k71.k.g(context, "appContext");
        k71.k.g(str, "workerClassName");
        k71.k.g(workerParameters, "workerParameters");
        v8.w h = h(context, str, workerParameters);
        if (h == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(str).asSubclass(v8.w.class);
                k71.k.d(asSubclass);
                try {
                    Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    k71.k.d(newInstance);
                    h = (v8.w) newInstance;
                } finally {
                }
            } finally {
            }
        }
        if (!h.d) {
            return h;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }

    public abstract androidx.lifecycle.b k();

    public void l() {
    }

    public abstract void m();

    public abstract xz0.c n(q81.a0 a0Var);
}
