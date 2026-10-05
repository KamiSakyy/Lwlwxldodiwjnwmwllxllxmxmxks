package k81;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes5.dex */
public final class j0 extends f1 {
    public int[] a;
    public int b;

    @Override // k81.f1
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.a, this.b);
        k71.k.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // k81.f1
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i);
            k71.k.f(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // k81.f1
    public final int d() {
        return this.b;
    }
}
