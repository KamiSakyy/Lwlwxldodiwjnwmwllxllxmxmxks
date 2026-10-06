package a61;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 {
    public a71.h a;
    public n5.f b;
    public AtomicReference c;
    public l0 d;

    public o0(a71.h hVar, n5.f fVar) {
        k71.k.g(hVar, "backgroundDispatcher");
        k71.k.g(fVar, "dataStore");
        this.a = hVar;
        this.b = fVar;
        this.c = new AtomicReference();
        a71.c cVar = null;
        int i = 0;
        this.d = new l0(new y71.y(fVar.getData(), new i0(3, cVar, 0)), this, i);
        v71.b0.z(v71.b0.c(hVar), (a71.h) null, (v71.a0) null, new g0(this, cVar, i), 3);
    }
}
