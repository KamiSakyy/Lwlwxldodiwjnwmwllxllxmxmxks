package k81;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes5.dex */
public final class s1 extends f1 {
    public byte[] a;
    public int b;

    @Override // k81.f1
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.a, this.b);
        k71.k.f(copyOf, "copyOf(...)");
        return new w61.s(copyOf);
    }

    @Override // k81.f1
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i);
            k71.k.f(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // k81.f1
    public final int d() {
        return this.b;
    }
}
