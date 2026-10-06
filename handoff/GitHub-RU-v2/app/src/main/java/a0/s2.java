package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class s2 implements k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f246a;

    public s2(int i) {
        this.f246a = i;
    }

    @Override // a0.i2
    public final u d(long j10, u uVar, u uVar2, u uVar3) {
        return uVar3;
    }

    @Override // a0.i2
    public final u h(long j10, u uVar, u uVar2, u uVar3) {
        return j10 < ((long) this.f246a) * 1000000 ? uVar : uVar2;
    }

    @Override // a0.k2
    public final int j() {
        return this.f246a;
    }

    @Override // a0.k2
    public final int k() {
        return 0;
    }
}
