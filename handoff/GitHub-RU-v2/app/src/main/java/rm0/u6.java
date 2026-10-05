package rm0;

import com.github.service.models.response.type.ReactionContent;
import gn0.bo;
import hc0.zm;
import jn0.kr;
import jn0.yf0;
import jo.ht;
import jo.mi0;
import kc0.ip;
import kc0.yb0;
import kotlin.NoWhenBranchMatchedException;
import m10.z00;
import pz0.cv;
import u10.eo;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u6 implements z01.v0, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final v71.v t;

    public u6(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
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

    @Override // z01.v0
    public final Object a(String str, ReactionContent reactionContent, String str2) {
        bo boVar;
        z00 z00Var;
        zm zmVar;
        cv cvVar;
        switch (this.r) {
            case 0:
                k71.k.g(reactionContent, "<this>");
                switch (vl0.l.a[reactionContent.ordinal()]) {
                    case 1:
                        boVar = bo.B;
                        break;
                    case 2:
                        boVar = bo.A;
                        break;
                    case 3:
                        boVar = bo.z;
                        break;
                    case 4:
                        boVar = bo.x;
                        break;
                    case 5:
                        boVar = bo.w;
                        break;
                    case 6:
                        boVar = bo.t;
                        break;
                    case 7:
                        boVar = bo.v;
                        break;
                    case 8:
                        boVar = bo.y;
                        break;
                    case 9:
                        boVar = bo.u;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new ip(str, boVar, new aa.u0(str2)), null, false, null, null, 58), 10), this.t);
            case 1:
                k71.k.g(reactionContent, "<this>");
                switch (dz.n.a[reactionContent.ordinal()]) {
                    case 1:
                        z00Var = z00.B;
                        break;
                    case 2:
                        z00Var = z00.A;
                        break;
                    case 3:
                        z00Var = z00.z;
                        break;
                    case 4:
                        z00Var = z00.x;
                        break;
                    case 5:
                        z00Var = z00.w;
                        break;
                    case 6:
                        z00Var = z00.t;
                        break;
                    case 7:
                        z00Var = z00.v;
                        break;
                    case 8:
                        z00Var = z00.y;
                        break;
                    case 9:
                        z00Var = z00.u;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.s, new ht(str, z00Var, new aa.u0(str2)), null, false, null, null, 58), 25), this.t);
            case 2:
                k71.k.g(reactionContent, "<this>");
                switch (ab0.k.a[reactionContent.ordinal()]) {
                    case 1:
                        zmVar = zm.B;
                        break;
                    case 2:
                        zmVar = zm.A;
                        break;
                    case 3:
                        zmVar = zm.z;
                        break;
                    case 4:
                        zmVar = zm.x;
                        break;
                    case 5:
                        zmVar = zm.w;
                        break;
                    case 6:
                        zmVar = zm.t;
                        break;
                    case 7:
                        zmVar = zm.v;
                        break;
                    case 8:
                        zmVar = zm.y;
                        break;
                    case 9:
                        zmVar = zm.u;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new eo(str, zmVar, new aa.u0(str2)), null, false, null, null, 58), 8), this.t);
            default:
                k71.k.g(reactionContent, "<this>");
                switch (jx0.m.a[reactionContent.ordinal()]) {
                    case 1:
                        cvVar = cv.B;
                        break;
                    case 2:
                        cvVar = cv.A;
                        break;
                    case 3:
                        cvVar = cv.z;
                        break;
                    case 4:
                        cvVar = cv.x;
                        break;
                    case 5:
                        cvVar = cv.w;
                        break;
                    case 6:
                        cvVar = cv.t;
                        break;
                    case 7:
                        cvVar = cv.v;
                        break;
                    case 8:
                        cvVar = cv.y;
                        break;
                    case 9:
                        cvVar = cv.u;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new kr(str, cvVar, new aa.u0(str2)), null, false, null, null, 58), 28), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
