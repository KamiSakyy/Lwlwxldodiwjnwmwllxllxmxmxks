package com.github.rudroid.uitoolkit.swipetodismiss;

import com.github.rudroid.uitoolkit.swipetodismiss.a0;
import f0.j1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import v71.d1;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {160, 82}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class b0 extends c71.j implements j71.e {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ j1 C;
    public final /* synthetic */ a0 D;
    public final /* synthetic */ c71.j E;
    public Object v;
    public e81.a w;
    public Object x;
    public a0 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(j1 j1Var, a0 a0Var, j71.c cVar, a71.c cVar2) {
        super(2, cVar2);
        this.C = j1Var;
        this.D = a0Var;
        this.E = (c71.j) cVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        b0 b0Var = new b0(this.C, this.D, this.E, cVar);
        b0Var.B = obj;
        return b0Var;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        a0.a aVar;
        a0 a0Var;
        e81.a aVar2;
        int i;
        j71.c cVar;
        a0.a aVar3;
        Throwable th2;
        e81.a aVar4;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        v71.z zVar = (v71.z) this.B;
        b71.a aVar5 = b71.a.r;
        int i2 = this.A;
        try {
            try {
                if (i2 == 0) {
                    sy.y.j(obj);
                    d1 w0 = zVar.K().w0(v71.w.s);
                    k71.k.d(w0);
                    aVar = new a0.a(this.C, w0);
                    a0Var = this.D;
                    AtomicReference atomicReference3 = a0Var.a;
                    while (true) {
                        a0.a aVar6 = (a0.a) atomicReference3.get();
                        if (aVar6 != null && aVar.a.compareTo(aVar6.a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(aVar6, aVar)) {
                            if (atomicReference3.get() != aVar6) {
                                break;
                            }
                        }
                        if (aVar6 != null) {
                            aVar6.b.m((CancellationException) null);
                        }
                        aVar2 = a0Var.b;
                        this.B = null;
                        this.v = aVar;
                        this.w = aVar2;
                        j71.c cVar2 = this.E;
                        this.x = cVar2;
                        this.y = a0Var;
                        i = 0;
                        this.z = 0;
                        this.A = 1;
                        if (aVar2.m(this) != aVar5) {
                            cVar = cVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0Var = (a0) this.x;
                        aVar4 = this.w;
                        aVar3 = (a0.a) this.v;
                        try {
                            sy.y.j(obj);
                            atomicReference2 = a0Var.a;
                            while (!atomicReference2.compareAndSet(aVar3, null) && atomicReference2.get() == aVar3) {
                            }
                            aVar4.f((Object) null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            atomicReference = a0Var.a;
                            while (!atomicReference.compareAndSet(aVar3, null) && atomicReference.get() == aVar3) {
                            }
                            throw th2;
                        }
                    }
                    int i3 = this.z;
                    a0 a0Var2 = this.y;
                    cVar = (j71.c) this.x;
                    e81.a aVar7 = this.w;
                    a0.a aVar8 = (a0.a) this.v;
                    sy.y.j(obj);
                    aVar = aVar8;
                    i = i3;
                    a0Var = a0Var2;
                    aVar2 = aVar7;
                }
                this.B = null;
                this.v = aVar;
                this.w = aVar2;
                this.x = a0Var;
                this.y = null;
                this.z = i;
                this.A = 2;
                Object k = cVar.k(this);
                if (k != aVar5) {
                    aVar4 = aVar2;
                    aVar3 = aVar;
                    obj = k;
                    atomicReference2 = a0Var.a;
                    while (!atomicReference2.compareAndSet(aVar3, null)) {
                    }
                    aVar4.f((Object) null);
                    return obj;
                }
                return aVar5;
            } catch (Throwable th4) {
                aVar3 = aVar;
                th2 = th4;
                atomicReference = a0Var.a;
                while (!atomicReference.compareAndSet(aVar3, null)) {
                }
                throw th2;
            }
        } catch (Throwable th5) {
            aVar5.f((Object) null);
            throw th5;
        }
    }
}
