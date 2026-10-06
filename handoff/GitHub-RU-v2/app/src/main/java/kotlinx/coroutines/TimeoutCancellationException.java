package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import v71.d1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class TimeoutCancellationException extends CancellationException {
    public transient d1 r;

    public TimeoutCancellationException(String str, d1 d1Var) {
        super(str);
        this.r = d1Var;
    }
}
