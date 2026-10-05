package vc;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: r, reason: collision with root package name */
    public static final c f32881r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f32882s;

    /* renamed from: t, reason: collision with root package name */
    public static final c f32883t;

    /* renamed from: u, reason: collision with root package name */
    public static final c f32884u;

    /* renamed from: v, reason: collision with root package name */
    public static final c f32885v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ c[] f32886w;

    static {
        c cVar = new c("AGENTS", 0);
        f32881r = cVar;
        c cVar2 = new c("MY_WORK", 1);
        f32882s = cVar2;
        c cVar3 = new c("FAVORITES", 2);
        f32883t = cVar3;
        c cVar4 = new c("SHORTCUTS", 3);
        f32884u = cVar4;
        c cVar5 = new c("RECENT", 4);
        f32885v = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f32886w = cVarArr;
        l0.t(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f32886w.clone();
    }
}
