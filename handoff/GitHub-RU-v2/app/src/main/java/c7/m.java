package c7;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class m extends f {

    /* renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f4154c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4155d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f4156e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4157f;

    public m(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f4154c = onBackInvokedDispatcher;
        this.f4155d = i;
        this.f4156e = Build.VERSION.SDK_INT == 33 ? new k(0, this) : new l(this);
    }

    @Override // c7.f
    public final void b(boolean z10) {
        if (z10 && !this.f4157f) {
            this.f4154c.registerOnBackInvokedCallback(this.f4155d, this.f4156e);
            this.f4157f = true;
        } else {
            if (z10 || !this.f4157f) {
                return;
            }
            this.f4154c.unregisterOnBackInvokedCallback(this.f4156e);
            this.f4157f = false;
        }
    }
}
