package xb;

import java.util.List;
import k71.k;
import t71.p;
import x61.m;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static boolean a(String str) {
        if (str != null && !c.a(str)) {
            List r02 = m.r0(p.g0(str, new String[]{"."}, 6));
            if (r02.size() > 2 && k.b(r02.get(0), "com") && k.b(r02.get(1), "ghe")) {
                return true;
            }
        }
        return false;
    }
}
