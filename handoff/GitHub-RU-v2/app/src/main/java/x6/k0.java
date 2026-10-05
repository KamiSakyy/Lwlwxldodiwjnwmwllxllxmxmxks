package x6;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: /home/user/work/p/classes.dex */
public class k0 extends l0 {

    /* renamed from: r, reason: collision with root package name */
    public final Class f33854r;

    public k0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f33854r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // x6.l0
    public final Object a(String str, Bundle bundle) {
        k71.k.g(bundle, "bundle");
        k71.k.g(str, "key");
        return (Serializable) bundle.get(str);
    }

    @Override // x6.l0
    public String b() {
        return this.f33854r.getName();
    }

    @Override // x6.l0
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        k71.k.g(str, "key");
        k71.k.g(serializable, "value");
        this.f33854r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        return k71.k.b(this.f33854r, ((k0) obj).f33854r);
    }

    @Override // x6.l0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        k71.k.g(str, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f33854r.hashCode();
    }

    public k0(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f33854r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
