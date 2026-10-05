package x4;

import java.util.concurrent.ThreadFactory;

/* loaded from: /home/user/work/p/classes.dex */
public final class j implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new i(runnable);
    }
}
