package com.github.rudroid.fragments.onboarding.notifications.viewmodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: r, reason: collision with root package name */
    public static final j f14280r;

    /* renamed from: s, reason: collision with root package name */
    public static final j f14281s;

    /* renamed from: t, reason: collision with root package name */
    public static final j f14282t;

    /* renamed from: u, reason: collision with root package name */
    public static final j f14283u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ j[] f14284v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d71.b f14285w;

    static {
        j jVar = new j("TURN_ON_NOTIFICATIONS", 0);
        f14280r = jVar;
        j jVar2 = new j("SET_UP_NOTIFICATIONS", 1);
        f14281s = jVar2;
        j jVar3 = new j("SET_UP_WORKING_HOURS", 2);
        f14282t = jVar3;
        j jVar4 = new j("SET_UP_SWIPE_ACTIONS", 3);
        f14283u = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        f14284v = jVarArr;
        f14285w = v8.l0.t(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f14284v.clone();
    }
}
