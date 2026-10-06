package v8;

import android.net.Uri;

/* loaded from: /home/user/work/p/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public Uri f32765a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32766b;

    public e(boolean z10, Uri uri) {
        this.f32765a = uri;
        this.f32766b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k71.k.e(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        e eVar = (e) obj;
        return k71.k.b(this.f32765a, eVar.f32765a) && this.f32766b == eVar.f32766b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32766b) + (this.f32765a.hashCode() * 31);
    }
}
