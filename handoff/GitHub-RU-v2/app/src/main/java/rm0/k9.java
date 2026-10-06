package rm0;

import com.github.service.models.response.type.PullRequestReviewEvent;
import gn0.rm;
import hc0.pl;
import jn0.kq;
import jn0.x50;
import jn0.yf0;
import jo.g80;
import jo.hs;
import jo.mi0;
import kc0.e20;
import kc0.to;
import kc0.yb0;
import m10.lz;
import pz0.qt;
import u10.g00;
import u10.on;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k9 implements z01.h1, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.bShadow t;
    public v71.v u;

    public k9(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
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

    @Override // z01.h1
    public final y71.i a(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "reviewId");
                return y71.n1Shadow.y(new cn.q(new d5(new y00.l(com.github.service.wrapper.b.a(this.t, new to(str), ga.h.t, false, null, 56), 10), 28), 24), this.u);
            case 1:
                k71.k.g(str, "reviewId");
                return y71.n1Shadow.y(new t00.f8(2, new t00.q6(new y00.l(com.github.service.wrapper.b.a(this.t, new hs(str), ga.h.t, false, null, 56), 10), 14)), this.u);
            case 2:
                k71.k.g(str, "reviewId");
                return y71.n1Shadow.y(new t00.f8(10, new vb0.t3(new y00.l(com.github.service.wrapper.b.a(this.t, new on(str), ga.h.t, false, null, 56), 10), 25)), this.u);
            default:
                k71.k.g(str, "reviewId");
                return y71.n1Shadow.y(new t00.f8(17, new wy0.s6(new y00.l(com.github.service.wrapper.b.a(this.t, new kq(str), ga.h.t, false, null, 56), 10), 8)), this.u);
        }
    }

    @Override // z01.h1
    public final y71.i b(String str) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new to(str), null, false, null, null, 58)), this.u);
            case 1:
                return y71.n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new hs(str), null, false, null, null, 58)), this.u);
            case 2:
                return y71.n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new on(str), null, false, null, null, 58)), this.u);
            default:
                return y71.n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new kq(str), null, false, null, null, 58)), this.u);
        }
    }

    @Override // z01.h1
    public final Object c(String str, PullRequestReviewEvent pullRequestReviewEvent, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new e20(str, t.q.pShadow(pullRequestReviewEvent), str2 == null ? aa.t0.d : new aa.u0(str2)))), 10), new v4(this, null, 3), 6), 16), this.u);
            case 1:
                return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new g80(str, y9.a.C(pullRequestReviewEvent), str2 == null ? aa.t0.d : new aa.u0(str2)))), 10), new v4(this, null, 8), 6), 28), this.u);
            case 2:
                return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new g00(str, k41.b.P(pullRequestReviewEvent), str2 == null ? aa.t0.d : new aa.u0(str2)))), 10), new v4(this, null, 14), 6), 9), this.u);
            default:
                return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new x50(str, b91.g.T(pullRequestReviewEvent), str2 == null ? aa.t0.d : new aa.u0(str2)))), 10), new v4(this, null, 22), 6), 20), this.u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a1  */
    @Override // z01.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, PullRequestReviewEvent pullRequestReviewEvent, String str2, a71.c cVar) {
        g9 g9Var;
        int i;
        String str3;
        PullRequestReviewEvent pullRequestReviewEvent2;
        String str4;
        t00.f9 f9Var;
        int i2;
        String str5;
        PullRequestReviewEvent pullRequestReviewEvent3;
        String str6;
        vb0.z6 z6Var;
        int i3;
        String str7;
        PullRequestReviewEvent pullRequestReviewEvent4;
        String str8;
        wy0.h8 h8Var;
        int i4;
        String str9;
        PullRequestReviewEvent pullRequestReviewEvent5;
        String str10;
        switch (this.r) {
            case 0:
                if (cVar instanceof g9) {
                    g9Var = (g9) cVar;
                    int i5 = g9Var.z;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        g9Var.z = i5 - Integer.MIN_VALUE;
                        Object obj = g9Var.x;
                        b71.a aVar = b71.a.r;
                        i = g9Var.z;
                        if (i != 0) {
                            sy.y.j(obj);
                            ri0.s3 s3Var = new ri0.s3();
                            g9Var.u = str;
                            g9Var.v = pullRequestReviewEvent;
                            g9Var.w = str2;
                            g9Var.z = 1;
                            obj = this.t.c(s3Var, str);
                            if (obj == aVar) {
                                return aVar;
                            }
                            str3 = str;
                            pullRequestReviewEvent2 = pullRequestReviewEvent;
                            str4 = str2;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str11 = g9Var.w;
                            pullRequestReviewEvent2 = g9Var.v;
                            String str12 = g9Var.u;
                            sy.y.j(obj);
                            str4 = str11;
                            str3 = str12;
                        }
                        ri0.q3 q3Var = (ri0.q3) obj;
                        Integer num = q3Var == null ? q3Var.c : null;
                        rm p = pullRequestReviewEvent2 == null ? t.q.pShadow(pullRequestReviewEvent2) : null;
                        aa1.bShadow bVar = aa.t0.d;
                        return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new kc0.b1(str3, p != null ? bVar : new aa.u0(p), str4 != null ? bVar : new aa.u0(str4), bVar))), 10), new m7.x(this, num, str4, (a71.c) null, 7), 6), 15), this.u);
                    }
                }
                g9Var = new g9(this, (c71.c) cVar);
                Object obj2 = g9Var.x;
                b71.a aVar2 = b71.a.r;
                i = g9Var.z;
                if (i != 0) {
                }
                ri0.q3 q3Var2 = (ri0.q3) obj2;
                if (q3Var2 == null) {
                }
                if (pullRequestReviewEvent2 == null) {
                }
                aa1.bShadow bVar2 = aa.t0.d;
                return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new kc0.b1(str3, p != null ? bVar2 : new aa.u0(p), str4 != null ? bVar2 : new aa.u0(str4), bVar2))), 10), new m7.x(this, num, str4, (a71.c) null, 7), 6), 15), this.u);
            case 1:
                if (cVar instanceof t00.f9) {
                    f9Var = (t00.f9) cVar;
                    int i6 = f9Var.z;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        f9Var.z = i6 - Integer.MIN_VALUE;
                        Object obj3 = f9Var.x;
                        b71.a aVar3 = b71.a.r;
                        i2 = f9Var.z;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            aa.i0 c4Var = new gv.c4();
                            f9Var.u = str;
                            f9Var.v = pullRequestReviewEvent;
                            f9Var.w = str2;
                            f9Var.z = 1;
                            obj3 = this.t.c(c4Var, str);
                            if (obj3 == aVar3) {
                                return aVar3;
                            }
                            str5 = str;
                            pullRequestReviewEvent3 = pullRequestReviewEvent;
                            str6 = str2;
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str13 = f9Var.w;
                            pullRequestReviewEvent3 = f9Var.v;
                            String str14 = f9Var.u;
                            sy.y.j(obj3);
                            str6 = str13;
                            str5 = str14;
                        }
                        gv.a4 a4Var = (gv.a4) obj3;
                        Integer num2 = a4Var == null ? a4Var.c : null;
                        lz C = pullRequestReviewEvent3 == null ? y9.a.C(pullRequestReviewEvent3) : null;
                        aa1.bShadow bVar3 = aa.t0.d;
                        return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new jo.g1(str5, C != null ? bVar3 : new aa.u0(C), str6 != null ? bVar3 : new aa.u0(str6), bVar3))), 10), new m7.x(this, num2, str6, (a71.c) null, 13), 6), 27), this.u);
                    }
                }
                f9Var = new t00.f9(this, (c71.c) cVar);
                Object obj32 = f9Var.x;
                b71.a aVar32 = b71.a.r;
                i2 = f9Var.z;
                if (i2 != 0) {
                }
                gv.a4 a4Var2 = (gv.a4) obj32;
                if (a4Var2 == null) {
                }
                if (pullRequestReviewEvent3 == null) {
                }
                aa1.bShadow bVar32 = aa.t0.d;
                return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new jo.g1(str5, C != null ? bVar32 : new aa.u0(C), str6 != null ? bVar32 : new aa.u0(str6), bVar32))), 10), new m7.x(this, num2, str6, (a71.c) null, 13), 6), 27), this.u);
            case 2:
                if (cVar instanceof vb0.z6) {
                    z6Var = (vb0.z6) cVar;
                    int i7 = z6Var.z;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        z6Var.z = i7 - Integer.MIN_VALUE;
                        Object obj4 = z6Var.x;
                        b71.a aVar4 = b71.a.r;
                        i3 = z6Var.z;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            aa.i0 j3Var = new z70.j3(0);
                            z6Var.u = str;
                            z6Var.v = pullRequestReviewEvent;
                            z6Var.w = str2;
                            z6Var.z = 1;
                            obj4 = this.t.c(j3Var, str);
                            if (obj4 == aVar4) {
                                return aVar4;
                            }
                            str7 = str;
                            pullRequestReviewEvent4 = pullRequestReviewEvent;
                            str8 = str2;
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str15 = z6Var.w;
                            pullRequestReviewEvent4 = z6Var.v;
                            String str16 = z6Var.u;
                            sy.y.j(obj4);
                            str8 = str15;
                            str7 = str16;
                        }
                        z70.i3 i3Var = (z70.i3) obj4;
                        Integer num3 = i3Var == null ? i3Var.c : null;
                        pl P = pullRequestReviewEvent4 == null ? k41.b.P(pullRequestReviewEvent4) : null;
                        aa1.bShadow bVar4 = aa.t0.d;
                        return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new u10.b1(str7, P != null ? bVar4 : new aa.u0(P), str8 != null ? bVar4 : new aa.u0(str8), bVar4))), 10), new m7.x(this, num3, str8, (a71.c) null, 15), 6), 8), this.u);
                    }
                }
                z6Var = new vb0.z6(this, (c71.c) cVar);
                Object obj42 = z6Var.x;
                b71.a aVar42 = b71.a.r;
                i3 = z6Var.z;
                if (i3 != 0) {
                }
                z70.i3 i3Var2 = (z70.i3) obj42;
                if (i3Var2 == null) {
                }
                if (pullRequestReviewEvent4 == null) {
                }
                aa1.bShadow bVar42 = aa.t0.d;
                return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new u10.b1(str7, P != null ? bVar42 : new aa.u0(P), str8 != null ? bVar42 : new aa.u0(str8), bVar42))), 10), new m7.x(this, num3, str8, (a71.c) null, 15), 6), 8), this.u);
            default:
                if (cVar instanceof wy0.h8) {
                    h8Var = (wy0.h8) cVar;
                    int i8 = h8Var.z;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        h8Var.z = i8 - Integer.MIN_VALUE;
                        Object obj5 = h8Var.x;
                        b71.a aVar5 = b71.a.r;
                        i4 = h8Var.z;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            xt0.s3 s3Var2 = new xt0.s3();
                            h8Var.u = str;
                            h8Var.v = pullRequestReviewEvent;
                            h8Var.w = str2;
                            h8Var.z = 1;
                            obj5 = this.t.c(s3Var2, str);
                            if (obj5 == aVar5) {
                                return aVar5;
                            }
                            str9 = str;
                            pullRequestReviewEvent5 = pullRequestReviewEvent;
                            str10 = str2;
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str17 = h8Var.w;
                            pullRequestReviewEvent5 = h8Var.v;
                            String str18 = h8Var.u;
                            sy.y.j(obj5);
                            str10 = str17;
                            str9 = str18;
                        }
                        xt0.q3 q3Var3 = (xt0.q3) obj5;
                        Integer num4 = q3Var3 == null ? q3Var3.c : null;
                        qt T = pullRequestReviewEvent5 == null ? b91.g.T(pullRequestReviewEvent5) : null;
                        aa1.bShadow bVar5 = aa.t0.d;
                        return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new jn0.b1(str9, T != null ? bVar5 : new aa.u0(T), str10 != null ? bVar5 : new aa.u0(str10), bVar5))), 10), new m7.x(this, num4, str10, (a71.c) null, 21), 6), 19), this.u);
                    }
                }
                h8Var = new wy0.h8(this, (c71.c) cVar);
                Object obj52 = h8Var.x;
                b71.a aVar52 = b71.a.r;
                i4 = h8Var.z;
                if (i4 != 0) {
                }
                xt0.q3 q3Var32 = (xt0.q3) obj52;
                if (q3Var32 == null) {
                }
                if (pullRequestReviewEvent5 == null) {
                }
                aa1.bShadow bVar52 = aa.t0.d;
                return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new jn0.b1(str9, T != null ? bVar52 : new aa.u0(T), str10 != null ? bVar52 : new aa.u0(str10), bVar52))), 10), new m7.x(this, num4, str10, (a71.c) null, 21), 6), 19), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
