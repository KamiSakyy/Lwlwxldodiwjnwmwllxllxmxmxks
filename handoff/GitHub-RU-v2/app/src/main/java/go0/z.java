package go0;

import androidx.lifecycle.l1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.yf0;
import jo.mi0;
import kc0.yb0;
import org.json.JSONObject;
import t00.f8;
import u10.y90;
import v71.q1;
import y41.t1;
import y71.m1;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z implements pn.a, yf0, yb0, mi0, y90 {
    public g91.f A;
    public m1 B;
    public q1 C;
    public rn.b D;
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public q81.u t;
    public v71.v u;
    public v71.z v;
    public sb.a w;
    public com.github.rudroid.common.e x;
    public e81.c y;
    public LinkedHashMap z;

    public z(com.github.service.wrapper.j jVar, q81.u uVar, v71.v vVar, v71.z zVar, sb.a aVar, qe.a aVar2, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okhttpClient");
                k71.k.g(vVar, "ioDispatcher");
                k71.k.g(zVar, "applicationScope");
                k71.k.g(aVar, "appLifecycleProvider");
                k71.k.g(aVar2, "crashLogger");
                this.s = jVar;
                this.t = uVar;
                this.u = vVar;
                this.v = zVar;
                this.w = aVar;
                this.x = aVar2;
                rb.b.b(zVar, (a71.h) null, aVar2, "AliveService", new hd0.c(this, null, 0), 11);
                this.y = e81.d.a();
                this.z = new LinkedHashMap();
                this.B = n1Shadow.b(10, 1, x71.a.r);
                this.D = new rn.b(this);
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okhttpClient");
                k71.k.g(vVar, "ioDispatcher");
                k71.k.g(zVar, "applicationScope");
                k71.k.g(aVar, "appLifecycleProvider");
                k71.k.g(aVar2, "crashLogger");
                this.s = jVar;
                this.t = uVar;
                this.u = vVar;
                this.v = zVar;
                this.w = aVar;
                this.x = aVar2;
                rb.b.b(zVar, (a71.h) null, aVar2, "AliveService", new kp.c(this, (a71.c) null, 0), 11);
                this.y = e81.d.a();
                this.z = new LinkedHashMap();
                this.B = n1Shadow.b(10, 1, x71.a.r);
                this.D = new rn.b(this);
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okhttpClient");
                k71.k.g(vVar, "ioDispatcher");
                k71.k.g(zVar, "applicationScope");
                k71.k.g(aVar, "appLifecycleProvider");
                k71.k.g(aVar2, "crashLogger");
                this.s = jVar;
                this.t = uVar;
                this.u = vVar;
                this.v = zVar;
                this.w = aVar;
                this.x = aVar2;
                rb.b.b(zVar, (a71.h) null, aVar2, "AliveService", new r20.c(this, (a71.c) null, 0), 11);
                this.y = e81.d.a();
                this.z = new LinkedHashMap();
                this.B = n1Shadow.b(10, 1, x71.a.r);
                this.D = new rn.b(this);
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(uVar, "okhttpClient");
                k71.k.g(vVar, "ioDispatcher");
                k71.k.g(zVar, "applicationScope");
                k71.k.g(aVar, "appLifecycleProvider");
                k71.k.g(aVar2, "crashLogger");
                this.s = jVar;
                this.t = uVar;
                this.u = vVar;
                this.v = zVar;
                this.w = aVar;
                this.x = aVar2;
                rb.b.b(zVar, (a71.h) null, aVar2, "AliveService", new e(this, null, 0), 11);
                this.y = e81.d.a();
                this.z = new LinkedHashMap();
                this.B = n1Shadow.b(10, 1, x71.a.r);
                this.D = new rn.b(this);
                break;
        }
    }

    public static final y71.s i(z zVar, qn.g gVar) {
        a71.c cVar = null;
        return new y71.s(n1Shadow.x(new y(zVar, gVar, cVar, 0), new c00.g(new y71.y(new f8(new a61.o(zVar, (a71.c) null)), new o(3, cVar, 1)), zVar, gVar, 9)), new cn.r(zVar, gVar, (a71.c) null, 3));
    }

    public static final y71.s j(z zVar, qn.g gVar) {
        a71.c cVar = null;
        return new y71.s(n1Shadow.x(new y(zVar, gVar, cVar, 1), new c00.g(new y71.y(new f8(new h1.u(zVar, (a71.c) null, 2)), new o(3, cVar, 6)), zVar, gVar, 10)), new cn.r(zVar, gVar, (a71.c) null, 4));
    }

    public static final y71.s k(z zVar, qn.g gVar) {
        a71.c cVar = null;
        return new y71.s(n1Shadow.x(new y(zVar, gVar, cVar, 2), new c00.g(new y71.y(new f8(new h1.u(zVar, (a71.c) null, 6)), new o(3, cVar, 9)), zVar, gVar, 11)), new cn.r(zVar, gVar, (a71.c) null, 6));
    }

    public static final y71.s l(z zVar, qn.g gVar) {
        return new y71.s(n1Shadow.x(new y(zVar, gVar, null, 3), new c00.g(new f8(new h1.u(zVar, (a71.c) null, 21)), zVar, gVar, 15)), new cn.r(zVar, gVar, (a71.c) null, 8));
    }

    public final y71.i a(String str) {
        switch (this.r) {
            case 0:
                sn.b[] bVarArr = sn.b.r;
                k71.k.g(str, "prId");
                return n1Shadow.x(new q(this, null, 3), new f8(new p(this, str, null, 3)));
            case 1:
                sn.b[] bVarArr2 = sn.b.r;
                k71.k.g(str, "prId");
                return n1Shadow.x(new hd0.k(this, null, 2), new f8(new hd0.j(this, str, null, 2)));
            case 2:
                sn.b[] bVarArr3 = sn.b.r;
                k71.k.g(str, "prId");
                return n1Shadow.x(new kp.o(this, (a71.c) null, 9), new f8(new kp.n(this, str, (a71.c) null, 3)));
            default:
                sn.b[] bVarArr4 = sn.b.r;
                k71.k.g(str, "prId");
                return n1Shadow.x(new r20.k(this, (a71.c) null, 2), new f8(new r20.j(this, str, (a71.c) null, 2)));
        }
    }

    public final y71.i b(String str) {
        switch (this.r) {
            case 0:
                sn.a[] aVarArr = sn.a.r;
                return n1Shadow.x(new q(this, null, 1), new f8(new p(this, str, null, 1)));
            case 1:
                sn.a[] aVarArr2 = sn.a.r;
                return n1Shadow.x(new hd0.k(this, null, 1), new f8(new hd0.j(this, str, null, 1)));
            case 2:
                sn.a[] aVarArr3 = sn.a.r;
                return n1Shadow.x(new kp.o(this, (a71.c) null, 1), new f8(new kp.n(this, str, (a71.c) null, 1)));
            default:
                sn.a[] aVarArr4 = sn.a.r;
                return n1Shadow.x(new r20.k(this, (a71.c) null, 1), new f8(new r20.j(this, str, (a71.c) null, 1)));
        }
    }

    public final y71.i c(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                return n1Shadow.x(new q(this, null, 0), new f8(new p(this, str, null, 0, false)));
            case 1:
                k71.k.g(str, "id");
                return n1Shadow.x(new hd0.k(this, null, 0), new f8(new hd0.j(this, str, null, 0)));
            case 2:
                k71.k.g(str, "id");
                return n1Shadow.x(new kp.o(this, (a71.c) null, 0), new f8(new kp.n(this, str, (a71.c) null, 0, false)));
            default:
                k71.k.g(str, "id");
                return n1Shadow.x(new r20.k(this, (a71.c) null, 0), new f8(new r20.j(this, str, (a71.c) null, 0)));
        }
    }

    public final y71.i d() {
        switch (this.r) {
            case 0:
                return t1.S("observeMobileAgentLogUpdates", "3.17");
            case 1:
                return t1.S("observeMobileAgentLogUpdates", "3.12");
            case 2:
                return n1Shadow.x(new kp.o(this, (a71.c) null, 5), new f8(new kp.o(this, (a71.c) null, 4)));
            default:
                return t1.S("observeMobileAgentLogUpdates", "3.10");
        }
    }

    public final y71.i e(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                return n1Shadow.x(new q(this, null, 2), new f8(new p(this, str, null, 2, false)));
            case 1:
                k71.k.g(str, "id");
                return t1.S("observeProject", "3.12");
            case 2:
                k71.k.g(str, "id");
                return n1Shadow.x(new kp.o(this, (a71.c) null, 8), new f8(new kp.n(this, str, (a71.c) null, 2, false)));
            default:
                k71.k.g(str, "id");
                return t1.S("observeProject", "3.10");
        }
    }

    public final y71.i f() {
        switch (this.r) {
            case 0:
                return t1.S("observeMobileAgentUpdates", "3.17");
            case 1:
                return t1.S("observeMobileAgentUpdates", "3.12");
            case 2:
                return n1Shadow.x(new kp.o(this, (a71.c) null, 7), new f8(new kp.o(this, (a71.c) null, 6)));
            default:
                return t1.S("observeMobileAgentUpdates", "3.10");
        }
    }

    public final y71.i g() {
        switch (this.r) {
            case 0:
                return t1.S("observeMobileAgentCreate", "3.17");
            case 1:
                return t1.S("observeMobileAgentCreate", "3.12");
            case 2:
                return n1Shadow.x(new kp.o(this, (a71.c) null, 3), new f8(new kp.o(this, (a71.c) null, 2)));
            default:
                return t1.S("observeMobileAgentCreate", "3.10");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0052, code lost:
    
        if (r15.m(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x008a, B:15:0x008e, B:17:0x00ab, B:20:0x00c7, B:22:0x00cb, B:23:0x00ce, B:28:0x00b2, B:29:0x00d6, B:30:0x00dd), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d A[Catch: all -> 0x00e1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:40:0x0055, B:44:0x005d), top: B:39:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(c71.c cVar) {
        r20.e eVar;
        int i;
        e81.a aVar;
        int i2;
        e81.a aVar2;
        g91.f fVar;
        String str;
        try {
            if (cVar instanceof r20.e) {
                eVar = (r20.e) cVar;
                int i3 = eVar.y;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    eVar.y = i3 - Integer.MIN_VALUE;
                    Object obj = eVar.w;
                    b71.a aVar3 = b71.a.r;
                    i = eVar.y;
                    if (i != 0) {
                        sy.y.j(obj);
                        aVar = this.y;
                        eVar.u = aVar;
                        i2 = 0;
                        eVar.v = 0;
                        eVar.y = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = eVar.u;
                            try {
                                sy.y.j(obj);
                                str = (String) obj;
                                if (str != null) {
                                    l1 l1Var = new l1(11);
                                    l1Var.I(str);
                                    this.A = this.t.c(new androidx.lifecycle.b(l1Var), this.D);
                                    q1 q1Var = this.C;
                                    if (q1Var == null || !q1Var.f()) {
                                        this.C = rb.b.b(this.v, (a71.h) null, this.x, "AliveService", new r20.c(this, (a71.c) null, 1), 11);
                                    }
                                    g91.f fVar2 = this.A;
                                    if (fVar2 != null) {
                                        r(fVar2);
                                    }
                                    g91.f fVar3 = this.A;
                                    if (fVar3 != null) {
                                        aVar2.f((Object) null);
                                        return fVar3;
                                    }
                                }
                                throw new IllegalStateException("could not open socket");
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                aVar2.f((Object) null);
                                throw th2;
                            }
                        }
                        i2 = eVar.v;
                        e81.a aVar4 = eVar.u;
                        sy.y.j(obj);
                        aVar = aVar4;
                    }
                    fVar = this.A;
                    if (fVar == null) {
                        aVar.f((Object) null);
                        return fVar;
                    }
                    eVar.u = aVar;
                    eVar.v = i2;
                    eVar.y = 2;
                    Object v = n1Shadow.v(com.github.rudroid.common.v.b(new gl.f(com.github.service.wrapper.a.o(this.s, new d20.m(), null, false, null, null, 58), 19), this.u), eVar);
                    if (v != aVar3) {
                        aVar2 = aVar;
                        obj = v;
                        str = (String) obj;
                        if (str != null) {
                        }
                        throw new IllegalStateException("could not open socket");
                    }
                    return aVar3;
                }
            }
            fVar = this.A;
            if (fVar == null) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            Throwable th22 = th;
            aVar2.f((Object) null);
            throw th22;
        }
        eVar = new r20.e(this, cVar);
        Object obj2 = eVar.w;
        b71.a aVar32 = b71.a.r;
        i = eVar.y;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0052, code lost:
    
        if (r15.m(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0089, B:15:0x008d, B:17:0x00aa, B:20:0x00c6, B:22:0x00ca, B:23:0x00cd, B:28:0x00b1, B:29:0x00d5, B:30:0x00dc), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d A[Catch: all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:40:0x0055, B:44:0x005d), top: B:39:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(c71.c cVar) {
        hd0.e eVar;
        int i;
        e81.a aVar;
        int i2;
        e81.a aVar2;
        g91.f fVar;
        String str;
        try {
            if (cVar instanceof hd0.e) {
                eVar = (hd0.e) cVar;
                int i3 = eVar.y;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    eVar.y = i3 - Integer.MIN_VALUE;
                    Object obj = eVar.w;
                    b71.a aVar3 = b71.a.r;
                    i = eVar.y;
                    a71.c cVar2 = null;
                    if (i != 0) {
                        sy.y.j(obj);
                        aVar = this.y;
                        eVar.u = aVar;
                        i2 = 0;
                        eVar.v = 0;
                        eVar.y = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = eVar.u;
                            try {
                                sy.y.j(obj);
                                str = (String) obj;
                                if (str != null) {
                                    l1 l1Var = new l1(11);
                                    l1Var.I(str);
                                    this.A = this.t.c(new androidx.lifecycle.b(l1Var), this.D);
                                    q1 q1Var = this.C;
                                    if (q1Var == null || !q1Var.f()) {
                                        this.C = rb.b.b(this.v, (a71.h) null, this.x, "AliveService", new hd0.c(this, cVar2, 1), 11);
                                    }
                                    g91.f fVar2 = this.A;
                                    if (fVar2 != null) {
                                        s(fVar2);
                                    }
                                    g91.f fVar3 = this.A;
                                    if (fVar3 != null) {
                                        aVar2.f((Object) null);
                                        return fVar3;
                                    }
                                }
                                throw new IllegalStateException("could not open socket");
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                aVar2.f((Object) null);
                                throw th2;
                            }
                        }
                        i2 = eVar.v;
                        e81.a aVar4 = eVar.u;
                        sy.y.j(obj);
                        aVar = aVar4;
                    }
                    fVar = this.A;
                    if (fVar == null) {
                        aVar.f((Object) null);
                        return fVar;
                    }
                    eVar.u = aVar;
                    eVar.v = i2;
                    eVar.y = 2;
                    Object v = n1Shadow.v(com.github.rudroid.common.v.b(new gl.f(com.github.service.wrapper.a.o(this.s, new tc0.m(), null, false, null, null, 58), 3), this.u), eVar);
                    if (v != aVar3) {
                        aVar2 = aVar;
                        obj = v;
                        str = (String) obj;
                        if (str != null) {
                        }
                        throw new IllegalStateException("could not open socket");
                    }
                    return aVar3;
                }
            }
            fVar = this.A;
            if (fVar == null) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            Throwable th22 = th;
            aVar2.f((Object) null);
            throw th22;
        }
        eVar = new hd0.e(this, cVar);
        Object obj2 = eVar.w;
        b71.a aVar32 = b71.a.r;
        i = eVar.y;
        a71.c cVar22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0052, code lost:
    
        if (r15.m(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x0089, B:15:0x008d, B:17:0x00aa, B:20:0x00c6, B:22:0x00ca, B:23:0x00cd, B:28:0x00b1, B:29:0x00d5, B:30:0x00dc), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d A[Catch: all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:40:0x0055, B:44:0x005d), top: B:39:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(c71.c cVar) {
        g gVar;
        int i;
        e81.a aVar;
        int i2;
        e81.a aVar2;
        g91.f fVar;
        String str;
        try {
            if (cVar instanceof g) {
                gVar = (g) cVar;
                int i3 = gVar.y;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gVar.y = i3 - Integer.MIN_VALUE;
                    Object obj = gVar.w;
                    b71.a aVar3 = b71.a.r;
                    i = gVar.y;
                    a71.c cVar2 = null;
                    if (i != 0) {
                        sy.y.j(obj);
                        aVar = this.y;
                        gVar.u = aVar;
                        i2 = 0;
                        gVar.v = 0;
                        gVar.y = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = gVar.u;
                            try {
                                sy.y.j(obj);
                                str = (String) obj;
                                if (str != null) {
                                    l1 l1Var = new l1(11);
                                    l1Var.I(str);
                                    this.A = this.t.c(new androidx.lifecycle.b(l1Var), this.D);
                                    q1 q1Var = this.C;
                                    if (q1Var == null || !q1Var.f()) {
                                        this.C = rb.b.b(this.v, (a71.h) null, this.x, "AliveService", new e(this, cVar2, 1), 11);
                                    }
                                    g91.f fVar2 = this.A;
                                    if (fVar2 != null) {
                                        t(fVar2);
                                    }
                                    g91.f fVar3 = this.A;
                                    if (fVar3 != null) {
                                        aVar2.f((Object) null);
                                        return fVar3;
                                    }
                                }
                                throw new IllegalStateException("could not open socket");
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                aVar2.f((Object) null);
                                throw th2;
                            }
                        }
                        i2 = gVar.v;
                        e81.a aVar4 = gVar.u;
                        sy.y.j(obj);
                        aVar = aVar4;
                    }
                    fVar = this.A;
                    if (fVar == null) {
                        aVar.f((Object) null);
                        return fVar;
                    }
                    gVar.u = aVar;
                    gVar.v = i2;
                    gVar.y = 2;
                    Object v = n1Shadow.v(com.github.rudroid.common.v.b(new gl.f(com.github.service.wrapper.a.o(this.s, new sn0.m(), null, false, null, null, 58), 1), this.u), gVar);
                    if (v != aVar3) {
                        aVar2 = aVar;
                        obj = v;
                        str = (String) obj;
                        if (str != null) {
                        }
                        throw new IllegalStateException("could not open socket");
                    }
                    return aVar3;
                }
            }
            fVar = this.A;
            if (fVar == null) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            Throwable th22 = th;
            aVar2.f((Object) null);
            throw th22;
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.w;
        b71.a aVar32 = b71.a.r;
        i = gVar.y;
        a71.c cVar22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0052, code lost:
    
        if (r15.m(r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0029, B:13:0x008a, B:15:0x008e, B:17:0x00ab, B:20:0x00c7, B:22:0x00cb, B:23:0x00d5, B:25:0x00db, B:27:0x010c, B:32:0x00b2, B:33:0x0114, B:34:0x011b), top: B:11:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005d A[Catch: all -> 0x011f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x011f, blocks: (B:44:0x0055, B:48:0x005d), top: B:43:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(c71.c cVar) {
        kp.e eVar;
        int i;
        e81.a aVar;
        int i2;
        e81.a aVar2;
        g91.f fVar;
        String str;
        try {
            if (cVar instanceof kp.e) {
                eVar = (kp.e) cVar;
                int i3 = eVar.y;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    eVar.y = i3 - Integer.MIN_VALUE;
                    Object obj = eVar.w;
                    b71.a aVar3 = b71.a.r;
                    i = eVar.y;
                    if (i != 0) {
                        sy.y.j(obj);
                        aVar = this.y;
                        eVar.u = aVar;
                        i2 = 0;
                        eVar.v = 0;
                        eVar.y = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = eVar.u;
                            try {
                                sy.y.j(obj);
                                str = (String) obj;
                                if (str != null) {
                                    l1 l1Var = new l1(11);
                                    l1Var.I(str);
                                    this.A = this.t.c(new androidx.lifecycle.b(l1Var), this.D);
                                    q1 q1Var = this.C;
                                    if (q1Var == null || !q1Var.f()) {
                                        this.C = rb.b.b(this.v, (a71.h) null, this.x, "AliveService", new kp.c(this, (a71.c) null, 1), 11);
                                    }
                                    g91.f fVar2 = this.A;
                                    if (fVar2 != null) {
                                        Iterator it = this.z.entrySet().iterator();
                                        while (it.hasNext()) {
                                            kp.d dVar = (kp.d) ((Map.Entry) it.next()).getValue();
                                            String jSONObject = new JSONObject().put("subscribe", new JSONObject().put(dVar.c, dVar.a)).toString();
                                            k71.k.f(jSONObject, "toString(...)");
                                            fVar2.g(jSONObject);
                                        }
                                    }
                                    g91.f fVar3 = this.A;
                                    if (fVar3 != null) {
                                        aVar2.f((Object) null);
                                        return fVar3;
                                    }
                                }
                                throw new IllegalStateException("could not open socket");
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                aVar2.f((Object) null);
                                throw th2;
                            }
                        }
                        i2 = eVar.v;
                        e81.a aVar4 = eVar.u;
                        sy.y.j(obj);
                        aVar = aVar4;
                    }
                    fVar = this.A;
                    if (fVar == null) {
                        aVar.f((Object) null);
                        return fVar;
                    }
                    eVar.u = aVar;
                    eVar.v = i2;
                    eVar.y = 2;
                    Object v = n1Shadow.v(com.github.rudroid.common.v.b(new gl.f(com.github.service.wrapper.a.o(this.s, new so.q(), null, false, null, null, 58), 11), this.u), eVar);
                    if (v != aVar3) {
                        aVar2 = aVar;
                        obj = v;
                        str = (String) obj;
                        if (str != null) {
                        }
                        throw new IllegalStateException("could not open socket");
                    }
                    return aVar3;
                }
            }
            fVar = this.A;
            if (fVar == null) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            Throwable th22 = th;
            aVar2.f((Object) null);
            throw th22;
        }
        eVar = new kp.e(this, cVar);
        Object obj2 = eVar.w;
        b71.a aVar32 = b71.a.r;
        i = eVar.y;
        if (i != 0) {
        }
    }

    public final m1 q() {
        switch (this.r) {
        }
        return this.B;
    }

    public void r(g91.f fVar) {
        for (Map.Entry entry : this.z.entrySet()) {
            String jSONObject = new JSONObject().put("subscribe", new JSONObject().put((String) entry.getKey(), ((r20.d) entry.getValue()).a)).toString();
            k71.k.f(jSONObject, "toString(...)");
            fVar.g(jSONObject);
        }
    }

    public void s(g91.f fVar) {
        for (Map.Entry entry : this.z.entrySet()) {
            String jSONObject = new JSONObject().put("subscribe", new JSONObject().put((String) entry.getKey(), ((hd0.d) entry.getValue()).a)).toString();
            k71.k.f(jSONObject, "toString(...)");
            fVar.g(jSONObject);
        }
    }

    public void t(g91.f fVar) {
        for (Map.Entry entry : this.z.entrySet()) {
            String jSONObject = new JSONObject().put("subscribe", new JSONObject().put((String) entry.getKey(), ((f) entry.getValue()).a)).toString();
            k71.k.f(jSONObject, "toString(...)");
            fVar.g(jSONObject);
        }
    }

    public final void u() {
        switch (this.r) {
            case 0:
                this.A = null;
                break;
            case 1:
                this.A = null;
                break;
            case 2:
                this.A = null;
                break;
            default:
                this.A = null;
                break;
        }
    }
}
