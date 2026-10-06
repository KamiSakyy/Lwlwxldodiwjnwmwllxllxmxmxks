package y71;

import com.google.android.gms.internal.measurement.b4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class y1 extends z71.a implements g1, i, z71.r {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(y1.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int v;

    public y1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // z71.r
    public final i a(a71.h hVar, int i, x71.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != x71.a.s) ? n1.z(this, hVar, i, aVar) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
        if (r0.equals(r2) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0113, code lost:
    
        if (r6 == r4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        if (r2 != r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x007e, code lost:
    
        if (((y71.b2) r0).a(r3) == r4) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0039, B:14:0x0097, B:16:0x009f, B:19:0x00a6, B:20:0x00aa, B:24:0x00ad, B:26:0x00ce, B:29:0x00de, B:30:0x00fa, B:36:0x010a, B:32:0x0101, B:35:0x0107, B:45:0x00b3, B:48:0x00ba, B:56:0x0052, B:58:0x005d, B:59:0x0087), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:13:0x0039, B:14:0x0097, B:16:0x009f, B:19:0x00a6, B:20:0x00aa, B:24:0x00ad, B:26:0x00ce, B:29:0x00de, B:30:0x00fa, B:36:0x010a, B:32:0x0101, B:35:0x0107, B:45:0x00b3, B:48:0x00ba, B:56:0x0052, B:58:0x005d, B:59:0x0087), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00dd -> B:14:0x0097). Please report as a decompilation issue!!! */
    @Override // y71.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j jVar, a71.c cVar) {
        Object th = null;
        x1 x1Var;
        w61.a0 a0Var;
        int i;
        y1 y1Var;
        z1 z1Var;
        j jVar2;
        v71.d1 d1Var;
        Object obj;
        Object andSet;
        Object obj2;
        j jVar3 = jVar;
        try {
            if (cVar instanceof x1) {
                x1Var = (x1) cVar;
                int i2 = x1Var.B;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    x1Var.B = i2 - Integer.MIN_VALUE;
                    Object obj3 = x1Var.z;
                    a0Var = b71.a.r;
                    i = x1Var.B;
                    if (i != 0) {
                        sy.y.j(obj3);
                        z1Var = (z1) d();
                        try {
                            if (jVar3 instanceof b2) {
                                x1Var.u = this;
                                x1Var.v = jVar3;
                                x1Var.w = z1Var;
                                x1Var.B = 1;
                            }
                            y1Var = this;
                        } catch (Throwable th) {
                            th = th;
                            y1Var = this;
                            y1Var.g(z1Var);
                            throw th;
                        }
                    } else if (i == 1) {
                        z1Var = x1Var.w;
                        jVar3 = x1Var.v;
                        y1Var = x1Var.u;
                        sy.y.j(obj3);
                    } else if (i == 2) {
                        obj = x1Var.y;
                        d1Var = x1Var.x;
                        z1Var = x1Var.w;
                        jVar2 = x1Var.v;
                        y1Var = x1Var.u;
                        sy.y.j(obj3);
                        AtomicReference atomicReference = z1Var.a;
                        a81.t tVar = n1Shadow.b;
                        andSet = atomicReference.getAndSet(tVar);
                        k71.k.d(andSet);
                        if (andSet == n1.c) {
                        }
                        Object obj4 = w.get(y1Var);
                        if (d1Var != null) {
                        }
                        if (obj4 == z71.b.b) {
                        }
                        x1Var.u = y1Var;
                        x1Var.v = jVar2;
                        x1Var.w = z1Var;
                        x1Var.x = d1Var;
                        x1Var.y = obj4;
                        x1Var.B = 2;
                        if (jVar2.c(obj2, x1Var) == a0Var) {
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = x1Var.y;
                        d1Var = x1Var.x;
                        z1Var = x1Var.w;
                        jVar2 = x1Var.v;
                        y1Var = x1Var.u;
                        sy.y.j(obj3);
                        Object obj42 = w.get(y1Var);
                        if (d1Var != null && !d1Var.f()) {
                            throw d1Var.N();
                        }
                        obj2 = obj42 == z71.b.b ? null : obj42;
                        x1Var.u = y1Var;
                        x1Var.v = jVar2;
                        x1Var.w = z1Var;
                        x1Var.x = d1Var;
                        x1Var.y = obj42;
                        x1Var.B = 2;
                        if (jVar2.c(obj2, x1Var) == a0Var) {
                            return a0Var;
                        }
                        obj = obj42;
                        AtomicReference atomicReference2 = z1Var.a;
                        a81.t tVar2 = n1Shadow.b;
                        andSet = atomicReference2.getAndSet(tVar2);
                        k71.k.d(andSet);
                        if (andSet == n1.c) {
                            x1Var.u = y1Var;
                            x1Var.v = jVar2;
                            x1Var.w = z1Var;
                            x1Var.x = d1Var;
                            x1Var.y = obj;
                            x1Var.B = 3;
                            w61.a0 a0Var2 = w61.a0.a;
                            v71.l lVar = new v71.l(1, b4.T(x1Var));
                            lVar.t();
                            AtomicReference atomicReference3 = z1Var.a;
                            while (true) {
                                if (atomicReference3.compareAndSet(tVar2, lVar)) {
                                    break;
                                }
                                if (atomicReference3.get() != tVar2) {
                                    lVar.i(a0Var2);
                                    break;
                                }
                            }
                            Object s = lVar.s();
                            if (s == b71.a.r) {
                            }
                        }
                        Object obj422 = w.get(y1Var);
                        if (d1Var != null) {
                            throw d1Var.N();
                        }
                        if (obj422 == z71.b.b) {
                        }
                        x1Var.u = y1Var;
                        x1Var.v = jVar2;
                        x1Var.w = z1Var;
                        x1Var.x = d1Var;
                        x1Var.y = obj422;
                        x1Var.B = 2;
                        if (jVar2.c(obj2, x1Var) == a0Var) {
                        }
                    }
                    a71.h hVar = ((c71.c) x1Var).s;
                    k71.k.d(hVar);
                    jVar2 = jVar3;
                    d1Var = (v71.d1) hVar.w0(v71.w.s);
                    obj = null;
                    Object obj4222 = w.get(y1Var);
                    if (d1Var != null) {
                    }
                    if (obj4222 == z71.b.b) {
                    }
                    x1Var.u = y1Var;
                    x1Var.v = jVar2;
                    x1Var.w = z1Var;
                    x1Var.x = d1Var;
                    x1Var.y = obj4222;
                    x1Var.B = 2;
                    if (jVar2.c(obj2, x1Var) == a0Var) {
                    }
                }
            }
            if (i != 0) {
            }
            a71.h hVar2 = ((c71.c) x1Var).s;
            k71.k.d(hVar2);
            jVar2 = jVar3;
            d1Var = (v71.d1) hVar2.w0(v71.w.s);
            obj = null;
            Object obj42222 = w.get(y1Var);
            if (d1Var != null) {
            }
            if (obj42222 == z71.b.b) {
            }
            x1Var.u = y1Var;
            x1Var.v = jVar2;
            x1Var.w = z1Var;
            x1Var.x = d1Var;
            x1Var.y = obj42222;
            x1Var.B = 2;
            if (jVar2.c(obj2, x1Var) == a0Var) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        x1Var = new x1(this, cVar);
        Object obj32 = x1Var.z;
        a0Var = b71.a.r;
        i = x1Var.B;
    }

    @Override // y71.j
    public final Object c(Object obj, a71.c cVar) {
        j(obj);
        return w61.a0.a;
    }

    @Override // z71.a
    public final z71.c e() {
        return new z1();
    }

    @Override // z71.a
    public final z71.c[] f() {
        return new z1[2];
    }

    @Override // y71.w1
    public final Object getValue() {
        a81.t tVar = z71.b.b;
        Object obj = w.get(this);
        if (obj == tVar) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        a81.t tVar = z71.b.b;
        if (obj == null) {
            obj = tVar;
        }
        if (obj2 == null) {
            obj2 = tVar;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = z71.b.b;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i;
        z71.c[] cVarArr;
        a81.t tVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !k71.k.b(obj3, obj)) {
                return false;
            }
            if (k71.k.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.v;
            if ((i2 & 1) != 0) {
                this.v = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.v = i3;
            z71.c[] cVarArr2 = this.r;
            while (true) {
                z1[] z1VarArr = (z1[]) cVarArr2;
                if (z1VarArr != null) {
                    for (z1 z1Var : z1VarArr) {
                        if (z1Var != null) {
                            AtomicReference atomicReference = z1Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (tVar = n1.c)) {
                                    a81.t tVar2 = n1Shadow.b;
                                    if (obj4 != tVar2) {
                                        while (!atomicReference.compareAndSet(obj4, tVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((v71.l) obj4).i(w61.a0.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, tVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.v;
                    if (i == i3) {
                        this.v = i3 + 1;
                        return true;
                    }
                    cVarArr = this.r;
                }
                cVarArr2 = cVarArr;
                i3 = i;
            }
        }
    }

    @Override // y71.f1
    public final void l() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // y71.f1
    public final boolean m(Object obj) {
        j(obj);
        return true;
    }
}
