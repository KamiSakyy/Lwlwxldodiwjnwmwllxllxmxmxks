package oh;

import androidx.compose.runtime.s;
import com.github.rudroid.viewmodels.za;
import java.util.List;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements j71.g {
    public final /* synthetic */ List r;
    public final /* synthetic */ j71.c s;

    public g(List list, j71.c cVar) {
        this.r = list;
        this.s = cVar;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        m0.b bVar = (m0.b) obj;
        int intValue = ((Number) obj2).intValue();
        s sVar = (s) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (sVar.f(bVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= sVar.d(intValue) ? 32 : 16;
        }
        if (sVar.S(i & 1, (i & 147) != 146)) {
            za.b bVar2 = (za.b) this.r.get(intValue);
            sVar.c0(73526304);
            b.a(null, this.s, bVar2, sVar, 0, 1);
            sVar.q(false);
        } else {
            sVar.V();
        }
        return a0.a;
    }
    public static final Object b = null;
    public static final Object d = null;
    public static final Object f = null;
    public static final Object h = null;
}
