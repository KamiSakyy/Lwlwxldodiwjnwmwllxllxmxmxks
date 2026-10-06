package y71;

import com.google.android.gms.internal.measurement.b4;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes5.dex */
public class m1 extends z71.a implements f1, i, z71.r {
    public long A;
    public int B;
    public int C;
    public int v;
    public int w;
    public x71.a x;
    public Object[] y;
    public long z;

    public m1(int i, int i2, x71.a aVar) {
        this.v = i;
        this.w = i2;
        this.x = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:47|48))(1:49)|12|13|14|15|(3:16|(3:38|39|(3:41|42|43)(1:44))(4:18|(1:23)|32|(2:34|35)(1:36))|37))(4:50|51|52|53)|29|30)(5:59|60|61|(2:63|(1:65))|67)|54|55|15|(3:16|(0)(0)|37)))|70|6|(0)(0)|54|55|15|(3:16|(0)(0)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        throw r2.N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(m1 m1Var, j jVar, a71.c cVar) {
        l1 l1Var;
        int i;
        m1 m1Var2;
        Throwable th;
        o1 o1Var;
        j jVar2;
        v71.d1 d1Var;
        Object u;
        v71.d1 d1Var2;
        j jVar3;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i2 = l1Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l1Var.A = i2 - Integer.MIN_VALUE;
                Object obj = l1Var.y;
                b71.a aVar = b71.a.r;
                i = l1Var.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            d1Var2 = l1Var.x;
                            o1Var = l1Var.w;
                            jVar3 = l1Var.v;
                            m1Var2 = l1Var.u;
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d1Var2 = l1Var.x;
                            o1Var = l1Var.w;
                            jVar3 = l1Var.v;
                            m1Var2 = l1Var.u;
                        }
                        try {
                            sy.y.j(obj);
                            jVar2 = jVar3;
                            d1Var = d1Var2;
                            m1Var = m1Var2;
                            while (true) {
                                u = m1Var.u(o1Var);
                                if (u == n1Shadow.a) {
                                    l1Var.u = m1Var;
                                    l1Var.v = jVar2;
                                    l1Var.w = o1Var;
                                    l1Var.x = d1Var;
                                    l1Var.A = 2;
                                    if (m1Var.i(o1Var, l1Var) == aVar) {
                                        return;
                                    }
                                } else {
                                    if (d1Var != null && !d1Var.f()) {
                                        break;
                                    }
                                    l1Var.u = m1Var;
                                    l1Var.v = jVar2;
                                    l1Var.w = o1Var;
                                    l1Var.x = d1Var;
                                    l1Var.A = 3;
                                    if (jVar2.c(u, l1Var) == aVar) {
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        o1Var = l1Var.w;
                        j jVar4 = l1Var.v;
                        m1 m1Var3 = l1Var.u;
                        try {
                            sy.y.j(obj);
                            jVar2 = jVar4;
                            m1Var = m1Var3;
                        } catch (Throwable th3) {
                            th = th3;
                            m1Var2 = m1Var3;
                        }
                    }
                    m1Var2.g(o1Var);
                    throw th;
                }
                sy.y.j(obj);
                o1 o1Var2 = (o1) m1Var.d();
                try {
                    if (jVar instanceof b2) {
                        l1Var.u = m1Var;
                        l1Var.v = jVar;
                        l1Var.w = o1Var2;
                        l1Var.A = 1;
                        if (((b2) jVar).a(l1Var) == aVar) {
                            return;
                        }
                    }
                    jVar2 = jVar;
                    o1Var = o1Var2;
                } catch (Throwable th4) {
                    m1Var2 = m1Var;
                    th = th4;
                    o1Var = o1Var2;
                }
                a71.h hVar = ((c71.c) l1Var).s;
                k71.k.d(hVar);
                d1Var = (v71.d1) hVar.w0(v71.w.s);
                while (true) {
                    u = m1Var.u(o1Var);
                    if (u == n1Shadow.a) {
                    }
                }
            }
        }
        l1Var = new l1(m1Var, cVar);
        Object obj2 = l1Var.y;
        b71.a aVar2 = b71.a.r;
        i = l1Var.A;
        if (i == 0) {
        }
        a71.h hVar2 = ((c71.c) l1Var).s;
        k71.k.d(hVar2);
        d1Var = (v71.d1) hVar2.w0(v71.w.s);
        while (true) {
            u = m1Var.u(o1Var);
            if (u == n1Shadow.a) {
            }
        }
    }

    @Override // z71.r
    public final i a(a71.h hVar, int i, x71.a aVar) {
        return n1.z(this, hVar, i, aVar);
    }

    @Override // y71.i
    public final Object b(j jVar, a71.c cVar) {
        k(this, jVar, cVar);
        return b71.a.r;
    }

    @Override // y71.j
    public final Object c(Object obj, a71.c cVar) {
        Throwable th;
        a71.c[] p;
        k1 k1Var;
        if (m(obj)) {
            return w61.a0.a;
        }
        v71.l lVar = new v71.l(1, b4.T(cVar));
        lVar.t();
        a71.c[] cVarArr = z71.b.a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        lVar.i(w61.a0.a);
                        p = p(cVarArr);
                        k1Var = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        k1 k1Var2 = new k1(this, q() + this.B + this.C, obj, lVar);
                        o(k1Var2);
                        this.C++;
                        if (this.w == 0) {
                            cVarArr = p(cVarArr);
                        }
                        p = cVarArr;
                        k1Var = k1Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (k1Var != null) {
                    lVar.w(new v71.i(2, k1Var));
                }
                for (a71.c cVar2 : p) {
                    if (cVar2 != null) {
                        cVar2.i(w61.a0.a);
                    }
                }
                Object s = lVar.s();
                b71.a aVar = b71.a.r;
                if (s != aVar) {
                    s = w61.a0.a;
                }
                return s == aVar ? s : w61.a0.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // z71.a
    public final z71.c e() {
        o1 o1Var = new o1();
        o1Var.a = -1L;
        return o1Var;
    }

    @Override // z71.a
    public final z71.c[] f() {
        return new o1[2];
    }

    public final Object i(o1 o1Var, l1 l1Var) {
        v71.l lVar = new v71.l(1, b4.T(l1Var));
        lVar.t();
        synchronized (this) {
            try {
                if (t(o1Var) < 0) {
                    o1Var.b = lVar;
                } else {
                    lVar.i(w61.a0.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object s = lVar.s();
        return s == b71.a.r ? s : w61.a0.a;
    }

    public final void j() {
        if (this.w != 0 || this.C > 1) {
            Object[] objArr = this.y;
            k71.k.d(objArr);
            while (this.C > 0) {
                long q = q();
                int i = this.B;
                int i2 = this.C;
                if (objArr[((int) ((q + (i + i2)) - 1)) & (objArr.length - 1)] != n1Shadow.a) {
                    return;
                }
                this.C = i2 - 1;
                n1.f(objArr, q() + this.B + this.C, null);
            }
        }
    }

    @Override // y71.f1
    public final void l() {
        synchronized (this) {
            try {
                try {
                    v(q() + this.B, this.A, q() + this.B, q() + this.B + this.C);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // y71.f1
    public final boolean m(Object obj) {
        int i;
        boolean z;
        a71.c[] cVarArr = z71.b.a;
        synchronized (this) {
            if (s(obj)) {
                cVarArr = p(cVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (a71.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.i(w61.a0.a);
            }
        }
        return z;
    }

    public final void n() {
        z71.c[] cVarArr;
        Object[] objArr = this.y;
        k71.k.d(objArr);
        n1.f(objArr, q(), null);
        this.B--;
        long q = q() + 1;
        if (this.z < q) {
            this.z = q;
        }
        if (this.A < q) {
            if (this.s != 0 && (cVarArr = this.r) != null) {
                for (z71.c cVar : cVarArr) {
                    if (cVar != null) {
                        o1 o1Var = (o1) cVar;
                        long j = o1Var.a;
                        if (j >= 0 && j < q) {
                            o1Var.a = q;
                        }
                    }
                }
            }
            this.A = q;
        }
    }

    public final void o(Object obj) {
        int i = this.B + this.C;
        Object[] objArr = this.y;
        if (objArr == null) {
            objArr = r(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = r(objArr, i, objArr.length * 2);
        }
        n1.f(objArr, q() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final a71.c[] p(a71.c[] cVarArr) {
        z71.c[] cVarArr2;
        o1 o1Var;
        v71.l lVar;
        int length = cVarArr.length;
        if (this.s != 0 && (cVarArr2 = this.r) != null) {
            int length2 = cVarArr2.length;
            int i = 0;
            cVarArr = cVarArr;
            while (i < length2) {
                z71.c cVar = cVarArr2[i];
                if (cVar != null && (lVar = (o1Var = (o1) cVar).b) != null && t(o1Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        Object copyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        k71.k.f((Object) copyOf, "copyOf(...)");
                        cVarArr = copyOf;
                    }
                    cVarArr[length] = lVar;
                    o1Var.b = null;
                    length++;
                }
                i++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long q() {
        return Math.min(this.A, this.z);
    }

    public final Object[] r(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.y = objArr2;
        if (objArr != null) {
            long q = q();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + q;
                n1.f(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean s(Object obj) {
        int i = this.s;
        int i2 = this.v;
        if (i != 0) {
            int i3 = this.B;
            int i4 = this.w;
            if (i3 >= i4 && this.A <= this.z) {
                int ordinal = this.x.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            o(obj);
            int i5 = this.B + 1;
            this.B = i5;
            if (i5 > i4) {
                n();
            }
            long q = q() + this.B;
            long j = this.z;
            if (((int) (q - j)) > i2) {
                v(1 + j, this.A, q() + this.B, q() + this.B + this.C);
            }
        } else if (i2 != 0) {
            o(obj);
            int i6 = this.B + 1;
            this.B = i6;
            if (i6 > i2) {
                n();
            }
            this.A = q() + this.B;
            return true;
        }
        return true;
    }

    public final long t(o1 o1Var) {
        long j = o1Var.a;
        if (j < q() + this.B) {
            return j;
        }
        if (this.w <= 0 && j <= q() && this.C != 0) {
            return j;
        }
        return -1L;
    }

    public final Object u(o1 o1Var) {
        Object obj;
        a71.c[] cVarArr = z71.b.a;
        synchronized (this) {
            try {
                long t = t(o1Var);
                if (t < 0) {
                    obj = n1Shadow.a;
                } else {
                    long j = o1Var.a;
                    Object[] objArr = this.y;
                    k71.k.d(objArr);
                    Object obj2 = objArr[((int) t) & (objArr.length - 1)];
                    if (obj2 instanceof k1) {
                        obj2 = ((k1) obj2).t;
                    }
                    o1Var.a = t + 1;
                    Object obj3 = obj2;
                    cVarArr = w(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (a71.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.i(w61.a0.a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long q = q(); q < min; q++) {
            Object[] objArr = this.y;
            k71.k.d(objArr);
            n1.f(objArr, q, null);
        }
        this.z = j;
        this.A = j2;
        this.B = (int) (j3 - min);
        this.C = (int) (j4 - j3);
    }

    public final a71.c[] w(long j) {
        long j2;
        long j3;
        long j4;
        a71.c[] cVarArr;
        a71.c[] cVarArr2;
        z71.c[] cVarArr3;
        a81.t tVar = n1Shadow.a;
        a71.c[] cVarArr4 = z71.b.a;
        if (j <= this.A) {
            long q = q();
            long j5 = this.B + q;
            int i = this.w;
            if (i == 0 && this.C > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.s != 0 && (cVarArr3 = this.r) != null) {
                for (z71.c cVar : cVarArr3) {
                    if (cVar != null) {
                        long j6 = ((o1) cVar).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.A) {
                long q2 = q() + this.B;
                int min = this.s > 0 ? Math.min(this.C, i - ((int) (q2 - j5))) : this.C;
                long j7 = this.C + q2;
                if (min > 0) {
                    j4 = 1;
                    Object[] objArr = this.y;
                    k71.k.d(objArr);
                    j2 = q;
                    a71.c[] cVarArr5 = new a71.c[min];
                    long j8 = q2;
                    while (true) {
                        if (q2 >= j7) {
                            cVarArr2 = cVarArr5;
                            j3 = j5;
                            break;
                        }
                        cVarArr2 = cVarArr5;
                        Object obj = objArr[(objArr.length - 1) & ((int) q2)];
                        if (obj != tVar) {
                            k71.k.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            k1 k1Var = (k1) obj;
                            int i3 = i2 + 1;
                            j3 = j5;
                            cVarArr2[i2] = k1Var.u;
                            n1.f(objArr, q2, tVar);
                            n1.f(objArr, j8, k1Var.t);
                            j8++;
                            if (i3 >= min) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            j3 = j5;
                        }
                        q2++;
                        cVarArr5 = cVarArr2;
                        j5 = j3;
                    }
                    q2 = j8;
                    cVarArr = cVarArr2;
                } else {
                    j2 = q;
                    j3 = j5;
                    j4 = 1;
                    cVarArr = cVarArr4;
                }
                int i4 = (int) (q2 - j2);
                long j9 = this.s == 0 ? q2 : j3;
                long max = Math.max(this.z, q2 - Math.min(this.v, i4));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.y;
                    k71.k.d(objArr2);
                    if (k71.k.b(objArr2[((int) max) & (objArr2.length - 1)], tVar)) {
                        q2 += j4;
                        max += j4;
                    }
                }
                v(max, j9, q2, j7);
                j();
                return cVarArr.length == 0 ? cVarArr : p(cVarArr);
            }
        }
        return cVarArr4;
    }
}
