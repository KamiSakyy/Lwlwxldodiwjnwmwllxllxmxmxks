package rm0;

import com.github.service.models.response.issueorpullrequest.PullRequestMergeAction;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.PullRequestUpdateBranchMethod;
import gn0.bm;
import gn0.nl;
import hc0.zk;
import jn0.ec0;
import jn0.hm;
import jn0.pm;
import jn0.yf0;
import jo.ao;
import jo.mi0;
import jo.mn;
import jo.se0;
import jo.un;
import kc0.a80;
import kc0.qk;
import kc0.yb0;
import kc0.yk;
import kotlin.NoWhenBranchMatchedException;
import m10.ny;
import m10.py;
import m10.wx;
import pz0.js;
import pz0.zs;
import u10.a60;
import u10.oj;
import u10.wj;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x4 implements z01.n0, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final com.github.service.wrapper.bShadow t;
    public final v71.v u;

    public x4(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
        }
    }

    @Override // z01.n0
    public final y71.i a(String str, PullRequestMergeMethod pullRequestMergeMethod, String str2, yz0.s2 s2Var, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(pullRequestMergeMethod, "method");
                bm s = sy.f0.s(pullRequestMergeMethod);
                aa1.bShadow bVar = aa.t0.d;
                aa1.bShadow u0Var = str2 == null ? bVar : new aa.u0(str2);
                String str4 = s2Var != null ? s2Var.r : null;
                aa1.bShadow u0Var2 = str4 == null ? bVar : new aa.u0(str4);
                String str5 = s2Var != null ? s2Var.s : null;
                if (str5 != null) {
                    bVar = new aa.u0(str5);
                }
                return y71.n1.y(new aq.c(new y71.y(new y00.l(in.r.h(this.t.d(new yk(str, s, u0Var, u0Var2, bVar, str3))), 10), new v4(this, null, 0), 6), 11), this.u);
            case 1:
                k71.k.g(pullRequestMergeMethod, "method");
                py z = w8.s.z(pullRequestMergeMethod);
                aa1.bShadow bVar2 = aa.t0.d;
                aa1.bShadow u0Var3 = str2 == null ? bVar2 : new aa.u0(str2);
                String str6 = s2Var != null ? s2Var.r : null;
                aa1.bShadow u0Var4 = str6 == null ? bVar2 : new aa.u0(str6);
                String str7 = s2Var != null ? s2Var.s : null;
                if (str7 != null) {
                    bVar2 = new aa.u0(str7);
                }
                return y71.n1.y(new aq.c(new y71.y(new y00.l(in.r.h(this.t.d(new un(str, z, u0Var3, u0Var4, bVar2, str3))), 10), new v4(this, null, 5), 6), 21), this.u);
            case 2:
                k71.k.g(pullRequestMergeMethod, "method");
                zk F = i21.a.F(pullRequestMergeMethod);
                aa1.bShadow bVar3 = aa.t0.d;
                aa1.bShadow u0Var5 = str2 == null ? bVar3 : new aa.u0(str2);
                String str8 = s2Var != null ? s2Var.r : null;
                aa1.bShadow u0Var6 = str8 == null ? bVar3 : new aa.u0(str8);
                String str9 = s2Var != null ? s2Var.s : null;
                if (str9 != null) {
                    bVar3 = new aa.u0(str9);
                }
                return y71.n1.y(new tw0.i(new y71.y(new y00.l(in.r.h(this.t.d(new wj(str, F, u0Var5, u0Var6, bVar3, str3))), 10), new v4(this, null, 11), 6), 4), this.u);
            default:
                k71.k.g(pullRequestMergeMethod, "method");
                zs Q = aa1.b.Q(pullRequestMergeMethod);
                aa1.bShadow bVar4 = aa.t0.d;
                aa1.bShadow u0Var7 = str2 == null ? bVar4 : new aa.u0(str2);
                String str10 = s2Var != null ? s2Var.r : null;
                aa1.bShadow u0Var8 = str10 == null ? bVar4 : new aa.u0(str10);
                String str11 = s2Var != null ? s2Var.s : null;
                if (str11 != null) {
                    bVar4 = new aa.u0(str11);
                }
                return y71.n1.y(new tw0.i(new y71.y(new y00.l(in.r.h(this.t.d(new pm(str, Q, u0Var7, u0Var8, bVar4, str3))), 10), new v4(this, null, 19), 6), 13), this.u);
        }
    }

    @Override // z01.n0
    public final y71.i b(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "pullId");
                return y71.n1.y(new cn.q(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new qk(str), null, false, null, null, 58), 10), 25), 20), this.u);
            case 1:
                k71.k.g(str, "pullId");
                return y71.n1.y(new cn.q(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.s, new mn(str), null, false, null, null, 58), 10), 5), 28), this.u);
            case 2:
                k71.k.g(str, "pullId");
                return y71.n1.y(new t00.f8(6, new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new oj(str), null, false, null, null, 58), 10), 24)), this.u);
            default:
                k71.k.g(str, "pullId");
                return y71.n1.y(new t00.f8(13, new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new hm(str), null, false, null, null, 58), 10), 1)), this.u);
        }
    }

    @Override // z01.n0
    public final y71.i c(String str, PullRequestUpdateBranchMethod pullRequestUpdateBranchMethod) {
        nl nlVar;
        wx wxVar;
        js jsVar;
        switch (this.r) {
            case 0:
                k71.k.g(pullRequestUpdateBranchMethod, "updateMethod");
                int i = vl0.j.a[pullRequestUpdateBranchMethod.ordinal()];
                if (i == 1) {
                    nlVar = nl.u;
                } else if (i == 2) {
                    nlVar = nl.s;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nlVar = nl.t;
                }
                return y71.n1.y(new y(new y00.l(in.r.h(this.t.d(new a80(str, nlVar))), 10), 26), this.u);
            case 1:
                k71.k.g(pullRequestUpdateBranchMethod, "updateMethod");
                int i2 = dz.l.a[pullRequestUpdateBranchMethod.ordinal()];
                if (i2 == 1) {
                    wxVar = wx.u;
                } else if (i2 == 2) {
                    wxVar = wx.s;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wxVar = wx.t;
                }
                return y71.n1.y(new t00.w3(new y00.l(in.r.h(this.t.d(new se0(str, wxVar))), 10), 7), this.u);
            case 2:
                k71.k.g(pullRequestUpdateBranchMethod, "updateMethod");
                return y71.n1.y(new vb0.u(new y00.l(in.r.h(this.t.d(new a60(str))), 10), 25), this.u);
            default:
                k71.k.g(pullRequestUpdateBranchMethod, "updateMethod");
                int i3 = jx0.k.a[pullRequestUpdateBranchMethod.ordinal()];
                if (i3 == 1) {
                    jsVar = js.u;
                } else if (i3 == 2) {
                    jsVar = js.s;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jsVar = js.t;
                }
                return y71.n1.y(new wy0.q3(new y00.l(in.r.h(this.t.d(new ec0(str, jsVar))), 10), 2), this.u);
        }
    }

    @Override // z01.n0
    public final y71.i d(String str, PullRequestMergeAction pullRequestMergeAction, PullRequestMergeMethod pullRequestMergeMethod, boolean z) {
        ny nyVar;
        switch (this.r) {
            case 0:
                k71.k.g(str, "pullId");
                k71.k.g(pullRequestMergeAction, "pullRequestMergeAction");
                k71.k.g(pullRequestMergeMethod, "pullRequestMergeMethod");
                return y41.t1.S("fetchMergeRequirements", "3.12");
            case 1:
                k71.k.g(str, "pullId");
                k71.k.g(pullRequestMergeAction, "pullRequestMergeAction");
                k71.k.g(pullRequestMergeMethod, "pullRequestMergeMethod");
                int i = dz.h.a[pullRequestMergeAction.ordinal()];
                if (i == 1) {
                    nyVar = ny.v;
                } else if (i == 2) {
                    nyVar = ny.u;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nyVar = ny.t;
                }
                return y71.n1.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.s, new ao(str, nyVar, w8.s.z(pullRequestMergeMethod), z), null, false, null, null, 58), 10), 6), this.u);
            case 2:
                k71.k.g(str, "pullId");
                k71.k.g(pullRequestMergeAction, "pullRequestMergeAction");
                k71.k.g(pullRequestMergeMethod, "pullRequestMergeMethod");
                return y41.t1.S("fetchMergeRequirements", "3.10");
            default:
                k71.k.g(str, "pullId");
                k71.k.g(pullRequestMergeAction, "pullRequestMergeAction");
                k71.k.g(pullRequestMergeMethod, "pullRequestMergeMethod");
                return y41.t1.S("fetchMergeRequirements", "3.17");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
