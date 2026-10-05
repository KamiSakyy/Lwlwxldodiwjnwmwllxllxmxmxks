package fa1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d extends b {
    @Override // fa1.b
    public final List a(Executor executor) {
        return Arrays.asList(new l(), new p(executor));
    }

    @Override // fa1.b
    public final List b() {
        return Collections.singletonList(new c(1));
    }
}
