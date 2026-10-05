package fa1;

import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o implements e {
    public final Executor r;
    public final e s;

    public o(Executor executor, e eVar) {
        this.r = executor;
        this.s = eVar;
    }

    @Override // fa1.e
    public final void cancel() {
        this.s.cancel();
    }

    @Override // fa1.e
    public final boolean f() {
        return this.s.f();
    }

    @Override // fa1.e
    public final void m(h hVar) {
        this.s.m(new e51.a(4, this, hVar));
    }

    @Override // fa1.e
    public final androidx.lifecycle.b t() {
        return this.s.t();
    }

    @Override // fa1.e
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final e m0clone() {
        return new o(this.r, this.s.m0clone());
    }














}
