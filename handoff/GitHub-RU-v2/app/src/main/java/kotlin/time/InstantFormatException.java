package kotlin.time;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
final class InstantFormatException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantFormatException(String str) {
        super(str);
        k.g(str, "message");
    }
}
