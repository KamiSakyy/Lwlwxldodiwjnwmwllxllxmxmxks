package b7;

import android.os.Bundle;
import java.io.Serializable;
import jo.f4Shadow;
import k71.k;
import t71.w;
import x6.l0;

/* loaded from: /home/user/work/p/classes.dex */
public class b extends l0 {

    /* renamed from: r, reason: collision with root package name */
    public Class f3747r;

    /* renamed from: s, reason: collision with root package name */
    public Class f3748s;

    public b(Class cls) {
        super(true);
        this.f3747r = cls;
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (cls.isEnum()) {
            this.f3748s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // x6.l0
    public final Object a(String str, Bundle bundle) {
        k.g(bundle, "bundle");
        k.g(str, "key");
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // x6.l0
    public final String b() {
        return this.f3748s.getName();
    }

    @Override // x6.l0
    public final Object d(String str) {
        k.g(str, "value");
        Object obj = null;
        if (str.equals("null")) {
            return null;
        }
        Class cls = this.f3748s;
        Object[] enumConstants = cls.getEnumConstants();
        k.d(enumConstants);
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj2 = enumConstants[i];
            Enum r62 = (Enum) obj2;
            k.d(r62);
            if (w.y(r62.name(), str, true)) {
                obj = obj2;
                break;
            }
            i++;
        }
        Enum r12 = (Enum) obj;
        if (r12 != null) {
            return r12;
        }
        StringBuilder v4 = f4Shadow.v("Enum value ", str, " not found for type ");
        v4.append(cls.getName());
        v4.append('.');
        throw new IllegalArgumentException(v4.toString());
    }

    @Override // x6.l0
    public final void e(Bundle bundle, String str, Object obj) {
        k.g(str, "key");
        bundle.putSerializable(str, (Serializable) this.f3747r.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return k.b(this.f3747r, ((b) obj).f3747r);
    }

    public final int hashCode() {
        return this.f3747r.hashCode();
    }
}
