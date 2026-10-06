package az0;

import aa.t0;
import aa.u0;
import com.github.service.models.response.NotificationReasonState;
import com.github.service.wrapper.j;
import in.r;
import java.util.ArrayList;
import java.util.List;
import jn0.bk;
import jn0.dl;
import jn0.fk;
import jn0.jk;
import jn0.nk;
import jn0.pj;
import jn0.rk;
import jn0.tj;
import jn0.vk;
import jn0.xj;
import jn0.yf0;
import jn0.zk;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import ox0.a1;
import ox0.h1;
import ox0.r0;
import pz0.gl;
import pz0.kl;
import pz0.pl;
import sy.d0;
import v71.v;
import x61.n;
import y00.l;
import y71.i;
import y71.n1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements a11.a, yf0 {
    public static final a Companion = new a();
    public static final List t = d0.o(new String[]{"Commit", "Gist", "DiscussionPost", "CheckSuite", "Issue", "PullRequest", "Release", "RepositoryInvitation", "RepositoryVulnerabilityAlert", "Discussion", "RepositoryDependabotAlertsThread", "SecurityAdvisory", "Actions::WorkflowRun"});
    public j r;
    public v s;

    public g(j jVar, v vVar) {
        k.g(jVar, "client");
        k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    @Override // a11.a
    public final i a(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new tj(str)))), this.s);
    }

    @Override // a11.a
    public final i b(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new pj(str)))), this.s);
    }

    @Override // a11.a
    public final i c(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new vk(list)))), this.s);
    }

    @Override // a11.a
    public final i d(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new fk(str)))), this.s);
    }

    @Override // a11.a
    public final i e(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new jk(str)))), this.s);
    }

    @Override // a11.a
    public final i f(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new nk(str)))), this.s);
    }

    @Override // a11.a
    public final i g(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new xj(str)))), this.s);
    }

    public final Object h() {
        return this;
    }

    @Override // a11.a
    public final i i(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new rk(list)))), this.s);
    }

    @Override // a11.a
    public final i j(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new zk(list)))), this.s);
    }

    @Override // a11.a
    public final i k() {
        return n1.y(new c(new l(com.github.service.wrapper.a.o(this.r, new a1(), null, false, null, null, 58), 10), 2), this.s);
    }

    @Override // a11.a
    public final i l(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new dl(list)))), this.s);
    }

    @Override // a11.a
    public final i m(String str, String str2) {
        k.g(str2, "query");
        return n1.y(new c(new l(com.github.service.wrapper.a.o(this.r, new r0(new u0(str), t0.d, new u0(str2)), null, false, null, null, 58), 10), 1), this.s);
    }

    @Override // a11.a
    public final i n(ArrayList arrayList) {
        ArrayList arrayList2;
        gl glVar;
        u0 u0Var = new u0((Object) null);
        u0 u0Var2 = new u0(d0.n(kl.s));
        if (arrayList != null) {
            arrayList2 = new ArrayList(n.F(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                NotificationReasonState notificationReasonState = (NotificationReasonState) obj;
                k.g(notificationReasonState, "<this>");
                switch (hx0.a.b[notificationReasonState.ordinal()]) {
                    case 1:
                        glVar = gl.u;
                        break;
                    case 2:
                        glVar = gl.v;
                        break;
                    case 3:
                        glVar = gl.x;
                        break;
                    case 4:
                        glVar = gl.y;
                        break;
                    case 5:
                        glVar = gl.z;
                        break;
                    case 6:
                        glVar = gl.A;
                        break;
                    case 7:
                        glVar = gl.C;
                        break;
                    case 8:
                        glVar = gl.E;
                        break;
                    case 9:
                        glVar = gl.F;
                        break;
                    case 10:
                        glVar = gl.G;
                        break;
                    case 11:
                        glVar = gl.H;
                        break;
                    case 12:
                        glVar = gl.I;
                        break;
                    case 13:
                        glVar = gl.w;
                        break;
                    case 14:
                        glVar = gl.t;
                        break;
                    case 15:
                        glVar = gl.D;
                        break;
                    case 16:
                        glVar = gl.B;
                        break;
                    case 17:
                        glVar = gl.J;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList2.add(glVar);
            }
        } else {
            arrayList2 = null;
        }
        u0 u0Var3 = new u0(arrayList2);
        List list = t;
        return n1.y(new c(new l(com.github.service.wrapper.a.o(this.r, new r0(u0Var, new u0(new pl(u0Var3, u0Var2, list == null ? t0.d : new u0(list))), new u0((Object) null)), null, false, null, null, 58), 10), 0), this.s);
    }

    @Override // a11.a
    public final i o() {
        return n1.y(new c(new l(com.github.service.wrapper.a.o(this.r, new h1(), null, false, null, null, 58), 10), 3), this.s);
    }

    @Override // a11.a
    public final i p(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new bk(str)))), this.s);
    }
}
