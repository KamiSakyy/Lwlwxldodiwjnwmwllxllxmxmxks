package dn;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    public final oa.m a;
    public final en.c b;
    public final e0 c;
    public final k d;
    public final h0 e;
    public final com.github.rudroid.common.k f;
    public final v71.z g;
    public final e81.c h;

    public z(oa.m mVar, en.c cVar, e0 e0Var, k kVar, h0 h0Var, com.github.rudroid.common.k kVar2, v71.z zVar) {
        k71.k.g(mVar, "userManager");
        k71.k.g(cVar, "factory");
        k71.k.g(e0Var, "registerAuthCertificateUseCase");
        k71.k.g(kVar, "deleteTwoFactorAuthKeyUseCase");
        k71.k.g(h0Var, "registerRecoveryCertificateUseCase");
        k71.k.g(kVar2, "featureManager");
        k71.k.g(zVar, "applicationScope");
        this.a = mVar;
        this.b = cVar;
        this.c = e0Var;
        this.d = kVar;
        this.e = h0Var;
        this.f = kVar2;
        this.g = zVar;
        this.h = e81.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c71.c cVar) {
        w wVar;
        int i;
        e81.c cVar2;
        try {
            if (cVar instanceof w) {
                wVar = (w) cVar;
                int i2 = wVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = wVar.u;
                    Object obj2 = b71.a.r;
                    i = wVar.w;
                    cVar2 = this.h;
                    if (i != 0) {
                        sy.y.j(obj);
                        if (cVar2.e()) {
                            wVar.w = 1;
                            if (c(wVar) == obj2) {
                                return obj2;
                            }
                        }
                        return w61.a0.a;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
            }
            if (i != 0) {
            }
            return w61.a0.a;
        } finally {
            cVar2.f((Object) null);
        }
        wVar = new w(this, cVar);
        Object obj3 = wVar.u;
        Object obj22 = b71.a.r;
        i = wVar.w;
        cVar2 = this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oa.j jVar, c71.c cVar) {
        x xVar;
        int i;
        e81.a aVar;
        try {
            if (cVar instanceof x) {
                xVar = (x) cVar;
                int i2 = xVar.y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xVar.y = i2 - Integer.MIN_VALUE;
                    Object obj = xVar.w;
                    b71.a aVar2 = b71.a.r;
                    i = xVar.y;
                    if (i != 0) {
                        sy.y.j(obj);
                        xVar.u = jVar;
                        aVar = this.h;
                        xVar.v = aVar;
                        xVar.y = 1;
                        if (aVar.m(xVar) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e81.a aVar3 = xVar.v;
                        oa.j jVar2 = xVar.u;
                        sy.y.j(obj);
                        aVar = aVar3;
                        jVar = jVar2;
                    }
                    this.b.getClass();
                    en.c.b(jVar).c();
                    jVar.i(-1L);
                    aVar.f((Object) null);
                    return w61.a0.a;
                }
            }
            this.b.getClass();
            en.c.b(jVar).c();
            jVar.i(-1L);
            aVar.f((Object) null);
            return w61.a0.a;
        } catch (Throwable th2) {
            aVar.f((Object) null);
            throw th2;
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.w;
        b71.a aVar22 = b71.a.r;
        i = xVar.y;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d1, code lost:
    
        if (r14.e.a(r8, r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00bc -> B:27:0x00d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d1 -> B:27:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(c71.c cVar) {
        y yVar;
        int i;
        Iterator it;
        int i2;
        Iterator it2;
        int i3;
        int i4;
        oa.j jVar;
        int i5;
        Iterator it3;
        int i6;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i7 = yVar.A;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                yVar.A = i7 - Integer.MIN_VALUE;
                Object obj = yVar.y;
                b71.a aVar = b71.a.r;
                i = yVar.A;
                if (i != 0) {
                    sy.y.j(obj);
                    boolean c = this.f.c();
                    oa.m mVar = this.a;
                    if (c) {
                        it2 = mVar.e().iterator();
                        i3 = 0;
                        while (it2.hasNext()) {
                        }
                        return w61.a0.a;
                    }
                    it = mVar.e().iterator();
                    i2 = 0;
                } else {
                    if (i == 1) {
                        i6 = yVar.x;
                        i3 = yVar.w;
                        jVar = yVar.v;
                        it2 = yVar.u;
                        sy.y.j(obj);
                        i4 = i6;
                        i5 = i3;
                        it3 = it2;
                        if (jVar.j.a(jVar, oa.j.p[6]).longValue() < System.currentTimeMillis()) {
                        }
                        it2 = it3;
                        i3 = i5;
                        while (it2.hasNext()) {
                        }
                        return w61.a0.a;
                    }
                    if (i == 2) {
                        i5 = yVar.w;
                        it3 = yVar.u;
                        sy.y.j(obj);
                        it2 = it3;
                        i3 = i5;
                        while (it2.hasNext()) {
                            jVar = (oa.j) it2.next();
                            if (jVar.f(com.github.rudroid.common.a.C)) {
                                if (jVar.e() < System.currentTimeMillis()) {
                                    yVar.getClass();
                                    yVar.u = it2;
                                    yVar.v = jVar;
                                    yVar.w = i3;
                                    yVar.x = 0;
                                    yVar.A = 1;
                                    if (this.c.a(jVar, yVar) != aVar) {
                                        i6 = 0;
                                        i4 = i6;
                                        i5 = i3;
                                        it3 = it2;
                                        if (jVar.j.a(jVar, oa.j.p[6]).longValue() < System.currentTimeMillis()) {
                                            yVar.getClass();
                                            yVar.u = it3;
                                            yVar.v = null;
                                            yVar.w = i5;
                                            yVar.x = i4;
                                            yVar.A = 2;
                                        }
                                        it2 = it3;
                                        i3 = i5;
                                        while (it2.hasNext()) {
                                        }
                                    }
                                    return aVar;
                                }
                                i4 = 0;
                                i5 = i3;
                                it3 = it2;
                                if (jVar.j.a(jVar, oa.j.p[6]).longValue() < System.currentTimeMillis()) {
                                }
                                it2 = it3;
                                i3 = i5;
                                while (it2.hasNext()) {
                                }
                            }
                        }
                        return w61.a0.a;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = yVar.w;
                    it = yVar.u;
                    sy.y.j(obj);
                }
                while (it.hasNext()) {
                    oa.j jVar2 = (oa.j) it.next();
                    if (jVar2.f(com.github.rudroid.common.a.C) && jVar2.e() > 0) {
                        yVar.getClass();
                        yVar.u = it;
                        yVar.v = null;
                        yVar.w = i2;
                        yVar.x = 0;
                        yVar.A = 3;
                        if (this.d.a(jVar2, false, yVar) == aVar) {
                            return aVar;
                        }
                    }
                }
                return w61.a0.a;
            }
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.y;
        b71.a aVar2 = b71.a.r;
        i = yVar.A;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return w61.a0.a;
    }
}
