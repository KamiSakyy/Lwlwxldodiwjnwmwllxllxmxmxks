package x00;

import aa.t0;
import aa.u0;
import com.github.service.models.response.NotificationReasonState;
import com.github.service.wrapper.j;
import ga.h;
import in.r;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jo.am;
import jo.cl;
import jo.em;
import jo.gl;
import jo.im;
import jo.kl;
import jo.mi0;
import jo.ol;
import jo.sl;
import jo.uk;
import jo.wl;
import jo.yk;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import lz.g1;
import lz.q0;
import lz.z0;
import m10.jq;
import m10.nq;
import m10.sq;
import sy.d0;
import v71.v;
import wy0.s6;
import x61.n;
import y00.l;
import y71.i;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements a11.a, mi0 {
    public static final a Companion = new a();
    public static final List t = d0.o("Commit", "Gist", "DiscussionPost", "CheckSuite", "Issue", "PullRequest", "Release", "RepositoryInvitation", "RepositoryVulnerabilityAlert", "Discussion", "RepositoryDependabotAlertsThread", "SecurityAdvisory", "Actions::WorkflowRun");
    public final j r;
    public final v s;

    public f(j jVar, v vVar) {
        k.g(jVar, "client");
        k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    public final i a(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new yk(str)))), this.s);
    }

    public final i b(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new uk(str)))), this.s);
    }

    public final i c(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new am(list)))), this.s);
    }

    public final i d(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new kl(str)))), this.s);
    }

    public final i e(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new ol(str)))), this.s);
    }

    public final i f(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new sl(str)))), this.s);
    }

    public final i g(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new cl(str)))), this.s);
    }

    public final Object h() {
        return this;
    }

    public final i i(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new wl(list)))), this.s);
    }

    public final i j(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new em(list)))), this.s);
    }

    public final i k() {
        return n1.y(new s6(new l(com.github.service.wrapper.a.o(this.r, new z0(), (h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 16), this.s);
    }

    public final i l(List list) {
        k.g(list, "id");
        return n1.y(r.l(r.h(this.r.d(new im(list)))), this.s);
    }

    public final i m(String str, String str2) {
        k.g(str2, "query");
        return n1.y(new s6(new l(com.github.service.wrapper.a.o(this.r, new q0(new u0(str), t0.d, new u0(str2)), (h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 15), this.s);
    }

    public final i n(ArrayList arrayList) {
        ArrayList arrayList2;
        jq jqVar;
        u0 u0Var = new u0((Object) null);
        u0 u0Var2 = new u0(d0.n(nq.s));
        if (arrayList != null) {
            arrayList2 = new ArrayList(n.F(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                NotificationReasonState notificationReasonState = (NotificationReasonState) obj;
                k.g(notificationReasonState, "<this>");
                switch (bz.a.b[notificationReasonState.ordinal()]) {
                    case 1:
                        jqVar = jq.u;
                        break;
                    case 2:
                        jqVar = jq.v;
                        break;
                    case 3:
                        jqVar = jq.x;
                        break;
                    case 4:
                        jqVar = jq.y;
                        break;
                    case 5:
                        jqVar = jq.z;
                        break;
                    case 6:
                        jqVar = jq.A;
                        break;
                    case 7:
                        jqVar = jq.C;
                        break;
                    case 8:
                        jqVar = jq.E;
                        break;
                    case 9:
                        jqVar = jq.F;
                        break;
                    case 10:
                        jqVar = jq.G;
                        break;
                    case 11:
                        jqVar = jq.H;
                        break;
                    case 12:
                        jqVar = jq.I;
                        break;
                    case 13:
                        jqVar = jq.w;
                        break;
                    case 14:
                        jqVar = jq.t;
                        break;
                    case 15:
                        jqVar = jq.D;
                        break;
                    case 16:
                        jqVar = jq.B;
                        break;
                    case 17:
                        jqVar = jq.J;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList2.add(jqVar);
            }
        } else {
            arrayList2 = null;
        }
        u0 u0Var3 = new u0(arrayList2);
        List list = t;
        return n1.y(new s6(new l(com.github.service.wrapper.a.o(this.r, new q0(u0Var, new u0(new sq(u0Var3, u0Var2, list == null ? t0.d : new u0(list))), new u0((Object) null)), (h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 14), this.s);
    }

    public final i o() {
        return n1.y(new s6(new l(com.github.service.wrapper.a.o(this.r, new g1(), (h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 17), this.s);
    }

    public final i p(String str) {
        k.g(str, "id");
        return n1.y(r.l(r.h(this.r.d(new gl(str)))), this.s);
    }
}
