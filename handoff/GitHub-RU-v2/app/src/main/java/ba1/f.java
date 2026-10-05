package ba1;

import ca1.o;
import java.util.HashMap;
import java.util.function.Function;

/* loaded from: /home/user/work/p/classes5.dex */
public final /* synthetic */ class f implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                g gVar = (g) obj;
                String k = h.k(gVar.a);
                gVar.a = null;
                return k;
            case 1:
                return new HashMap();
            default:
                return ((o) obj).v();
        }
    }
}
