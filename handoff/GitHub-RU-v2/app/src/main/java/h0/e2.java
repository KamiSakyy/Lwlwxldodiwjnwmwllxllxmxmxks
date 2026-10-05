package h0;

/* loaded from: /home/user/work/p/classes.dex */
public final class e2 implements s3.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s3.c f24972r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24973s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f24974t;

    /* renamed from: u, reason: collision with root package name */
    public final e81.c f24975u = new e81.c(false);

    public e2(s3.c cVar) {
        this.f24972r = cVar;
    }

    @Override // s3.c
    public final float E(int i) {
        return this.f24972r.E(i);
    }

    @Override // s3.c
    public final float H(float f6) {
        return this.f24972r.H(f6);
    }

    @Override // s3.c
    public final float Q() {
        return this.f24972r.Q();
    }

    @Override // s3.c
    public final float W(float f6) {
        return this.f24972r.W(f6);
    }

    @Override // s3.c
    public final float b() {
        return this.f24972r.b();
    }

    public final void c() {
        this.f24974t = true;
        e81.c cVar = this.f24975u;
        if (cVar.d()) {
            cVar.f((Object) null);
        }
    }

    public final void d() {
        this.f24973s = true;
        e81.c cVar = this.f24975u;
        if (cVar.d()) {
            cVar.f((Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(c71.c cVar) {
        c2 c2Var;
        int i;
        if (cVar instanceof c2) {
            c2Var = (c2) cVar;
            int i10 = c2Var.f24933w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2Var.f24933w = i10 - Integer.MIN_VALUE;
                Object obj = c2Var.f24931u;
                b71.a aVar = b71.a.r;
                i = c2Var.f24933w;
                if (i != 0) {
                    sy.y.j(obj);
                    c2Var.f24933w = 1;
                    if (this.f24975u.m(c2Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                this.f24973s = false;
                this.f24974t = false;
                return w61.a0.a;
            }
        }
        c2Var = new c2(this, cVar);
        Object obj2 = c2Var.f24931u;
        b71.a aVar2 = b71.a.r;
        i = c2Var.f24933w;
        if (i != 0) {
        }
        this.f24973s = false;
        this.f24974t = false;
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(c71.c cVar) {
        d2 d2Var;
        int i;
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i10 = d2Var.f24955w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d2Var.f24955w = i10 - Integer.MIN_VALUE;
                Object obj = d2Var.f24953u;
                b71.a aVar = b71.a.r;
                i = d2Var.f24955w;
                e81.c cVar2 = this.f24975u;
                if (i != 0) {
                    sy.y.j(obj);
                    if (!this.f24973s && !this.f24974t) {
                        d2Var.f24955w = 1;
                        if (cVar2.m(d2Var) == aVar) {
                            return aVar;
                        }
                    }
                    return Boolean.valueOf(this.f24973s);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                cVar2.f((Object) null);
                return Boolean.valueOf(this.f24973s);
            }
        }
        d2Var = new d2(this, cVar);
        Object obj2 = d2Var.f24953u;
        b71.a aVar2 = b71.a.r;
        i = d2Var.f24955w;
        e81.c cVar22 = this.f24975u;
        if (i != 0) {
        }
        cVar22.f((Object) null);
        return Boolean.valueOf(this.f24973s);
    }

    @Override // s3.c
    public final int i0(float f6) {
        return this.f24972r.i0(f6);
    }

    @Override // s3.c
    public final long m(float f6) {
        return this.f24972r.m(f6);
    }

    @Override // s3.c
    public final long n(long j10) {
        return this.f24972r.n(j10);
    }

    @Override // s3.c
    public final long r0(long j10) {
        return this.f24972r.r0(j10);
    }

    @Override // s3.c
    public final float s(long j10) {
        return this.f24972r.s(j10);
    }

    @Override // s3.c
    public final float u0(long j10) {
        return this.f24972r.u0(j10);
    }

    @Override // s3.c
    public final long z(float f6) {
        return this.f24972r.z(f6);
    }
}
