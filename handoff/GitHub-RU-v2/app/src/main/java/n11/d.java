package n11;

import android.content.Context;
import l51.h;
import z70.j3;
import z70.m3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements o11.b {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // v61.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new h((Context) ((d) this.b).b, new m3(8), new j3(8), 3);
            default:
                return this.b;
        }
    }
}
