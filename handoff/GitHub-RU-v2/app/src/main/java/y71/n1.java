package y71;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import rm0.m7Shadow;
import rm0.r3;
import t00.f8;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class n1Shadow {
    public static final a81.t a = new a81.t(0, "NO_VALUE", false);
    public static final a81.t b = new a81.t(0, "NONE", false);
    public static final a81.t c = new a81.t(0, "PENDING", false);

    public static final void A(y yVar, v71.z zVar) {
        v71.b0.z(zVar, null, null, new m7(yVar, (a71.c) null, 6), 3);
    }

    public static final z71.k B(j71.e eVar, i iVar) {
        int i = n0.a;
        return I(iVar, new c00.b(eVar, (a71.c) null));
    }

    public static final e C(i... iVarArr) {
        int i = n0.a;
        k71.k.g(iVarArr, "<this>");
        return new e((Iterable) (iVarArr.length == 0 ? x61.rShadow.r : new i81.h(2, iVarArr)), (a71.h) a71.i.r, -2, x71.a.r);
    }

    public static final y D(f8 f8Var, j71.e eVar) {
        return new y((i) f8Var, (j71.g) new in.h(eVar, (a71.c) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E(i iVar, c71.c cVar) {
        w0 w0Var;
        int i;
        k71.w wVar;
        Object obj;
        a81.t tVar = z71.b.b;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i2 = w0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w0Var.w = i2 - Integer.MIN_VALUE;
                Object obj2 = w0Var.v;
                b71.a aVar = b71.a.r;
                i = w0Var.w;
                if (i != 0) {
                    sy.y.j(obj2);
                    k71.w wVar2 = new k71.w();
                    wVar2.r = tVar;
                    o0 o0Var = new o0(wVar2, 2);
                    w0Var.u = wVar2;
                    w0Var.w = 1;
                    if (iVar.b(o0Var, w0Var) == aVar) {
                        return aVar;
                    }
                    wVar = wVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar = w0Var.u;
                    sy.y.j(obj2);
                }
                obj = wVar.r;
                if (obj == tVar) {
                    return obj;
                }
                throw new NoSuchElementException("Flow is empty");
            }
        }
        w0Var = new w0(cVar);
        Object obj22 = w0Var.v;
        b71.a aVar2 = b71.a.r;
        i = w0Var.w;
        if (i != 0) {
        }
        obj = wVar.r;
        if (obj == tVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(i iVar, a71.c cVar) {
        a71.c x0Var;
        int i;
        k71.w wVar;
        AbortFlowException e;
        o0 o0Var;
        Object obj;
        a81.t tVar = z71.b.b;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i2 = x0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x0Var.x = i2 - Integer.MIN_VALUE;
                Object obj2 = x0Var.w;
                Object obj3 = b71.a.r;
                i = x0Var.x;
                if (i != 0) {
                    sy.y.j(obj2);
                    k71.w wVar2 = new k71.w();
                    wVar2.r = tVar;
                    o0 o0Var2 = new o0(wVar2, 3);
                    try {
                        x0Var.u = wVar2;
                        x0Var.v = o0Var2;
                        x0Var.x = 1;
                        if (iVar.b(o0Var2, x0Var) == obj3) {
                            return obj3;
                        }
                        wVar = wVar2;
                    } catch (AbortFlowException e2) {
                        wVar = wVar2;
                        e = e2;
                        o0Var = o0Var2;
                        if (e.r == o0Var) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o0Var = x0Var.v;
                    wVar = x0Var.u;
                    try {
                        sy.y.j(obj2);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.r == o0Var) {
                            throw e;
                        }
                        a71.h hVar = ((c71.c) x0Var).s;
                        k71.k.d(hVar);
                        v71.b0.m(hVar);
                        obj = wVar.r;
                        if (obj == tVar) {
                        }
                    }
                }
                obj = wVar.r;
                if (obj == tVar) {
                    return null;
                }
                return obj;
            }
        }
        x0Var = new x0(cVar);
        Object obj22 = x0Var.w;
        Object obj32 = b71.a.r;
        i = x0Var.x;
        if (i != 0) {
        }
        obj = wVar.r;
        if (obj == tVar) {
        }
    }

    public static final i1 G(i iVar, v71.z zVar, r1 r1Var, Object obj) {
        y11.l n = n(iVar, 1);
        y1 c2 = c(obj);
        v71.b0.y(zVar, (a71.h) n.d, r1Var.equals(q1.a) ? v71.a0Shadow.r : v71.a0Shadow.u, new m7.x(r1Var, (i) n.b, c2, obj, (a71.c) null));
        return new i1(c2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(i iVar, ArrayList arrayList, c71.c cVar) {
        m mVar;
        int i;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i2 = mVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.w = i2 - Integer.MIN_VALUE;
                Object obj = mVar.v;
                b71.a aVar = b71.a.r;
                i = mVar.w;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ArrayList arrayList2 = mVar.u;
                    sy.y.j(obj);
                    return arrayList2;
                }
                sy.y.j(obj);
                a61.f0Shadow f0Var = new a61.f0Shadow(9, arrayList);
                mVar.u = arrayList;
                mVar.w = 1;
                return iVar.b(f0Var, mVar) == aVar ? aVar : arrayList;
            }
        }
        mVar = new m(cVar);
        Object obj2 = mVar.v;
        b71.a aVar2 = b71.a.r;
        i = mVar.w;
        if (i == 0) {
        }
    }

    public static final z71.k I(i iVar, j71.f fVar) {
        int i = n0.a;
        return new z71.k(fVar, iVar, a71.i.r, -2, x71.a.r);
    }

    public static final m1 a(int i, int i2, x71.a aVar) {
        if (i < 0) {
            throw new IllegalArgumentException(no.a.k("replay cannot be negative, but was ", i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(no.a.k("extraBufferCapacity cannot be negative, but was ", i2).toString());
        }
        if (i <= 0 && i2 <= 0 && aVar != x71.a.r) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new m1(i, i3, aVar);
    }

    public static /* synthetic */ m1 b(int i, int i2, x71.a aVar) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            aVar = x71.a.r;
        }
        return a(i3, i, aVar);
    }

    public static final y1 c(Object obj) {
        if (obj == null) {
            obj = z71.b.b;
        }
        return new y1(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(j jVar, Object obj, Object obj2, c71.c cVar) {
        f0 f0Var;
        int i;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i2 = f0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.w = i2 - Integer.MIN_VALUE;
                Object obj3 = f0Var.v;
                b71.a aVar = b71.a.r;
                i = f0Var.w;
                if (i != 0) {
                    sy.y.j(obj3);
                    f0Var.u = obj2;
                    f0Var.w = 1;
                    if (jVar.c(obj, f0Var) == aVar) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = f0Var.u;
                    sy.y.j(obj3);
                }
                throw new AbortFlowException(obj2);
            }
        }
        f0Var = new f0(cVar);
        Object obj32 = f0Var.v;
        b71.a aVar2 = b71.a.r;
        i = f0Var.w;
        if (i != 0) {
        }
        throw new AbortFlowException(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(e2 e2Var, j71.f fVar, Throwable th, c71.c cVar) {
        q qVar;
        int i;
        try {
            if (cVar instanceof q) {
                qVar = (q) cVar;
                int i2 = qVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    qVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = qVar.v;
                    b71.a aVar = b71.a.r;
                    i = qVar.w;
                    if (i != 0) {
                        sy.y.j(obj);
                        qVar.u = th;
                        qVar.w = 1;
                        if (fVar.f(e2Var, th, qVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = qVar.u;
                        sy.y.j(obj);
                    }
                    return w61.a0.a;
                }
            }
            if (i != 0) {
            }
            return w61.a0.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                sy.u.a(th2, th);
            }
            throw th2;
        }
        qVar = new q(cVar);
        Object obj2 = qVar.v;
        b71.a aVar2 = b71.a.r;
        i = qVar.w;
    }

    public static final void f(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static i g(i iVar, int i) {
        x71.a aVar = x71.a.r;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(no.a.k("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i).toString());
        }
        if (i == -1) {
            aVar = x71.a.s;
            i = 0;
        }
        int i2 = i;
        x71.a aVar2 = aVar;
        return iVar instanceof z71.r ? z71.b.b((z71.r) iVar, null, i2, aVar2, 1) : new z71.h(iVar, null, i2, aVar2, 2);
    }

    public static final c h(j71.e eVar) {
        return new c(eVar, a71.i.r, -2, x71.a.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable i(i iVar, j jVar, c71.c cVar) {
        a0 a0Var;
        int i;
        k71.w wVar;
        Throwable th;
        v71.d1 d1Var;
        CancellationException N;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i2 = a0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.w = i2 - Integer.MIN_VALUE;
                Object obj = a0Var.v;
                b71.a aVar = b71.a.r;
                i = a0Var.w;
                if (i != 0) {
                    sy.y.j(obj);
                    k71.w wVar2 = new k71.w();
                    try {
                        ga.l lVar = new ga.l(jVar, wVar2, 4);
                        a0Var.u = wVar2;
                        a0Var.w = 1;
                        if (iVar.b(lVar, a0Var) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        wVar = wVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar = a0Var.u;
                    try {
                        sy.y.j(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) wVar.r;
                if (th != null || !th.equals(th)) {
                    a71.h hVar = ((c71.c) a0Var).s;
                    k71.k.d(hVar);
                    d1Var = (v71.d1) hVar.w0(v71.w.s);
                    if (d1Var != null || !d1Var.isCancelled() || (N = d1Var.N()) == null || !N.equals(th)) {
                        if (th != null) {
                            return th;
                        }
                        if (th instanceof CancellationException) {
                            sy.u.a(th, th);
                            throw th;
                        }
                        sy.u.a(th, th);
                        throw th;
                    }
                }
                throw th;
            }
        }
        a0Var = new a0(cVar);
        Object obj2 = a0Var.v;
        b71.a aVar2 = b71.a.r;
        i = a0Var.w;
        if (i != 0) {
        }
        th = (Throwable) wVar.r;
        if (th != null) {
        }
        a71.h hVar2 = ((c71.c) a0Var).s;
        k71.k.d(hVar2);
        d1Var = (v71.d1) hVar2.w0(v71.w.s);
        if (d1Var != null) {
        }
        if (th != null) {
        }
    }

    public static final Object j(i iVar, a71.c cVar) {
        Object b2 = iVar.b(z71.t.r, cVar);
        return b2 == b71.a.r ? b2 : w61.a0.a;
    }

    public static final Object k(i iVar, j71.e eVar, c71.j jVar) {
        Object j = j(g(B(eVar, iVar), 0), jVar);
        return j == b71.a.r ? j : w61.a0.a;
    }

    public static final r3 l(i iVar, i iVar2, i iVar3, j71.g gVar) {
        return new r3(19, new i[]{iVar, iVar2, iVar3}, gVar);
    }

    public static final d1 m(i iVar, i iVar2, i iVar3, i iVar4, j71.h hVar) {
        return new d1(new i[]{iVar, iVar2, iVar3, iVar4}, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r4 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final y11.l n(i iVar, int i) {
        x71.l.p.getClass();
        int i2 = x71.k.b;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        if (iVar instanceof z71.d) {
            z71.d dVar = (z71.d) iVar;
            x71.a aVar = dVar.t;
            i f = dVar.f();
            if (f != null) {
                int i4 = dVar.s;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i3 = i4;
                } else if (aVar != x71.a.r) {
                    if (i == 0) {
                        i3 = 1;
                    }
                    i3 = 0;
                }
                return new y11.l(i3, dVar.r, aVar, f);
            }
        }
        return new y11.l(i3, a71.i.r, x71.a.r, iVar);
    }

    public static final i o(i iVar, long j) {
        if (j >= 0) {
            return j == 0 ? iVar : new f8(23, new p(new androidx.compose.runtime.e(8, j), iVar, null));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final i p(i iVar) {
        return ((iVar instanceof w1) || (iVar instanceof g)) ? iVar : new g(iVar);
    }

    public static final Object q(j jVar, i iVar, a71.c cVar) {
        s(jVar);
        Object b2 = iVar.b(jVar, cVar);
        return b2 == b71.a.r ? b2 : w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r2.c(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0046, B:34:0x0050), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(j jVar, x71.v vVar, boolean z, a71.c cVar) {
        l lVar;
        int i;
        x71.c it;
        x71.c cVar2;
        j jVar2;
        Object b2;
        try {
            if (cVar instanceof l) {
                lVar = (l) cVar;
                int i2 = lVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lVar.z = i2 - Integer.MIN_VALUE;
                    Object obj = lVar.y;
                    b71.a aVar = b71.a.r;
                    i = lVar.z;
                    if (i != 0) {
                        sy.y.j(obj);
                        s(jVar);
                        it = vVar.iterator();
                        lVar.u = jVar;
                        lVar.v = vVar;
                        lVar.w = it;
                        lVar.x = z;
                        lVar.z = 1;
                        b2 = it.b(lVar);
                        if (b2 != aVar) {
                        }
                    } else if (i == 1) {
                        z = lVar.x;
                        cVar2 = lVar.w;
                        vVar = lVar.v;
                        jVar2 = lVar.u;
                        sy.y.j(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = lVar.x;
                        cVar2 = lVar.w;
                        vVar = lVar.v;
                        jVar2 = lVar.u;
                        sy.y.j(obj);
                        it = cVar2;
                        jVar = jVar2;
                        lVar.u = jVar;
                        lVar.v = vVar;
                        lVar.w = it;
                        lVar.x = z;
                        lVar.z = 1;
                        b2 = it.b(lVar);
                        if (b2 != aVar) {
                            return aVar;
                        }
                        jVar2 = jVar;
                        cVar2 = it;
                        obj = b2;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                vVar.m(null);
                            }
                            return w61.a0.a;
                        }
                        Object c2 = cVar2.c();
                        lVar.u = jVar2;
                        lVar.v = vVar;
                        lVar.w = cVar2;
                        lVar.x = z;
                        lVar.z = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        lVar = new l(cVar);
        Object obj2 = lVar.y;
        b71.a aVar2 = b71.a.r;
        i = lVar.z;
    }

    public static final void s(j jVar) {
        if (jVar instanceof e2) {
            throw ((e2) jVar).r;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(i iVar, c71.c cVar) {
        a71.c r0Var;
        int i;
        k71.w wVar;
        AbortFlowException e;
        o0 o0Var;
        Object obj;
        a81.t tVar = z71.b.b;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i2 = r0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.x = i2 - Integer.MIN_VALUE;
                Object obj2 = r0Var.w;
                Object obj3 = b71.a.r;
                i = r0Var.x;
                if (i != 0) {
                    sy.y.j(obj2);
                    k71.w wVar2 = new k71.w();
                    wVar2.r = tVar;
                    o0 o0Var2 = new o0(wVar2, 0);
                    try {
                        r0Var.u = wVar2;
                        r0Var.v = o0Var2;
                        r0Var.x = 1;
                        if (iVar.b(o0Var2, r0Var) == obj3) {
                            return obj3;
                        }
                        wVar = wVar2;
                    } catch (AbortFlowException e2) {
                        wVar = wVar2;
                        e = e2;
                        o0Var = o0Var2;
                        if (e.r == o0Var) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o0Var = r0Var.v;
                    wVar = r0Var.u;
                    try {
                        sy.y.j(obj2);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.r == o0Var) {
                            throw e;
                        }
                        a71.h hVar = ((c71.c) r0Var).s;
                        k71.k.d(hVar);
                        v71.b0.m(hVar);
                        obj = wVar.r;
                        if (obj != tVar) {
                        }
                    }
                }
                obj = wVar.r;
                if (obj != tVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        r0Var = new r0(cVar);
        Object obj22 = r0Var.w;
        Object obj32 = b71.a.r;
        i = r0Var.x;
        if (i != 0) {
        }
        obj = wVar.r;
        if (obj != tVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(i iVar, j71.e eVar, c71.c cVar) {
        a71.c s0Var;
        int i;
        k71.w wVar;
        AbortFlowException e;
        q0 q0Var;
        Object obj;
        a81.t tVar = z71.b.b;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i2 = s0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s0Var.x = i2 - Integer.MIN_VALUE;
                Object obj2 = s0Var.w;
                Object obj3 = b71.a.r;
                i = s0Var.x;
                if (i != 0) {
                    sy.y.j(obj2);
                    k71.w wVar2 = new k71.w();
                    wVar2.r = tVar;
                    q0 q0Var2 = new q0(eVar, wVar2, 0);
                    try {
                        s0Var.u = wVar2;
                        s0Var.v = q0Var2;
                        s0Var.x = 1;
                        if (iVar.b(q0Var2, s0Var) == obj3) {
                            return obj3;
                        }
                        wVar = wVar2;
                    } catch (AbortFlowException e2) {
                        wVar = wVar2;
                        e = e2;
                        q0Var = q0Var2;
                        if (e.r == q0Var) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q0Var = s0Var.v;
                    wVar = s0Var.u;
                    try {
                        sy.y.j(obj2);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.r == q0Var) {
                            throw e;
                        }
                        a71.h hVar = ((c71.c) s0Var).s;
                        k71.k.d(hVar);
                        v71.b0.m(hVar);
                        obj = wVar.r;
                        if (obj != tVar) {
                        }
                    }
                }
                obj = wVar.r;
                if (obj != tVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate");
            }
        }
        s0Var = new s0(cVar);
        Object obj22 = s0Var.w;
        Object obj32 = b71.a.r;
        i = s0Var.x;
        if (i != 0) {
        }
        obj = wVar.r;
        if (obj != tVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(i iVar, a71.c cVar) {
        a71.c u0Var;
        int i;
        k71.w wVar;
        AbortFlowException e;
        o0 o0Var;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i2 = u0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0Var.x = i2 - Integer.MIN_VALUE;
                Object obj = u0Var.w;
                Object obj2 = b71.a.r;
                i = u0Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    k71.w wVar2 = new k71.w();
                    o0 o0Var2 = new o0(wVar2, 1);
                    try {
                        u0Var.u = wVar2;
                        u0Var.v = o0Var2;
                        u0Var.x = 1;
                        if (iVar.b(o0Var2, u0Var) == obj2) {
                            return obj2;
                        }
                        wVar = wVar2;
                    } catch (AbortFlowException e2) {
                        wVar = wVar2;
                        e = e2;
                        o0Var = o0Var2;
                        if (e.r == o0Var) {
                            throw e;
                        }
                        a71.h hVar = ((c71.c) u0Var).s;
                        k71.k.d(hVar);
                        v71.b0.m(hVar);
                        return wVar.r;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o0Var = u0Var.v;
                    wVar = u0Var.u;
                    try {
                        sy.y.j(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.r == o0Var) {
                        }
                    }
                }
                return wVar.r;
            }
        }
        u0Var = new u0(cVar);
        Object obj3 = u0Var.w;
        Object obj22 = b71.a.r;
        i = u0Var.x;
        if (i != 0) {
        }
        return wVar.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w(i1 i1Var, j71.e eVar, c71.c cVar) {
        v0 v0Var;
        int i;
        k71.w wVar;
        AbortFlowException e;
        q0 q0Var;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i2 = v0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0Var.x = i2 - Integer.MIN_VALUE;
                Object obj = v0Var.w;
                b71.a aVar = b71.a.r;
                i = v0Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    k71.w wVar2 = new k71.w();
                    q0 q0Var2 = new q0(eVar, wVar2, 1);
                    try {
                        v0Var.u = wVar2;
                        v0Var.v = q0Var2;
                        v0Var.x = 1;
                        if (i1Var.r.b(q0Var2, v0Var) == aVar) {
                            return aVar;
                        }
                        wVar = wVar2;
                    } catch (AbortFlowException e2) {
                        wVar = wVar2;
                        e = e2;
                        q0Var = q0Var2;
                        if (e.r == q0Var) {
                            throw e;
                        }
                        a71.h hVar = ((c71.c) v0Var).s;
                        k71.k.d(hVar);
                        v71.b0.m(hVar);
                        return wVar.r;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q0Var = v0Var.v;
                    wVar = v0Var.u;
                    try {
                        sy.y.j(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.r == q0Var) {
                        }
                    }
                }
                return wVar.r;
            }
        }
        v0Var = new v0(cVar);
        Object obj2 = v0Var.w;
        b71.a aVar2 = b71.a.r;
        i = v0Var.x;
        if (i != 0) {
        }
        return wVar.r;
    }

    public static final y00.l x(j71.e eVar, i iVar) {
        int i = n0.a;
        return new y00.l(new y(iVar, eVar, 5), 9);
    }

    public static final i y(i iVar, a71.h hVar) {
        if (hVar.w0(v71.w.s) == null) {
            return hVar.equals(a71.i.r) ? iVar : iVar instanceof z71.r ? z71.b.b((z71.r) iVar, hVar, 0, null, 6) : new z71.h(iVar, hVar, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + hVar).toString());
    }

    public static final i z(j1 j1Var, a71.h hVar, int i, x71.a aVar) {
        return ((i == 0 || i == -3) && aVar == x71.a.r) ? j1Var : new z71.h(i, hVar, aVar, j1Var);
    }

    public static Object l(Object... a) {
        return null;
    }
}
