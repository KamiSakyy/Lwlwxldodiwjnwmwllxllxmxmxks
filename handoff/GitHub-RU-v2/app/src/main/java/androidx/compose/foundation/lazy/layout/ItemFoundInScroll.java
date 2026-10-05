package androidx.compose.foundation.lazy.layout;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
final class ItemFoundInScroll extends CancellationException {

    /* renamed from: r, reason: collision with root package name */
    public final int f1310r;

    /* renamed from: s, reason: collision with root package name */
    public final a0.p f1311s;

    public ItemFoundInScroll(int i, a0.p pVar) {
        this.f1310r = i;
        this.f1311s = pVar;
    }
}
