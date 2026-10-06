package k81;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes5.dex */
public final class p0 extends f1Shadow {
    public long[] a;
    public int b;

    @Override // k81.f1Shadow
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.a, this.b);
        k71.k.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // k81.f1Shadow
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i);
            k71.k.f(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // k81.f1Shadow
    public final int d() {
        return this.b;
    }
}
