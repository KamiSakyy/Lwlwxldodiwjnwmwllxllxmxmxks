package rm0;

import gn0.j00;
import gn0.m00;
import hc0.bz;
import hc0.ez;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jn0.ef0;
import jn0.ff0;
import jn0.gf0;
import jn0.if0;
import jn0.jf0;
import jn0.mf;
import jn0.yf0;
import jo.jg;
import jo.mi0;
import jo.sh0;
import jo.th0;
import jo.uh0;
import jo.wh0;
import jo.xh0;
import kc0.eb0;
import kc0.fb0;
import kc0.gb0;
import kc0.ib0;
import kc0.jb0;
import kc0.ud;
import kc0.yb0;
import m10.lf0;
import pz0.n80;
import pz0.q80;
import u10.bd;
import u10.e90;
import u10.f90;
import u10.g90;
import u10.i90;
import u10.j90;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j4 implements z01.j0, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.bShadow t;
    public v71.v u;

    public j4(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedApolloClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedApolloClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedApolloClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedApolloClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r0.j(r12, r11, r1) == r13) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(j4 j4Var, ea0.z0 z0Var, String str, c71.c cVar) {
        vb0.y2 y2Var;
        int i;
        aa.s0 s0Var;
        e90 e90Var;
        i90 i90Var;
        com.github.service.wrapper.bShadow bVar = j4Var.t;
        if (cVar instanceof vb0.y2) {
            y2Var = (vb0.y2) cVar;
            int i2 = y2Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y2Var.y = i2 - Integer.MIN_VALUE;
                Object obj = y2Var.w;
                b71.a aVar = b71.a.r;
                i = y2Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.s0 j90Var = new j90(new aa.u0(new Integer(100)), str);
                    y2Var.u = z0Var;
                    y2Var.v = j90Var;
                    y2Var.y = 1;
                    Object f = bVar.f(j90Var);
                    if (f != aVar) {
                        s0Var = j90Var;
                        obj = f;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                aa.s0 s0Var2 = y2Var.v;
                ea0.z0 z0Var2 = y2Var.u;
                sy.y.j(obj);
                s0Var = s0Var2;
                z0Var = z0Var2;
                e90Var = (e90) obj;
                if (e90Var != null) {
                    i90 i90Var2 = e90Var.a;
                    if (i90Var2 != null) {
                        f90 f90Var = i90Var2.d;
                        y61.bShadow i3 = sy.d0.i();
                        i3.add(new g90(z0Var.g, z0Var.a, z0Var));
                        Collection collection = f90Var.a;
                        if (collection == null) {
                            collection = x61.r.r;
                        }
                        i3.addAll(collection);
                        i90Var = i90.a(i90Var2, new f90(sy.d0.h(i3)));
                    } else {
                        i90Var = null;
                    }
                    aa.r0 e90Var2 = new e90(i90Var);
                    y2Var.u = null;
                    y2Var.v = null;
                    y2Var.y = 2;
                }
                return w61.a0.a;
            }
        }
        y2Var = new vb0.y2(j4Var, cVar);
        Object obj2 = y2Var.w;
        b71.a aVar2 = b71.a.r;
        i = y2Var.y;
        if (i != 0) {
        }
        e90Var = (e90) obj2;
        if (e90Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r0.j(r13, r5, r1) == r14) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(j4 j4Var, fw0.z0 z0Var, String str, c71.c cVar) {
        wy0.d3 d3Var;
        int i;
        aa.s0 s0Var;
        ef0 ef0Var;
        if0 if0Var;
        com.github.service.wrapper.bShadow bVar = j4Var.t;
        if (cVar instanceof wy0.d3) {
            d3Var = (wy0.d3) cVar;
            int i2 = d3Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d3Var.y = i2 - Integer.MIN_VALUE;
                Object obj = d3Var.w;
                b71.a aVar = b71.a.r;
                i = d3Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.s0 jf0Var = new jf0(new aa.u0(new Integer(100)), str);
                    d3Var.u = z0Var;
                    d3Var.v = jf0Var;
                    d3Var.y = 1;
                    Object f = bVar.f(jf0Var);
                    if (f != aVar) {
                        s0Var = jf0Var;
                        obj = f;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                aa.s0 s0Var2 = d3Var.v;
                fw0.z0 z0Var2 = d3Var.u;
                sy.y.j(obj);
                s0Var = s0Var2;
                z0Var = z0Var2;
                ef0Var = (ef0) obj;
                if (ef0Var != null) {
                    if0 if0Var2 = ef0Var.a;
                    if (if0Var2 != null) {
                        ff0 ff0Var = if0Var2.d;
                        y61.bShadow i3 = sy.d0.i();
                        i3.add(new gf0(z0Var.g, z0Var.a, z0Var));
                        Collection collection = ff0Var.a;
                        if (collection == null) {
                            collection = x61.r.r;
                        }
                        i3.addAll(collection);
                        if0Var = if0.a(if0Var2, new ff0(sy.d0.h(i3)));
                    } else {
                        if0Var = null;
                    }
                    aa.r0 ef0Var2 = new ef0(if0Var, ef0Var.b, ef0Var.c);
                    d3Var.u = null;
                    d3Var.v = null;
                    d3Var.y = 2;
                }
                return w61.a0.a;
            }
        }
        d3Var = new wy0.d3(j4Var, cVar);
        Object obj2 = d3Var.w;
        b71.a aVar2 = b71.a.r;
        i = d3Var.y;
        if (i != 0) {
        }
        ef0Var = (ef0) obj2;
        if (ef0Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r0.j(r13, r5, r1) == r14) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(j4 j4Var, qx.z0 z0Var, String str, c71.c cVar) {
        t00.s3 s3Var;
        int i;
        aa.s0 s0Var;
        sh0 sh0Var;
        wh0 wh0Var;
        com.github.service.wrapper.bShadow bVar = j4Var.t;
        if (cVar instanceof t00.s3) {
            s3Var = (t00.s3) cVar;
            int i2 = s3Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s3Var.y = i2 - Integer.MIN_VALUE;
                Object obj = s3Var.w;
                b71.a aVar = b71.a.r;
                i = s3Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.s0 xh0Var = new xh0(new aa.u0(new Integer(100)), str);
                    s3Var.u = z0Var;
                    s3Var.v = xh0Var;
                    s3Var.y = 1;
                    Object f = bVar.f(xh0Var);
                    if (f != aVar) {
                        s0Var = xh0Var;
                        obj = f;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                aa.s0 s0Var2 = s3Var.v;
                qx.z0 z0Var2 = s3Var.u;
                sy.y.j(obj);
                s0Var = s0Var2;
                z0Var = z0Var2;
                sh0Var = (sh0) obj;
                if (sh0Var != null) {
                    wh0 wh0Var2 = sh0Var.a;
                    if (wh0Var2 != null) {
                        th0 th0Var = wh0Var2.d;
                        y61.bShadow i3 = sy.d0.i();
                        i3.add(new uh0(z0Var.g, z0Var.a, z0Var));
                        Collection collection = th0Var.a;
                        if (collection == null) {
                            collection = x61.r.r;
                        }
                        i3.addAll(collection);
                        wh0Var = wh0.a(wh0Var2, new th0(sy.d0.h(i3)));
                    } else {
                        wh0Var = null;
                    }
                    sh0 sh0Var2 = new sh0(wh0Var, sh0Var.b, sh0Var.c);
                    s3Var.u = null;
                    s3Var.v = null;
                    s3Var.y = 2;
                }
                return w61.a0.a;
            }
        }
        s3Var = new t00.s3(j4Var, cVar);
        Object obj2 = s3Var.w;
        b71.a aVar2 = b71.a.r;
        i = s3Var.y;
        if (i != 0) {
        }
        sh0Var = (sh0) obj2;
        if (sh0Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r0.j(r12, r11, r1) == r13) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(j4 j4Var, wk0.z0 z0Var, String str, c71.c cVar) {
        d4 d4Var;
        int i;
        aa.s0 s0Var;
        eb0 eb0Var;
        ib0 ib0Var;
        com.github.service.wrapper.bShadow bVar = j4Var.t;
        if (cVar instanceof d4) {
            d4Var = (d4) cVar;
            int i2 = d4Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d4Var.y = i2 - Integer.MIN_VALUE;
                Object obj = d4Var.w;
                b71.a aVar = b71.a.r;
                i = d4Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.s0 jb0Var = new jb0(new aa.u0(new Integer(100)), str);
                    d4Var.u = z0Var;
                    d4Var.v = jb0Var;
                    d4Var.y = 1;
                    Object f = bVar.f(jb0Var);
                    if (f != aVar) {
                        s0Var = jb0Var;
                        obj = f;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                aa.s0 s0Var2 = d4Var.v;
                wk0.z0 z0Var2 = d4Var.u;
                sy.y.j(obj);
                s0Var = s0Var2;
                z0Var = z0Var2;
                eb0Var = (eb0) obj;
                if (eb0Var != null) {
                    ib0 ib0Var2 = eb0Var.a;
                    if (ib0Var2 != null) {
                        fb0 fb0Var = ib0Var2.d;
                        y61.bShadow i3 = sy.d0.i();
                        i3.add(new gb0(z0Var.g, z0Var.a, z0Var));
                        Collection collection = fb0Var.a;
                        if (collection == null) {
                            collection = x61.r.r;
                        }
                        i3.addAll(collection);
                        ib0Var = ib0.a(ib0Var2, new fb0(sy.d0.h(i3)));
                    } else {
                        ib0Var = null;
                    }
                    aa.r0 eb0Var2 = new eb0(ib0Var);
                    d4Var.u = null;
                    d4Var.v = null;
                    d4Var.y = 2;
                }
                return w61.a0.a;
            }
        }
        d4Var = new d4(j4Var, cVar);
        Object obj2 = d4Var.w;
        b71.a aVar2 = b71.a.r;
        i = d4Var.y;
        if (i != 0) {
        }
        eb0Var = (eb0) obj2;
        if (eb0Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r0.j(r11, r10, r1) == r12) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(j4 j4Var, String str, String str2, c71.c cVar) {
        h4 h4Var;
        int i;
        aa.s0 s0Var;
        eb0 eb0Var;
        ib0 ib0Var;
        ArrayList arrayList;
        com.github.service.wrapper.bShadow bVar = j4Var.t;
        if (cVar instanceof h4) {
            h4Var = (h4) cVar;
            int i2 = h4Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h4Var.y = i2 - Integer.MIN_VALUE;
                Object obj = h4Var.w;
                b71.a aVar = b71.a.r;
                i = h4Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.s0 jb0Var = new jb0(new aa.u0(new Integer(100)), str2);
                    h4Var.u = str;
                    h4Var.v = jb0Var;
                    h4Var.y = 1;
                    Object f = bVar.f(jb0Var);
                    if (f != aVar) {
                        s0Var = jb0Var;
                        obj = f;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                aa.s0 s0Var2 = h4Var.v;
                String str3 = h4Var.u;
                sy.y.j(obj);
                s0Var = s0Var2;
                str = str3;
                eb0Var = (eb0) obj;
                if (eb0Var != null) {
                    ib0 ib0Var2 = eb0Var.a;
                    if (ib0Var2 != null) {
                        List list = ib0Var2.d.a;
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                gb0 gb0Var = (gb0) obj2;
                                if (!k71.k.b(gb0Var != null ? gb0Var.c.a : null, str)) {
                                    arrayList.add(obj2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        ib0Var = ib0.a(ib0Var2, new fb0(arrayList));
                    } else {
                        ib0Var = null;
                    }
                    aa.r0 eb0Var2 = new eb0(ib0Var);
                    h4Var.u = null;
                    h4Var.v = null;
                    h4Var.y = 2;
                }
                return w61.a0.a;
            }
        }
        h4Var = new h4(j4Var, cVar);
        Object obj3 = h4Var.w;
        b71.a aVar2 = b71.a.r;
        i = h4Var.y;
        if (i != 0) {
        }
        eb0Var = (eb0) obj3;
        if (eb0Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if (r0.j(r12, r5, r1) == r13) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(j4 j4Var, String str, String str2, c71.c cVar) {
        t00.x3Shadow x3Var;
        int i;
        aa.s0 s0Var;
        sh0 sh0Var;
        wh0 wh0Var;
        ArrayList arrayList;
        com.github.service.wrapper.bShadow bVar = j4Var.t;
        if (cVar instanceof t00.x3Shadow) {
            x3Var = (t00.x3Shadow) cVar;
            int i2 = x3Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x3Var.y = i2 - Integer.MIN_VALUE;
                Object obj = x3Var.w;
                b71.a aVar = b71.a.r;
                i = x3Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.s0 xh0Var = new xh0(new aa.u0(new Integer(100)), str2);
                    x3Var.u = str;
                    x3Var.v = xh0Var;
                    x3Var.y = 1;
                    Object f = bVar.f(xh0Var);
                    if (f != aVar) {
                        s0Var = xh0Var;
                        obj = f;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                aa.s0 s0Var2 = x3Var.v;
                String str3 = x3Var.u;
                sy.y.j(obj);
                s0Var = s0Var2;
                str = str3;
                sh0Var = (sh0) obj;
                if (sh0Var != null) {
                    wh0 wh0Var2 = sh0Var.a;
                    if (wh0Var2 != null) {
                        List list = wh0Var2.d.a;
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                uh0 uh0Var = (uh0) obj2;
                                if (!k71.k.b(uh0Var != null ? uh0Var.c.a : null, str)) {
                                    arrayList.add(obj2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        wh0Var = wh0.a(wh0Var2, new th0(arrayList));
                    } else {
                        wh0Var = null;
                    }
                    sh0 sh0Var2 = new sh0(wh0Var, sh0Var.b, sh0Var.c);
                    x3Var.u = null;
                    x3Var.v = null;
                    x3Var.y = 2;
                }
                return w61.a0.a;
            }
        }
        x3Var = new t00.x3Shadow(j4Var, cVar);
        Object obj3 = x3Var.w;
        b71.a aVar2 = b71.a.r;
        i = x3Var.y;
        if (i != 0) {
        }
        sh0Var = (sh0) obj3;
        if (sh0Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r0.j(r11, r10, r1) == r12) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(j4 j4Var, String str, String str2, c71.c cVar) {
        vb0.c3 c3Var;
        int i;
        aa.s0 s0Var;
        e90 e90Var;
        i90 i90Var;
        ArrayList arrayList;
        com.github.service.wrapper.bShadow bVar = j4Var.t;
        if (cVar instanceof vb0.c3) {
            c3Var = (vb0.c3) cVar;
            int i2 = c3Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3Var.y = i2 - Integer.MIN_VALUE;
                Object obj = c3Var.w;
                b71.a aVar = b71.a.r;
                i = c3Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.s0 j90Var = new j90(new aa.u0(new Integer(100)), str2);
                    c3Var.u = str;
                    c3Var.v = j90Var;
                    c3Var.y = 1;
                    Object f = bVar.f(j90Var);
                    if (f != aVar) {
                        s0Var = j90Var;
                        obj = f;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                aa.s0 s0Var2 = c3Var.v;
                String str3 = c3Var.u;
                sy.y.j(obj);
                s0Var = s0Var2;
                str = str3;
                e90Var = (e90) obj;
                if (e90Var != null) {
                    i90 i90Var2 = e90Var.a;
                    if (i90Var2 != null) {
                        List list = i90Var2.d.a;
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                g90 g90Var = (g90) obj2;
                                if (!k71.k.b(g90Var != null ? g90Var.c.a : null, str)) {
                                    arrayList.add(obj2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        i90Var = i90.a(i90Var2, new f90(arrayList));
                    } else {
                        i90Var = null;
                    }
                    aa.r0 e90Var2 = new e90(i90Var);
                    c3Var.u = null;
                    c3Var.v = null;
                    c3Var.y = 2;
                }
                return w61.a0.a;
            }
        }
        c3Var = new vb0.c3(j4Var, cVar);
        Object obj3 = c3Var.w;
        b71.a aVar2 = b71.a.r;
        i = c3Var.y;
        if (i != 0) {
        }
        e90Var = (e90) obj3;
        if (e90Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if (r0.j(r12, r5, r1) == r13) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(j4 j4Var, String str, String str2, c71.c cVar) {
        wy0.h3 h3Var;
        int i;
        aa.s0 s0Var;
        ef0 ef0Var;
        if0 if0Var;
        ArrayList arrayList;
        com.github.service.wrapper.bShadow bVar = j4Var.t;
        if (cVar instanceof wy0.h3) {
            h3Var = (wy0.h3) cVar;
            int i2 = h3Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h3Var.y = i2 - Integer.MIN_VALUE;
                Object obj = h3Var.w;
                b71.a aVar = b71.a.r;
                i = h3Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.s0 jf0Var = new jf0(new aa.u0(new Integer(100)), str2);
                    h3Var.u = str;
                    h3Var.v = jf0Var;
                    h3Var.y = 1;
                    Object f = bVar.f(jf0Var);
                    if (f != aVar) {
                        s0Var = jf0Var;
                        obj = f;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                aa.s0 s0Var2 = h3Var.v;
                String str3 = h3Var.u;
                sy.y.j(obj);
                s0Var = s0Var2;
                str = str3;
                ef0Var = (ef0) obj;
                if (ef0Var != null) {
                    if0 if0Var2 = ef0Var.a;
                    if (if0Var2 != null) {
                        List list = if0Var2.d.a;
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                gf0 gf0Var = (gf0) obj2;
                                if (!k71.k.b(gf0Var != null ? gf0Var.c.a : null, str)) {
                                    arrayList.add(obj2);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if0Var = if0.a(if0Var2, new ff0(arrayList));
                    } else {
                        if0Var = null;
                    }
                    aa.r0 ef0Var2 = new ef0(if0Var, ef0Var.b, ef0Var.c);
                    h3Var.u = null;
                    h3Var.v = null;
                    h3Var.y = 2;
                }
                return w61.a0.a;
            }
        }
        h3Var = new wy0.h3(j4Var, cVar);
        Object obj3 = h3Var.w;
        b71.a aVar2 = b71.a.r;
        i = h3Var.y;
        if (i != 0) {
        }
        ef0Var = (ef0) obj3;
        if (ef0Var != null) {
        }
        return w61.a0.a;
    }

    @Override // z01.j0
    public final y71.i a(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new ud(str, str2), null, false, null, null, 62), 10), 20), this.u);
            case 1:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new t00.w3(new y00.l(com.github.service.wrapper.a.o(this.s, new jg(str, str2), null, false, null, null, 62), 10), 0), this.u);
            case 2:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new bd(str, str2), null, false, null, null, 62), 10), 19), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new mf(str, str2), null, false, null, null, 62), 10), 26), this.u);
        }
    }

    @Override // z01.j0
    public final y71.i b(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "listId");
                k71.k.g(str2, "title");
                k71.k.g(str3, "description");
                return y71.n1.y(new o3(in.r.h(this.s.d(new il0.z(new j00(new aa.u0(str3), new aa.u0(str2), str)))), 3), this.u);
            case 1:
                k71.k.g(str, "listId");
                k71.k.g(str2, "title");
                k71.k.g(str3, "description");
                return y71.n1.y(new t00.g3(in.r.h(this.s.d(new ly.z(new m10.if0(new aa.u0(str3), new aa.u0(str2), str)))), 1), this.u);
            case 2:
                k71.k.g(str, "listId");
                k71.k.g(str2, "title");
                k71.k.g(str3, "description");
                return y71.n1.y(new vb0.p1(in.r.h(this.s.d(new ra0.z(new bz(new aa.u0(str3), new aa.u0(str2), str)))), 7), this.u);
            default:
                k71.k.g(str, "listId");
                k71.k.g(str2, "title");
                k71.k.g(str3, "description");
                return y71.n1.y(new wy0.h1(in.r.h(this.s.d(new uw0.z(new n80(new aa.u0(str3), new aa.u0(str2), str)))), 6), this.u);
        }
    }

    @Override // z01.j0
    public final y71.i c(String str, List list, List list2) {
        switch (this.r) {
            case 0:
                return y71.n1.y(in.r.l(in.r.k(this.t.d(new il0.h0(new m00(str, list, new aa.u0(list2)))))), this.u);
            case 1:
                return y71.n1.y(in.r.l(in.r.k(this.t.d(new ly.h0(new lf0(str, list, new aa.u0(list2)))))), this.u);
            case 2:
                return y71.n1.y(in.r.l(in.r.k(this.t.d(new ra0.h0(new ez(str, list, new aa.u0(list2)))))), this.u);
            default:
                return y71.n1.y(in.r.l(in.r.k(this.t.d(new uw0.h0(new q80(str, list, new aa.u0(list2)))))), this.u);
        }
    }

    @Override // z01.j0
    public final y71.i d(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str2, "login");
                return y71.n1.y(in.r.l(new y71.y(in.r.h(this.s.d(new il0.i(str))), new h1.u(this, str, str2, (a71.c) null, 26), 6)), this.u);
            case 1:
                k71.k.g(str2, "login");
                return y71.n1.y(in.r.l(new y71.y(in.r.h(this.s.d(new ly.i(str))), new t00.z1(this, str, str2, (a71.c) null, 2), 6)), this.u);
            case 2:
                k71.k.g(str2, "login");
                return y71.n1.y(in.r.l(new y71.y(in.r.h(this.s.d(new ra0.i(str))), new t00.z1(this, str, str2, (a71.c) null, 14), 6)), this.u);
            default:
                k71.k.g(str2, "login");
                return y71.n1.y(in.r.l(new y71.y(in.r.h(this.s.d(new uw0.i(str))), new t00.z1(this, str, str2, (a71.c) null, 20), 6)), this.u);
        }
    }

    @Override // z01.j0
    public final y71.i e(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "title");
                k71.k.g(str2, "description");
                return y71.n1.y(in.r.l(new y71.y(in.r.h(this.s.d(new il0.e(new gn0.d6(new aa.u0(str2), str)))), new h1.u(this, str3, (a71.c) null, 25), 6)), this.u);
            case 1:
                k71.k.g(str, "title");
                k71.k.g(str2, "description");
                return y71.n1.y(in.r.l(new y71.y(in.r.h(this.s.d(new ly.e(new m10.y9(new aa.u0(str2), str)))), new t00.z1(this, str3, (a71.c) null, 1), 6)), this.u);
            case 2:
                k71.k.g(str, "title");
                k71.k.g(str2, "description");
                return y71.n1.y(in.r.l(new y71.y(in.r.h(this.s.d(new ra0.e(new hc0.t5(new aa.u0(str2), str)))), new t00.z1(this, str3, (a71.c) null, 13), 6)), this.u);
            default:
                k71.k.g(str, "title");
                k71.k.g(str2, "description");
                return y71.n1.y(in.r.l(new y71.y(in.r.h(this.s.d(new uw0.e(new pz0.u6(new aa.u0(str2), str)))), new t00.z1(this, str3, (a71.c) null, 19), 6)), this.u);
        }
    }

    @Override // z01.j0
    public final y71.i f(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "login");
                k71.k.g(str2, "slug");
                return y71.n1.y(new y(new y00.l(com.github.service.wrapper.a.o(this.s, new il0.u(new aa.u0(str3), str, str2), null, false, null, null, 62), 10), 19), this.u);
            case 1:
                k71.k.g(str, "login");
                k71.k.g(str2, "slug");
                return y71.n1.y(new v9(new y00.l(com.github.service.wrapper.a.o(this.s, new ly.u(new aa.u0(str3), str, str2), null, false, null, null, 62), 10), 29), this.u);
            case 2:
                k71.k.g(str, "login");
                k71.k.g(str2, "slug");
                return y71.n1.y(new vb0.u(new y00.l(com.github.service.wrapper.a.o(this.s, new ra0.u(new aa.u0(str3), str, str2), null, false, null, null, 62), 10), 18), this.u);
            default:
                k71.k.g(str, "login");
                k71.k.g(str2, "slug");
                return y71.n1.y(new vb0.s7(new y00.l(com.github.service.wrapper.a.o(this.s, new uw0.u(new aa.u0(str3), str, str2), null, false, null, null, 62), 10), 25), this.u);
        }
    }

    @Override // z01.j0
    public final y71.i g(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str2, "slug");
                return y71.n1.y(new j3(com.github.service.wrapper.a.o(this.s, new il0.m(str, str2), null, false, null, null, 62), 6), this.u);
            case 1:
                k71.k.g(str2, "slug");
                return y71.n1.y(new sm.b(com.github.service.wrapper.a.o(this.s, new ly.m(str, str2), null, false, null, null, 62), 19), this.u);
            case 2:
                k71.k.g(str2, "slug");
                return y71.n1.y(new vb0.e2(com.github.service.wrapper.a.o(this.s, new ra0.m(str, str2), null, false, null, null, 62), 4), this.u);
            default:
                k71.k.g(str2, "slug");
                return y71.n1.y(new vm0.h(com.github.service.wrapper.a.o(this.s, new uw0.m(str, str2), null, false, null, null, 62), 24), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
