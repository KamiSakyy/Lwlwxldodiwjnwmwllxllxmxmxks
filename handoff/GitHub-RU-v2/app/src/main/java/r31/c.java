package r31;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends d5 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ d5 c;
    public final /* synthetic */ d d;

    public c(d dVar, Context context, TextPaint textPaint, d5 d5Var) {
        this.d = dVar;
        this.a = context;
        this.b = textPaint;
        this.c = d5Var;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void S(int i) {
        this.c.S(i);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void T(Typeface typeface, boolean z) {
        this.d.f(this.a, this.b, typeface);
        this.c.T(typeface, z);
    }
}
