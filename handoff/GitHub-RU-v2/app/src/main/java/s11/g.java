package s11;

import android.content.Context;
import java.util.concurrent.Executor;
import m11.t;
import z70.j3;
import z70.m3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements o11.b {
    public v61.a a;
    public v61.a b;
    public v61.a c;
    public t d;
    public v61.a e;
    public v61.a f;
    public v61.a g;

    public g(v61.a aVar, v61.a aVar2, v61.a aVar3, t tVar, v61.a aVar4, v61.a aVar5, v61.a aVar6) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = tVar;
        this.e = aVar4;
        this.f = aVar5;
        this.g = aVar6;
    }

    @Override // v61.a
    public final Object get() {
        Context context = (Context) this.a.get();
        n11.e eVar = (n11.e) this.b.get();
        t11.d dVar = (t11.d) this.c.get();
        l51.h hVar = (l51.h) this.d.get();
        Executor executor = (Executor) this.e.get();
        u11.b bVar = (u11.b) this.f.get();
        m3 m3Var = new m3(8);
        j3 j3Var = new j3(8);
        t11.c cVar = (t11.c) this.g.get();
        d51.d dVar2 = new d51.d();
        dVar2.a = context;
        dVar2.b = eVar;
        dVar2.c = dVar;
        dVar2.d = hVar;
        dVar2.e = executor;
        dVar2.f = bVar;
        dVar2.g = m3Var;
        dVar2.h = j3Var;
        dVar2.i = cVar;
        return dVar2;
    }
}
