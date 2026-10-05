package k81;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t extends f1 {
    public double[] a;
    public int b;

    @Override // k81.f1
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.a, this.b);
        k71.k.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // k81.f1
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i);
            k71.k.f(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // k81.f1
    public final int d() {
        return this.b;
    }
}
