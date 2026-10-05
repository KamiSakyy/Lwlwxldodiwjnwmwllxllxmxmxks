package androidx.sqlite.db.framework;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: r, reason: collision with root package name */
    public static final d f3108r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f3109s;

    /* renamed from: t, reason: collision with root package name */
    public static final d f3110t;

    /* renamed from: u, reason: collision with root package name */
    public static final d f3111u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f3112v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d[] f3113w;

    static {
        d dVar = new d("ON_CONFIGURE", 0);
        f3108r = dVar;
        d dVar2 = new d("ON_CREATE", 1);
        f3109s = dVar2;
        d dVar3 = new d("ON_UPGRADE", 2);
        f3110t = dVar3;
        d dVar4 = new d("ON_DOWNGRADE", 3);
        f3111u = dVar4;
        d dVar5 = new d("ON_OPEN", 4);
        f3112v = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        f3113w = dVarArr;
        l0.t(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3113w.clone();
    }
}
