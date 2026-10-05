package g1;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final o8.a f24456a;

    /* renamed from: b, reason: collision with root package name */
    public final e f24457b;

    public f(o8.a aVar, e eVar) {
        this.f24456a = aVar;
        this.f24457b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.b(this.f24456a, fVar.f24456a) && k.b(this.f24457b, fVar.f24457b);
    }

    public final int hashCode() {
        return this.f24457b.hashCode() + (this.f24456a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.f24456a + ", windowPosture=" + this.f24457b + ')';
    }
}
