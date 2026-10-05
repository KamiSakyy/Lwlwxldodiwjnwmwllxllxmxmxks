package androidx.sqlite.db.framework;

/* loaded from: /home/user/work/p/classes.dex */
final class FrameworkSQLiteOpenHelper$OpenHelper$CallbackException extends RuntimeException {

    /* renamed from: r, reason: collision with root package name */
    public final d f3098r;

    /* renamed from: s, reason: collision with root package name */
    public final Throwable f3099s;

    public FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(d dVar, Throwable th) {
        super(th);
        this.f3098r = dVar;
        this.f3099s = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3099s;
    }
}
