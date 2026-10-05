package s9;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements i {

    /* renamed from: r, reason: collision with root package name */
    public final Context f31767r;

    public c(Context context) {
        this.f31767r = context;
    }

    @Override // s9.i
    public final Object d(g9.f fVar) {
        DisplayMetrics displayMetrics = this.f31767r.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return k71.k.b(this.f31767r, ((c) obj).f31767r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31767r.hashCode();
    }
}
