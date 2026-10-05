package com.github.rudroid.explore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: r, reason: collision with root package name */
    public static final f f12201r;

    /* renamed from: s, reason: collision with root package name */
    public static final f f12202s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ f[] f12203t;

    static {
        f fVar = new f("FOR_YOU", 0);
        f12201r = fVar;
        f fVar2 = new f("TRENDING", 1);
        f12202s = fVar2;
        f[] fVarArr = {fVar, fVar2};
        f12203t = fVarArr;
        v8.l0.t(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f12203t.clone();
    }
}
