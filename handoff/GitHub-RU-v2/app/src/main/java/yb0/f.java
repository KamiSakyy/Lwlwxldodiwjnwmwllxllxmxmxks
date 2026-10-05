package yb0;

import aa.t0;
import aa.u0;
import com.github.service.models.response.NotificationReasonState;
import com.github.service.wrapper.j;
import fb0.f1;
import fb0.p0;
import fb0.y0;
import hc0.ih;
import hc0.rh;
import in.r;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import sy.d0;
import u10.ah;
import u10.ci;
import u10.eh;
import u10.gi;
import u10.ki;
import u10.mh;
import u10.qh;
import u10.uh;
import u10.wg;
import u10.y90;
import u10.yh;
import v71.v;
import wy0.s6;
import x61.n;
import y00.l;
import y71.i;
import y71.n1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements a11.a, y90 {
    public static final a Companion = new a();
    public static final List t = d0.o(new String[]{"Commit", "Gist", "DiscussionPost", "CheckSuite", "Issue", "PullRequest", "Release", "RepositoryInvitation", "RepositoryVulnerabilityAlert", "Discussion", "RepositoryDependabotAlertsThread", "SecurityAdvisory", "Actions::WorkflowRun"});
    public final j r;
    public final v s;

    public f(j jVar, v vVar) {
        k.g(jVar, "client");
        k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    @Override // a11.a
    public final i a(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new ah(str)))), this.s);
    }

    @Override // a11.a
    public final i b(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new wg(str)))), this.s);
    }

    @Override // a11.a
    public final i c(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new ci(list)))), this.s);
    }

    @Override // a11.a
    public final i d(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new mh(str)))), this.s);
    }

    @Override // a11.a
    public final i e(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new qh(str)))), this.s);
    }

    @Override // a11.a
    public final i f(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new uh(str)))), this.s);
    }

    @Override // a11.a
    public final i g(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new eh(str)))), this.s);
    }

    public final Object h() {
        return this;
    }

    @Override // a11.a
    public final i i(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new yh(list)))), this.s);
    }

    @Override // a11.a
    public final i j(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new gi(list)))), this.s);
    }

    @Override // a11.a
    public final i k() {
        return n1.y(new s6(new l(com.github.service.wrapper.a.o(this.r, new y0(), null, false, null, null, 58), 10), 22), this.s);
    }

    @Override // a11.a
    public final i l(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new ki(list)))), this.s);
    }

    @Override // a11.a
    public final i m(String str, String str2) {
        k.g(str2, "query");
        return n1.y(new s6(new l(com.github.service.wrapper.a.o(this.r, new p0(new u0(str), t0.d, new u0(str2)), null, false, null, null, 58), 10), 21), this.s);
    }

    @Override // a11.a
    public final i n(ArrayList arrayList) {
        ArrayList arrayList2;
        ih ihVar;
        u0 u0Var = new u0((Object) null);
        u0 u0Var2 = new u0(d0.n(hc0.mh.s));
        if (arrayList != null) {
            arrayList2 = new ArrayList(n.F(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                NotificationReasonState notificationReasonState = (NotificationReasonState) obj;
                k.g(notificationReasonState, "<this>");
                switch (za0.a.b[notificationReasonState.ordinal()]) {
                    case 1:
                        ihVar = ih.u;
                        break;
                    case 2:
                        ihVar = ih.v;
                        break;
                    case 3:
                        ihVar = ih.x;
                        break;
                    case 4:
                        ihVar = ih.y;
                        break;
                    case 5:
                        ihVar = ih.z;
                        break;
                    case 6:
                        ihVar = ih.A;
                        break;
                    case 7:
                        ihVar = ih.C;
                        break;
                    case 8:
                        ihVar = ih.E;
                        break;
                    case 9:
                        ihVar = ih.F;
                        break;
                    case 10:
                        ihVar = ih.G;
                        break;
                    case 11:
                        ihVar = ih.H;
                        break;
                    case 12:
                        ihVar = ih.I;
                        break;
                    case 13:
                        ihVar = ih.w;
                        break;
                    case 14:
                        ihVar = ih.t;
                        break;
                    case 15:
                        ihVar = ih.D;
                        break;
                    case 16:
                        ihVar = ih.B;
                        break;
                    case 17:
                        ihVar = ih.J;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList2.add(ihVar);
            }
        } else {
            arrayList2 = null;
        }
        u0 u0Var3 = new u0(arrayList2);
        List list = t;
        return n1.y(new s6(new l(com.github.service.wrapper.a.o(this.r, new p0(u0Var, new u0(new rh(u0Var3, u0Var2, list == null ? t0.d : new u0(list))), new u0((Object) null)), null, false, null, null, 58), 10), 20), this.s);
    }

    @Override // a11.a
    public final i o() {
        return n1.y(new s6(new l(com.github.service.wrapper.a.o(this.r, new f1(), null, false, null, null, 58), 10), 23), this.s);
    }

    @Override // a11.a
    public final i p(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new u10.ih(str)))), this.s);
    }
}
