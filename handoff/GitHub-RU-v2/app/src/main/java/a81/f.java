package a81;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v71.b0;
import v71.j0;
import v71.t1;
import v71.v0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f extends j0 implements c71.d, a71.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public v71.v u;
    public c71.c v;
    public Object w;
    public Object x;

    public f(v71.v vVar, c71.c cVar) {
        super(-1);
        this.u = vVar;
        this.v = cVar;
        this.w = b.b;
        this.x = b.m(cVar.q());
    }

    @Override // v71.j0
    public final a71.c c() {
        return this;
    }

    public final c71.d g() {
        return this.v;
    }

    public final void i(Object obj) {
        Throwable a = w61.n.a(obj);
        Object tVar = a == null ? obj : new v71.t(a, false);
        c71.c cVar = this.v;
        a71.h q = cVar.q();
        v71.v vVar = this.u;
        if (b.j(vVar, q)) {
            this.w = tVar;
            this.t = 0;
            b.i(vVar, cVar.q(), this);
            return;
        }
        v0 a2 = t1.a();
        if (a2.t >= 4294967296L) {
            this.w = tVar;
            this.t = 0;
            a2.O0(this);
            return;
        }
        a2.Q0(true);
        try {
            a71.h q2 = cVar.q();
            Object n = b.n(q2, this.x);
            try {
                cVar.i(obj);
                while (a2.S0()) {
                }
            } finally {
                b.g(q2, n);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // v71.j0
    public final Object j() {
        Object obj = this.w;
        this.w = b.b;
        return obj;
    }

    public final a71.h q() {
        return this.v.q();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.u + ", " + b0.H(this.v) + ']';
    }
}
