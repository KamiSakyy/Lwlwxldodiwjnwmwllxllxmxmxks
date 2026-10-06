package a5;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f450a;

    public o(DisplayCutout displayCutout) {
        this.f450a = displayCutout;
    }

    public final r4.b a() {
        return Build.VERSION.SDK_INT >= 30 ? r4.b.d(m.c(this.f450a)) : r4.b.f31147e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f450a, ((o) obj).f450a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f450a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f450a + "}";
    }
}
