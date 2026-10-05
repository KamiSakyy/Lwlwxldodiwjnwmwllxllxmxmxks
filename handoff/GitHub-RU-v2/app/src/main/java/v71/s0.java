package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class s0 implements Runnable, Comparable, n0 {
    private volatile Object _heap;
    public long r;
    public int s = -1;

    public s0(long j) {
        this.r = j;
    }

    @Override // v71.n0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                a81.t tVar = b0.b;
                if (obj == tVar) {
                    return;
                }
                t0 t0Var = obj instanceof t0 ? (t0) obj : null;
                if (t0Var != null) {
                    synchronized (t0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof a81.x ? (a81.x) obj2 : null) != null) {
                            t0Var.b(this.s);
                        }
                    }
                }
                this._heap = tVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j, t0 t0Var, u0 u0Var) {
        synchronized (this) {
            if (this._heap == b0.b) {
                return 2;
            }
            synchronized (t0Var) {
                try {
                    s0[] s0VarArr = t0Var.a;
                    s0 s0Var = s0VarArr != null ? s0VarArr[0] : null;
                    if (u0.z.get(u0Var) == 1) {
                        return 1;
                    }
                    if (s0Var == null) {
                        t0Var.c = j;
                    } else {
                        long j2 = s0Var.r;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - t0Var.c > 0) {
                            t0Var.c = j;
                        }
                    }
                    long j3 = this.r;
                    long j4 = t0Var.c;
                    if (j3 - j4 < 0) {
                        this.r = j4;
                    }
                    t0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.r - ((s0) obj).r;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(t0 t0Var) {
        if (this._heap == b0.b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = t0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.r + ']';
    }
}
