package bm;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public static final r Companion = new r();
    public static final t71.n a = new t71.n("(?<=(?:[\\s+]|^))(([a-zA-Z\\-]+):(\".*?\"|[^\\s+]+))(?=(?:[\\s+]|$))[\\s+]?");

    public static s a(String str) {
        k71.k.g(str, "input");
        ArrayList arrayList = new ArrayList();
        return new s(t71.p.t0(a.f(str, new f(6, arrayList))).toString(), arrayList);
    }
}
