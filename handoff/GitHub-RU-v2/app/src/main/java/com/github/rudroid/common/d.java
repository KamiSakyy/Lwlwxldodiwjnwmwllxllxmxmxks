package com.github.rudroid.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: r, reason: collision with root package name */
    public static final d f9251r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f9252s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ d[] f9253t;

    static {
        d dVar = new d("MISSION_CONTROL", 0);
        f9251r = dVar;
        d dVar2 = new d("REPO_PROFILE", 1);
        f9252s = dVar2;
        d[] dVarArr = {dVar, dVar2};
        f9253t = dVarArr;
        v8.l0.t(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f9253t.clone();
    }
}
