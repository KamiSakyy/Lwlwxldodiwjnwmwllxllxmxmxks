package k81;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a0 extends f1 {
    public float[] a;
    public int b;

    @Override // k81.f1
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.a, this.b);
        k71.k.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // k81.f1
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i);
            k71.k.f(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // k81.f1
    public final int d() {
        return this.b;
    }
}
