package t3;

import java.util.Arrays;
import k71.k;
import w50.m;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f32057a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f32058b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f32057a = fArr;
        this.f32058b = fArr2;
    }

    @Override // t3.a
    public final float a(float f6) {
        return m.a(f6, this.f32058b, this.f32057a);
    }

    @Override // t3.a
    public final float b(float f6) {
        return m.a(f6, this.f32057a, this.f32058b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f32057a, cVar.f32057a) && Arrays.equals(this.f32058b, cVar.f32058b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f32058b) + (Arrays.hashCode(this.f32057a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f32057a);
        k.f(arrays, "toString(...)");
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f32058b);
        k.f(arrays2, "toString(...)");
        sb2.append(arrays2);
        sb2.append('}');
        return sb2.toString();
    }
}
