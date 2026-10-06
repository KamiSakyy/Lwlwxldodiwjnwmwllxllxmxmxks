package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class d0 extends y1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1589b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(j71.a aVar) {
        super(aVar);
        i iVar = i.f1673x;
        this.f1590c = iVar;
    }

    @Override // androidx.compose.runtime.y1
    public final z1 a(Object obj) {
        switch (this.f1589b) {
            case k5.f.J:
                return new z1(this, obj, obj == null, null, true);
            default:
                return new z1(this, obj, obj == null, (a3) this.f1590c, true);
        }
    }

    @Override // androidx.compose.runtime.y1
    public m3 b() {
        switch (this.f1589b) {
            case k5.f.J:
                return (e0) this.f1590c;
            default:
                return super.b();
        }
    }

    public d0(j71.c cVar) {
        super(new a0.c2(3));
        this.f1590c = new e0(cVar);
    }

}
