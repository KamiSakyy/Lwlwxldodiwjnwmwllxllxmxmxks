package fa1;

import java.util.concurrent.CompletableFuture;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k extends CompletableFuture {
    public z r;

    public k(z zVar) {
        this.r = zVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.r.cancel();
        }
        return super.cancel(z);
    }
}
