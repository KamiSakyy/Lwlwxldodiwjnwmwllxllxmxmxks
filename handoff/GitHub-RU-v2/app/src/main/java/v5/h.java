package v5;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import sy.c0;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends c0 implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public WeakReference f32732r;

    public h(EditText editText) {
        this.f32732r = new WeakReference(editText);
    }

    public final void m() {
        Handler handler;
        EditText editText = (EditText) this.f32732r.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a((EditText) this.f32732r.get(), 1);
    }
}
