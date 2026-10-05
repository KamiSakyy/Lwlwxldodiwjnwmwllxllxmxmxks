package com.github.rudroid.uitoolkit.text;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public static n a(i2.b bVar, w1.r rVar, int i) {
        int i2 = i & 4;
        w1.r rVar2 = w1.o.a;
        if (i2 != 0) {
            rVar = rVar2;
        }
        k71.k.g(rVar, "startModifier");
        return new n(bVar, rVar, rVar2);
    }

    public static o b(Integer num, Integer num2, w1.r rVar, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        int i2 = i & 4;
        w1.r rVar2 = w1.o.a;
        if (i2 != 0) {
            rVar = rVar2;
        }
        k71.k.g(rVar, "startModifier");
        return new o(num, num2, rVar, rVar2);
    }
}
