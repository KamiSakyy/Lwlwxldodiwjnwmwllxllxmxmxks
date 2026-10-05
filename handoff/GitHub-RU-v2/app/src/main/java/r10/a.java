package r10;

import a5.g1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static b a(String str) {
        Object obj;
        k.g(str, "serviceFlagName");
        d71.b bVar = b.v;
        bVar.getClass();
        g1 g1Var = new g1(8, bVar);
        while (true) {
            if (!g1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = g1Var.next();
            if (((b) obj).r.equals(str)) {
                break;
            }
        }
        return (b) obj;
    }
}
