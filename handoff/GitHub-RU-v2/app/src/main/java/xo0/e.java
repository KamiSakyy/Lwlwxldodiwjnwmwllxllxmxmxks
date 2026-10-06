package xo0;

import com.github.service.models.response.feed.FeedDisinterestReason;
import com.github.service.wrapper.j;
import ga.h;
import in.rShadow;
import java.util.ArrayList;
import java.util.Set;
import jn0.ce;
import jn0.fa0;
import jn0.i8;
import jn0.je;
import jn0.q70;
import jn0.yf0;
import jo.da0;
import jo.f9;
import jo.gf;
import jo.mi0;
import jo.tc0;
import jo.ze;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import m10.ka;
import m10.we;
import pz0.g7;
import pz0.sb;
import s01.n;
import s01.oShadow;
import s01.p;
import t00.f8;
import v71.v;
import wa.g;
import wy0.d6;
import wy0.n6;
import xn.q1;
import y00.l;
import y71.i;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements s10.a, yf0, mi0 {
    public final /* synthetic */ int r;
    public j s;
    public com.github.service.wrapper.b t;
    public v u;
    public p v;

    public e(j jVar, com.github.service.wrapper.b bVar, v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k.g(jVar, "client");
                k.g(bVar, "cachedClient");
                k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new sw0.c(jVar, bVar, vVar, new q1(16), new n6(7), oShadow.r, new n6(8), new q1(17), new q1(18), new q1(19), new q1(20), null, null, 126976);
                break;
            default:
                k.g(jVar, "client");
                k.g(bVar, "cachedClient");
                k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new sw0.c(jVar, bVar, vVar, new g(10), new sw0.b(28), oShadow.r, new sw0.b(29), new g(11), new g(12), new g(13), new g(14), null, null, 126976);
                break;
        }
    }

    public final i a() {
        switch (this.r) {
        }
        return ((sw0.c) this.v).e(n.a);
    }

    public final i b() {
        switch (this.r) {
            case 0:
                return n1Shadow.y(new d6(com.github.service.wrapper.a.o(this.s, new je(), null, false, null, null, 62), 21), this.u);
            default:
                return n1Shadow.y(new l(com.github.service.wrapper.a.o(this.s, new gf(), null, false, null, null, 62), 23), this.u);
        }
    }

    public final i c() {
        switch (this.r) {
        }
        return ((sw0.c) this.v).b(n.a);
    }

    public final i d(Set set) {
        g7 g7Var;
        ka kaVar;
        switch (this.r) {
            case 0:
                Set<t10.g> set2 = set;
                ArrayList arrayList = new ArrayList(x61.n.F(set2, 10));
                for (t10.g gVar : set2) {
                    k.g(gVar, "<this>");
                    switch (gVar.ordinal()) {
                        case 0:
                            g7Var = g7.t;
                            break;
                        case 1:
                            g7Var = g7.x;
                            break;
                        case 2:
                            g7Var = g7.z;
                            break;
                        case 3:
                            g7Var = g7.A;
                            break;
                        case 4:
                            g7Var = g7.y;
                            break;
                        case 5:
                            g7Var = g7.u;
                            break;
                        case 6:
                            g7Var = g7.w;
                            break;
                        case 7:
                            g7Var = g7.v;
                            break;
                        case 8:
                            g7Var = g7.B;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(g7Var);
                }
                return n1Shadow.y(rShadow.l(rShadow.h(this.s.d(new fa0(arrayList)))), this.u);
            default:
                Set<t10.g> set3 = set;
                ArrayList arrayList2 = new ArrayList(x61.n.F(set3, 10));
                for (t10.g gVar2 : set3) {
                    k.g(gVar2, "<this>");
                    switch (gVar2.ordinal()) {
                        case 0:
                            kaVar = ka.t;
                            break;
                        case 1:
                            kaVar = ka.x;
                            break;
                        case 2:
                            kaVar = ka.z;
                            break;
                        case 3:
                            kaVar = ka.A;
                            break;
                        case 4:
                            kaVar = ka.y;
                            break;
                        case 5:
                            kaVar = ka.u;
                            break;
                        case 6:
                            kaVar = ka.w;
                            break;
                        case 7:
                            kaVar = ka.v;
                            break;
                        case 8:
                            kaVar = ka.B;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(kaVar);
                }
                return n1Shadow.y(rShadow.l(rShadow.h(this.s.d(new tc0(arrayList2)))), this.u);
        }
    }

    public final i e(String str) {
        switch (this.r) {
            case 0:
                return n1Shadow.y(rShadow.l(rShadow.h(this.s.d(new q70(str)))), this.u);
            default:
                return n1Shadow.y(rShadow.l(rShadow.h(this.s.d(new da0(str)))), this.u);
        }
    }

    public final i f() {
        switch (this.r) {
            case 0:
                return n1Shadow.y(new f8(19, new d6(com.github.service.wrapper.b.a(this.t, new ce(), h.t, true, null, 56), 22)), this.u);
            default:
                return n1Shadow.y(new f8(24, new l(com.github.service.wrapper.b.a(this.t, new ze(), h.t, true, null, 56), 24)), this.u);
        }
    }

    public final i g() {
        switch (this.r) {
        }
        return ((sw0.c) this.v).h(n.a);
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    public final i i(String str, Set set) {
        sb sbVar;
        we weVar;
        switch (this.r) {
            case 0:
                Set<FeedDisinterestReason> set2 = set;
                ArrayList arrayList = new ArrayList(x61.n.F(set2, 10));
                for (FeedDisinterestReason feedDisinterestReason : set2) {
                    k.g(feedDisinterestReason, "<this>");
                    int i = fx0.a.a[feedDisinterestReason.ordinal()];
                    if (i == 1) {
                        sbVar = sb.s;
                    } else if (i == 2) {
                        sbVar = sb.t;
                    } else if (i == 3) {
                        sbVar = sb.u;
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sbVar = sb.v;
                    }
                    arrayList.add(sbVar);
                }
                return n1Shadow.y(rShadow.l(rShadow.h(this.s.d(new i8(str, arrayList)))), this.u);
            default:
                Set<FeedDisinterestReason> set3 = set;
                ArrayList arrayList2 = new ArrayList(x61.n.F(set3, 10));
                for (FeedDisinterestReason feedDisinterestReason2 : set3) {
                    k.g(feedDisinterestReason2, "<this>");
                    int i2 = yy.a.a[feedDisinterestReason2.ordinal()];
                    if (i2 == 1) {
                        weVar = we.s;
                    } else if (i2 == 2) {
                        weVar = we.t;
                    } else if (i2 == 3) {
                        weVar = we.u;
                    } else {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        weVar = we.v;
                    }
                    arrayList2.add(weVar);
                }
                return n1Shadow.y(rShadow.l(rShadow.h(this.s.d(new f9(str, arrayList2)))), this.u);
        }
    }

    public Object t;
}
