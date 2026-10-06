package rm0;

import com.github.service.models.BlockDuration;
import com.github.service.models.HideCommentReason;
import com.github.service.models.response.type.MinimizedStateReason;
import hc0.yo;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.aq;
import jn0.bq;
import jn0.cq;
import jn0.dq;
import jn0.i70;
import jn0.jq;
import jn0.kq;
import jn0.sp;
import jn0.tp;
import jn0.vp;
import jn0.yf0;
import jn0.yp;
import jn0.zp;
import jo.as;
import jo.gs;
import jo.hs;
import jo.mi0;
import jo.pr;
import jo.qr;
import jo.sr;
import jo.v90;
import jo.vr;
import jo.wr;
import jo.xr;
import jo.yr;
import jo.zr;
import kc0.ao;
import kc0.bo;
import kc0.eo;
import kc0.ho;
import kc0.io;
import kc0.jo;
import kc0.ko;
import kc0.lo;
import kc0.mo;
import kc0.p30;
import kc0.so;
import kc0.to;
import kc0.yb0;
import kotlin.NoWhenBranchMatchedException;
import m10.g30;
import pz0.hx;
import u10.cn;
import u10.dn;
import u10.en;
import u10.fn;
import u10.gn;
import u10.hn;
import u10.nn;
import u10.on;
import u10.r10;
import u10.wm;
import u10.xm;
import u10.y90;
import u10.zm;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements z01.d, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.bShadow t;
    public v71.v u;

    public o(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r0.p(r7, r5, r6, r1) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
    
        if (r5 == r9) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(o oVar, String str, String str2, boolean z, c71.c cVar) {
        j jVar;
        int i;
        uf0.a0 a0Var;
        uf0.k0 k0Var;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i2 = jVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.z = i2 - Integer.MIN_VALUE;
                Object obj = jVar.x;
                b71.a aVar = b71.a.r;
                i = jVar.z;
                if (i != 0) {
                    sy.y.j(obj);
                    uf0.c0 c0Var = new uf0.c0();
                    jVar.u = str;
                    jVar.v = str2;
                    jVar.w = z;
                    jVar.z = 1;
                    obj = bVar.c(c0Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z = jVar.w;
                    str2 = jVar.v;
                    str = jVar.u;
                    sy.y.j(obj);
                }
                a0Var = (uf0.a0) obj;
                if (a0Var != null) {
                    uf0.h0Shadow h0Var = a0Var.k.q;
                    if (k71.k.b((h0Var == null || (k0Var = h0Var.b) == null) ? null : k0Var.a, str2)) {
                        a0Var = uf0.a0.a(a0Var, null, yh0.a.a(a0Var.m, !z, z), 4095);
                    }
                    uf0.c0 c0Var2 = new uf0.c0();
                    jVar.u = null;
                    jVar.v = null;
                    jVar.w = z;
                    jVar.z = 2;
                }
                return w61.a0.a;
            }
        }
        jVar = new j(oVar, cVar);
        Object obj2 = jVar.x;
        b71.a aVar2 = b71.a.r;
        i = jVar.z;
        if (i != 0) {
        }
        a0Var = (uf0.a0) obj2;
        if (a0Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r0.p(r7, r5, r6, r1) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
    
        if (r5 == r9) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(o oVar, String str, String str2, boolean z, c71.c cVar) {
        t00.o oVar2;
        int i;
        is.a0 a0Var;
        is.k0 k0Var;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof t00.o) {
            oVar2 = (t00.o) cVar;
            int i2 = oVar2.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar2.z = i2 - Integer.MIN_VALUE;
                Object obj = oVar2.x;
                b71.a aVar = b71.a.r;
                i = oVar2.z;
                if (i != 0) {
                    sy.y.j(obj);
                    is.c0 c0Var = new is.c0();
                    oVar2.u = str;
                    oVar2.v = str2;
                    oVar2.w = z;
                    oVar2.z = 1;
                    obj = bVar.c(c0Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z = oVar2.w;
                    str2 = oVar2.v;
                    str = oVar2.u;
                    sy.y.j(obj);
                }
                a0Var = (is.a0) obj;
                if (a0Var != null) {
                    is.h0Shadow h0Var = a0Var.k.q;
                    if (k71.k.b((h0Var == null || (k0Var = h0Var.b) == null) ? null : k0Var.a, str2)) {
                        a0Var = is.a0.a(a0Var, (is.p0) null, pu.a.a(a0Var.m, !z, z), 4095);
                    }
                    is.c0 c0Var2 = new is.c0();
                    oVar2.u = null;
                    oVar2.v = null;
                    oVar2.w = z;
                    oVar2.z = 2;
                }
                return w61.a0.a;
            }
        }
        oVar2 = new t00.o(oVar, cVar);
        Object obj2 = oVar2.x;
        b71.a aVar2 = b71.a.r;
        i = oVar2.z;
        if (i != 0) {
        }
        a0Var = (is.a0) obj2;
        if (a0Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r0.p(r7, r5, r6, r1) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r5 == r9) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(o oVar, String str, String str2, boolean z, c71.c cVar) {
        vb0.g gVar;
        int i;
        aa.h0Shadow h0Var;
        e50.g0 g0Var;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof vb0.g) {
            gVar = (vb0.g) cVar;
            int i2 = gVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.z = i2 - Integer.MIN_VALUE;
                Object obj = gVar.x;
                b71.a aVar = b71.a.r;
                i = gVar.z;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.i0 yVar = new e50.y(0);
                    gVar.u = str;
                    gVar.v = str2;
                    gVar.w = z;
                    gVar.z = 1;
                    obj = bVar.c(yVar, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z = gVar.w;
                    str2 = gVar.v;
                    str = gVar.u;
                    sy.y.j(obj);
                }
                h0Var = (e50.x) obj;
                if (h0Var != null) {
                    e50.d0 d0Var = ((e50.x) h0Var).k.q;
                    if (k71.k.b((d0Var == null || (g0Var = d0Var.b) == null) ? null : g0Var.a, str2)) {
                        h0Var = e50.x.a(h0Var, (e50.l0) null, g70.a.a(((e50.x) h0Var).m, !z, z), 4095);
                    }
                    aa.i0 yVar2 = new e50.y(0);
                    gVar.u = null;
                    gVar.v = null;
                    gVar.w = z;
                    gVar.z = 2;
                }
                return w61.a0.a;
            }
        }
        gVar = new vb0.g(oVar, cVar);
        Object obj2 = gVar.x;
        b71.a aVar2 = b71.a.r;
        i = gVar.z;
        if (i != 0) {
        }
        h0Var = (e50.x) obj2;
        if (h0Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r0.p(r7, r5, r6, r1) == r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
    
        if (r5 == r9) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(o oVar, String str, String str2, boolean z, c71.c cVar) {
        wy0.j jVar;
        int i;
        ar0.a0 a0Var;
        ar0.k0 k0Var;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof wy0.j) {
            jVar = (wy0.j) cVar;
            int i2 = jVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.z = i2 - Integer.MIN_VALUE;
                Object obj = jVar.x;
                b71.a aVar = b71.a.r;
                i = jVar.z;
                if (i != 0) {
                    sy.y.j(obj);
                    ar0.c0 c0Var = new ar0.c0();
                    jVar.u = str;
                    jVar.v = str2;
                    jVar.w = z;
                    jVar.z = 1;
                    obj = bVar.c(c0Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z = jVar.w;
                    str2 = jVar.v;
                    str = jVar.u;
                    sy.y.j(obj);
                }
                a0Var = (ar0.a0) obj;
                if (a0Var != null) {
                    ar0.h0Shadow h0Var = a0Var.k.q;
                    if (k71.k.b((h0Var == null || (k0Var = h0Var.b) == null) ? null : k0Var.a, str2)) {
                        a0Var = ar0.a0.a(a0Var, null, gt0.a.a(a0Var.m, !z, z), 4095);
                    }
                    ar0.c0 c0Var2 = new ar0.c0();
                    jVar.u = null;
                    jVar.v = null;
                    jVar.w = z;
                    jVar.z = 2;
                }
                return w61.a0.a;
            }
        }
        jVar = new wy0.j(oVar, cVar);
        Object obj2 = jVar.x;
        b71.a aVar2 = b71.a.r;
        i = jVar.z;
        if (i != 0) {
        }
        a0Var = (ar0.a0) obj2;
        if (a0Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r9 == r13) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(o oVar, String str, String str2, boolean z, c71.c cVar) {
        l lVar;
        int i;
        oj0.s sVar;
        oj0.q qVar;
        oj0.r rVar;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i2 = lVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.z = i2 - Integer.MIN_VALUE;
                Object obj = lVar.x;
                b71.a aVar = b71.a.r;
                i = lVar.z;
                w61.a0 a0Var = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    oj0.u uVar = new oj0.u();
                    lVar.u = str;
                    lVar.v = str2;
                    lVar.w = z;
                    lVar.z = 1;
                    obj = bVar.c(uVar, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    z = lVar.w;
                    str2 = lVar.v;
                    str = lVar.u;
                    sy.y.j(obj);
                }
                sVar = (oj0.s) obj;
                if (k71.k.b((sVar != null || (qVar = sVar.c) == null || (rVar = qVar.c) == null) ? null : rVar.a, str2)) {
                    oj0.u uVar2 = new oj0.u();
                    oj0.s sVar2 = new oj0.s(sVar.a, sVar.b, sVar.c, yh0.a.a(sVar.d, !z, z));
                    lVar.u = null;
                    lVar.v = null;
                    lVar.w = z;
                    lVar.z = 2;
                    if (bVar.p(uVar2, sVar2, str, lVar) == aVar) {
                        return aVar;
                    }
                }
                return a0Var;
            }
        }
        lVar = new l(oVar, cVar);
        Object obj2 = lVar.x;
        b71.a aVar2 = b71.a.r;
        i = lVar.z;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
        }
        sVar = (oj0.s) obj2;
        if (k71.k.b((sVar != null || (qVar = sVar.c) == null || (rVar = qVar.c) == null) ? null : rVar.a, str2)) {
        }
        return a0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r9 == r13) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(o oVar, String str, String str2, boolean z, c71.c cVar) {
        t00.q qVar;
        int i;
        dw.a0 a0Var;
        dw.y yVar;
        dw.z zVar;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof t00.q) {
            qVar = (t00.q) cVar;
            int i2 = qVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.z = i2 - Integer.MIN_VALUE;
                Object obj = qVar.x;
                b71.a aVar = b71.a.r;
                i = qVar.z;
                w61.a0 a0Var2 = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    dw.c0 c0Var = new dw.c0();
                    qVar.u = str;
                    qVar.v = str2;
                    qVar.w = z;
                    qVar.z = 1;
                    obj = bVar.c(c0Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var2;
                    }
                    z = qVar.w;
                    str2 = qVar.v;
                    str = qVar.u;
                    sy.y.j(obj);
                }
                a0Var = (dw.a0) obj;
                if (k71.k.b((a0Var != null || (yVar = a0Var.c) == null || (zVar = yVar.c) == null) ? null : zVar.a, str2)) {
                    dw.c0 c0Var2 = new dw.c0();
                    dw.a0 a0Var3 = new dw.a0(a0Var.a, a0Var.b, a0Var.c, pu.a.a(a0Var.d, !z, z));
                    qVar.u = null;
                    qVar.v = null;
                    qVar.w = z;
                    qVar.z = 2;
                    if (bVar.p(c0Var2, a0Var3, str, qVar) == aVar) {
                        return aVar;
                    }
                }
                return a0Var2;
            }
        }
        qVar = new t00.q(oVar, cVar);
        Object obj2 = qVar.x;
        b71.a aVar2 = b71.a.r;
        i = qVar.z;
        w61.a0 a0Var22 = w61.a0.a;
        if (i != 0) {
        }
        a0Var = (dw.a0) obj2;
        if (k71.k.b((a0Var != null || (yVar = a0Var.c) == null || (zVar = yVar.c) == null) ? null : zVar.a, str2)) {
        }
        return a0Var22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r9 == r13) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(o oVar, String str, String str2, boolean z, c71.c cVar) {
        vb0.i iVar;
        int i;
        w80.s sVar;
        w80.q qVar;
        w80.r rVar;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof vb0.i) {
            iVar = (vb0.i) cVar;
            int i2 = iVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.z = i2 - Integer.MIN_VALUE;
                Object obj = iVar.x;
                b71.a aVar = b71.a.r;
                i = iVar.z;
                w61.a0 a0Var = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.i0 tVar = new w80.t(0);
                    iVar.u = str;
                    iVar.v = str2;
                    iVar.w = z;
                    iVar.z = 1;
                    obj = bVar.c(tVar, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    z = iVar.w;
                    str2 = iVar.v;
                    str = iVar.u;
                    sy.y.j(obj);
                }
                sVar = (w80.s) obj;
                if (k71.k.b((sVar != null || (qVar = sVar.c) == null || (rVar = qVar.c) == null) ? null : rVar.a, str2)) {
                    aa.i0 tVar2 = new w80.t(0);
                    aa.h0Shadow sVar2 = new w80.s(sVar.a, sVar.b, sVar.c, g70.a.a(sVar.d, !z, z));
                    iVar.u = null;
                    iVar.v = null;
                    iVar.w = z;
                    iVar.z = 2;
                    if (bVar.p(tVar2, sVar2, str, iVar) == aVar) {
                        return aVar;
                    }
                }
                return a0Var;
            }
        }
        iVar = new vb0.i(oVar, cVar);
        Object obj2 = iVar.x;
        b71.a aVar2 = b71.a.r;
        i = iVar.z;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
        }
        sVar = (w80.s) obj2;
        if (k71.k.b((sVar != null || (qVar = sVar.c) == null || (rVar = qVar.c) == null) ? null : rVar.a, str2)) {
        }
        return a0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r9 == r13) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(o oVar, String str, String str2, boolean z, c71.c cVar) {
        wy0.l lVar;
        int i;
        uu0.a0 a0Var;
        uu0.y yVar;
        uu0.z zVar;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof wy0.l) {
            lVar = (wy0.l) cVar;
            int i2 = lVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.z = i2 - Integer.MIN_VALUE;
                Object obj = lVar.x;
                b71.a aVar = b71.a.r;
                i = lVar.z;
                w61.a0 a0Var2 = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    uu0.c0 c0Var = new uu0.c0();
                    lVar.u = str;
                    lVar.v = str2;
                    lVar.w = z;
                    lVar.z = 1;
                    obj = bVar.c(c0Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var2;
                    }
                    z = lVar.w;
                    str2 = lVar.v;
                    str = lVar.u;
                    sy.y.j(obj);
                }
                a0Var = (uu0.a0) obj;
                if (k71.k.b((a0Var != null || (yVar = a0Var.c) == null || (zVar = yVar.c) == null) ? null : zVar.a, str2)) {
                    uu0.c0 c0Var2 = new uu0.c0();
                    uu0.a0 a0Var3 = new uu0.a0(a0Var.a, a0Var.b, a0Var.c, gt0.a.a(a0Var.d, !z, z));
                    lVar.u = null;
                    lVar.v = null;
                    lVar.w = z;
                    lVar.z = 2;
                    if (bVar.p(c0Var2, a0Var3, str, lVar) == aVar) {
                        return aVar;
                    }
                }
                return a0Var2;
            }
        }
        lVar = new wy0.l(oVar, cVar);
        Object obj2 = lVar.x;
        b71.a aVar2 = b71.a.r;
        i = lVar.z;
        w61.a0 a0Var22 = w61.a0.a;
        if (i != 0) {
        }
        a0Var = (uu0.a0) obj2;
        if (k71.k.b((a0Var != null || (yVar = a0Var.c) == null || (zVar = yVar.c) == null) ? null : zVar.a, str2)) {
        }
        return a0Var22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r9 == r13) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(o oVar, String str, String str2, boolean z, c71.c cVar) {
        m mVar;
        int i;
        oj0.a0 a0Var;
        oj0.y yVar;
        oj0.z zVar;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i2 = mVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.z = i2 - Integer.MIN_VALUE;
                Object obj = mVar.x;
                b71.a aVar = b71.a.r;
                i = mVar.z;
                w61.a0 a0Var2 = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    oj0.c0 c0Var = new oj0.c0();
                    mVar.u = str;
                    mVar.v = str2;
                    mVar.w = z;
                    mVar.z = 1;
                    obj = bVar.c(c0Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var2;
                    }
                    z = mVar.w;
                    str2 = mVar.v;
                    str = mVar.u;
                    sy.y.j(obj);
                }
                a0Var = (oj0.a0) obj;
                if (k71.k.b((a0Var != null || (yVar = a0Var.c) == null || (zVar = yVar.c) == null) ? null : zVar.a, str2)) {
                    oj0.c0 c0Var2 = new oj0.c0();
                    oj0.a0 a0Var3 = new oj0.a0(a0Var.a, a0Var.b, a0Var.c, yh0.a.a(a0Var.d, !z, z));
                    mVar.u = null;
                    mVar.v = null;
                    mVar.w = z;
                    mVar.z = 2;
                    if (bVar.p(c0Var2, a0Var3, str, mVar) == aVar) {
                        return aVar;
                    }
                }
                return a0Var2;
            }
        }
        mVar = new m(oVar, cVar);
        Object obj2 = mVar.x;
        b71.a aVar2 = b71.a.r;
        i = mVar.z;
        w61.a0 a0Var22 = w61.a0.a;
        if (i != 0) {
        }
        a0Var = (oj0.a0) obj2;
        if (k71.k.b((a0Var != null || (yVar = a0Var.c) == null || (zVar = yVar.c) == null) ? null : zVar.a, str2)) {
        }
        return a0Var22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r9 == r13) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(o oVar, String str, String str2, boolean z, c71.c cVar) {
        t00.r rVar;
        int i;
        dw.i0 i0Var;
        dw.g0 g0Var;
        dw.h0Shadow h0Var;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof t00.r) {
            rVar = (t00.r) cVar;
            int i2 = rVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.z = i2 - Integer.MIN_VALUE;
                Object obj = rVar.x;
                b71.a aVar = b71.a.r;
                i = rVar.z;
                w61.a0 a0Var = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    dw.k0 k0Var = new dw.k0();
                    rVar.u = str;
                    rVar.v = str2;
                    rVar.w = z;
                    rVar.z = 1;
                    obj = bVar.c(k0Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    z = rVar.w;
                    str2 = rVar.v;
                    str = rVar.u;
                    sy.y.j(obj);
                }
                i0Var = (dw.i0) obj;
                if (k71.k.b((i0Var != null || (g0Var = i0Var.c) == null || (h0Var = g0Var.c) == null) ? null : h0Var.a, str2)) {
                    dw.k0 k0Var2 = new dw.k0();
                    dw.i0 i0Var2 = new dw.i0(i0Var.a, i0Var.b, i0Var.c, pu.a.a(i0Var.d, !z, z));
                    rVar.u = null;
                    rVar.v = null;
                    rVar.w = z;
                    rVar.z = 2;
                    if (bVar.p(k0Var2, i0Var2, str, rVar) == aVar) {
                        return aVar;
                    }
                }
                return a0Var;
            }
        }
        rVar = new t00.r(oVar, cVar);
        Object obj2 = rVar.x;
        b71.a aVar2 = b71.a.r;
        i = rVar.z;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
        }
        i0Var = (dw.i0) obj2;
        if (k71.k.b((i0Var != null || (g0Var = i0Var.c) == null || (h0Var = g0Var.c) == null) ? null : h0Var.a, str2)) {
        }
        return a0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r9 == r13) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(o oVar, String str, String str2, boolean z, c71.c cVar) {
        vb0.j jVar;
        int i;
        w80.z zVar;
        w80.xShadow xVar;
        w80.y yVar;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof vb0.j) {
            jVar = (vb0.j) cVar;
            int i2 = jVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.z = i2 - Integer.MIN_VALUE;
                Object obj = jVar.x;
                b71.a aVar = b71.a.r;
                i = jVar.z;
                w61.a0 a0Var = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.i0 a0Var2 = new w80.a0(0);
                    jVar.u = str;
                    jVar.v = str2;
                    jVar.w = z;
                    jVar.z = 1;
                    obj = bVar.c(a0Var2, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    z = jVar.w;
                    str2 = jVar.v;
                    str = jVar.u;
                    sy.y.j(obj);
                }
                zVar = (w80.z) obj;
                if (k71.k.b((zVar != null || (xVar = zVar.c) == null || (yVar = xVar.c) == null) ? null : yVar.a, str2)) {
                    aa.i0 a0Var3 = new w80.a0(0);
                    aa.h0Shadow zVar2 = new w80.z(zVar.a, zVar.b, zVar.c, g70.a.a(zVar.d, !z, z));
                    jVar.u = null;
                    jVar.v = null;
                    jVar.w = z;
                    jVar.z = 2;
                    if (bVar.p(a0Var3, zVar2, str, jVar) == aVar) {
                        return aVar;
                    }
                }
                return a0Var;
            }
        }
        jVar = new vb0.j(oVar, cVar);
        Object obj2 = jVar.x;
        b71.a aVar2 = b71.a.r;
        i = jVar.z;
        w61.a0 a0Var4 = w61.a0.a;
        if (i != 0) {
        }
        zVar = (w80.z) obj2;
        if (k71.k.b((zVar != null || (xVar = zVar.c) == null || (yVar = xVar.c) == null) ? null : yVar.a, str2)) {
        }
        return a0Var4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r9 == r13) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(o oVar, String str, String str2, boolean z, c71.c cVar) {
        wy0.m mVar;
        int i;
        uu0.i0 i0Var;
        uu0.g0 g0Var;
        uu0.h0Shadow h0Var;
        com.github.service.wrapper.bShadow bVar = oVar.t;
        if (cVar instanceof wy0.m) {
            mVar = (wy0.m) cVar;
            int i2 = mVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.z = i2 - Integer.MIN_VALUE;
                Object obj = mVar.x;
                b71.a aVar = b71.a.r;
                i = mVar.z;
                w61.a0 a0Var = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    uu0.k0 k0Var = new uu0.k0();
                    mVar.u = str;
                    mVar.v = str2;
                    mVar.w = z;
                    mVar.z = 1;
                    obj = bVar.c(k0Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    z = mVar.w;
                    str2 = mVar.v;
                    str = mVar.u;
                    sy.y.j(obj);
                }
                i0Var = (uu0.i0) obj;
                if (k71.k.b((i0Var != null || (g0Var = i0Var.c) == null || (h0Var = g0Var.c) == null) ? null : h0Var.a, str2)) {
                    uu0.k0 k0Var2 = new uu0.k0();
                    uu0.i0 i0Var2 = new uu0.i0(i0Var.a, i0Var.b, i0Var.c, gt0.a.a(i0Var.d, !z, z));
                    mVar.u = null;
                    mVar.v = null;
                    mVar.w = z;
                    mVar.z = 2;
                    if (bVar.p(k0Var2, i0Var2, str, mVar) == aVar) {
                        return aVar;
                    }
                }
                return a0Var;
            }
        }
        mVar = new wy0.m(oVar, cVar);
        Object obj2 = mVar.x;
        b71.a aVar2 = b71.a.r;
        i = mVar.z;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
        }
        i0Var = (uu0.i0) obj2;
        if (k71.k.b((i0Var != null || (g0Var = i0Var.c) == null || (h0Var = g0Var.c) == null) ? null : h0Var.a, str2)) {
        }
        return a0Var2;
    }

    public gl.f A(String str, String str2) {
        return in.r.l(in.r.h(this.s.d(new v90(str, str2))));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        vb0.f fVar;
        int i;
        String rawValue;
        String str3;
        String str4;
        boolean z2;
        e50.p pVar;
        ArrayList arrayList;
        b71.a aVar;
        com.github.service.wrapper.bShadow bVar;
        Iterator it;
        String str5;
        e50.n nVar;
        ArrayList arrayList2;
        Iterator it2;
        String str6;
        i50.l lVar;
        i50.u uVar;
        ja0.a aVar2;
        ja0.a aVar3;
        if (cVar instanceof vb0.f) {
            fVar = (vb0.f) cVar;
            int i2 = fVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.A = i2 - Integer.MIN_VALUE;
                Object obj = fVar.y;
                b71.a aVar4 = b71.a.r;
                i = fVar.A;
                com.github.service.wrapper.bShadow bVar2 = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    e50.q qVar = new e50.q(new aa.u0(new Integer(30)), new aa.u0(new Integer(3)), 2);
                    fVar.u = str;
                    str3 = str2;
                    fVar.v = str3;
                    fVar.w = rawValue;
                    fVar.x = z;
                    fVar.A = 1;
                    obj = bVar2.c(qVar, str);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    str4 = str;
                    z2 = z;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z2 = fVar.x;
                    rawValue = fVar.w;
                    str3 = fVar.v;
                    str4 = fVar.u;
                    sy.y.j(obj);
                }
                pVar = (e50.p) obj;
                if (pVar != null) {
                    e50.m mVar = pVar.c;
                    List list = mVar.b;
                    if (list != null) {
                        arrayList = new ArrayList(x61.n.F(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            e50.n nVar2 = (e50.n) it3.next();
                            if (nVar2 != null) {
                                i50.h hVar = nVar2.c;
                                c40.c cVar2 = hVar.j;
                                y60.a aVar5 = hVar.l;
                                c40.a aVar6 = cVar2.c;
                                if (k71.k.b((aVar6 == null || (aVar3 = aVar6.b.e) == null) ? null : aVar3.a, str3)) {
                                    g70.a a = g70.a.a(hVar.k, !z2, z2);
                                    if (z2 && rawValue != null) {
                                        aVar5 = y60.a.a(aVar5, true, rawValue, 25);
                                    }
                                    hVar = i50.h.a(hVar, false, false, false, (ZonedDateTime) null, (c40.c) null, a, aVar5, (e50.d1) null, 13311);
                                }
                                i50.n nVar3 = nVar2.e;
                                i50.m mVar2 = nVar3.b;
                                List list2 = mVar2.b;
                                if (list2 != null) {
                                    it = it3;
                                    aVar = aVar4;
                                    bVar = bVar2;
                                    arrayList2 = new ArrayList(x61.n.F(list2, 10));
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        i50.l lVar2 = (i50.l) it4.next();
                                        if (lVar2 != null) {
                                            i50.u uVar2 = lVar2.c;
                                            it2 = it4;
                                            y60.a aVar7 = uVar2.k;
                                            str6 = str4;
                                            c40.a aVar8 = uVar2.h.c;
                                            if (k71.k.b((aVar8 == null || (aVar2 = aVar8.b.e) == null) ? null : aVar2.a, str3)) {
                                                g70.a a2 = g70.a.a(uVar2.j, !z2, z2);
                                                if (z2 && rawValue != null) {
                                                    aVar7 = y60.a.a(aVar7, true, rawValue, 25);
                                                }
                                                uVar = i50.u.a(uVar2, false, false, false, a2, aVar7, 511);
                                            } else {
                                                uVar = uVar2;
                                            }
                                            lVar = new i50.l(lVar2.a, lVar2.b, uVar);
                                        } else {
                                            it2 = it4;
                                            str6 = str4;
                                            lVar = null;
                                        }
                                        arrayList2.add(lVar);
                                        it4 = it2;
                                        str4 = str6;
                                    }
                                } else {
                                    aVar = aVar4;
                                    bVar = bVar2;
                                    it = it3;
                                    arrayList2 = null;
                                }
                                str5 = str4;
                                nVar = e50.n.a(nVar2, hVar, i50.n.a(nVar3, new i50.m(mVar2.a, arrayList2)), 11);
                            } else {
                                aVar = aVar4;
                                bVar = bVar2;
                                it = it3;
                                str5 = str4;
                                nVar = null;
                            }
                            arrayList.add(nVar);
                            it3 = it;
                            aVar4 = aVar;
                            bVar2 = bVar;
                            str4 = str5;
                        }
                    } else {
                        arrayList = null;
                    }
                    b71.a aVar9 = aVar4;
                    com.github.service.wrapper.bShadow bVar3 = bVar2;
                    String str7 = str4;
                    e50.p a3 = e50.p.a(pVar, new e50.m(mVar.a, arrayList));
                    e50.q qVar2 = new e50.q((aa.u0) null, (aa.u0) null, 7);
                    fVar.u = null;
                    fVar.v = null;
                    fVar.w = null;
                    fVar.x = z2;
                    fVar.A = 2;
                    if (bVar3.p(qVar2, a3, str7, fVar) == aVar9) {
                        return aVar9;
                    }
                }
                return w61.a0.a;
            }
        }
        fVar = new vb0.f(this, cVar);
        Object obj2 = fVar.y;
        b71.a aVar42 = b71.a.r;
        i = fVar.A;
        com.github.service.wrapper.bShadow bVar22 = this.t;
        if (i != 0) {
        }
        pVar = (e50.p) obj2;
        if (pVar != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        i iVar;
        int i;
        String rawValue;
        String str3;
        String str4;
        boolean z2;
        uf0.r rVar;
        ArrayList arrayList;
        b71.a aVar;
        com.github.service.wrapper.bShadow bVar;
        Iterator it;
        String str5;
        uf0.p pVar;
        ArrayList arrayList2;
        Iterator it2;
        String str6;
        yf0.m mVar;
        yf0.v vVar;
        bl0.a aVar2;
        bl0.a aVar3;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i2 = iVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.A = i2 - Integer.MIN_VALUE;
                Object obj = iVar.y;
                b71.a aVar4 = b71.a.r;
                i = iVar.A;
                com.github.service.wrapper.bShadow bVar2 = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    uf0.t tVar = new uf0.t(new aa.u0(new Integer(30)), new aa.u0(new Integer(3)), 2);
                    iVar.u = str;
                    str3 = str2;
                    iVar.v = str3;
                    iVar.w = rawValue;
                    iVar.x = z;
                    iVar.A = 1;
                    obj = bVar2.c(tVar, str);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    str4 = str;
                    z2 = z;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z2 = iVar.x;
                    rawValue = iVar.w;
                    str3 = iVar.v;
                    str4 = iVar.u;
                    sy.y.j(obj);
                }
                rVar = (uf0.r) obj;
                if (rVar != null) {
                    uf0.o oVar = rVar.c;
                    List list = oVar.b;
                    if (list != null) {
                        arrayList = new ArrayList(x61.n.F(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            uf0.p pVar2 = (uf0.p) it3.next();
                            if (pVar2 != null) {
                                yf0.i iVar2 = pVar2.c;
                                se0.c cVar2 = iVar2.j;
                                qh0.a aVar5 = iVar2.l;
                                se0.a aVar6 = cVar2.c;
                                if (k71.k.b((aVar6 == null || (aVar3 = aVar6.b.e) == null) ? null : aVar3.a, str3)) {
                                    yh0.a a = yh0.a.a(iVar2.k, !z2, z2);
                                    if (z2 && rawValue != null) {
                                        aVar5 = qh0.a.a(aVar5, true, rawValue, 25);
                                    }
                                    iVar2 = yf0.i.a(iVar2, false, false, false, null, null, a, aVar5, null, 13311);
                                }
                                yf0.o oVar2 = pVar2.e;
                                yf0.n nVar = oVar2.b;
                                List list2 = nVar.b;
                                if (list2 != null) {
                                    it = it3;
                                    aVar = aVar4;
                                    bVar = bVar2;
                                    arrayList2 = new ArrayList(x61.n.F(list2, 10));
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        yf0.m mVar2 = (yf0.m) it4.next();
                                        if (mVar2 != null) {
                                            yf0.v vVar2 = mVar2.c;
                                            it2 = it4;
                                            qh0.a aVar7 = vVar2.k;
                                            str6 = str4;
                                            se0.a aVar8 = vVar2.h.c;
                                            if (k71.k.b((aVar8 == null || (aVar2 = aVar8.b.e) == null) ? null : aVar2.a, str3)) {
                                                yh0.a a2 = yh0.a.a(vVar2.j, !z2, z2);
                                                if (z2 && rawValue != null) {
                                                    aVar7 = qh0.a.a(aVar7, true, rawValue, 25);
                                                }
                                                vVar = yf0.v.a(vVar2, false, false, false, a2, aVar7, 511);
                                            } else {
                                                vVar = vVar2;
                                            }
                                            mVar = new yf0.m(mVar2.a, mVar2.b, vVar);
                                        } else {
                                            it2 = it4;
                                            str6 = str4;
                                            mVar = null;
                                        }
                                        arrayList2.add(mVar);
                                        it4 = it2;
                                        str4 = str6;
                                    }
                                } else {
                                    aVar = aVar4;
                                    bVar = bVar2;
                                    it = it3;
                                    arrayList2 = null;
                                }
                                str5 = str4;
                                pVar = uf0.p.a(pVar2, iVar2, yf0.o.a(oVar2, new yf0.n(nVar.a, arrayList2)), 11);
                            } else {
                                aVar = aVar4;
                                bVar = bVar2;
                                it = it3;
                                str5 = str4;
                                pVar = null;
                            }
                            arrayList.add(pVar);
                            it3 = it;
                            aVar4 = aVar;
                            bVar2 = bVar;
                            str4 = str5;
                        }
                    } else {
                        arrayList = null;
                    }
                    b71.a aVar9 = aVar4;
                    com.github.service.wrapper.bShadow bVar3 = bVar2;
                    String str7 = str4;
                    uf0.r a3 = uf0.r.a(rVar, new uf0.o(oVar.a, arrayList));
                    uf0.t tVar2 = new uf0.t(null, null, 7);
                    iVar.u = null;
                    iVar.v = null;
                    iVar.w = null;
                    iVar.x = z2;
                    iVar.A = 2;
                    if (bVar3.p(tVar2, a3, str7, iVar) == aVar9) {
                        return aVar9;
                    }
                }
                return w61.a0.a;
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.y;
        b71.a aVar42 = b71.a.r;
        i = iVar.A;
        com.github.service.wrapper.bShadow bVar22 = this.t;
        if (i != 0) {
        }
        rVar = (uf0.r) obj2;
        if (rVar != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        wy0.i iVar;
        int i;
        String rawValue;
        String str3;
        String str4;
        boolean z2;
        ar0.r rVar;
        ArrayList arrayList;
        b71.a aVar;
        com.github.service.wrapper.bShadow bVar;
        Iterator it;
        String str5;
        ar0.p pVar;
        ArrayList arrayList2;
        Iterator it2;
        String str6;
        er0.m mVar;
        er0.v vVar;
        kw0.a aVar2;
        kw0.a aVar3;
        if (cVar instanceof wy0.i) {
            iVar = (wy0.i) cVar;
            int i2 = iVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.A = i2 - Integer.MIN_VALUE;
                Object obj = iVar.y;
                b71.a aVar4 = b71.a.r;
                i = iVar.A;
                com.github.service.wrapper.bShadow bVar2 = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    ar0.t tVar = new ar0.t(new aa.u0(new Integer(30)), new aa.u0(new Integer(3)), 2);
                    iVar.u = str;
                    str3 = str2;
                    iVar.v = str3;
                    iVar.w = rawValue;
                    iVar.x = z;
                    iVar.A = 1;
                    obj = bVar2.c(tVar, str);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    str4 = str;
                    z2 = z;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z2 = iVar.x;
                    rawValue = iVar.w;
                    str3 = iVar.v;
                    str4 = iVar.u;
                    sy.y.j(obj);
                }
                rVar = (ar0.r) obj;
                if (rVar != null) {
                    ar0.o oVar = rVar.c;
                    List list = oVar.b;
                    if (list != null) {
                        arrayList = new ArrayList(x61.n.F(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ar0.p pVar2 = (ar0.p) it3.next();
                            if (pVar2 != null) {
                                er0.i iVar2 = pVar2.c;
                                yp0.c cVar2 = iVar2.j;
                                at0.a aVar5 = iVar2.l;
                                yp0.a aVar6 = cVar2.c;
                                if (k71.k.b((aVar6 == null || (aVar3 = aVar6.b.g) == null) ? null : aVar3.a, str3)) {
                                    gt0.a a = gt0.a.a(iVar2.k, !z2, z2);
                                    if (z2 && rawValue != null) {
                                        aVar5 = at0.a.a(aVar5, true, rawValue, 25);
                                    }
                                    iVar2 = er0.i.a(iVar2, false, false, false, null, null, a, aVar5, null, 13311);
                                }
                                er0.o oVar2 = pVar2.e;
                                er0.n nVar = oVar2.b;
                                List list2 = nVar.b;
                                if (list2 != null) {
                                    it = it3;
                                    aVar = aVar4;
                                    bVar = bVar2;
                                    arrayList2 = new ArrayList(x61.n.F(list2, 10));
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        er0.m mVar2 = (er0.m) it4.next();
                                        if (mVar2 != null) {
                                            er0.v vVar2 = mVar2.c;
                                            it2 = it4;
                                            at0.a aVar7 = vVar2.k;
                                            str6 = str4;
                                            yp0.a aVar8 = vVar2.h.c;
                                            if (k71.k.b((aVar8 == null || (aVar2 = aVar8.b.g) == null) ? null : aVar2.a, str3)) {
                                                gt0.a a2 = gt0.a.a(vVar2.j, !z2, z2);
                                                if (z2 && rawValue != null) {
                                                    aVar7 = at0.a.a(aVar7, true, rawValue, 25);
                                                }
                                                vVar = er0.v.a(vVar2, false, false, false, a2, aVar7, 511);
                                            } else {
                                                vVar = vVar2;
                                            }
                                            mVar = new er0.m(mVar2.a, mVar2.b, vVar);
                                        } else {
                                            it2 = it4;
                                            str6 = str4;
                                            mVar = null;
                                        }
                                        arrayList2.add(mVar);
                                        it4 = it2;
                                        str4 = str6;
                                    }
                                } else {
                                    aVar = aVar4;
                                    bVar = bVar2;
                                    it = it3;
                                    arrayList2 = null;
                                }
                                str5 = str4;
                                pVar = ar0.p.a(pVar2, iVar2, er0.o.a(oVar2, new er0.n(nVar.a, arrayList2)), 11);
                            } else {
                                aVar = aVar4;
                                bVar = bVar2;
                                it = it3;
                                str5 = str4;
                                pVar = null;
                            }
                            arrayList.add(pVar);
                            it3 = it;
                            aVar4 = aVar;
                            bVar2 = bVar;
                            str4 = str5;
                        }
                    } else {
                        arrayList = null;
                    }
                    b71.a aVar9 = aVar4;
                    com.github.service.wrapper.bShadow bVar3 = bVar2;
                    String str7 = str4;
                    ar0.r a3 = ar0.r.a(rVar, new ar0.o(oVar.a, arrayList));
                    ar0.t tVar2 = new ar0.t(null, null, 7);
                    iVar.u = null;
                    iVar.v = null;
                    iVar.w = null;
                    iVar.x = z2;
                    iVar.A = 2;
                    if (bVar3.p(tVar2, a3, str7, iVar) == aVar9) {
                        return aVar9;
                    }
                }
                return w61.a0.a;
            }
        }
        iVar = new wy0.i(this, cVar);
        Object obj2 = iVar.y;
        b71.a aVar42 = b71.a.r;
        i = iVar.A;
        com.github.service.wrapper.bShadow bVar22 = this.t;
        if (i != 0) {
        }
        rVar = (ar0.r) obj2;
        if (rVar != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        t00.n nVar;
        int i;
        String rawValue;
        String str3;
        String str4;
        boolean z2;
        is.r rVar;
        ArrayList arrayList;
        b71.a aVar;
        com.github.service.wrapper.bShadow bVar;
        Iterator it;
        String str5;
        is.p pVar;
        ArrayList arrayList2;
        Iterator it2;
        String str6;
        ms.m mVar;
        ms.v vVar;
        vx.a aVar2;
        vx.a aVar3;
        if (cVar instanceof t00.n) {
            nVar = (t00.n) cVar;
            int i2 = nVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.A = i2 - Integer.MIN_VALUE;
                Object obj = nVar.y;
                b71.a aVar4 = b71.a.r;
                i = nVar.A;
                com.github.service.wrapper.bShadow bVar2 = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    is.t tVar = new is.t(new aa.u0(new Integer(30)), new aa.u0(new Integer(3)), 2);
                    nVar.u = str;
                    str3 = str2;
                    nVar.v = str3;
                    nVar.w = rawValue;
                    nVar.x = z;
                    nVar.A = 1;
                    obj = bVar2.c(tVar, str);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    str4 = str;
                    z2 = z;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z2 = nVar.x;
                    rawValue = nVar.w;
                    str3 = nVar.v;
                    str4 = nVar.u;
                    sy.y.j(obj);
                }
                rVar = (is.r) obj;
                if (rVar != null) {
                    is.o oVar = rVar.c;
                    List list = oVar.b;
                    if (list != null) {
                        arrayList = new ArrayList(x61.n.F(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            is.p pVar2 = (is.p) it3.next();
                            if (pVar2 != null) {
                                ms.i iVar = pVar2.c;
                                ar.c cVar2 = iVar.j;
                                ju.a aVar5 = iVar.l;
                                ar.a aVar6 = cVar2.c;
                                if (k71.k.b((aVar6 == null || (aVar3 = aVar6.b.g) == null) ? null : aVar3.a, str3)) {
                                    pu.a a = pu.a.a(iVar.k, !z2, z2);
                                    if (z2 && rawValue != null) {
                                        aVar5 = ju.a.a(aVar5, true, rawValue, 25);
                                    }
                                    iVar = ms.i.a(iVar, false, false, false, (ZonedDateTime) null, (ar.c) null, a, aVar5, (is.i1) null, 13311);
                                }
                                ms.o oVar2 = pVar2.e;
                                ms.n nVar2 = oVar2.b;
                                List list2 = nVar2.b;
                                if (list2 != null) {
                                    it = it3;
                                    aVar = aVar4;
                                    bVar = bVar2;
                                    arrayList2 = new ArrayList(x61.n.F(list2, 10));
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        ms.m mVar2 = (ms.m) it4.next();
                                        if (mVar2 != null) {
                                            ms.v vVar2 = mVar2.c;
                                            it2 = it4;
                                            ju.a aVar7 = vVar2.k;
                                            str6 = str4;
                                            ar.a aVar8 = vVar2.h.c;
                                            if (k71.k.b((aVar8 == null || (aVar2 = aVar8.b.g) == null) ? null : aVar2.a, str3)) {
                                                pu.a a2 = pu.a.a(vVar2.j, !z2, z2);
                                                if (z2 && rawValue != null) {
                                                    aVar7 = ju.a.a(aVar7, true, rawValue, 25);
                                                }
                                                vVar = ms.v.a(vVar2, false, false, false, a2, aVar7, 511);
                                            } else {
                                                vVar = vVar2;
                                            }
                                            mVar = new ms.m(mVar2.a, mVar2.b, vVar);
                                        } else {
                                            it2 = it4;
                                            str6 = str4;
                                            mVar = null;
                                        }
                                        arrayList2.add(mVar);
                                        it4 = it2;
                                        str4 = str6;
                                    }
                                } else {
                                    aVar = aVar4;
                                    bVar = bVar2;
                                    it = it3;
                                    arrayList2 = null;
                                }
                                str5 = str4;
                                pVar = is.p.a(pVar2, iVar, ms.o.a(oVar2, new ms.n(nVar2.a, arrayList2)), 11);
                            } else {
                                aVar = aVar4;
                                bVar = bVar2;
                                it = it3;
                                str5 = str4;
                                pVar = null;
                            }
                            arrayList.add(pVar);
                            it3 = it;
                            aVar4 = aVar;
                            bVar2 = bVar;
                            str4 = str5;
                        }
                    } else {
                        arrayList = null;
                    }
                    b71.a aVar9 = aVar4;
                    com.github.service.wrapper.bShadow bVar3 = bVar2;
                    String str7 = str4;
                    is.r a3 = is.r.a(rVar, new is.o(oVar.a, arrayList));
                    is.t tVar2 = new is.t((aa.u0) null, (aa.u0) null, 7);
                    nVar.u = null;
                    nVar.v = null;
                    nVar.w = null;
                    nVar.x = z2;
                    nVar.A = 2;
                    if (bVar3.p(tVar2, a3, str7, nVar) == aVar9) {
                        return aVar9;
                    }
                }
                return w61.a0.a;
            }
        }
        nVar = new t00.n(this, cVar);
        Object obj2 = nVar.y;
        b71.a aVar42 = b71.a.r;
        i = nVar.A;
        com.github.service.wrapper.bShadow bVar22 = this.t;
        if (i != 0) {
        }
        rVar = (is.r) obj2;
        if (rVar != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d9, code lost:
    
        if (r6.p(r0, r7, r10, r3) == r4) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object F(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        vb0.h hVar;
        int i;
        String rawValue;
        boolean z2;
        String str3;
        String str4;
        z70.v vVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str5;
        int i2;
        int i3;
        ja0.a aVar;
        if (cVar instanceof vb0.h) {
            hVar = (vb0.h) cVar;
            int i4 = hVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hVar.A = i4 - Integer.MIN_VALUE;
                Object obj = hVar.y;
                b71.a aVar2 = b71.a.r;
                i = hVar.A;
                com.github.service.wrapper.bShadow bVar = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    z70.w wVar = new z70.w(0);
                    hVar.u = str;
                    hVar.v = str2;
                    hVar.w = rawValue;
                    z2 = z;
                    hVar.x = z2;
                    hVar.A = 1;
                    obj = bVar.c(wVar, str);
                    if (obj != aVar2) {
                        str3 = str2;
                        str4 = str;
                    }
                    return aVar2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                boolean z3 = hVar.x;
                rawValue = hVar.w;
                str3 = hVar.v;
                str4 = hVar.u;
                sy.y.j(obj);
                z2 = z3;
                vVar = (z70.v) obj;
                if (vVar != null) {
                    List list = vVar.c.a;
                    if (list != null) {
                        ArrayList S = x61.m.S(list);
                        int i5 = 10;
                        arrayList = new ArrayList(x61.n.F(S, 10));
                        int size = S.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = S.get(i6);
                            int i7 = i6 + 1;
                            z70.s sVar = (z70.s) obj2;
                            List list2 = sVar.j.a;
                            if (list2 != null) {
                                ArrayList S2 = x61.m.S(list2);
                                arrayList2 = S;
                                arrayList3 = new ArrayList(x61.n.F(S2, i5));
                                int size2 = S2.size();
                                int i8 = 0;
                                while (i8 < size2) {
                                    Object obj3 = S2.get(i8);
                                    int i9 = i8 + 1;
                                    int i10 = size2;
                                    z70.r rVar = (z70.r) obj3;
                                    String str6 = rawValue;
                                    z70.d7 d7Var = rVar.c;
                                    int i12 = i7;
                                    c40.a aVar3 = d7Var.j.c;
                                    if (k71.k.b((aVar3 == null || (aVar = aVar3.b.e) == null) ? null : aVar.a, str3)) {
                                        str5 = str3;
                                        g70.a a = g70.a.a(d7Var.m, !z2, z2);
                                        y60.a aVar4 = d7Var.n;
                                        i2 = i9;
                                        i3 = size;
                                        rVar = new z70.r(rVar.a, rVar.b, new z70.d7(d7Var.a, d7Var.b, d7Var.c, d7Var.d, d7Var.e, d7Var.f, d7Var.g, d7Var.h, d7Var.i, d7Var.j, d7Var.k, d7Var.l, a, y60.a.a(aVar4, false, str6 == null ? aVar4.c : str6, 27)));
                                    } else {
                                        str5 = str3;
                                        i2 = i9;
                                        i3 = size;
                                    }
                                    arrayList3.add(rVar);
                                    size2 = i10;
                                    rawValue = str6;
                                    i7 = i12;
                                    str3 = str5;
                                    i8 = i2;
                                    size = i3;
                                }
                            } else {
                                arrayList2 = S;
                                arrayList3 = null;
                            }
                            String str7 = rawValue;
                            int i13 = i7;
                            String str8 = str3;
                            int i14 = size;
                            arrayList.add(new z70.s(sVar.a, sVar.b, sVar.c, sVar.d, sVar.e, sVar.f, sVar.g, sVar.h, sVar.i, new z70.q(arrayList3), sVar.k));
                            S = arrayList2;
                            rawValue = str7;
                            i6 = i13;
                            str3 = str8;
                            size = i14;
                            i5 = 10;
                        }
                    } else {
                        arrayList = null;
                    }
                    z70.v vVar2 = new z70.v(vVar.a, vVar.b, new z70.u(arrayList), vVar.d);
                    z70.w wVar2 = new z70.w(0);
                    hVar.u = null;
                    hVar.v = null;
                    hVar.w = null;
                    hVar.x = z2;
                    hVar.A = 2;
                }
                return w61.a0.a;
            }
        }
        hVar = new vb0.h(this, cVar);
        Object obj4 = hVar.y;
        b71.a aVar22 = b71.a.r;
        i = hVar.A;
        com.github.service.wrapper.bShadow bVar2 = this.t;
        if (i != 0) {
        }
        vVar = (z70.v) obj4;
        if (vVar != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d3, code lost:
    
        if (r6.p(r0, r7, r10, r3) == r4) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        k kVar;
        int i;
        String rawValue;
        boolean z2;
        String str3;
        String str4;
        ri0.v vVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str5;
        int i2;
        int i3;
        bl0.a aVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i4 = kVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kVar.A = i4 - Integer.MIN_VALUE;
                Object obj = kVar.y;
                b71.a aVar2 = b71.a.r;
                i = kVar.A;
                com.github.service.wrapper.bShadow bVar = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    ri0.xShadow xVar = new ri0.x();
                    kVar.u = str;
                    kVar.v = str2;
                    kVar.w = rawValue;
                    z2 = z;
                    kVar.x = z2;
                    kVar.A = 1;
                    obj = bVar.c(xVar, str);
                    if (obj != aVar2) {
                        str3 = str2;
                        str4 = str;
                    }
                    return aVar2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                boolean z3 = kVar.x;
                rawValue = kVar.w;
                str3 = kVar.v;
                str4 = kVar.u;
                sy.y.j(obj);
                z2 = z3;
                vVar = (ri0.v) obj;
                if (vVar != null) {
                    List list = vVar.c.a;
                    if (list != null) {
                        ArrayList S = x61.m.S(list);
                        int i5 = 10;
                        arrayList = new ArrayList(x61.n.F(S, 10));
                        int size = S.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = S.get(i6);
                            int i7 = i6 + 1;
                            ri0.s sVar = (ri0.s) obj2;
                            List list2 = sVar.j.a;
                            if (list2 != null) {
                                ArrayList S2 = x61.m.S(list2);
                                arrayList2 = S;
                                arrayList3 = new ArrayList(x61.n.F(S2, i5));
                                int size2 = S2.size();
                                int i8 = 0;
                                while (i8 < size2) {
                                    Object obj3 = S2.get(i8);
                                    int i9 = i8 + 1;
                                    int i10 = size2;
                                    ri0.r rVar = (ri0.r) obj3;
                                    String str6 = rawValue;
                                    ri0.s7 s7Var = rVar.c;
                                    int i12 = i7;
                                    se0.a aVar3 = s7Var.i.c;
                                    if (k71.k.b((aVar3 == null || (aVar = aVar3.b.e) == null) ? null : aVar.a, str3)) {
                                        str5 = str3;
                                        yh0.a a = yh0.a.a(s7Var.l, !z2, z2);
                                        qh0.a aVar4 = s7Var.m;
                                        i2 = i9;
                                        i3 = size;
                                        rVar = new ri0.r(rVar.a, rVar.b, new ri0.s7(s7Var.a, s7Var.b, s7Var.c, s7Var.d, s7Var.e, s7Var.f, s7Var.g, s7Var.h, s7Var.i, s7Var.j, s7Var.k, a, qh0.a.a(aVar4, false, str6 == null ? aVar4.c : str6, 27)));
                                    } else {
                                        str5 = str3;
                                        i2 = i9;
                                        i3 = size;
                                    }
                                    arrayList3.add(rVar);
                                    size2 = i10;
                                    rawValue = str6;
                                    i7 = i12;
                                    str3 = str5;
                                    i8 = i2;
                                    size = i3;
                                }
                            } else {
                                arrayList2 = S;
                                arrayList3 = null;
                            }
                            String str7 = rawValue;
                            int i13 = i7;
                            String str8 = str3;
                            int i14 = size;
                            arrayList.add(new ri0.s(sVar.a, sVar.b, sVar.c, sVar.d, sVar.e, sVar.f, sVar.g, sVar.h, sVar.i, new ri0.q(arrayList3), sVar.k));
                            S = arrayList2;
                            rawValue = str7;
                            i6 = i13;
                            str3 = str8;
                            size = i14;
                            i5 = 10;
                        }
                    } else {
                        arrayList = null;
                    }
                    ri0.v vVar2 = new ri0.v(vVar.a, vVar.b, new ri0.u(arrayList), vVar.d);
                    ri0.xShadow xVar2 = new ri0.x();
                    kVar.u = null;
                    kVar.v = null;
                    kVar.w = null;
                    kVar.x = z2;
                    kVar.A = 2;
                }
                return w61.a0.a;
            }
        }
        kVar = new k(this, cVar);
        Object obj4 = kVar.y;
        b71.a aVar22 = b71.a.r;
        i = kVar.A;
        com.github.service.wrapper.bShadow bVar2 = this.t;
        if (i != 0) {
        }
        vVar = (ri0.v) obj4;
        if (vVar != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01db, code lost:
    
        if (r6.p(r0, r7, r10, r3) == r4) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        wy0.k kVar;
        int i;
        String rawValue;
        boolean z2;
        String str3;
        String str4;
        xt0.v vVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str5;
        int i2;
        int i3;
        kw0.a aVar;
        if (cVar instanceof wy0.k) {
            kVar = (wy0.k) cVar;
            int i4 = kVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kVar.A = i4 - Integer.MIN_VALUE;
                Object obj = kVar.y;
                b71.a aVar2 = b71.a.r;
                i = kVar.A;
                com.github.service.wrapper.bShadow bVar = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    xt0.xShadow xVar = new xt0.x();
                    kVar.u = str;
                    kVar.v = str2;
                    kVar.w = rawValue;
                    z2 = z;
                    kVar.x = z2;
                    kVar.A = 1;
                    obj = bVar.c(xVar, str);
                    if (obj != aVar2) {
                        str3 = str2;
                        str4 = str;
                    }
                    return aVar2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                boolean z3 = kVar.x;
                rawValue = kVar.w;
                str3 = kVar.v;
                str4 = kVar.u;
                sy.y.j(obj);
                z2 = z3;
                vVar = (xt0.v) obj;
                if (vVar != null) {
                    List list = vVar.c.a;
                    if (list != null) {
                        ArrayList S = x61.m.S(list);
                        int i5 = 10;
                        arrayList = new ArrayList(x61.n.F(S, 10));
                        int size = S.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = S.get(i6);
                            int i7 = i6 + 1;
                            xt0.s sVar = (xt0.s) obj2;
                            List list2 = sVar.j.a;
                            if (list2 != null) {
                                ArrayList S2 = x61.m.S(list2);
                                arrayList2 = S;
                                arrayList3 = new ArrayList(x61.n.F(S2, i5));
                                int size2 = S2.size();
                                int i8 = 0;
                                while (i8 < size2) {
                                    Object obj3 = S2.get(i8);
                                    int i9 = i8 + 1;
                                    int i10 = size2;
                                    xt0.r rVar = (xt0.r) obj3;
                                    String str6 = rawValue;
                                    xt0.k7 k7Var = rVar.c;
                                    int i12 = i7;
                                    yp0.a aVar3 = k7Var.k.c;
                                    if (k71.k.b((aVar3 == null || (aVar = aVar3.b.g) == null) ? null : aVar.a, str3)) {
                                        str5 = str3;
                                        gt0.a a = gt0.a.a(k7Var.n, !z2, z2);
                                        at0.a aVar4 = k7Var.o;
                                        i2 = i9;
                                        i3 = size;
                                        rVar = new xt0.r(rVar.a, rVar.b, new xt0.k7(k7Var.a, k7Var.b, k7Var.c, k7Var.d, k7Var.e, k7Var.f, k7Var.g, k7Var.h, k7Var.i, k7Var.j, k7Var.k, k7Var.l, k7Var.m, a, at0.a.a(aVar4, false, str6 == null ? aVar4.c : str6, 27)));
                                    } else {
                                        str5 = str3;
                                        i2 = i9;
                                        i3 = size;
                                    }
                                    arrayList3.add(rVar);
                                    size2 = i10;
                                    rawValue = str6;
                                    i7 = i12;
                                    str3 = str5;
                                    i8 = i2;
                                    size = i3;
                                }
                            } else {
                                arrayList2 = S;
                                arrayList3 = null;
                            }
                            String str7 = rawValue;
                            int i13 = i7;
                            String str8 = str3;
                            int i14 = size;
                            arrayList.add(new xt0.s(sVar.a, sVar.b, sVar.c, sVar.d, sVar.e, sVar.f, sVar.g, sVar.h, sVar.i, new xt0.q(arrayList3), sVar.k));
                            S = arrayList2;
                            rawValue = str7;
                            i6 = i13;
                            str3 = str8;
                            size = i14;
                            i5 = 10;
                        }
                    } else {
                        arrayList = null;
                    }
                    xt0.v vVar2 = new xt0.v(vVar.a, vVar.b, new xt0.u(arrayList), vVar.d);
                    xt0.xShadow xVar2 = new xt0.x();
                    kVar.u = null;
                    kVar.v = null;
                    kVar.w = null;
                    kVar.x = z2;
                    kVar.A = 2;
                }
                return w61.a0.a;
            }
        }
        kVar = new wy0.k(this, cVar);
        Object obj4 = kVar.y;
        b71.a aVar22 = b71.a.r;
        i = kVar.A;
        com.github.service.wrapper.bShadow bVar2 = this.t;
        if (i != 0) {
        }
        vVar = (xt0.v) obj4;
        if (vVar != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01db, code lost:
    
        if (r6.p(r0, r7, r10, r3) == r4) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object I(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        t00.p pVar;
        int i;
        String rawValue;
        boolean z2;
        String str3;
        String str4;
        gv.f0 f0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str5;
        int i2;
        int i3;
        vx.a aVar;
        if (cVar instanceof t00.p) {
            pVar = (t00.p) cVar;
            int i4 = pVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pVar.A = i4 - Integer.MIN_VALUE;
                Object obj = pVar.y;
                b71.a aVar2 = b71.a.r;
                i = pVar.A;
                com.github.service.wrapper.bShadow bVar = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    gv.h0Shadow h0Var = new gv.h0();
                    pVar.u = str;
                    pVar.v = str2;
                    pVar.w = rawValue;
                    z2 = z;
                    pVar.x = z2;
                    pVar.A = 1;
                    obj = bVar.c(h0Var, str);
                    if (obj != aVar2) {
                        str3 = str2;
                        str4 = str;
                    }
                    return aVar2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                boolean z3 = pVar.x;
                rawValue = pVar.w;
                str3 = pVar.v;
                str4 = pVar.u;
                sy.y.j(obj);
                z2 = z3;
                f0Var = (gv.f0) obj;
                if (f0Var != null) {
                    List list = f0Var.c.a;
                    if (list != null) {
                        ArrayList S = x61.m.S(list);
                        int i5 = 10;
                        arrayList = new ArrayList(x61.n.F(S, 10));
                        int size = S.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = S.get(i6);
                            int i7 = i6 + 1;
                            gv.c0 c0Var = (gv.c0) obj2;
                            List list2 = c0Var.j.a;
                            if (list2 != null) {
                                ArrayList S2 = x61.m.S(list2);
                                arrayList2 = S;
                                arrayList3 = new ArrayList(x61.n.F(S2, i5));
                                int size2 = S2.size();
                                int i8 = 0;
                                while (i8 < size2) {
                                    Object obj3 = S2.get(i8);
                                    int i9 = i8 + 1;
                                    int i10 = size2;
                                    gv.b0 b0Var = (gv.b0) obj3;
                                    String str6 = rawValue;
                                    gv.y7 y7Var = b0Var.c;
                                    int i12 = i7;
                                    ar.a aVar3 = y7Var.k.c;
                                    if (k71.k.b((aVar3 == null || (aVar = aVar3.b.g) == null) ? null : aVar.a, str3)) {
                                        str5 = str3;
                                        pu.a a = pu.a.a(y7Var.n, !z2, z2);
                                        ju.a aVar4 = y7Var.o;
                                        i2 = i9;
                                        i3 = size;
                                        b0Var = new gv.b0(b0Var.a, b0Var.b, new gv.y7(y7Var.a, y7Var.b, y7Var.c, y7Var.d, y7Var.e, y7Var.f, y7Var.g, y7Var.h, y7Var.i, y7Var.j, y7Var.k, y7Var.l, y7Var.m, a, ju.a.a(aVar4, false, str6 == null ? aVar4.c : str6, 27)));
                                    } else {
                                        str5 = str3;
                                        i2 = i9;
                                        i3 = size;
                                    }
                                    arrayList3.add(b0Var);
                                    size2 = i10;
                                    rawValue = str6;
                                    i7 = i12;
                                    str3 = str5;
                                    i8 = i2;
                                    size = i3;
                                }
                            } else {
                                arrayList2 = S;
                                arrayList3 = null;
                            }
                            String str7 = rawValue;
                            int i13 = i7;
                            String str8 = str3;
                            int i14 = size;
                            arrayList.add(new gv.c0(c0Var.a, c0Var.b, c0Var.c, c0Var.d, c0Var.e, c0Var.f, c0Var.g, c0Var.h, c0Var.i, new gv.a0(arrayList3), c0Var.k));
                            S = arrayList2;
                            rawValue = str7;
                            i6 = i13;
                            str3 = str8;
                            size = i14;
                            i5 = 10;
                        }
                    } else {
                        arrayList = null;
                    }
                    gv.f0 f0Var2 = new gv.f0(f0Var.a, f0Var.b, new gv.e0(arrayList), f0Var.d);
                    gv.h0Shadow h0Var2 = new gv.h0();
                    pVar.u = null;
                    pVar.v = null;
                    pVar.w = null;
                    pVar.x = z2;
                    pVar.A = 2;
                }
                return w61.a0.a;
            }
        }
        pVar = new t00.p(this, cVar);
        Object obj4 = pVar.y;
        b71.a aVar22 = b71.a.r;
        i = pVar.A;
        com.github.service.wrapper.bShadow bVar2 = this.t;
        if (i != 0) {
        }
        f0Var = (gv.f0) obj4;
        if (f0Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        vb0.k kVar;
        int i;
        String rawValue;
        on onVar;
        boolean z2;
        String str3;
        zm zmVar;
        b71.a aVar;
        com.github.service.wrapper.bShadow bVar;
        en enVar;
        fn fnVar;
        nn nnVar;
        ArrayList arrayList;
        b71.a aVar2;
        com.github.service.wrapper.bShadow bVar2;
        Iterator it;
        String str4;
        String str5;
        cn cnVar;
        hn hnVar;
        ArrayList arrayList2;
        Iterator it2;
        com.github.service.wrapper.bShadow bVar3;
        String str6;
        boolean z3;
        int i2;
        c40.a aVar3;
        ja0.a aVar4;
        c40.c cVar2;
        boolean z4;
        ja0.a aVar5;
        ja0.a aVar6;
        if (cVar instanceof vb0.k) {
            kVar = (vb0.k) cVar;
            int i3 = kVar.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.A = i3 - Integer.MIN_VALUE;
                Object obj = kVar.y;
                b71.a aVar7 = b71.a.r;
                i = kVar.A;
                com.github.service.wrapper.bShadow bVar4 = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    onVar = new on(str);
                    kVar.u = str2;
                    kVar.v = rawValue;
                    kVar.w = onVar;
                    z2 = z;
                    kVar.x = z2;
                    kVar.A = 1;
                    Object f = bVar4.f(onVar);
                    if (f == aVar7) {
                        return aVar7;
                    }
                    str3 = str2;
                    obj = f;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z2 = kVar.x;
                    onVar = kVar.w;
                    rawValue = kVar.v;
                    str3 = kVar.u;
                    sy.y.j(obj);
                }
                zmVar = (zm) obj;
                if (zmVar != null) {
                    en enVar2 = zmVar.a;
                    if (enVar2 != null) {
                        fn fnVar2 = enVar2.c;
                        if (fnVar2 != null) {
                            g70.a aVar8 = fnVar2.n;
                            wm wmVar = fnVar2.h;
                            if (k71.k.b((wmVar == null || (aVar6 = wmVar.b.e) == null) ? null : aVar6.a, str3)) {
                                aVar8 = g70.a.a(aVar8, !z2, z2);
                            }
                            g70.a aVar9 = aVar8;
                            nn nnVar2 = fnVar2.j;
                            if (nnVar2 != null) {
                                List list = nnVar2.a;
                                if (list != null) {
                                    arrayList = new ArrayList(x61.n.F(list, 10));
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        cn cnVar2 = (cn) it3.next();
                                        if (cnVar2 != null) {
                                            gn gnVar = cnVar2.c;
                                            if (gnVar != null) {
                                                c40.c cVar3 = gnVar.h;
                                                c40.a aVar10 = cVar3.c;
                                                if (k71.k.b((aVar10 == null || (aVar5 = aVar10.b.e) == null) ? null : aVar5.a, str3)) {
                                                    it = it3;
                                                    g70.a a = g70.a.a(gnVar.k, !z2, z2);
                                                    y60.a aVar11 = gnVar.l;
                                                    String str7 = rawValue == null ? aVar11.c : rawValue;
                                                    if (z2) {
                                                        cVar2 = cVar3;
                                                        str4 = rawValue;
                                                        z4 = rawValue != null;
                                                    } else {
                                                        cVar2 = cVar3;
                                                        z4 = aVar11.b;
                                                        str4 = rawValue;
                                                    }
                                                    gnVar = new gn(gnVar.a, gnVar.b, gnVar.c, gnVar.d, gnVar.e, gnVar.f, gnVar.g, cVar2, gnVar.i, gnVar.j, a, y60.a.a(aVar11, z4, str7, 25));
                                                } else {
                                                    it = it3;
                                                    str4 = rawValue;
                                                }
                                            } else {
                                                it = it3;
                                                str4 = rawValue;
                                                gnVar = null;
                                            }
                                            hn hnVar2 = cnVar2.b;
                                            if (hnVar2 != null) {
                                                List list2 = hnVar2.k.a;
                                                if (list2 != null) {
                                                    aVar2 = aVar7;
                                                    arrayList2 = new ArrayList(x61.n.F(list2, 10));
                                                    Iterator it4 = list2.iterator();
                                                    while (it4.hasNext()) {
                                                        dn dnVar = (dn) it4.next();
                                                        if (k71.k.b((dnVar == null || (aVar3 = dnVar.e.c) == null || (aVar4 = aVar3.b.e) == null) ? null : aVar4.a, str3)) {
                                                            it2 = it4;
                                                            g70.a a2 = g70.a.a(dnVar.h, !z2, z2);
                                                            y60.a aVar12 = dnVar.i;
                                                            String str8 = str4 == null ? aVar12.c : str4;
                                                            if (z2) {
                                                                bVar3 = bVar4;
                                                                str6 = str3;
                                                                if (str4 != null) {
                                                                    i2 = 25;
                                                                    z3 = true;
                                                                    dnVar = new dn(dnVar.a, dnVar.b, dnVar.c, dnVar.d, dnVar.e, dnVar.f, dnVar.g, a2, y60.a.a(aVar12, z3, str8, i2));
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                            } else {
                                                                str6 = str3;
                                                                z3 = aVar12.b;
                                                                bVar3 = bVar4;
                                                            }
                                                            i2 = 25;
                                                            dnVar = new dn(dnVar.a, dnVar.b, dnVar.c, dnVar.d, dnVar.e, dnVar.f, dnVar.g, a2, y60.a.a(aVar12, z3, str8, i2));
                                                        } else {
                                                            it2 = it4;
                                                            bVar3 = bVar4;
                                                            str6 = str3;
                                                        }
                                                        arrayList2.add(dnVar);
                                                        it4 = it2;
                                                        str3 = str6;
                                                        bVar4 = bVar3;
                                                    }
                                                } else {
                                                    aVar2 = aVar7;
                                                    arrayList2 = null;
                                                }
                                                bVar2 = bVar4;
                                                str5 = str3;
                                                hnVar = new hn(hnVar2.a, hnVar2.b, hnVar2.c, hnVar2.d, hnVar2.e, hnVar2.f, hnVar2.g, hnVar2.h, hnVar2.i, hnVar2.j, new xm(arrayList2), hnVar2.l);
                                            } else {
                                                aVar2 = aVar7;
                                                bVar2 = bVar4;
                                                str5 = str3;
                                                hnVar = null;
                                            }
                                            String str9 = cnVar2.a;
                                            k71.k.g(str9, "__typename");
                                            cnVar = new cn(str9, hnVar, gnVar);
                                        } else {
                                            aVar2 = aVar7;
                                            bVar2 = bVar4;
                                            it = it3;
                                            str4 = rawValue;
                                            str5 = str3;
                                            cnVar = null;
                                        }
                                        arrayList.add(cnVar);
                                        it3 = it;
                                        rawValue = str4;
                                        str3 = str5;
                                        aVar7 = aVar2;
                                        bVar4 = bVar2;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                aVar = aVar7;
                                bVar = bVar4;
                                nnVar = new nn(arrayList);
                            } else {
                                aVar = aVar7;
                                bVar = bVar4;
                                nnVar = null;
                            }
                            fnVar = new fn(fnVar2.a, fnVar2.b, fnVar2.c, fnVar2.d, fnVar2.e, fnVar2.f, fnVar2.g, fnVar2.h, fnVar2.i, nnVar, fnVar2.k, fnVar2.l, fnVar2.m, aVar9);
                        } else {
                            aVar = aVar7;
                            bVar = bVar4;
                            fnVar = null;
                        }
                        String str10 = enVar2.a;
                        String str11 = enVar2.b;
                        k71.k.g(str10, "__typename");
                        enVar = new en(str10, str11, fnVar);
                    } else {
                        aVar = aVar7;
                        bVar = bVar4;
                        enVar = null;
                    }
                    zm zmVar2 = new zm(enVar);
                    kVar.u = null;
                    kVar.v = null;
                    kVar.w = null;
                    kVar.x = z2;
                    kVar.A = 2;
                    b71.a aVar13 = aVar;
                    if (bVar.j(onVar, zmVar2, kVar) == aVar13) {
                        return aVar13;
                    }
                }
                return w61.a0.a;
            }
        }
        kVar = new vb0.k(this, cVar);
        Object obj2 = kVar.y;
        b71.a aVar72 = b71.a.r;
        i = kVar.A;
        com.github.service.wrapper.bShadow bVar42 = this.t;
        if (i != 0) {
        }
        zmVar = (zm) obj2;
        if (zmVar != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object K(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        n nVar;
        int i;
        String rawValue;
        to toVar;
        boolean z2;
        String str3;
        eo eoVar;
        b71.a aVar;
        com.github.service.wrapper.bShadow bVar;
        jo joVar;
        ko koVar;
        so soVar;
        ArrayList arrayList;
        b71.a aVar2;
        com.github.service.wrapper.bShadow bVar2;
        Iterator it;
        String str4;
        String str5;
        ho hoVar;
        mo moVar;
        ArrayList arrayList2;
        Iterator it2;
        com.github.service.wrapper.bShadow bVar3;
        String str6;
        boolean z3;
        int i2;
        se0.a aVar3;
        bl0.a aVar4;
        se0.c cVar2;
        boolean z4;
        bl0.a aVar5;
        bl0.a aVar6;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i3 = nVar.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.A = i3 - Integer.MIN_VALUE;
                Object obj = nVar.y;
                b71.a aVar7 = b71.a.r;
                i = nVar.A;
                com.github.service.wrapper.bShadow bVar4 = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    toVar = new to(str);
                    nVar.u = str2;
                    nVar.v = rawValue;
                    nVar.w = toVar;
                    z2 = z;
                    nVar.x = z2;
                    nVar.A = 1;
                    Object f = bVar4.f(toVar);
                    if (f == aVar7) {
                        return aVar7;
                    }
                    str3 = str2;
                    obj = f;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z2 = nVar.x;
                    toVar = nVar.w;
                    rawValue = nVar.v;
                    str3 = nVar.u;
                    sy.y.j(obj);
                }
                eoVar = (eo) obj;
                if (eoVar != null) {
                    jo joVar2 = eoVar.a;
                    if (joVar2 != null) {
                        ko koVar2 = joVar2.c;
                        if (koVar2 != null) {
                            yh0.a aVar8 = koVar2.n;
                            ao aoVar = koVar2.h;
                            if (k71.k.b((aoVar == null || (aVar6 = aoVar.b.e) == null) ? null : aVar6.a, str3)) {
                                aVar8 = yh0.a.a(aVar8, !z2, z2);
                            }
                            yh0.a aVar9 = aVar8;
                            so soVar2 = koVar2.j;
                            if (soVar2 != null) {
                                List list = soVar2.a;
                                if (list != null) {
                                    arrayList = new ArrayList(x61.n.F(list, 10));
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        ho hoVar2 = (ho) it3.next();
                                        if (hoVar2 != null) {
                                            lo loVar = hoVar2.c;
                                            if (loVar != null) {
                                                se0.c cVar3 = loVar.h;
                                                se0.a aVar10 = cVar3.c;
                                                if (k71.k.b((aVar10 == null || (aVar5 = aVar10.b.e) == null) ? null : aVar5.a, str3)) {
                                                    it = it3;
                                                    yh0.a a = yh0.a.a(loVar.k, !z2, z2);
                                                    qh0.a aVar11 = loVar.l;
                                                    String str7 = rawValue == null ? aVar11.c : rawValue;
                                                    if (z2) {
                                                        cVar2 = cVar3;
                                                        str4 = rawValue;
                                                        z4 = rawValue != null;
                                                    } else {
                                                        cVar2 = cVar3;
                                                        z4 = aVar11.b;
                                                        str4 = rawValue;
                                                    }
                                                    loVar = new lo(loVar.a, loVar.b, loVar.c, loVar.d, loVar.e, loVar.f, loVar.g, cVar2, loVar.i, loVar.j, a, qh0.a.a(aVar11, z4, str7, 25));
                                                } else {
                                                    it = it3;
                                                    str4 = rawValue;
                                                }
                                            } else {
                                                it = it3;
                                                str4 = rawValue;
                                                loVar = null;
                                            }
                                            mo moVar2 = hoVar2.b;
                                            if (moVar2 != null) {
                                                List list2 = moVar2.k.a;
                                                if (list2 != null) {
                                                    aVar2 = aVar7;
                                                    arrayList2 = new ArrayList(x61.n.F(list2, 10));
                                                    Iterator it4 = list2.iterator();
                                                    while (it4.hasNext()) {
                                                        io ioVar = (io) it4.next();
                                                        if (k71.k.b((ioVar == null || (aVar3 = ioVar.e.c) == null || (aVar4 = aVar3.b.e) == null) ? null : aVar4.a, str3)) {
                                                            it2 = it4;
                                                            yh0.a a2 = yh0.a.a(ioVar.h, !z2, z2);
                                                            qh0.a aVar12 = ioVar.i;
                                                            String str8 = str4 == null ? aVar12.c : str4;
                                                            if (z2) {
                                                                bVar3 = bVar4;
                                                                str6 = str3;
                                                                if (str4 != null) {
                                                                    i2 = 25;
                                                                    z3 = true;
                                                                    ioVar = new io(ioVar.a, ioVar.b, ioVar.c, ioVar.d, ioVar.e, ioVar.f, ioVar.g, a2, qh0.a.a(aVar12, z3, str8, i2));
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                            } else {
                                                                str6 = str3;
                                                                z3 = aVar12.b;
                                                                bVar3 = bVar4;
                                                            }
                                                            i2 = 25;
                                                            ioVar = new io(ioVar.a, ioVar.b, ioVar.c, ioVar.d, ioVar.e, ioVar.f, ioVar.g, a2, qh0.a.a(aVar12, z3, str8, i2));
                                                        } else {
                                                            it2 = it4;
                                                            bVar3 = bVar4;
                                                            str6 = str3;
                                                        }
                                                        arrayList2.add(ioVar);
                                                        it4 = it2;
                                                        str3 = str6;
                                                        bVar4 = bVar3;
                                                    }
                                                } else {
                                                    aVar2 = aVar7;
                                                    arrayList2 = null;
                                                }
                                                bVar2 = bVar4;
                                                str5 = str3;
                                                moVar = new mo(moVar2.a, moVar2.b, moVar2.c, moVar2.d, moVar2.e, moVar2.f, moVar2.g, moVar2.h, moVar2.i, moVar2.j, new bo(arrayList2), moVar2.l);
                                            } else {
                                                aVar2 = aVar7;
                                                bVar2 = bVar4;
                                                str5 = str3;
                                                moVar = null;
                                            }
                                            String str9 = hoVar2.a;
                                            k71.k.g(str9, "__typename");
                                            hoVar = new ho(str9, moVar, loVar);
                                        } else {
                                            aVar2 = aVar7;
                                            bVar2 = bVar4;
                                            it = it3;
                                            str4 = rawValue;
                                            str5 = str3;
                                            hoVar = null;
                                        }
                                        arrayList.add(hoVar);
                                        it3 = it;
                                        rawValue = str4;
                                        str3 = str5;
                                        aVar7 = aVar2;
                                        bVar4 = bVar2;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                aVar = aVar7;
                                bVar = bVar4;
                                soVar = new so(arrayList);
                            } else {
                                aVar = aVar7;
                                bVar = bVar4;
                                soVar = null;
                            }
                            koVar = new ko(koVar2.a, koVar2.b, koVar2.c, koVar2.d, koVar2.e, koVar2.f, koVar2.g, koVar2.h, koVar2.i, soVar, koVar2.k, koVar2.l, koVar2.m, aVar9);
                        } else {
                            aVar = aVar7;
                            bVar = bVar4;
                            koVar = null;
                        }
                        String str10 = joVar2.a;
                        String str11 = joVar2.b;
                        k71.k.g(str10, "__typename");
                        joVar = new jo(str10, str11, koVar);
                    } else {
                        aVar = aVar7;
                        bVar = bVar4;
                        joVar = null;
                    }
                    eo eoVar2 = new eo(joVar);
                    nVar.u = null;
                    nVar.v = null;
                    nVar.w = null;
                    nVar.x = z2;
                    nVar.A = 2;
                    b71.a aVar13 = aVar;
                    if (bVar.j(toVar, eoVar2, nVar) == aVar13) {
                        return aVar13;
                    }
                }
                return w61.a0.a;
            }
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.y;
        b71.a aVar72 = b71.a.r;
        i = nVar.A;
        com.github.service.wrapper.bShadow bVar42 = this.t;
        if (i != 0) {
        }
        eoVar = (eo) obj2;
        if (eoVar != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object L(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        wy0.n nVar;
        int i;
        String rawValue;
        kq kqVar;
        boolean z2;
        String str3;
        vp vpVar;
        b71.a aVar;
        com.github.service.wrapper.bShadow bVar;
        kq kqVar2;
        aq aqVar;
        bq bqVar;
        jq jqVar;
        ArrayList arrayList;
        b71.a aVar2;
        com.github.service.wrapper.bShadow bVar2;
        Iterator it;
        kq kqVar3;
        String str4;
        String str5;
        yp ypVar;
        dq dqVar;
        ArrayList arrayList2;
        Iterator it2;
        kq kqVar4;
        String str6;
        boolean z3;
        int i2;
        yp0.a aVar3;
        kw0.a aVar4;
        boolean z4;
        int i3;
        kw0.a aVar5;
        kw0.a aVar6;
        if (cVar instanceof wy0.n) {
            nVar = (wy0.n) cVar;
            int i4 = nVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nVar.A = i4 - Integer.MIN_VALUE;
                Object obj = nVar.y;
                b71.a aVar7 = b71.a.r;
                i = nVar.A;
                com.github.service.wrapper.bShadow bVar3 = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    kqVar = new kq(str);
                    nVar.u = str2;
                    nVar.v = rawValue;
                    nVar.w = kqVar;
                    z2 = z;
                    nVar.x = z2;
                    nVar.A = 1;
                    Object f = bVar3.f(kqVar);
                    if (f == aVar7) {
                        return aVar7;
                    }
                    str3 = str2;
                    obj = f;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z2 = nVar.x;
                    kqVar = nVar.w;
                    rawValue = nVar.v;
                    str3 = nVar.u;
                    sy.y.j(obj);
                }
                vpVar = (vp) obj;
                if (vpVar != null) {
                    aq aqVar2 = vpVar.a;
                    if (aqVar2 != null) {
                        bq bqVar2 = aqVar2.c;
                        if (bqVar2 != null) {
                            gt0.a aVar8 = bqVar2.n;
                            sp spVar = bqVar2.h;
                            if (k71.k.b((spVar == null || (aVar6 = spVar.b.g) == null) ? null : aVar6.a, str3)) {
                                aVar8 = gt0.a.a(aVar8, !z2, z2);
                            }
                            gt0.a aVar9 = aVar8;
                            jq jqVar2 = bqVar2.j;
                            if (jqVar2 != null) {
                                List list = jqVar2.a;
                                if (list != null) {
                                    arrayList = new ArrayList(x61.n.F(list, 10));
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        yp ypVar2 = (yp) it3.next();
                                        if (ypVar2 != null) {
                                            cq cqVar = ypVar2.c;
                                            if (cqVar != null) {
                                                yp0.c cVar2 = cqVar.h;
                                                it = it3;
                                                yp0.a aVar10 = cVar2.c;
                                                if (k71.k.b((aVar10 == null || (aVar5 = aVar10.b.g) == null) ? null : aVar5.a, str3)) {
                                                    gt0.a a = gt0.a.a(cqVar.k, !z2, z2);
                                                    at0.a aVar11 = cqVar.l;
                                                    String str7 = rawValue == null ? aVar11.c : rawValue;
                                                    if (z2) {
                                                        aVar2 = aVar7;
                                                        str4 = rawValue;
                                                        if (rawValue != null) {
                                                            i3 = 25;
                                                            z4 = true;
                                                            cqVar = new cq(cqVar.a, cqVar.b, cqVar.c, cqVar.d, cqVar.e, cqVar.f, cqVar.g, cVar2, cqVar.i, cqVar.j, a, at0.a.a(aVar11, z4, str7, i3));
                                                        } else {
                                                            z4 = false;
                                                        }
                                                    } else {
                                                        str4 = rawValue;
                                                        z4 = aVar11.b;
                                                        aVar2 = aVar7;
                                                    }
                                                    i3 = 25;
                                                    cqVar = new cq(cqVar.a, cqVar.b, cqVar.c, cqVar.d, cqVar.e, cqVar.f, cqVar.g, cVar2, cqVar.i, cqVar.j, a, at0.a.a(aVar11, z4, str7, i3));
                                                } else {
                                                    aVar2 = aVar7;
                                                    str4 = rawValue;
                                                }
                                            } else {
                                                aVar2 = aVar7;
                                                it = it3;
                                                str4 = rawValue;
                                                cqVar = null;
                                            }
                                            dq dqVar2 = ypVar2.b;
                                            if (dqVar2 != null) {
                                                List list2 = dqVar2.k.a;
                                                if (list2 != null) {
                                                    bVar2 = bVar3;
                                                    arrayList2 = new ArrayList(x61.n.F(list2, 10));
                                                    Iterator it4 = list2.iterator();
                                                    while (it4.hasNext()) {
                                                        zp zpVar = (zp) it4.next();
                                                        if (k71.k.b((zpVar == null || (aVar3 = zpVar.e.c) == null || (aVar4 = aVar3.b.g) == null) ? null : aVar4.a, str3)) {
                                                            it2 = it4;
                                                            gt0.a a2 = gt0.a.a(zpVar.h, !z2, z2);
                                                            at0.a aVar12 = zpVar.i;
                                                            String str8 = str4 == null ? aVar12.c : str4;
                                                            if (z2) {
                                                                kqVar4 = kqVar;
                                                                str6 = str3;
                                                                if (str4 != null) {
                                                                    i2 = 25;
                                                                    z3 = true;
                                                                    zpVar = new zp(zpVar.a, zpVar.b, zpVar.c, zpVar.d, zpVar.e, zpVar.f, zpVar.g, a2, at0.a.a(aVar12, z3, str8, i2));
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                            } else {
                                                                str6 = str3;
                                                                z3 = aVar12.b;
                                                                kqVar4 = kqVar;
                                                            }
                                                            i2 = 25;
                                                            zpVar = new zp(zpVar.a, zpVar.b, zpVar.c, zpVar.d, zpVar.e, zpVar.f, zpVar.g, a2, at0.a.a(aVar12, z3, str8, i2));
                                                        } else {
                                                            it2 = it4;
                                                            kqVar4 = kqVar;
                                                            str6 = str3;
                                                        }
                                                        arrayList2.add(zpVar);
                                                        kqVar = kqVar4;
                                                        it4 = it2;
                                                        str3 = str6;
                                                    }
                                                } else {
                                                    bVar2 = bVar3;
                                                    arrayList2 = null;
                                                }
                                                kqVar3 = kqVar;
                                                str5 = str3;
                                                dqVar = new dq(dqVar2.a, dqVar2.b, dqVar2.c, dqVar2.d, dqVar2.e, dqVar2.f, dqVar2.g, dqVar2.h, dqVar2.i, dqVar2.j, new tp(arrayList2), dqVar2.l);
                                            } else {
                                                bVar2 = bVar3;
                                                kqVar3 = kqVar;
                                                str5 = str3;
                                                dqVar = null;
                                            }
                                            String str9 = ypVar2.a;
                                            k71.k.g(str9, "__typename");
                                            ypVar = new yp(str9, dqVar, cqVar);
                                        } else {
                                            aVar2 = aVar7;
                                            bVar2 = bVar3;
                                            it = it3;
                                            kqVar3 = kqVar;
                                            str4 = rawValue;
                                            str5 = str3;
                                            ypVar = null;
                                        }
                                        arrayList.add(ypVar);
                                        kqVar = kqVar3;
                                        it3 = it;
                                        rawValue = str4;
                                        str3 = str5;
                                        aVar7 = aVar2;
                                        bVar3 = bVar2;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                aVar = aVar7;
                                bVar = bVar3;
                                kqVar2 = kqVar;
                                jqVar = new jq(arrayList);
                            } else {
                                aVar = aVar7;
                                bVar = bVar3;
                                kqVar2 = kqVar;
                                jqVar = null;
                            }
                            bqVar = new bq(bqVar2.a, bqVar2.b, bqVar2.c, bqVar2.d, bqVar2.e, bqVar2.f, bqVar2.g, bqVar2.h, bqVar2.i, jqVar, bqVar2.k, bqVar2.l, bqVar2.m, aVar9);
                        } else {
                            aVar = aVar7;
                            bVar = bVar3;
                            kqVar2 = kqVar;
                            bqVar = null;
                        }
                        String str10 = aqVar2.a;
                        String str11 = aqVar2.b;
                        k71.k.g(str10, "__typename");
                        aqVar = new aq(str10, str11, bqVar);
                    } else {
                        aVar = aVar7;
                        bVar = bVar3;
                        kqVar2 = kqVar;
                        aqVar = null;
                    }
                    vp vpVar2 = new vp(aqVar, vpVar.b, vpVar.c);
                    nVar.u = null;
                    nVar.v = null;
                    nVar.w = null;
                    nVar.x = z2;
                    nVar.A = 2;
                    b71.a aVar13 = aVar;
                    if (bVar.j(kqVar2, vpVar2, nVar) == aVar13) {
                        return aVar13;
                    }
                }
                return w61.a0.a;
            }
        }
        nVar = new wy0.n(this, cVar);
        Object obj2 = nVar.y;
        b71.a aVar72 = b71.a.r;
        i = nVar.A;
        com.github.service.wrapper.bShadow bVar32 = this.t;
        if (i != 0) {
        }
        vpVar = (vp) obj2;
        if (vpVar != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object M(String str, String str2, boolean z, HideCommentReason hideCommentReason, c71.c cVar) {
        t00.s sVar;
        int i;
        String rawValue;
        hs hsVar;
        boolean z2;
        String str3;
        sr srVar;
        b71.a aVar;
        com.github.service.wrapper.bShadow bVar;
        hs hsVar2;
        xr xrVar;
        yr yrVar;
        gs gsVar;
        ArrayList arrayList;
        b71.a aVar2;
        com.github.service.wrapper.bShadow bVar2;
        Iterator it;
        hs hsVar3;
        String str4;
        String str5;
        vr vrVar;
        as asVar;
        ArrayList arrayList2;
        Iterator it2;
        hs hsVar4;
        String str6;
        boolean z3;
        int i2;
        ar.a aVar3;
        vx.a aVar4;
        boolean z4;
        int i3;
        vx.a aVar5;
        vx.a aVar6;
        if (cVar instanceof t00.s) {
            sVar = (t00.s) cVar;
            int i4 = sVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                sVar.A = i4 - Integer.MIN_VALUE;
                Object obj = sVar.y;
                b71.a aVar7 = b71.a.r;
                i = sVar.A;
                com.github.service.wrapper.bShadow bVar3 = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    MinimizedStateReason o = t.z.o(hideCommentReason);
                    rawValue = o != null ? o.getRawValue() : null;
                    hsVar = new hs(str);
                    sVar.u = str2;
                    sVar.v = rawValue;
                    sVar.w = hsVar;
                    z2 = z;
                    sVar.x = z2;
                    sVar.A = 1;
                    Object f = bVar3.f(hsVar);
                    if (f == aVar7) {
                        return aVar7;
                    }
                    str3 = str2;
                    obj = f;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    z2 = sVar.x;
                    hsVar = sVar.w;
                    rawValue = sVar.v;
                    str3 = sVar.u;
                    sy.y.j(obj);
                }
                srVar = (sr) obj;
                if (srVar != null) {
                    xr xrVar2 = srVar.a;
                    if (xrVar2 != null) {
                        yr yrVar2 = xrVar2.c;
                        if (yrVar2 != null) {
                            pu.a aVar8 = yrVar2.n;
                            pr prVar = yrVar2.h;
                            if (k71.k.b((prVar == null || (aVar6 = prVar.b.g) == null) ? null : aVar6.a, str3)) {
                                aVar8 = pu.a.a(aVar8, !z2, z2);
                            }
                            pu.a aVar9 = aVar8;
                            gs gsVar2 = yrVar2.j;
                            if (gsVar2 != null) {
                                List list = gsVar2.a;
                                if (list != null) {
                                    arrayList = new ArrayList(x61.n.F(list, 10));
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        vr vrVar2 = (vr) it3.next();
                                        if (vrVar2 != null) {
                                            zr zrVar = vrVar2.c;
                                            if (zrVar != null) {
                                                ar.c cVar2 = zrVar.h;
                                                it = it3;
                                                ar.a aVar10 = cVar2.c;
                                                if (k71.k.b((aVar10 == null || (aVar5 = aVar10.b.g) == null) ? null : aVar5.a, str3)) {
                                                    pu.a a = pu.a.a(zrVar.k, !z2, z2);
                                                    ju.a aVar11 = zrVar.l;
                                                    String str7 = rawValue == null ? aVar11.c : rawValue;
                                                    if (z2) {
                                                        aVar2 = aVar7;
                                                        str4 = rawValue;
                                                        if (rawValue != null) {
                                                            i3 = 25;
                                                            z4 = true;
                                                            zrVar = new zr(zrVar.a, zrVar.b, zrVar.c, zrVar.d, zrVar.e, zrVar.f, zrVar.g, cVar2, zrVar.i, zrVar.j, a, ju.a.a(aVar11, z4, str7, i3));
                                                        } else {
                                                            z4 = false;
                                                        }
                                                    } else {
                                                        str4 = rawValue;
                                                        z4 = aVar11.b;
                                                        aVar2 = aVar7;
                                                    }
                                                    i3 = 25;
                                                    zrVar = new zr(zrVar.a, zrVar.b, zrVar.c, zrVar.d, zrVar.e, zrVar.f, zrVar.g, cVar2, zrVar.i, zrVar.j, a, ju.a.a(aVar11, z4, str7, i3));
                                                } else {
                                                    aVar2 = aVar7;
                                                    str4 = rawValue;
                                                }
                                            } else {
                                                aVar2 = aVar7;
                                                it = it3;
                                                str4 = rawValue;
                                                zrVar = null;
                                            }
                                            as asVar2 = vrVar2.b;
                                            if (asVar2 != null) {
                                                List list2 = asVar2.k.a;
                                                if (list2 != null) {
                                                    bVar2 = bVar3;
                                                    arrayList2 = new ArrayList(x61.n.F(list2, 10));
                                                    Iterator it4 = list2.iterator();
                                                    while (it4.hasNext()) {
                                                        wr wrVar = (wr) it4.next();
                                                        if (k71.k.b((wrVar == null || (aVar3 = wrVar.e.c) == null || (aVar4 = aVar3.b.g) == null) ? null : aVar4.a, str3)) {
                                                            it2 = it4;
                                                            pu.a a2 = pu.a.a(wrVar.h, !z2, z2);
                                                            ju.a aVar12 = wrVar.i;
                                                            String str8 = str4 == null ? aVar12.c : str4;
                                                            if (z2) {
                                                                hsVar4 = hsVar;
                                                                str6 = str3;
                                                                if (str4 != null) {
                                                                    i2 = 25;
                                                                    z3 = true;
                                                                    wrVar = new wr(wrVar.a, wrVar.b, wrVar.c, wrVar.d, wrVar.e, wrVar.f, wrVar.g, a2, ju.a.a(aVar12, z3, str8, i2));
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                            } else {
                                                                str6 = str3;
                                                                z3 = aVar12.b;
                                                                hsVar4 = hsVar;
                                                            }
                                                            i2 = 25;
                                                            wrVar = new wr(wrVar.a, wrVar.b, wrVar.c, wrVar.d, wrVar.e, wrVar.f, wrVar.g, a2, ju.a.a(aVar12, z3, str8, i2));
                                                        } else {
                                                            it2 = it4;
                                                            hsVar4 = hsVar;
                                                            str6 = str3;
                                                        }
                                                        arrayList2.add(wrVar);
                                                        hsVar = hsVar4;
                                                        it4 = it2;
                                                        str3 = str6;
                                                    }
                                                } else {
                                                    bVar2 = bVar3;
                                                    arrayList2 = null;
                                                }
                                                hsVar3 = hsVar;
                                                str5 = str3;
                                                asVar = new as(asVar2.a, asVar2.b, asVar2.c, asVar2.d, asVar2.e, asVar2.f, asVar2.g, asVar2.h, asVar2.i, asVar2.j, new qr(arrayList2), asVar2.l);
                                            } else {
                                                bVar2 = bVar3;
                                                hsVar3 = hsVar;
                                                str5 = str3;
                                                asVar = null;
                                            }
                                            String str9 = vrVar2.a;
                                            k71.k.g(str9, "__typename");
                                            vrVar = new vr(str9, asVar, zrVar);
                                        } else {
                                            aVar2 = aVar7;
                                            bVar2 = bVar3;
                                            it = it3;
                                            hsVar3 = hsVar;
                                            str4 = rawValue;
                                            str5 = str3;
                                            vrVar = null;
                                        }
                                        arrayList.add(vrVar);
                                        hsVar = hsVar3;
                                        it3 = it;
                                        rawValue = str4;
                                        str3 = str5;
                                        aVar7 = aVar2;
                                        bVar3 = bVar2;
                                    }
                                } else {
                                    arrayList = null;
                                }
                                aVar = aVar7;
                                bVar = bVar3;
                                hsVar2 = hsVar;
                                gsVar = new gs(arrayList);
                            } else {
                                aVar = aVar7;
                                bVar = bVar3;
                                hsVar2 = hsVar;
                                gsVar = null;
                            }
                            yrVar = new yr(yrVar2.a, yrVar2.b, yrVar2.c, yrVar2.d, yrVar2.e, yrVar2.f, yrVar2.g, yrVar2.h, yrVar2.i, gsVar, yrVar2.k, yrVar2.l, yrVar2.m, aVar9);
                        } else {
                            aVar = aVar7;
                            bVar = bVar3;
                            hsVar2 = hsVar;
                            yrVar = null;
                        }
                        String str10 = xrVar2.a;
                        String str11 = xrVar2.b;
                        k71.k.g(str10, "__typename");
                        xrVar = new xr(str10, str11, yrVar);
                    } else {
                        aVar = aVar7;
                        bVar = bVar3;
                        hsVar2 = hsVar;
                        xrVar = null;
                    }
                    sr srVar2 = new sr(xrVar, srVar.b, srVar.c);
                    sVar.u = null;
                    sVar.v = null;
                    sVar.w = null;
                    sVar.x = z2;
                    sVar.A = 2;
                    b71.a aVar13 = aVar;
                    if (bVar.j(hsVar2, srVar2, sVar) == aVar13) {
                        return aVar13;
                    }
                }
                return w61.a0.a;
            }
        }
        sVar = new t00.s(this, cVar);
        Object obj2 = sVar.y;
        b71.a aVar72 = b71.a.r;
        i = sVar.A;
        com.github.service.wrapper.bShadow bVar32 = this.t;
        if (i != 0) {
        }
        srVar = (sr) obj2;
        if (srVar != null) {
        }
        return w61.a0.a;
    }

    @Override // z01.d
    public final y71.i a(String str, String str2, String str3, BlockDuration blockDuration, boolean z, HideCommentReason hideCommentReason, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "discussionId");
                return y71.n1.y(new y71.y(u(str, str2, str3, blockDuration, z, hideCommentReason), new g(this, str4, str, hideCommentReason, null, 0), 6), this.u);
            case 1:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "discussionId");
                return y71.n1.y(new y71.y(w(str, str2, str3, blockDuration, z, hideCommentReason), new t00.l(this, str4, str, hideCommentReason, (a71.c) null, 0), 6), this.u);
            case 2:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "discussionId");
                return y71.n1.y(new y71.y(t(str, str2, str3, blockDuration, z, hideCommentReason), new vb0.d(this, str4, str, hideCommentReason, null, 0), 6), this.u);
            default:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "discussionId");
                return y71.n1.y(new y71.y(v(str, str2, str3, blockDuration, z, hideCommentReason), new wy0.g(this, str4, str, hideCommentReason, null, 0), 6), this.u);
        }
    }

    @Override // z01.d
    public final y71.i b(String str, String str2, String str3, BlockDuration blockDuration, boolean z, HideCommentReason hideCommentReason, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "issueOrPullId");
                return y71.n1.y(new y71.y(u(str, str2, str3, blockDuration, z, hideCommentReason), new g(this, str4, str, hideCommentReason, null, 1), 6), this.u);
            case 1:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "issueOrPullId");
                return y71.n1.y(new y71.y(w(str, str2, str3, blockDuration, z, hideCommentReason), new t00.l(this, str4, str, hideCommentReason, (a71.c) null, 1), 6), this.u);
            case 2:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "issueOrPullId");
                return y71.n1.y(new y71.y(t(str, str2, str3, blockDuration, z, hideCommentReason), new vb0.d(this, str4, str, hideCommentReason, null, 1), 6), this.u);
            default:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "issueOrPullId");
                return y71.n1.y(new y71.y(v(str, str2, str3, blockDuration, z, hideCommentReason), new wy0.g(this, str4, str, hideCommentReason, null, 1), 6), this.u);
        }
    }

    @Override // z01.d
    public final y71.i c(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                k71.k.g(str3, "issueOrPullId");
                return y71.n1.y(new y71.y(y(str, str2), new h(this, str3, str, null, 1), 6), this.u);
            case 1:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                k71.k.g(str3, "issueOrPullId");
                return y71.n1.y(new y71.y(A(str, str2), new t00.m(this, str3, str, (a71.c) null, 1), 6), this.u);
            case 2:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                k71.k.g(str3, "issueOrPullId");
                return y71.n1.y(new y71.y(x(str, str2), new vb0.e(this, str3, str, null, 1), 6), this.u);
            default:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                k71.k.g(str3, "issueOrPullId");
                return y71.n1.y(new y71.y(z(str, str2), new wy0.h(this, str3, str, null, 1), 6), this.u);
        }
    }

    @Override // z01.d
    public final y71.i d(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                k71.k.g(str3, "discussionId");
                return y71.n1.y(new y71.y(y(str, str2), new h(this, str3, str, null, 0), 6), this.u);
            case 1:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                k71.k.g(str3, "discussionId");
                return y71.n1.y(new y71.y(A(str, str2), new t00.m(this, str3, str, (a71.c) null, 0), 6), this.u);
            case 2:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                k71.k.g(str3, "discussionId");
                return y71.n1.y(new y71.y(x(str, str2), new vb0.e(this, str3, str, null, 0), 6), this.u);
            default:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                k71.k.g(str3, "discussionId");
                return y71.n1.y(new y71.y(z(str, str2), new wy0.h(this, str3, str, null, 0), 6), this.u);
        }
    }

    @Override // z01.d
    public final y71.i e(String str, String str2, String str3, BlockDuration blockDuration, boolean z, HideCommentReason hideCommentReason, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "reviewId");
                return y71.n1.y(in.r.l(new y71.y(u(str, str2, str3, blockDuration, z, hideCommentReason), new g(this, str4, str, hideCommentReason, null, 2), 6)), this.u);
            case 1:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "reviewId");
                return y71.n1.y(in.r.l(new y71.y(w(str, str2, str3, blockDuration, z, hideCommentReason), new t00.l(this, str4, str, hideCommentReason, (a71.c) null, 2), 6)), this.u);
            case 2:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "reviewId");
                return y71.n1.y(in.r.l(new y71.y(t(str, str2, str3, blockDuration, z, hideCommentReason), new vb0.d(this, str4, str, hideCommentReason, null, 2), 6)), this.u);
            default:
                k71.k.g(blockDuration, "duration");
                k71.k.g(str4, "reviewId");
                return y71.n1.y(in.r.l(new y71.y(v(str, str2, str3, blockDuration, z, hideCommentReason), new wy0.g(this, str4, str, hideCommentReason, null, 2), 6)), this.u);
        }
    }

    @Override // z01.d
    public final y71.i f(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                return y71.n1.y(new y71.y(y(str, str2), new h(this, str3, str, null, 2), 6), this.u);
            case 1:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                return y71.n1.y(new y71.y(A(str, str2), new t00.m(this, str3, str, (a71.c) null, 2), 6), this.u);
            case 2:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                return y71.n1.y(new y71.y(x(str, str2), new vb0.e(this, str3, str, null, 2), 6), this.u);
            default:
                k71.k.g(str, "userId");
                k71.k.g(str2, "organizationId");
                return y71.n1.y(new y71.y(z(str, str2), new wy0.h(this, str3, str, null, 2), 6), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    public gl.f t(String str, String str2, String str3, BlockDuration blockDuration, boolean z, HideCommentReason hideCommentReason) {
        hc0.x1 x1Var;
        k71.k.g(blockDuration, "<this>");
        int i = ab0.a.a[blockDuration.ordinal()];
        if (i == 1) {
            x1Var = hc0.x1.s;
        } else if (i == 2) {
            x1Var = hc0.x1.t;
        } else if (i == 3) {
            x1Var = hc0.x1.w;
        } else if (i == 4) {
            x1Var = hc0.x1.u;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            x1Var = hc0.x1.v;
        }
        hc0.x1 x1Var2 = x1Var;
        int i2 = hideCommentReason == null ? -1 : ab0.d.a[hideCommentReason.ordinal()];
        yo yoVar = null;
        switch (i2) {
            case -1:
            case 1:
            case 2:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 3:
                yoVar = yo.t;
                break;
            case 4:
                yoVar = yo.u;
                break;
            case 5:
                yoVar = yo.s;
                break;
            case 6:
                yoVar = yo.v;
                break;
        }
        return in.r.l(in.r.h(this.s.d(new u10.c3(str, str2, str3, x1Var2, z, new aa.u0(yoVar)))));
    }

    public gl.f u(String str, String str2, String str3, BlockDuration blockDuration, boolean z, HideCommentReason hideCommentReason) {
        gn0.z1 z1Var;
        k71.k.g(blockDuration, "<this>");
        int i = vl0.a.a[blockDuration.ordinal()];
        if (i == 1) {
            z1Var = gn0.z1.s;
        } else if (i == 2) {
            z1Var = gn0.z1.t;
        } else if (i == 3) {
            z1Var = gn0.z1.w;
        } else if (i == 4) {
            z1Var = gn0.z1.u;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            z1Var = gn0.z1.v;
        }
        gn0.z1 z1Var2 = z1Var;
        int i2 = hideCommentReason == null ? -1 : vl0.d.a[hideCommentReason.ordinal()];
        gn0.cq cqVar = null;
        switch (i2) {
            case -1:
            case 1:
            case 2:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 3:
                cqVar = gn0.cq.t;
                break;
            case 4:
                cqVar = gn0.cq.u;
                break;
            case 5:
                cqVar = gn0.cq.s;
                break;
            case 6:
                cqVar = gn0.cq.v;
                break;
        }
        return in.r.l(in.r.h(this.s.d(new kc0.c3(str, str2, str3, z1Var2, z, new aa.u0(cqVar)))));
    }

    public gl.f v(String str, String str2, String str3, BlockDuration blockDuration, boolean z, HideCommentReason hideCommentReason) {
        pz0.m2 m2Var;
        hx hxVar;
        k71.k.g(blockDuration, "<this>");
        int i = jx0.a.a[blockDuration.ordinal()];
        if (i == 1) {
            m2Var = pz0.m2.s;
        } else if (i == 2) {
            m2Var = pz0.m2.t;
        } else if (i == 3) {
            m2Var = pz0.m2.w;
        } else if (i == 4) {
            m2Var = pz0.m2.u;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            m2Var = pz0.m2.v;
        }
        pz0.m2 m2Var2 = m2Var;
        switch (hideCommentReason == null ? -1 : jx0.d.a[hideCommentReason.ordinal()]) {
            case -1:
                hxVar = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                hxVar = hx.w;
                break;
            case 2:
                hxVar = hx.w;
                break;
            case 3:
                hxVar = hx.t;
                break;
            case 4:
                hxVar = hx.u;
                break;
            case 5:
                hxVar = hx.s;
                break;
            case 6:
                hxVar = hx.v;
                break;
        }
        return in.r.l(in.r.h(this.s.d(new jn0.i3(str, str2, str3, m2Var2, z, new aa.u0(hxVar)))));
    }

    public gl.f w(String str, String str2, String str3, BlockDuration blockDuration, boolean z, HideCommentReason hideCommentReason) {
        m10.z2 z2Var;
        g30 g30Var;
        k71.k.g(blockDuration, "<this>");
        int i = dz.a.a[blockDuration.ordinal()];
        if (i == 1) {
            z2Var = m10.z2.s;
        } else if (i == 2) {
            z2Var = m10.z2.t;
        } else if (i == 3) {
            z2Var = m10.z2.w;
        } else if (i == 4) {
            z2Var = m10.z2.u;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            z2Var = m10.z2.v;
        }
        m10.z2 z2Var2 = z2Var;
        switch (hideCommentReason == null ? -1 : dz.d.a[hideCommentReason.ordinal()]) {
            case -1:
                g30Var = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                g30Var = g30.x;
                break;
            case 2:
                g30Var = g30.s;
                break;
            case 3:
                g30Var = g30.u;
                break;
            case 4:
                g30Var = g30.v;
                break;
            case 5:
                g30Var = g30.t;
                break;
            case 6:
                g30Var = g30.w;
                break;
        }
        return in.r.l(in.r.h(this.s.d(new jo.q3(str, str2, str3, z2Var2, z, new aa.u0(g30Var)))));
    }

    public gl.f x(String str, String str2) {
        return in.r.l(in.r.h(this.s.d(new r10(str, str2))));
    }

    public gl.f y(String str, String str2) {
        return in.r.l(in.r.h(this.s.d(new p30(str, str2))));
    }

    public gl.f z(String str, String str2) {
        return in.r.l(in.r.h(this.s.d(new i70(str, str2))));
    }
    public static final Object a = null;
}
