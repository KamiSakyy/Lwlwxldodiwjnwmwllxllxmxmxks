package fa1;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: /home/user/work/p/classes5.dex */
public final class w0 implements WildcardType {
    public final Type r;
    public final Type s;

    public w0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            x0.d(typeArr[0]);
            this.s = null;
            this.r = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        x0.d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.s = typeArr2[0];
        this.r = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && x0.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.s;
        return type != null ? new Type[]{type} : x0.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.r};
    }

    public final int hashCode() {
        Type type = this.s;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.r.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.s;
        if (type != null) {
            return "? super " + x0.s(type);
        }
        Type type2 = this.r;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + x0.s(type2);
    }
}
