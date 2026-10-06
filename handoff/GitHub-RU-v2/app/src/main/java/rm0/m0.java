package rm0;

import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.type.DiffSide;
import com.github.service.models.response.type.ReportedContentClassifier;
import gn0.cq;
import gn0.dn;
import gn0.sh;
import hc0.bm;
import hc0.sg;
import hc0.yo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.a20;
import jn0.a90;
import jn0.an;
import jn0.bn;
import jn0.cn;
import jn0.e70;
import jn0.ka0;
import jn0.nd0;
import jn0.sd0;
import jn0.yf0;
import jn0.zm;
import jo.a40;
import jo.bg0;
import jo.gg0;
import jo.lo;
import jo.mi0;
import jo.mo;
import jo.no;
import jo.ob0;
import jo.oo;
import jo.po;
import jo.r90;
import jo.yc0;
import kc0.d50;
import kc0.i60;
import kc0.il;
import kc0.jl;
import kc0.kl;
import kc0.l30;
import kc0.ll;
import kc0.ml;
import kc0.n90;
import kc0.s90;
import kc0.uy;
import kc0.yb0;
import kotlin.NoWhenBranchMatchedException;
import m10.g30;
import m10.pp;
import m10.xz;
import m10.zc;
import pz0.cu;
import pz0.hx;
import pz0.ok;
import u10.ek;
import u10.f30;
import u10.fk;
import u10.gk;
import u10.hk;
import u10.ik;
import u10.k40;
import u10.n10;
import u10.n70;
import u10.s70;
import u10.vw;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 implements z01.f, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.bShadow t;
    public v71.v u;

    public m0(com.github.service.wrapper.j jVar, com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(m0 m0Var, String str, c71.c cVar) {
        z zVar;
        Object obj;
        int i;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i2 = zVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.x = i2 - Integer.MIN_VALUE;
                obj = zVar.v;
                Object obj2 = b71.a.r;
                i = zVar.x;
                if (i != 0) {
                    sy.y.j(obj);
                    j71.c cVar2 = new q00.c(28);
                    zVar.u = str;
                    zVar.x = 1;
                    obj = m0Var.C(str, cVar2, zVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    str = zVar.u;
                    sy.y.j(obj);
                }
                if (((w61.a0) obj) == null) {
                    return w61.a0.a;
                }
                j71.c cVar3 = new q00.c(29);
                zVar.u = null;
                zVar.x = 2;
                Object y = m0Var.y(str, cVar3, zVar);
                return y == obj2 ? obj2 : y;
            }
        }
        zVar = new z(m0Var, cVar);
        obj = zVar.v;
        Object obj22 = b71.a.r;
        i = zVar.x;
        if (i != 0) {
        }
        if (((w61.a0) obj) == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(m0 m0Var, String str, c71.c cVar) {
        t00.b0 b0Var;
        Object obj;
        int i;
        if (cVar instanceof t00.b0) {
            b0Var = (t00.b0) cVar;
            int i2 = b0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.x = i2 - Integer.MIN_VALUE;
                obj = b0Var.v;
                b71.a aVar = b71.a.r;
                i = b0Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    sw0.e eVar = new sw0.e(3);
                    b0Var.u = str;
                    b0Var.x = 1;
                    obj = m0Var.E(str, eVar, b0Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    str = b0Var.u;
                    sy.y.j(obj);
                }
                if (((w61.a0) obj) == null) {
                    return w61.a0.a;
                }
                sw0.e eVar2 = new sw0.e(4);
                b0Var.u = null;
                b0Var.x = 2;
                Object A = m0Var.A(str, eVar2, b0Var);
                return A == aVar ? aVar : A;
            }
        }
        b0Var = new t00.b0(m0Var, cVar);
        obj = b0Var.v;
        b71.a aVar2 = b71.a.r;
        i = b0Var.x;
        if (i != 0) {
        }
        if (((w61.a0) obj) == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(m0 m0Var, String str, c71.c cVar) {
        vb0.r rVar;
        Object obj;
        int i;
        if (cVar instanceof vb0.r) {
            rVar = (vb0.r) cVar;
            int i2 = rVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.x = i2 - Integer.MIN_VALUE;
                obj = rVar.v;
                Object obj2 = b71.a.r;
                i = rVar.x;
                if (i != 0) {
                    sy.y.j(obj);
                    j71.c nVar = new v00.n(9);
                    rVar.u = str;
                    rVar.x = 1;
                    obj = m0Var.B(str, nVar, rVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    str = rVar.u;
                    sy.y.j(obj);
                }
                if (((w61.a0) obj) == null) {
                    return w61.a0.a;
                }
                j71.c nVar2 = new v00.n(10);
                rVar.u = null;
                rVar.x = 2;
                Object x = m0Var.x(str, nVar2, rVar);
                return x == obj2 ? obj2 : x;
            }
        }
        rVar = new vb0.r(m0Var, cVar);
        obj = rVar.v;
        Object obj22 = b71.a.r;
        i = rVar.x;
        if (i != 0) {
        }
        if (((w61.a0) obj) == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(m0 m0Var, String str, c71.c cVar) {
        wy0.u uVar;
        Object obj;
        int i;
        if (cVar instanceof wy0.u) {
            uVar = (wy0.u) cVar;
            int i2 = uVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.x = i2 - Integer.MIN_VALUE;
                obj = uVar.v;
                Object obj2 = b71.a.r;
                i = uVar.x;
                if (i != 0) {
                    sy.y.j(obj);
                    j71.c gVar = new wa.g(17);
                    uVar.u = str;
                    uVar.x = 1;
                    obj = m0Var.D(str, gVar, uVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    str = uVar.u;
                    sy.y.j(obj);
                }
                if (((w61.a0) obj) == null) {
                    return w61.a0.a;
                }
                j71.c gVar2 = new wa.g(18);
                uVar.u = null;
                uVar.x = 2;
                Object z = m0Var.z(str, gVar2, uVar);
                return z == obj2 ? obj2 : z;
            }
        }
        uVar = new wy0.u(m0Var, cVar);
        obj = uVar.v;
        Object obj22 = b71.a.r;
        i = uVar.x;
        if (i != 0) {
        }
        if (((w61.a0) obj) == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(m0 m0Var, String str, c71.c cVar) {
        c0 c0Var;
        Object obj;
        int i;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i2 = c0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0Var.x = i2 - Integer.MIN_VALUE;
                obj = c0Var.v;
                Object obj2 = b71.a.r;
                i = c0Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    j71.c sVar = new s(0);
                    c0Var.u = str;
                    c0Var.x = 1;
                    obj = m0Var.C(str, sVar, c0Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    str = c0Var.u;
                    sy.y.j(obj);
                }
                if (((w61.a0) obj) == null) {
                    return w61.a0.a;
                }
                j71.c sVar2 = new s(1);
                c0Var.u = null;
                c0Var.x = 2;
                Object y = m0Var.y(str, sVar2, c0Var);
                return y == obj2 ? obj2 : y;
            }
        }
        c0Var = new c0(m0Var, cVar);
        obj = c0Var.v;
        Object obj22 = b71.a.r;
        i = c0Var.x;
        if (i != 0) {
        }
        if (((w61.a0) obj) == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(m0 m0Var, String str, c71.c cVar) {
        t00.e0 e0Var;
        Object obj;
        int i;
        if (cVar instanceof t00.e0) {
            e0Var = (t00.e0) cVar;
            int i2 = e0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e0Var.x = i2 - Integer.MIN_VALUE;
                obj = e0Var.v;
                b71.a aVar = b71.a.r;
                i = e0Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    sw0.e eVar = new sw0.e(5);
                    e0Var.u = str;
                    e0Var.x = 1;
                    obj = m0Var.E(str, eVar, e0Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    str = e0Var.u;
                    sy.y.j(obj);
                }
                if (((w61.a0) obj) == null) {
                    return w61.a0.a;
                }
                sw0.e eVar2 = new sw0.e(6);
                e0Var.u = null;
                e0Var.x = 2;
                Object A = m0Var.A(str, eVar2, e0Var);
                return A == aVar ? aVar : A;
            }
        }
        e0Var = new t00.e0(m0Var, cVar);
        obj = e0Var.v;
        b71.a aVar2 = b71.a.r;
        i = e0Var.x;
        if (i != 0) {
        }
        if (((w61.a0) obj) == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(m0 m0Var, String str, c71.c cVar) {
        vb0.v vVar;
        Object obj;
        int i;
        if (cVar instanceof vb0.v) {
            vVar = (vb0.v) cVar;
            int i2 = vVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.x = i2 - Integer.MIN_VALUE;
                obj = vVar.v;
                Object obj2 = b71.a.r;
                i = vVar.x;
                if (i != 0) {
                    sy.y.j(obj);
                    j71.c nVar = new v00.n(11);
                    vVar.u = str;
                    vVar.x = 1;
                    obj = m0Var.B(str, nVar, vVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    str = vVar.u;
                    sy.y.j(obj);
                }
                if (((w61.a0) obj) == null) {
                    return w61.a0.a;
                }
                j71.c nVar2 = new v00.n(12);
                vVar.u = null;
                vVar.x = 2;
                Object x = m0Var.x(str, nVar2, vVar);
                return x == obj2 ? obj2 : x;
            }
        }
        vVar = new vb0.v(m0Var, cVar);
        obj = vVar.v;
        Object obj22 = b71.a.r;
        i = vVar.x;
        if (i != 0) {
        }
        if (((w61.a0) obj) == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w(m0 m0Var, String str, c71.c cVar) {
        wy0.y yVar;
        Object obj;
        int i;
        if (cVar instanceof wy0.y) {
            yVar = (wy0.y) cVar;
            int i2 = yVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.x = i2 - Integer.MIN_VALUE;
                obj = yVar.v;
                Object obj2 = b71.a.r;
                i = yVar.x;
                if (i != 0) {
                    sy.y.j(obj);
                    j71.c gVar = new wa.g(15);
                    yVar.u = str;
                    yVar.x = 1;
                    obj = m0Var.D(str, gVar, yVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    str = yVar.u;
                    sy.y.j(obj);
                }
                if (((w61.a0) obj) == null) {
                    return w61.a0.a;
                }
                j71.c gVar2 = new wa.g(16);
                yVar.u = null;
                yVar.x = 2;
                Object z = m0Var.z(str, gVar2, yVar);
                return z == obj2 ? obj2 : z;
            }
        }
        yVar = new wy0.y(m0Var, cVar);
        obj = yVar.v;
        Object obj22 = b71.a.r;
        i = yVar.x;
        if (i != 0) {
        }
        if (((w61.a0) obj) == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r3.p(r9, r6, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A(String str, j71.c cVar, c71.c cVar2) {
        t00.g0 g0Var;
        int i;
        ct.h hVar;
        if (cVar2 instanceof t00.g0) {
            g0Var = (t00.g0) cVar2;
            int i2 = g0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = g0Var.w;
                b71.a aVar = b71.a.r;
                i = g0Var.y;
                com.github.service.wrapper.bShadow bVar = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    ct.j jVar = new ct.j();
                    g0Var.u = str;
                    g0Var.v = cVar;
                    g0Var.y = 1;
                    obj = bVar.c(jVar, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = g0Var.v;
                    str = g0Var.u;
                    sy.y.j(obj);
                }
                hVar = (ct.h) obj;
                if (hVar != null) {
                    return null;
                }
                ct.h hVar2 = new ct.h(hVar.a, new ct.g(((Number) cVar.k(new Integer(hVar.b.a))).intValue()), hVar.c);
                ct.j jVar2 = new ct.j();
                g0Var.u = null;
                g0Var.v = null;
                g0Var.y = 2;
            }
        }
        g0Var = new t00.g0(this, cVar2);
        Object obj2 = g0Var.w;
        b71.a aVar2 = b71.a.r;
        i = g0Var.y;
        com.github.service.wrapper.bShadow bVar2 = this.t;
        if (i != 0) {
        }
        hVar = (ct.h) obj2;
        if (hVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r3.p(r9, r6, r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(String str, j71.c cVar, c71.c cVar2) {
        vb0.y yVar;
        int i;
        z70.x1 x1Var;
        if (cVar2 instanceof vb0.y) {
            yVar = (vb0.y) cVar2;
            int i2 = yVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.y = i2 - Integer.MIN_VALUE;
                Object obj = yVar.w;
                b71.a aVar = b71.a.r;
                i = yVar.y;
                com.github.service.wrapper.bShadow bVar = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    z70.y1 y1Var = new z70.y1(0);
                    yVar.u = str;
                    yVar.v = cVar;
                    yVar.y = 1;
                    obj = bVar.c(y1Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = yVar.v;
                    str = yVar.u;
                    sy.y.j(obj);
                }
                x1Var = (z70.x1) obj;
                if (x1Var != null) {
                    return null;
                }
                Integer num = x1Var.b;
                z70.x1 x1Var2 = new z70.x1((Integer) cVar.k(new Integer(num != null ? num.intValue() : 0)), x1Var.a, x1Var.c);
                z70.y1 y1Var2 = new z70.y1(0);
                yVar.u = null;
                yVar.v = null;
                yVar.y = 2;
            }
        }
        yVar = new vb0.y(this, cVar2);
        Object obj2 = yVar.w;
        b71.a aVar2 = b71.a.r;
        i = yVar.y;
        com.github.service.wrapper.bShadow bVar2 = this.t;
        if (i != 0) {
        }
        x1Var = (z70.x1) obj2;
        if (x1Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r3.p(r9, r6, r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(String str, j71.c cVar, c71.c cVar2) {
        f0 f0Var;
        int i;
        ri0.y1 y1Var;
        if (cVar2 instanceof f0) {
            f0Var = (f0) cVar2;
            int i2 = f0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = f0Var.w;
                b71.a aVar = b71.a.r;
                i = f0Var.y;
                com.github.service.wrapper.bShadow bVar = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    ri0.a2 a2Var = new ri0.a2();
                    f0Var.u = str;
                    f0Var.v = cVar;
                    f0Var.y = 1;
                    obj = bVar.c(a2Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = f0Var.v;
                    str = f0Var.u;
                    sy.y.j(obj);
                }
                y1Var = (ri0.y1) obj;
                if (y1Var != null) {
                    return null;
                }
                Integer num = y1Var.b;
                ri0.y1 y1Var2 = new ri0.y1((Integer) cVar.k(new Integer(num != null ? num.intValue() : 0)), y1Var.a, y1Var.c);
                ri0.a2 a2Var2 = new ri0.a2();
                f0Var.u = null;
                f0Var.v = null;
                f0Var.y = 2;
            }
        }
        f0Var = new f0(this, cVar2);
        Object obj2 = f0Var.w;
        b71.a aVar2 = b71.a.r;
        i = f0Var.y;
        com.github.service.wrapper.bShadow bVar2 = this.t;
        if (i != 0) {
        }
        y1Var = (ri0.y1) obj2;
        if (y1Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r3.p(r9, r6, r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(String str, j71.c cVar, c71.c cVar2) {
        wy0.b0 b0Var;
        int i;
        xt0.y1 y1Var;
        if (cVar2 instanceof wy0.b0) {
            b0Var = (wy0.b0) cVar2;
            int i2 = b0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = b0Var.w;
                b71.a aVar = b71.a.r;
                i = b0Var.y;
                com.github.service.wrapper.bShadow bVar = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    xt0.a2 a2Var = new xt0.a2();
                    b0Var.u = str;
                    b0Var.v = cVar;
                    b0Var.y = 1;
                    obj = bVar.c(a2Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = b0Var.v;
                    str = b0Var.u;
                    sy.y.j(obj);
                }
                y1Var = (xt0.y1) obj;
                if (y1Var != null) {
                    return null;
                }
                Integer num = y1Var.b;
                xt0.y1 y1Var2 = new xt0.y1((Integer) cVar.k(new Integer(num != null ? num.intValue() : 0)), y1Var.a, y1Var.c);
                xt0.a2 a2Var2 = new xt0.a2();
                b0Var.u = null;
                b0Var.v = null;
                b0Var.y = 2;
            }
        }
        b0Var = new wy0.b0(this, cVar2);
        Object obj2 = b0Var.w;
        b71.a aVar2 = b71.a.r;
        i = b0Var.y;
        com.github.service.wrapper.bShadow bVar2 = this.t;
        if (i != 0) {
        }
        y1Var = (xt0.y1) obj2;
        if (y1Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r3.p(r9, r6, r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(String str, j71.c cVar, c71.c cVar2) {
        t00.h0Shadow h0Var;
        int i;
        gv.i2 i2Var;
        if (cVar2 instanceof t00.h0) {
            h0Var = (t00.h0) cVar2;
            int i2 = h0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = h0Var.w;
                b71.a aVar = b71.a.r;
                i = h0Var.y;
                com.github.service.wrapper.bShadow bVar = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    gv.k2 k2Var = new gv.k2();
                    h0Var.u = str;
                    h0Var.v = cVar;
                    h0Var.y = 1;
                    obj = bVar.c(k2Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = h0Var.v;
                    str = h0Var.u;
                    sy.y.j(obj);
                }
                i2Var = (gv.i2) obj;
                if (i2Var != null) {
                    return null;
                }
                Integer num = i2Var.b;
                gv.i2 i2Var2 = new gv.i2((Integer) cVar.k(new Integer(num != null ? num.intValue() : 0)), i2Var.a, i2Var.c);
                gv.k2 k2Var2 = new gv.k2();
                h0Var.u = null;
                h0Var.v = null;
                h0Var.y = 2;
            }
        }
        h0Var = new t00.h0(this, cVar2);
        Object obj2 = h0Var.w;
        b71.a aVar2 = b71.a.r;
        i = h0Var.y;
        com.github.service.wrapper.bShadow bVar2 = this.t;
        if (i != 0) {
        }
        i2Var = (gv.i2) obj2;
        if (i2Var != null) {
        }
    }

    @Override // z01.f
    public final y71.i a(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "threadId");
                return y71.n1Shadow.y(new y(new y00.l(in.rShadow.h(this.t.d(new uy(str))), 10), 2), this.u);
            case 1:
                k71.k.g(str, "threadId");
                return y71.n1Shadow.y(new v9(new y00.l(in.rShadow.h(this.t.d(new a40(str))), 10), 10), this.u);
            case 2:
                k71.k.g(str, "threadId");
                return y71.n1Shadow.y(new vb0.u(new y00.l(in.rShadow.h(this.t.d(new vw(str))), 10), 1), this.u);
            default:
                k71.k.g(str, "threadId");
                return y71.n1Shadow.y(new vb0.s7(new y00.l(in.rShadow.h(this.t.d(new a20(str))), 10), 7), this.u);
        }
    }

    @Override // z01.f
    public final y71.i b(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new n90(str, str2)))), this.u);
            case 1:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new bg0(str, str2)))), this.u);
            case 2:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new n70(str, str2)))), this.u);
            default:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new nd0(str, str2)))), this.u);
        }
    }

    @Override // z01.f
    public final y71.i c(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "parentId");
                k71.k.g(str2, "commentId");
                return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new kc0.g8(str2))), 10), new u(this, str, null, 1), 6), 9), this.u);
            case 1:
                k71.k.g(str, "parentId");
                k71.k.g(str2, "commentId");
                return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new jo.x9(str2))), 10), new t00.v(this, str, (a71.c) null, 1), 6), 19), this.u);
            case 2:
                k71.k.g(str, "parentId");
                k71.k.g(str2, "commentId");
                return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new u10.y7(str2))), 10), new vb0.n(this, str, null, 1), 6), 2), this.u);
            default:
                k71.k.g(str, "parentId");
                k71.k.g(str2, "commentId");
                return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new jn0.a9(str2))), 10), new wy0.q(this, str, null, 1), 6), 11), this.u);
        }
    }

    @Override // z01.f
    public final y71.i d(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new y(new y00.l(in.rShadow.h(this.t.d(new s90(str, str2))), 10), 5), this.u);
            case 1:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new v9(new y00.l(in.rShadow.h(this.t.d(new gg0(str, str2))), 10), 13), this.u);
            case 2:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new vb0.u(new y00.l(in.rShadow.h(this.t.d(new s70(str, str2))), 10), 4), this.u);
            default:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new vb0.s7(new y00.l(in.rShadow.h(this.t.d(new sd0(str, str2))), 10), 10), this.u);
        }
    }

    @Override // z01.f
    public final y71.i e(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "subjectId");
                return y71.n1Shadow.y(new bz0.t(in.rShadow.h(this.t.e(new d50(str), new qh0.c(), str, new f1.p3(str, 22))), 23), this.u);
            case 1:
                k71.k.g(str, "subjectId");
                return y71.n1Shadow.y(new o3(in.rShadow.h(this.t.e(new ob0(str), new ju.c(), str, new f1.p3(str, 28))), 21), this.u);
            case 2:
                k71.k.g(str, "subjectId");
                return y71.n1Shadow.y(new t00.g3(in.rShadow.h(this.t.e(new f30(str), new y60.b(0), str, new tj.b(str, 5))), 25), this.u);
            default:
                k71.k.g(str, "subjectId");
                return y71.n1Shadow.y(new vb0.p1(in.rShadow.h(this.t.e(new a90(str), new at0.c(), str, new tj.b(str, 13))), 26), this.u);
        }
    }

    @Override // z01.f
    public final y71.i f(int i, CommentLevelType commentLevelType, DiffSide diffSide, DiffSide diffSide2, Integer num, String str, String str2, String str3) {
        Object k = null;
        dn dnVar;
        bm bmVar;
        cu cuVar;
        switch (this.r) {
            case 0:
                k71.k.g(commentLevelType, "subjectType");
                aa.u0 u0Var = new aa.u0(sy.y.k(diffSide));
                aa1.bShadow bVar = aa.t0.d;
                aa1.bShadow u0Var2 = num == null ? bVar : new aa.u0(num);
                gn0.u8 k = diffSide2 != null ? sy.y.k(diffSide2) : null;
                if (k != null) {
                    bVar = new aa.u0(k);
                }
                aa1.bShadow bVar2 = bVar;
                int i2 = vl0.c.b[commentLevelType.ordinal()];
                if (i2 == 1) {
                    dnVar = dn.u;
                } else if (i2 == 2) {
                    dnVar = dn.t;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dnVar = dn.v;
                }
                return y71.n1Shadow.y(new cn.q(new bz0.t(in.rShadow.h(this.t.d(new kc0.v0(str, str2, i, str3, u0Var, u0Var2, bVar2, dnVar))), 21), 18), this.u);
            case 1:
                k71.k.g(commentLevelType, "subjectType");
                aa.u0 u0Var3 = new aa.u0(com.google.common.util.concurrent.a.P(diffSide));
                aa1.bShadow bVar3 = aa.t0.d;
                aa1.bShadow u0Var4 = num == null ? bVar3 : new aa.u0(num);
                zc P = diffSide2 != null ? com.google.common.util.concurrent.a.P(diffSide2) : null;
                return y71.n1Shadow.y(new cn.q(new o3(in.rShadow.h(this.t.d(new jo.a1(str, str2, i, str3, u0Var3, u0Var4, P == null ? bVar3 : new aa.u0(P), com.google.common.util.concurrent.a.Q(commentLevelType), bVar3, bVar3, bVar3))), 18), 25), this.u);
            case 2:
                k71.k.g(commentLevelType, "subjectType");
                aa.u0 u0Var5 = new aa.u0(com.google.android.gms.internal.measurement.b4.i0(diffSide));
                aa1.bShadow bVar4 = aa.t0.d;
                aa1.bShadow u0Var6 = num == null ? bVar4 : new aa.u0(num);
                hc0.i8 i0 = diffSide2 != null ? com.google.android.gms.internal.measurement.b4.i0(diffSide2) : null;
                if (i0 != null) {
                    bVar4 = new aa.u0(i0);
                }
                aa1.bShadow bVar5 = bVar4;
                int i3 = ab0.c.b[commentLevelType.ordinal()];
                if (i3 == 1) {
                    bmVar = bm.u;
                } else if (i3 == 2) {
                    bmVar = bm.t;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bmVar = bm.v;
                }
                return y71.n1Shadow.y(new t00.f8(4, new t00.g3(in.rShadow.h(this.t.d(new u10.v0(str, str2, i, str3, u0Var5, u0Var6, bVar5, bmVar))), 23)), this.u);
            default:
                k71.k.g(commentLevelType, "subjectType");
                aa.u0 u0Var7 = new aa.u0(m7.y.K(diffSide));
                aa1.bShadow bVar6 = aa.t0.d;
                aa1.bShadow u0Var8 = num == null ? bVar6 : new aa.u0(num);
                pz0.v9 K = diffSide2 != null ? m7.y.K(diffSide2) : null;
                if (K != null) {
                    bVar6 = new aa.u0(K);
                }
                aa1.bShadow bVar7 = bVar6;
                int i4 = jx0.c.b[commentLevelType.ordinal()];
                if (i4 == 1) {
                    cuVar = cu.u;
                } else if (i4 == 2) {
                    cuVar = cu.t;
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cuVar = cu.v;
                }
                return y71.n1Shadow.y(new t00.f8(11, new vb0.p1(in.rShadow.h(this.t.d(new jn0.v0(str, str2, i, str3, u0Var7, u0Var8, bVar7, cuVar))), 24)), this.u);
        }
    }

    @Override // z01.f
    public final y71.i g(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "commentId");
                return y71.n1Shadow.y(new y(new y00.l(in.rShadow.h(this.t.d(new kc0.u8(str))), 10), 1), this.u);
            case 1:
                k71.k.g(str, "commentId");
                return y71.n1Shadow.y(new v9(new y00.l(in.rShadow.h(this.t.d(new jo.la(str))), 10), 9), this.u);
            case 2:
                k71.k.g(str, "commentId");
                return y71.n1Shadow.y(new vb0.u(new y00.l(in.rShadow.h(this.t.d(new u10.m8(str))), 10), 0), this.u);
            default:
                k71.k.g(str, "commentId");
                return y71.n1Shadow.y(new vb0.s7(new y00.l(in.rShadow.h(this.t.d(new jn0.o9(str))), 10), 6), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    @Override // z01.f
    public final y71.i i(final String str, final ReportedContentClassifier reportedContentClassifier) {
        cq cqVar;
        g30 g30Var;
        yo yoVar;
        hx hxVar;
        switch (this.r) {
            case 0:
                k71.k.g(str, "subjectId");
                k71.k.g(reportedContentClassifier, "reportedContentClassifier");
                switch (pl0.j.a[reportedContentClassifier.ordinal()]) {
                    case 1:
                        cqVar = cq.w;
                        break;
                    case 2:
                        cqVar = cq.w;
                        break;
                    case 3:
                        cqVar = cq.t;
                        break;
                    case 4:
                        cqVar = cq.u;
                        break;
                    case 5:
                        cqVar = cq.s;
                        break;
                    case 6:
                        cqVar = cq.v;
                        break;
                    case 7:
                        cqVar = cq.w;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                final int i = 0;
                return y71.n1Shadow.y(new bz0.t(in.rShadow.h(this.t.e(new ml(str, cqVar), new qh0.c(), str, new j71.c() { // from class: rm0.r
                    @Override // j71.c
                    public final Object k(Object obj) {
                        switch (i) {
                            case 0:
                                qh0.a aVar = (qh0.a) obj;
                                k71.k.g(aVar, "fragment");
                                return new il(new jl(new kl(aVar.a, new ll(str), qh0.a.a(aVar, true, reportedContentClassifier.toApiReturnString(), 25))));
                            case 1:
                                ju.a aVar2 = (ju.a) obj;
                                k71.k.g(aVar2, "fragment");
                                return new lo(new mo(new no(aVar2.a, new oo(str), ju.a.a(aVar2, true, reportedContentClassifier.toApiReturnString(), 25))));
                            case 2:
                                y60.a aVar3 = (y60.a) obj;
                                k71.k.g(aVar3, "fragment");
                                return new ek(new fk(new gk(aVar3.a, new hk(str), y60.a.a(aVar3, true, reportedContentClassifier.toApiReturnString(), 25))));
                            default:
                                at0.a aVar4 = (at0.a) obj;
                                k71.k.g(aVar4, "fragment");
                                return new zm(new an(new bn(aVar4.a, new cn(str), at0.a.a(aVar4, true, reportedContentClassifier.toApiReturnString(), 25))));
                        }
                    }
                })), 22), this.u);
            case 1:
                k71.k.g(str, "subjectId");
                k71.k.g(reportedContentClassifier, "reportedContentClassifier");
                switch (sy.k.a[reportedContentClassifier.ordinal()]) {
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
                    case 7:
                        g30Var = g30.y;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                final int i2 = 1;
                return y71.n1Shadow.y(new o3(in.rShadow.h(this.t.e(new po(str, g30Var), new ju.c(), str, new j71.c() { // from class: rm0.r
                    @Override // j71.c
                    public final Object k(Object obj) {
                        switch (i2) {
                            case 0:
                                qh0.a aVar = (qh0.a) obj;
                                k71.k.g(aVar, "fragment");
                                return new il(new jl(new kl(aVar.a, new ll(str), qh0.a.a(aVar, true, reportedContentClassifier.toApiReturnString(), 25))));
                            case 1:
                                ju.a aVar2 = (ju.a) obj;
                                k71.k.g(aVar2, "fragment");
                                return new lo(new mo(new no(aVar2.a, new oo(str), ju.a.a(aVar2, true, reportedContentClassifier.toApiReturnString(), 25))));
                            case 2:
                                y60.a aVar3 = (y60.a) obj;
                                k71.k.g(aVar3, "fragment");
                                return new ek(new fk(new gk(aVar3.a, new hk(str), y60.a.a(aVar3, true, reportedContentClassifier.toApiReturnString(), 25))));
                            default:
                                at0.a aVar4 = (at0.a) obj;
                                k71.k.g(aVar4, "fragment");
                                return new zm(new an(new bn(aVar4.a, new cn(str), at0.a.a(aVar4, true, reportedContentClassifier.toApiReturnString(), 25))));
                        }
                    }
                })), 20), this.u);
            case 2:
                k71.k.g(str, "subjectId");
                k71.k.g(reportedContentClassifier, "reportedContentClassifier");
                switch (va0.j.a[reportedContentClassifier.ordinal()]) {
                    case 1:
                        yoVar = yo.w;
                        break;
                    case 2:
                        yoVar = yo.w;
                        break;
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
                    case 7:
                        yoVar = yo.w;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                final int i3 = 2;
                return y71.n1Shadow.y(new t00.g3(in.rShadow.h(this.t.e(new ik(str, yoVar), new y60.b(0), str, new j71.c() { // from class: rm0.r
                    @Override // j71.c
                    public final Object k(Object obj) {
                        switch (i3) {
                            case 0:
                                qh0.a aVar = (qh0.a) obj;
                                k71.k.g(aVar, "fragment");
                                return new il(new jl(new kl(aVar.a, new ll(str), qh0.a.a(aVar, true, reportedContentClassifier.toApiReturnString(), 25))));
                            case 1:
                                ju.a aVar2 = (ju.a) obj;
                                k71.k.g(aVar2, "fragment");
                                return new lo(new mo(new no(aVar2.a, new oo(str), ju.a.a(aVar2, true, reportedContentClassifier.toApiReturnString(), 25))));
                            case 2:
                                y60.a aVar3 = (y60.a) obj;
                                k71.k.g(aVar3, "fragment");
                                return new ek(new fk(new gk(aVar3.a, new hk(str), y60.a.a(aVar3, true, reportedContentClassifier.toApiReturnString(), 25))));
                            default:
                                at0.a aVar4 = (at0.a) obj;
                                k71.k.g(aVar4, "fragment");
                                return new zm(new an(new bn(aVar4.a, new cn(str), at0.a.a(aVar4, true, reportedContentClassifier.toApiReturnString(), 25))));
                        }
                    }
                })), 24), this.u);
            default:
                k71.k.g(str, "subjectId");
                k71.k.g(reportedContentClassifier, "reportedContentClassifier");
                switch (bx0.k.a[reportedContentClassifier.ordinal()]) {
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
                    case 7:
                        hxVar = hx.w;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                final int i4 = 3;
                return y71.n1Shadow.y(new vb0.p1(in.rShadow.h(this.t.e(new jn0.dn(str, hxVar), new at0.c(), str, new j71.c() { // from class: rm0.r
                    @Override // j71.c
                    public final Object k(Object obj) {
                        switch (i4) {
                            case 0:
                                qh0.a aVar = (qh0.a) obj;
                                k71.k.g(aVar, "fragment");
                                return new il(new jl(new kl(aVar.a, new ll(str), qh0.a.a(aVar, true, reportedContentClassifier.toApiReturnString(), 25))));
                            case 1:
                                ju.a aVar2 = (ju.a) obj;
                                k71.k.g(aVar2, "fragment");
                                return new lo(new mo(new no(aVar2.a, new oo(str), ju.a.a(aVar2, true, reportedContentClassifier.toApiReturnString(), 25))));
                            case 2:
                                y60.a aVar3 = (y60.a) obj;
                                k71.k.g(aVar3, "fragment");
                                return new ek(new fk(new gk(aVar3.a, new hk(str), y60.a.a(aVar3, true, reportedContentClassifier.toApiReturnString(), 25))));
                            default:
                                at0.a aVar4 = (at0.a) obj;
                                k71.k.g(aVar4, "fragment");
                                return new zm(new an(new bn(aVar4.a, new cn(str), at0.a.a(aVar4, true, reportedContentClassifier.toApiReturnString(), 25))));
                        }
                    }
                })), 25), this.u);
        }
    }

    @Override // z01.f
    public final y71.i j(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "threadId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new kc0.q1(str, str2)))), this.u);
            case 1:
                k71.k.g(str, "threadId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new jo.v1(str, str2)))), this.u);
            case 2:
                k71.k.g(str, "threadId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new u10.q1(str, str2)))), this.u);
            default:
                k71.k.g(str, "threadId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(jo.f4Shadow.f(in.rShadow.h(this.t.d(new jn0.q1(str, str2)))), this.u);
        }
    }

    @Override // z01.f
    public final y71.i k(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new y(new y00.l(in.rShadow.h(this.t.d(new i60(str, str2))), 10), 4), this.u);
            case 1:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new v9(new y00.l(in.rShadow.h(this.t.d(new yc0(str, str2))), 10), 12), this.u);
            case 2:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new vb0.u(new y00.l(in.rShadow.h(this.t.d(new k40(str, str2))), 10), 3), this.u);
            default:
                k71.k.g(str, "commentId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new vb0.s7(new y00.l(in.rShadow.h(this.t.d(new ka0(str, str2))), 10), 9), this.u);
        }
    }

    @Override // z01.f
    public final y71.i l(String str, String str2, List list, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "pullRequestId");
                k71.k.g(str2, "currentOid");
                ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    w61.k kVar = (w61.k) it.next();
                    arrayList.add(new sh((String) kVar.r, (String) kVar.s));
                }
                return y71.n1Shadow.y(new y(new y00.l(in.rShadow.h(this.s.d(new kc0.e2(str, str2, arrayList, str3 == null ? aa.t0.d : new aa.u0(str3)))), 10), 0), this.u);
            case 1:
                k71.k.g(str, "pullRequestId");
                k71.k.g(str2, "currentOid");
                ArrayList arrayList2 = new ArrayList(x61.n.F(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    w61.k kVar2 = (w61.k) it2.next();
                    arrayList2.add(new pp((String) kVar2.r, (String) kVar2.s));
                }
                return y71.n1Shadow.y(new v9(new y00.l(in.rShadow.h(this.s.d(new jo.p2(str, str2, arrayList2, str3 == null ? aa.t0.d : new aa.u0(str3)))), 10), 8), this.u);
            case 2:
                k71.k.g(str, "pullRequestId");
                k71.k.g(str2, "currentOid");
                ArrayList arrayList3 = new ArrayList(x61.n.F(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    w61.k kVar3 = (w61.k) it3.next();
                    arrayList3.add(new sg((String) kVar3.r, (String) kVar3.s));
                }
                return y71.n1Shadow.y(new t00.q6(new y00.l(in.rShadow.h(this.s.d(new u10.e2(str, str2, arrayList3, str3 == null ? aa.t0.d : new aa.u0(str3)))), 10), 29), this.u);
            default:
                k71.k.g(str, "pullRequestId");
                k71.k.g(str2, "currentOid");
                ArrayList arrayList4 = new ArrayList(x61.n.F(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    w61.k kVar4 = (w61.k) it4.next();
                    arrayList4.add(new ok((String) kVar4.r, (String) kVar4.s));
                }
                return y71.n1Shadow.y(new vb0.s7(new y00.l(in.rShadow.h(this.s.d(new jn0.k2(str, str2, arrayList4, str3 == null ? aa.t0.d : new aa.u0(str3)))), 10), 5), this.u);
        }
    }

    @Override // z01.f
    public final y71.i m(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "threadId");
                return y71.n1Shadow.y(new y(new y00.l(in.rShadow.h(this.t.d(new l30(str))), 10), 3), this.u);
            case 1:
                k71.k.g(str, "threadId");
                return y71.n1Shadow.y(new v9(new y00.l(in.rShadow.h(this.t.d(new r90(str))), 10), 11), this.u);
            case 2:
                k71.k.g(str, "threadId");
                return y71.n1Shadow.y(new vb0.u(new y00.l(in.rShadow.h(this.t.d(new n10(str))), 10), 2), this.u);
            default:
                k71.k.g(str, "threadId");
                return y71.n1Shadow.y(new vb0.s7(new y00.l(in.rShadow.h(this.t.d(new e70(str))), 10), 8), this.u);
        }
    }

    @Override // z01.f
    public final y71.i n(String str, String str2, String str3, String str4, int i, String str5, Integer num, String str6, String str7, CommentLevelType commentLevelType, String str8, String str9) {
        jo.a1 a1Var;
        jo.a1 a1Var2;
        switch (this.r) {
            case 0:
                k71.k.g(commentLevelType, "subjectType");
                k71.k.g(str8, "diffBaseOid");
                k71.k.g(str9, "diffHeadOid");
                return y41.t1.S("addReviewCommentWithPositioning", "3.12");
            case 1:
                k71.k.g(commentLevelType, "subjectType");
                k71.k.g(str8, "diffBaseOid");
                k71.k.g(str9, "diffHeadOid");
                if (commentLevelType == CommentLevelType.FILE) {
                    xz Q = com.google.common.util.concurrent.a.Q(commentLevelType);
                    aa.u0 u0Var = new aa.u0(new m10.u5(new aa.u0(str8), new aa.u0(str9), str5, str4));
                    aa.t0 t0Var = aa.t0.d;
                    a1Var2 = new jo.a1(str, str2, i, str3, Q, t0Var, t0Var, u0Var, 112);
                } else {
                    if (num == null || str7 == null || str6 == null) {
                        a1Var = new jo.a1(str, str2, i, str3, com.google.common.util.concurrent.a.Q(commentLevelType), new aa.u0(new m10.v5(i, new aa.u0(str8), new aa.u0(str9), str5, str4)), (aa1.b) null, (aa.u0) null, 1648);
                    } else {
                        a1Var = new jo.a1(str, str2, i, str3, com.google.common.util.concurrent.a.Q(commentLevelType), (aa1.b) null, new aa.u0(new m10.w5(new aa.u0(str8), str5, i, str4, new aa.u0(str9), str7, num.intValue(), str6)), (aa.u0) null, 1392);
                    }
                    a1Var2 = a1Var;
                }
                return y71.n1Shadow.y(new cn.q(new o3(in.rShadow.h(this.t.d(a1Var2)), 19), 26), this.u);
            case 2:
                k71.k.g(commentLevelType, "subjectType");
                k71.k.g(str8, "diffBaseOid");
                k71.k.g(str9, "diffHeadOid");
                return y41.t1.S("addReviewCommentWithPositioning", "3.10");
            default:
                k71.k.g(commentLevelType, "subjectType");
                k71.k.g(str8, "diffBaseOid");
                k71.k.g(str9, "diffHeadOid");
                return y41.t1.S("addReviewCommentWithPositioning", "3.17");
        }
    }

    @Override // z01.f
    public final y71.i o(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "issueOrPullId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new kc0.f(str, str2))), 10), new u(this, str, null, 0), 6), 8), this.u);
            case 1:
                k71.k.g(str, "issueOrPullId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new aq.c(new y71.y(new y00.l(in.rShadow.h(this.s.d(new jo.k(str, str2))), 10), new t00.v(this, str, (a71.c) null, 0), 6), 18), this.u);
            case 2:
                k71.k.g(str, "issueOrPullId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new u10.f(str, str2))), 10), new vb0.n(this, str, null, 0), 6), 1), this.u);
            default:
                k71.k.g(str, "issueOrPullId");
                k71.k.g(str2, "body");
                return y71.n1Shadow.y(new tw0.i(new y71.y(new y00.l(in.rShadow.h(this.s.d(new jn0.f(str, str2))), 10), new wy0.q(this, str, null, 0), 6), 10), this.u);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (r3.p(r9, r6, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(String str, j71.c cVar, c71.c cVar2) {
        vb0.xShadow xVar;
        int i;
        w50.bShadow bVar;
        if (cVar2 instanceof vb0.x) {
            xVar = (vb0.x) cVar2;
            int i2 = xVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.y = i2 - Integer.MIN_VALUE;
                Object obj = xVar.w;
                b71.a aVar = b71.a.r;
                i = xVar.y;
                com.github.service.wrapper.bShadow bVar2 = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    w50.c cVar3 = new w50.c(0);
                    xVar.u = str;
                    xVar.v = cVar;
                    xVar.y = 1;
                    obj = bVar2.c(cVar3, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = xVar.v;
                    str = xVar.u;
                    sy.y.j(obj);
                }
                bVar = (w50.b) obj;
                if (bVar != null) {
                    return null;
                }
                w50.bShadow bVar3 = new w50.b(bVar.a, new w50.a(((Number) cVar.k(new Integer(bVar.b.a))).intValue()), bVar.c);
                w50.c cVar4 = new w50.c(0);
                xVar.u = null;
                xVar.v = null;
                xVar.y = 2;
            }
        }
        xVar = new vb0.x(this, cVar2);
        Object obj2 = xVar.w;
        b71.a aVar2 = b71.a.r;
        i = xVar.y;
        com.github.service.wrapper.bShadow bVar22 = this.t;
        if (i != 0) {
        }
        bVar = (w50.b) obj2;
        if (bVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r3.p(r9, r6, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y(String str, j71.c cVar, c71.c cVar2) {
        e0 e0Var;
        int i;
        mg0.bShadow bVar;
        if (cVar2 instanceof e0) {
            e0Var = (e0) cVar2;
            int i2 = e0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = e0Var.w;
                b71.a aVar = b71.a.r;
                i = e0Var.y;
                com.github.service.wrapper.bShadow bVar2 = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    mg0.d dVar = new mg0.d();
                    e0Var.u = str;
                    e0Var.v = cVar;
                    e0Var.y = 1;
                    obj = bVar2.c(dVar, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = e0Var.v;
                    str = e0Var.u;
                    sy.y.j(obj);
                }
                bVar = (mg0.b) obj;
                if (bVar != null) {
                    return null;
                }
                mg0.bShadow bVar3 = new mg0.b(bVar.a, new mg0.a(((Number) cVar.k(new Integer(bVar.b.a))).intValue()), bVar.c);
                mg0.d dVar2 = new mg0.d();
                e0Var.u = null;
                e0Var.v = null;
                e0Var.y = 2;
            }
        }
        e0Var = new e0(this, cVar2);
        Object obj2 = e0Var.w;
        b71.a aVar2 = b71.a.r;
        i = e0Var.y;
        com.github.service.wrapper.bShadow bVar22 = this.t;
        if (i != 0) {
        }
        bVar = (mg0.b) obj2;
        if (bVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r3.p(r9, r6, r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(String str, j71.c cVar, c71.c cVar2) {
        wy0.a0Shadow a0Var;
        int i;
        ur0.bShadow bVar;
        if (cVar2 instanceof wy0.a0) {
            a0Var = (wy0.a0) cVar2;
            int i2 = a0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = a0Var.w;
                b71.a aVar = b71.a.r;
                i = a0Var.y;
                com.github.service.wrapper.bShadow bVar2 = this.t;
                if (i != 0) {
                    sy.y.j(obj);
                    ur0.d dVar = new ur0.d();
                    a0Var.u = str;
                    a0Var.v = cVar;
                    a0Var.y = 1;
                    obj = bVar2.c(dVar, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = a0Var.v;
                    str = a0Var.u;
                    sy.y.j(obj);
                }
                bVar = (ur0.b) obj;
                if (bVar != null) {
                    return null;
                }
                ur0.bShadow bVar3 = new ur0.b(bVar.a, new ur0.a(((Number) cVar.k(new Integer(bVar.b.a))).intValue()), bVar.c);
                ur0.d dVar2 = new ur0.d();
                a0Var.u = null;
                a0Var.v = null;
                a0Var.y = 2;
            }
        }
        a0Var = new wy0.a0(this, cVar2);
        Object obj2 = a0Var.w;
        b71.a aVar2 = b71.a.r;
        i = a0Var.y;
        com.github.service.wrapper.bShadow bVar22 = this.t;
        if (i != 0) {
        }
        bVar = (ur0.b) obj2;
        if (bVar != null) {
        }
    }
}
