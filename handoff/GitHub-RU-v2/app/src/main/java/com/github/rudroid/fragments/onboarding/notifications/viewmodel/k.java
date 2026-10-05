package com.github.rudroid.fragments.onboarding.notifications.viewmodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    /* renamed from: r, reason: collision with root package name */
    public static final k f14287r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f14288s;

    /* renamed from: t, reason: collision with root package name */
    public static final k f14289t;

    /* renamed from: u, reason: collision with root package name */
    public static final k f14290u;

    /* renamed from: v, reason: collision with root package name */
    public static final k f14291v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ k[] f14292w;

    static {
        k kVar = new k("ONBOARDING", 0);
        f14287r = kVar;
        k kVar2 = new k("MISSING_OUT", 1);
        f14288s = kVar2;
        k kVar3 = new k("CONTINUE_SETUP", 2);
        f14289t = kVar3;
        k kVar4 = new k("REVIEW_NOTIFICATIONS", 3);
        f14290u = kVar4;
        k kVar5 = new k("MISSED_TWO_FACTOR", 4);
        f14291v = kVar5;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5};
        f14292w = kVarArr;
        v8.l0.t(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f14292w.clone();
    }
}
