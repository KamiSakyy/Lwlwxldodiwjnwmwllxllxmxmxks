package r01;

import com.github.service.models.response.type.MinimizedStateReason;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public static MinimizedStateReason a(String str) {
        Object obj;
        Iterator<E> it = MinimizedStateReason.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (t71.w.y(((MinimizedStateReason) obj).getRawValue(), str, true)) {
                break;
            }
        }
        MinimizedStateReason minimizedStateReason = (MinimizedStateReason) obj;
        return minimizedStateReason == null ? MinimizedStateReason.UNKNOWN : minimizedStateReason;
    }







}
