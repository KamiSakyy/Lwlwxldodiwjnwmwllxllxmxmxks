package androidx.compose.foundation.lazy.layout;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f1412a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1413b;

    /* renamed from: c, reason: collision with root package name */
    public final v f1414c;

    public j(int i, int i10, v vVar) {
        this.f1412a = i;
        this.f1413b = i10;
        this.f1414c = vVar;
        if (i < 0) {
            k0.b.a("startIndex should be >= 0");
        }
        if (i10 > 0) {
            return;
        }
        k0.b.a("size should be > 0");
    }
}
