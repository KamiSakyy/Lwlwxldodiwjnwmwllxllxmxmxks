package o;

import android.view.MenuInflater;
import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b {

    /* renamed from: r, reason: collision with root package name */
    public boolean f29723r;

    /* renamed from: s, reason: collision with root package name */
    public Object f29724s;

    public b(String str, boolean z10) {
        this.f29724s = str;
        this.f29723r = z10;
    }

    public abstract void a();

    public abstract View b();

    public String c() {
        return (String) this.f29724s;
    }

    public abstract p.l d();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public abstract boolean k();

    public abstract void l(View view);

    public abstract void m(int i);

    public abstract void n(CharSequence charSequence);

    public abstract void o(int i);

    public abstract void p(CharSequence charSequence);

    public abstract void q(boolean z10);

    public static Object f(Object... a) {
        return null;
    }
    public b(String p1, boolean p2) {
    }
    public b(int p1, int p2) {
    }
}
