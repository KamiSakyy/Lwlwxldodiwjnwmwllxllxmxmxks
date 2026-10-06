package da1;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f0 implements Cloneable {
    public b r;
    public d0 s;
    public e0 t;
    public i0 u;

    public f0(b bVar) {
        new ReentrantLock();
        this.r = bVar;
        this.t = e0.c;
        this.s = new d0(0, 0);
    }

    public final i0 a() {
        if (this.u == null) {
            this.r.getClass();
            this.u = new i0(i0.c);
        }
        return this.u;
    }

    public final Object clone() {
        return new f0(this);
    }

    public f0(f0 f0Var) {
        new ReentrantLock();
        f0Var.r.getClass();
        this.r = new b();
        f0Var.s.getClass();
        this.s = new d0(0, 0);
        e0 e0Var = f0Var.t;
        this.t = new e0(e0Var.a, e0Var.b);
    }
}
