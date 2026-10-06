package x6;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: /home/user/work/p/classes.dex */
public final class j0 extends l0 {

    /* renamed from: r, reason: collision with root package name */
    public Class f33844r;

    public j0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f33844r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // x6.l0
    public final Object a(String str, Bundle bundle) {
        k71.k.g(bundle, "bundle");
        k71.k.g(str, "key");
        return (Serializable[]) bundle.get(str);
    }

    @Override // x6.l0
    public final String b() {
        return this.f33844r.getName();
    }

    @Override // x6.l0
    public final Object d(String str) {
        k71.k.g(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // x6.l0
    public final void e(Bundle bundle, String str, Object obj) {
        Object r42 = (Serializable[]) obj;
        k71.k.g(str, "key");
        this.f33844r.cast(r42);
        bundle.putSerializable(str, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j0.class.equals(obj.getClass())) {
            return false;
        }
        return k71.k.b(this.f33844r, ((j0) obj).f33844r);
    }

    @Override // x6.l0
    public final boolean g(Object obj, Object obj2) {
        return x61.l.u((Serializable[]) obj, (Serializable[]) obj2);
    }

    public final int hashCode() {
        return this.f33844r.hashCode();
    }
}
