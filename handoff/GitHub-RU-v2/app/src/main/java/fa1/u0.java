package fa1;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u0 implements GenericArrayType {
    public Type r;

    public u0(Type type) {
        this.r = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && x0.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.r;
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String toString() {
        return x0.s(this.r) + "[]";
    }
}
