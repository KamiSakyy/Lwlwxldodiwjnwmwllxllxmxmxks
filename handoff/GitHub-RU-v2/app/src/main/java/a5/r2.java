package a5;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes.dex */
public class r2 extends d5 {

    /* renamed from: a, reason: collision with root package name */
    public WindowInsetsController f480a;

    /* renamed from: b, reason: collision with root package name */
    public Window f481b;

    public r2(Window window, y51.c cVar) {
        this.f480a = window.getInsetsController();
        this.f481b = window;
    }

    public boolean P() {
        this.f480a.setSystemBarsAppearance(0, 0);
        return (this.f480a.getSystemBarsAppearance() & 8) != 0;
    }

    public final void V(boolean z10) {
        Window window = this.f481b;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f480a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f480a.setSystemBarsAppearance(0, 16);
    }

    public final void W(boolean z10) {
        Window window = this.f481b;
        if (z10) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f480a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f480a.setSystemBarsAppearance(0, 8);
    }
}
