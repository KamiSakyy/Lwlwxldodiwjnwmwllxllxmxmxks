package k81;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes5.dex */
public final class n extends f1 {
    public char[] a;
    public int b;

    @Override // k81.f1
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.a, this.b);
        k71.k.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // k81.f1
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i);
            k71.k.f(copyOf, "copyOf(...)");
            this.a = copyOf;
        }
    }

    @Override // k81.f1
    public final int d() {
        return this.b;
    }
}
