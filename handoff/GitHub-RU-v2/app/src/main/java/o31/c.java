package o31;

import android.graphics.Typeface;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    public final void a(Typeface typeface) {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                if (dVar.t(typeface)) {
                    dVar.l(false);
                    break;
                }
                break;
            default:
                d dVar2 = this.b;
                if (dVar2.z(typeface)) {
                    dVar2.l(false);
                    break;
                }
                break;
        }
    }
}
