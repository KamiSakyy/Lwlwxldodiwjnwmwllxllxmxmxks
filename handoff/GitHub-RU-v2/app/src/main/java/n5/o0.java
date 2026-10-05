package n5;

import java.util.concurrent.atomic.AtomicInteger;
import t00.f8;

/* loaded from: /home/user/work/p/classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final e81.c f29575a = e81.d.a();

    /* renamed from: b, reason: collision with root package name */
    public final kk.a f29576b = new kk.a(13);

    /* renamed from: c, reason: collision with root package name */
    public final f8 f29577c = new f8(new do0.m(2, (a71.c) null, 7));

    public o0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f29576b.s).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.m(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j71.c cVar, c71.c cVar2) {
        m0 m0Var;
        b71.a aVar;
        int i;
        e81.a aVar2;
        Throwable th;
        e81.a aVar3;
        Object k10;
        try {
            if (cVar2 instanceof m0) {
                m0Var = (m0) cVar2;
                int i10 = m0Var.f29562y;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    m0Var.f29562y = i10 - Integer.MIN_VALUE;
                    Object obj = m0Var.f29560w;
                    aVar = b71.a.r;
                    i = m0Var.f29562y;
                    if (i != 0) {
                        sy.y.j(obj);
                        m0Var.f29558u = cVar;
                        aVar2 = this.f29575a;
                        m0Var.f29559v = aVar2;
                        m0Var.f29562y = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (e81.a) m0Var.f29558u;
                            try {
                                sy.y.j(obj);
                                aVar3.f((Object) null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar3.f((Object) null);
                                throw th;
                            }
                        }
                        e81.a aVar4 = m0Var.f29559v;
                        j71.c cVar3 = (j71.c) m0Var.f29558u;
                        sy.y.j(obj);
                        aVar2 = aVar4;
                        cVar = cVar3;
                    }
                    m0Var.f29558u = aVar2;
                    m0Var.f29559v = null;
                    m0Var.f29562y = 2;
                    k10 = cVar.k(m0Var);
                    if (k10 != aVar) {
                        e81.a aVar5 = aVar2;
                        obj = k10;
                        aVar3 = aVar5;
                        aVar3.f((Object) null);
                        return obj;
                    }
                    return aVar;
                }
            }
            m0Var.f29558u = aVar2;
            m0Var.f29559v = null;
            m0Var.f29562y = 2;
            k10 = cVar.k(m0Var);
            if (k10 != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            e81.a aVar6 = aVar2;
            th = th3;
            aVar3 = aVar6;
            aVar3.f((Object) null);
            throw th;
        }
        m0Var = new m0(this, cVar2);
        Object obj2 = m0Var.f29560w;
        aVar = b71.a.r;
        i = m0Var.f29562y;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(j71.e eVar, c71.c cVar) {
        n0 n0Var;
        int i;
        e81.c cVar2;
        Throwable th;
        boolean z10;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i10 = n0Var.f29570y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                n0Var.f29570y = i10 - Integer.MIN_VALUE;
                Object obj = n0Var.f29568w;
                b71.a aVar = b71.a.r;
                i = n0Var.f29570y;
                if (i != 0) {
                    sy.y.j(obj);
                    e81.c cVar3 = this.f29575a;
                    boolean e5 = cVar3.e();
                    try {
                        Boolean valueOf = Boolean.valueOf(e5);
                        n0Var.f29566u = cVar3;
                        n0Var.f29567v = e5;
                        n0Var.f29570y = 1;
                        Object s2 = eVar.s(valueOf, n0Var);
                        if (s2 == aVar) {
                            return aVar;
                        }
                        cVar2 = cVar3;
                        obj = s2;
                        z10 = e5;
                    } catch (Throwable th2) {
                        cVar2 = cVar3;
                        th = th2;
                        z10 = e5;
                        if (z10) {
                            cVar2.f((Object) null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = n0Var.f29567v;
                    cVar2 = n0Var.f29566u;
                    try {
                        sy.y.j(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z10) {
                        }
                        throw th;
                    }
                }
                if (z10) {
                    cVar2.f((Object) null);
                }
                return obj;
            }
        }
        n0Var = new n0(this, cVar);
        Object obj2 = n0Var.f29568w;
        b71.a aVar2 = b71.a.r;
        i = n0Var.f29570y;
        if (i != 0) {
        }
        if (z10) {
        }
        return obj2;
    }
}
