package x6;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: /home/user/work/p/classes.dex */
public final class i0 extends l0 {

    /* renamed from: r, reason: collision with root package name */
    public Class f33838r;

    public i0(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f33838r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // x6.l0
    public final Object a(String str, Bundle bundle) {
        k71.k.g(bundle, "bundle");
        k71.k.g(str, "key");
        return bundle.get(str);
    }

    @Override // x6.l0
    public final String b() {
        return this.f33838r.getName();
    }

    @Override // x6.l0
    public final Object d(String str) {
        k71.k.g(str, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // x6.l0
    public final void e(Bundle bundle, String str, Object obj) {
        k71.k.g(str, "key");
        this.f33838r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !i0.class.equals(obj.getClass())) {
            return false;
        }
        return k71.k.b(this.f33838r, ((i0) obj).f33838r);
    }

    public final int hashCode() {
        return this.f33838r.hashCode();
    }
}
