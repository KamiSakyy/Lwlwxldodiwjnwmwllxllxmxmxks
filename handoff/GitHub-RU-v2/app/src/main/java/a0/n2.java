package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public f0 f169a;

    /* renamed from: b, reason: collision with root package name */
    public u f170b;

    /* renamed from: c, reason: collision with root package name */
    public u f171c;

    /* renamed from: d, reason: collision with root package name */
    public u f172d;

    /* renamed from: e, reason: collision with root package name */
    public float f173e;

    public n2(f0 f0Var) {
        this.f169a = f0Var;
        this.f173e = f0Var.a();
    }

    public final u a(long j10, u uVar, u uVar2) {
        if (this.f171c == null) {
            this.f171c = uVar.c();
        }
        u uVar3 = this.f171c;
        if (uVar3 == null) {
            k71.k.m("velocityVector");
            throw null;
        }
        int b10 = uVar3.b();
        for (int i = 0; i < b10; i++) {
            u uVar4 = this.f171c;
            if (uVar4 == null) {
                k71.k.m("velocityVector");
                throw null;
            }
            uVar.getClass();
            uVar4.e(i, this.f169a.e(uVar2.a(i), j10));
        }
        u uVar5 = this.f171c;
        if (uVar5 != null) {
            return uVar5;
        }
        k71.k.m("velocityVector");
        throw null;
    }
}
