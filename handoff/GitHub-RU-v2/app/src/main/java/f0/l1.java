package f0;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes.dex */
public final class l1 extends c71.j implements j71.e {
    public /* synthetic */ Object A;
    public final /* synthetic */ j1 B;
    public final /* synthetic */ m1 C;
    public final /* synthetic */ c71.j D;
    public final /* synthetic */ Object E;

    /* renamed from: v, reason: collision with root package name */
    public e81.a f22330v;

    /* renamed from: w, reason: collision with root package name */
    public Object f22331w;

    /* renamed from: x, reason: collision with root package name */
    public Object f22332x;

    /* renamed from: y, reason: collision with root package name */
    public m1 f22333y;

    /* renamed from: z, reason: collision with root package name */
    public int f22334z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(j1 j1Var, m1 m1Var, j71.e eVar, Object obj, a71.c cVar) {
        super(2, cVar);
        this.B = j1Var;
        this.C = m1Var;
        this.D = (c71.j) eVar;
        this.E = obj;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        l1 l1Var = new l1(this.B, this.C, this.D, this.E, cVar);
        l1Var.A = obj;
        return l1Var;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e81.a, int] */
    public final Object v(Object obj) {
        m1 m1Var;
        Object obj2;
        k1 k1Var;
        e81.a aVar;
        j71.e eVar;
        m1 m1Var2;
        Throwable th;
        k1 k1Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        b71.a aVar2 = b71.a.r;
        int r12 = this.f22334z;
        try {
            try {
                if (r12 == 0) {
                    sy.y.j(obj);
                    v71.d1 w02 = ((v71.z) this.A).K().w0(v71.w.s);
                    k71.k.d(w02);
                    k1 k1Var3 = new k1(this.B, w02);
                    m1Var = this.C;
                    m1.a(m1Var, k1Var3);
                    e81.a aVar3 = m1Var.f22336b;
                    this.A = k1Var3;
                    this.f22330v = aVar3;
                    j71.e eVar2 = this.D;
                    this.f22331w = eVar2;
                    Object obj3 = this.E;
                    this.f22332x = obj3;
                    this.f22333y = m1Var;
                    this.f22334z = 1;
                    if (aVar3.m(this) != aVar2) {
                        obj2 = obj3;
                        k1Var = k1Var3;
                        aVar = aVar3;
                        eVar = eVar2;
                    }
                    return aVar2;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m1Var2 = (m1) this.f22331w;
                    aVar = this.f22330v;
                    k1Var2 = (k1) this.A;
                    try {
                        sy.y.j(obj);
                        atomicReference2 = m1Var2.f22335a;
                        while (!atomicReference2.compareAndSet(k1Var2, null) && atomicReference2.get() == k1Var2) {
                        }
                        aVar.f((Object) null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = m1Var2.f22335a;
                        while (!atomicReference.compareAndSet(k1Var2, null)) {
                        }
                        throw th;
                    }
                }
                m1 m1Var3 = this.f22333y;
                obj2 = this.f22332x;
                eVar = (j71.e) this.f22331w;
                e81.a aVar4 = this.f22330v;
                k1Var = (k1) this.A;
                sy.y.j(obj);
                m1Var = m1Var3;
                aVar = aVar4;
                this.A = k1Var;
                this.f22330v = aVar;
                this.f22331w = m1Var;
                this.f22332x = null;
                this.f22333y = null;
                this.f22334z = 2;
                Object s2 = eVar.s(obj2, this);
                if (s2 != aVar2) {
                    m1Var2 = m1Var;
                    obj = s2;
                    k1Var2 = k1Var;
                    atomicReference2 = m1Var2.f22335a;
                    while (!atomicReference2.compareAndSet(k1Var2, null)) {
                    }
                    aVar.f((Object) null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th3) {
                m1Var2 = m1Var;
                th = th3;
                k1Var2 = k1Var;
                atomicReference = m1Var2.f22335a;
                while (!atomicReference.compareAndSet(k1Var2, null) && atomicReference.get() == k1Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r12.f((Object) null);
            throw th4;
        }
    }
}
