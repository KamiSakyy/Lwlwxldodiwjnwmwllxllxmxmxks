package androidx.compose.foundation.layout;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1156a;

    @Override // androidx.compose.foundation.layout.k
    public final void c(s3.c cVar, int i, int[] iArr, int[] iArr2) {
        switch (this.f1156a) {
            case k5.f.J:
                l.c(i, iArr, iArr2, false);
                break;
            default:
                l.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f1156a) {
            case k5.f.J:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
