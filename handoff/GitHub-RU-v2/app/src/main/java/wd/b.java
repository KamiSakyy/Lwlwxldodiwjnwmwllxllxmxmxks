package wd;

import com.github.rudroid.viewmodels.issuesorpullrequests.d6;
import java.util.Iterator;
import yz0.g2;
import yz0.i2;

/* loaded from: /home/user/work/p/classes.dex */
public class b {
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    public static final boolean a(i2 i2Var, d6 d6Var) {
        k71.k.g(i2Var, "<this>");
        k71.k.g(d6Var, "configuration");
        if (d6Var.i || !i2Var.a0 || !i2Var.E || !i2Var.g) {
            return false;
        }
        Object r12 = i2Var.Z;
        if (r12.isEmpty()) {
            return false;
        }
        Iterator it = r12.iterator();
        while (it.hasNext()) {
            if (((g2) it.next()).e.u) {
                return true;
            }
        }
        return false;
    }
}
