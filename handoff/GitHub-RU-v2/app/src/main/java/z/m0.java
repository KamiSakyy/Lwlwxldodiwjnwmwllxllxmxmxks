package z;

/* loaded from: /home/user/work/p/classes.dex */
public final class m0 extends k71.l implements j71.c {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f34429s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j71.c f34430t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i, j71.c cVar) {
        super(1);
        this.f34429s = i;
        this.f34430t = cVar;
    }

    public final Object k(Object obj) {
        switch (this.f34429s) {
            case k5.f.J /* 0 */:
                return new s3.j((((Number) this.f34430t.k(Integer.valueOf((int) (((s3.l) obj).f31703a >> 32)))).intValue() << 32) | (0 & 4294967295L));
            case 1:
                return new s3.j((0 << 32) | (4294967295L & ((Number) this.f34430t.k(Integer.valueOf((int) (((s3.l) obj).f31703a & 4294967295L)))).intValue()));
            case 2:
                return new s3.j((((Number) this.f34430t.k(Integer.valueOf((int) (((s3.l) obj).f31703a >> 32)))).intValue() << 32) | (0 & 4294967295L));
            default:
                return new s3.j((0 << 32) | (4294967295L & ((Number) this.f34430t.k(Integer.valueOf((int) (((s3.l) obj).f31703a & 4294967295L)))).intValue()));
        }
    }
}
