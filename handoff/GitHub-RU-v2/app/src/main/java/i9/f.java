package i9;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: r, reason: collision with root package name */
    public static final f f26096r;

    /* renamed from: s, reason: collision with root package name */
    public static final f f26097s;

    /* renamed from: t, reason: collision with root package name */
    public static final f f26098t;

    /* renamed from: u, reason: collision with root package name */
    public static final f f26099u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ f[] f26100v;

    static {
        f fVar = new f("MEMORY_CACHE", 0);
        f26096r = fVar;
        f fVar2 = new f("MEMORY", 1);
        f26097s = fVar2;
        f fVar3 = new f("DISK", 2);
        f26098t = fVar3;
        f fVar4 = new f("NETWORK", 3);
        f26099u = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f26100v = fVarArr;
        l0.t(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f26100v.clone();
    }
}
