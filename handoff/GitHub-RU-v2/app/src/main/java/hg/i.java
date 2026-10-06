package hg;

import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.github.service.models.response.shortcuts.ShortcutType;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class i implements j71.e {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ ShortcutType s;

    public final Object s(Object obj, Object obj2) {
        s sVar = (s) obj;
        Integer num = (Integer) obj2;
        switch (this.r) {
            case 0:
                int intValue = num.intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    j.b(this.s, sVar, 0);
                } else {
                    sVar.V();
                }
                break;
            default:
                num.getClass();
                j.b(this.s, sVar, t.L(1));
                break;
        }
        return a0.a;
    }
    public Object d(Object p1, Object p2, Object p3) { return null; }
}
