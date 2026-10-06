package rm0;

import gn0.eq;
import gn0.fr;
import gn0.rr;
import gn0.tr;
import gn0.zi;
import hc0.ap;
import hc0.bq;
import hc0.nq;
import hc0.pq;
import hc0.zh;
import kc0.b00;
import kc0.cc0;
import kc0.cv;
import kc0.fx;
import kc0.g30;
import kc0.hv;
import kc0.i00;
import kc0.ir;
import kc0.kx;
import kc0.ky;
import kc0.lt;
import kc0.m10;
import kc0.nt;
import kc0.nw;
import kc0.px;
import kc0.py;
import kc0.qt;
import kc0.ut;
import kc0.vr;
import kc0.vt;
import kc0.wr;
import kc0.xr;
import kc0.xu;
import kc0.y10;
import kc0.yb0;
import kc0.yr;
import kotlin.NoWhenBranchMatchedException;
import u10.a00;
import u10.ca0;
import u10.dy;
import u10.gs;
import u10.i10;
import u10.jt;
import u10.lw;
import u10.ot;
import u10.oz;
import u10.qw;
import u10.rq;
import u10.rv;
import u10.sq;
import u10.tq;
import u10.tt;
import u10.uq;
import u10.y90;
import u10.zu;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y8 implements z01.g1, yb0, y90 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final com.github.service.wrapper.bShadow t;
    public final v71.v u;
    public final s01.p v;

    public y8(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        k71.k.g(jVar, "client");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        switch (i) {
            case 1:
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                oo.a aVar = new oo.a(4);
                n0.x xVar = new n0.x(25);
                s01.o oVar = s01.o.r;
                n0.x xVar2 = new n0.x(26);
                oo.a aVar2 = new oo.a(5);
                oo.a aVar3 = new oo.a(6);
                oo.a aVar4 = new oo.a(7);
                oo.a aVar5 = new oo.a(8);
                ga.h hVar = ga.h.r;
                this.v = new jy.d(jVar, bVar, vVar, aVar, xVar, oVar, xVar2, aVar2, aVar3, aVar4, aVar5, null, null, 63488);
                break;
            default:
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                jy.bShadow bVar2 = new jy.b(29);
                lb0.a aVar6 = new lb0.a(1);
                s01.o oVar2 = s01.o.r;
                lb0.a aVar7 = new lb0.a(2);
                lm0.g gVar = new lm0.g(0);
                lm0.g gVar2 = new lm0.g(1);
                lm0.g gVar3 = new lm0.g(2);
                lm0.g gVar4 = new lm0.g(3);
                ga.h hVar2 = ga.h.r;
                this.v = new jy.d(jVar, bVar, vVar, bVar2, aVar6, oVar2, aVar7, gVar, gVar2, gVar3, gVar4, null, null, 63488);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r0.p(r5, r4, r6, r1) == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5 == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(y8 y8Var, String str, c71.c cVar) {
        r8 r8Var;
        int i;
        oj0.a4 a4Var;
        com.github.service.wrapper.bShadow bVar = y8Var.t;
        if (cVar instanceof r8) {
            r8Var = (r8) cVar;
            int i2 = r8Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r8Var.w = i2 - Integer.MIN_VALUE;
                Object obj = r8Var.u;
                b71.a aVar = b71.a.r;
                i = r8Var.w;
                if (i != 0) {
                    sy.y.j(obj);
                    oj0.c4 c4Var = new oj0.c4();
                    r8Var.w = 1;
                    obj = bVar.c(c4Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                }
                a4Var = (oj0.a4) obj;
                if (a4Var != null) {
                    String str2 = a4Var.a;
                    oj0.a4 a4Var2 = new oj0.a4(str2, new oj0.y3(x61.r.r), a4Var.c);
                    oj0.c4 c4Var2 = new oj0.c4();
                    r8Var.w = 2;
                }
                return w61.a0.a;
            }
        }
        r8Var = new r8(y8Var, cVar);
        Object obj2 = r8Var.u;
        b71.a aVar2 = b71.a.r;
        i = r8Var.w;
        if (i != 0) {
        }
        a4Var = (oj0.a4) obj2;
        if (a4Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r0.p(r5, r4, r6, r1) == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r5 == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(y8 y8Var, String str, c71.c cVar) {
        vb0.l6 l6Var;
        int i;
        w80.v3 v3Var;
        com.github.service.wrapper.bShadow bVar = y8Var.t;
        if (cVar instanceof vb0.l6) {
            l6Var = (vb0.l6) cVar;
            int i2 = l6Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l6Var.w = i2 - Integer.MIN_VALUE;
                Object obj = l6Var.u;
                b71.a aVar = b71.a.r;
                i = l6Var.w;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.i0 w3Var = new w80.w3(0);
                    l6Var.w = 1;
                    obj = bVar.c(w3Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                }
                v3Var = (w80.v3) obj;
                if (v3Var != null) {
                    String str2 = v3Var.a;
                    aa.h0 v3Var2 = new w80.v3(str2, new w80.t3(x61.r.r), v3Var.c);
                    aa.i0 w3Var2 = new w80.w3(0);
                    l6Var.w = 2;
                }
                return w61.a0.a;
            }
        }
        l6Var = new vb0.l6(y8Var, cVar);
        Object obj2 = l6Var.u;
        b71.a aVar2 = b71.a.r;
        i = l6Var.w;
        if (i != 0) {
        }
        v3Var = (w80.v3) obj2;
        if (v3Var != null) {
        }
        return w61.a0.a;
    }

    @Override // z01.g1
    public final y71.i A(v01.d dVar, com.github.rudroid.common.i0 i0Var) {
        switch (this.r) {
            case 0:
                k71.k.g(dVar, "filterType");
                k71.k.g(i0Var, "filter");
                return new q8(this.v.e(new lm0.h(dVar)), i0Var, 0);
            default:
                k71.k.g(dVar, "filterType");
                k71.k.g(i0Var, "filter");
                return new q8(this.v.e(new pb0.g(dVar)), i0Var, 2);
        }
    }

    @Override // z01.g1
    public final y71.i B(String str, String str2, v01.d dVar, String str3, v01.c cVar, String str4) {
        fr frVar;
        zi ziVar;
        bq bqVar;
        zh zhVar;
        switch (this.r) {
            case 0:
                k71.k.g(str, "userLogin");
                aa.u0 u0Var = aa.t0.d;
                aa.u0 u0Var2 = str2 == null ? u0Var : new aa.u0(str2);
                rr M = t.a0.M(dVar);
                aa.u0 u0Var3 = M == null ? u0Var : new aa.u0(M);
                if (str3 != null) {
                    u0Var = new aa.u0(str3);
                }
                int ordinal = cVar.r.ordinal();
                if (ordinal == 0) {
                    frVar = fr.s;
                } else if (ordinal == 1) {
                    frVar = fr.t;
                } else if (ordinal == 2) {
                    frVar = fr.u;
                } else if (ordinal == 3) {
                    frVar = fr.v;
                } else {
                    if (ordinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    frVar = fr.w;
                }
                aa.u0 u0Var4 = u0Var2;
                aa.u0 u0Var5 = new aa.u0(frVar);
                int ordinal2 = cVar.s.ordinal();
                if (ordinal2 == 0) {
                    ziVar = zi.s;
                } else {
                    if (ordinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ziVar = zi.t;
                }
                return y71.n1.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new xu(str, new aa.u0(str4), u0Var4, u0Var3, u0Var, u0Var5, new aa.u0(ziVar)), null, false, null, null, 62), 10), 23), this.u);
            default:
                k71.k.g(str, "userLogin");
                aa.u0 u0Var6 = aa.t0.d;
                aa.u0 u0Var7 = str2 == null ? u0Var6 : new aa.u0(str2);
                nq f0 = m71.a.f0(dVar);
                aa.u0 u0Var8 = f0 == null ? u0Var6 : new aa.u0(f0);
                if (str3 != null) {
                    u0Var6 = new aa.u0(str3);
                }
                int ordinal3 = cVar.r.ordinal();
                if (ordinal3 == 0) {
                    bqVar = bq.s;
                } else if (ordinal3 == 1) {
                    bqVar = bq.t;
                } else if (ordinal3 == 2) {
                    bqVar = bq.u;
                } else if (ordinal3 == 3) {
                    bqVar = bq.v;
                } else {
                    if (ordinal3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bqVar = bq.w;
                }
                aa.u0 u0Var9 = u0Var7;
                aa.u0 u0Var10 = new aa.u0(bqVar);
                int ordinal4 = cVar.s.ordinal();
                if (ordinal4 == 0) {
                    zhVar = zh.s;
                } else {
                    if (ordinal4 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zhVar = zh.t;
                }
                return y71.n1.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new jt(str, new aa.u0(str4), u0Var9, u0Var8, u0Var6, u0Var10, new aa.u0(zhVar)), null, false, null, null, 62), 10), 20), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i C(String str, String str2, String str3, boolean z) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "qualifiedName");
                return y71.n1.y(new cn.q(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new ky(str, str2, z, aa.t0.d, str3), null, false, null, null, 58), 10), 24), 21), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "qualifiedName");
                return y71.n1.y(new t00.f8(7, new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new lw(str, str2, z, aa.t0.d, str3), null, false, null, null, 58), 10), 21)), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i D(String str) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new m10(str == null ? aa.t0.d : new aa.u0(str)), null, false, null, null, 62), 10), 25), this.u);
            default:
                return y71.n1.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new oz(str == null ? aa.t0.d : new aa.u0(str)), null, false, null, null, 62), 10), 22), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i E(String str, String str2, String str3, w01.a aVar, String str4, boolean z) {
        tr trVar;
        pq pqVar;
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryId");
                k71.k.g(str3, "ownerId");
                int ordinal = aVar.ordinal();
                if (ordinal == 0) {
                    trVar = tr.t;
                } else if (ordinal == 1) {
                    trVar = tr.u;
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    trVar = tr.s;
                }
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new kc0.p4(str, str2, str3, trVar, str4 == null ? aa.t0.d : new aa.u0(str4), z)))), this.u);
            default:
                k71.k.g(str, "repositoryId");
                k71.k.g(str3, "ownerId");
                int ordinal2 = aVar.ordinal();
                if (ordinal2 == 0) {
                    pqVar = pq.t;
                } else if (ordinal2 == 1) {
                    pqVar = pq.u;
                } else {
                    if (ordinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pqVar = pq.s;
                }
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new u10.p4(str, str2, str3, pqVar, str4 == null ? aa.t0.d : new aa.u0(str4), z)))), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i F(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new kx(aa.t0.d, str, str2), null, false, null, null, 58), 18), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y41.t1.S("fetchMergeQueueEnabled", "3.10");
        }
    }

    @Override // z01.g1
    public final y71.i G(v01.d dVar) {
        switch (this.r) {
            case 0:
                k71.k.g(dVar, "filterType");
                return this.v.b(new lm0.h(dVar));
            default:
                k71.k.g(dVar, "filterType");
                return this.v.b(new pb0.g(dVar));
        }
    }

    @Override // z01.g1
    public final y71.i H(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.t, new cc0(str, str2), null, false, null, null, 62), 24), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.t, new ca0(str, str2), null, false, null, null, 62), 19), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i I(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new nw(str, str2), null, false, null, null, 62), 23), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new zu(str, str2), null, false, null, null, 62), 18), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i J(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                return y71.n1.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new lt(new aa.u0(str2), str), null, false, null, null, 62), 10), 21), this.u);
            default:
                k71.k.g(str, "id");
                return y71.n1.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new gs(new aa.u0(str2), str), null, false, null, null, 62), 10), 18), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i K(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "userLogin");
                k71.k.g(str2, "query");
                return y71.n1.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new y10(new aa.u0(str2), str3 == null ? aa.t0.d : new aa.u0(str3), str), null, false, null, null, 62), 10), 26), this.u);
            default:
                k71.k.g(str, "userLogin");
                k71.k.g(str2, "query");
                return y71.n1.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new a00(str, str3 == null ? aa.t0.d : new aa.u0(str3)), null, false, null, null, 62), 10), 23), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i L(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                aa1.bShadow bVar = aa.t0.d;
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new vt(str3 == null ? bVar : new aa.u0(str3), bVar, str, str2), null, false, null, null, 62)), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y41.t1.S("refreshMergeQueueEntries", "3.10");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(String str, boolean z, c71.c cVar) {
        vb0.h6 h6Var;
        int i;
        w80.m3 m3Var;
        if (cVar instanceof vb0.h6) {
            h6Var = (vb0.h6) cVar;
            int i2 = h6Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h6Var.x = i2 - Integer.MIN_VALUE;
                Object obj = h6Var.v;
                b71.a aVar = b71.a.r;
                i = h6Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    h6Var.u = z;
                    h6Var.x = 1;
                    obj = this.t.c(new w80.n3(0), str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = h6Var.u;
                    sy.y.j(obj);
                }
                m3Var = (w80.m3) obj;
                if (m3Var == null) {
                    return new w80.m3(m3Var.c + (z ? 1 : -1), m3Var.a, m3Var.b, z);
                }
                return null;
            }
        }
        h6Var = new vb0.h6(this, cVar);
        Object obj2 = h6Var.v;
        b71.a aVar2 = b71.a.r;
        i = h6Var.x;
        if (i != 0) {
        }
        m3Var = (w80.m3) obj2;
        if (m3Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object P(String str, boolean z, c71.c cVar) {
        l8 l8Var;
        int i;
        oj0.q3 q3Var;
        if (cVar instanceof l8) {
            l8Var = (l8) cVar;
            int i2 = l8Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l8Var.x = i2 - Integer.MIN_VALUE;
                Object obj = l8Var.v;
                b71.a aVar = b71.a.r;
                i = l8Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    l8Var.u = z;
                    l8Var.x = 1;
                    obj = this.t.c(new oj0.s3(), str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = l8Var.u;
                    sy.y.j(obj);
                }
                q3Var = (oj0.q3) obj;
                if (q3Var == null) {
                    return new oj0.q3(q3Var.c + (z ? 1 : -1), q3Var.a, q3Var.b, z);
                }
                return null;
            }
        }
        l8Var = new l8(this, cVar);
        Object obj2 = l8Var.v;
        b71.a aVar2 = b71.a.r;
        i = l8Var.x;
        if (i != 0) {
        }
        q3Var = (oj0.q3) obj2;
        if (q3Var == null) {
        }
    }

    @Override // z01.g1
    public final Object a(String str, v01.d dVar, com.github.rudroid.common.i0 i0Var) {
        switch (this.r) {
            case 0:
                aa1.bShadow bVar = aa.t0.d;
                aa1.bShadow u0Var = str == null ? bVar : new aa.u0(str);
                rr M = t.a0.M(dVar);
                if (M != null) {
                    bVar = new aa.u0(M);
                }
                return y71.n1.y(new j8(new y00.l(com.github.service.wrapper.a.o(this.s, new g30(u0Var, bVar, 8), null, false, null, null, 62), 10), i0Var, 0), this.u);
            default:
                aa1.bShadow bVar2 = aa.t0.d;
                aa1.bShadow u0Var2 = str == null ? bVar2 : new aa.u0(str);
                nq f0 = m71.a.f0(dVar);
                if (f0 != null) {
                    bVar2 = new aa.u0(f0);
                }
                return y71.n1.y(new j8(new y00.l(com.github.service.wrapper.a.o(this.s, new i10(u0Var2, bVar2, 8), null, false, null, null, 62), 10), i0Var, 4), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i b(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y41.t1.S("observeRepositoryIssueTypes", "3.12");
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y41.t1.S("observeRepositoryIssueTypes", "3.10");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    @Override // z01.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, String str4, a71.c cVar) {
        v7 v7Var;
        int i;
        vt vtVar;
        String str5;
        Object f;
        ut utVar;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        switch (this.r) {
            case 0:
                if (cVar instanceof v7) {
                    v7Var = (v7) cVar;
                    int i2 = v7Var.B;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        v7Var.B = i2 - Integer.MIN_VALUE;
                        Object obj = v7Var.z;
                        b71.a aVar = b71.a.r;
                        i = v7Var.B;
                        aa1.bShadow bVar = aa.t0.d;
                        if (i != 0) {
                            sy.y.j(obj);
                            vtVar = new vt(str8 == null ? bVar : new aa.u0(str8), bVar, str6, str7);
                            v7Var.u = str6;
                            v7Var.v = str7;
                            v7Var.w = str8;
                            str5 = str4;
                            v7Var.x = str5;
                            v7Var.y = vtVar;
                            v7Var.B = 1;
                            f = this.t.f(vtVar);
                            if (f == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            vt vtVar2 = v7Var.y;
                            String str9 = v7Var.x;
                            str8 = v7Var.w;
                            String str10 = v7Var.v;
                            String str11 = v7Var.u;
                            sy.y.j(obj);
                            vtVar = vtVar2;
                            str6 = str11;
                            f = obj;
                            str5 = str9;
                            str7 = str10;
                        }
                        nt ntVar = (nt) f;
                        qt qtVar = (ntVar != null || (utVar = ntVar.a) == null) ? null : utVar.b;
                        aa1.bShadow u0Var = str8 != null ? bVar : new aa.u0(str8);
                        if (str5 != null) {
                            bVar = new aa.u0(str5);
                        }
                        return y71.n1.y(in.r.l(new y71.y(new r3(2, com.github.service.wrapper.a.o(this.s, new vt(u0Var, bVar, str6, str7), null, false, null, null, 62), qtVar), new h1.u(this, vtVar, (a71.c) null, 27), 6)), this.u);
                    }
                }
                v7Var = new v7(this, (c71.c) cVar);
                Object obj2 = v7Var.z;
                b71.a aVar2 = b71.a.r;
                i = v7Var.B;
                aa1.bShadow bVar2 = aa.t0.d;
                if (i != 0) {
                }
                nt ntVar2 = (nt) f;
                if (ntVar2 != null) {
                }
                if (str8 != null) {
                }
                if (str5 != null) {
                }
                return y71.n1.y(in.r.l(new y71.y(new r3(2, com.github.service.wrapper.a.o(this.s, new vt(u0Var, bVar2, str6, str7), null, false, null, null, 62), qtVar), new h1.u(this, vtVar, (a71.c) null, 27), 6)), this.u);
            default:
                return y41.t1.S("fetchMergeQueueEntriesPage", "3.10");
        }
    }

    @Override // z01.g1
    public final y71.i d(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryId");
                k71.k.g(str2, "description");
                eq.Companion.getClass();
                lm0.k kVar = new lm0.k(new lm0.m(new lm0.l(str, str2, str2, str2, ((aa.q) eq.m0).a)));
                return y71.n1.y(in.r.l(in.r.h(this.t.k(new lm0.n(new aa.u0(str2), str), kVar))), this.u);
            default:
                k71.k.g(str, "repositoryId");
                k71.k.g(str2, "description");
                ap.Companion.getClass();
                aa.m0 jVar = new pb0.j(new pb0.l(new pb0.k(str, str2, str2, str2, ((aa.q) ap.k0).a)));
                return y71.n1.y(in.r.l(in.r.h(this.t.k(new pb0.m(new aa.u0(str2), str), jVar))), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i e(v01.d dVar) {
        switch (this.r) {
            case 0:
                k71.k.g(dVar, "filterType");
                return this.v.h(new lm0.h(dVar));
            default:
                k71.k.g(dVar, "filterType");
                return this.v.h(new pb0.g(dVar));
        }
    }

    @Override // z01.g1
    public final y71.i f(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "branchQualifiedName");
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new hv(str, str2, str3), null, false, null, null, 58), 21), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "branchQualifiedName");
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new tt(str, str2, str3), null, false, null, null, 58), 16), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i g(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new px(str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 17), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y41.t1.S("fetchMergeQueue", "3.10");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    @Override // z01.g1
    public final y71.i i(String str, boolean z) {
        switch (this.r) {
            case 0:
                com.github.service.wrapper.j jVar = this.s;
                return y71.n1.y(z ? new o3(in.r.h(jVar.d(new ir(str))), 12) : new o3(in.r.h(jVar.d(new kc0.a0(str))), 13), this.u);
            default:
                com.github.service.wrapper.j jVar2 = this.s;
                return y71.n1.y(z ? new vb0.p1(in.r.h(jVar2.d(new u10.eq(str))), 16) : new vb0.p1(in.r.h(jVar2.d(new u10.a0(str))), 17), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i j(String str, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new i00(str, str2 == null ? aa.t0.d : new aa.u0(str2)), null, false, null, null, 62), 10), 27), this.u);
            default:
                return y71.n1.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new u10.ky(str, str2 == null ? aa.t0.d : new aa.u0(str2)), null, false, null, null, 62), 10), 24), this.u);
        }
    }

    @Override // z01.g1
    public final Object k(String str, com.github.rudroid.common.i0 i0Var, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new j8(new y00.l(com.github.service.wrapper.a.o(this.s, new b00(str, str2 == null ? aa.t0.d : new aa.u0(str2)), null, false, null, null, 62), 10), i0Var, 1), this.u);
            default:
                return y71.n1.y(new j8(new y00.l(com.github.service.wrapper.a.o(this.s, new dy(str, str2 == null ? aa.t0.d : new aa.u0(str2)), null, false, null, null, 62), 10), i0Var, 5), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i l(String str, String str2) {
        switch (this.r) {
            case 0:
                return y41.t1.S("fetchRepositoryEmptyAndArchivedStatus", "3.12");
            default:
                return y41.t1.S("fetchRepositoryEmptyAndArchivedStatus", "3.10");
        }
    }

    @Override // z01.g1
    public final Object m(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                aa1.bShadow bVar = aa.t0.d;
                return y71.n1.y(new j3(com.github.service.wrapper.b.a(this.t, new vt(str3 == null ? bVar : new aa.u0(str3), bVar, str, str2), ga.h.t, false, null, 60), 19), this.u);
            default:
                return y41.t1.S("fetchMergeQueueEntries", "3.10");
        }
    }

    @Override // z01.g1
    public final y71.i n(String str, String str2, String str3, String str4, boolean z) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str4, "qualifiedName");
                return y71.n1.y(new cn.q(new b10.b(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.b.q(this.t, new ky(str, str2, z, str3 == null ? aa.t0.d : new aa.u0(str3), str4), ga.h.t, false, null, null, new bd.m(str, 8), new s(9), 28)), 5), 22), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str4, "qualifiedName");
                return y71.n1.y(new t00.f8(8, new b10.b(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.b.q(this.t, new lw(str, str2, z, str3 == null ? aa.t0.d : new aa.u0(str3), str4), ga.h.t, false, null, null, new bd.m(str, 8), new v00.n(20), 28)), 10)), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i o(String str, String str2) {
        switch (this.r) {
            case 0:
                return y41.t1.S("fetchRepositoryPullRequestTemplates", "3.12");
            default:
                return y41.t1.S("fetchRepositoryPullRequestTemplates", "3.10");
        }
    }

    @Override // z01.g1
    public final y71.i p(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y41.t1.S("refreshRepositoryIssueTypes", "3.12");
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y41.t1.S("refreshRepositoryIssueTypes", "3.10");
        }
    }

    @Override // z01.g1
    public final y71.i q(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryOwnerLogin");
                k71.k.g(str2, "repositoryName");
                return y41.t1.S("checkRepositoryReady", "3.12");
            default:
                k71.k.g(str, "repositoryOwnerLogin");
                k71.k.g(str2, "repositoryName");
                return y41.t1.S("checkRepositoryReady", "3.10");
        }
    }

    @Override // z01.g1
    public final y71.i r(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y41.t1.S("loadRepositoryIssueTypesPage", "3.12");
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y41.t1.S("loadRepositoryIssueTypesPage", "3.10");
        }
    }

    @Override // z01.g1
    public final Object s(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new py(str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 20), this.u);
            default:
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new qw(str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), null, false, null, null, 58), 15), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i t(String str, String str2, String str3, String str4, boolean z) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str4, "qualifiedName");
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new ky(str, str2, z, str3 == null ? aa.t0.d : new aa.u0(str3), str4), null, false, null, null, 62)), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str4, "qualifiedName");
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new lw(str, str2, z, str3 == null ? aa.t0.d : new aa.u0(str3), str4), null, false, null, null, 62)), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i u(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new d5(new y00.l(com.github.service.wrapper.a.o(this.s, new fx(str, str2), null, false, null, null, 62), 10), 22), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new vb0.t3(new y00.l(com.github.service.wrapper.a.o(this.s, new rv(str, str2), null, false, null, null, 62), 10), 19), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i v(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                return y41.t1.S("observeRepositoryOwnerRepositories", "3.12");
            default:
                k71.k.g(str, "owner");
                return y41.t1.S("observeRepositoryOwnerRepositories", "3.10");
        }
    }

    @Override // z01.g1
    public final y71.i w(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "qualifiedName");
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new cv(str, str2, str3), null, false, null, null, 58), 16), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "qualifiedName");
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new ot(str, str2, str3), null, false, null, null, 58), 14), this.u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    @Override // z01.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(String str, a71.c cVar) {
        l7 l7Var;
        int i;
        oj0.q3 q3Var;
        y71.i d;
        vb0.q5 q5Var;
        int i2;
        w80.m3 m3Var;
        y71.i d2;
        switch (this.r) {
            case 0:
                if (cVar instanceof l7) {
                    l7Var = (l7) cVar;
                    int i3 = l7Var.x;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        l7Var.x = i3 - Integer.MIN_VALUE;
                        Object obj = l7Var.v;
                        Object obj2 = b71.a.r;
                        i = l7Var.x;
                        if (i != 0) {
                            sy.y.j(obj);
                            l7Var.u = str;
                            l7Var.x = 1;
                            obj = P(str, true, l7Var);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = l7Var.u;
                            sy.y.j(obj);
                        }
                        q3Var = (oj0.q3) obj;
                        com.github.service.wrapper.bShadow bVar = this.t;
                        if (q3Var == null) {
                            kc0.v1 v1Var = new kc0.v1(str);
                            String str2 = q3Var.a;
                            d = bVar.k(v1Var, new kc0.t1(new kc0.r1(new kc0.u1(str2, new bl0.a(q3Var.b, str2), q3Var))));
                        } else {
                            d = bVar.d(new kc0.v1(str));
                        }
                        return y71.n1.y(new aq.c(new y71.y(in.r.h(d), new m7(this, null, 0), 6), 13), this.u);
                    }
                }
                l7Var = new l7(this, (c71.c) cVar);
                Object obj3 = l7Var.v;
                Object obj22 = b71.a.r;
                i = l7Var.x;
                if (i != 0) {
                }
                q3Var = (oj0.q3) obj3;
                com.github.service.wrapper.bShadow bVar2 = this.t;
                if (q3Var == null) {
                }
                return y71.n1.y(new aq.c(new y71.y(in.r.h(d), new m7(this, null, 0), 6), 13), this.u);
            default:
                if (cVar instanceof vb0.q5) {
                    q5Var = (vb0.q5) cVar;
                    int i4 = q5Var.x;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        q5Var.x = i4 - Integer.MIN_VALUE;
                        Object obj4 = q5Var.v;
                        Object obj5 = b71.a.r;
                        i2 = q5Var.x;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            q5Var.u = str;
                            q5Var.x = 1;
                            obj4 = O(str, true, q5Var);
                            if (obj4 == obj5) {
                                return obj5;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = q5Var.u;
                            sy.y.j(obj4);
                        }
                        m3Var = (w80.m3) obj4;
                        com.github.service.wrapper.bShadow bVar3 = this.t;
                        if (m3Var == null) {
                            u10.v1 v1Var2 = new u10.v1(str);
                            String str3 = m3Var.a;
                            d2 = bVar3.k(v1Var2, new u10.t1(new u10.r1(new u10.u1(str3, new ja0.a(m3Var.b, str3), m3Var))));
                        } else {
                            d2 = bVar3.d(new u10.v1(str));
                        }
                        return y71.n1.y(new tw0.i(new y71.y(in.r.h(d2), new m7(this, null, 4), 6), 6), this.u);
                    }
                }
                q5Var = new vb0.q5(this, (c71.c) cVar);
                Object obj42 = q5Var.v;
                Object obj52 = b71.a.r;
                i2 = q5Var.x;
                if (i2 != 0) {
                }
                m3Var = (w80.m3) obj42;
                com.github.service.wrapper.bShadow bVar32 = this.t;
                if (m3Var == null) {
                }
                return y71.n1.y(new tw0.i(new y71.y(in.r.h(d2), new m7(this, null, 4), 6), 6), this.u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    @Override // z01.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(String str, a71.c cVar) {
        t8 t8Var;
        int i;
        oj0.q3 q3Var;
        y71.i d;
        vb0.n6 n6Var;
        int i2;
        w80.m3 m3Var;
        y71.i d2;
        switch (this.r) {
            case 0:
                if (cVar instanceof t8) {
                    t8Var = (t8) cVar;
                    int i3 = t8Var.x;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        t8Var.x = i3 - Integer.MIN_VALUE;
                        Object obj = t8Var.v;
                        Object obj2 = b71.a.r;
                        i = t8Var.x;
                        if (i != 0) {
                            sy.y.j(obj);
                            t8Var.u = str;
                            t8Var.x = 1;
                            obj = P(str, false, t8Var);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = t8Var.u;
                            sy.y.j(obj);
                        }
                        q3Var = (oj0.q3) obj;
                        com.github.service.wrapper.bShadow bVar = this.t;
                        if (q3Var == null) {
                            yr yrVar = new yr(str);
                            String str2 = q3Var.a;
                            d = bVar.k(yrVar, new vr(new wr(new xr(str2, new bl0.a(q3Var.b, str2), q3Var))));
                        } else {
                            d = bVar.d(new yr(str));
                        }
                        return y71.n1.y(new aq.c(new y71.y(in.r.h(d), new v4(this, str, null, 2), 6), 14), this.u);
                    }
                }
                t8Var = new t8(this, (c71.c) cVar);
                Object obj3 = t8Var.v;
                Object obj22 = b71.a.r;
                i = t8Var.x;
                if (i != 0) {
                }
                q3Var = (oj0.q3) obj3;
                com.github.service.wrapper.bShadow bVar2 = this.t;
                if (q3Var == null) {
                }
                return y71.n1.y(new aq.c(new y71.y(in.r.h(d), new v4(this, str, null, 2), 6), 14), this.u);
            default:
                if (cVar instanceof vb0.n6) {
                    n6Var = (vb0.n6) cVar;
                    int i4 = n6Var.x;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        n6Var.x = i4 - Integer.MIN_VALUE;
                        Object obj4 = n6Var.v;
                        Object obj5 = b71.a.r;
                        i2 = n6Var.x;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            n6Var.u = str;
                            n6Var.x = 1;
                            obj4 = O(str, false, n6Var);
                            if (obj4 == obj5) {
                                return obj5;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = n6Var.u;
                            sy.y.j(obj4);
                        }
                        m3Var = (w80.m3) obj4;
                        com.github.service.wrapper.bShadow bVar3 = this.t;
                        if (m3Var == null) {
                            uq uqVar = new uq(str);
                            String str3 = m3Var.a;
                            d2 = bVar3.k(uqVar, new rq(new sq(new tq(str3, new ja0.a(m3Var.b, str3), m3Var))));
                        } else {
                            d2 = bVar3.d(new uq(str));
                        }
                        return y71.n1.y(new tw0.i(new y71.y(in.r.h(d2), new v4(this, str, null, 13), 6), 7), this.u);
                    }
                }
                n6Var = new vb0.n6(this, (c71.c) cVar);
                Object obj42 = n6Var.v;
                Object obj52 = b71.a.r;
                i2 = n6Var.x;
                if (i2 != 0) {
                }
                m3Var = (w80.m3) obj42;
                com.github.service.wrapper.bShadow bVar32 = this.t;
                if (m3Var == null) {
                }
                return y71.n1.y(new tw0.i(new y71.y(in.r.h(d2), new v4(this, str, null, 13), 6), 7), this.u);
        }
    }

    @Override // z01.g1
    public final y71.i z(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryId");
                return y71.n1.y(new c8(y71.n1.I(com.github.service.wrapper.b.n(this.t, new nm0.c(), str), new c00.m((a71.c) null, this, str, 10)), 0), this.u);
            default:
                k71.k.g(str, "repositoryId");
                return y71.n1.y(new c8(y71.n1.I(com.github.service.wrapper.b.n(this.t, new rb0.b(0), str), new c00.m((a71.c) null, this, str, 15)), 7), this.u);
        }
    }
}
