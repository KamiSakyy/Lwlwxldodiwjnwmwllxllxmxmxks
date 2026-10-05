package p31;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements OnBackAnimationCallback {
    public final /* synthetic */ b a;
    public final /* synthetic */ e b;

    public d(e eVar, b bVar) {
        this.b = eVar;
        this.a = bVar;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.d();
        }
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.b();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.a(new d.a(backEvent));
        }
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.c(new d.a(backEvent));
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a<T1,T2,T3,T4> {
        public a() {
        }
    }
}
