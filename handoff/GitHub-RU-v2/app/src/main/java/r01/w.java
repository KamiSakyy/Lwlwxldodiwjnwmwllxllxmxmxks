package r01;

import com.github.service.models.response.type.SocialLinkService;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w {
    public static SocialLinkService a(String str) {
        Object obj;
        k71.k.g(str, "rawValue");
        Iterator<E> it = SocialLinkService.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (k71.k.b(((SocialLinkService) obj).getRawValue(), str)) {
                break;
            }
        }
        SocialLinkService socialLinkService = (SocialLinkService) obj;
        return socialLinkService == null ? SocialLinkService.UNKNOWN__ : socialLinkService;
    }
}
