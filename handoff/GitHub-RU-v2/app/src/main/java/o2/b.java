package o2;

import android.view.KeyEvent;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public KeyEvent f29963a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return k.b(this.f29963a, ((b) obj).f29963a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29963a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f29963a + ')';
    }
}
