package h91;

import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r extends m0 {
    public m0 e;

    public r(m0 m0Var) {
        k71.k.g(m0Var, "delegate");
        this.e = m0Var;
    }

    @Override // h91.m0
    public final m0 a() {
        return this.e.a();
    }

    @Override // h91.m0
    public final m0 b() {
        return this.e.b();
    }

    @Override // h91.m0
    public final long c() {
        return this.e.c();
    }

    @Override // h91.m0
    public final m0 d(long j) {
        return this.e.d(j);
    }

    @Override // h91.m0
    public final boolean e() {
        return this.e.e();
    }

    @Override // h91.m0
    public final void f() {
        this.e.f();
    }

    @Override // h91.m0
    public final m0 g(long j, TimeUnit timeUnit) {
        k71.k.g(timeUnit, "unit");
        return this.e.g(j, timeUnit);
    }

    @Override // h91.m0
    public final long h() {
        return this.e.h();
    }
}
