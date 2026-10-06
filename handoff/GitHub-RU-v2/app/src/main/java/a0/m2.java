package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class m2 implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public y51.c f154a;

    /* renamed from: b, reason: collision with root package name */
    public u f155b;

    /* renamed from: c, reason: collision with root package name */
    public u f156c;

    /* renamed from: d, reason: collision with root package name */
    public u f157d;

    public m2(y51.c cVar) {
        this.f154a = cVar;
    }

    @Override // a0.i2
    public final long b(u uVar, u uVar2, u uVar3) {
        int b10 = uVar.b();
        long j10 = 0;
        for (int i = 0; i < b10; i++) {
            j10 = Math.max(j10, this.f154a.l(i).b(uVar.a(i), uVar2.a(i), uVar3.a(i)));
        }
        return j10;
    }

    @Override // a0.i2
    public final u d(long j10, u uVar, u uVar2, u uVar3) {
        if (this.f156c == null) {
            this.f156c = uVar3.c();
        }
        u uVar4 = this.f156c;
        if (uVar4 == null) {
            k71.k.m("velocityVector");
            throw null;
        }
        int b10 = uVar4.b();
        for (int i = 0; i < b10; i++) {
            u uVar5 = this.f156c;
            if (uVar5 == null) {
                k71.k.m("velocityVector");
                throw null;
            }
            uVar5.e(i, this.f154a.l(i).c(uVar.a(i), uVar2.a(i), uVar3.a(i), j10));
        }
        u uVar6 = this.f156c;
        if (uVar6 != null) {
            return uVar6;
        }
        k71.k.m("velocityVector");
        throw null;
    }

    @Override // a0.i2
    public final u g(u uVar, u uVar2, u uVar3) {
        if (this.f157d == null) {
            this.f157d = uVar3.c();
        }
        u uVar4 = this.f157d;
        if (uVar4 == null) {
            k71.k.m("endVelocityVector");
            throw null;
        }
        int b10 = uVar4.b();
        for (int i = 0; i < b10; i++) {
            u uVar5 = this.f157d;
            if (uVar5 == null) {
                k71.k.m("endVelocityVector");
                throw null;
            }
            uVar5.e(i, this.f154a.l(i).d(uVar.a(i), uVar2.a(i), uVar3.a(i)));
        }
        u uVar6 = this.f157d;
        if (uVar6 != null) {
            return uVar6;
        }
        k71.k.m("endVelocityVector");
        throw null;
    }

    @Override // a0.i2
    public final u h(long j10, u uVar, u uVar2, u uVar3) {
        if (this.f155b == null) {
            this.f155b = uVar.c();
        }
        u uVar4 = this.f155b;
        if (uVar4 == null) {
            k71.k.m("valueVector");
            throw null;
        }
        int b10 = uVar4.b();
        for (int i = 0; i < b10; i++) {
            u uVar5 = this.f155b;
            if (uVar5 == null) {
                k71.k.m("valueVector");
                throw null;
            }
            uVar5.e(i, this.f154a.l(i).e(uVar.a(i), uVar2.a(i), uVar3.a(i), j10));
        }
        u uVar6 = this.f155b;
        if (uVar6 != null) {
            return uVar6;
        }
        k71.k.m("valueVector");
        throw null;
    }

    public m2(e0 e0Var) {
        this(new y51.c(4, e0Var));
    }
}
