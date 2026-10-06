package fa1;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a0 extends x0Shadow {
    public final /* synthetic */ int d;
    public final /* synthetic */ x0Shadow e;

    public /* synthetic */ a0(x0Shadow x0Var, int i) {
        this.d = i;
        this.e = x0Var;
    }

    @Override // fa1.x0Shadow
    public final void a(n0 n0Var, Object obj) {
        switch (this.d) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.e.a(n0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.e.a(n0Var, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
