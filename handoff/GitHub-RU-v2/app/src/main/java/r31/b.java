package r31;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes4.dex */
public class b extends q4.b {
    public final /* synthetic */ d5 h;
    public final /* synthetic */ d i;

    public b(d dVar, d5 d5Var) {
        this.i = dVar;
        this.h = d5Var;
    }

    public final void i(int i) {
        this.i.n = true;
        this.h.S(i);
    }

    public final void j(Typeface typeface) {
        d dVar = this.i;
        dVar.p = Typeface.create(typeface, dVar.d);
        dVar.n = true;
        this.h.T(dVar.p, false);
    }
}
