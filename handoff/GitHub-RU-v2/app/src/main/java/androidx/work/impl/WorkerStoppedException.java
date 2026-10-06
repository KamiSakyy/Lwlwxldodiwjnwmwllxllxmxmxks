package androidx.work.impl;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public final class WorkerStoppedException extends CancellationException {

    /* renamed from: r, reason: collision with root package name */
    public int f3229r;

    public WorkerStoppedException(int i) {
        this.f3229r = i;
    }
}
