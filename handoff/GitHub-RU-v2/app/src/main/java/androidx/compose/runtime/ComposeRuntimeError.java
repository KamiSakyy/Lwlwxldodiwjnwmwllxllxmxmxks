package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {

    /* renamed from: r, reason: collision with root package name */
    public final String f1547r;

    public ComposeRuntimeError(String str) {
        this.f1547r = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f1547r;
    }
}
