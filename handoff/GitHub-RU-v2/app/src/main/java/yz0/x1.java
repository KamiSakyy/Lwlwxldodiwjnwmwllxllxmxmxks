package yz0;

import com.github.service.models.response.InteractionType;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x1 {
    public static InteractionType a(String str) {
        InteractionType interactionType;
        k71.k.g(str, "rawValue");
        InteractionType[] values = InteractionType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                interactionType = null;
                break;
            }
            interactionType = values[i];
            if (k71.k.b(interactionType.getRawValue(), str)) {
                break;
            }
            i++;
        }
        return interactionType == null ? InteractionType.UNKNOWN__ : interactionType;
    }
}
