package r31;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.d5;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends d5 {
    public Typeface a;
    public o31.c b;
    public boolean c;

    public a(o31.c cVar, Typeface typeface) {
        this.a = typeface;
        this.b = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void S(int i) {
        if (this.c) {
            return;
        }
        this.b.a(this.a);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void T(Typeface typeface, boolean z) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }
    public static final Object b = null;
}
