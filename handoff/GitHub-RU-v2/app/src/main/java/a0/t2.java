package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class t2 implements l2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2 f256a;

    public t2(float f6, float f10, u uVar) {
        int[] iArr = j2.f126a;
        this.f256a = new m2(uVar != null ? new y51.c(f6, f10, uVar) : new y51.c(f6, f10));
    }

    @Override // a0.l2, a0.i2
    public final boolean a() {
        this.f256a.getClass();
        return false;
    }

    @Override // a0.i2
    public final long b(u uVar, u uVar2, u uVar3) {
        return this.f256a.b(uVar, uVar2, uVar3);
    }

    @Override // a0.i2
    public final u d(long j10, u uVar, u uVar2, u uVar3) {
        return this.f256a.d(j10, uVar, uVar2, uVar3);
    }

    @Override // a0.i2
    public final u g(u uVar, u uVar2, u uVar3) {
        return this.f256a.g(uVar, uVar2, uVar3);
    }

    @Override // a0.i2
    public final u h(long j10, u uVar, u uVar2, u uVar3) {
        return this.f256a.h(j10, uVar, uVar2, uVar3);
    }
}
