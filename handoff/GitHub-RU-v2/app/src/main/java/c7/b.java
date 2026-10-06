package c7;

import a0.s0;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4126a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4127b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4128c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4129d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4130e;

    public b(float f6, float f10, float f11, int i, long j10) {
        this.f4126a = i;
        this.f4127b = f6;
        this.f4128c = f10;
        this.f4129d = f11;
        this.f4130e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f4128c == bVar.f4128c && this.f4129d == bVar.f4129d && this.f4127b == bVar.f4127b && this.f4126a == bVar.f4126a && this.f4130e == bVar.f4130e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4130e) + s0.b(this.f4126a, x.i.b(x.i.b(Float.hashCode(this.f4128c) * 31, this.f4129d, 31), this.f4127b, 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f4128c + ", touchY=" + this.f4129d + ", progress=" + this.f4127b + ", swipeEdge=" + this.f4126a + ", frameTimeMillis=" + this.f4130e + ')';
    }
}
