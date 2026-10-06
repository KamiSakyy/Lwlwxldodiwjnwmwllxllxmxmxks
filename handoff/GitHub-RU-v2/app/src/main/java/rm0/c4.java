package rm0;

import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.ArrayList;
import jn0.nk;
import jn0.s60;
import jn0.yf0;
import kc0.wi;
import kc0.yb0;
import kc0.z20;
import kotlin.NoWhenBranchMatchedException;
import u10.b10;
import u10.uh;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c4 implements z01.f0, yb0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final com.github.service.wrapper.bShadow t;
    public final v71.v u;

    public c4(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (r3.p(r8, r10, r1, r4) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r2 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(c4 c4Var, String str, int i, c71.c cVar) {
        a4 a4Var;
        int i2;
        int i3;
        mg0.m mVar;
        String str2 = str;
        com.github.service.wrapper.bShadow bVar = c4Var.t;
        if (cVar instanceof a4) {
            a4Var = (a4) cVar;
            int i4 = a4Var.y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                a4Var.y = i4 - Integer.MIN_VALUE;
                Object obj = a4Var.w;
                b71.a aVar = b71.a.r;
                i2 = a4Var.y;
                if (i2 != 0) {
                    sy.y.j(obj);
                    mg0.o oVar = new mg0.o();
                    a4Var.u = str2;
                    i3 = i;
                    a4Var.v = i3;
                    a4Var.y = 1;
                    obj = bVar.c(oVar, str2);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = a4Var.u;
                        sy.y.j(obj);
                        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new dl0.f(str2), null, false, null, null, 62)), c4Var.u);
                    }
                    int i5 = a4Var.v;
                    String str3 = a4Var.u;
                    sy.y.j(obj);
                    i3 = i5;
                    str2 = str3;
                }
                mVar = (mg0.m) obj;
                if (mVar != null) {
                    mg0.o oVar2 = new mg0.o();
                    mg0.m mVar2 = new mg0.m(mVar.a, mVar.b, mVar.c, mVar.d, mVar.e, mVar.f, mVar.g, mVar.h, mVar.i, mVar.j, mVar.k, mVar.l, mVar.m, mVar.n != null ? new mg0.h(i3) : null, mVar.o, mVar.p);
                    a4Var.u = str2;
                    a4Var.v = i3;
                    a4Var.y = 2;
                }
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new dl0.f(str2), null, false, null, null, 62)), c4Var.u);
            }
        }
        a4Var = new a4(c4Var, cVar);
        Object obj2 = a4Var.w;
        b71.a aVar2 = b71.a.r;
        i2 = a4Var.y;
        if (i2 != 0) {
        }
        mVar = (mg0.m) obj2;
        if (mVar != null) {
        }
        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new dl0.f(str2), null, false, null, null, 62)), c4Var.u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        if (r3.p(r8, r10, r1, r4) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r2 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(c4 c4Var, String str, int i, c71.c cVar) {
        vb0.w2Shadow w2Var;
        int i2;
        int i3;
        w50.l lVar;
        String str2 = str;
        com.github.service.wrapper.bShadow bVar = c4Var.t;
        if (cVar instanceof vb0.w2) {
            w2Var = (vb0.w2) cVar;
            int i4 = w2Var.y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                w2Var.y = i4 - Integer.MIN_VALUE;
                Object obj = w2Var.w;
                b71.a aVar = b71.a.r;
                i2 = w2Var.y;
                if (i2 != 0) {
                    sy.y.j(obj);
                    aa.i0 mVar = new w50.m(0);
                    w2Var.u = str2;
                    i3 = i;
                    w2Var.v = i3;
                    w2Var.y = 1;
                    obj = bVar.c(mVar, str2);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = w2Var.u;
                        sy.y.j(obj);
                        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new na0.f(str2), null, false, null, null, 62)), c4Var.u);
                    }
                    int i5 = w2Var.v;
                    String str3 = w2Var.u;
                    sy.y.j(obj);
                    i3 = i5;
                    str2 = str3;
                }
                lVar = (w50.l) obj;
                if (lVar != null) {
                    aa.i0 mVar2 = new w50.m(0);
                    aa.h0Shadow lVar2 = new w50.l(lVar.a, lVar.b, lVar.c, lVar.d, lVar.e, lVar.f, lVar.g, lVar.h, lVar.i, lVar.j, lVar.k, lVar.l, lVar.m, lVar.n != null ? new w50.g(i3) : null, lVar.o, lVar.p);
                    w2Var.u = str2;
                    w2Var.v = i3;
                    w2Var.y = 2;
                }
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new na0.f(str2), null, false, null, null, 62)), c4Var.u);
            }
        }
        w2Var = new vb0.w2(c4Var, cVar);
        Object obj2 = w2Var.w;
        b71.a aVar2 = b71.a.r;
        i2 = w2Var.y;
        if (i2 != 0) {
        }
        lVar = (w50.l) obj2;
        if (lVar != null) {
        }
        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new na0.f(str2), null, false, null, null, 62)), c4Var.u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
    
        if (r3.p(r8, r10, r1, r4) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r2 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(c4 c4Var, String str, int i, c71.c cVar) {
        wy0.b3 b3Var;
        int i2;
        int i3;
        ur0.o oVar;
        String str2 = str;
        com.github.service.wrapper.bShadow bVar = c4Var.t;
        if (cVar instanceof wy0.b3) {
            b3Var = (wy0.b3) cVar;
            int i4 = b3Var.y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                b3Var.y = i4 - Integer.MIN_VALUE;
                Object obj = b3Var.w;
                b71.a aVar = b71.a.r;
                i2 = b3Var.y;
                if (i2 != 0) {
                    sy.y.j(obj);
                    ur0.q qVar = new ur0.q();
                    b3Var.u = str2;
                    i3 = i;
                    b3Var.v = i3;
                    b3Var.y = 1;
                    obj = bVar.c(qVar, str2);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = b3Var.u;
                        sy.y.j(obj);
                        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new ow0.f(str2), null, false, null, null, 62)), c4Var.u);
                    }
                    int i5 = b3Var.v;
                    String str3 = b3Var.u;
                    sy.y.j(obj);
                    i3 = i5;
                    str2 = str3;
                }
                oVar = (ur0.o) obj;
                if (oVar != null) {
                    ur0.q qVar2 = new ur0.q();
                    ur0.o oVar2 = new ur0.o(oVar.a, oVar.b, oVar.c, oVar.d, oVar.e, oVar.f, oVar.g, oVar.h, oVar.i, oVar.j, oVar.k, oVar.l, oVar.m, oVar.n != null ? new ur0.h(i3) : null, oVar.o, oVar.p, oVar.q, oVar.r, oVar.s);
                    b3Var.u = str2;
                    b3Var.v = i3;
                    b3Var.y = 2;
                }
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new ow0.f(str2), null, false, null, null, 62)), c4Var.u);
            }
        }
        b3Var = new wy0.b3(c4Var, cVar);
        Object obj2 = b3Var.w;
        b71.a aVar2 = b71.a.r;
        i2 = b3Var.y;
        if (i2 != 0) {
        }
        oVar = (ur0.o) obj2;
        if (oVar != null) {
        }
        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new ow0.f(str2), null, false, null, null, 62)), c4Var.u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
    
        if (r3.p(r8, r10, r1, r4) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r2 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(c4 c4Var, String str, int i, c71.c cVar) {
        b4 b4Var;
        int i2;
        int i3;
        ri0.p2 p2Var;
        String str2 = str;
        com.github.service.wrapper.bShadow bVar = c4Var.t;
        if (cVar instanceof b4) {
            b4Var = (b4) cVar;
            int i4 = b4Var.y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                b4Var.y = i4 - Integer.MIN_VALUE;
                Object obj = b4Var.w;
                b71.a aVar = b71.a.r;
                i2 = b4Var.y;
                if (i2 != 0) {
                    sy.y.j(obj);
                    ri0.r2 r2Var = new ri0.r2();
                    b4Var.u = str2;
                    i3 = i;
                    b4Var.v = i3;
                    b4Var.y = 1;
                    obj = bVar.c(r2Var, str2);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = b4Var.u;
                        sy.y.j(obj);
                        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new dl0.f(str2), null, false, null, null, 62)), c4Var.u);
                    }
                    int i5 = b4Var.v;
                    String str3 = b4Var.u;
                    sy.y.j(obj);
                    i3 = i5;
                    str2 = str3;
                }
                p2Var = (ri0.p2) obj;
                if (p2Var != null) {
                    ri0.r2 r2Var2 = new ri0.r2();
                    ri0.p2 p2Var2 = new ri0.p2(p2Var.a, p2Var.b, p2Var.c, p2Var.d, p2Var.e, p2Var.f, p2Var.g, p2Var.h, p2Var.i, p2Var.j, p2Var.k, p2Var.l, p2Var.m, p2Var.n, p2Var.o, p2Var.p, p2Var.q, p2Var.r, p2Var.s != null ? new ri0.d2(i3) : null, p2Var.t, p2Var.u, p2Var.v, p2Var.w, p2Var.x);
                    b4Var.u = str2;
                    b4Var.v = i3;
                    b4Var.y = 2;
                }
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new dl0.f(str2), null, false, null, null, 62)), c4Var.u);
            }
        }
        b4Var = new b4(c4Var, cVar);
        Object obj2 = b4Var.w;
        b71.a aVar2 = b71.a.r;
        i2 = b4Var.y;
        if (i2 != 0) {
        }
        p2Var = (ri0.p2) obj2;
        if (p2Var != null) {
        }
        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new dl0.f(str2), null, false, null, null, 62)), c4Var.u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d1, code lost:
    
        if (r3.p(r8, r10, r1, r4) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r2 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(c4 c4Var, String str, int i, c71.c cVar) {
        vb0.x2 x2Var;
        int i2;
        int i3;
        z70.l2 l2Var;
        String str2 = str;
        com.github.service.wrapper.bShadow bVar = c4Var.t;
        if (cVar instanceof vb0.x2) {
            x2Var = (vb0.x2) cVar;
            int i4 = x2Var.y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x2Var.y = i4 - Integer.MIN_VALUE;
                Object obj = x2Var.w;
                b71.a aVar = b71.a.r;
                i2 = x2Var.y;
                if (i2 != 0) {
                    sy.y.j(obj);
                    aa.i0 m2Var = new z70.m2(0);
                    x2Var.u = str2;
                    i3 = i;
                    x2Var.v = i3;
                    x2Var.y = 1;
                    obj = bVar.c(m2Var, str2);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = x2Var.u;
                        sy.y.j(obj);
                        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new na0.f(str2), null, false, null, null, 62)), c4Var.u);
                    }
                    int i5 = x2Var.v;
                    String str3 = x2Var.u;
                    sy.y.j(obj);
                    i3 = i5;
                    str2 = str3;
                }
                l2Var = (z70.l2) obj;
                if (l2Var != null) {
                    aa.i0 m2Var2 = new z70.m2(0);
                    aa.h0Shadow l2Var2 = new z70.l2(l2Var.a, l2Var.b, l2Var.c, l2Var.d, l2Var.e, l2Var.f, l2Var.g, l2Var.h, l2Var.i, l2Var.j, l2Var.k, l2Var.l, l2Var.m, l2Var.n, l2Var.o, l2Var.p, l2Var.q, l2Var.r, l2Var.s != null ? new z70.b2(i3) : null, l2Var.t, l2Var.u);
                    x2Var.u = str2;
                    x2Var.v = i3;
                    x2Var.y = 2;
                }
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new na0.f(str2), null, false, null, null, 62)), c4Var.u);
            }
        }
        x2Var = new vb0.x2(c4Var, cVar);
        Object obj2 = x2Var.w;
        b71.a aVar2 = b71.a.r;
        i2 = x2Var.y;
        if (i2 != 0) {
        }
        l2Var = (z70.l2) obj2;
        if (l2Var != null) {
        }
        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new na0.f(str2), null, false, null, null, 62)), c4Var.u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
    
        if (r3.p(r8, r10, r1, r4) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r2 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(c4 c4Var, String str, int i, c71.c cVar) {
        wy0.c3 c3Var;
        int i2;
        int i3;
        xt0.p2 p2Var;
        String str2 = str;
        com.github.service.wrapper.bShadow bVar = c4Var.t;
        if (cVar instanceof wy0.c3) {
            c3Var = (wy0.c3) cVar;
            int i4 = c3Var.y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c3Var.y = i4 - Integer.MIN_VALUE;
                Object obj = c3Var.w;
                b71.a aVar = b71.a.r;
                i2 = c3Var.y;
                if (i2 != 0) {
                    sy.y.j(obj);
                    xt0.r2 r2Var = new xt0.r2();
                    c3Var.u = str2;
                    i3 = i;
                    c3Var.v = i3;
                    c3Var.y = 1;
                    obj = bVar.c(r2Var, str2);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = c3Var.u;
                        sy.y.j(obj);
                        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new ow0.f(str2), null, false, null, null, 62)), c4Var.u);
                    }
                    int i5 = c3Var.v;
                    String str3 = c3Var.u;
                    sy.y.j(obj);
                    i3 = i5;
                    str2 = str3;
                }
                p2Var = (xt0.p2) obj;
                if (p2Var != null) {
                    xt0.r2 r2Var2 = new xt0.r2();
                    xt0.p2 p2Var2 = new xt0.p2(p2Var.a, p2Var.b, p2Var.c, p2Var.d, p2Var.e, p2Var.f, p2Var.g, p2Var.h, p2Var.i, p2Var.j, p2Var.k, p2Var.l, p2Var.m, p2Var.n, p2Var.o, p2Var.p, p2Var.q, p2Var.r, p2Var.s != null ? new xt0.d2(i3) : null, p2Var.t, p2Var.u, p2Var.v, p2Var.w, p2Var.x);
                    c3Var.u = str2;
                    c3Var.v = i3;
                    c3Var.y = 2;
                }
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new ow0.f(str2), null, false, null, null, 62)), c4Var.u);
            }
        }
        c3Var = new wy0.c3(c4Var, cVar);
        Object obj2 = c3Var.w;
        b71.a aVar2 = b71.a.r;
        i2 = c3Var.y;
        if (i2 != 0) {
        }
        p2Var = (xt0.p2) obj2;
        if (p2Var != null) {
        }
        return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(c4Var.t, new ow0.f(str2), null, false, null, null, 62)), c4Var.u);
    }

    @Override // z01.f0
    public final Object a(String str) {
        switch (this.r) {
            case 0:
                return in.r.l(y71.n1.y(in.r.h(this.s.d(new wi(str))), this.u));
            case 1:
                return in.r.l(y71.n1.y(in.r.h(this.s.d(new uh(str))), this.u));
            default:
                return in.r.l(y71.n1.y(in.r.h(this.s.d(new nk(str))), this.u));
        }
    }

    @Override // z01.f0
    public final y71.i b(String str, int i, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new dl0.k(str, str2, i, new aa.u0(Integer.valueOf(i))), null, false, null, null, 62)), this.u);
            case 1:
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new na0.k(str, str2, i, new aa.u0(Integer.valueOf(i))), null, false, null, null, 62)), this.u);
            default:
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new ow0.o(str, str2, i, new aa.u0(Integer.valueOf(i))), null, false, null, null, 62)), this.u);
        }
    }

    @Override // z01.f0
    public final y71.i c(String str, int i, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new r3Shadow(1, com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.b.q(this.t, new dl0.k(str, str2, i, new aa.u0(Integer.valueOf(i))), ga.h.t, false, null, null, new bd.m(str, 8), new s(4), 28)), this), this.u);
            case 1:
                return y71.n1.y(new r3Shadow(12, com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.b.q(this.t, new na0.k(str, str2, i, new aa.u0(Integer.valueOf(i))), ga.h.t, false, null, null, new bd.m(str, 8), new v00.n(15), 28)), this), this.u);
            default:
                return y71.n1.y(new r3Shadow(15, com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.b.q(this.t, new ow0.o(str, str2, i, new aa.u0(Integer.valueOf(i))), ga.h.t, false, null, null, new bd.m(str, 8), new wa.g(21), 28)), this), this.u);
        }
    }

    @Override // z01.f0
    public final y71.i d(String str, ArrayList arrayList, ProjectsMetaInfo projectsMetaInfo) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "pullRequestId");
                return y71.n1.y(y71.n1.x(new v3(this, str, null, 0), new o3(in.r.h(this.s.d(new dl0.p(str, arrayList))), 1)), this.u);
            case 1:
                k71.k.g(str, "pullRequestId");
                return y71.n1.y(y71.n1.x(new vb0.q2(this, str, null, 0), new vb0.p1(in.r.h(this.s.d(new na0.p(str, arrayList))), 5)), this.u);
            default:
                k71.k.g(str, "pullRequestId");
                return y71.n1.y(y71.n1.I(y71.n1.x(new wy0.t2(this, str, null, 0), new wy0.h1(in.r.h(this.s.d(new ow0.t(str, arrayList))), 4)), new wy0.q2(null, projectsMetaInfo, this, 0)), this.u);
        }
    }

    @Override // z01.f0
    public final y71.i e(String str, int i, String str2) {
        switch (this.r) {
            case 0:
                return y41.t1.S("fetchViewerMergeActions", "3.12");
            case 1:
                return y41.t1.S("fetchViewerMergeActions", "3.10");
            default:
                return y41.t1.S("fetchViewerMergeActions", "3.17");
        }
    }

    @Override // z01.f0
    public final y71.i f(String str, ArrayList arrayList, ProjectsMetaInfo projectsMetaInfo) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "issueId");
                return y71.n1.y(y71.n1.x(new v3(this, str, null, 1), new o3(in.r.h(this.s.d(new dl0.p(str, arrayList))), 2)), this.u);
            case 1:
                k71.k.g(str, "issueId");
                return y71.n1.y(y71.n1.x(new vb0.q2(this, str, null, 1), new vb0.p1(in.r.h(this.s.d(new na0.p(str, arrayList))), 6)), this.u);
            default:
                k71.k.g(str, "issueId");
                return y71.n1.y(y71.n1.I(y71.n1.x(new wy0.t2(this, str, null, 1), new wy0.h1(in.r.h(this.s.d(new ow0.t(str, arrayList))), 5)), new wy0.q2(null, projectsMetaInfo, this, 1)), this.u);
        }
    }

    @Override // z01.f0
    public final y71.i g(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "issueId");
                return y41.t1.S("observeSubIssueData", "3.12");
            case 1:
                k71.k.g(str, "issueId");
                return y41.t1.S("observeSubIssueData", "3.10");
            default:
                k71.k.g(str, "issueId");
                return y71.n1.y(new vm0.h(com.github.service.wrapper.b.a(this.t, new ow0.r0(str), ga.h.t, false, null, 60), 23), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    @Override // z01.f0
    public final y71.i i(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "issuePrId");
                return new t00.f8(21, w61.a0.a);
            case 1:
                k71.k.g(str, "issuePrId");
                return new t00.f8(21, w61.a0.a);
            default:
                k71.k.g(str, "issuePrId");
                return y71.n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new ow0.j(str), ga.h.t, false, null, null, 60)), this.u);
        }
    }

    @Override // z01.f0
    public final y71.i j(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("observeStatusChecks", "3.12");
            case 1:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("observeStatusChecks", "3.10");
            default:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("observeStatusChecks", "3.17");
        }
    }

    @Override // z01.f0
    public final y71.i k(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("refreshStatusChecks", "3.12");
            case 1:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("refreshStatusChecks", "3.10");
            default:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("refreshStatusChecks", "3.17");
        }
    }

    @Override // z01.f0
    public final y71.i l(String str, int i, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new dl0.p0(str, str2, i, null, new aa.u0(30), null, null, null, 232), null, false, null, null, 62), 5), this.u);
            case 1:
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new na0.p0(str, str2, i, (aa1.b) null, new aa.u0(30), (aa1.b) null, (aa.u0) null, (aa.u0) null, 232), null, false, null, null, 62), 3), this.u);
            default:
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new ow0.y0(str, str2, i, null, new aa.u0(30), null, null, null, 232), null, false, null, null, 62), 22), this.u);
        }
    }

    @Override // z01.f0
    public final y71.i m(String str, String str2, int i, String str3, z01.b0 b0Var) {
        dl0.p0 p0Var;
        na0.p0 p0Var2;
        ow0.y0 y0Var;
        ow0.y0 y0Var2;
        switch (this.r) {
            case 0:
                int ordinal = b0Var.ordinal();
                aa1.bShadow bVar = aa.t0.d;
                if (ordinal == 0) {
                    if (str3 != null) {
                        bVar = new aa.u0(str3);
                    }
                    p0Var = new dl0.p0(str, str2, i, bVar, new aa.u0(30), null, null, null, 224);
                } else if (ordinal == 1) {
                    if (str3 != null) {
                        bVar = new aa.u0(str3);
                    }
                    p0Var = new dl0.p0(str, str2, i, null, null, bVar, new aa.u0(30), null, 152);
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p0Var = new dl0.p0(str, str2, i, null, null, null, new aa.u0(30), new aa.u0(str3), 56);
                }
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, p0Var, null, false, null, null, 62), 4), this.u);
            case 1:
                int ordinal2 = b0Var.ordinal();
                aa1.bShadow bVar2 = aa.t0.d;
                if (ordinal2 == 0) {
                    if (str3 != null) {
                        bVar2 = new aa.u0(str3);
                    }
                    p0Var2 = new na0.p0(str, str2, i, bVar2, new aa.u0(30), (aa1.b) null, (aa.u0) null, (aa.u0) null, 224);
                } else if (ordinal2 == 1) {
                    if (str3 != null) {
                        bVar2 = new aa.u0(str3);
                    }
                    p0Var2 = new na0.p0(str, str2, i, (aa1.b) null, (aa.u0) null, bVar2, new aa.u0(30), (aa.u0) null, 152);
                } else {
                    if (ordinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p0Var2 = new na0.p0(str, str2, i, (aa1.b) null, (aa.u0) null, (aa1.b) null, new aa.u0(30), new aa.u0(str3), 56);
                }
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, p0Var2, null, false, null, null, 62), 2), this.u);
            default:
                int ordinal3 = b0Var.ordinal();
                aa1.bShadow bVar3 = aa.t0.d;
                if (ordinal3 == 0) {
                    if (str3 != null) {
                        bVar3 = new aa.u0(str3);
                    }
                    y0Var = new ow0.y0(str, str2, i, bVar3, new aa.u0(30), null, null, null, 224);
                } else {
                    if (ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y0Var2 = new ow0.y0(str, str2, i, null, null, null, new aa.u0(30), new aa.u0(str3), 56);
                        return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, y0Var2, null, false, null, null, 62), 21), this.u);
                    }
                    if (str3 != null) {
                        bVar3 = new aa.u0(str3);
                    }
                    y0Var = new ow0.y0(str, str2, i, null, null, bVar3, new aa.u0(30), null, 152);
                }
                y0Var2 = y0Var;
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, y0Var2, null, false, null, null, 62), 21), this.u);
        }
    }

    @Override // z01.f0
    public final y71.i n(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("loadStatusChecksNextPage", "3.12");
            case 1:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("loadStatusChecksNextPage", "3.10");
            default:
                k71.k.g(str, "pullRequestId");
                return y41.t1.S("loadStatusChecksNextPage", "3.17");
        }
    }

    @Override // z01.f0
    public final y71.i o(int i, String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "url");
                return y71.n1.y(new r3Shadow(0, com.github.service.wrapper.a.o(this.s, new z20(i, str, str2, str3), null, false, null, null, 62), this), this.u);
            case 1:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "url");
                return y71.n1.y(new r3Shadow(11, com.github.service.wrapper.a.o(this.s, new b10(i, str, str2, str3), null, false, null, null, 62), this), this.u);
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "url");
                return y71.n1.y(new r3Shadow(14, com.github.service.wrapper.a.o(this.s, new s60(i, str, str2, str3), null, false, null, null, 62), this), this.u);
        }
    }
}
