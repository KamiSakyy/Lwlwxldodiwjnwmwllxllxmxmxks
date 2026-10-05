package i91;

import java.util.logging.Logger;
import t71.p;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class l {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? p.I(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
