package nj;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0Shadow {
    private static final p0 Companion = new p0();
    public static final q0 d = new q0(1, 1000);
    public final w a;
    public final z b;
    public final ConcurrentHashMap c;

    public s0(w wVar, z zVar) {
        k71.k.g(wVar, "fetchTaskEventsPagedUseCase");
        k71.k.g(zVar, "forUserSessionEventsStoreFactory");
        this.a = wVar;
        this.b = zVar;
        this.c = new ConcurrentHashMap();
    }
}
