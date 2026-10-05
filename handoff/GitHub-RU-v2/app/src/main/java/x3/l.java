package x3;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class l implements Executor {

    /* renamed from: r, reason: collision with root package name */
    public static final l f33748r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ l[] f33749s;

    static {
        l lVar = new l("INSTANCE", 0);
        f33748r = lVar;
        f33749s = new l[]{lVar};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f33749s.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
