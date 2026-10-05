package k81;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g0 extends e1 {
    public final boolean l;

    public g0(String str, h0 h0Var) {
        super(str, h0Var, 1);
        this.l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, w61.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, w61.h] */
    @Override // k81.e1
    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.a())) {
                g0 g0Var = (g0) obj;
                if (g0Var.l && Arrays.equals((SerialDescriptor[]) this.j.getValue(), (SerialDescriptor[]) g0Var.j.getValue())) {
                    int f = serialDescriptor.f();
                    int i2 = this.c;
                    if (i2 == f) {
                        for (0; i < i2; i + 1) {
                            i = (k71.k.b(j(i).a(), serialDescriptor.j(i).a()) && k71.k.b(j(i).e(), serialDescriptor.j(i).e())) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // k81.e1, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return this.l;
    }

    @Override // k81.e1
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
