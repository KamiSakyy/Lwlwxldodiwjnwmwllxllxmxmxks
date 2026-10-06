package sy;

import a0.s0;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.a1;
import androidx.lifecycle.p0;
import ap0.a2;
import ap0.a6;
import ap0.e1;
import ap0.g1;
import ap0.j5;
import ap0.m2;
import ap0.o0;
import ap0.q1;
import ap0.s5;
import ap0.u0;
import ap0.u2;
import ap0.v0;
import ap0.y2;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.DiffSide;
import com.github.service.models.response.type.ReviewDecision;
import com.github.service.models.response.type.StatusState;
import com.github.service.models.response.type.SubscriptionState;
import com.google.android.gms.internal.measurement.i4;
import gn0.u8;
import hc0.ev;
import hc0.nl;
import hc0.z5;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import jo.fd0;
import jo.hd0;
import jo.id0;
import jo.jd0;
import jo.kd0;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import m10.wi;
import wy0.z7;
import yz0.d3;
import yz0.j3;
import yz0.w7;
import z70.b2;
import z70.g2;
import z70.h2;
import z70.j2;
import z70.k2;
import z70.l2;
import z70.q7;
import z70.r7;
import z70.s7;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class y {
    public static final void a(Logger logger, t81.a aVar, t81.c cVar, String str) {
        logger.fine(cVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r6.j(r7, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(com.github.service.wrapper.b bVar, j71.c cVar, c71.c cVar2) {
        z7 z7Var;
        int i;
        dw0.f fVar;
        if (cVar2 instanceof z7) {
            z7Var = (z7) cVar2;
            int i2 = z7Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z7Var.x = i2 - Integer.MIN_VALUE;
                Object obj = z7Var.w;
                b71.a aVar = b71.a.r;
                i = z7Var.x;
                if (i != 0) {
                    j(obj);
                    dw0.i iVar = new dw0.i();
                    z7Var.u = bVar;
                    z7Var.v = cVar;
                    z7Var.x = 1;
                    obj = bVar.f(iVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j(obj);
                        return w61.a0.a;
                    }
                    cVar = z7Var.v;
                    bVar = z7Var.u;
                    j(obj);
                }
                fVar = (dw0.f) obj;
                if (fVar != null) {
                    dw0.h hVar = fVar.a;
                    dw0.f fVar2 = new dw0.f(new dw0.h(hVar.a, new dw0.g(((Number) cVar.k(new Integer(hVar.b.a))).intValue()), hVar.c), fVar.b, fVar.c);
                    dw0.i iVar2 = new dw0.i();
                    z7Var.u = null;
                    z7Var.v = null;
                    z7Var.x = 2;
                }
                return w61.a0.a;
            }
        }
        z7Var = new z7(cVar2);
        Object obj2 = z7Var.w;
        b71.a aVar2 = b71.a.r;
        i = z7Var.x;
        if (i != 0) {
        }
        fVar = (dw0.f) obj2;
        if (fVar != null) {
        }
        return w61.a0.a;
    }

    public static final t10.h c(o0 o0Var) {
        ap0.o oVar = o0Var.b;
        x61.r rVar = x61.r.r;
        if (oVar != null) {
            return new t10.b(oVar.b, oVar.c, oVar.d, k41.b.e(oVar.a.c), vo0.a.a(oVar.f.c), oVar.e, rVar);
        }
        ap0.y yVar = o0Var.c;
        if (yVar != null) {
            return new t10.c(yVar.b, yVar.c, yVar.d, k41.b.e(yVar.a.c), vo0.a.g(yVar.e.c), rVar);
        }
        v0 v0Var = o0Var.d;
        if (v0Var != null) {
            String str = v0Var.d;
            ZonedDateTime zonedDateTime = v0Var.b;
            u0 u0Var = v0Var.f;
            y2 y2Var = u0Var.b;
            if (y2Var != null) {
                return new t10.n(zonedDateTime, v0Var.c, str, vo0.a.e(y2Var), rVar);
            }
            u2 u2Var = u0Var.c;
            if (u2Var != null) {
                return new t10.m(zonedDateTime, v0Var.c, str, vo0.a.d(u2Var), rVar);
            }
            return null;
        }
        g1 g1Var = o0Var.e;
        if (g1Var != null) {
            String str2 = g1Var.d;
            ZonedDateTime zonedDateTime2 = g1Var.b;
            e1 e1Var = g1Var.e;
            u2 u2Var2 = e1Var.c;
            y2 y2Var2 = e1Var.b;
            a6 a6Var = g1Var.f.c;
            if (y2Var2 != null) {
                return new t10.w(zonedDateTime2, g1Var.c, str2, new com.github.service.models.response.a(a6Var.c, m7.y.L(a6Var.e), (String) null, false, (String) null, 60), vo0.a.e(y2Var2), rVar);
            }
            if (u2Var2 != null) {
                return new t10.v(zonedDateTime2, g1Var.c, str2, new com.github.service.models.response.a(a6Var.c, m7.y.L(a6Var.e), (String) null, false, (String) null, 60), vo0.a.d(u2Var2), rVar);
            }
            return null;
        }
        q1 q1Var = o0Var.f;
        if (q1Var != null) {
            return new t10.o(q1Var.b, q1Var.c, q1Var.d, k41.b.e(q1Var.a.c), vo0.a.g(q1Var.e.c), rVar);
        }
        a2 a2Var = o0Var.g;
        if (a2Var != null) {
            return new t10.p(a2Var.b, a2Var.c, a2Var.d, k41.b.e(a2Var.a.c), vo0.a.c(a2Var.e.c), rVar);
        }
        m2 m2Var = o0Var.h;
        if (m2Var != null) {
            return new t10.q(m2Var.b, m2Var.c, m2Var.d, k41.b.e(m2Var.a.c), vo0.a.f(m2Var.e.c), rVar);
        }
        j5 j5Var = o0Var.i;
        if (j5Var != null) {
            return new t10.t(j5Var.a, j5Var.b, j5Var.c, vo0.a.g(j5Var.e.c), rVar);
        }
        s5 s5Var = o0Var.j;
        if (s5Var != null) {
            return new t10.u(s5Var.b, s5Var.c, s5Var.d, k41.b.e(s5Var.a.c), vo0.a.g(s5Var.e.c), rVar);
        }
        return null;
    }

    public static final w61.m d(Throwable th2) {
        k71.k.g(th2, "exception");
        return new w61.m(th2);
    }

    public static final String e(long j) {
        String f;
        if (j <= -999500000) {
            f = s0.f((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            f = s0.f((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            f = s0.f((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            f = s0.f((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            f = s0.f((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            f = s0.f((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{f}, 1));
    }

    public static final v8.d0 f(v8.xShadow xVar, String str, Executor executor, j71.a aVar) {
        k71.k.g(xVar, "tracer");
        k71.k.g(str, "label");
        k71.k.g(executor, "executor");
        p0 p0Var = new p0(v8.d0.c);
        return new v8.d0(p0Var, t.q.m(new v8.e0(executor, xVar, str, aVar, p0Var)));
    }

    public static Handler g() {
        return Build.VERSION.SDK_INT >= 28 ? a5.l.d(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }

    public static final mn.m h(vo.v vVar) {
        vo.s sVar = vVar.p;
        vo.t tVar = vVar.q;
        vo.j jVar = vVar.r;
        vo.i iVar = vVar.o;
        vo.u uVar = vVar.s;
        int i = uVar != null ? uVar.a : 0;
        int i2 = iVar != null ? iVar.a : 0;
        int i3 = jVar != null ? jVar.a : 0;
        int i4 = tVar != null ? tVar.a : 0;
        int i5 = sVar != null ? sVar.a : 0;
        vo.g gVar = vVar.n;
        return new mn.m(uVar != null ? uVar.a : 0, iVar != null ? iVar.a : 0, jVar != null ? jVar.a : 0, tVar != null ? tVar.a : 0, sVar != null ? sVar.a : 0, Math.max((((((gVar != null ? gVar.a : 0) - i5) - i4) - i3) - i2) - i, 0));
    }

    public static final mn.m i(wc0.v vVar) {
        wc0.s sVar = vVar.p;
        wc0.t tVar = vVar.q;
        wc0.j jVar = vVar.r;
        wc0.i iVar = vVar.o;
        wc0.u uVar = vVar.s;
        int i = uVar != null ? uVar.a : 0;
        int i2 = iVar != null ? iVar.a : 0;
        int i3 = jVar != null ? jVar.a : 0;
        int i4 = tVar != null ? tVar.a : 0;
        int i5 = sVar != null ? sVar.a : 0;
        wc0.g gVar = vVar.n;
        return new mn.m(uVar != null ? uVar.a : 0, iVar != null ? iVar.a : 0, jVar != null ? jVar.a : 0, tVar != null ? tVar.a : 0, sVar != null ? sVar.a : 0, Math.max((((((gVar != null ? gVar.a : 0) - i5) - i4) - i3) - i2) - i, 0));
    }

    public static final void j(Object obj) {
        if (obj instanceof w61.m) {
            throw ((w61.m) obj).r;
        }
    }

    public static final u8 k(DiffSide diffSide) {
        k71.k.g(diffSide, "<this>");
        int i = vl0.c.a[diffSide.ordinal()];
        if (i == 1) {
            return u8.s;
        }
        if (i == 2) {
            return u8.t;
        }
        if (i == 3) {
            return u8.u;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final j3 l(l2 l2Var) {
        boolean z;
        int i;
        String str;
        boolean z2;
        boolean z3;
        x61.r rVar;
        ReviewDecision reviewDecision;
        List list;
        q7 q7Var;
        SubscriptionState subscriptionState;
        SubscriptionState subscriptionState2;
        k71.k.g(l2Var, "<this>");
        z70.a2 a2Var = l2Var.q;
        ev evVar = l2Var.o;
        j2 j2Var = l2Var.m;
        ev evVar2 = j2Var.c;
        String str2 = l2Var.b;
        String str3 = l2Var.d;
        String str4 = l2Var.e;
        Boolean bool = l2Var.j;
        boolean z4 = (bool == null || bool.booleanValue()) ? false : true;
        Integer num = l2Var.k;
        if (num != null) {
            i = num.intValue();
            z = false;
        } else {
            z = false;
            i = 0;
        }
        ZonedDateTime zonedDateTime = l2Var.g;
        boolean z5 = z;
        d3 d3Var = new d3(j2Var.e.b, j2Var.b);
        SubscriptionState D = a.a.D(evVar2);
        SubscriptionState D2 = a.a.D(evVar);
        List list2 = j2Var.d;
        SubscriptionState subscriptionState3 = SubscriptionState.IGNORED;
        if (D2 != subscriptionState3 && D != subscriptionState3 && (D != null || D2 != null)) {
            SubscriptionState subscriptionState4 = SubscriptionState.UNSUBSCRIBED;
            if ((D != subscriptionState4 || D2 != subscriptionState4) && (D != (subscriptionState2 = SubscriptionState.CUSTOM) || D2 != subscriptionState4)) {
                if (D != subscriptionState2 || D2 != subscriptionState2) {
                    z5 = true;
                } else if (list2 != null) {
                    z5 = list2.contains(z5.v);
                }
            }
            z5 = false;
        }
        SubscriptionState D3 = a.a.D(evVar2);
        SubscriptionState D4 = a.a.D(evVar);
        SubscriptionState subscriptionState5 = (D4 == subscriptionState3 || D3 == SubscriptionState.SUBSCRIBED || D4 == (subscriptionState = SubscriptionState.UNSUBSCRIBED)) ? subscriptionState3 : subscriptionState;
        SubscriptionState D5 = a.a.D(evVar2);
        SubscriptionState D6 = a.a.D(evVar);
        SubscriptionState subscriptionState6 = SubscriptionState.SUBSCRIBED;
        SubscriptionState subscriptionState7 = (D5 == subscriptionState6 && D6 == null) ? null : subscriptionState6;
        List c = p.c(l2Var.t);
        x61.r rVar2 = l2Var.r.a;
        x61.r rVar3 = x61.r.r;
        if (rVar2 == null) {
            rVar2 = rVar3;
        }
        ArrayList S = x61.m.S(rVar2);
        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = S.get(i2);
            i2++;
            ArrayList arrayList2 = S;
            k2 k2Var = ((g2) obj).b.b;
            arrayList.add(k2Var != null ? y9.a.K(k2Var.b) : null);
            S = arrayList2;
        }
        StatusState statusState = (StatusState) x61.m.W(arrayList);
        String str5 = l2Var.n;
        boolean z6 = l2Var.c;
        int i3 = l2Var.f;
        PullRequestState Q = m7.y.Q(l2Var.l);
        List list3 = a2Var.b;
        if (list3 != null) {
            ArrayList S2 = x61.m.S(list3);
            str = str5;
            z2 = z6;
            rVar = new ArrayList(x61.n.F(S2, 10));
            int size2 = S2.size();
            z3 = z4;
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = S2.get(i4);
                i4++;
                rVar.add(t.e.c(((h2) obj2).c));
                S2 = S2;
            }
        } else {
            str = str5;
            z2 = z6;
            z3 = z4;
            rVar = rVar3;
        }
        com.github.rudroid.common.b0 b0Var = new com.github.rudroid.common.b0(a2Var.a, rVar);
        nl nlVar = l2Var.p;
        if (nlVar != null) {
            int ordinal = nlVar.ordinal();
            if (ordinal == 0) {
                reviewDecision = ReviewDecision.APPROVED;
            } else if (ordinal == 1) {
                reviewDecision = ReviewDecision.CHANGES_REQUESTED;
            } else if (ordinal == 2) {
                reviewDecision = ReviewDecision.REVIEW_REQUIRED;
            } else {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                reviewDecision = ReviewDecision.UNKNOWN;
            }
        } else {
            reviewDecision = null;
        }
        b2 b2Var = l2Var.s;
        int i5 = b2Var != null ? b2Var.a : 0;
        s7 s7Var = l2Var.u;
        boolean z7 = s7Var.c;
        ReviewDecision reviewDecision2 = reviewDecision;
        r7 r7Var = s7Var.d;
        return new j3(str2, str3, str4, z3, zonedDateTime, d3Var, z5, subscriptionState5, subscriptionState7, c, str, i3, b0Var, i, statusState, z2, Q, reviewDecision2, i5, false, (Integer) null, new m01.a((r7Var == null || (list = r7Var.a) == null || (q7Var = (q7) x61.m.f0(list)) == null) ? 0 : q7Var.b.a, z7, s7Var.e.b != null));
    }

    public static final Object m(a1 a1Var, k71.e eVar, Map map) {
        k71.k.g(a1Var, "<this>");
        k71.k.g(map, "typeMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        KSerializer J = b91.g.J(eVar);
        ArrayList c = b7.i.c(J, map);
        int size = c.size();
        int i = 0;
        while (i < size) {
            Object obj = c.get(i);
            i++;
            x6.h hVar = (x6.h) obj;
            linkedHashMap.put(hVar.a, hVar.b.a);
        }
        return new b7.f(a1Var, linkedHashMap).O0(J);
    }

    public static final w7 n(hd0 hd0Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        yz0.q bVar;
        id0 id0Var;
        fd0 fd0Var;
        id0 id0Var2;
        id0 id0Var3;
        jd0 jd0Var;
        id0 id0Var4;
        id0 id0Var5;
        id0 id0Var6;
        id0 id0Var7;
        k71.k.g(hd0Var, "<this>");
        kd0 kd0Var = hd0Var.a;
        String str = "";
        String str2 = (kd0Var == null || (id0Var7 = kd0Var.b) == null) ? "" : id0Var7.b;
        wi wiVar = (kd0Var == null || (id0Var6 = kd0Var.b) == null) ? null : id0Var6.d;
        int i = wiVar == null ? -1 : x.a[wiVar.ordinal()];
        if (i == -1) {
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        } else if (i == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
        } else if (i == 2) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        List f = m71.a.f((kd0Var == null || (id0Var5 = kd0Var.b) == null) ? null : id0Var5.h);
        List P = i4.P((kd0Var == null || (id0Var4 = kd0Var.b) == null) ? null : id0Var4.i);
        fz.g g = k21.f.g((kd0Var == null || (id0Var3 = kd0Var.b) == null || (jd0Var = id0Var3.f) == null) ? null : jd0Var.c);
        ar.c cVar = (kd0Var == null || (id0Var2 = kd0Var.b) == null) ? null : id0Var2.j;
        if (cVar == null) {
            yz0.s.Companion.getClass();
            bVar = yz0.r.b;
        } else {
            ar.c a = ar.c.a(cVar, kd0Var.b.e, null, 4031);
            id0 id0Var8 = kd0Var.b;
            bVar = new fz.b(a, id0Var8.c, new yz0.a0(id0Var8.b));
        }
        if (kd0Var != null && (fd0Var = kd0Var.a) != null) {
            str = fd0Var.b;
        }
        return new w7(str2, issueOrPullRequestState, f, P, x61.r.r, g, bVar, new com.github.service.models.response.a(str, (Avatar) null, (String) null, false, (String) null, 62), new ArrayList(), (kd0Var == null || (id0Var = kd0Var.b) == null || !id0Var.g) ? false : true);
    }
    public Object a() { return null; }
    public Object t(Object p1, Object p2) { return null; }
}
