package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class r2 implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f234a;

    /* renamed from: b, reason: collision with root package name */
    public final k2 f235b;

    /* renamed from: c, reason: collision with root package name */
    public final b1 f236c;

    /* renamed from: d, reason: collision with root package name */
    public final long f237d;

    /* renamed from: e, reason: collision with root package name */
    public final long f238e;

    public r2(int i, k2 k2Var, b1 b1Var, long j10) {
        this.f234a = i;
        this.f235b = k2Var;
        this.f236c = b1Var;
        if (i < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.f237d = (k2Var.k() + k2Var.j()) * 1000000;
        this.f238e = j10 * 1000000;
    }

    @Override // a0.i2
    public final long b(u uVar, u uVar2, u uVar3) {
        return (this.f234a * this.f237d) - this.f238e;
    }

    public final long c(long j10) {
        long j11 = this.f238e;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f237d;
        long min = Math.min(j12 / j13, this.f234a - 1);
        return (this.f236c == b1.f21r || min % ((long) 2) == 0) ? j12 - (min * j13) : ((min + 1) * j13) - j12;
    }

    @Override // a0.i2
    public final u d(long j10, u uVar, u uVar2, u uVar3) {
        return this.f235b.d(c(j10), uVar, uVar2, e(j10, uVar, uVar3, uVar2));
    }

    public final u e(long j10, u uVar, u uVar2, u uVar3) {
        long j11 = this.f238e;
        long j12 = j10 + j11;
        long j13 = this.f237d;
        return j12 > j13 ? d(j13 - j11, uVar, uVar2, uVar3) : uVar2;
    }

    @Override // a0.i2
    public final u h(long j10, u uVar, u uVar2, u uVar3) {
        return this.f235b.h(c(j10), uVar, uVar2, e(j10, uVar, uVar3, uVar2));
    }
}
