package rm0;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.br;
import jn0.gb0;
import jn0.hd0;
import jn0.mn;
import jn0.yf0;
import jo.fp;
import jo.mi0;
import jo.ud0;
import jo.vf0;
import jo.ys;
import kc0.c70;
import kc0.h90;
import kc0.vl;
import kc0.yb0;
import kc0.zo;
import kotlin.NoWhenBranchMatchedException;
import u10.e50;
import u10.h70;
import u10.rk;
import u10.un;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s6 implements z01.u0, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public v71.v t;

    public s6(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
        }
    }

    @Override // z01.u0
    public final Object a(boolean z) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new o3(in.r.h(this.s.d(new im0.k(new aa.u0(Boolean.valueOf(z))))), 4), this.t);
            case 1:
                return y71.n1.y(new t00.g3(in.r.h(this.s.d(new j00.p(new aa.u0(Boolean.valueOf(z))))), 7), this.t);
            case 2:
                return y71.n1.y(new vb0.p1(in.r.h(this.s.d(new mb0.k(new aa.u0(Boolean.valueOf(z))))), 8), this.t);
            default:
                return y71.n1.y(new wy0.h1(in.r.h(this.s.d(new my0.k(new aa.u0(Boolean.valueOf(z))))), 12), this.t);
        }
    }

    @Override // z01.u0
    public final y71.i b(boolean z) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new d5(new y00.l(in.r.h(this.s.d(new im0.a1(new aa.u0(Boolean.valueOf(z))))), 10), 17), this.t);
            case 1:
                return y71.n1.y(new t00.q6(new y00.l(in.r.h(this.s.d(new j00.l1(new aa.u0(Boolean.valueOf(z))))), 10), 2), this.t);
            case 2:
                return y41.t1.S("updatePushNotificationReleasesEventsSetting", "3.10");
            default:
                return y71.n1.y(new wy0.q3(new y00.l(in.r.h(this.s.d(new my0.a1(new aa.u0(Boolean.valueOf(z))))), 10), 26), this.t);
        }
    }

    @Override // z01.u0
    public final Object c(Integer num) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new zo(new aa.u0(num)), null, false, null, null, 58), 9), this.t);
            case 1:
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.s, new ys(new aa.u0(num)), null, false, null, null, 58), 24), this.t);
            case 2:
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new un(new aa.u0(num)), null, false, null, null, 58), 7), this.t);
            default:
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new br(new aa.u0(num)), null, false, null, null, 58), 27), this.t);
        }
    }

    @Override // z01.u0
    public final y71.i d() {
        switch (this.r) {
            case 0:
                return y41.t1.S("fetchLiveActivityCopilotCodingAgentSetting", "3.12");
            case 1:
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.s, new j00.e(), null, false, null, null, 58), 22), this.t);
            case 2:
                return y41.t1.S("fetchLiveActivityCopilotCodingAgentSetting", "3.10");
            default:
                return y41.t1.S("fetchLiveActivityCopilotCodingAgentSetting", "3.17");
        }
    }

    @Override // z01.u0
    public final Object e(List list, LocalTime localTime, LocalTime localTime2) {
        gn0.t6 t6Var;
        m10.ua uaVar;
        hc0.j6 j6Var;
        pz0.q7 q7Var;
        switch (this.r) {
            case 0:
                ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.github.rudroid.common.f fVar = (com.github.rudroid.common.f) it.next();
                    k71.k.g(fVar, "<this>");
                    switch (fVar.ordinal()) {
                        case 0:
                            t6Var = gn0.t6.w;
                            break;
                        case 1:
                            t6Var = gn0.t6.u;
                            break;
                        case 2:
                            t6Var = gn0.t6.y;
                            break;
                        case 3:
                            t6Var = gn0.t6.z;
                            break;
                        case 4:
                            t6Var = gn0.t6.x;
                            break;
                        case 5:
                            t6Var = gn0.t6.t;
                            break;
                        case 6:
                            t6Var = gn0.t6.v;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(t6Var);
                }
                return y71.n1.y(new o3(in.r.h(this.s.d(new h90(arrayList, localTime, localTime2))), 9), this.t);
            case 1:
                ArrayList arrayList2 = new ArrayList(x61.n.F(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    com.github.rudroid.common.f fVar2 = (com.github.rudroid.common.f) it2.next();
                    k71.k.g(fVar2, "<this>");
                    switch (fVar2.ordinal()) {
                        case 0:
                            uaVar = m10.ua.w;
                            break;
                        case 1:
                            uaVar = m10.ua.u;
                            break;
                        case 2:
                            uaVar = m10.ua.y;
                            break;
                        case 3:
                            uaVar = m10.ua.z;
                            break;
                        case 4:
                            uaVar = m10.ua.x;
                            break;
                        case 5:
                            uaVar = m10.ua.t;
                            break;
                        case 6:
                            uaVar = m10.ua.v;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(uaVar);
                }
                return y71.n1.y(new t00.g3(in.r.h(this.s.d(new vf0(arrayList2, localTime, localTime2))), 12), this.t);
            case 2:
                ArrayList arrayList3 = new ArrayList(x61.n.F(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    com.github.rudroid.common.f fVar3 = (com.github.rudroid.common.f) it3.next();
                    k71.k.g(fVar3, "<this>");
                    switch (fVar3.ordinal()) {
                        case 0:
                            j6Var = hc0.j6.w;
                            break;
                        case 1:
                            j6Var = hc0.j6.u;
                            break;
                        case 2:
                            j6Var = hc0.j6.y;
                            break;
                        case 3:
                            j6Var = hc0.j6.z;
                            break;
                        case 4:
                            j6Var = hc0.j6.x;
                            break;
                        case 5:
                            j6Var = hc0.j6.t;
                            break;
                        case 6:
                            j6Var = hc0.j6.v;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList3.add(j6Var);
                }
                return y71.n1.y(new vb0.p1(in.r.h(this.s.d(new h70(arrayList3, localTime, localTime2))), 13), this.t);
            default:
                ArrayList arrayList4 = new ArrayList(x61.n.F(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    com.github.rudroid.common.f fVar4 = (com.github.rudroid.common.f) it4.next();
                    k71.k.g(fVar4, "<this>");
                    switch (fVar4.ordinal()) {
                        case 0:
                            q7Var = pz0.q7.w;
                            break;
                        case 1:
                            q7Var = pz0.q7.u;
                            break;
                        case 2:
                            q7Var = pz0.q7.y;
                            break;
                        case 3:
                            q7Var = pz0.q7.z;
                            break;
                        case 4:
                            q7Var = pz0.q7.x;
                            break;
                        case 5:
                            q7Var = pz0.q7.t;
                            break;
                        case 6:
                            q7Var = pz0.q7.v;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList4.add(q7Var);
                }
                return y71.n1.y(new wy0.h1(in.r.h(this.s.d(new hd0(arrayList4, localTime, localTime2))), 17), this.t);
        }
    }

    @Override // z01.u0
    public final y71.i f(boolean z) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new d5(new y00.l(in.r.h(this.s.d(new im0.w(new aa.u0(Boolean.valueOf(z))))), 10), 15), this.t);
            case 1:
                return y71.n1.y(new t00.w3(new y00.l(in.r.h(this.s.d(new j00.b0(new aa.u0(Boolean.valueOf(z))))), 10), 29), this.t);
            case 2:
                return y71.n1.y(new vb0.t3(new y00.l(in.r.h(this.s.d(new mb0.w(new aa.u0(Boolean.valueOf(z))))), 10), 13), this.t);
            default:
                return y71.n1.y(new wy0.q3(new y00.l(in.r.h(this.s.d(new my0.w(new aa.u0(Boolean.valueOf(z))))), 10), 24), this.t);
        }
    }

    @Override // z01.u0
    public final Object g() {
        switch (this.r) {
            case 0:
                return y71.n1.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new vl(), null, false, null, null, 58), 10), 14), this.t);
            case 1:
                return y71.n1.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.s, new fp(), null, false, null, null, 58), 10), 28), this.t);
            case 2:
                return y71.n1.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new rk(), null, false, null, null, 58), 10), 12), this.t);
            default:
                return y71.n1.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new mn(), null, false, null, null, 58), 10), 23), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    @Override // z01.u0
    public final Object i(boolean z) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new o3(in.r.h(this.s.d(new im0.i0(new aa.u0(Boolean.valueOf(z))))), 6), this.t);
            case 1:
                return y71.n1.y(new t00.g3(in.r.h(this.s.d(new j00.n0(new aa.u0(Boolean.valueOf(z))))), 9), this.t);
            case 2:
                return y71.n1.y(new vb0.p1(in.r.h(this.s.d(new mb0.i0(new aa.u0(Boolean.valueOf(z))))), 10), this.t);
            default:
                return y71.n1.y(new wy0.h1(in.r.h(this.s.d(new my0.i0(new aa.u0(Boolean.valueOf(z))))), 14), this.t);
        }
    }

    @Override // z01.u0
    public final y71.i j(boolean z) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new d5(new y00.l(in.r.h(this.s.d(new im0.q(new aa.u0(Boolean.valueOf(z))))), 10), 16), this.t);
            case 1:
                return y71.n1.y(new t00.q6(new y00.l(in.r.h(this.s.d(new j00.v(new aa.u0(Boolean.valueOf(z))))), 10), 0), this.t);
            case 2:
                return y71.n1.y(new vb0.t3(new y00.l(in.r.h(this.s.d(new mb0.q(new aa.u0(Boolean.valueOf(z))))), 10), 14), this.t);
            default:
                return y71.n1.y(new wy0.q3(new y00.l(in.r.h(this.s.d(new my0.q(new aa.u0(Boolean.valueOf(z))))), 10), 25), this.t);
        }
    }

    @Override // z01.u0
    public final Object k(boolean z) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new o3(in.r.h(this.s.d(new im0.u0(new aa.u0(Boolean.valueOf(z))))), 8), this.t);
            case 1:
                return y71.n1.y(new t00.g3(in.r.h(this.s.d(new j00.f1(new aa.u0(Boolean.valueOf(z))))), 11), this.t);
            case 2:
                return y71.n1.y(new vb0.p1(in.r.h(this.s.d(new mb0.u0(new aa.u0(Boolean.valueOf(z))))), 12), this.t);
            default:
                return y71.n1.y(new wy0.h1(in.r.h(this.s.d(new my0.u0(new aa.u0(Boolean.valueOf(z))))), 16), this.t);
        }
    }

    @Override // z01.u0
    public final y71.i l() {
        switch (this.r) {
            case 0:
                Boolean bool = Boolean.TRUE;
                return y71.n1.y(new d5(new y00.l(in.r.h(this.s.d(new c70(aa.t0.d, new aa.u0(bool), new aa.u0(bool)))), 10), 13), this.t);
            case 1:
                Boolean bool2 = Boolean.TRUE;
                return y71.n1.y(new t00.w3(new y00.l(in.r.h(this.s.d(new ud0(aa.t0.d, new aa.u0(bool2), new aa.u0(bool2)))), 10), 27), this.t);
            case 2:
                Boolean bool3 = Boolean.TRUE;
                return y71.n1.y(new vb0.t3(new y00.l(in.r.h(this.s.d(new e50(aa.t0.d, new aa.u0(bool3), new aa.u0(bool3)))), 10), 11), this.t);
            default:
                Boolean bool4 = Boolean.TRUE;
                return y71.n1.y(new wy0.q3(new y00.l(in.r.h(this.s.d(new gb0(aa.t0.d, new aa.u0(bool4), new aa.u0(bool4)))), 10), 22), this.t);
        }
    }

    @Override // z01.u0
    public final y71.i m(boolean z) {
        switch (this.r) {
            case 0:
                return y41.t1.S("updatePushNotificationLiveActivityCopilotCodingAgentSetting", "3.12");
            case 1:
                return y71.n1.y(new t00.q6(new y00.l(in.r.h(this.s.d(new j00.z0(new aa.u0(Boolean.valueOf(z))))), 10), 1), this.t);
            case 2:
                return y41.t1.S("updatePushNotificationLiveActivityCopilotCodingAgentSetting", "3.10");
            default:
                return y41.t1.S("updatePushNotificationLiveActivityCopilotCodingAgentSetting", "3.17");
        }
    }

    @Override // z01.u0
    public final Object n() {
        switch (this.r) {
            case 0:
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new im0.e(), null, false, null, null, 58), 8), this.t);
            case 1:
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.s, new j00.j(), null, false, null, null, 58), 23), this.t);
            case 2:
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new mb0.e(), null, false, null, null, 58), 6), this.t);
            default:
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new my0.e(), null, false, null, null, 58), 26), this.t);
        }
    }

    @Override // z01.u0
    public final Object o(boolean z) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new d5(new y00.l(in.r.h(this.s.d(new im0.g1(new aa.u0(Boolean.valueOf(z))))), 10), 18), this.t);
            case 1:
                return y71.n1.y(new t00.q6(new y00.l(in.r.h(this.s.d(new j00.r1(new aa.u0(Boolean.valueOf(z))))), 10), 3), this.t);
            case 2:
                return y71.n1.y(new vb0.t3(new y00.l(in.r.h(this.s.d(new mb0.a1(new aa.u0(Boolean.valueOf(z))))), 10), 15), this.t);
            default:
                return y71.n1.y(new wy0.q3(new y00.l(in.r.h(this.s.d(new my0.g1(new aa.u0(Boolean.valueOf(z))))), 10), 27), this.t);
        }
    }

    @Override // z01.u0
    public final y71.i p() {
        switch (this.r) {
        }
        return new t00.f8(21, Boolean.FALSE);
    }

    @Override // z01.u0
    public final Object q(boolean z) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new o3(in.r.h(this.s.d(new im0.c0(new aa.u0(Boolean.valueOf(z))))), 5), this.t);
            case 1:
                return y71.n1.y(new t00.g3(in.r.h(this.s.d(new j00.h0(new aa.u0(Boolean.valueOf(z))))), 8), this.t);
            case 2:
                return y71.n1.y(new vb0.p1(in.r.h(this.s.d(new mb0.c0(new aa.u0(Boolean.valueOf(z))))), 9), this.t);
            default:
                return y71.n1.y(new wy0.h1(in.r.h(this.s.d(new my0.c0(new aa.u0(Boolean.valueOf(z))))), 13), this.t);
        }
    }

    @Override // z01.u0
    public final y71.i r(boolean z, boolean z2) {
        switch (this.r) {
            case 0:
                aa.u0 u0Var = new aa.u0(Boolean.valueOf(z));
                aa.u0 u0Var2 = aa.t0.d;
                aa.u0 u0Var3 = z2 ? new aa.u0(Boolean.TRUE) : u0Var2;
                if (z2) {
                    u0Var2 = new aa.u0(Boolean.TRUE);
                }
                return y71.n1.y(new d5(new y00.l(in.r.h(this.s.d(new c70(u0Var, u0Var3, u0Var2))), 10), 12), this.t);
            case 1:
                aa.u0 u0Var4 = new aa.u0(Boolean.valueOf(z));
                aa.u0 u0Var5 = aa.t0.d;
                aa.u0 u0Var6 = z2 ? new aa.u0(Boolean.TRUE) : u0Var5;
                if (z2) {
                    u0Var5 = new aa.u0(Boolean.TRUE);
                }
                return y71.n1.y(new t00.w3(new y00.l(in.r.h(this.s.d(new ud0(u0Var4, u0Var6, u0Var5))), 10), 26), this.t);
            case 2:
                aa.u0 u0Var7 = new aa.u0(Boolean.valueOf(z));
                aa.u0 u0Var8 = aa.t0.d;
                aa.u0 u0Var9 = z2 ? new aa.u0(Boolean.TRUE) : u0Var8;
                if (z2) {
                    u0Var8 = new aa.u0(Boolean.TRUE);
                }
                return y71.n1.y(new vb0.t3(new y00.l(in.r.h(this.s.d(new e50(u0Var7, u0Var9, u0Var8))), 10), 10), this.t);
            default:
                aa.u0 u0Var10 = new aa.u0(Boolean.valueOf(z));
                aa.u0 u0Var11 = aa.t0.d;
                aa.u0 u0Var12 = z2 ? new aa.u0(Boolean.TRUE) : u0Var11;
                if (z2) {
                    u0Var11 = new aa.u0(Boolean.TRUE);
                }
                return y71.n1.y(new wy0.q3(new y00.l(in.r.h(this.s.d(new gb0(u0Var10, u0Var12, u0Var11))), 10), 21), this.t);
        }
    }

    @Override // z01.u0
    public final Object s(boolean z) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new o3(in.r.h(this.s.d(new im0.o0(new aa.u0(Boolean.valueOf(z))))), 7), this.t);
            case 1:
                return y71.n1.y(new t00.g3(in.r.h(this.s.d(new j00.t0(new aa.u0(Boolean.valueOf(z))))), 10), this.t);
            case 2:
                return y71.n1.y(new vb0.p1(in.r.h(this.s.d(new mb0.o0(new aa.u0(Boolean.valueOf(z))))), 11), this.t);
            default:
                return y71.n1.y(new wy0.h1(in.r.h(this.s.d(new my0.o0(new aa.u0(Boolean.valueOf(z))))), 15), this.t);
        }
    }
}
