package a61;

import java.util.Locale;
import java.util.UUID;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 {
    public g1 a;
    public h1 b;
    public String c;
    public int d;
    public q0 e;

    public y0(g1 g1Var, h1 h1Var) {
        k71.k.g(g1Var, "timeProvider");
        k71.k.g(h1Var, "uuidGenerator");
        this.a = g1Var;
        this.b = h1Var;
        this.c = a();
        this.d = -1;
    }

    public final String a() {
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        k71.k.f(randomUUID, "randomUUID()");
        String uuid = randomUUID.toString();
        k71.k.f(uuid, "uuidGenerator.next().toString()");
        String lowerCase = t71.w.C(uuid, "-", "").toLowerCase(Locale.ROOT);
        k71.k.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
