package m41;

import android.os.Bundle;
import c21.uShadow;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.k1;
import com.google.common.collect.h;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import l7.x1;
import z70.w;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements a {
    public static volatile b c;
    public s21.a a;
    public ConcurrentHashMap b;

    public b(s21.a aVar) {
        uShadow.g(aVar);
        this.a = aVar;
        this.b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (n41.a.c.contains(str) || n41.a.b.contains(str2)) {
            return;
        }
        h hVar = n41.a.d;
        int i = hVar.u;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            boolean containsKey = bundle.containsKey((String) hVar.get(i3));
            i3++;
            if (containsKey) {
                return;
            }
        }
        if ("_cmp".equals(str2)) {
            if (n41.a.c.contains(str)) {
                return;
            }
            h hVar2 = n41.a.d;
            int i4 = hVar2.u;
            while (i2 < i4) {
                boolean containsKey2 = bundle.containsKey((String) hVar2.get(i2));
                i2++;
                if (containsKey2) {
                    return;
                }
            }
            int hashCode = str.hashCode();
            if (hashCode != 101200) {
                if (hashCode != 101230) {
                    if (hashCode != 3142703 || !str.equals("fiam")) {
                        return;
                    } else {
                        bundle.putString("_cis", "fiam_integration");
                    }
                } else if (!str.equals("fdl")) {
                    return;
                } else {
                    bundle.putString("_cis", "fdl_integration");
                }
            } else if (!str.equals("fcm")) {
                return;
            } else {
                bundle.putString("_cis", "fcm_integration");
            }
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        k1 k1Var = (k1) this.a.s;
        k1Var.a(new e1(k1Var, str, str2, bundle, true));
    }

    public final w b(String str, x1 x1Var) {
        x1 aVar;
        if (!n41.a.c.contains(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = "fiam".equals(str);
                s21.a aVar2 = this.a;
                if (equals) {
                    aVar = new x1();
                    aVar.s = x1Var;
                    aVar2.t(new n41.b(0, aVar));
                    aVar.r = new HashSet();
                } else {
                    aVar = "clx".equals(str) ? new kk.a(aVar2, x1Var) : null;
                }
                if (aVar != null) {
                    concurrentHashMap.put(str, aVar);
                    return new w(7);
                }
            }
        }
        return null;
    }
}
