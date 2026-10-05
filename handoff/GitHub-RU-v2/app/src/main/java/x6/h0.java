package x6;

import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0 extends l0 {

    /* renamed from: r, reason: collision with root package name */
    public final Class f33834r;

    public h0(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f33834r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // x6.l0
    public final Object a(String str, Bundle bundle) {
        k71.k.g(bundle, "bundle");
        k71.k.g(str, "key");
        return (Parcelable[]) bundle.get(str);
    }

    @Override // x6.l0
    public final String b() {
        return this.f33834r.getName();
    }

    @Override // x6.l0
    public final Object d(String str) {
        k71.k.g(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // x6.l0
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        k71.k.g(str, "key");
        this.f33834r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h0.class.equals(obj.getClass())) {
            return false;
        }
        return k71.k.b(this.f33834r, ((h0) obj).f33834r);
    }

    @Override // x6.l0
    public final boolean g(Object obj, Object obj2) {
        return x61.l.u((Parcelable[]) obj, (Parcelable[]) obj2);
    }

    public final int hashCode() {
        return this.f33834r.hashCode();
    }
}
