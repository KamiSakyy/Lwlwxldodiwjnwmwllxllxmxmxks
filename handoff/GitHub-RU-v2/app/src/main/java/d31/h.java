package d31;

import android.view.View;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h extends d {
    public final /* synthetic */ j a;

    public h(j jVar) {
        this.a = jVar;
    }

    @Override // d31.d
    public final void b(View view) {
    }

    @Override // d31.d
    public final void c(View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }
}
