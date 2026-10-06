package d;

import android.os.Build;
import android.window.BackEvent;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f20875a;

    /* renamed from: b, reason: collision with root package name */
    public float f20876b;

    /* renamed from: c, reason: collision with root package name */
    public float f20877c;

    /* renamed from: d, reason: collision with root package name */
    public int f20878d;

    /* renamed from: e, reason: collision with root package name */
    public long f20879e;

    public a(float f6, float f10, float f11, int i, long j10) {
        this.f20875a = f6;
        this.f20876b = f10;
        this.f20877c = f11;
        this.f20878d = i;
        this.f20879e = j10;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f20875a + ", touchY=" + this.f20876b + ", progress=" + this.f20877c + ", swipeEdge=" + this.f20878d + ", frameTimeMillis=" + this.f20879e + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        k71.k.g(backEvent, "backEvent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(c7.b bVar) {
        this(bVar.f4128c, bVar.f4129d, bVar.f4127b, bVar.f4126a, bVar.f4130e);
        k71.k.g(bVar, "navigationEvent");
    }
    public Object c = null;
}
