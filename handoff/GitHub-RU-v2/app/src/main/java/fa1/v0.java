package fa1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes5.dex */
public final class v0 implements ParameterizedType {
    public Type r;
    public Type s;
    public Type[] t;

    public v0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            x0.d(type3);
        }
        this.r = type;
        this.s = type2;
        this.t = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && x0.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.t.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.r;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.s;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.t) ^ this.s.hashCode();
        Type type = this.r;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.t;
        int length = typeArr.length;
        Type type = this.s;
        if (length == 0) {
            return x0.s(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(x0.s(type));
        sb.append("<");
        sb.append(x0.s(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(x0.s(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
