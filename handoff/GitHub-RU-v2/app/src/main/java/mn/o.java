package mn;

import java.math.BigDecimal;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p a(List list, String str, boolean z, String str2, q qVar, String str3) {
        String str4;
        BigDecimal bigDecimal;
        k71.k.g(qVar, "type");
        if (str3 != null) {
            if (qVar == q.r) {
                if (t71.v.t(str3)) {
                    bigDecimal = new BigDecimal(str3);
                    if (bigDecimal == null) {
                        str3 = null;
                    }
                }
                bigDecimal = null;
                if (bigDecimal == null) {
                }
            }
            str4 = str3;
        } else {
            str4 = null;
        }
        return new p(list, str, z, str2, qVar, str4);
    }
}
