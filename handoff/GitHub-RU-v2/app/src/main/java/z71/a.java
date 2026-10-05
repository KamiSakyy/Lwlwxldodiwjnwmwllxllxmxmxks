package z71;

import java.util.Arrays;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class a {
    public c[] r;
    public int s;
    public int t;
    public z u;

    public final c d() {
        c cVar;
        z zVar;
        synchronized (this) {
            try {
                c[] cVarArr = this.r;
                if (cVarArr == null) {
                    cVarArr = f();
                    this.r = cVarArr;
                } else if (this.s >= cVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                    k71.k.f(copyOf, "copyOf(...)");
                    this.r = (c[]) copyOf;
                    cVarArr = (c[]) copyOf;
                }
                int i = this.t;
                do {
                    cVar = cVarArr[i];
                    if (cVar == null) {
                        cVar = e();
                        cVarArr[i] = cVar;
                    }
                    i++;
                    if (i >= cVarArr.length) {
                        i = 0;
                    }
                } while (!cVar.a(this));
                this.t = i;
                this.s++;
                zVar = this.u;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zVar != null) {
            zVar.x(1);
        }
        return cVar;
    }

    public abstract c e();

    public abstract c[] f();

    public final void g(c cVar) {
        z zVar;
        int i;
        a71.c[] b;
        synchronized (this) {
            try {
                int i2 = this.s - 1;
                this.s = i2;
                zVar = this.u;
                if (i2 == 0) {
                    this.t = 0;
                }
                k71.k.e(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b = cVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (a71.c cVar2 : b) {
            if (cVar2 != null) {
                cVar2.i(a0.a);
            }
        }
        if (zVar != null) {
            zVar.x(-1);
        }
    }

    public final z h() {
        z zVar;
        synchronized (this) {
            zVar = this.u;
            if (zVar == null) {
                int i = this.s;
                zVar = new z(1, Integer.MAX_VALUE, x71.a.s);
                zVar.m(Integer.valueOf(i));
                this.u = zVar;
            }
        }
        return zVar;
    }
}
