package o3;

import android.text.style.ClickableSpan;
import android.view.View;
import g3.n;
import g3.o;

/* loaded from: /home/user/work/p/classes.dex */
public final class f extends ClickableSpan {

    /* renamed from: r, reason: collision with root package name */
    public final n f29984r;

    public f(n nVar) {
        this.f29984r = nVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        n nVar = this.f29984r;
        o a10 = nVar.a();
        if (a10 != null) {
            a10.a(nVar);
        }
    }
}
