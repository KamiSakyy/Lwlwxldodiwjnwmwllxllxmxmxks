package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1766b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1765a = i;
        this.f1766b = obj;
    }

    public final void a() {
        switch (this.f1765a) {
            case k5.f.J /* 0 */:
                s sVar = (s) this.f1766b;
                sVar.A--;
                break;
            default:
                v1.u uVar = (v1.u) this.f1766b;
                uVar.f32420k--;
                break;
        }
    }

    public final void b() {
        switch (this.f1765a) {
            case k5.f.J /* 0 */:
                ((s) this.f1766b).A++;
                break;
            default:
                ((v1.u) this.f1766b).f32420k++;
                break;
        }
    }
}
