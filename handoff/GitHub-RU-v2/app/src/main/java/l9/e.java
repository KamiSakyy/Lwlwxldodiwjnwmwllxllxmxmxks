package l9;

import android.graphics.drawable.Drawable;

/* loaded from: /home/user/work/p/classes.dex */
public class e extends f {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f28394a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28395b;

    /* renamed from: c, reason: collision with root package name */
    public i9.f f28396c;

    public e(Drawable drawable, boolean z10, i9.f fVar) {
        this.f28394a = drawable;
        this.f28395b = z10;
        this.f28396c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.f28394a, eVar.f28394a) && this.f28395b == eVar.f28395b && this.f28396c == eVar.f28396c;
    }

    public final int hashCode() {
        return this.f28396c.hashCode() + x.i.e(this.f28394a.hashCode() * 31, 31, this.f28395b);
    }
}
