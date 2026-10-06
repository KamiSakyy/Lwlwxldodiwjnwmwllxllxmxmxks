package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class z implements androidx.compose.runtime.tooling.c {

    /* renamed from: r, reason: collision with root package name */
    public w f1904r;

    public z(w wVar) {
        this.f1904r = wVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return k71.k.b(this.f1904r, ((z) obj).f1904r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1904r.hashCode() * 31;
    }
}
