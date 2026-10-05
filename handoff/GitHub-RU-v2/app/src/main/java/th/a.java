package th;

import a71.h;
import a71.i;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.common.e;
import com.github.rudroid.common.logging.LogTag;
import k71.k;
import rb.b;
import t00.ua;
import v71.a0;
import v71.q1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static q1 a(k1 k1Var, h hVar, e eVar, j71.e eVar2, int i) {
        if ((i & 1) != 0) {
            hVar = i.r;
        }
        h hVar2 = hVar;
        a0 a0Var = a0.r;
        ua uaVar = new ua(2);
        k.g(k1Var, "<this>");
        LogTag declaredAnnotation = k1Var.getClass().getDeclaredAnnotation(LogTag.class);
        String tag = declaredAnnotation != null ? declaredAnnotation.tag() : null;
        if (tag == null) {
            tag = k1Var.getClass().getSimpleName();
        }
        k.g(k1Var, "<this>");
        k.g(hVar2, "context");
        k.g(eVar, "crashLogger");
        return b.a(d1.k(k1Var), hVar2, a0Var, eVar, uaVar, tag, eVar2);
    }
}
