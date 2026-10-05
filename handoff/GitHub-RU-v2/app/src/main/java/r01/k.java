package r01;

import com.github.service.models.response.type.MobileEventContext;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public static MobileEventContext a(String str) {
        Object obj;
        k71.k.g(str, "rawValue");
        Iterator<E> it = MobileEventContext.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (k71.k.b(((MobileEventContext) obj).getRawValue(), str)) {
                break;
            }
        }
        MobileEventContext mobileEventContext = (MobileEventContext) obj;
        return mobileEventContext == null ? MobileEventContext.UNKNOWN__ : mobileEventContext;
    }
}
