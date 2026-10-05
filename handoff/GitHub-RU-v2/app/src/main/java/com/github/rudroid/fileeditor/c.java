package com.github.rudroid.fileeditor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: r, reason: collision with root package name */
    public static final c f12901r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f12902s;

    /* renamed from: t, reason: collision with root package name */
    public static final c f12903t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ c[] f12904u;

    static {
        c cVar = new c("CREATE_NEW_BRANCH", 0);
        f12901r = cVar;
        c cVar2 = new c("COMMIT_TO_BASE_BRANCH", 1);
        f12902s = cVar2;
        c cVar3 = new c("COMMIT_TO_BASE_BRANCH_OR_CREATE_NEW_BRANCH", 2);
        f12903t = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        f12904u = cVarArr;
        v8.l0.t(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f12904u.clone();
    }
}
