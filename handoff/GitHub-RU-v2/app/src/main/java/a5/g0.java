package a5;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: /home/user/work/p/classes.dex */
public class g0 implements r9.e {

    /* renamed from: r, reason: collision with root package name */
    public View f405r;

    @Override // r9.e
    public void a() {
        boolean z10;
        r9.t c10 = w9.f.c(this.f405r);
        synchronized (c10) {
            z10 = this != c10.f31340s;
        }
        if (z10) {
            return;
        }
        w9.f.c(this.f405r).a();
    }

    public void b() {
        View view = this.f405r;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void c() {
        final View view;
        View view2 = this.f405r;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        final int i = 0;
        view.post(new Runnable() { // from class: a5.f0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case k5.f.J /* 0 */:
                        View view3 = view;
                        ((InputMethodManager) view3.getContext().getSystemService("input_method")).showSoftInput(view3, 0);
                        break;
                    default:
                        View view4 = view;
                        ((InputMethodManager) view4.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view4, 1);
                        break;
                }
            }
        });
    }
}
