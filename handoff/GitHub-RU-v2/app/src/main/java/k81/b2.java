package k81;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b2 extends f1Shadow {
    public short[] a;
    public int b;

    @Override // k81.f1Shadow
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.a, this.b);
        k71.k.f(copyOf, "copyOf(...)");
        return new w61.z(copyOf);
    }

    @Override // k81.f1Shadow
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i);
            k71.k.f(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // k81.f1Shadow
    public final int d() {
        return this.b;
    }
}
