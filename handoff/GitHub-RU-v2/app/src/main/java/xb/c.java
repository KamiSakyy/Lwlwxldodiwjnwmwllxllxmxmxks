package xb;

import java.util.List;
import k71.k;
import t71.p;
import x61.m;
import x61.r;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {
    public static boolean a(String str) {
        List r02 = str != null ? m.r0(p.g0(str, new String[]{"."}, 6)) : null;
        if (r02 == null) {
            r02 = r.r;
        }
        return r02.size() > 3 && k.b(r02.get(0), "com") && k.b(r02.get(1), "github") && k.b(r02.get(2), "review-lab");
    }
}
