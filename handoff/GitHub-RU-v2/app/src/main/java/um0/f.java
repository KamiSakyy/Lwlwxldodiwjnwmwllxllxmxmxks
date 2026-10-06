package um0;

import aa.t0;
import aa.u0;
import am0.g1;
import am0.q0;
import am0.z0;
import com.github.service.models.response.NotificationReasonState;
import com.github.service.wrapper.j;
import gn0.ii;
import gn0.mi;
import gn0.ri;
import in.rShadow;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import kc0.aj;
import kc0.ci;
import kc0.ej;
import kc0.gi;
import kc0.ij;
import kc0.ki;
import kc0.mj;
import kc0.oi;
import kc0.si;
import kc0.wi;
import kc0.yb0;
import kc0.yh;
import kotlin.NoWhenBranchMatchedException;
import sy.d0Shadow;
import t00.q6;
import v71.v;
import x61.n;
import y00.l;
import y71.i;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements a11.a, yb0 {
    public static final a Companion = new a();
    public static final List t = d0Shadow.o(new String[]{"Commit", "Gist", "DiscussionPost", "CheckSuite", "Issue", "PullRequest", "Release", "RepositoryInvitation", "RepositoryVulnerabilityAlert", "Discussion", "RepositoryDependabotAlertsThread", "SecurityAdvisory", "Actions::WorkflowRun"});
    public j r;
    public v s;

    public f(j jVar, v vVar) {
        k.g(jVar, "client");
        k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    @Override // a11.a
    public final i a(String str) {
        k.g(str, "id");
        return n1Shadow.y(rShadow.l(rShadow.h(this.rShadow.d(new ci(str)))), this.s);
    }

    @Override // a11.a
    public final i b(String str) {
        k.g(str, "id");
        return n1Shadow.y(rShadow.l(rShadow.h(this.rShadow.d(new yh(str)))), this.s);
    }

    @Override // a11.a
    public final i c(List list) {
        k.g(list, "id");
        return n1Shadow.y(rShadow.l(rShadow.h(this.rShadow.d(new ej(list)))), this.s);
    }

    @Override // a11.a
    public final i d(String str) {
        k.g(str, "id");
        return n1Shadow.y(rShadow.l(rShadow.h(this.rShadow.d(new oi(str)))), this.s);
    }

    @Override // a11.a
    public final i e(String str) {
        k.g(str, "id");
        return n1Shadow.y(rShadow.l(rShadow.h(this.rShadow.d(new si(str)))), this.s);
    }

    @Override // a11.a
    public final i f(String str) {
        k.g(str, "id");
        return n1Shadow.y(rShadow.l(rShadow.h(this.rShadow.d(new wi(str)))), this.s);
    }

    @Override // a11.a
    public final i g(String str) {
        k.g(str, "id");
        return n1Shadow.y(rShadow.l(rShadow.h(this.rShadow.d(new gi(str)))), this.s);
    }

    public final Object h() {
        return this;
    }

    @Override // a11.a
    public final i i(List list) {
        k.g(list, "id");
        return n1Shadow.y(rShadow.l(rShadow.h(this.rShadow.d(new aj(list)))), this.s);
    }

    @Override // a11.a
    public final i j(List list) {
        k.g(list, "id");
        return n1Shadow.y(rShadow.l(rShadow.h(this.rShadow.d(new ij(list)))), this.s);
    }

    @Override // a11.a
    public final i k() {
        return n1Shadow.y(new q6(new l(com.github.service.wrapper.a.o(this.r, new z0(), null, false, null, null, 58), 10), 24), this.s);
    }

    @Override // a11.a
    public final i l(List list) {
        k.g(list, "id");
        return n1Shadow.y(rShadow.l(rShadow.h(this.rShadow.d(new mj(list)))), this.s);
    }

    @Override // a11.a
    public final i m(String str, String str2) {
        k.g(str2, "query");
        return n1Shadow.y(new q6(new l(com.github.service.wrapper.a.o(this.r, new q0(new u0(str), t0.d, new u0(str2)), null, false, null, null, 58), 10), 23), this.s);
    }

    @Override // a11.a
    public final i n(ArrayList arrayList) {
        ArrayList arrayList2;
        ii iiVar;
        u0 u0Var = new u0((Object) null);
        u0 u0Var2 = new u0(d0Shadow.n(mi.s));
        if (arrayList != null) {
            arrayList2 = new ArrayList(n.F(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                NotificationReasonState notificationReasonState = (NotificationReasonState) obj;
                k.g(notificationReasonState, "<this>");
                switch (ul0.a.b[notificationReasonState.ordinal()]) {
                    case 1:
                        iiVar = ii.u;
                        break;
                    case 2:
                        iiVar = ii.v;
                        break;
                    case 3:
                        iiVar = ii.x;
                        break;
                    case 4:
                        iiVar = ii.y;
                        break;
                    case 5:
                        iiVar = ii.z;
                        break;
                    case 6:
                        iiVar = ii.A;
                        break;
                    case 7:
                        iiVar = ii.C;
                        break;
                    case 8:
                        iiVar = ii.E;
                        break;
                    case 9:
                        iiVar = ii.F;
                        break;
                    case 10:
                        iiVar = ii.G;
                        break;
                    case 11:
                        iiVar = ii.H;
                        break;
                    case 12:
                        iiVar = ii.I;
                        break;
                    case 13:
                        iiVar = ii.w;
                        break;
                    case 14:
                        iiVar = ii.t;
                        break;
                    case 15:
                        iiVar = ii.D;
                        break;
                    case 16:
                        iiVar = ii.B;
                        break;
                    case 17:
                        iiVar = ii.J;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList2.add(iiVar);
            }
        } else {
            arrayList2 = null;
        }
        u0 u0Var3 = new u0(arrayList2);
        List list = t;
        return n1Shadow.y(new q6(new l(com.github.service.wrapper.a.o(this.r, new q0(u0Var, new u0(new ri(u0Var3, u0Var2, list == null ? t0.d : new u0(list))), new u0((Object) null)), null, false, null, null, 58), 10), 22), this.s);
    }

    @Override // a11.a
    public final i o() {
        return n1Shadow.y(new q6(new l(com.github.service.wrapper.a.o(this.r, new g1(), null, false, null, null, 58), 10), 25), this.s);
    }

    @Override // a11.a
    public final i p(String str) {
        k.g(str, "id");
        return n1Shadow.y(rShadow.l(rShadow.h(this.rShadow.d(new ki(str)))), this.s);
    }
}
