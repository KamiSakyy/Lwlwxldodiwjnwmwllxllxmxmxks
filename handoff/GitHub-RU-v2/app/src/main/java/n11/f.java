package n11;

import android.content.Context;
import l51.h;
import t11.i;
import t11.k;
import z70.j3;
import z70.m3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements o11.b {
    public final /* synthetic */ int a;
    public final v61.a b;
    public final v61.a c;

    public /* synthetic */ f(v61.a aVar, v61.a aVar2, int i) {
        this.a = i;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // v61.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new e((Context) ((d) this.b).b, (h) ((d) this.c).get());
            default:
                return new i(new m3(8), new j3(8), t11.a.f, (k) this.b.get(), this.c);
        }
    }
}
