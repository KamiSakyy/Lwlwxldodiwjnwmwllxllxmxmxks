package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class h1 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f99a;

    /* renamed from: b, reason: collision with root package name */
    public final long f100b;

    public h1(i2 i2Var, long j10) {
        this.f99a = i2Var;
        this.f100b = j10;
    }

    @Override // a0.i2
    public final boolean a() {
        return this.f99a.a();
    }

    @Override // a0.i2
    public final long b(u uVar, u uVar2, u uVar3) {
        return this.f99a.b(uVar, uVar2, uVar3) + this.f100b;
    }

    @Override // a0.i2
    public final u d(long j10, u uVar, u uVar2, u uVar3) {
        long j11 = this.f100b;
        return j10 < j11 ? uVar3 : this.f99a.d(j10 - j11, uVar, uVar2, uVar3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return h1Var.f100b == this.f100b && k71.k.b(h1Var.f99a, this.f99a);
    }

    @Override // a0.i2
    public final u h(long j10, u uVar, u uVar2, u uVar3) {
        long j11 = this.f100b;
        return j10 < j11 ? uVar : this.f99a.h(j10 - j11, uVar, uVar2, uVar3);
    }

    public final int hashCode() {
        return Long.hashCode(this.f100b) + (this.f99a.hashCode() * 31);
    }
}
