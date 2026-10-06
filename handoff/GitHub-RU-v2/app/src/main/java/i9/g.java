package i9;

import android.graphics.drawable.Drawable;

/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f26101a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26102b;

    public g(Drawable drawable, boolean z10) {
        this.f26101a = drawable;
        this.f26102b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.f26101a, gVar.f26101a) && this.f26102b == gVar.f26102b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26102b) + (this.f26101a.hashCode() * 31);
    }
}
