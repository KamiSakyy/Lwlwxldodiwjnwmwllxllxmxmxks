package h0;

import java.util.Arrays;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public List f25225a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f25226b;

    /* renamed from: c, reason: collision with root package name */
    public int f25227c;

    public x(List list, float[] fArr) {
        this.f25225a = list;
        this.f25226b = fArr;
        if (list.size() != fArr.length) {
            k0.b.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + x61.l.d0(fArr));
        }
        this.f25227c = fArr.length;
    }

    public final Object a(float f6) {
        float[] fArr = this.f25226b;
        int length = fArr.length;
        float f10 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i10 = -1;
        int i11 = 0;
        while (i < length) {
            int i12 = i11 + 1;
            float abs = Math.abs(f6 - fArr[i]);
            if (abs <= f10) {
                i10 = i11;
                f10 = abs;
            }
            i++;
            i11 = i12;
        }
        if (i10 == -1) {
            return null;
        }
        return this.f25225a.get(i10);
    }

    public final Object b(float f6, boolean z10) {
        float[] fArr = this.f25226b;
        int length = fArr.length;
        int i = 0;
        int i10 = -1;
        float f10 = Float.POSITIVE_INFINITY;
        int i11 = 0;
        while (i < length) {
            float f11 = fArr[i];
            int i12 = i11 + 1;
            float f12 = z10 ? f11 - f6 : f6 - f11;
            if (f12 < 0.0f) {
                f12 = Float.POSITIVE_INFINITY;
            }
            if (f12 <= f10) {
                i10 = i11;
                f10 = f12;
            }
            i++;
            i11 = i12;
        }
        if (i10 == -1) {
            return null;
        }
        return this.f25225a.get(i10);
    }

    public final float c(Object obj) {
        int indexOf = this.f25225a.indexOf(obj);
        if (indexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.f25226b;
        if (indexOf < fArr.length) {
            return fArr[indexOf];
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.f25225a, xVar.f25225a) && Arrays.equals(this.f25226b, xVar.f25226b) && this.f25227c == xVar.f25227c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f25226b) + (this.f25225a.hashCode() * 31)) * 31) + this.f25227c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        float f6;
        StringBuilder sb2 = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i10 = this.f25227c;
            if (i >= i10) {
                sb2.append("})");
                String sb3 = sb2.toString();
                k71.k.f(sb3, "toString(...)");
                return sb3;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(x61.m.X(i, this.f25225a));
            sb4.append('=');
            if (i >= 0) {
                float[] fArr = this.f25226b;
                if (i < fArr.length) {
                    f6 = fArr[i];
                    sb4.append(f6);
                    sb2.append(sb4.toString());
                    if (i >= i10 - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
            }
            f6 = Float.NaN;
            sb4.append(f6);
            sb2.append(sb4.toString());
            if (i >= i10 - 1) {
            }
            i++;
        }
    }
}
