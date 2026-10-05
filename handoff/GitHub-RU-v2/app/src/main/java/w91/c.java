package w91;

import k71.l;
import t71.n;
import w61.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends l implements j71.c {
    public static final c s = new c(1);

    public final Object k(Object obj) {
        k kVar = (k) obj;
        k71.k.g(kVar, "it");
        StringBuilder sb = new StringBuilder("(");
        String pattern = ((n) kVar.r).r.pattern();
        k71.k.f(pattern, "pattern(...)");
        sb.append(pattern);
        sb.append(')');
        return sb.toString();
    }
}
