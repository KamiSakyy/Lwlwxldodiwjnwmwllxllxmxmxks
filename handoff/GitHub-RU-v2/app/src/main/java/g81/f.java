package g81;

import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final /* synthetic */ class f implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;

    public /* synthetic */ f(int i, List list) {
        this.r = i;
        this.s = list;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                return ((r71.f) this.s.get(0)).c();
            case 1:
                return ((r71.f) this.s.get(0)).c();
            case 2:
                Object obj = this.s.get(2);
                k.e(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            default:
                return this.s;
        }
    }
}
