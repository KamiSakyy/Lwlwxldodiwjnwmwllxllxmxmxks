package m11;

import android.content.Context;
import z70.j3;
import z70.m3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements o11.b {
    public final /* synthetic */ int a;
    public final v61.a b;
    public final v61.a c;
    public final o11.b d;

    public /* synthetic */ t(v61.a aVar, v61.a aVar2, o11.b bVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = aVar2;
        this.d = bVar;
    }

    @Override // v61.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new s(new m3(8), new j3(8), (r11.e) ((r11.d) this.b).get(), (d51.d) ((s11.g) this.c).get(), (w51.r) ((s11.h) this.d).get());
            default:
                return new l51.h((Context) this.b.get(), (t11.d) this.c.get(), (s11.b) ((o) this.d).get(), 15);
        }
    }
}
