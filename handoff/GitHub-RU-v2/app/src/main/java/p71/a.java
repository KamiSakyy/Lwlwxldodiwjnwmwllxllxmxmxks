package p71;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends o71.a {
    @Override // o71.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        k.f(current, "current(...)");
        return current;
    }
}
