package a5;

import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes.dex */
public final class q2 extends d5 {

    /* renamed from: a, reason: collision with root package name */
    public Window f475a;

    public q2(Window window, y51.c cVar) {
        this.f475a = window;
    }

    public final boolean P() {
        return (this.f475a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    public final void V(boolean z10) {
        if (!z10) {
            m0(16);
            return;
        }
        Window window = this.f475a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    public final void W(boolean z10) {
        if (!z10) {
            m0(8192);
            return;
        }
        Window window = this.f475a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void m0(int i) {
        View decorView = this.f475a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
